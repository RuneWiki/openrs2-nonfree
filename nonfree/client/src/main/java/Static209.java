import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!io", name = "L", descriptor = "Lclient!ti;")
	public static Class270 aClass270_1;

	@OriginalMember(owner = "client!io", name = "O", descriptor = "I")
	public static int anInt3769;

	@OriginalMember(owner = "client!io", name = "X", descriptor = "I")
	public static int anInt3778 = 0;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IB)V")
	public static void method3331(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub13_Sub15 local14 = Static370.method5893(arg0, 5);
		local14.method6974();
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
	public static void method3332() {
		Static117.aClass286_4.method7230();
		Static16.aClass16_3.method571();
		Static289.aClass125_1.method3176();
		Static505.aClass206_4.method5325();
		Static21.aClass255_2.method6581();
		Static464.aClass115_1.method2979();
		Static396.aClass157_2.method3746();
		Static305.aClass14_1.method559();
		Static79.aClass80_1.method2322();
		Static266.aClass230_1.method6000();
		Static492.aClass218_1.method5791();
		Static537.aClass112_4.method2956();
		Static387.aClass56_4.method1681();
		Static221.aClass225_1.method5911();
		Static66.aClass247_1.method6474();
		Static222.aClass299_2.method7465();
		Static171.aClass131_1.method3294();
		Static129.aClass100_1.method2656();
		Static70.aClass61_1.method1759();
		Static172.aClass211_2.method5367();
		Static53.method966();
		Static308.method4796();
		Static114.method2235();
		if (Static414.aClass320_17 != Static455.aClass320_15) {
			for (@Pc(84) int local84 = 0; local84 < Static24.aByteArrayArray1.length; local84++) {
				Static24.aByteArrayArray1[local84] = null;
			}
			Static279.anInt5136 = 0;
		}
		Static288.method5996();
		Static443.method6745();
		Static108.method2072();
		Static340.method5359();
		Static391.method6265();
		Static258.aClass231_44.method6240();
		Static103.aClass39_3.method6023();
		Static196.aClass65_3.method1920();
		Static449.method6867();
		Static498.aClass53_140.method1618();
		Static71.aClass53_21.method1618();
		Static163.aClass53_50.method1618();
		Static168.aClass53_52.method1618();
		Static383.aClass53_109.method1618();
		Static360.aClass53_151.method1618();
		Static463.aClass53_134.method1618();
		Static248.aClass53_78.method1618();
		Static460.aClass53_147.method1618();
		Static147.aClass53_47.method1618();
		Static244.aClass53_76.method1618();
		Static447.aClass53_125.method1618();
		Static458.aClass53_131.method1618();
		Static36.aClass53_10.method1618();
		Static442.aClass53_122.method1618();
		Static391.aClass53_113.method1618();
		Static478.aClass53_137.method1618();
		Static36.aClass53_9.method1618();
		Static358.aClass53_101.method1618();
		Static62.aClass53_20.method1618();
		Static501.aClass53_141.method1618();
		Static103.aClass53_32.method1618();
		Static398.aClass53_116.method1618();
		Static420.aClass53_119.method1618();
		Static43.aClass53_15.method1618();
		Static530.aClass53_150.method1618();
		Static425.aClass53_105.method1618();
		Static459.aClass53_132.method1618();
		Static7.aClass53_124.method1618();
		Static505.aClass53_143.method1618();
		Static85.aClass53_25.method1618();
		Static19.aClass53_4.method1618();
		Static30.aClass231_8.method6240();
		Static202.aClass231_37.method6240();
		Static253.aClass231_43.method6240();
		Static392.aClass231_57.method6240();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BZ)V")
	public static void method3334(@OriginalArg(1) boolean arg0) {
		Static491.method6549();
		if (!Static522.method7564(Static271.anInt8654)) {
			return;
		}
		Static409.anInt7642++;
		if (Static409.anInt7642 < 50 && !arg0) {
			return;
		}
		Static409.anInt7642 = 0;
		if (!Static158.aBoolean237 && Static497.aClass173_2 != null) {
			Static93.method1721(Static158.aClass243_38);
			try {
				Static497.aClass173_2.method7257(Static381.aClass2_Sub29_Sub2_2.aByteArray96, Static381.aClass2_Sub29_Sub2_2.anInt6132);
				Static381.aClass2_Sub29_Sub2_2.anInt6132 = 0;
			} catch (@Pc(51) IOException local51) {
				Static158.aBoolean237 = true;
			}
		}
		Static491.method6549();
	}

	@OriginalMember(owner = "client!io", name = "g", descriptor = "(I)V")
	public static void method3335() {
		for (@Pc(10) Class2_Sub13_Sub10 local10 = (Class2_Sub13_Sub10) Static316.aClass249_33.method6527(); local10 != null; local10 = (Class2_Sub13_Sub10) Static316.aClass249_33.method6525()) {
			@Pc(23) Class1_Sub1_Sub4 local23 = local10.aClass1_Sub1_Sub4_1;
			if (Static115.anInt2326 > local23.anInt4136) {
				local10.method7802();
				local23.method3609();
			} else if (local23.anInt4122 <= Static115.anInt2326) {
				if (local23.anInt4144 > 0) {
					@Pc(44) Class2_Sub11 local44 = (Class2_Sub11) Static71.aClass127_13.method3205((long) (local23.anInt4144 - 1));
					if (local44 != null) {
						@Pc(49) Class1_Sub1_Sub2_Sub2 local49 = local44.aClass1_Sub1_Sub2_Sub2_1;
						if (local49.anInt7660 >= 0 && local49.anInt7660 < Static363.anInt1158 * 128 && local49.anInt7659 >= 0 && Static511.anInt8889 * 128 > local49.anInt7659) {
							local23.method3610(local49.anInt7660, local49.anInt7659, Static200.method3233(local23.aByte90, local49.anInt7660, local49.anInt7659) - local23.anInt4127, Static115.anInt2326);
						}
					}
				}
				if (local23.anInt4144 < 0) {
					@Pc(105) int local105 = -local23.anInt4144 - 1;
					@Pc(116) Class1_Sub1_Sub2_Sub1 local116;
					if (Static174.anInt3154 == local105) {
						local116 = Static266.aClass1_Sub1_Sub2_Sub1_1;
					} else {
						local116 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local105];
					}
					if (local116 != null && local116.anInt7660 >= 0 && local116.anInt7660 < Static363.anInt1158 * 128 && local116.anInt7659 >= 0 && local116.anInt7659 < Static511.anInt8889 * 128) {
						local23.method3610(local116.anInt7660, local116.anInt7659, Static200.method3233(local23.aByte90, local116.anInt7660, local116.anInt7659) - local23.anInt4127, Static115.anInt2326);
					}
				}
				local23.method3606(Static436.anInt7972);
				Static58.method1076(local23, true);
			}
		}
	}
}
