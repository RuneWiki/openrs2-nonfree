import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!ug", name = "Q", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!ug", name = "R", descriptor = "[[Lclient!rg;")
	public static Class177[][] aClass177ArrayArray1;

	@OriginalMember(owner = "client!ug", name = "S", descriptor = "[S")
	public static short[] aShortArray95;

	@OriginalMember(owner = "client!ug", name = "H", descriptor = "[I")
	public static final int[] anIntArray757 = new int[50];

	@OriginalMember(owner = "client!ug", name = "J", descriptor = "[I")
	public static final int[] anIntArray758 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "[I")
	public static int[] anIntArray759 = new int[2];

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZLjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;I)V")
	public static void method5304(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) String arg4, @OriginalArg(5) Color arg5) {
		try {
			@Pc(2) Graphics local2 = Static261.aCanvas4.getGraphics();
			if (Static309.aFont1 == null) {
				Static309.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg1) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static11.anInt5389, Static320.anInt6140);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			try {
				if (anImage3 == null) {
					anImage3 = Static261.aCanvas4.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = anImage3.getGraphics();
				local59.setColor(arg5);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg2);
				local59.fillRect(2, 2, arg0 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local59.setFont(Static309.aFont1);
				local59.setColor(arg3);
				local59.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
				local2.drawImage(anImage3, Static11.anInt5389 / 2 - 152, Static320.anInt6140 / 2 + -18, null);
			} catch (@Pc(138) Exception local138) {
				@Pc(144) int local144 = Static11.anInt5389 / 2 - 152;
				@Pc(150) int local150 = Static320.anInt6140 / 2 - 18;
				local2.setColor(arg5);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local144 + 2, local150 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local144 + 1, local150 + 1, 301, 31);
				local2.fillRect(local144 + arg0 * 3 + 2, local150 - -2, 300 - arg0 * 3, 30);
				local2.setFont(Static309.aFont1);
				local2.setColor(arg3);
				local2.drawString(arg4, (304 - arg4.length() * 6) / 2 + local144, local150 + 22);
			}
			if (Static240.aString186 != null) {
				local2.setFont(Static309.aFont1);
				local2.setColor(arg3);
				local2.drawString(Static240.aString186, Static11.anInt5389 / 2 - Static240.aString186.length() * 6 / 2, Static320.anInt6140 / 2 + -26);
			}
		} catch (@Pc(257) Exception local257) {
			Static261.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)V")
	public static void method5305(@OriginalArg(1) int arg0) {
		Static198.method3737();
		Static95.method1783();
		@Pc(16) int local16 = Static143.method2719(arg0).anInt1417;
		if (local16 == 0) {
			return;
		}
		@Pc(26) int local26 = Static197.anIntArray793[arg0];
		if (local16 == 5) {
			Static77.anInt1554 = local26;
		}
		if (local16 == 9) {
			Static120.anInt2345 = local26;
		}
		if (local16 == 6) {
			Static186.anInt3870 = local26;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
	public static void method5306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static42.method1000(10, arg2);
		local8.method168();
		local8.anInt75 = arg0;
		local8.anInt85 = arg1;
		local8.anInt81 = arg3;
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
	public static void method5308() {
		Static56.aClass140_33.method3819();
		Static113.aClass140_64.method3819();
	}
}
