import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "Lclient!mv;")
	public static Class213 aClass213_8;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "[I")
	public static int[] anIntArray215;

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_50 = new Class185(64, 3);

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)[I")
	public static int[] method4134() {
		return new int[] { Static432.anInt7908, Static473.anInt8397, Static59.anInt1888 };
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)V")
	public static void method4137() {
		Static6.anInt462 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static387.aClass6_Sub8Array1[local14] = null;
			Static340.aByteArray57[local14] = 1;
			Static530.aClass379Array1[local14] = null;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III[BIII)Z")
	public static boolean method4140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(13) int local13;
		if (local9 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local9;
		}
		@Pc(29) int local29 = -((arg4 + 7) / 8);
		@Pc(38) int local38 = -((arg2 + 8 - 1) / 8);
		for (@Pc(45) int local45 = local29; local45 < 0; local45++) {
			for (@Pc(49) int local49 = local38; local49 < 0; local49++) {
				if (arg3[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local13;
			if (arg3[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg1;
		}
		return false;
	}
}
