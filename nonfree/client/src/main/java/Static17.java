import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bg", name = "A", descriptor = "[Lclient!dh;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
	public static int anInt416;

	@OriginalMember(owner = "client!bg", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString2;

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_12 = new Class221("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_13 = new Class221("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_14 = new Class221("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!bg", name = "x", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_15 = new Class221("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "[I")
	public static final int[] anIntArray80 = new int[50];

	@OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
	public static int anInt415 = -1;

	@OriginalMember(owner = "client!bg", name = "B", descriptor = "Lclient!sq;")
	public static final Class214 aClass214_5 = new Class214(16);

	@OriginalMember(owner = "client!bg", name = "D", descriptor = "[I")
	public static final int[] anIntArray81 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;ZILjava/awt/Color;Ljava/lang/String;)V")
	public static void method495(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) String arg5) {
		try {
			@Pc(6) Graphics local6 = Static170.aCanvas4.getGraphics();
			if (Static390.aFont1 == null) {
				Static390.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg3) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static335.anInt5875, Static263.anInt4662);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			try {
				if (Static52.anImage5 == null) {
					Static52.anImage5 = Static170.aCanvas4.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static52.anImage5.getGraphics();
				local63.setColor(arg4);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg2);
				local63.fillRect(2, 2, arg0 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local63.setFont(Static390.aFont1);
				local63.setColor(arg1);
				local63.drawString(arg5, (304 - arg5.length() * 6) / 2, 22);
				local6.drawImage(Static52.anImage5, Static335.anInt5875 / 2 - 152, Static263.anInt4662 / 2 + -18, null);
			} catch (@Pc(148) Exception local148) {
				@Pc(154) int local154 = Static335.anInt5875 / 2 - 152;
				@Pc(160) int local160 = Static263.anInt4662 / 2 - 18;
				local6.setColor(arg4);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg2);
				local6.fillRect(local154 + 2, local160 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local154 + 1, local160 + 1, 301, 31);
				local6.fillRect(local154 + arg0 * 3 + 2, local160 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static390.aFont1);
				local6.setColor(arg1);
				local6.drawString(arg5, (304 - arg5.length() * 6) / 2 + local154, local160 + 22);
			}
			if (Static389.aString64 != null) {
				local6.setFont(Static390.aFont1);
				local6.setColor(arg1);
				local6.drawString(Static389.aString64, Static335.anInt5875 / 2 - Static389.aString64.length() * 6 / 2, Static263.anInt4662 / 2 + -26);
			}
		} catch (@Pc(267) Exception local267) {
			Static170.aCanvas4.repaint();
		}
	}
}
