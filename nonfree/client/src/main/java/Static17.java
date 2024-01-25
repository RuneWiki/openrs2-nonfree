import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
	public static final int anInt292 = 328;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public static void method291() {
		if (Static164.aClass33_1 != null) {
			Static164.aClass33_1.method8236();
		}
		if (Static261.aClass33_4 != null) {
			Static261.aClass33_4.method8236();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/awt/Color;IILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;)V")
	public static void method292(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(6) Graphics local6 = Static67.aCanvas1.getGraphics();
			if (Static188.aFont1 == null) {
				Static188.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			@Pc(73) int local73;
			try {
				if (Static156.anImage1 == null) {
					Static156.anImage1 = Static67.aCanvas1.createImage(Static575.anInt9435, Static272.anInt5005);
				}
				@Pc(58) Graphics local58 = Static156.anImage1.getGraphics();
				local58.setColor(Color.black);
				local58.fillRect(0, 0, Static575.anInt9435, Static272.anInt5005);
				local73 = Static575.anInt9435 / 2 - 152;
				@Pc(79) int local79 = Static272.anInt5005 / 2 - 18;
				local58.setColor(arg4);
				local58.drawRect(local73, local79, 303, 33);
				local58.setColor(arg3);
				local58.fillRect(local73 + 2, local79 + 2, arg1 * 3, 30);
				local58.setColor(Color.black);
				local58.drawRect(local73 + 1, local79 + 1, 301, 31);
				local58.fillRect(arg1 * 3 + local73 + 2, local79 + 2, 300 - arg1 * 3, 30);
				local58.setFont(Static188.aFont1);
				local58.setColor(arg0);
				local58.drawString(arg2, local73 + (304 - arg2.length() * 6) / 2, local79 + 22);
				if (Static111.aString32 != null) {
					local58.setFont(Static188.aFont1);
					local58.setColor(arg0);
					local58.drawString(Static111.aString32, Static575.anInt9435 / 2 - Static111.aString32.length() * 6 / 2, Static272.anInt5005 / 2 + -26);
				}
				local6.drawImage(Static156.anImage1, 0, 0, (ImageObserver) null);
			} catch (@Pc(208) Exception local208) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static575.anInt9435, Static272.anInt5005);
				@Pc(223) int local223 = Static575.anInt9435 / 2 - 152;
				local73 = Static272.anInt5005 / 2 - 18;
				local6.setColor(arg4);
				local6.drawRect(local223, local73, 303, 33);
				local6.setColor(arg3);
				local6.fillRect(local223 + 2, local73 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local223 + 1, local73 + 1, 301, 31);
				local6.fillRect(local223 + arg1 * 3 + 2, local73 - -2, 300 - arg1 * 3, 30);
				local6.setFont(Static188.aFont1);
				local6.setColor(arg0);
				if (Static111.aString32 != null) {
					local6.setFont(Static188.aFont1);
					local6.setColor(arg0);
					local6.drawString(Static111.aString32, Static575.anInt9435 / 2 - Static111.aString32.length() * 6 / 2, Static272.anInt5005 / 2 - 26);
				}
				local6.drawString(arg2, local223 + (304 - arg2.length() * 6) / 2, local73 + 22);
			}
		} catch (@Pc(339) Exception local339) {
			Static67.aCanvas1.repaint();
		}
	}
}
