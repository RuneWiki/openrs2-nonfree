import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
	public static int anInt6907;

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
	public static int anInt6910 = 0;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "[I")
	public static final int[] anIntArray387 = new int[25];

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_215 = new Class196(109, 2);

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIBI)I")
	public static int method5869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static298.aClass88Array3 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(22) int local22 = arg2 >> 9;
			@Pc(26) int local26 = arg0 >> 9;
			if (arg4 < 0 || arg3 < 0 || Static124.anInt2150 - 1 < arg4 || arg3 > Static64.anInt1015 - 1) {
				return 0;
			} else if (local22 >= 1 && local26 >= 1 && local22 <= Static124.anInt2150 - 1 && local26 <= Static64.anInt1015 - 1) {
				@Pc(84) boolean local84 = (Static317.aByteArrayArrayArray13[1][arg2 >> 9][arg0 >> 9] & 0x2) != 0;
				@Pc(109) boolean local109;
				@Pc(128) boolean local128;
				if ((arg2 & 0x1FF) == 0) {
					local109 = (Static317.aByteArrayArrayArray13[1][local22 - 1][arg0 >> 9] & 0x2) != 0;
					local128 = (Static317.aByteArrayArrayArray13[1][local22][arg0 >> 9] & 0x2) != 0;
					if (local128 != local109) {
						local84 = (Static317.aByteArrayArrayArray13[1][arg4][arg3] & 0x2) != 0;
					}
				}
				if ((arg0 & 0x1FF) == 0) {
					local109 = (Static317.aByteArrayArrayArray13[1][arg2 >> 9][local26 - 1] & 0x2) != 0;
					local128 = (Static317.aByteArrayArrayArray13[1][arg2 >> 9][local26] & 0x2) != 0;
					if (local128 != local109) {
						local84 = (Static317.aByteArrayArrayArray13[1][arg4][arg3] & 0x2) != 0;
					}
				}
				if (local84) {
					arg1++;
				}
				return Static298.aClass88Array3[arg1].method8753(arg2, arg0);
			} else {
				return 0;
			}
		} else {
			return Static298.aClass88Array3[arg1].method8753(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)I")
	public static int method5870() {
		@Pc(11) Class265 local11 = Static168.aClass265_9;
		synchronized (Static168.aClass265_9) {
			return Static168.aClass265_9.method6581();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;ILjava/awt/Color;I)V")
	public static void method5871(@OriginalArg(0) Color arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(6) Graphics local6 = Static105.aCanvas2.getGraphics();
			if (Static570.aFont2 == null) {
				Static570.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			@Pc(67) int local67;
			try {
				if (Static64.anImage2 == null) {
					Static64.anImage2 = Static105.aCanvas2.createImage(Static563.anInt9176, Static316.anInt8165);
				}
				@Pc(52) Graphics local52 = Static64.anImage2.getGraphics();
				local52.setColor(Color.black);
				local52.fillRect(0, 0, Static563.anInt9176, Static316.anInt8165);
				local67 = Static563.anInt9176 / 2 - 152;
				@Pc(73) int local73 = Static316.anInt8165 / 2 - 18;
				local52.setColor(arg0);
				local52.drawRect(local67, local73, 303, 33);
				local52.setColor(arg2);
				local52.fillRect(local67 + 2, local73 + 2, arg4 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(local67 + 1, local73 + 1, 301, 31);
				local52.fillRect(arg4 * 3 + local67 + 2, local73 - -2, 300 - arg4 * 3, 30);
				local52.setFont(Static570.aFont2);
				local52.setColor(arg3);
				local52.drawString(arg1, (304 - arg1.length() * 6) / 2 + local67, local73 + 22);
				if (Static391.aString69 != null) {
					local52.setFont(Static570.aFont2);
					local52.setColor(arg3);
					local52.drawString(Static391.aString69, Static563.anInt9176 / 2 - Static391.aString69.length() * 6 / 2, Static316.anInt8165 / 2 + -26);
				}
				local6.drawImage(Static64.anImage2, 0, 0, (ImageObserver) null);
			} catch (@Pc(188) Exception local188) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static563.anInt9176, Static316.anInt8165);
				@Pc(203) int local203 = Static563.anInt9176 / 2 - 152;
				local67 = Static316.anInt8165 / 2 - 18;
				local6.setColor(arg0);
				local6.drawRect(local203, local67, 303, 33);
				local6.setColor(arg2);
				local6.fillRect(local203 + 2, local67 - -2, arg4 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local203 + 1, local67 + 1, 301, 31);
				local6.fillRect(arg4 * 3 + local203 + 2, local67 + 2, 300 - arg4 * 3, 30);
				local6.setFont(Static570.aFont2);
				local6.setColor(arg3);
				if (Static391.aString69 != null) {
					local6.setFont(Static570.aFont2);
					local6.setColor(arg3);
					local6.drawString(Static391.aString69, Static563.anInt9176 / 2 - Static391.aString69.length() * 6 / 2, Static316.anInt8165 / 2 + -26);
				}
				local6.drawString(arg1, local203 + (304 - arg1.length() * 6) / 2, local67 - -22);
			}
		} catch (@Pc(316) Exception local316) {
			Static105.aCanvas2.repaint();
		}
	}
}
