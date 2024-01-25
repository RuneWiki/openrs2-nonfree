import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
	public static int anInt1920;

	@OriginalMember(owner = "client!dh", name = "H", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_45 = new Class158("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!dh", name = "L", descriptor = "F")
	public static float aFloat11 = 1.0F;

	@OriginalMember(owner = "client!dh", name = "N", descriptor = "[I")
	public static final int[] anIntArray175 = new int[1];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLclient!qs;I)Lclient!hi;")
	public static Class1_Sub20 method1398(@OriginalArg(1) Class211 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method4774(arg1);
		return local13 == null ? null : new Class1_Sub20(local13);
	}
}
