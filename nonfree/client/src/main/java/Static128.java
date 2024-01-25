import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	public static int anInt2274;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_29 = new Class171(99, 9);

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)I")
	public static int method1921(@OriginalArg(1) boolean arg0) {
		if (Static407.anIntArray349 == null) {
			return 0;
		} else if (arg0 || Static342.aClass221Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < Static407.anIntArray349.length; local22++) {
				@Pc(28) int local28 = Static407.anIntArray349[local22];
				if (Static197.aClass362_42.method8365(local28)) {
					local20++;
				}
				if (Static516.aClass362_111.method8365(local28)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static407.anIntArray349.length * 2;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;II)V")
	public static void method1923(@OriginalArg(0) Color arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(6) Graphics local6 = Static330.aCanvas5.getGraphics();
			if (Static228.aFont1 == null) {
				Static228.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			@Pc(67) int local67;
			try {
				if (Static312.anImage2 == null) {
					Static312.anImage2 = Static330.aCanvas5.createImage(Static531.anInt8327, Static13.anInt306);
				}
				@Pc(52) Graphics local52 = Static312.anImage2.getGraphics();
				local52.setColor(Color.black);
				local52.fillRect(0, 0, Static531.anInt8327, Static13.anInt306);
				local67 = Static531.anInt8327 / 2 - 152;
				@Pc(73) int local73 = Static13.anInt306 / 2 - 18;
				local52.setColor(arg0);
				local52.drawRect(local67, local73, 303, 33);
				local52.setColor(arg1);
				local52.fillRect(local67 + 2, local73 + 2, arg4 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(local67 + 1, local73 + 1, 301, 31);
				local52.fillRect(arg4 * 3 + local67 + 2, local73 + 2, 300 - arg4 * 3, 30);
				local52.setFont(Static228.aFont1);
				local52.setColor(arg3);
				local52.drawString(arg2, (304 - arg2.length() * 6) / 2 + local67, local73 - -22);
				if (Static39.aString14 != null) {
					local52.setFont(Static228.aFont1);
					local52.setColor(arg3);
					local52.drawString(Static39.aString14, Static531.anInt8327 / 2 - Static39.aString14.length() * 6 / 2, Static13.anInt306 / 2 + -26);
				}
				local6.drawImage(Static312.anImage2, 0, 0, (ImageObserver) null);
			} catch (@Pc(188) Exception local188) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static531.anInt8327, Static13.anInt306);
				@Pc(203) int local203 = Static531.anInt8327 / 2 - 152;
				local67 = Static13.anInt306 / 2 - 18;
				local6.setColor(arg0);
				local6.drawRect(local203, local67, 303, 33);
				local6.setColor(arg1);
				local6.fillRect(local203 + 2, local67 + 2, arg4 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local203 + 1, local67 - -1, 301, 31);
				local6.fillRect(local203 + arg4 * 3 + 2, local67 + 2, 300 - arg4 * 3, 30);
				local6.setFont(Static228.aFont1);
				local6.setColor(arg3);
				if (Static39.aString14 != null) {
					local6.setFont(Static228.aFont1);
					local6.setColor(arg3);
					local6.drawString(Static39.aString14, Static531.anInt8327 / 2 - Static39.aString14.length() * 6 / 2, Static13.anInt306 / 2 + -26);
				}
				local6.drawString(arg2, local203 + (304 - arg2.length() * 6) / 2, local67 + 22);
			}
		} catch (@Pc(318) Exception local318) {
			Static330.aCanvas5.repaint();
		}
	}
}
