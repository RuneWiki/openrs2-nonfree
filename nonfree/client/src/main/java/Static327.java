import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "Lclient!nr;")
	public static Class255 aClass255_2;

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_37 = new Class340(4);

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("8de0175bb9d1477a608107933a5a2e9409f6f08caded9789a4202792fa218cf43ab96cdd8649597627a1cbacf7a9dc0776e1f1bc7c92ffde97679d3fbe022ae1", 16);

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V")
	public static void method5080() {
		Static211.method3351(Static383.aClass345_10);
		Static365.anInt6630++;
		if (Static213.aBoolean807 && Static134.aBoolean183) {
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			if (Static66.aBoolean570) {
				local26 = Static106.method2037();
				local28 = Static660.method8815();
			}
			@Pc(42) int local42 = local26 + Static359.aClass11_1.method6141();
			@Pc(48) int local48 = Static359.aClass11_1.method6144() + local28;
			local42 -= Static637.anInt10351;
			local48 -= Static316.anInt5982;
			if (Static401.anInt7135 > local42) {
				local42 = Static401.anInt7135;
			}
			if (local42 + Static383.aClass345_10.anInt9649 > Static401.anInt7135 + Static303.aClass345_8.anInt9649) {
				local42 = Static401.anInt7135 + Static303.aClass345_8.anInt9649 - Static383.aClass345_10.anInt9649;
			}
			if (local48 < Static216.anInt4043) {
				local48 = Static216.anInt4043;
			}
			if (Static383.aClass345_10.anInt9606 + local48 > Static303.aClass345_8.anInt9606 + Static216.anInt4043) {
				local48 = Static303.aClass345_8.anInt9606 + Static216.anInt4043 - Static383.aClass345_10.anInt9606;
			}
			@Pc(120) int local120 = Static303.aClass345_8.anInt9583 + local42 - Static401.anInt7135;
			@Pc(132) int local132 = local48 + Static303.aClass345_8.anInt9577 - Static216.anInt4043;
			@Pc(191) Class5_Sub22 local191;
			if (Static359.aClass11_1.method6140()) {
				if (Static383.aClass345_10.anInt9592 < Static365.anInt6630) {
					@Pc(149) int local149 = local42 - Static28.anInt392;
					@Pc(154) int local154 = local48 - Static582.anInt10820;
					if (Static383.aClass345_10.anInt9653 < local149 || -Static383.aClass345_10.anInt9653 > local149 || Static383.aClass345_10.anInt9653 < local154 || -Static383.aClass345_10.anInt9653 > local154) {
						Static511.aBoolean731 = true;
					}
				}
				if (Static383.aClass345_10.anObjectArray12 != null && Static511.aBoolean731) {
					local191 = new Class5_Sub22();
					local191.anInt3436 = local132;
					local191.aClass345_1 = Static383.aClass345_10;
					local191.anInt3430 = local120;
					local191.anObjectArray1 = Static383.aClass345_10.anObjectArray12;
					Static652.method8743(local191);
					return;
				}
			} else {
				if (Static511.aBoolean731) {
					Static424.method6285();
					if (Static383.aClass345_10.anObjectArray8 != null) {
						local191 = new Class5_Sub22();
						local191.aClass345_2 = Static262.aClass345_6;
						local191.anObjectArray1 = Static383.aClass345_10.anObjectArray8;
						local191.aClass345_1 = Static383.aClass345_10;
						local191.anInt3430 = local120;
						local191.anInt3436 = local132;
						Static652.method8743(local191);
					}
					if (Static262.aClass345_6 != null && Static84.method1817(Static383.aClass345_10) != null) {
						Static244.method4628(Static262.aClass345_6, Static383.aClass345_10);
					}
				} else if ((Static51.anInt734 == 1 || Static565.method7758()) && Static483.anInt8099 > 2) {
					Static262.method4100(Static582.anInt10820 + Static316.anInt5982, Static28.anInt392 + Static637.anInt10351);
				} else if (Static170.method2962()) {
					Static262.method4100(Static582.anInt10820 + Static316.anInt5982, Static637.anInt10351 - -Static28.anInt392);
				}
				Static383.aClass345_10 = null;
			}
		} else if (Static365.anInt6630 > 1) {
			Static383.aClass345_10 = null;
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!hd;Z)V")
	public static void method5081(@OriginalArg(0) Class28_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort124; local2 <= arg0.aShort122; local2++) {
			for (@Pc(6) int local6 = arg0.aShort121; local6 <= arg0.aShort123; local6++) {
				@Pc(16) Class226 local16 = Static635.aClass226ArrayArrayArray3[arg0.aByte145][local2][local6];
				if (local16 != null) {
					@Pc(21) Class41 local21 = local16.aClass41_3;
					@Pc(23) Class41 local23 = null;
					while (local21 != null) {
						if (local21.aClass28_Sub1_Sub4_1 == arg0) {
							if (local23 == null) {
								local16.aClass41_3 = local21.aClass41_2;
							} else {
								local23.aClass41_2 = local21.aClass41_2;
							}
							local21.method611();
							break;
						}
						local23 = local21;
						local21 = local21.aClass41_2;
					}
				}
			}
		}
		if (!arg1) {
			Static81.method1222(arg0);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!fi;IIIB)V")
	public static void method5082(@OriginalArg(0) Class5_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg0.aClass5_Sub41_Sub2_1.method7803(arg3);
		arg0.aClass5_Sub41_Sub2_1.method7814(arg1);
		arg0.aClass5_Sub41_Sub2_1.method7809(arg2);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
	public static void method5083() {
		Static474.aClass5_Sub41_Sub2_2.method7869();
		@Pc(13) int local13 = Static474.aClass5_Sub41_Sub2_2.method7871(8);
		@Pc(18) int local18;
		if (Static36.anInt607 > local13) {
			for (local18 = local13; local18 < Static36.anInt607; local18++) {
				Static618.anIntArray553[Static292.anInt5669++] = Static588.anIntArray533[local18];
			}
		}
		if (local13 > Static36.anInt607) {
			throw new RuntimeException("gnpov1");
		}
		Static36.anInt607 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(52) int local52 = Static588.anIntArray533[local18];
			@Pc(60) Class28_Sub1_Sub4_Sub2_Sub1 local60 = ((Class5_Sub25) Static56.aClass300_8.method7188((long) local52)).aClass28_Sub1_Sub4_Sub2_Sub1_1;
			@Pc(65) int local65 = Static474.aClass5_Sub41_Sub2_2.method7871(1);
			if (local65 == 0) {
				Static588.anIntArray533[Static36.anInt607++] = local52;
				local60.anInt5452 = Static518.anInt8627;
			} else {
				@Pc(88) int local88 = Static474.aClass5_Sub41_Sub2_2.method7871(2);
				if (local88 == 0) {
					Static588.anIntArray533[Static36.anInt607++] = local52;
					local60.anInt5452 = Static518.anInt8627;
					Static144.anIntArray129[Static256.anInt4715++] = local52;
				} else {
					@Pc(132) int local132;
					@Pc(144) int local144;
					if (local88 == 1) {
						Static588.anIntArray533[Static36.anInt607++] = local52;
						local60.anInt5452 = Static518.anInt8627;
						local132 = Static474.aClass5_Sub41_Sub2_2.method7871(3);
						local60.method3065(1, local132);
						local144 = Static474.aClass5_Sub41_Sub2_2.method7871(1);
						if (local144 == 1) {
							Static144.anIntArray129[Static256.anInt4715++] = local52;
						}
					} else if (local88 == 2) {
						Static588.anIntArray533[Static36.anInt607++] = local52;
						local60.anInt5452 = Static518.anInt8627;
						if (Static474.aClass5_Sub41_Sub2_2.method7871(1) == 1) {
							local132 = Static474.aClass5_Sub41_Sub2_2.method7871(3);
							local60.method3065(2, local132);
							local144 = Static474.aClass5_Sub41_Sub2_2.method7871(3);
							local60.method3065(2, local144);
						} else {
							local132 = Static474.aClass5_Sub41_Sub2_2.method7871(3);
							local60.method3065(0, local132);
						}
						local132 = Static474.aClass5_Sub41_Sub2_2.method7871(1);
						if (local132 == 1) {
							Static144.anIntArray129[Static256.anInt4715++] = local52;
						}
					} else if (local88 == 3) {
						Static618.anIntArray553[Static292.anInt5669++] = local52;
					}
				}
			}
		}
	}
}
