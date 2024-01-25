import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "Lclient!tq;")
	public static Class191 aClass191_119;

	@OriginalMember(owner = "client!ll", name = "v", descriptor = "Lclient!tq;")
	public static Class191 aClass191_120;

	@OriginalMember(owner = "client!ll", name = "w", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32;

	@OriginalMember(owner = "client!ll", name = "y", descriptor = "Lclient!ka;")
	public static Class2_Sub16 aClass2_Sub16_1;

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31 = null;

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_73 = new Class93("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
	public static int anInt3715 = 0;

	@OriginalMember(owner = "client!ll", name = "u", descriptor = "[I")
	public static final int[] anIntArray300 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!ll", name = "x", descriptor = "Lclient!sk;")
	public static final Class183 aClass183_1 = new Class183();

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!ae;I)V")
	public static void method3374(@OriginalArg(0) Class4 arg0) {
		if (Static182.anInt3603 != Static113.anInt2542 && (Static275.aClass8ArrayArrayArray4 != null && Static313.method5505(arg0, Static182.anInt3603))) {
			Static113.anInt2542 = Static182.anInt3603;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLclient!qr;)V")
	public static void method3375(@OriginalArg(1) Class62_Sub1_Sub2_Sub2 arg0) {
		if (Static117.anInt2590 >= 400 || Static41.aClass62_Sub1_Sub2_Sub2_2 == arg0) {
			return;
		}
		@Pc(147) String local147;
		@Pc(69) int local69;
		if (arg0.anInt5403 == 0) {
			@Pc(23) boolean local23 = true;
			if (Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5405 != -1 && arg0.anInt5405 != -1) {
				@Pc(48) int local48 = Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5387 > arg0.anInt5387 ? Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5387 : arg0.anInt5387;
				@Pc(59) int local59 = arg0.anInt5405 > Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5405 ? Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5405 : arg0.anInt5405;
				local69 = local59 + local48 * 10 / 100 + 5;
				@Pc(76) int local76 = Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5387 - arg0.anInt5387;
				if (local76 < 0) {
					local76 = -local76;
				}
				if (local69 < local76) {
					local23 = false;
				}
			}
			@Pc(104) String local104 = Static41.anInt830 == 1 ? Static276.aClass93_101.method2819(Static21.anInt455) : Static198.aClass93_77.method2819(Static21.anInt455);
			if (arg0.anInt5399 > arg0.anInt5387) {
				local147 = arg0.method4789() + (local23 ? Static81.method1819(Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5387, arg0.anInt5387) : "<col=ffffff>") + " (" + local104 + arg0.anInt5387 + "+" + (arg0.anInt5399 - arg0.anInt5387) + ")";
			} else {
				local147 = arg0.method4789() + (local23 ? Static81.method1819(Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5387, arg0.anInt5387) : "<col=ffffff>") + " (" + local104 + arg0.anInt5387 + ")";
			}
		} else {
			local147 = arg0.method4789() + " (" + Static120.aClass93_50.method2819(Static21.anInt455) + arg0.anInt5403 + ")";
		}
		if (!Static262.aBoolean479) {
			for (@Pc(207) int local207 = 7; local207 >= 0; local207--) {
				if (Static170.aStringArray26[local207] != null) {
					@Pc(215) short local215 = 0;
					if (Static41.anInt830 == 0 && Static170.aStringArray26[local207].equalsIgnoreCase(Static42.aClass93_12.method2819(Static21.anInt455))) {
						if (arg0.anInt5387 > Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5387) {
							local215 = 2000;
						}
						if (Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5381 != 0 && arg0.anInt5381 != 0) {
							if (arg0.anInt5381 == Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5381) {
								local215 = 2000;
							} else {
								local215 = 0;
							}
						}
					} else if (Static86.aBooleanArray9[local207]) {
						local215 = 2000;
					}
					@Pc(276) short local276 = (short) (local215 + Static205.aShortArray71[local207]);
					local69 = Static32.anIntArray41[local207] == -1 ? Static83.anInt1810 : Static32.anIntArray41[local207];
					Static53.method1208(0, "<col=ffffff>" + local147, local69, Static170.aStringArray26[local207], (long) arg0.anInt5328, 0, local276);
				}
			}
		} else if ((Static326.anInt6614 & 0x8) != 0) {
			Static53.method1208(0, Static149.aString25 + " -> <col=ffffff>" + local147, Static273.anInt5579, Static165.aString29, (long) arg0.anInt5328, 0, 44);
		}
		for (@Pc(355) Class2_Sub13 local355 = (Class2_Sub13) Static91.aClass216_22.method5992(); local355 != null; local355 = (Class2_Sub13) Static91.aClass216_22.method6000()) {
			if (local355.anInt1317 == 21) {
				local355.aString12 = "<col=ffffff>" + local147;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!ae;)V")
	public static void method3376(@OriginalArg(1) Class4 arg0) {
		if (Static343.aClass216_45.method6001() == 0) {
			return;
		}
		@Pc(25) Class2_Sub22 local25;
		if (Static129.anInt2728 == 0 || Static129.anInt2728 == 2) {
			for (local25 = (Class2_Sub22) Static343.aClass216_45.method5992(); local25 != null; local25 = (Class2_Sub22) Static343.aClass216_45.method6000()) {
				Static69.method1565(arg0, false, local25.anInt2808, false, Static299.aClass37_5, local25.aBoolean245 ? Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2 : null, local25.anInt2809, local25.anInt2814, local25.anInt2816, arg0, local25.anInt2817);
				local25.method5945();
			}
			Static253.method5944();
			return;
		}
		if (Static77.aClass4_6 == null) {
			@Pc(71) Canvas local71 = new Canvas();
			local71.setSize(36, 32);
			Static77.aClass4_6 = Static5.method4241(Static274.anInterface7_5, Static177.aClass168_2, 0, local71, 0);
			Static283.aClass37_6 = Static77.aClass4_6.method4305(Static154.method5669(Static2.anInt73, Static318.aClass191_204), Static361.method2367(Static59.aClass191_35, Static2.anInt73));
		}
		for (local25 = (Class2_Sub22) Static343.aClass216_45.method5992(); local25 != null; local25 = (Class2_Sub22) Static343.aClass216_45.method6000()) {
			Static69.method1565(Static77.aClass4_6, false, local25.anInt2808, false, Static283.aClass37_6, local25.aBoolean245 ? Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2 : null, local25.anInt2809, local25.anInt2814, local25.anInt2816, arg0, local25.anInt2817);
			local25.method5945();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
	public static void method3377(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static275.aClass8ArrayArrayArray4 = Static227.aClass8ArrayArrayArray3;
			Static301.aClass73Array31 = Static313.aClass73Array39;
		} else {
			Static275.aClass8ArrayArrayArray4 = Static163.aClass8ArrayArrayArray2;
			Static301.aClass73Array31 = Static265.aClass73Array44;
		}
		Static37.anInt696 = Static275.aClass8ArrayArrayArray4.length;
	}
}
