import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "[Lclient!hb;")
	public static Class103[] aClass103Array1;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	public static int anInt5165;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!oi;")
	public static Class185 aClass185_81;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_83 = new Class242(1, -1);

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!mt;")
	public static final Class165 aClass165_12 = new Class165(8, 0, 4, 1);

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[200];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!hm;Lclient!hm;B)V")
	public static void method4136(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1) {
		Static178.method2589(Static340.aClass242_91);
		Static426.aClass1_Sub19_Sub2_2.method2912(arg0.anInt2660);
		Static426.aClass1_Sub19_Sub2_2.method2889(arg0.anInt2643);
		Static426.aClass1_Sub19_Sub2_2.method2926(arg1.anInt2643);
		Static426.aClass1_Sub19_Sub2_2.method2889(arg1.anInt2631);
		Static426.aClass1_Sub19_Sub2_2.method2926(arg0.anInt2631);
		Static426.aClass1_Sub19_Sub2_2.method2912(arg1.anInt2660);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;ZLjava/awt/Color;IB)V")
	public static void method4138(@OriginalArg(0) Color arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Color arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(6) Graphics local6 = Static91.aCanvas2.getGraphics();
			if (Static373.aFont3 == null) {
				Static373.aFont3 = new Font("Helvetica", 1, 13);
			}
			if (arg3) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static192.anInt3532, Static40.anInt597);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			try {
				if (Static179.anImage3 == null) {
					Static179.anImage3 = Static91.aCanvas2.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static179.anImage3.getGraphics();
				local63.setColor(arg1);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg4);
				local63.fillRect(2, 2, arg5 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg5 * 3 + 2, 2, 300 - arg5 * 3, 30);
				local63.setFont(Static373.aFont3);
				local63.setColor(arg0);
				local63.drawString(arg2, (304 - arg2.length() * 6) / 2, 22);
				local6.drawImage(Static179.anImage3, Static192.anInt3532 / 2 - 152, Static40.anInt597 / 2 - 18, null);
			} catch (@Pc(151) Exception local151) {
				@Pc(157) int local157 = Static192.anInt3532 / 2 - 152;
				@Pc(163) int local163 = Static40.anInt597 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg4);
				local6.fillRect(local157 + 2, local163 - -2, arg5 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local157 + 1, local163 - -1, 301, 31);
				local6.fillRect(arg5 * 3 + local157 + 2, local163 + 2, 300 - arg5 * 3, 30);
				local6.setFont(Static373.aFont3);
				local6.setColor(arg0);
				local6.drawString(arg2, (304 - arg2.length() * 6) / 2 + local157, local163 - -22);
			}
			if (Static204.aString40 != null) {
				local6.setFont(Static373.aFont3);
				local6.setColor(arg0);
				local6.drawString(Static204.aString40, Static192.anInt3532 / 2 - Static204.aString40.length() * 6 / 2, Static40.anInt597 / 2 + -26);
			}
		} catch (@Pc(271) Exception local271) {
			Static91.aCanvas2.repaint();
		}
	}
}
