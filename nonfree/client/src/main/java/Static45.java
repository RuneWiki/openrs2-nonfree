import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bk", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_27 = new Class56(17, 0);

	@OriginalMember(owner = "client!bk", name = "H", descriptor = "[S")
	public static short[] aShortArray10 = new short[256];

	@OriginalMember(owner = "client!bk", name = "L", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_13 = new Class303(25, 7);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method736(@OriginalArg(0) Class45 arg0) {
		if (Static571.anInt9281 < 2 && !Static369.aBoolean463 || Static283.aClass361_8 != null) {
			return;
		}
		@Pc(44) String local44;
		if (Static369.aBoolean463 && Static571.anInt9281 < 2) {
			local44 = Static16.aString4 + Static544.aClass343_36.method7222(Static256.anInt4535) + Static585.aString93 + " ->";
		} else if (Static505.aBoolean625 && Static140.aClass195_1.method4499(81) && Static571.anInt9281 > 2) {
			local44 = Static143.method2767((Class3_Sub43) Static133.aClass112_20.aClass3_111.aClass3_285.aClass3_285);
		} else {
			@Pc(63) Class3_Sub43 local63 = (Class3_Sub43) Static133.aClass112_20.aClass3_111.aClass3_285;
			local44 = Static143.method2767(local63);
			@Pc(69) int[] local69 = null;
			if (Static354.method5255(local63.anInt7753)) {
				local69 = Static6.aClass92_1.method2673((int) local63.aLong221).anIntArray291;
			} else if (local63.anInt7751 != -1) {
				local69 = Static6.aClass92_1.method2673(local63.anInt7751).anIntArray291;
			} else if (Static246.method3794(local63.anInt7753)) {
				@Pc(109) Class3_Sub34 local109 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local63.aLong221);
				if (local109 != null) {
					@Pc(114) Class41_Sub2_Sub1_Sub4_Sub1 local114 = local109.aClass41_Sub2_Sub1_Sub4_Sub1_2;
					@Pc(117) Class264 local117 = local114.aClass264_1;
					if (local117.anIntArray443 != null) {
						local117 = local117.method5994(Static491.aClass318_1);
					}
					if (local117 != null) {
						local69 = local117.anIntArray444;
					}
				}
			} else if (Static440.method6182(local63.anInt7753)) {
				@Pc(151) Class280 local151;
				if (local63.anInt7753 == 1011) {
					local151 = Static478.aClass212_3.method4793((int) local63.aLong221);
				} else {
					local151 = Static478.aClass212_3.method4793((int) (local63.aLong221 >>> 32 & 0x7FFFFFFFL));
				}
				if (local151.anIntArray457 != null) {
					local151 = local151.method6181(Static491.aClass318_1);
				}
				if (local151 != null) {
					local69 = local151.anIntArray459;
				}
			}
			if (local69 != null) {
				local44 = local44 + Static94.method1753(local69);
			}
		}
		if (Static571.anInt9281 > 2) {
			local44 = local44 + "<col=ffffff> / " + (Static571.anInt9281 - 2) + Static544.aClass343_29.method7222(Static256.anInt4535);
		}
		if (Static39.aClass361_2 != null) {
			@Pc(227) Class54 local227 = Static39.aClass361_2.method7902(arg0);
			if (local227 == null) {
				local227 = Static460.aClass54_10;
			}
			local227.method7791(Static129.anIntArray133, Static39.aClass361_2.anInt9653, local44, Static39.aClass361_2.anInt9593, Static39.aClass361_2.anInt9592, Static185.anInt3523, Static39.aClass361_2.anInt9650, Static572.anIntArray595, Static39.aClass361_2.anInt9602, Static326.aRandom1, Static449.anInt7485, Static326.anInt5526, Static348.aClass14Array12, Static39.aClass361_2.anInt9668);
			Static542.method7209(Static572.anIntArray595[2], Static572.anIntArray595[1], Static572.anIntArray595[0], Static572.anIntArray595[3]);
		} else if (Static479.aClass361_15 != null && Static176.aClass274_2 == Static121.aClass274_1) {
			@Pc(292) int local292 = Static460.aClass54_10.method7802(Static326.aRandom1, Static38.anInt726 + 4, local44, Static491.anInt8009 + 16, Static348.aClass14Array12, Static449.anInt7485, Static129.anIntArray133);
			Static542.method7209(Static75.aClass134_7.method3348(local44) + local292, Static491.anInt8009, Static38.anInt726 + 4, 16);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)V")
	public static void method737(@OriginalArg(1) int arg0) {
		if (!Static405.aClass3_Sub3_Sub1_1.aBoolean587) {
			arg0 = -1;
		}
		if (arg0 == Static322.anInt5445) {
			return;
		}
		if (arg0 != -1) {
			@Pc(33) Class266 local33 = Static179.aClass366_1.method7949(arg0);
			@Pc(37) Class279 local37 = local33.method6025();
			if (local37 == null) {
				arg0 = -1;
			} else {
				Static237.aClass258_3.method5897(local37.method6151(), new Point(local33.anInt7202, local33.anInt7203), local37.method6150(), Static387.aCanvas9, local37.method6159());
				Static322.anInt5445 = arg0;
			}
		}
		if (arg0 == -1 && Static322.anInt5445 != -1) {
			Static237.aClass258_3.method5897(-1, new Point(), null, Static387.aCanvas9, -1);
			Static322.anInt5445 = -1;
		}
	}
}
