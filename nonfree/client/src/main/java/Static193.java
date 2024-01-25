import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!gja", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString31;

	@OriginalMember(owner = "client!gja", name = "e", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_122 = new Class196(130, -1);

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lclient!kf;ZLclient!da;Lclient!ha;ZLjava/lang/String;)V")
	public static void method2763(@OriginalArg(0) Class198 arg0, @OriginalArg(2) Class72 arg1, @OriginalArg(3) Class143 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) String arg4) {
		@Pc(12) boolean local12 = !Static215.aBoolean245 || Static192.method2758();
		if (!local12) {
			return;
		}
		@Pc(31) int local31;
		@Pc(40) int local40;
		if (Static215.aBoolean245 && local12) {
			@Pc(138) Class198 local138 = Static380.aClass198_9;
			@Pc(144) Class72 local144 = arg2.method6194(local138, Static242.aClass301Array3);
			local31 = local138.method4084(250, (Class59[]) null, arg4);
			local40 = local138.method4082(250, local138.anInt4637, arg4, (Class59[]) null);
			@Pc(163) int local163 = Static613.aClass301_3.anInt8501;
			@Pc(167) int local167 = local163 + 4;
			local31 += local167 * 2;
			local40 += local167 * 2;
			if (Static425.anInt7565 > local40) {
				local40 = Static425.anInt7565;
			}
			if (local31 < Static561.anInt9150) {
				local31 = Static561.anInt9150;
			}
			@Pc(206) int local206 = Static594.aClass112_18.method2278(Static345.anInt6198, local31) + Static292.anInt4547;
			@Pc(214) int local214 = Static272.aClass4_10.method49(Static427.anInt10577, local40) + Static602.anInt9871;
			if (Static305.aBoolean315) {
				local206 += Static304.method4150();
				local214 += Static563.method7702();
			}
			arg2.method6247(Static270.aClass301_2, false).method8060(Static82.aClass301_1.anInt8501 + local206, local214 + Static82.aClass301_1.anInt8497, local31 - Static82.aClass301_1.anInt8501 * 2, -(Static82.aClass301_1.anInt8497 * 2) + local40, 1, 0, 0);
			arg2.method6247(Static82.aClass301_1, true).method8057(local206, local214);
			Static82.aClass301_1.method7233();
			arg2.method6247(Static82.aClass301_1, true).method8057(local31 + local206 - local163, local214);
			Static82.aClass301_1.method7223();
			arg2.method6247(Static82.aClass301_1, true).method8057(local206 + local31 - local163, local214 - (-local40 + local163));
			Static82.aClass301_1.method7233();
			arg2.method6247(Static82.aClass301_1, true).method8057(local206, local40 + local214 - local163);
			Static82.aClass301_1.method7223();
			arg2.method6247(Static613.aClass301_3, true).method8063(local206, Static82.aClass301_1.anInt8497 + local214, local163, local40 - Static82.aClass301_1.anInt8497 * 2);
			Static613.aClass301_3.method7225();
			arg2.method6247(Static613.aClass301_3, true).method8063(Static82.aClass301_1.anInt8501 + local206, local214, local31 - Static82.aClass301_1.anInt8501 * 2, local163);
			Static613.aClass301_3.method7225();
			arg2.method6247(Static613.aClass301_3, true).method8063(local31 + local206 - local163, local214 - -Static82.aClass301_1.anInt8497, local163, local40 - Static82.aClass301_1.anInt8497 * 2);
			Static613.aClass301_3.method7225();
			arg2.method6247(Static613.aClass301_3, true).method8063(local206 + Static82.aClass301_1.anInt8501, -local163 + local40 + local214, local31 - Static82.aClass301_1.anInt8501 * 2, local163);
			Static613.aClass301_3.method7225();
			local144.method6912(local214 + local167, -(local167 * 2) + local40, arg4, 0, 0, 1, local31 - local167 * 2, 0, Static405.anInt6984 | 0xFF000000, local167 + local206, 1, (Class1) null, (Class59[]) null, (int[]) null, -1);
			Static177.method2603(local31, local206, local40, local214);
		} else {
			local31 = arg0.method4084(250, (Class59[]) null, arg4);
			local40 = arg0.method4081(arg4, (Class59[]) null, 250) * 13;
			arg2.aa(6, 6, local31 + 8, local40 + 4 + 4, -16777216, 0);
			arg2.method6229(6, 6, local31 + 8, local40 + 4 + 4, -1, 0);
			arg1.method6912(10, local40, arg4, 0, 0, 1, local31, 0, -1, 10, 1, (Class1) null, (Class59[]) null, (int[]) null, -1);
			Static177.method2603(local31 + 8, 6, local40 + 4 + 4, 6);
		}
		if (!arg3) {
			return;
		}
		try {
			if (Static305.aBoolean315) {
				Static573.method7838();
			} else {
				arg2.method6201();
			}
		} catch (@Pc(453) Exception_Sub1 local453) {
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(I[BZ)V")
	public static void method2764(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static262.aClass5_Sub15_5 == null) {
			Static262.aClass5_Sub15_5 = new Class5_Sub15(20000);
		}
		Static262.aClass5_Sub15_5.method3685(arg0, arg0.length, 0);
		if (!arg1) {
			return;
		}
		Static580.method7934(Static262.aClass5_Sub15_5.aByteArray45);
		Static475.aClass160_Sub1Array2 = new Class160_Sub1[Static236.anInt3827];
		@Pc(36) int local36 = 0;
		for (@Pc(38) int local38 = Static132.anInt2228; local38 <= Static598.anInt9726; local38++) {
			@Pc(43) Class160_Sub1 local43 = Static401.method5878(local38);
			if (local43 != null) {
				Static475.aClass160_Sub1Array2[local36++] = local43;
			}
		}
		Static156.aBoolean185 = false;
		Static423.aLong224 = Static124.method1947();
		Static262.aClass5_Sub15_5 = null;
	}
}
