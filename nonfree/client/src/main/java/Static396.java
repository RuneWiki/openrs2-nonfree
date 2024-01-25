import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
	public static int anInt7505;

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "[I")
	public static final int[] anIntArray529 = new int[8];

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "Lclient!vj;")
	public static final Class333 aClass333_12 = new Class333(3);

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)I")
	public static int method6257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLjava/io/File;)[B")
	public static byte[] method6258(@OriginalArg(1) File arg0) {
		return Static265.method8098((int) arg0.length(), arg0);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZ)Z")
	public static boolean method6260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;ILjava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;)V")
	public static void method6261(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Static38.aCanvas4.getGraphics();
			if (Static168.aFont1 == null) {
				Static168.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			@Pc(63) int local63;
			try {
				if (Static220.anImage2 == null) {
					Static220.anImage2 = Static38.aCanvas4.createImage(Static228.anInt4744, Static180.anInt4051);
				}
				@Pc(48) Graphics local48 = Static220.anImage2.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static228.anInt4744, Static180.anInt4051);
				local63 = Static228.anInt4744 / 2 - 152;
				@Pc(69) int local69 = Static180.anInt4051 / 2 - 18;
				local48.setColor(arg4);
				local48.drawRect(local63, local69, 303, 33);
				local48.setColor(arg3);
				local48.fillRect(local63 + 2, local69 - -2, arg1 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local63 + 1, local69 + 1, 301, 31);
				local48.fillRect(arg1 * 3 + local63 + 2, local69 + 2, 300 - arg1 * 3, 30);
				local48.setFont(Static168.aFont1);
				local48.setColor(arg2);
				local48.drawString(arg0, (304 - arg0.length() * 6) / 2 + local63, local69 - -22);
				if (Static212.aString51 != null) {
					local48.setFont(Static168.aFont1);
					local48.setColor(arg2);
					local48.drawString(Static212.aString51, Static228.anInt4744 / 2 - Static212.aString51.length() * 6 / 2, Static180.anInt4051 / 2 + -26);
				}
				local2.drawImage(Static220.anImage2, 0, 0, null);
			} catch (@Pc(183) Exception local183) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static228.anInt4744, Static180.anInt4051);
				@Pc(198) int local198 = Static228.anInt4744 / 2 - 152;
				local63 = Static180.anInt4051 / 2 - 18;
				local2.setColor(arg4);
				local2.drawRect(local198, local63, 303, 33);
				local2.setColor(arg3);
				local2.fillRect(local198 + 2, local63 + 2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local198 + 1, local63 + 1, 301, 31);
				local2.fillRect(local198 + arg1 * 3 + 2, local63 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static168.aFont1);
				local2.setColor(arg2);
				if (Static212.aString51 != null) {
					local2.setFont(Static168.aFont1);
					local2.setColor(arg2);
					local2.drawString(Static212.aString51, Static228.anInt4744 / 2 - Static212.aString51.length() * 6 / 2, Static180.anInt4051 / 2 + -26);
				}
				local2.drawString(arg0, (304 - arg0.length() * 6) / 2 + local198, local63 + 22);
			}
		} catch (@Pc(312) Exception local312) {
			Static38.aCanvas4.repaint();
		}
	}
}
