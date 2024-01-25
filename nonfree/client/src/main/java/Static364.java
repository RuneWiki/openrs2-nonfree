import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!ve", name = "Tb", descriptor = "Lclient!ua;")
	public static Class222 aClass222_3;

	@OriginalMember(owner = "client!ve", name = "Rb", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_105 = new Class183(43, -1);

	@OriginalMember(owner = "client!ve", name = "Sb", descriptor = "Lclient!ug;")
	public static final Class227 aClass227_1 = new Class227();

	@OriginalMember(owner = "client!ve", name = "Wb", descriptor = "Lclient!gl;")
	public static Interface5 anInterface5_1 = null;

	@OriginalMember(owner = "client!ve", name = "Zb", descriptor = "I")
	public static int anInt6701 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
	public static void method5779(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub7_Sub2 local13 = Static328.method5290(1, arg0);
		local13.method1198();
		local13.anInt1465 = arg1;
	}

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "(II)V")
	public static void method5781(@OriginalArg(1) int arg0) {
		Static375.anInt6902 = arg0;
		Static8.anInt492 = -1;
		Static79.anInt1735 = -1;
		Static335.method5408();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIII)V")
	public static void method5788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class153 local3 = new Class153();
		local3.anInt4364 = arg1 >> Static162.anInt3362;
		local3.anInt4384 = arg2 >> Static162.anInt3362;
		local3.anInt4373 = arg3 >> Static162.anInt3362;
		local3.anInt4378 = arg4 >> Static162.anInt3362;
		local3.anInt4376 = arg0;
		local3.anInt4382 = arg1;
		local3.anInt4363 = arg2;
		local3.anInt4377 = arg3;
		local3.anInt4370 = arg4;
		local3.anInt4372 = arg5;
		local3.anInt4361 = arg6;
		Static326.aClass153Array2[Static174.anInt3565++] = local3;
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(IZ)V")
	public static void method5790(@OriginalArg(1) boolean arg0) {
		Static86.anInt1844 = 0;
		Static287.anInt5316 = 0;
		Static387.method6072();
		Static332.method5366(arg0);
		Static317.method5127();
		@Pc(24) int local24;
		for (@Pc(18) int local18 = 0; local18 < Static86.anInt1844; local18++) {
			local24 = Static55.anIntArray86[local18];
			if (Static223.aClass1_Sub2_Sub1_Sub2Array1[local24].anInt5399 != Static339.anInt6265) {
				if (Static223.aClass1_Sub2_Sub1_Sub2Array1[local24].aClass197_1.method4839()) {
					Static313.method5078(Static223.aClass1_Sub2_Sub1_Sub2Array1[local24]);
				}
				Static223.aClass1_Sub2_Sub1_Sub2Array1[local24].method4807(null);
				Static223.aClass1_Sub2_Sub1_Sub2Array1[local24] = null;
			}
		}
		if (Static321.aClass2_Sub24_Sub2_34.anInt6669 != Static248.anInt4821) {
			throw new RuntimeException("gnp1 pos:" + Static321.aClass2_Sub24_Sub2_34.anInt6669 + " psize:" + Static248.anInt4821);
		}
		for (local24 = 0; local24 < Static123.anInt5933; local24++) {
			if (Static223.aClass1_Sub2_Sub1_Sub2Array1[Static373.anIntArray577[local24]] == null) {
				throw new RuntimeException("gnp2 pos:" + local24 + " size:" + Static123.anInt5933);
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(BI)V")
	public static void method5791(@OriginalArg(1) int arg0) {
		Static69.method1257();
		Static297.method4861();
		Static94.method1600(arg0, true);
		Static187.method3440(Static383.aClass48_9, Static324.aClass83_116, Static381.aClass83_125);
		Static344.method5504(Static324.aClass83_116, Static383.aClass48_9);
		Static181.method3325(Static221.aClass27Array60);
		Static32.method365();
		Static59.method899();
		if (Static121.anInt6774 == 10) {
			Static324.method5231(false);
		} else if (Static121.anInt6774 == 30) {
			Static181.method3326(25);
		} else if (Static121.anInt6774 == 5) {
			Static389.method6106(Static383.aClass48_9, Static324.aClass83_116);
			return;
		}
	}
}
