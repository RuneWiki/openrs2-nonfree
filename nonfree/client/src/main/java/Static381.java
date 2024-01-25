import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
	public static int anInt7254 = 0;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "Lclient!fca;")
	public static final Class98 aClass98_7 = new Class98("", 13);

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_206 = new Class88(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "[Lclient!nv;")
	public static final Class12_Sub4_Sub13[] aClass12_Sub4_Sub13Array4 = new Class12_Sub4_Sub13[14];

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "Z")
	public static boolean aBoolean523 = false;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BZ)V")
	public static void method6031(@OriginalArg(1) boolean arg0) {
		for (@Pc(6) Class12_Sub22 local6 = (Class12_Sub22) Static316.aClass73_49.method2005(); local6 != null; local6 = (Class12_Sub22) Static316.aClass73_49.method2009()) {
			if (local6.aClass12_Sub13_Sub4_3 != null) {
				Static328.aClass12_Sub13_Sub1_1.method2443(local6.aClass12_Sub13_Sub4_3);
				local6.aClass12_Sub13_Sub4_3 = null;
			}
			if (local6.aClass12_Sub13_Sub4_2 != null) {
				Static328.aClass12_Sub13_Sub1_1.method2443(local6.aClass12_Sub13_Sub4_2);
				local6.aClass12_Sub13_Sub4_2 = null;
			}
			local6.method7967();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class12_Sub22 local53 = (Class12_Sub22) Static325.aClass73_50.method2005(); local53 != null; local53 = (Class12_Sub22) Static325.aClass73_50.method2009()) {
			if (local53.aClass12_Sub13_Sub4_3 != null) {
				Static328.aClass12_Sub13_Sub1_1.method2443(local53.aClass12_Sub13_Sub4_3);
				local53.aClass12_Sub13_Sub4_3 = null;
			}
			local53.method7967();
		}
		for (@Pc(80) Class12_Sub22 local80 = (Class12_Sub22) Static451.aClass68_35.method1923(); local80 != null; local80 = (Class12_Sub22) Static451.aClass68_35.method1920()) {
			if (local80.aClass12_Sub13_Sub4_3 != null) {
				Static328.aClass12_Sub13_Sub1_1.method2443(local80.aClass12_Sub13_Sub4_3);
				local80.aClass12_Sub13_Sub4_3 = null;
			}
			local80.method7967();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
	public static void method6033(@OriginalArg(0) int arg0) {
		Static171.anInt3908 = arg0;
		Static3.aClass125_1.method3440();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(CI)C")
	public static char method6034(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILjava/lang/String;Ljava/awt/Color;ILjava/awt/Color;ZLjava/awt/Color;)V")
	public static void method6036(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(2) Graphics local2 = Static301.aCanvas11.getGraphics();
			if (Static507.aFont1 == null) {
				Static507.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg4) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static169.anInt3893, Static127.anInt2936);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			try {
				if (Static7.anImage14 == null) {
					Static7.anImage14 = Static301.aCanvas11.createImage(304, 34);
				}
				@Pc(64) Graphics local64 = Static7.anImage14.getGraphics();
				local64.setColor(arg5);
				local64.drawRect(0, 0, 303, 33);
				local64.setColor(arg3);
				local64.fillRect(2, 2, arg0 * 3, 30);
				local64.setColor(Color.black);
				local64.drawRect(1, 1, 301, 31);
				local64.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local64.setFont(Static507.aFont1);
				local64.setColor(arg2);
				local64.drawString(arg1, (304 - arg1.length() * 6) / 2, 22);
				local2.drawImage(Static7.anImage14, Static169.anInt3893 / 2 - 152, Static127.anInt2936 / 2 + -18, null);
			} catch (@Pc(143) Exception local143) {
				@Pc(149) int local149 = Static169.anInt3893 / 2 - 152;
				@Pc(155) int local155 = Static127.anInt2936 / 2 - 18;
				local2.setColor(arg5);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg3);
				local2.fillRect(local149 + 2, local155 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local149 + 1, local155 + 1, 301, 31);
				local2.fillRect(local149 + arg0 * 3 + 2, local155 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Static507.aFont1);
				local2.setColor(arg2);
				local2.drawString(arg1, local149 + (304 - arg1.length() * 6) / 2, local155 + 22);
			}
			if (Static64.aString105 != null) {
				local2.setFont(Static507.aFont1);
				local2.setColor(arg2);
				local2.drawString(Static64.aString105, Static169.anInt3893 / 2 - Static64.aString105.length() * 6 / 2, Static127.anInt2936 / 2 + -26);
			}
		} catch (@Pc(263) Exception local263) {
			Static301.aCanvas11.repaint();
		}
	}
}
