import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!v", name = "C", descriptor = "I")
	public static int anInt10308 = 1;

	@OriginalMember(owner = "client!v", name = "G", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_147 = new Class71(20, 6);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;Ljava/lang/String;ILjava/awt/Color;)V")
	public static void method8334(@OriginalArg(0) Color arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(6) Graphics local6 = Static549.aCanvas13.getGraphics();
			if (Static84.aFont1 == null) {
				Static84.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			@Pc(67) int local67;
			try {
				if (Static80.anImage10 == null) {
					Static80.anImage10 = Static549.aCanvas13.createImage(Static235.anInt5298, Static313.anInt6355);
				}
				@Pc(52) Graphics local52 = Static80.anImage10.getGraphics();
				local52.setColor(Color.black);
				local52.fillRect(0, 0, Static235.anInt5298, Static313.anInt6355);
				local67 = Static235.anInt5298 / 2 - 152;
				@Pc(73) int local73 = Static313.anInt6355 / 2 - 18;
				local52.setColor(arg0);
				local52.drawRect(local67, local73, 303, 33);
				local52.setColor(arg4);
				local52.fillRect(local67 + 2, local73 + 2, arg3 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(local67 + 1, local73 - -1, 301, 31);
				local52.fillRect(arg3 * 3 + local67 + 2, local73 + 2, 300 - arg3 * 3, 30);
				local52.setFont(Static84.aFont1);
				local52.setColor(arg1);
				local52.drawString(arg2, local67 + (304 - arg2.length() * 6) / 2, local73 + 22);
				if (Static590.aString106 != null) {
					local52.setFont(Static84.aFont1);
					local52.setColor(arg1);
					local52.drawString(Static590.aString106, Static235.anInt5298 / 2 - Static590.aString106.length() * 6 / 2, Static313.anInt6355 / 2 + -26);
				}
				local6.drawImage(Static80.anImage10, 0, 0, null);
			} catch (@Pc(186) Exception local186) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static235.anInt5298, Static313.anInt6355);
				@Pc(201) int local201 = Static235.anInt5298 / 2 - 152;
				local67 = Static313.anInt6355 / 2 - 18;
				local6.setColor(arg0);
				local6.drawRect(local201, local67, 303, 33);
				local6.setColor(arg4);
				local6.fillRect(local201 + 2, local67 + 2, arg3 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local201 + 1, local67 + 1, 301, 31);
				local6.fillRect(local201 + arg3 * 3 + 2, local67 - -2, 300 - arg3 * 3, 30);
				local6.setFont(Static84.aFont1);
				local6.setColor(arg1);
				if (Static590.aString106 != null) {
					local6.setFont(Static84.aFont1);
					local6.setColor(arg1);
					local6.drawString(Static590.aString106, Static235.anInt5298 / 2 - Static590.aString106.length() * 6 / 2, Static313.anInt6355 / 2 + -26);
				}
				local6.drawString(arg2, local201 + (304 - arg2.length() * 6) / 2, local67 + 22);
			}
		} catch (@Pc(315) Exception local315) {
			Static549.aCanvas13.repaint();
		}
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(B)V")
	public static void method8336() {
		Static84.method2098(Static155.aClass8_Sub25_6.aClass36_Sub7_1.method3620());
		@Pc(20) int local20 = (Static637.anInt10650 >> 12) + (Static628.anInt10493 >> 3);
		Static128.anInt3428 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 = 0;
		@Pc(33) int local33 = (Static594.anInt10160 >> 3) + (Static377.anInt7114 >> 12);
		Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.method2761(8, 8);
		Static357.aByteArrayArray65 = new byte[18][];
		Static177.aByteArrayArray63 = new byte[18][];
		Static170.anIntArray225 = new int[18];
		Static414.anIntArray422 = new int[18];
		Static568.aByteArrayArray154 = new byte[18][];
		Static161.anIntArray214 = new int[18];
		Static19.aByteArrayArray59 = new byte[18][];
		Static466.anIntArrayArray45 = new int[18][4];
		Static65.aByteArrayArray30 = new byte[18][];
		Static488.anIntArray481 = new int[18];
		Static158.anIntArray212 = new int[18];
		Static87.anIntArray604 = new int[18];
		@Pc(79) int local79 = 0;
		@Pc(98) int local98;
		for (@Pc(87) int local87 = (local20 - (Static372.anInt7082 >> 4)) / 8; local87 <= ((Static372.anInt7082 >> 4) + local20) / 8; local87++) {
			for (local98 = (local33 - (Static218.anInt5023 >> 4)) / 8; local98 <= (local33 + (Static218.anInt5023 >> 4)) / 8; local98++) {
				@Pc(107) int local107 = (local87 << 8) + local98;
				Static170.anIntArray225[local79] = local107;
				Static414.anIntArray422[local79] = Static140.aClass237_41.method6307("m" + local87 + "_" + local98);
				Static87.anIntArray604[local79] = Static140.aClass237_41.method6307("l" + local87 + "_" + local98);
				Static161.anIntArray214[local79] = Static140.aClass237_41.method6307("n" + local87 + "_" + local98);
				Static158.anIntArray212[local79] = Static140.aClass237_41.method6307("um" + local87 + "_" + local98);
				Static488.anIntArray481[local79] = Static140.aClass237_41.method6307("ul" + local87 + "_" + local98);
				if (Static161.anIntArray214[local79] == -1) {
					Static414.anIntArray422[local79] = -1;
					Static87.anIntArray604[local79] = -1;
					Static158.anIntArray212[local79] = -1;
					Static488.anIntArray481[local79] = -1;
				}
				local79++;
			}
		}
		for (local98 = local79; local98 < Static161.anIntArray214.length; local98++) {
			Static161.anIntArray214[local98] = -1;
			Static414.anIntArray422[local98] = -1;
			Static87.anIntArray604[local98] = -1;
			Static158.anIntArray212[local98] = -1;
			Static488.anIntArray481[local98] = -1;
		}
		@Pc(291) byte local291;
		if (Static435.anInt8191 == 3) {
			local291 = 4;
		} else {
			local291 = 8;
		}
		Static63.method1690(local33, local20, false, local291);
	}
}
