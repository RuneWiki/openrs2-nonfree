import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!wh", name = "W", descriptor = "Z")
	public static boolean aBoolean505;

	@OriginalMember(owner = "client!wh", name = "Y", descriptor = "[I")
	public static int[] anIntArray507;

	@OriginalMember(owner = "client!wh", name = "Z", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
	public static int anInt6875 = 2;

	@OriginalMember(owner = "client!wh", name = "O", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_176 = new Class21(8);

	@OriginalMember(owner = "client!wh", name = "V", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_212 = new Class217(84, 12);

	@OriginalMember(owner = "client!wh", name = "X", descriptor = "Z")
	public static boolean aBoolean506 = false;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([I[Ljava/lang/Object;III)V")
	public static void method5940(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg3 + arg2) / 2;
		@Pc(21) int local21 = arg2;
		@Pc(25) int local25 = arg0[local19];
		arg0[local19] = arg0[arg3];
		arg0[arg3] = local25;
		@Pc(39) Object local39 = arg1[local19];
		arg1[local19] = arg1[arg3];
		arg1[arg3] = local39;
		for (@Pc(51) int local51 = arg2; local51 < arg3; local51++) {
			if (arg0[local51] < local25 + (local51 & 0x1)) {
				@Pc(67) int local67 = arg0[local51];
				arg0[local51] = arg0[local21];
				arg0[local21] = local67;
				@Pc(81) Object local81 = arg1[local51];
				arg1[local51] = arg1[local21];
				arg1[local21++] = local81;
			}
		}
		arg0[arg3] = arg0[local21];
		arg0[local21] = local25;
		arg1[arg3] = arg1[local21];
		arg1[local21] = local39;
		method5940(arg0, arg1, arg2, local21 - 1);
		method5940(arg0, arg1, local21 + 1, arg3);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	public static void method5942() {
		if (Static111.anInt2479 == 2) {
			Static268.anInt5269 = 96;
			return;
		}
		try {
			@Pc(17) Method local17 = Runtime.class.getMethod("maxMemory");
			if (local17 != null) {
				try {
					@Pc(21) Runtime local21 = Runtime.getRuntime();
					@Pc(27) Long local27 = (Long) local17.invoke(local21, (Object[]) null);
					Static268.anInt5269 = (int) (local27 / 1048576L) + 1;
				} catch (@Pc(37) Throwable local37) {
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIII)V")
	public static void method5943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg0 + 1;
		Static367.method6081(arg1, arg4, Static43.anIntArrayArray57[arg0], arg3);
		@Pc(20) int local20 = arg2 - 1;
		Static367.method6081(arg1, arg4, Static43.anIntArrayArray57[arg2], arg3);
		for (@Pc(30) int local30 = local7; local30 <= local20; local30++) {
			@Pc(36) int[] local36 = Static43.anIntArrayArray57[local30];
			local36[arg4] = local36[arg3] = arg1;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIII)V")
	public static void method5944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static244.anInt4998 = arg3;
		Static264.anInt5207 = arg1;
		Static281.anInt5477 = arg5;
		Static207.anInt4089 = arg0;
		Static270.anInt5275 = arg2;
		Static29.anInt673 = arg4;
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
	public static void method5945() {
		Static323.anInt4857 = Static64.aClass80_17.anInt2611 + Static64.aClass80_17.anInt2625 + 2;
		Static129.anInt2809 = Static91.aClass80_20.anInt2625 + Static91.aClass80_20.anInt2611 + 2;
		Static282.aStringArray33 = new String[500];
		for (@Pc(31) int local31 = 0; local31 < Static282.aStringArray33.length; local31++) {
			Static282.aStringArray33[local31] = "";
		}
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
	public static void method5946() {
		for (@Pc(15) Class1_Sub20 local15 = (Class1_Sub20) Static75.aClass42_19.method1543(); local15 != null; local15 = (Class1_Sub20) Static75.aClass42_19.method1551()) {
			if (local15.anInt2713 == -1) {
				local15.anInt2706 = 0;
				Static55.method1351(local15);
			} else {
				local15.method6045();
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;IZ)V")
	public static void method5947(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(2) Graphics local2 = Static174.aCanvas3.getGraphics();
			if (Static288.aFont1 == null) {
				Static288.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg5) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static213.anInt4274, Static130.anInt2825);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			try {
				if (Static87.anImage1 == null) {
					Static87.anImage1 = Static174.aCanvas3.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static87.anImage1.getGraphics();
				local59.setColor(arg2);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg3);
				local59.fillRect(2, 2, arg0 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local59.setFont(Static288.aFont1);
				local59.setColor(arg4);
				local59.drawString(arg1, (304 - arg1.length() * 6) / 2, 22);
				local2.drawImage(Static87.anImage1, Static213.anInt4274 / 2 - 152, Static130.anInt2825 / 2 + -18, null);
			} catch (@Pc(138) Exception local138) {
				@Pc(144) int local144 = Static213.anInt4274 / 2 - 152;
				@Pc(150) int local150 = Static130.anInt2825 / 2 - 18;
				local2.setColor(arg2);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg3);
				local2.fillRect(local144 + 2, local150 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local144 + 1, local150 + 1, 301, 31);
				local2.fillRect(arg0 * 3 + local144 + 2, local150 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Static288.aFont1);
				local2.setColor(arg4);
				local2.drawString(arg1, (304 - arg1.length() * 6) / 2 + local144, local150 + 22);
			}
			if (Static101.aString9 != null) {
				local2.setFont(Static288.aFont1);
				local2.setColor(arg4);
				local2.drawString(Static101.aString9, Static213.anInt4274 / 2 - Static101.aString9.length() * 6 / 2, Static130.anInt2825 / 2 + -26);
			}
		} catch (@Pc(258) Exception local258) {
			Static174.aCanvas3.repaint();
		}
	}
}
