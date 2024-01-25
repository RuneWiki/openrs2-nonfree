import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
	public static int anInt2861;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!df;")
	public static Class49 aClass49_13;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!ct;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Z")
	public static boolean aBoolean255 = false;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "[I")
	public static final int[] anIntArray199 = new int[50];

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
	public static int anInt2863 = -1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;ZLjava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;B)V")
	public static void method2215(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Color arg4, @OriginalArg(5) Color arg5) {
		try {
			@Pc(2) Graphics local2 = Static118.aCanvas3.getGraphics();
			if (Static452.aFont1 == null) {
				Static452.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg1) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static96.anInt2175, Static216.anInt4171);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			try {
				if (Static441.anImage3 == null) {
					Static441.anImage3 = Static118.aCanvas3.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static441.anImage3.getGraphics();
				local59.setColor(arg4);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg5);
				local59.fillRect(2, 2, arg3 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				local59.setFont(Static452.aFont1);
				local59.setColor(arg2);
				local59.drawString(arg0, (304 - arg0.length() * 6) / 2, 22);
				local2.drawImage(Static441.anImage3, Static96.anInt2175 / 2 - 152, Static216.anInt4171 / 2 + -18, null);
			} catch (@Pc(143) Exception local143) {
				@Pc(149) int local149 = Static96.anInt2175 / 2 - 152;
				@Pc(155) int local155 = Static216.anInt4171 / 2 - 18;
				local2.setColor(arg4);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg5);
				local2.fillRect(local149 + 2, local155 + 2, arg3 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local149 + 1, local155 - -1, 301, 31);
				local2.fillRect(local149 + arg3 * 3 + 2, local155 + 2, 300 - arg3 * 3, 30);
				local2.setFont(Static452.aFont1);
				local2.setColor(arg2);
				local2.drawString(arg0, local149 + (304 - arg0.length() * 6) / 2, local155 - -22);
			}
			if (Static431.aString68 != null) {
				local2.setFont(Static452.aFont1);
				local2.setColor(arg2);
				local2.drawString(Static431.aString68, Static96.anInt2175 / 2 - Static431.aString68.length() * 6 / 2, Static216.anInt4171 / 2 + -26);
			}
		} catch (@Pc(264) Exception local264) {
			Static118.aCanvas3.repaint();
		}
	}
}
