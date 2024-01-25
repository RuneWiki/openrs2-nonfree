import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "y", descriptor = "Lclient!bu;")
	public static Class32 aClass32_4;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_7 = new Class217(16, 8);

	@OriginalMember(owner = "client!am", name = "p", descriptor = "[Lclient!cu;")
	public static final Class3_Sub7[] aClass3_Sub7Array1 = new Class3_Sub7[2048];

	@OriginalMember(owner = "client!am", name = "z", descriptor = "[I")
	public static final int[] anIntArray49 = new int[1000];

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Z")
	public static boolean method309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
