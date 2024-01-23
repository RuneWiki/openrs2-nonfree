import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "J")
	public static long aLong170;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!th;")
	public static Class169 aClass169_122 = new Class169(4);

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
	public static int anInt4329 = 0;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Z")
	public static boolean aBoolean295 = false;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "S")
	public static short aShort23 = 256;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!gd;)V")
	public static void method3502(@OriginalArg(0) Class60 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1529; local2 <= arg0.anInt1523; local2++) {
			for (@Pc(9) int local9 = arg0.anInt1522; local9 <= arg0.anInt1537; local9++) {
				@Pc(22) Class1_Sub17 local22 = Static122.aClass1_Sub17ArrayArrayArray3[arg0.anInt1521][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.anInt3452; local26++) {
						if (local22.aClass60Array3[local26] == arg0) {
							local22.anInt3452--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt3452; local44++) {
								local22.aClass60Array3[local44] = local22.aClass60Array3[local44 + 1];
								local22.anIntArray276[local44] = local22.anIntArray276[local44 + 1];
							}
							local22.aClass60Array3[local22.anInt3452] = null;
							break;
						}
					}
					local22.anInt3454 = 0;
					for (local26 = 0; local26 < local22.anInt3452; local26++) {
						local22.anInt3454 |= local22.anIntArray276[local26];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([Ljava/lang/Object;I[III)V")
	public static void method3504(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(21) int local21 = (arg3 + arg2) / 2;
		@Pc(23) int local23 = arg3;
		@Pc(27) int local27 = arg1[local21];
		arg1[local21] = arg1[arg2];
		arg1[arg2] = local27;
		@Pc(41) Object local41 = arg0[local21];
		arg0[local21] = arg0[arg2];
		arg0[arg2] = local41;
		for (@Pc(53) int local53 = arg3; local53 < arg2; local53++) {
			if (local27 + (local53 & 0x1) > arg1[local53]) {
				@Pc(73) int local73 = arg1[local53];
				arg1[local53] = arg1[local23];
				arg1[local23] = local73;
				@Pc(87) Object local87 = arg0[local53];
				arg0[local53] = arg0[local23];
				arg0[local23++] = local87;
			}
		}
		arg1[arg2] = arg1[local23];
		arg1[local23] = local27;
		arg0[arg2] = arg0[local23];
		arg0[local23] = local41;
		method3504(arg0, arg1, local23 - 1, arg3);
		method3504(arg0, arg1, arg2, local23 + 1);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)I")
	public static int method3505() {
		return 2;
	}
}
