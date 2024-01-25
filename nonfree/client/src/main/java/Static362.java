import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!pca", name = "i", descriptor = "[I")
	public static final int[] anIntArray649 = new int[2048];

	@OriginalMember(owner = "client!pca", name = "P", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_79 = new Class306(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!pca", name = "Z", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_80 = new Class306("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!pca", name = "bb", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_81 = new Class306("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BLclient!jq;)V")
	public static void method5394(@OriginalArg(1) Class156 arg0) {
		if (!Static431.aBoolean542) {
			return;
		}
		if (arg0.anObjectArray33 != null) {
			@Pc(22) Class156 local22 = Static518.method7135(Static379.anInt8819, Static48.anInt942);
			if (local22 != null) {
				@Pc(28) Class1_Sub30 local28 = new Class1_Sub30();
				local28.aClass156_12 = local22;
				local28.anObjectArray36 = arg0.anObjectArray33;
				local28.aClass156_11 = arg0;
				Static180.method2683(local28);
			}
		}
		Static144.method2331(Static50.aClass296_55);
		Static455.aClass1_Sub6_Sub2_2.method3948(arg0.anInt4677);
		Static455.aClass1_Sub6_Sub2_2.method3959(Static379.anInt8819);
		Static455.aClass1_Sub6_Sub2_2.method3931(Static48.anInt942);
		Static455.aClass1_Sub6_Sub2_2.method3950(Static196.anInt3862);
		Static455.aClass1_Sub6_Sub2_2.method3921(arg0.anInt4723);
		Static455.aClass1_Sub6_Sub2_2.method3919(arg0.anInt4697);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
	public static boolean method5397(@OriginalArg(2) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(46) char local46 = arg0.charAt(local37);
			if (local37 == 0) {
				if (local46 == '-') {
					local28 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(73) int local73;
			if (local46 >= '0' && local46 <= '9') {
				local73 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local73 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local73 = local46 - 'W';
			} else {
				return false;
			}
			if (local73 >= 10) {
				return false;
			}
			if (local28) {
				local73 = -local73;
			}
			@Pc(115) int local115 = local73 + local32 * 10;
			if (local115 / 10 != local32) {
				return false;
			}
			local30 = true;
			local32 = local115;
		}
		return local30;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public static void method5401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Class156 local8 = Static518.method7135(arg1, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray26 != null) {
			@Pc(18) Class1_Sub30 local18 = new Class1_Sub30();
			local18.aString47 = arg3;
			local18.aClass156_11 = local8;
			local18.anInt5296 = arg0;
			local18.anObjectArray36 = local8.anObjectArray26;
			Static180.method2683(local18);
		}
		if (Static268.anInt5100 != 9 || !Static67.method1228(local8).method2106(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static144.method2331(Static162.aClass296_144);
			Static32.method754(arg1, arg2, local8.anInt4697);
		}
		if (arg0 == 2) {
			Static144.method2331(Static163.aClass296_145);
			Static32.method754(arg1, arg2, local8.anInt4697);
		}
		if (arg0 == 3) {
			Static144.method2331(Static374.aClass296_295);
			Static32.method754(arg1, arg2, local8.anInt4697);
		}
		if (arg0 == 4) {
			Static144.method2331(Static472.aClass296_343);
			Static32.method754(arg1, arg2, local8.anInt4697);
		}
		if (arg0 == 5) {
			Static144.method2331(Static229.aClass296_195);
			Static32.method754(arg1, arg2, local8.anInt4697);
		}
		if (arg0 == 6) {
			Static144.method2331(Static459.aClass296_333);
			Static32.method754(arg1, arg2, local8.anInt4697);
		}
		if (arg0 == 7) {
			Static144.method2331(Static326.aClass296_256);
			Static32.method754(arg1, arg2, local8.anInt4697);
		}
		if (arg0 == 8) {
			Static144.method2331(Static345.aClass296_274);
			Static32.method754(arg1, arg2, local8.anInt4697);
		}
		if (arg0 == 9) {
			Static144.method2331(Static285.aClass296_230);
			Static32.method754(arg1, arg2, local8.anInt4697);
		}
		if (arg0 == 10) {
			Static144.method2331(Static58.aClass296_60);
			Static32.method754(arg1, arg2, local8.anInt4697);
		}
	}
}
