import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "Lclient!qn;")
	public static Class211 aClass211_6;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "[I")
	public static final int[] anIntArray6 = new int[1000];

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
	public static int anInt160 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLclient!tf;)V")
	public static void method130(@OriginalArg(1) Class4_Sub9_Sub2 arg0) {
		arg0.method5076();
		@Pc(10) int local10 = Static12.anInt187;
		@Pc(20) Class8_Sub3_Sub1_Sub1 local20 = Static401.aClass8_Sub3_Sub1_Sub1_2 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local10] = new Class8_Sub3_Sub1_Sub1();
		local20.anInt7391 = local10;
		@Pc(28) int local28 = arg0.method5071(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray560[0] = local39 - Static365.anInt6047;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anInt7339 = (local20.anIntArray560[0] << 7) + (local20.method5894() << 6);
		local20.anIntArray559[0] = local51 - Static366.anInt6052;
		local20.anInt7343 = (local20.anIntArray559[0] << 7) + (local20.method5894() << 6);
		Static68.anInt1387 = local20.aByte99 = local33;
		if (Static384.aClass4_Sub9Array1[local10] != null) {
			local20.method4554(Static384.aClass4_Sub9Array1[local10]);
		}
		Static438.anInt2796 = 0;
		Static78.anIntArray114[Static438.anInt2796++] = local10;
		Static104.aByteArray11[local10] = 0;
		Static454.anInt7608 = 0;
		for (@Pc(121) int local121 = 1; local121 < 2048; local121++) {
			if (local10 != local121) {
				@Pc(133) int local133 = arg0.method5071(18);
				@Pc(137) int local137 = local133 >> 16;
				@Pc(143) int local143 = local133 >> 8 & 0xFF;
				@Pc(147) int local147 = local133 & 0xFF;
				@Pc(155) Class272 local155 = Static302.aClass272Array1[local121] = new Class272();
				local155.anInt7663 = local147 + (local143 << 14) + (local137 << 28);
				local155.anInt7659 = 0;
				local155.aBoolean538 = false;
				local155.anInt7662 = -1;
				Static360.anIntArray469[Static454.anInt7608++] = local121;
				Static104.aByteArray11[local121] = 0;
			}
		}
		arg0.method5074();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ya;IIIIIIIB)V")
	public static void method132(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(15) Interface4 local15 = (Interface4) Static14.method170(arg2, arg4, arg7);
		@Pc(24) Class114 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(40) int local40;
		if (local15 != null) {
			local24 = Static51.aClass151_1.method2917(local15.method5603());
			local30 = local15.method5600() & 0x3;
			local34 = local15.method5606();
			if (local24.anInt2866 == -1) {
				local40 = arg5;
				if (local24.anInt2871 > 0) {
					local40 = arg6;
				}
				if (local34 == 0 || local34 == 2) {
					if (local30 == 0) {
						arg0.method5368(4, arg1, arg3, local40);
					} else if (local30 == 1) {
						arg0.method5402(4, arg1, local40, arg3);
					} else if (local30 == 2) {
						arg0.method5368(4, arg1 + 3, arg3, local40);
					} else if (local30 == 3) {
						arg0.method5402(4, arg1, local40, arg3 + 3);
					}
				}
				if (local34 == 3) {
					if (local30 == 0) {
						arg0.method5394(1, arg1, 1, arg3, local40);
					} else if (local30 == 1) {
						arg0.method5394(1, arg1 + 3, 1, arg3, local40);
					} else if (local30 == 2) {
						arg0.method5394(1, arg1 + 3, 1, arg3 + 3, local40);
					} else if (local30 == 3) {
						arg0.method5394(1, arg1, 1, arg3 + 3, local40);
					}
				}
				if (local34 == 2) {
					if (local30 == 0) {
						arg0.method5402(4, arg1, local40, arg3);
					} else if (local30 == 1) {
						arg0.method5368(4, arg1 + 3, arg3, local40);
					} else if (local30 == 2) {
						arg0.method5402(4, arg1, local40, arg3 + 3);
					} else if (local30 == 3) {
						arg0.method5368(4, arg1, arg3, local40);
					}
				}
			} else {
				Static304.method3975(arg0, local30, arg3, arg1, local24);
			}
		}
		local15 = (Interface4) Static64.method926(arg2, arg4, arg7, fw.class);
		if (local15 != null) {
			local24 = Static51.aClass151_1.method2917(local15.method5603());
			local30 = local15.method5600() & 0x3;
			local34 = local15.method5606();
			if (local24.anInt2866 != -1) {
				Static304.method3975(arg0, local30, arg3, arg1, local24);
			} else if (local34 == 9) {
				local40 = -1118482;
				if (local24.anInt2871 > 0) {
					local40 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg0.method5388(local40, arg3, arg1, arg3 + 3, arg1 - -3);
				} else {
					arg0.method5388(local40, arg3 + 3, arg1, arg3, arg1 + 3);
				}
			}
		}
		local15 = (Interface4) Static190.method2771(arg2, arg4, arg7);
		if (local15 == null) {
			return;
		}
		local24 = Static51.aClass151_1.method2917(local15.method5603());
		local30 = local15.method5600() & 0x3;
		if (local24.anInt2866 != -1) {
			Static304.method3975(arg0, local30, arg3, arg1, local24);
			return;
		}
	}
}
