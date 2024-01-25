import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!mca", name = "q", descriptor = "I")
	public static int anInt6582;

	@OriginalMember(owner = "client!mca", name = "A", descriptor = "[Lclient!jd;")
	public static Class20[] aClass20Array8;

	@OriginalMember(owner = "client!mca", name = "l", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_90 = new Class100(20, 8);

	@OriginalMember(owner = "client!mca", name = "o", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_114 = new Class44(91, 2);

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "(I)V")
	public static void method5405() {
		if (Static628.aFrame3 != null) {
			return;
		}
		@Pc(10) int local10 = Static535.anInt9235;
		@Pc(12) int local12 = Static406.anInt7435;
		@Pc(20) int local20 = Static69.anInt1570 - local10 - Static561.anInt9759;
		@Pc(28) int local28 = Static572.anInt9840 - local12 - Static639.anInt10685;
		if (local10 <= 0 && local20 <= 0 && local12 <= 0 && local28 <= 0) {
			return;
		}
		try {
			@Pc(43) Container local43;
			if (Static339.aFrame2 != null) {
				local43 = Static339.aFrame2;
			} else if (Static645.anApplet2 == null) {
				local43 = Static164.anApplet_Sub1_1;
			} else {
				local43 = Static645.anApplet2;
			}
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			if (Static339.aFrame2 == local43) {
				@Pc(61) Insets local61 = Static339.aFrame2.getInsets();
				local55 = local61.top;
				local53 = local61.left;
			}
			@Pc(70) Graphics local70 = local43.getGraphics();
			local70.setColor(Color.black);
			if (local10 > 0) {
				local70.fillRect(local53, local55, local10, Static572.anInt9840);
			}
			if (local12 > 0) {
				local70.fillRect(local53, local55, Static69.anInt1570, local12);
			}
			if (local20 > 0) {
				local70.fillRect(Static69.anInt1570 + local53 - local20, local55, local20, Static572.anInt9840);
			}
			if (local28 > 0) {
				local70.fillRect(local53, local55 + Static572.anInt9840 - local28, Static69.anInt1570, local28);
				return;
			}
		} catch (@Pc(122) Exception local122) {
			return;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIIZI)V")
	public static void method5407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static453.anInt7941 != 1) {
			return;
		}
		@Pc(13) int local13 = arg0 / Static465.anInt8179;
		@Pc(17) int local17 = arg3 / Static465.anInt8179;
		@Pc(21) int local21 = arg1 / Static309.anInt1943;
		@Pc(25) int local25 = arg2 / Static309.anInt1943;
		if (Static347.anInt6424 <= local13 || local17 < 0 || local21 >= Static174.anInt10833 || local25 < 0) {
			return;
		}
		if (local21 < 0) {
			local21 = 0;
		}
		if (Static347.anInt6424 <= local17) {
			local17 = Static347.anInt6424 - 1;
		}
		if (local13 < 0) {
			local13 = 0;
		}
		if (local25 >= Static174.anInt10833) {
			local25 = Static174.anInt10833 - 1;
		}
		for (@Pc(85) int local85 = local21; local85 <= local25; local85++) {
			@Pc(98) int local98 = Static677.method9301(Static374.anInt6857 + local85, Static174.anInt10833) * Static347.anInt6424;
			for (@Pc(100) int local100 = local13; local100 <= local17; local100++) {
				@Pc(112) int local112 = local98 + Static677.method9301(local100 + Static537.anInt9245, Static347.anInt6424);
				Static362.anIntArray486[local112] = Static610.anInt10303;
			}
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)V")
	public static void method5408(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static486.aClass58ArrayArrayArray2 = Static646.aClass58ArrayArrayArray3;
			Static576.aClass51Array3 = Static473.aClass51Array2;
		} else {
			Static486.aClass58ArrayArrayArray2 = Static33.aClass58ArrayArrayArray1;
			Static576.aClass51Array3 = Static343.aClass51Array1;
		}
		Static613.anInt10338 = Static486.aClass58ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILjava/awt/Canvas;ILclient!d;I)Lclient!ha;")
	public static Class137 method5409(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) int arg3) {
		return new Class137_Sub2(arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)I")
	public static int method5410(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) byte local19;
		if (arg1 > 20000) {
			Static501.method7348();
			local19 = 4;
		} else if (arg1 > 10000) {
			Static424.method6264();
			local19 = 3;
		} else if (arg1 > 5000) {
			local19 = 2;
			Static597.method8448();
		} else {
			local19 = 1;
			Static126.method2100();
		}
		if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() != arg0) {
			Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub21_1, arg0);
			Static155.method2506(arg0, false);
		}
		Static169.method2762();
		return local19;
	}
}
