import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "Lclient!ob;")
	public static Class16_Sub1 aClass16_Sub1_46;

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!sh", name = "z", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1051 = Static8.method128("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!sh", name = "B", descriptor = "Z")
	public static boolean aBoolean184 = true;

	@OriginalMember(owner = "client!sh", name = "D", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1053 = Static8.method128("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!sh", name = "C", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1052 = aClass18_1053;

	@OriginalMember(owner = "client!sh", name = "E", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([II[III[Lclient!pc;)V")
	public static void method2809(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class57[] arg4) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(16) int local16 = arg2 - 1;
		@Pc(20) int local20 = arg3 + 1;
		@Pc(26) int local26 = (arg2 + arg3) / 2;
		@Pc(30) Class57 local30 = arg4[local26];
		arg4[local26] = arg4[arg2];
		arg4[arg2] = local30;
		while (local20 > local16) {
			@Pc(44) boolean local44 = true;
			@Pc(47) int local47;
			@Pc(64) int local64;
			@Pc(59) int local59;
			do {
				local20--;
				for (local47 = 0; local47 < 4; local47++) {
					if (arg1[local47] == 2) {
						local59 = local30.anInt3375;
						local64 = arg4[local20].anInt3375;
					} else if (arg1[local47] == 1) {
						local64 = arg4[local20].anInt3379;
						local59 = local30.anInt3379;
						if (local64 == -1 && arg0[local47] == 1) {
							local64 = 2001;
						}
						if (local59 == -1 && arg0[local47] == 1) {
							local59 = 2001;
						}
					} else if (arg1[local47] == 3) {
						local64 = arg4[local20].aBoolean148 ? 1 : 0;
						local59 = local30.aBoolean148 ? 1 : 0;
					} else {
						local64 = arg4[local20].anInt3376;
						local59 = local30.anInt3376;
					}
					if (local59 != local64) {
						if ((arg0[local47] != 1 || local59 >= local64) && (arg0[local47] != 0 || local59 <= local64)) {
							local44 = false;
						}
						break;
					}
					if (local47 == 3) {
						local44 = false;
					}
				}
			} while (local44);
			local44 = true;
			do {
				local16++;
				for (local47 = 0; local47 < 4; local47++) {
					if (arg1[local47] == 2) {
						local64 = arg4[local16].anInt3375;
						local59 = local30.anInt3375;
					} else if (arg1[local47] == 1) {
						local64 = arg4[local16].anInt3379;
						if (local64 == -1 && arg0[local47] == 1) {
							local64 = 2001;
						}
						local59 = local30.anInt3379;
						if (local59 == -1 && arg0[local47] == 1) {
							local59 = 2001;
						}
					} else if (arg1[local47] == 3) {
						local64 = arg4[local16].aBoolean148 ? 1 : 0;
						local59 = local30.aBoolean148 ? 1 : 0;
					} else {
						local64 = arg4[local16].anInt3376;
						local59 = local30.anInt3376;
					}
					if (local64 != local59) {
						if ((arg0[local47] != 1 || local64 >= local59) && (arg0[local47] != 0 || local64 <= local59)) {
							local44 = false;
						}
						break;
					}
					if (local47 == 3) {
						local44 = false;
					}
				}
			} while (local44);
			if (local16 < local20) {
				@Pc(337) Class57 local337 = arg4[local16];
				arg4[local16] = arg4[local20];
				arg4[local20] = local337;
			}
		}
		method2809(arg0, arg1, arg2, local20, arg4);
		method2809(arg0, arg1, local20 + 1, arg3, arg4);
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIII)V")
	public static void method2810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12;
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			for (local12 = 0; local12 < 8; local12++) {
				Static135.anIntArrayArrayArray5[arg2][arg0 + local8][local12 + arg1] = 0;
			}
		}
		if (arg0 > 0) {
			for (local12 = 1; local12 < 8; local12++) {
				Static135.anIntArrayArrayArray5[arg2][arg0][arg1 + local12] = Static135.anIntArrayArrayArray5[arg2][arg0 - 1][local12 + arg1];
			}
		}
		if (arg1 > 0) {
			for (local12 = 1; local12 < 8; local12++) {
				Static135.anIntArrayArrayArray5[arg2][arg0 + local12][arg1] = Static135.anIntArrayArrayArray5[arg2][arg0 + local12][arg1 - 1];
			}
		}
		if (arg0 > 0 && Static135.anIntArrayArrayArray5[arg2][arg0 - 1][arg1] != 0) {
			Static135.anIntArrayArrayArray5[arg2][arg0][arg1] = Static135.anIntArrayArrayArray5[arg2][arg0 - 1][arg1];
		} else if (arg1 > 0 && Static135.anIntArrayArrayArray5[arg2][arg0][arg1 - 1] != 0) {
			Static135.anIntArrayArrayArray5[arg2][arg0][arg1] = Static135.anIntArrayArrayArray5[arg2][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && Static135.anIntArrayArrayArray5[arg2][arg0 - 1][arg1 - 1] != 0) {
			Static135.anIntArrayArrayArray5[arg2][arg0][arg1] = Static135.anIntArrayArrayArray5[arg2][arg0 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
	public static void method2811() {
		aClass18_1052 = null;
		aClass16_Sub1_46 = null;
		aClass18_1053 = null;
		aClass18_1051 = null;
		aBigInteger2 = null;
	}
}
