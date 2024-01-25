import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!ti", name = "G", descriptor = "Lclient!fo;")
	public static Class82 aClass82_89;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "[I")
	public static final int[] anIntArray432 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "Lclient!sd;")
	public static final Class220 aClass220_36 = new Class220(6, 0, 4, 2);

	@OriginalMember(owner = "client!ti", name = "Y", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_161 = new Class119("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!ti", name = "ab", descriptor = "Z")
	public static volatile boolean aBoolean709 = true;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public static void method5070() {
		for (@Pc(18) Class1_Sub17 local18 = (Class1_Sub17) Static432.aClass227_52.method4967(); local18 != null; local18 = (Class1_Sub17) Static432.aClass227_52.method4973()) {
			if (Static359.aClass169ArrayArrayArray5 == null) {
				local18.method5915();
			} else {
				@Pc(44) int local44;
				@Pc(59) Class25_Sub1 local59;
				@Pc(95) Class25_Sub1_Sub1 local95;
				@Pc(231) Class25_Sub2 local231;
				@Pc(125) Class25_Sub5 local125;
				@Pc(268) Class25_Sub4 local268;
				@Pc(250) Class25_Sub2_Sub3 local250;
				@Pc(304) Class25_Sub4_Sub3 local304;
				if (local18.anInt1711 <= Static236.anInt4213) {
					local44 = Static258.anIntArray470[local18.anInt1724];
					if (local44 == 0) {
						local268 = Static337.method4524(local18.anInt1723, local18.anInt1720, local18.anInt1721);
						if (local268 instanceof Class25_Sub4_Sub3) {
							Static84.method913(local18.anInt1723, local18.anInt1720, local18.anInt1721);
							local304 = (Class25_Sub4_Sub3) local268;
							if (local304.aClass25_Sub4_3 != null) {
								Static230.method3286(local18.anInt1723, local18.anInt1720, local18.anInt1721, local304.aClass25_Sub4_3, null);
							}
						}
					} else if (local44 == 1) {
						local59 = Static165.method2380(local18.anInt1723, local18.anInt1720, local18.anInt1721);
						if (local59 instanceof Class25_Sub1_Sub1) {
							Static280.method3891(local18.anInt1723, local18.anInt1720, local18.anInt1721);
							local95 = (Class25_Sub1_Sub1) local59;
							if (local95.aClass25_Sub1_1 != null) {
								Static394.method5148(local18.anInt1723, local18.anInt1720, local18.anInt1721, local95.aClass25_Sub1_1, null);
							}
						}
					} else if (local44 == 2) {
						local125 = Static364.method2862(local18.anInt1723, local18.anInt1720, local18.anInt1721, mh.class);
						if (local125 instanceof Class25_Sub5_Sub6) {
							Static309.method4217(local18.anInt1723, local18.anInt1720, local18.anInt1721, mh.class);
							@Pc(448) Class25_Sub5_Sub6 local448 = (Class25_Sub5_Sub6) local125;
							if (local448.aClass25_Sub5_2 != null) {
								Static277.method4344(local448.aClass25_Sub5_2, false);
							}
						}
					} else if (local44 == 3) {
						local231 = Static231.method3312(local18.anInt1723, local18.anInt1720, local18.anInt1721);
						if (local231 instanceof Class25_Sub2_Sub3) {
							Static270.method3797(local18.anInt1723, local18.anInt1720, local18.anInt1721);
							local250 = (Class25_Sub2_Sub3) local231;
							if (local250.aClass25_Sub2_1 != null) {
								Static136.method5270(local18.anInt1723, local18.anInt1720, local18.anInt1721, local250.aClass25_Sub2_1);
							}
						}
					}
					local18.method5915();
				} else if (local18.anInt1716 == Static236.anInt4213) {
					local44 = Static258.anIntArray470[local18.anInt1724];
					if (local44 == 0) {
						local268 = Static337.method4524(local18.anInt1723, local18.anInt1720, local18.anInt1721);
						if (local268 instanceof Class25_Sub4_Sub3) {
							local18.method5915();
						} else if (Static268.method3788(local18.anInt1723, local18.anInt1720, local18.anInt1721) == null) {
							local304 = new Class25_Sub4_Sub3(local18.anInt1724, local18.anInt1712, local18.anInt1715, local18.anInt1710, local18.anInt1722, local268);
							Static230.method3286(local18.anInt1723, local18.anInt1720, local18.anInt1721, local304, null);
						} else {
							local18.method5915();
						}
					} else if (local44 == 1) {
						local59 = Static165.method2380(local18.anInt1723, local18.anInt1720, local18.anInt1721);
						if (local59 instanceof Class25_Sub1_Sub1) {
							local18.method5915();
						} else if (Static148.method2207(local18.anInt1723, local18.anInt1720, local18.anInt1721) == null) {
							local95 = new Class25_Sub1_Sub1(local18.anInt1724, local18.anInt1712, local18.anInt1715, local18.anInt1710, local18.anInt1722, local59);
							Static394.method5148(local18.anInt1723, local18.anInt1720, local18.anInt1721, local95, null);
						} else {
							local18.method5915();
						}
					} else if (local44 == 2) {
						local125 = Static364.method2862(local18.anInt1723, local18.anInt1720, local18.anInt1721, mh.class);
						if (local125 instanceof Class25_Sub5_Sub6) {
							local18.method5915();
						} else {
							Static309.method4217(local18.anInt1723, local18.anInt1720, local18.anInt1721, mh.class);
							@Pc(154) Class68 local154 = Static341.aClass75_4.method1616(local18.anInt1709);
							@Pc(167) int local167;
							@Pc(170) int local170;
							if (local18.anInt1712 == 1 || local18.anInt1712 == 3) {
								local170 = local154.anInt1810;
								local167 = local154.anInt1803;
							} else {
								local167 = local154.anInt1810;
								local170 = local154.anInt1803;
							}
							@Pc(212) Class25_Sub5_Sub6 local212 = new Class25_Sub5_Sub6(local18.anInt1724, local18.anInt1712, local18.anInt1723, local18.anInt1715, local18.anInt1710, local18.anInt1722, local18.anInt1720, local18.anInt1720 + local167 - 1, local18.anInt1721, local18.anInt1721 + local170 - 1, local125);
							Static277.method4344(local212, false);
						}
					} else if (local44 == 3) {
						local231 = Static231.method3312(local18.anInt1723, local18.anInt1720, local18.anInt1721);
						if (local231 instanceof Class25_Sub2_Sub3) {
							local18.method5915();
						} else {
							local250 = new Class25_Sub2_Sub3(local18.anInt1715, local18.anInt1710, local18.anInt1722, local231);
							Static136.method5270(local18.anInt1723, local18.anInt1720, local18.anInt1721, local250);
						}
					}
				}
			}
		}
	}
}
