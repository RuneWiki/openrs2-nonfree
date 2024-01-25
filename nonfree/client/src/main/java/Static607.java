import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "[Lclient!df;")
	public static Class8_Sub1[] aClass8_Sub1Array4;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
	public static void method8678() {
		Static348.aClass195_1 = new Class195(8);
		Static147.anInt2372 = 0;
		for (@Pc(17) Class8_Sub5 local17 = (Class8_Sub5) Static120.aClass98_2.method1777(); local17 != null; local17 = (Class8_Sub5) Static120.aClass98_2.method1782()) {
			local17.method4905();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method8679(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static543.anInt9260 > 0) {
			local18 = Static487.aByteArrayArray25[--Static543.anInt9260];
			Static487.aByteArrayArray25[Static543.anInt9260] = null;
			return local18;
		} else if (arg0 == 5000 && Static574.anInt9622 > 0) {
			local18 = Static332.aByteArrayArray14[--Static574.anInt9622];
			Static332.aByteArrayArray14[Static574.anInt9622] = null;
			return local18;
		} else if (arg0 == 30000 && Static546.anInt9788 > 0) {
			local18 = Static282.aByteArrayArray11[--Static546.anInt9788];
			Static282.aByteArrayArray11[Static546.anInt9788] = null;
			return local18;
		} else {
			if (Static127.aByteArrayArrayArray1 != null) {
				for (@Pc(76) int local76 = 0; local76 < Static670.anIntArray619.length; local76++) {
					if (arg0 == Static670.anIntArray619[local76] && Static168.anIntArray151[local76] > 0) {
						@Pc(105) byte[] local105 = Static127.aByteArrayArrayArray1[local76][--Static168.anIntArray151[local76]];
						Static127.aByteArrayArrayArray1[local76][Static168.anIntArray151[local76]] = null;
						return local105;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[B)V")
	public static synchronized void method8680(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static543.anInt9260 < 1000) {
			Static487.aByteArrayArray25[Static543.anInt9260++] = arg0;
		} else if (arg0.length == 5000 && Static574.anInt9622 < 250) {
			Static332.aByteArrayArray14[Static574.anInt9622++] = arg0;
		} else if (arg0.length == 30000 && Static546.anInt9788 < 50) {
			Static282.aByteArrayArray11[Static546.anInt9788++] = arg0;
		} else if (Static127.aByteArrayArrayArray1 != null) {
			for (@Pc(79) int local79 = 0; local79 < Static670.anIntArray619.length; local79++) {
				if (Static670.anIntArray619[local79] == arg0.length && Static127.aByteArrayArrayArray1[local79].length > Static168.anIntArray151[local79]) {
					Static127.aByteArrayArrayArray1[local79][Static168.anIntArray151[local79]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)V")
	public static void method8681(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static675.aBooleanArray27[arg0]) {
			Static472.aClass208_107.method5007(arg0);
			Static489.aClass73ArrayArray2[arg0] = null;
			Static175.aClass73ArrayArray1[arg0] = null;
			Static675.aBooleanArray27[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIZLclient!c;)V")
	public static void method8682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class55 arg3) {
		for (@Pc(18) Class5_Sub22 local18 = (Class5_Sub22) Static343.aClass102_41.method1916(); local18 != null; local18 = (Class5_Sub22) Static343.aClass102_41.method1915()) {
			if (local18.anInt3959 == arg2 && arg1 << 9 == local18.anInt3948 && local18.anInt3951 == arg0 << 9 && arg3.anInt911 == local18.aClass55_1.anInt911) {
				if (local18.aClass5_Sub16_Sub3_2 != null) {
					Static91.aClass5_Sub16_Sub1_1.method2554(local18.aClass5_Sub16_Sub3_2);
					local18.aClass5_Sub16_Sub3_2 = null;
				}
				if (local18.aClass5_Sub16_Sub3_3 != null) {
					Static91.aClass5_Sub16_Sub1_1.method2554(local18.aClass5_Sub16_Sub3_3);
					local18.aClass5_Sub16_Sub3_3 = null;
				}
				local18.method9327(1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)I")
	public static int method8684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static526.method7591(arg0 - 1, arg1 + -1) + Static526.method7591(arg0 + 1, arg1 + -1) + Static526.method7591(arg0 + -1, arg1 + 1) + Static526.method7591(arg0 + 1, arg1 + 1);
		@Pc(78) int local78 = Static526.method7591(arg0 - 1, arg1) + Static526.method7591(arg0 + 1, arg1) + Static526.method7591(arg0, arg1 - 1) + Static526.method7591(arg0, arg1 + 1);
		@Pc(83) int local83 = Static526.method7591(arg0, arg1);
		return local41 / 16 + local78 / 8 + local83 / 4;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILclient!ha;)Lclient!lq;")
	public static Class224 method8685(@OriginalArg(1) int arg0, @OriginalArg(2) Class57 arg1) {
		@Pc(17) Class81 local17 = Static446.method6639(arg0, arg1, true);
		return local17 == null ? null : local17.aClass224_2;
	}
}
