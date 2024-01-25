import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ada", name = "U", descriptor = "Lclient!fl;")
	public static final Class103 aClass103_1 = new Class103(3, 2);

	@OriginalMember(owner = "client!ada", name = "cb", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_1 = new Class230(70, 6);

	@OriginalMember(owner = "client!ada", name = "db", descriptor = "Lclient!ft;")
	public static final Class110 aClass110_3 = new Class110(13, 7);

	@OriginalMember(owner = "client!ada", name = "eb", descriptor = "I")
	public static int anInt273 = 0;

	@OriginalMember(owner = "client!ada", name = "fb", descriptor = "I")
	public static final int anInt274 = 0;

	@OriginalMember(owner = "client!ada", name = "h", descriptor = "(I)Z")
	public static boolean method272() {
		@Pc(8) Class3_Sub3 local8 = (Class3_Sub3) Static226.aClass183_27.method4795();
		if (local8 == null) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt610; local14++) {
			if (local8.aClass66Array2[local14] != null && local8.aClass66Array2[local14].anInt2308 == 0) {
				return false;
			}
			if (local8.aClass66Array1[local14] != null && local8.aClass66Array1[local14].anInt2308 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIIII[[[BILclient!oa;III)V")
	public static void method273(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class15 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg7 == 0 || arg5 == 0) {
			return;
		}
		if (arg7 == 9) {
			arg7 = 1;
			arg4 = arg4 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg4 = arg4 + 3 & 0x3;
			arg7 = 1;
		}
		if (arg7 == 11) {
			arg7 = 8;
			arg4 = arg4 + 3 & 0x3;
		}
		arg8.ma(arg2, arg3, arg11, arg9, arg10, arg1, arg6[arg7 - 1][arg4], arg5, arg0);
	}

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "(B)V")
	public static void method274() {
		Static283.aClass209_5.method5510();
		Static393.aClass131_5.method3148();
		Static341.aClass6_1.method310();
		Static253.aClass146_2.method3362();
		Static121.aClass118_2.method3032();
		Static517.aClass23_2.method897();
		Static532.aClass157_2.method3731();
		Static107.aClass303_1.method7475();
		Static380.aClass46_1.method1594();
		Static164.aClass52_1.method1767();
		Static144.aClass188_1.method4914();
		Static44.aClass10_1.method398();
		Static568.aClass315_4.method7659();
		Static299.aClass17_2.method756();
		Static440.aClass187_2.method4848();
		Static271.aClass176_1.method4567();
		Static136.aClass272_1.method6857();
		Static93.aClass246_1.method6135();
		Static1.aClass228_1.method5848();
		Static290.aClass362_1.method8437();
		Static8.method309();
		Static125.method2514();
		Static29.method959();
		Static408.method6622();
		Static64.method1599();
		Static596.aClass211_66.method5538(5);
		Static197.aClass211_24.method5538(5);
		Static531.aClass211_62.method5538(5);
		Static403.aClass211_50.method5538(5);
		Static597.aClass211_67.method5538(5);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILclient!ba;III)Lclient!cd;")
	public static Class44 method275(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return arg1 == null ? null : new Class44(arg2, arg0, arg3, arg1.ZA(), arg1.ha(), arg1.M(), arg1.DA(), arg1.EA(), arg1.LA(), arg1.K());
	}
}
