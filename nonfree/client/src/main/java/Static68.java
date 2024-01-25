import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!dp", name = "u", descriptor = "Lclient!qj;")
	public static Class165 aClass165_24;

	@OriginalMember(owner = "client!dp", name = "G", descriptor = "I")
	public static int anInt1415;

	@OriginalMember(owner = "client!dp", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[200];

	@OriginalMember(owner = "client!dp", name = "z", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_38 = new Class140(8);

	@OriginalMember(owner = "client!dp", name = "F", descriptor = "[I")
	public static final int[] anIntArray162 = new int[14];

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!rg;B)V")
	public static void method1382(@OriginalArg(0) Class177 arg0) {
		@Pc(10) int local10 = arg0.anInt5204;
		if (local10 == 324) {
			if (Static86.anInt1695 == -1) {
				Static86.anInt1695 = arg0.anInt5174;
				Static197.anInt6354 = arg0.anInt5210;
			}
			if (Static253.aClass31_2.aBoolean88) {
				arg0.anInt5174 = Static86.anInt1695;
			} else {
				arg0.anInt5174 = Static197.anInt6354;
			}
		} else if (local10 == 325) {
			if (Static86.anInt1695 == -1) {
				Static197.anInt6354 = arg0.anInt5210;
				Static86.anInt1695 = arg0.anInt5174;
			}
			if (Static253.aClass31_2.aBoolean88) {
				arg0.anInt5174 = Static197.anInt6354;
			} else {
				arg0.anInt5174 = Static86.anInt1695;
			}
		} else if (local10 == 327) {
			arg0.anInt5260 = 150;
			arg0.anInt5268 = (int) (Math.sin((double) Static215.anInt4246 / 40.0D) * 256.0D) & 0x3FFF;
			arg0.anInt5245 = -1;
			arg0.anInt5192 = 5;
		} else if (local10 == 328) {
			if (Static130.aClass5_Sub3_Sub3_Sub1_1.aString130 == null) {
				arg0.anInt5183 = 0;
				arg0.anInt5245 = 0;
			} else {
				arg0.anInt5260 = 150;
				arg0.anInt5268 = (int) (Math.sin((double) Static215.anInt4246 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt5192 = 5;
				arg0.anInt5245 = 2047;
				arg0.anInt5183 = Static352.method5703(Static130.aClass5_Sub3_Sub3_Sub1_1.aString130);
				arg0.anInt5187 = 0;
				arg0.anInt5176 = Static130.aClass5_Sub3_Sub3_Sub1_1.anInt4941;
				arg0.anInt5243 = Static130.aClass5_Sub3_Sub3_Sub1_1.anInt4975;
				arg0.anInt5238 = Static130.aClass5_Sub3_Sub3_Sub1_1.anInt4973;
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLclient!aa;)V")
	public static void method1384(@OriginalArg(1) Class2 arg0) {
		if (Static277.anInt6207 < 2 && Static243.anInt4739 == 0 && !Static89.aBoolean156) {
			return;
		}
		@Pc(32) String local32;
		if (Static243.anInt4739 == 1 && Static277.anInt6207 < 2) {
			local32 = Static313.aString241 + Static278.aString218 + Static285.aString222 + " ->";
		} else if (Static89.aBoolean156 && Static277.anInt6207 < 2) {
			local32 = Static21.aString15 + Static278.aString218 + Static144.aString113 + " ->";
		} else if (Static93.aBoolean161 && Static220.aBooleanArray24[81] && Static277.anInt6207 > 2) {
			local32 = Static137.method2638((Class1_Sub41) Static175.aClass195_36.aClass1_207.aClass1_248.aClass1_248);
		} else {
			@Pc(80) Class1_Sub41 local80 = (Class1_Sub41) Static175.aClass195_36.aClass1_207.aClass1_248;
			local32 = Static137.method2638(local80);
			@Pc(86) int[] local86 = null;
			if (Static295.method5059(local80.anInt6339)) {
				local86 = Static241.method4285((int) local80.aLong206).anIntArray228;
			} else if (Static171.method3408(local80.anInt6339)) {
				@Pc(131) Class5_Sub3_Sub3_Sub2 local131 = Static169.aClass5_Sub3_Sub3_Sub2Array2[(int) local80.aLong206];
				if (local131 != null) {
					local86 = local131.aClass122_1.anIntArray452;
				}
			} else if (Static210.method3850(local80.anInt6339)) {
				if (local80.anInt6339 == 1008) {
					local86 = Static126.method2405((int) local80.aLong206).anIntArray695;
				} else {
					local86 = Static126.method2405((int) (local80.aLong206 >>> 32 & 0x7FFFFFFFL)).anIntArray695;
				}
			}
			if (local86 != null) {
				local32 = local32 + Static195.method3685(local86);
			}
		}
		if (Static277.anInt6207 > 2) {
			local32 = local32 + "<col=ffffff> / " + (Static277.anInt6207 - 2) + Static75.aString58;
		}
		if (Static293.aClass177_19 != null) {
			@Pc(185) Class13 local185 = Static293.aClass177_19.method4695(arg0);
			if (local185 == null) {
				local185 = Static302.aClass13_7;
			}
			local185.method4443(Static248.aRandom1, Static293.aClass177_19.anInt5209, Static6.anIntArray20, Static335.aClass90Array16, Static293.aClass177_19.anInt5179, Static7.anInt161, local32, Static232.anIntArray788, Static202.anInt4092, Static293.aClass177_19.anInt5227, Static293.aClass177_19.anInt5199, Static183.anInt3795, Static293.aClass177_19.anInt5215, Static293.aClass177_19.anInt5247);
			Static50.method1133(Static232.anIntArray788[3], Static232.anIntArray788[2], Static232.anIntArray788[0], Static232.anIntArray788[1]);
		} else if (Static335.aClass177_24 != null && Static341.anInt2259 == 0) {
			@Pc(253) int local253 = Static302.aClass13_7.method4444(Static174.anInt3615 + 4, Static202.anInt4092, Static335.aClass90Array16, Static40.anInt4333 + 16, Static248.aRandom1, Static6.anIntArray20, local32);
			Static50.method1133(16, Static180.aClass38_5.method1316(local32) + local253, Static174.anInt3615 + 4, Static40.anInt4333);
		}
	}

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "(B)V")
	public static void method1386() {
		@Pc(10) Class140 local10 = Static135.aClass140_73;
		synchronized (Static135.aClass140_73) {
			Static135.aClass140_73.method3819();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method1387(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static74.aClass181_3);
		arg0.removeMouseMotionListener(Static74.aClass181_3);
		arg0.removeFocusListener(Static74.aClass181_3);
		Static69.anInt1425 = 0;
	}
}
