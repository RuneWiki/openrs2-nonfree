import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aha", name = "g", descriptor = "I")
	public static int anInt433;

	@OriginalMember(owner = "client!aha", name = "i", descriptor = "Lclient!qha;")
	public static Class286 aClass286_1;

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_4 = new Class289(18, 8);

	@OriginalMember(owner = "client!aha", name = "f", descriptor = "I")
	public static int anInt432 = 0;

	@OriginalMember(owner = "client!aha", name = "h", descriptor = "Lclient!sha;")
	public static Class321 aClass321_4 = null;

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(III)Z")
	public static boolean method452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(III[B)[B")
	public static byte[] method453(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static679.method1563(arg1, arg0, local11, 0, 32768);
		return local11;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)I")
	public static int method454() {
		if (Static277.aBoolean303) {
			return 6;
		} else if (Static593.aClass6_Sub4_Sub12_4 == null) {
			return 0;
		} else {
			@Pc(22) int local22 = Static593.aClass6_Sub4_Sub12_4.anInt7577;
			if (Static487.method7074(local22)) {
				return 1;
			} else if (Static273.method4028(local22)) {
				return 2;
			} else if (Static59.method1104(local22)) {
				return 3;
			} else if (Static186.method2659(local22)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "([ILclient!lba;II[IB)Lclient!pca;")
	public static Class1_Sub3 method456(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg1.method7634(Static417.aClass250_14, Static447.aClass265_15)) {
			@Pc(69) int[] local69 = new int[arg2 * arg3];
			for (local23 = 0; local23 < arg3; local23++) {
				local33 = arg4[local23] + local23 * arg2;
				for (local35 = 0; local35 < arg0[local23]; local35++) {
					local69[local33++] = -16777216;
				}
			}
			return new Class1_Sub3(arg1, arg2, arg3, local69);
		}
		@Pc(21) byte[] local21 = new byte[arg3 * arg2];
		for (local23 = 0; local23 < arg3; local23++) {
			local33 = arg4[local23] + local23 * arg2;
			for (local35 = 0; local35 < arg0[local23]; local35++) {
				local21[local33++] = -1;
			}
		}
		return new Class1_Sub3(arg1, arg2, arg3, local21);
	}
}
