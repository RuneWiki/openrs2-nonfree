import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "Lclient!j;")
	public static Class125 aClass125_1;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "[Lclient!o;")
	public static Class85[] aClass85Array11;

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_192 = new Class67(86, 7);

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	public static void method4111() {
		Static98.aClass185_30.anInt5029 = 1;
		Static153.method1919();
		Static397.aBoolean556 = true;
		Static247.aBoolean409 = true;
		Static57.method815();
		for (@Pc(5648) int local5648 = 0; local5648 < Static13.aClass78Array1.length; local5648++) {
			Static13.aClass78Array1[local5648] = null;
		}
		Static290.aBoolean449 = false;
		Static406.method5229();
		Static75.anInt1063 = (int) (Math.random() * 100.0D) - 50;
		Static102.anInt1386 = (int) (Math.random() * 110.0D) - 55;
		Static99.aFloat9 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static232.anInt4194 = (int) (Math.random() * 80.0D) - 40;
		Static265.anInt4616 = (int) (Math.random() * 30.0D) - 20;
		Static20.anInt301 = (int) (Math.random() * 120.0D) - 60;
		Static23.method350();
		for (@Pc(5717) int local5717 = 0; local5717 < 2048; local5717++) {
			Static399.aClass11_Sub1_Sub3_Sub2Array1[local5717] = null;
		}
		Static137.anInt2142 = 0;
		Static406.anInt6516 = 0;
		Static46.aClass208_33.method4408();
		Static454.aClass14_52.method204();
		Static170.aClass14_9.method204();
		Static349.aClass63_7.method1025();
		Static402.aClass208_37.method4408();
		Static303.aClass14_33 = new Class14();
		Static32.aClass4_1.method32();
		Static97.method1142();
		Static409.anInt6536 = 0;
		Static150.anInt4704 = 0;
		Static109.anInt1672 = 0;
		Static319.anInt5270 = 0;
		Static86.anInt7437 = 0;
		Static57.anInt915 = 0;
		Static205.anInt3787 = 0;
		Static151.anInt2353 = 0;
		Static189.anInt3460 = 0;
		Static164.anInt6557 = 0;
		for (@Pc(5777) int local5777 = 0; local5777 < Static136.anIntArray184.length; local5777++) {
			if (!Static173.aBooleanArray67[local5777]) {
				Static136.anIntArray184[local5777] = -1;
			}
		}
		if (Static118.anInt1785 != -1) {
			Static364.method4777(Static118.anInt1785);
		}
		for (@Pc(5807) Class1_Sub37 local5807 = (Class1_Sub37) Static462.aClass208_42.method4414(); local5807 != null; local5807 = (Class1_Sub37) Static462.aClass208_42.method4410()) {
			if (!local5807.method5956()) {
				local5807 = (Class1_Sub37) Static462.aClass208_42.method4414();
				if (local5807 == null) {
					break;
				}
			}
			Static393.method5106(local5807, true, false);
		}
		Static118.anInt1785 = -1;
		Static462.aClass208_42 = new Class208(8);
		Static219.method3140();
		Static414.aClass107_15 = null;
		for (@Pc(5847) int local5847 = 0; local5847 < 8; local5847++) {
			Static298.aStringArray36[local5847] = null;
			Static70.aBooleanArray111[local5847] = false;
			Static435.anIntArray455[local5847] = -1;
		}
		Static78.method3887();
		Static373.aBoolean643 = true;
		for (@Pc(5871) int local5871 = 0; local5871 < 100; local5871++) {
			Static179.aBooleanArray69[local5871] = true;
		}
		for (@Pc(5885) int local5885 = 0; local5885 < 6; local5885++) {
			Static269.aClass244Array1[local5885] = new Class244();
		}
		for (@Pc(5899) int local5899 = 0; local5899 < 25; local5899++) {
			Static377.anIntArray456[local5899] = 0;
			Static426.anIntArray487[local5899] = 0;
			Static402.anIntArray468[local5899] = 0;
		}
		Static111.method1401();
		Static413.aBoolean582 = true;
		Static38.aShortArray10 = Static175.aShortArray37 = Static291.aShortArray80 = Static53.aShortArray22 = new short[256];
		Static305.aString60 = Static102.aClass142_28.method3118(Static63.anInt981);
		Static126.aClass19_Sub1_1.aBoolean394 = false;
		Static126.aClass19_Sub1_1.aBoolean393 = false;
		Static382.anInt4998 = 0;
		Static141.method4893();
		Static132.method5176();
		Static116.aLong97 = 0L;
		Static374.aClass1_Sub17_5 = null;
		Static98.aClass185_30.anInt5029 = 2;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!eq;)V")
	public static void method4112(@OriginalArg(0) Class11_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort103; local2 <= arg0.aShort100; local2++) {
			for (@Pc(6) int local6 = arg0.aShort101; local6 <= arg0.aShort102; local6++) {
				@Pc(16) Class216 local16 = Static259.aClass216ArrayArrayArray3[arg0.aByte90][local2][local6];
				if (local16 != null) {
					@Pc(21) Class259 local21 = local16.aClass259_1;
					@Pc(23) Class259 local23 = null;
					while (local21 != null) {
						if (local21.aClass11_Sub1_2 == arg0) {
							if (local23 == null) {
								local16.aClass259_1 = local21.aClass259_4;
							} else {
								local23.aClass259_4 = local21.aClass259_4;
							}
							local21.method5413();
							break;
						}
						local23 = local21;
						local21 = local21.aClass259_4;
					}
					local16.aByte83 = 0;
					for (@Pc(56) Class259 local56 = local16.aClass259_1; local56 != null; local56 = local56.aClass259_4) {
						local16.aByte83 = (byte) (local16.aByte83 | local56.anInt6824);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!fp;Lclient!jd;BLclient!za;)V")
	public static void method4113(@OriginalArg(0) Class1_Sub15 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(3) Class117 arg2) {
		@Pc(10) Class85 local10 = arg1.method2740(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.YA();
		if (local10.ZA() > local16) {
			local16 = local10.ZA();
		}
		@Pc(32) int local32 = arg0.anInt1848;
		@Pc(35) int local35 = arg0.anInt1850;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(60) int local60;
		@Pc(83) int local83;
		if (arg1.aString36 != null) {
			local42 = Static106.aClass252_140.method5297(arg1.aString36, Static359.aStringArray38, null, null);
			for (local60 = 0; local60 < local42; local60++) {
				@Pc(66) String local66 = Static359.aStringArray38[local60];
				if (local42 - 1 > local60) {
					local66 = local66.substring(0, local66.length() - 4);
				}
				local83 = Static132.aClass263_32.method5486(local66);
				if (local83 > local44) {
					local44 = local83;
				}
			}
			local46 = local42 * Static132.aClass263_32.method5487() + Static132.aClass263_32.method5485() / 2;
		}
		local60 = arg0.anInt1848 + local16 / 2;
		@Pc(112) int local112 = arg0.anInt1850;
		if (local16 + Static430.anInt4135 > local32) {
			local32 = Static430.anInt4135;
			local60 = local44 / 2 + Static430.anInt4135 + local16 / 2 + 10 + 5;
		} else if (local32 > Static430.anInt4145 - local16) {
			local32 = Static430.anInt4145 - local16;
			local60 = Static430.anInt4145 - local44 / 2 - local16 / 2 - 5 - 10;
		}
		if (local16 + Static430.anInt4139 > local35) {
			local112 = local16 / 2 + Static430.anInt4139 + 10;
			local35 = Static430.anInt4139;
		} else if (Static430.anInt4136 - local16 < local35) {
			local112 = Static430.anInt4136 - local46 - local16 / 2 - 10;
			local35 = Static430.anInt4136 - local16;
		}
		local83 = (int) (Math.atan2((double) (local32 - arg0.anInt1848), (double) (local35 - arg0.anInt1850)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5401((float) local32 + (float) local16 / 2.0F, (float) local16 / 2.0F + (float) local35, 4096, local83);
		@Pc(256) int local256 = -2;
		@Pc(258) int local258 = -2;
		@Pc(260) int local260 = -2;
		@Pc(262) int local262 = -2;
		if (arg1.aString36 != null) {
			local256 = local60 - local44 / 2 - 5;
			local258 = local112;
			local262 = local42 * Static132.aClass263_32.method5487() + local112 + 3;
			local260 = local256 + local44 + 10;
			if (arg1.anInt3495 != 0) {
				arg2.method5664(local260 - local256, local112, arg1.anInt3495, local262 - local112, local256);
			}
			if (arg1.anInt3490 != 0) {
				arg2.method5666(local112, local260 - local256, local262 - local112, arg1.anInt3490, local256);
			}
			for (@Pc(333) int local333 = 0; local333 < local42; local333++) {
				@Pc(339) String local339 = Static359.aStringArray38[local333];
				if (local42 - 1 > local333) {
					local339 = local339.substring(0, local339.length() - 4);
				}
				Static132.aClass263_32.method5482(arg2, local339, local60, local112, arg1.anInt3492);
				local112 += Static132.aClass263_32.method5487();
			}
		}
		if (arg1.anInt3486 == -1 && arg1.aString36 == null) {
			return;
		}
		@Pc(387) Class1_Sub41 local387 = new Class1_Sub41(arg0);
		local16 >>= 0x1;
		local387.anInt6014 = local16 + local32;
		local387.anInt6019 = local35 + local16;
		local387.anInt6012 = local256;
		local387.anInt6011 = local35 - local16;
		local387.anInt6017 = local262;
		local387.anInt6016 = local260;
		local387.anInt6015 = local258;
		local387.anInt6013 = local32 - local16;
		Static350.aClass14_40.method205(local387);
	}
}
