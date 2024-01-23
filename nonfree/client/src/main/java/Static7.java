import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
	public static int anInt136 = 0;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "[I")
	public static int[] anIntArray5 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "Lclient!ul;")
	public static Class172 aClass172_1 = new Class172(4);

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
	public static boolean method110(@OriginalArg(2) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(46) char local46 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(77) int local77;
			if (local46 >= '0' && local46 <= '9') {
				local77 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local77 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local77 = local46 - 'W';
			} else {
				return false;
			}
			if (local77 >= 10) {
				return false;
			}
			if (local26) {
				local77 = -local77;
			}
			@Pc(126) int local126 = local77 + local30 * 10;
			if (local30 != local126 / 10) {
				return false;
			}
			local30 = local126;
			local28 = true;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLclient!cg;)V")
	public static void method111(@OriginalArg(1) Class22 arg0) {
		Static4.aClass4_Sub2_Sub4_Sub2Array1 = Static73.method1225(arg0, Static282.anInt5537);
		Static89.aClass4_Sub2_Sub4Array4 = Static266.method4195(arg0, Static123.anInt2507);
		Static110.aClass4_Sub2_Sub4Array6 = Static266.method4195(arg0, Static244.anInt4817);
		Static276.aClass4_Sub2_Sub4Array10 = Static266.method4195(arg0, Static126.anInt2525);
		Static55.aClass4_Sub2_Sub4Array1 = Static266.method4195(arg0, Static4.anInt74);
		Static161.aClass4_Sub2_Sub4Array9 = Static266.method4195(arg0, Static141.anInt2798);
		Static111.aClass4_Sub2_Sub4Array7 = Static266.method4195(arg0, Static190.anInt3868);
		Static122.aClass4_Sub2_Sub4_5 = Static169.method2688(arg0, Static235.anInt4658);
		Static133.aClass4_Sub2_Sub4Array8 = Static74.method1256(Static115.anInt2333, arg0);
		Static71.aClass4_Sub2_Sub4Array2 = Static74.method1256(Static240.anInt2604, arg0);
		Static226.aClass58Array3 = Static189.method4539(arg0, Static102.anInt2017);
		Static303.aClass58Array5 = Static189.method4539(arg0, Static77.anInt1593);
		Static131.aClass4_Sub2_Sub9_2.method4107(Static303.aClass58Array5, null);
		Static156.aClass4_Sub2_Sub9_4.method4107(Static303.aClass58Array5, null);
		Static86.aClass4_Sub2_Sub9_3.method4107(Static303.aClass58Array5, null);
		if (Static251.aBoolean330) {
			Static249.aClass58_Sub2Array2 = Static184.method2970(Static185.anInt3674, arg0);
			for (@Pc(100) int local100 = 0; local100 < Static249.aClass58_Sub2Array2.length; local100++) {
				Static249.aClass58_Sub2Array2[local100].method3979();
			}
		}
		@Pc(121) Class4_Sub2_Sub4_Sub2 local121 = Static12.method234(arg0, Static12.anInt286, 0);
		local121.method4149();
		if (Static251.aBoolean330) {
			Static261.aClass4_Sub2_Sub4_10 = new Class4_Sub2_Sub4_Sub1(local121);
		} else {
			Static261.aClass4_Sub2_Sub4_10 = local121;
		}
		@Pc(140) Class4_Sub2_Sub4_Sub2[] local140 = Static73.method1225(arg0, Static205.anInt4052);
		@Pc(142) int local142;
		for (local142 = 0; local142 < local140.length; local142++) {
			local140[local142].method4149();
		}
		if (Static251.aBoolean330) {
			Static84.aClass4_Sub2_Sub4Array3 = new Class4_Sub2_Sub4[local140.length];
			for (local142 = 0; local142 < local140.length; local142++) {
				Static84.aClass4_Sub2_Sub4Array3[local142] = new Class4_Sub2_Sub4_Sub1(local140[local142]);
			}
		} else {
			Static84.aClass4_Sub2_Sub4Array3 = local140;
		}
		local142 = (int) (Math.random() * 21.0D) - 10;
		@Pc(201) int local201 = (int) (Math.random() * 21.0D) - 10;
		@Pc(208) int local208 = (int) (Math.random() * 21.0D) - 10;
		@Pc(215) int local215 = (int) (Math.random() * 41.0D) - 20;
		@Pc(217) int local217;
		for (local217 = 0; local217 < Static4.aClass4_Sub2_Sub4_Sub2Array1.length; local217++) {
			Static4.aClass4_Sub2_Sub4_Sub2Array1[local217].method4161(local215 + local142, local215 + local208, local201 + local215);
		}
		if (Static251.aBoolean330) {
			Static91.aClass4_Sub2_Sub4Array5 = new Class4_Sub2_Sub4[Static4.aClass4_Sub2_Sub4_Sub2Array1.length];
			for (local217 = 0; local217 < Static4.aClass4_Sub2_Sub4_Sub2Array1.length; local217++) {
				Static91.aClass4_Sub2_Sub4Array5[local217] = new Class4_Sub2_Sub4_Sub1(Static4.aClass4_Sub2_Sub4_Sub2Array1[local217]);
			}
		} else {
			Static91.aClass4_Sub2_Sub4Array5 = Static4.aClass4_Sub2_Sub4_Sub2Array1;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
	public static void method112() {
		Static84.aClass172_14.method4349(5);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method116(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static300.aMethod1;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(21) Throwable local21) {
			}
		}
		arg0.addKeyListener(Static232.aClass45_1);
		arg0.addFocusListener(Static232.aClass45_1);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIILjava/lang/String;Ljava/awt/Color;)V")
	public static void method117(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Color arg3) {
		try {
			@Pc(6) Graphics local6 = Static139.aCanvas1.getGraphics();
			if (Static219.aFont1 == null) {
				Static219.aFont1 = new Font("Helvetica", 1, 13);
				Static118.aFontMetrics1 = Static139.aCanvas1.getFontMetrics(Static219.aFont1);
			}
			if (arg0) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static189.anInt5672, Static292.anInt5674);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			try {
				if (Static91.anImage2 == null) {
					Static91.anImage2 = Static139.aCanvas1.createImage(304, 34);
				}
				@Pc(53) Graphics local53 = Static91.anImage2.getGraphics();
				local53.setColor(arg3);
				local53.drawRect(0, 0, 303, 33);
				local53.fillRect(2, 2, arg1 * 3, 30);
				local53.setColor(Color.black);
				local53.drawRect(1, 1, 301, 31);
				local53.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local53.setFont(Static219.aFont1);
				local53.setColor(Color.white);
				local53.drawString(arg2, (304 - Static118.aFontMetrics1.stringWidth(arg2)) / 2, 22);
				local6.drawImage(Static91.anImage2, Static189.anInt5672 / 2 - 152, Static292.anInt5674 / 2 - 18, null);
			} catch (@Pc(140) Exception local140) {
				@Pc(146) int local146 = Static189.anInt5672 / 2 - 152;
				@Pc(152) int local152 = Static292.anInt5674 / 2 - 18;
				local6.setColor(arg3);
				local6.drawRect(local146, local152, 303, 33);
				local6.fillRect(local146 + 2, local152 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local146 + 1, local152 + 1, 301, 31);
				local6.fillRect(arg1 * 3 + local146 + 2, local152 - -2, 300 - arg1 * 3, 30);
				local6.setFont(Static219.aFont1);
				local6.setColor(Color.white);
				local6.drawString(arg2, local146 + (304 - Static118.aFontMetrics1.stringWidth(arg2)) / 2, local152 + 22);
			}
			if (Static257.aString171 != null) {
				local6.setFont(Static219.aFont1);
				local6.setColor(Color.white);
				local6.drawString(Static257.aString171, Static189.anInt5672 / 2 - Static118.aFontMetrics1.stringWidth(Static257.aString171) / 2, Static292.anInt5674 / 2 + -26);
			}
		} catch (@Pc(255) Exception local255) {
			Static139.aCanvas1.repaint();
		}
	}
}
