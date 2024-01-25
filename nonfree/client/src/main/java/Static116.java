import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "Lclient!hl;")
	public static Class4_Sub17 aClass4_Sub17_2;

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "Z")
	private static boolean aBoolean75;

	@OriginalMember(owner = "client!hh", name = "P", descriptor = "Z")
	private static boolean aBoolean76;

	@OriginalMember(owner = "client!hh", name = "Q", descriptor = "Z")
	private static boolean aBoolean77;

	@OriginalMember(owner = "client!hh", name = "R", descriptor = "Z")
	private static boolean aBoolean78;

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[200];

	@OriginalMember(owner = "client!hh", name = "C", descriptor = "Lclient!fd;")
	public static Class72 aClass72_3 = null;

	@OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
	public static int anInt1033 = 0;

	@OriginalMember(owner = "client!hh", name = "providesignlink", descriptor = "(Lclient!lh;)V")
	private static void method854(@OriginalArg(0) Class120 arg0) {
		Static212.aClass120_3 = arg0;
		Static81.aClass120_1 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILjava/awt/Color;ZLjava/awt/Color;ILjava/awt/Color;Ljava/lang/String;)V")
	public static void method859(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Color arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) String arg5) {
		try {
			@Pc(11) Graphics local11 = Static101.aCanvas8.getGraphics();
			if (Static109.aFont1 == null) {
				Static109.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2) {
				local11.setColor(Color.black);
				local11.fillRect(0, 0, Static202.anInt4258, Static38.anInt832);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			try {
				if (Static229.anImage2 == null) {
					Static229.anImage2 = Static101.aCanvas8.createImage(304, 34);
				}
				@Pc(68) Graphics local68 = Static229.anImage2.getGraphics();
				local68.setColor(arg1);
				local68.drawRect(0, 0, 303, 33);
				local68.setColor(arg4);
				local68.fillRect(2, 2, arg0 * 3, 30);
				local68.setColor(Color.black);
				local68.drawRect(1, 1, 301, 31);
				local68.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local68.setFont(Static109.aFont1);
				local68.setColor(arg3);
				local68.drawString(arg5, (304 - arg5.length() * 6) / 2, 22);
				local11.drawImage(Static229.anImage2, Static202.anInt4258 / 2 - 152, Static38.anInt832 / 2 + -18, null);
			} catch (@Pc(147) Exception local147) {
				@Pc(153) int local153 = Static202.anInt4258 / 2 - 152;
				@Pc(159) int local159 = Static38.anInt832 / 2 - 18;
				local11.setColor(arg1);
				local11.drawRect(0, 0, 303, 33);
				local11.setColor(arg4);
				local11.fillRect(local153 + 2, local159 + 2, arg0 * 3, 30);
				local11.setColor(Color.black);
				local11.drawRect(local153 + 1, local159 + 1, 301, 31);
				local11.fillRect(arg0 * 3 + local153 + 2, local159 - -2, 300 - arg0 * 3, 30);
				local11.setFont(Static109.aFont1);
				local11.setColor(arg3);
				local11.drawString(arg5, local153 + (304 - arg5.length() * 6) / 2, local159 + 22);
			}
			if (Static243.aString185 != null) {
				local11.setFont(Static109.aFont1);
				local11.setColor(arg3);
				local11.drawString(Static243.aString185, Static202.anInt4258 / 2 - Static243.aString185.length() * 6 / 2, Static38.anInt832 / 2 + -26);
			}
		} catch (@Pc(266) Exception local266) {
			Static101.aCanvas8.repaint();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([BI)Lclient!ml;")
	public static Class4_Sub1_Sub13 method860(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class4_Sub1_Sub13 local9 = new Class4_Sub1_Sub13();
		@Pc(14) Class4_Sub7 local14 = new Class4_Sub7(arg0);
		local14.anInt2667 = local14.aByteArray42.length - 2;
		@Pc(25) int local25 = local14.method2404();
		@Pc(36) int local36 = local14.aByteArray42.length - local25 - 2 - 12;
		local14.anInt2667 = local36;
		@Pc(45) int local45 = local14.method2389();
		local9.anInt4194 = local14.method2404();
		local9.anInt4192 = local14.method2404();
		local9.anInt4196 = local14.method2404();
		local9.anInt4193 = local14.method2404();
		@Pc(73) int local73 = local14.method2380();
		@Pc(84) int local84;
		@Pc(92) int local92;
		if (local73 > 0) {
			local9.aClass198Array1 = new Class198[local73];
			for (local84 = 0; local84 < local73; local84++) {
				local92 = local14.method2404();
				@Pc(99) Class198 local99 = new Class198(Static338.method4468(local92));
				local9.aClass198Array1[local84] = local99;
				while (local92-- > 0) {
					@Pc(110) int local110 = local14.method2389();
					@Pc(114) int local114 = local14.method2389();
					local99.method5267((long) local110, new Class4_Sub36(local114));
				}
			}
		}
		local14.anInt2667 = 0;
		local9.aString142 = local14.method2383();
		local9.aStringArray31 = new String[local45];
		local9.anIntArray357 = new int[local45];
		local9.anIntArray358 = new int[local45];
		local84 = 0;
		while (local14.anInt2667 < local36) {
			local92 = local14.method2404();
			if (local92 == 3) {
				local9.aStringArray31[local84] = local14.method2379().intern();
			} else if (local92 >= 100 || local92 == 21 || local92 == 38 || local92 == 39) {
				local9.anIntArray357[local84] = local14.method2380();
			} else {
				local9.anIntArray357[local84] = local14.method2389();
			}
			local9.anIntArray358[local84++] = local92;
		}
		return local9;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Lclient!wc;")
	public static Class4_Sub41 method870(@OriginalArg(1) int arg0) {
		return (Class4_Sub41) Static301.aClass198_34.method5261((long) arg0);
	}
}
