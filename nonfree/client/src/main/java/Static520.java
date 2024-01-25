import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	public static int anInt10609 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIZII)V")
	public static void method8287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static514.aFrame2 != null && (arg1 != 3 || arg4 != Static455.aClass4_Sub35_Sub1_1.anInt9919 || Static455.aClass4_Sub35_Sub1_1.anInt9912 != arg0)) {
			Static385.method5958(Static372.aClass366_5, Static514.aFrame2);
			Static514.aFrame2 = null;
		}
		if (arg1 == 3 && Static514.aFrame2 == null) {
			Static514.aFrame2 = Static568.method8015(arg0, Static372.aClass366_5, 0, arg4);
			if (Static514.aFrame2 != null) {
				Static455.aClass4_Sub35_Sub1_1.anInt9919 = arg4;
				Static455.aClass4_Sub35_Sub1_1.anInt9912 = arg0;
				Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
			}
		}
		if (arg1 == 3 && Static514.aFrame2 == null) {
			method8287(-1, Static455.aClass4_Sub35_Sub1_1.anInt9917, true, arg3, -1);
			return;
		}
		@Pc(75) Container local75;
		@Pc(82) Insets local82;
		if (Static514.aFrame2 != null) {
			Static507.anInt9504 = arg0;
			Static308.anInt6203 = arg4;
			local75 = Static514.aFrame2;
		} else if (Static402.aFrame3 == null) {
			if (Static589.anApplet2 == null) {
				local75 = Static220.anApplet_Sub1_2;
			} else {
				local75 = Static589.anApplet2;
			}
			Static308.anInt6203 = local75.getSize().width;
			Static507.anInt9504 = local75.getSize().height;
		} else {
			local82 = Static402.aFrame3.getInsets();
			@Pc(88) int local88 = -local82.right;
			Static308.anInt6203 = Static402.aFrame3.getSize().width + local88 - local82.left;
			Static507.anInt9504 = Static402.aFrame3.getSize().height - local82.top - local82.bottom;
			local75 = Static402.aFrame3;
		}
		if (arg1 == 1) {
			Static123.anInt9150 = Static370.anInt7124;
			Static347.anInt6686 = 0;
			Static71.anInt1872 = Static324.anInt6378;
			Static7.anInt723 = (Static308.anInt6203 - Static370.anInt7124) / 2;
		} else {
			Static319.method4996();
		}
		if (Static383.aClass326_7 != Static342.aClass326_6) {
			@Pc(161) boolean local161;
			if (Static123.anInt9150 < 1024 && Static71.anInt1872 < 768) {
				local161 = true;
			} else {
				local161 = false;
			}
		}
		if (arg2) {
			Static23.method887();
		} else {
			Static201.aCanvas7.setSize(Static123.anInt9150, Static71.anInt1872);
			Static39.aClass7_2.method7840(Static201.aCanvas7);
			if (local75 == Static402.aFrame3) {
				local82 = Static402.aFrame3.getInsets();
				Static201.aCanvas7.setLocation(Static7.anInt723 + local82.left, local82.top + Static347.anInt6686);
			} else {
				Static201.aCanvas7.setLocation(Static7.anInt723, Static347.anInt6686);
			}
		}
		if (arg1 >= 2) {
			Static325.aBoolean437 = true;
		} else {
			Static325.aBoolean437 = false;
		}
		if (Static446.anInt8493 != -1) {
			Static284.method4495(true);
		}
		if (Static528.aClass36_2 != null && Static429.method6381(Static9.anInt758)) {
			Static275.method4452();
		}
		for (@Pc(227) int local227 = 0; local227 < 100; local227++) {
			Static155.aBooleanArray6[local227] = true;
		}
		Static179.aBoolean276 = true;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI[I[I)V")
	public static void method8288(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg0; local55 < arg1; local55++) {
			if (arg3[local55] < (local53 & local55) + local20) {
				@Pc(74) int local74 = arg3[local55];
				arg3[local55] = arg3[local16];
				arg3[local16] = local74;
				@Pc(88) int local88 = arg2[local55];
				arg2[local55] = arg2[local16];
				arg2[local16++] = local88;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg2[arg1] = arg2[local16];
		arg2[local16] = local34;
		method8288(arg0, local16 - 1, arg2, arg3);
		method8288(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!el;)I")
	public static int method8289(@OriginalArg(1) Class95 arg0) {
		if (arg0 == Static563.aClass95_5) {
			return 7681;
		} else if (arg0 == Static468.aClass95_3) {
			return 8448;
		} else if (Static509.aClass95_4 == arg0) {
			return 34165;
		} else if (arg0 == Static371.aClass95_1) {
			return 260;
		} else if (Static433.aClass95_2 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;ILjava/lang/String;)V")
	public static void method8290(@OriginalArg(0) Color arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(2) Graphics local2 = Static201.aCanvas7.getGraphics();
			if (Static350.aFont4 == null) {
				Static350.aFont4 = new Font("Helvetica", 1, 13);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			@Pc(63) int local63;
			try {
				if (Static279.anImage13 == null) {
					Static279.anImage13 = Static201.aCanvas7.createImage(Static123.anInt9150, Static71.anInt1872);
				}
				@Pc(48) Graphics local48 = Static279.anImage13.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static123.anInt9150, Static71.anInt1872);
				local63 = Static123.anInt9150 / 2 - 152;
				@Pc(69) int local69 = Static71.anInt1872 / 2 - 18;
				local48.setColor(arg2);
				local48.drawRect(local63, local69, 303, 33);
				local48.setColor(arg1);
				local48.fillRect(local63 + 2, local69 + 2, arg3 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local63 + 1, local69 - -1, 301, 31);
				local48.fillRect(arg3 * 3 + local63 + 2, local69 + 2, 300 - arg3 * 3, 30);
				local48.setFont(Static350.aFont4);
				local48.setColor(arg0);
				local48.drawString(arg4, local63 + (304 - arg4.length() * 6) / 2, local69 + 22);
				if (Static555.aString220 != null) {
					local48.setFont(Static350.aFont4);
					local48.setColor(arg0);
					local48.drawString(Static555.aString220, Static123.anInt9150 / 2 - Static555.aString220.length() * 6 / 2, Static71.anInt1872 / 2 + -26);
				}
				local2.drawImage(Static279.anImage13, 0, 0, null);
			} catch (@Pc(183) Exception local183) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static123.anInt9150, Static71.anInt1872);
				@Pc(198) int local198 = Static123.anInt9150 / 2 - 152;
				local63 = Static71.anInt1872 / 2 - 18;
				local2.setColor(arg2);
				local2.drawRect(local198, local63, 303, 33);
				local2.setColor(arg1);
				local2.fillRect(local198 + 2, local63 + 2, arg3 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local198 + 1, local63 - -1, 301, 31);
				local2.fillRect(arg3 * 3 + local198 + 2, local63 + 2, 300 - arg3 * 3, 30);
				local2.setFont(Static350.aFont4);
				local2.setColor(arg0);
				if (Static555.aString220 != null) {
					local2.setFont(Static350.aFont4);
					local2.setColor(arg0);
					local2.drawString(Static555.aString220, Static123.anInt9150 / 2 - Static555.aString220.length() * 6 / 2, Static71.anInt1872 / 2 + -26);
				}
				local2.drawString(arg4, local198 + (304 - arg4.length() * 6) / 2, local63 + 22);
			}
		} catch (@Pc(311) Exception local311) {
			Static201.aCanvas7.repaint();
		}
	}
}
