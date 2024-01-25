import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "[I")
	public static final int[] anIntArray122 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
	public static int anInt2169 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLclient!ika;)Lclient!fh;")
	public static Class115 method2002(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(14) int local14 = arg0.method2028(-14795);
		return new Class115(local14);
	}
}
