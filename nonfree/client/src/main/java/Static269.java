import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!kca", name = "k", descriptor = "I")
	public static int anInt5039;

	@OriginalMember(owner = "client!kca", name = "l", descriptor = "Z")
	public static boolean aBoolean392;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
	public static int anInt5033 = 0;

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "Z")
	public static boolean aBoolean391 = false;

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "Lclient!je;")
	public static final Class163 aClass163_1 = new Class163();

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(III[BIII[BI)V")
	public static void method4381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg1 >> 2);
		@Pc(20) int local20 = -(arg1 & 0x3);
		for (@Pc(23) int local23 = -arg4; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg7++;
				arg6[local31] = (byte) (arg6[local31] - arg2[arg3++]);
				@Pc(44) int local44 = arg7++;
				arg6[local44] = (byte) (arg6[local44] - arg2[arg3++]);
				@Pc(57) int local57 = arg7++;
				arg6[local57] = (byte) (arg6[local57] - arg2[arg3++]);
				@Pc(70) int local70 = arg7++;
				arg6[local70] = (byte) (arg6[local70] - arg2[arg3++]);
			}
			for (@Pc(86) int local86 = local20; local86 < 0; local86++) {
				local31 = arg7++;
				arg6[local31] = (byte) (arg6[local31] - arg2[arg3++]);
			}
			arg3 += arg0;
			arg7 += arg5;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(BILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V")
	public static void method4384(@OriginalArg(1) int arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(6) Graphics local6 = Static347.aCanvas9.getGraphics();
			if (Static307.aFont2 == null) {
				Static307.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			try {
				if (Static583.anImage13 == null) {
					Static583.anImage13 = Static347.aCanvas9.createImage(Static318.anInt5754, Static447.anInt7372);
				}
				@Pc(60) Graphics local60 = Static583.anImage13.getGraphics();
				local60.setColor(Color.black);
				local60.fillRect(0, 0, Static318.anInt5754, Static447.anInt7372);
				@Pc(75) int local75 = Static318.anInt5754 / 2 - 152;
				@Pc(81) int local81 = Static447.anInt7372 / 2 - 18;
				local60.setColor(arg3);
				local60.drawRect(local75, local81, 303, 33);
				local60.setColor(arg2);
				local60.fillRect(local75 + 2, local81 + 2, arg0 * 3, 30);
				local60.setColor(Color.black);
				local60.drawRect(local75 + 1, local81 + 1, 301, 31);
				local60.fillRect(local75 + arg0 * 3 + 2, local81 + 2, 300 - arg0 * 3, 30);
				local60.setFont(Static307.aFont2);
				local60.setColor(arg1);
				local60.drawString(arg4, (304 - arg4.length() * 6) / 2 + local75, local81 + 22);
				if (Static250.aString61 != null) {
					local60.setFont(Static307.aFont2);
					local60.setColor(arg1);
					local60.drawString(Static250.aString61, Static318.anInt5754 / 2 - Static250.aString61.length() * 6 / 2, Static447.anInt7372 / 2 - 26);
				}
				local6.drawImage(Static583.anImage13, 0, 0, null);
			} catch (@Pc(197) Exception local197) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static318.anInt5754, Static447.anInt7372);
				@Pc(212) int local212 = Static318.anInt5754 / 2 - 152;
				@Pc(218) int local218 = Static447.anInt7372 / 2 - 18;
				local6.setColor(arg3);
				local6.drawRect(local212, local218, 303, 33);
				local6.setColor(arg2);
				local6.fillRect(local212 + 2, local218 - -2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local212 + 1, local218 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local212 + 2, local218 - -2, 300 - arg0 * 3, 30);
				local6.setFont(Static307.aFont2);
				local6.setColor(arg1);
				if (Static250.aString61 != null) {
					local6.setFont(Static307.aFont2);
					local6.setColor(arg1);
					local6.drawString(Static250.aString61, Static318.anInt5754 / 2 - Static250.aString61.length() * 6 / 2, Static447.anInt7372 / 2 + -26);
				}
				local6.drawString(arg4, local212 + (304 - arg4.length() * 6) / 2, local218 + 22);
			}
		} catch (@Pc(326) Exception local326) {
			Static347.aCanvas9.repaint();
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(BI)V")
	public static void method4385(@OriginalArg(1) int arg0) {
		if (Static478.anIntArray602 == null || arg0 > Static478.anIntArray602.length) {
			Static478.anIntArray602 = new int[arg0];
		}
	}
}
