import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
	public static int anInt4692 = -50;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lclient!ms;")
	public static Class32_Sub4 method4183(@OriginalArg(1) int arg0) {
		@Pc(5) Class39[] local5 = Class5_Sub3_Sub11.aClass39Array1;
		synchronized (Class5_Sub3_Sub11.aClass39Array1) {
			@Pc(31) Class32_Sub4 local31;
			if (arg0 >= Class5_Sub3_Sub11.aClass39Array1.length || Class5_Sub3_Sub11.aClass39Array1[arg0].method798()) {
				local31 = new Class32_Sub4();
				local31.aClass32_Sub8Array1 = new Class32_Sub8[arg0];
				for (@Pc(52) int local52 = 0; local52 < arg0; local52++) {
					local31.aClass32_Sub8Array1[local52] = new Class32_Sub8();
				}
			} else {
				local31 = (Class32_Sub4) Class5_Sub3_Sub11.aClass39Array1[arg0].method804();
				local31.method5578();
				@Pc(38) int local38 = Static158.anIntArray520[arg0]--;
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!ea;)V")
	public static void method4185(@OriginalArg(1) Class55 arg0) {
		arg0.method5258(0, 0, Static168.anInt3376, 350);
		arg0.method5205(0, 0, Static168.anInt3376, 350, Static54.anInt1001 << 24 | 0x332277, 1);
		@Pc(35) int local35;
		@Pc(39) int local39;
		for (@Pc(29) int local29 = 0; local29 < 100; local29++) {
			local35 = Static125.anIntArray239[local29];
			local39 = Static183.anIntArray365[local29];
			arg0.method5205(local35, local39, 2, 2, Static192.anIntArray382[local29] << 24 | 0xFFFFFF, 1);
		}
		local35 = 350 / Static176.anInt3501;
		if (Static247.anInt4947 > 0) {
			local39 = 342 - Static176.anInt3501;
			@Pc(83) int local83 = local39 * local35 / (Static247.anInt4947 + local35 - 1);
			@Pc(85) int local85 = 4;
			if (Static247.anInt4947 > 1) {
				local85 = (Static247.anInt4947 - Static175.anInt2812 - 1) * (local39 - local83) / (Static247.anInt4947 - 1) + 4;
			}
			arg0.method5205(Static168.anInt3376 - 16, local85, 12, local83, Static54.anInt1001 << 24 | 0x332277, 2);
			for (@Pc(122) int local122 = Static175.anInt2812; local122 < local35 + Static175.anInt2812 && Static247.anInt4947 > local122; local122++) {
				@Pc(131) String[] local131 = Static172.method4047(Static17.aStringArray4[local122], '\b');
				@Pc(140) int local140 = (Static168.anInt3376 - 8 - 16) / local131.length;
				for (@Pc(142) int local142 = 0; local142 < local131.length; local142++) {
					@Pc(150) int local150 = local140 * local142 + 8;
					arg0.method5258(local150, 0, local140 + local150 - 8, 350);
					Static204.aClass18_3.method4174(local150, -1, 350 - Static176.anInt3501 * (local122 - Static175.anInt2812) - Static56.anInt1019 - Static92.aClass36_4.anInt737 - 2, -16777216, local131[local142]);
				}
			}
		}
		arg0.method5258(0, 0, Static168.anInt3376, 350);
		arg0.method5243(Static168.anInt3376, 350 - Static56.anInt1019, -1, 0);
		Static77.aClass18_1.method4174(10, -1, 350 - Static268.aClass36_8.anInt737 - 1, -16777216, "--> " + Static163.aString20);
		local39 = -1;
		if (Static283.anInt5563 % 30 > 15) {
			local39 = 16777215;
		}
		arg0.method5178(local39, Static268.aClass36_8.method640("--> " + Static163.aString20.substring(0, Static93.anInt1788)) + 10, 12, 350 - Static268.aClass36_8.anInt737 - 11);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static92.method1683(arg2)) {
			Static111.method1964(arg1, arg4, arg3, arg7, -1, arg5, arg0, Static304.aClass201ArrayArray1[arg2], arg6);
		} else if (arg4 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static287.aBooleanArray23[local20] = true;
			}
		} else {
			Static287.aBooleanArray23[arg4] = true;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIZZ)V")
	public static void method4188(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		Static350.anInt6715 = arg0;
		Static236.anInt4222 = arg1;
		Static257.anInt5067 = arg2;
		Static104.aClass174ArrayArrayArray2 = new Class174[4][Static350.anInt6715][Static236.anInt4222];
		Static56.aClass51Array2 = new Class51[4];
		if (arg3) {
			Static52.aClass174ArrayArrayArray1 = new Class174[1][Static350.anInt6715][Static236.anInt4222];
			Static127.anIntArrayArray45 = new int[Static350.anInt6715][Static236.anInt4222];
			Static219.aClass51Array3 = new Class51[1];
		} else {
			Static52.aClass174ArrayArrayArray1 = null;
			Static127.anIntArrayArray45 = null;
			Static219.aClass51Array3 = null;
		}
		if (arg4) {
			Static308.anIntArrayArrayArray9 = new int[4][arg0][arg1];
			Static182.aClass5_Sub9_Sub1Array2 = new Class5_Sub9_Sub1[255];
			Static29.aBooleanArray4 = new boolean[255];
			Static303.anInt5904 = 0;
		} else {
			Static308.anIntArrayArrayArray9 = null;
			Static182.aClass5_Sub9_Sub1Array2 = null;
			Static29.aBooleanArray4 = null;
			Static303.anInt5904 = 0;
		}
		Static198.method3495(false);
		Static324.aClass197Array2 = new Class197[500];
		Static130.anInt5552 = 0;
		Static149.aClass197Array1 = new Class197[500];
		Static238.anInt4783 = 0;
		Static318.anIntArrayArrayArray10 = new int[4][Static350.anInt6715 + 1][Static236.anInt4222 + 1];
		Static274.aClass4_Sub5Array2 = new Class4_Sub5[5000];
		Static107.anInt4822 = 0;
		Static172.aBooleanArrayArray6 = new boolean[Static257.anInt5067 + Static257.anInt5067 + 1][Static257.anInt5067 + Static257.anInt5067 + 1];
		Static206.aBooleanArrayArray5 = new boolean[Static257.anInt5067 + Static257.anInt5067 + 2][Static257.anInt5067 + Static257.anInt5067 + 2];
		Static136.aClass91_1 = null;
	}
}
