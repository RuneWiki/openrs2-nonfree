import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_105 = new Class237(10, 8);

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
	public static int anInt6056 = 0;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V")
	public static void method4892() {
		if (Static421.aFrame2 != null) {
			return;
		}
		@Pc(17) Container local17;
		if (Static97.aFrame1 == null) {
			local17 = Static119.aClass138_7.anApplet1;
		} else {
			local17 = Static97.aFrame1;
		}
		Static288.anInt5035 = local17.getSize().width;
		Static119.anInt7598 = local17.getSize().height;
		@Pc(36) Insets local36;
		if (local17 == Static97.aFrame1) {
			local36 = Static97.aFrame1.getInsets();
			Static288.anInt5035 -= local36.left + local36.right;
			Static119.anInt7598 -= local36.bottom + local36.top;
		}
		if (Static131.method5612() == 1) {
			Static340.anInt5935 = 0;
			Static255.anInt4574 = Static8.anInt239;
			Static226.anInt4101 = (Static288.anInt5035 - Static256.anInt4583) / 2;
			Static207.anInt3842 = Static256.anInt4583;
		} else if (Static113.anInt5764 < 96 && Static285.anInt7839 == 0) {
			@Pc(84) int local84 = Static288.anInt5035 <= 1024 ? Static288.anInt5035 : 1024;
			Static207.anInt3842 = local84;
			Static226.anInt4101 = (Static288.anInt5035 - local84) / 2;
			@Pc(99) int local99 = Static119.anInt7598 > 768 ? 768 : Static119.anInt7598;
			Static255.anInt4574 = local99;
			Static340.anInt5935 = 0;
		} else {
			Static207.anInt3842 = Static288.anInt5035;
			Static226.anInt4101 = 0;
			Static340.anInt5935 = 0;
			Static255.anInt4574 = Static119.anInt7598;
		}
		if (Static234.aClass176_7 != Static221.aClass176_5) {
			@Pc(130) boolean local130;
			if (Static207.anInt3842 < 1024 && Static255.anInt4574 < 768) {
				local130 = true;
			} else {
				local130 = false;
			}
		}
		Static299.aCanvas5.setSize(Static207.anInt3842, Static255.anInt4574);
		if (Static276.aClass109_10 != null) {
			Static276.aClass109_10.method4731(Static299.aCanvas5);
		}
		if (Static97.aFrame1 == local17) {
			local36 = Static97.aFrame1.getInsets();
			Static299.aCanvas5.setLocation(Static226.anInt4101 + local36.left, local36.top - -Static340.anInt5935);
		} else {
			Static299.aCanvas5.setLocation(Static226.anInt4101, Static340.anInt5935);
		}
		if (Static273.anInt4878 != -1) {
			Static189.method2894(true);
		}
		Static191.method2911();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;ZLjava/awt/Color;IZ)V")
	public static void method4894(@OriginalArg(0) Color arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(2) Graphics local2 = Static299.aCanvas5.getGraphics();
			if (Static392.aFont2 == null) {
				Static392.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg5) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static207.anInt3842, Static255.anInt4574);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			try {
				if (Static274.anImage2 == null) {
					Static274.anImage2 = Static299.aCanvas5.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static274.anImage2.getGraphics();
				local59.setColor(arg0);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg1);
				local59.fillRect(2, 2, arg4 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg4 * 3 + 2, 2, 300 - arg4 * 3, 30);
				local59.setFont(Static392.aFont2);
				local59.setColor(arg3);
				local59.drawString(arg2, (304 - arg2.length() * 6) / 2, 22);
				local2.drawImage(Static274.anImage2, Static207.anInt3842 / 2 - 152, Static255.anInt4574 / 2 - 18, null);
			} catch (@Pc(144) Exception local144) {
				@Pc(150) int local150 = Static207.anInt3842 / 2 - 152;
				@Pc(156) int local156 = Static255.anInt4574 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg1);
				local2.fillRect(local150 + 2, local156 + 2, arg4 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local150 + 1, local156 + 1, 301, 31);
				local2.fillRect(local150 + arg4 * 3 + 2, local156 + 2, 300 - arg4 * 3, 30);
				local2.setFont(Static392.aFont2);
				local2.setColor(arg3);
				local2.drawString(arg2, local150 + (304 - arg2.length() * 6) / 2, local156 + 22);
			}
			if (Static365.aString43 != null) {
				local2.setFont(Static392.aFont2);
				local2.setColor(arg3);
				local2.drawString(Static365.aString43, Static207.anInt3842 / 2 - Static365.aString43.length() * 6 / 2, Static255.anInt4574 / 2 + -26);
			}
		} catch (@Pc(264) Exception local264) {
			Static299.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLclient!ss;)V")
	public static void method4895(@OriginalArg(1) Class219 arg0) {
		if (Static212.anInt453 == arg0.anInt6361) {
			Static22.aBooleanArray12[arg0.anInt6359] = true;
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V")
	public static void method4896() {
		Static373.method5118(Static389.aClass128_Sub1_1.aBoolean235);
		Static88.aClass1_Sub7_Sub3_1 = new Class1_Sub7_Sub3();
		Static88.aClass1_Sub7_Sub3_1.method5003();
		Static239.aClass110_2 = Static430.method5757(Static119.aClass138_7, Static299.aCanvas5, 0, 22050);
		Static239.aClass110_2.method4782(Static88.aClass1_Sub7_Sub3_1);
		Static334.method4673(Static234.aClass250_52, Static88.aClass1_Sub7_Sub3_1, Static235.aClass250_53, Static334.aClass250_66);
		Static220.aClass110_1 = Static430.method5757(Static119.aClass138_7, Static299.aCanvas5, 1, 2048);
		Static38.aClass1_Sub7_Sub1_1 = new Class1_Sub7_Sub1();
		Static220.aClass110_1.method4782(Static38.aClass1_Sub7_Sub1_1);
		Static205.aClass229_1 = new Class229(22050, Static78.anInt1548);
		Static174.anInt3176 = Static260.aClass250_56.method5652("scape main");
	}
}
