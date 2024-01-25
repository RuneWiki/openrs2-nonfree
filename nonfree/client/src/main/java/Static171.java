import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!l", name = "N", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!l", name = "O", descriptor = "[Lclient!ee;")
	public static Class11_Sub5_Sub1[] aClass11_Sub5_Sub1Array2;

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "Lclient!nq;")
	public static Class144 aClass144_43;

	@OriginalMember(owner = "client!l", name = "M", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_58 = new Class117("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!l", name = "S", descriptor = "[I")
	public static final int[] anIntArray222 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!l", name = "T", descriptor = "[I")
	public static final int[] anIntArray223 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Color;ZILjava/awt/Color;Ljava/lang/String;ILjava/awt/Color;)V")
	public static void method2789(@OriginalArg(0) Color arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) String arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(6) Graphics local6 = Static34.aCanvas1.getGraphics();
			if (Static178.aFont1 == null) {
				Static178.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg1) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static164.anInt3090, Static79.anInt5259);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			try {
				if (Static46.anImage1 == null) {
					Static46.anImage1 = Static34.aCanvas1.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static46.anImage1.getGraphics();
				local63.setColor(arg5);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg3);
				local63.fillRect(2, 2, arg2 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local63.setFont(Static178.aFont1);
				local63.setColor(arg0);
				local63.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
				local6.drawImage(Static46.anImage1, Static164.anInt3090 / 2 - 152, Static79.anInt5259 / 2 + -18, null);
			} catch (@Pc(143) Exception local143) {
				@Pc(149) int local149 = Static164.anInt3090 / 2 - 152;
				@Pc(155) int local155 = Static79.anInt5259 / 2 - 18;
				local6.setColor(arg5);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg3);
				local6.fillRect(local149 + 2, local155 + 2, arg2 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local149 + 1, local155 + 1, 301, 31);
				local6.fillRect(arg2 * 3 + local149 + 2, local155 + 2, 300 - arg2 * 3, 30);
				local6.setFont(Static178.aFont1);
				local6.setColor(arg0);
				local6.drawString(arg4, local149 + (304 - arg4.length() * 6) / 2, local155 + 22);
			}
			if (Static130.aString42 != null) {
				local6.setFont(Static178.aFont1);
				local6.setColor(arg0);
				local6.drawString(Static130.aString42, Static164.anInt3090 / 2 - Static130.aString42.length() * 6 / 2, Static79.anInt5259 / 2 + -26);
			}
		} catch (@Pc(263) Exception local263) {
			Static34.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(B)V")
	public static void method2790() {
		for (@Pc(7) int local7 = 0; local7 < Static79.anInt5244; local7++) {
			@Pc(13) Class89 local13 = Static17.method227(local7);
			if (local13 != null && local13.anInt2051 == 0) {
				Static195.anIntArray342[local7] = 0;
				Static198.anIntArray311[local7] = 0;
			}
		}
		Static37.aClass58_7 = new Class58(128);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZZB)V")
	public static void method2792(@OriginalArg(0) boolean arg0) {
		Static233.anInt4717++;
		Static251.method4413();
		if (arg0) {
			Static191.anInt6249++;
			Static324.method5599();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IC)B")
	public static byte method2793(@OriginalArg(1) char arg0) {
		@Pc(32) byte local32;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local32 = (byte) arg0;
		} else if (arg0 == '€') {
			local32 = -128;
		} else if (arg0 == '‚') {
			local32 = -126;
		} else if (arg0 == 'ƒ') {
			local32 = -125;
		} else if (arg0 == '„') {
			local32 = -124;
		} else if (arg0 == '…') {
			local32 = -123;
		} else if (arg0 == '†') {
			local32 = -122;
		} else if (arg0 == '‡') {
			local32 = -121;
		} else if (arg0 == 'ˆ') {
			local32 = -120;
		} else if (arg0 == '‰') {
			local32 = -119;
		} else if (arg0 == 'Š') {
			local32 = -118;
		} else if (arg0 == '‹') {
			local32 = -117;
		} else if (arg0 == 'Œ') {
			local32 = -116;
		} else if (arg0 == 'Ž') {
			local32 = -114;
		} else if (arg0 == '‘') {
			local32 = -111;
		} else if (arg0 == '’') {
			local32 = -110;
		} else if (arg0 == '“') {
			local32 = -109;
		} else if (arg0 == '”') {
			local32 = -108;
		} else if (arg0 == '•') {
			local32 = -107;
		} else if (arg0 == '–') {
			local32 = -106;
		} else if (arg0 == '—') {
			local32 = -105;
		} else if (arg0 == '˜') {
			local32 = -104;
		} else if (arg0 == '™') {
			local32 = -103;
		} else if (arg0 == 'š') {
			local32 = -102;
		} else if (arg0 == '›') {
			local32 = -101;
		} else if (arg0 == 'œ') {
			local32 = -100;
		} else if (arg0 == 'ž') {
			local32 = -98;
		} else if (arg0 == 'Ÿ') {
			local32 = -97;
		} else {
			local32 = 63;
		}
		return local32;
	}
}
