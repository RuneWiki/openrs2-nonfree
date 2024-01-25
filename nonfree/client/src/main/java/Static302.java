import java.awt.Container;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!tg", name = "V", descriptor = "Lclient!tq;")
	public static Class191 aClass191_190;

	@OriginalMember(owner = "client!tg", name = "W", descriptor = "Lclient!tq;")
	public static Class191 aClass191_191;

	@OriginalMember(owner = "client!tg", name = "X", descriptor = "Lclient!ts;")
	public static Class193 aClass193_7;

	@OriginalMember(owner = "client!tg", name = "S", descriptor = "[Lclient!di;")
	public static final Class2_Sub11_Sub1[] aClass2_Sub11_Sub1Array2 = new Class2_Sub11_Sub1[14];

	@OriginalMember(owner = "client!tg", name = "T", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
	public static int anInt6072 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIZI)V")
	public static void method5306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg3) {
			Static65.method1486();
		}
		if (Static335.aFrame1 != null && (arg1 != 3 || arg2 != Static234.anInt4499 || Static228.anInt934 != arg0)) {
			Static139.method2759(Static335.aFrame1, Static177.aClass168_2);
			Static335.aFrame1 = null;
		}
		if (arg1 == 3 && Static335.aFrame1 == null) {
			Static335.aFrame1 = Static131.method2634(arg2, arg0, 0, Static177.aClass168_2);
			if (Static335.aFrame1 != null) {
				Static228.anInt934 = arg0;
				Static234.anInt4499 = arg2;
				Static106.method2337(Static177.aClass168_2);
			}
		}
		if (arg1 == 3 && Static335.aFrame1 == null) {
			method5306(-1, Static6.anInt150, -1, true, arg4);
			return;
		}
		@Pc(82) Container local82;
		@Pc(89) Insets local89;
		if (Static335.aFrame1 != null) {
			Static33.anInt591 = arg2;
			Static1.anInt16 = arg0;
			local82 = Static335.aFrame1;
		} else if (Static348.aFrame2 == null) {
			local82 = Static177.aClass168_2.anApplet1;
			Static33.anInt591 = local82.getSize().width;
			Static1.anInt16 = local82.getSize().height;
		} else {
			local89 = Static348.aFrame2.getInsets();
			Static33.anInt591 = Static348.aFrame2.getSize().width - local89.right - local89.left;
			Static1.anInt16 = Static348.aFrame2.getSize().height - local89.top - local89.bottom;
			local82 = Static348.aFrame2;
		}
		@Pc(158) int local158;
		if (arg1 == 1) {
			Static168.anInt3423 = 0;
			Static198.anInt3876 = 503;
			Static136.anInt2829 = 765;
			Static197.anInt3869 = (Static33.anInt591 - 765) / 2;
		} else if (Static339.anInt6736 < 96 && Static129.anInt2728 == 0) {
			local158 = Static33.anInt591 > 1024 ? 1024 : Static33.anInt591;
			@Pc(167) int local167 = Static1.anInt16 <= 768 ? Static1.anInt16 : 768;
			Static197.anInt3869 = (Static33.anInt591 - local158) / 2;
			Static136.anInt2829 = local158;
			Static198.anInt3876 = local167;
			Static168.anInt3423 = 0;
		} else {
			Static168.anInt3423 = 0;
			Static136.anInt2829 = Static33.anInt591;
			Static198.anInt3876 = Static1.anInt16;
			Static197.anInt3869 = 0;
		}
		if (Static183.anInt3622 != 0) {
			@Pc(204) boolean local204;
			if (Static136.anInt2829 < 1024 && Static198.anInt3876 < 768) {
				local204 = true;
			} else {
				local204 = false;
			}
		}
		if (arg3) {
			Static291.method5166(Static129.anInt2728);
		} else {
			Static240.aCanvas4.setSize(Static136.anInt2829, Static198.anInt3876);
			if (Static147.aClass4_2 != null) {
				Static147.aClass4_2.method4208();
			}
			if (local82 == Static348.aFrame2) {
				local89 = Static348.aFrame2.getInsets();
				Static240.aCanvas4.setLocation(local89.left + Static197.anInt3869, local89.top + Static168.anInt3423);
			} else {
				Static240.aCanvas4.setLocation(Static197.anInt3869, Static168.anInt3423);
			}
		}
		if (arg1 >= 2) {
			Static58.aBoolean117 = true;
		} else {
			Static58.aBoolean117 = false;
		}
		if (Static111.anInt2471 != -1) {
			Static121.method2514(true);
		}
		if (Static157.aClass173_1 != null && (Static263.anInt5396 == 30 || Static263.anInt5396 == 25)) {
			Static286.method5122();
		}
		for (local158 = 0; local158 < 100; local158++) {
			Static200.aBooleanArray29[local158] = true;
		}
		Static157.aBoolean286 = true;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIBI)V")
	public static void method5307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(40) String local40 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local40);
		Static24.method736(local40, true);
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)V")
	public static void method5308() {
		Static269.aClass2_Sub10_Sub1_3.method2056();
		@Pc(11) int local11 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static269.aClass2_Sub10_Sub1_3.method2052(2);
		if (local22 == 0) {
			Static102.anIntArray217[Static95.anInt6378++] = 2047;
			return;
		}
		@Pc(46) int local46;
		@Pc(56) int local56;
		if (local22 == 1) {
			local46 = Static269.aClass2_Sub10_Sub1_3.method2052(3);
			Static41.aClass62_Sub1_Sub2_Sub2_2.method4788(local46, 1);
			local56 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
			if (local56 == 1) {
				Static102.anIntArray217[Static95.anInt6378++] = 2047;
			}
		} else if (local22 == 2) {
			if (Static269.aClass2_Sub10_Sub1_3.method2052(1) == 1) {
				local46 = Static269.aClass2_Sub10_Sub1_3.method2052(3);
				Static41.aClass62_Sub1_Sub2_Sub2_2.method4788(local46, 2);
				local56 = Static269.aClass2_Sub10_Sub1_3.method2052(3);
				Static41.aClass62_Sub1_Sub2_Sub2_2.method4788(local56, 2);
			} else {
				local46 = Static269.aClass2_Sub10_Sub1_3.method2052(3);
				Static41.aClass62_Sub1_Sub2_Sub2_2.method4788(local46, 0);
			}
			local46 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
			if (local46 == 1) {
				Static102.anIntArray217[Static95.anInt6378++] = 2047;
			}
		} else if (local22 == 3) {
			Static182.anInt3603 = Static269.aClass2_Sub10_Sub1_3.method2052(2);
			local46 = Static269.aClass2_Sub10_Sub1_3.method2052(7);
			local56 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
			@Pc(169) int local169 = Static269.aClass2_Sub10_Sub1_3.method2052(7);
			@Pc(174) int local174 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
			if (local174 == 1) {
				Static102.anIntArray217[Static95.anInt6378++] = 2047;
			}
			Static41.aClass62_Sub1_Sub2_Sub2_2.method4792(Static182.anInt3603, local169, local56 == 1, local46);
		}
	}
}
