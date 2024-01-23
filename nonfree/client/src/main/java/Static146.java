import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!sf;")
	public static Class159 aClass159_9;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
	public static int anInt5854;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "[[[Lclient!qo;")
	public static Class3_Sub25[][][] aClass3_Sub25ArrayArrayArray7;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
	public static int anInt5858;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
	public static int anInt5851 = -1;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "Z")
	public static boolean aBoolean417 = false;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "[I")
	public static int[] anIntArray606 = new int[14];

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
	public static int anInt5855 = -1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!rg;I)V")
	public static void method4805(@OriginalArg(0) Class151 arg0) {
		@Pc(7) Class151 local7 = Static249.method4206(arg0);
		@Pc(20) int local20;
		@Pc(17) int local17;
		if (local7 == null) {
			local17 = Static123.anInt2333;
			local20 = Static253.anInt5224;
		} else {
			local17 = local7.anInt4751;
			local20 = local7.anInt4773;
		}
		Static305.method4914(local17, arg0, false, local20);
		Static41.method573(local20, arg0, local17);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!rg;B)Z")
	public static boolean method4806(@OriginalArg(0) Class151 arg0) {
		if (arg0.anIntArray524 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray524.length; local12++) {
			@Pc(31) int local31 = Static39.method565(arg0, local12);
			@Pc(36) int local36 = arg0.anIntArray508[local12];
			if (arg0.anIntArray524[local12] == 2) {
				if (local36 <= local31) {
					return false;
				}
			} else if (arg0.anIntArray524[local12] == 3) {
				if (local36 >= local31) {
					return false;
				}
			} else if (arg0.anIntArray524[local12] == 4) {
				if (local36 == local31) {
					return false;
				}
			} else if (local36 != local31) {
				return false;
			}
		}
		return true;
	}
}
