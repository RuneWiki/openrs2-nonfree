import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_19 = new Class136(84, 4);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZ)V")
	public static void method670(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static302.anInt4813 != -1) {
				Static194.method3066(Static302.anInt4813);
			}
			for (@Pc(19) Class5_Sub15 local19 = (Class5_Sub15) Static183.aClass81_27.method1608(); local19 != null; local19 = (Class5_Sub15) Static183.aClass81_27.method1610()) {
				if (!local19.method8913()) {
					local19 = (Class5_Sub15) Static183.aClass81_27.method1608();
					if (local19 == null) {
						break;
					}
				}
				Static177.method2689(false, true, local19);
			}
			Static302.anInt4813 = -1;
			Static183.aClass81_27 = new Class81(8);
			Static292.method4308();
			Static302.anInt4813 = Static452.anInt8709;
			Static627.method8697(false);
			Static101.method1476();
			Static82.method1319(Static302.anInt4813);
		}
		Static577.aBoolean768 = false;
		Static94.aString145 = "";
		Static358.aString114 = "";
		Static613.method8505();
		Static522.anInt7724 = -1;
		Static362.method5663(Static631.anInt10289);
		Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 = new Class14_Sub1_Sub1_Sub3_Sub1();
		Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray253[0] = Static111.anInt1752 / 2;
		Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317 = Static111.anInt1752 * 512 / 2;
		Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315 = Static279.anInt4567 * 512 / 2;
		Static646.anInt10445 = 0;
		Static70.anInt9231 = 0;
		Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray252[0] = Static279.anInt4567 / 2;
		if (Static584.anInt9543 == 2) {
			Static646.anInt10445 = Static148.anInt4148 << 9;
			Static70.anInt9231 = Static512.anInt9960 << 9;
		} else {
			Static270.method4084();
		}
		Static571.method8044();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method673(@OriginalArg(1) String arg0) {
		return Static226.method3557(km.class, arg0);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[B)[B")
	public static byte[] method674(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static655.method4109(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V")
	public static void method675() {
		Static164.anInt5717 = 0;
		@Pc(12) int local12 = Static113.anInt1785 + (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317 >> 9);
		@Pc(20) int local20 = (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315 >> 9) + Static622.anInt10087;
		if (local12 >= 3053 && local12 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static164.anInt5717 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static164.anInt5717 = 1;
		}
		if (Static164.anInt5717 == 1 && local12 >= 3139 && local12 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static164.anInt5717 = 0;
		}
	}
}
