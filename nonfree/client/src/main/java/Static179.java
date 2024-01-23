import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!ud;")
	public static Class116 aClass116_7;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
	public static int anInt3725;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public static int anInt3724 = -1;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1206 = Static186.method3527("::noclip");

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "[J")
	public static long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method2937() {
		Static104.method1596();
		Static14.method198();
		Static33.method485();
		Static13.method193();
		Static175.method2895();
		Static63.method970();
		Static208.method2999();
		Static11.method182();
		Static20.method300();
		Static149.method2500();
		Static194.method3145();
		Static143.method2361();
		Static85.method1278();
		Static219.method2416();
		Static164.aClass84_28.method2576();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([Lclient!cg;IZI[BIII)V")
	public static void method2938(@OriginalArg(0) Class16[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		@Pc(22) int local22;
		@Pc(26) int local26;
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local26 = 0; local26 < 64; local26++) {
					if (arg3 + local22 > 0 && local22 + arg3 < 103 && arg1 + local26 > 0 && local26 + arg1 < 103) {
						arg0[local18].anIntArrayArray6[arg3 + local22][local26 + arg1] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(97) Class1_Sub17 local97 = new Class1_Sub17(arg2);
		for (local22 = 0; local22 < 4; local22++) {
			for (local26 = 0; local26 < 64; local26++) {
				for (@Pc(111) int local111 = 0; local111 < 64; local111++) {
					Static192.method3140(local111 + arg1, local22, local97, arg3 + local26, 0, arg5, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	public static void method2940(@OriginalArg(0) int arg0) {
		Static53.anInt1063 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static12.anInt236; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static232.anInt4450; local6++) {
				if (Static56.aClass1_Sub11ArrayArrayArray3[arg0][local3][local6] == null) {
					Static56.aClass1_Sub11ArrayArrayArray3[arg0][local3][local6] = new Class1_Sub11(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)J")
	public static synchronized long method2941() {
		@Pc(9) long local9 = System.currentTimeMillis();
		if (Static205.aLong158 > local9) {
			Static57.aLong47 += Static205.aLong158 - local9;
		}
		Static205.aLong158 = local9;
		return local9 + Static57.aLong47;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BILclient!hh;)V")
	public static void method2942(@OriginalArg(1) int arg0, @OriginalArg(2) Class50 arg1) {
		Static32.aClass1_Sub17_Sub1_1.method2182(71);
		Static32.aClass1_Sub17_Sub1_1.method2175(arg0);
		Static32.aClass1_Sub17_Sub1_1.method2157(arg1.method1221());
	}
}
