import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "Lclient!tba;")
	public static Class331 aClass331_4;

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "[Lclient!jha;")
	public static final Class28_Sub1_Sub4_Sub2_Sub2[] aClass28_Sub1_Sub4_Sub2_Sub2Array2 = new Class28_Sub1_Sub4_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)V")
	public static void method4744(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 + Static153.anInt3147;
		@Pc(13) int local13 = Static201.anInt3839 + arg2;
		if (Static635.aClass226ArrayArrayArray3 == null || arg1 < 0 || arg2 < 0 || arg1 >= Static201.anInt3834 || arg2 >= Static626.anInt10238 || Static172.aClass5_Sub50_14.aClass12_Sub8_2.method2213() == 0 && arg0 != Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145) {
			return;
		}
		@Pc(55) long local55 = (long) (arg0 << 28 | local13 << 14 | local9);
		@Pc(61) Class5_Sub31 local61 = (Class5_Sub31) Static548.aClass300_41.method7188(local55);
		if (local61 == null) {
			Static151.method2741(arg0, arg1, arg2);
			return;
		}
		@Pc(75) Class5_Sub51 local75 = (Class5_Sub51) local61.aClass114_39.method2805();
		if (local75 == null) {
			Static151.method2741(arg0, arg1, arg2);
			return;
		}
		@Pc(89) Class28_Sub1_Sub1_Sub1 local89 = (Class28_Sub1_Sub1_Sub1) Static151.method2741(arg0, arg1, arg2);
		if (local89 == null) {
			local89 = new Class28_Sub1_Sub1_Sub1(arg1 << 9, Static495.aClass109Array4[arg0].method7695(arg2, arg1), arg2 << 9, arg0, arg0);
		} else {
			local89.anInt487 = local89.anInt497 = -1;
		}
		local89.anInt491 = local75.anInt9059;
		local89.anInt496 = local75.anInt9060;
		label56: while (true) {
			@Pc(132) Class5_Sub51 local132 = (Class5_Sub51) local61.aClass114_39.method2814();
			if (local132 == null) {
				break;
			}
			if (local89.anInt491 != local132.anInt9059) {
				local89.anInt490 = local132.anInt9060;
				local89.anInt487 = local132.anInt9059;
				while (true) {
					@Pc(157) Class5_Sub51 local157 = (Class5_Sub51) local61.aClass114_39.method2814();
					if (local157 == null) {
						break label56;
					}
					if (local89.anInt491 != local157.anInt9059 && local157.anInt9059 != local89.anInt487) {
						local89.anInt480 = local157.anInt9060;
						local89.anInt497 = local157.anInt9059;
					}
				}
			}
		}
		@Pc(201) int local201 = Static441.method6444(arg0, (arg1 << 9) + 256, (arg2 << 9) - -256);
		local89.anInt494 = 0;
		local89.aByte144 = (byte) arg0;
		local89.anInt10784 = arg2 << 9;
		local89.aByte145 = (byte) arg0;
		local89.anInt10781 = arg1 << 9;
		local89.anInt10779 = local201;
		if (Static599.method8200(arg2, arg1)) {
			local89.aByte144++;
		}
		Static413.method6137(arg0, arg1, arg2, local201, local89);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!wm;ILclient!oq;)V")
	public static void method4746(@OriginalArg(0) Class390 arg0, @OriginalArg(2) Class268 arg1) {
		Static328.aString48 = "";
		Static412.aClass268_2 = arg1;
		Static610.aClass390_118 = arg0;
		if (Class383.aString119.startsWith("win")) {
			Static328.aString48 = Static328.aString48 + "windows/";
		} else if (Class383.aString119.startsWith("linux")) {
			Static328.aString48 = Static328.aString48 + "linux/";
		} else if (Class383.aString119.startsWith("mac")) {
			Static328.aString48 = Static328.aString48 + "macos/";
		}
		if (Static412.aClass268_2.aBoolean645) {
			Static328.aString48 = Static328.aString48 + "msjava/";
		} else if (Class383.aString118.startsWith("amd64") || Class383.aString118.startsWith("x86_64")) {
			Static328.aString48 = Static328.aString48 + "x86_64/";
		} else if (Class383.aString118.startsWith("i386") || Class383.aString118.startsWith("i486") || Class383.aString118.startsWith("i586") || Class383.aString118.startsWith("x86")) {
			Static328.aString48 = Static328.aString48 + "x86/";
		} else if (Class383.aString118.startsWith("ppc")) {
			Static328.aString48 = Static328.aString48 + "ppc/";
		} else {
			Static328.aString48 = Static328.aString48 + "universal/";
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILclient!uaa;BILclient!aa;IJI)V")
	public static void method4748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class345 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = arg1 * arg1 + arg0 * arg0;
		if ((long) local15 > arg6) {
			return;
		}
		@Pc(31) int local31 = Math.min(arg2.anInt9649 / 2, arg2.anInt9606 / 2);
		if (local31 * local31 >= local15) {
			Static78.method1014(arg4, arg2, Static494.aClass50Array12[arg7], arg5, arg0, arg1, arg3);
			return;
		}
		local31 -= 10;
		@Pc(66) int local66;
		if (Static660.anInt10605 == 4) {
			local66 = (int) Static157.aFloat83 & 0x3FFF;
		} else {
			local66 = (int) Static157.aFloat83 + Static213.anInt9568 & 0x3FFF;
		}
		@Pc(77) int local77 = Class200.anIntArray337[local66];
		@Pc(81) int local81 = Class200.anIntArray338[local66];
		if (Static660.anInt10605 != 4) {
			local77 = local77 * 256 / (Static569.anInt9215 + 256);
			local81 = local81 * 256 / (Static569.anInt9215 + 256);
		}
		@Pc(112) int local112 = local81 * arg0 + arg1 * local77 >> 14;
		@Pc(123) int local123 = arg1 * local81 - arg0 * local77 >> 14;
		@Pc(129) double local129 = Math.atan2((double) local112, (double) local123);
		@Pc(136) int local136 = (int) ((double) local31 * Math.sin(local129));
		@Pc(143) int local143 = (int) ((double) local31 * Math.cos(local129));
		Static588.aClass50Array13[arg7].method5988((float) local136 + (float) arg5 + (float) arg2.anInt9649 / 2.0F, (float) -local143 + (float) arg3 + (float) arg2.anInt9606 / 2.0F, 4096, (int) (-local129 / 6.283185307179586D * 65535.0D));
	}
}
