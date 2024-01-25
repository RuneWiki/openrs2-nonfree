import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!os", name = "c", descriptor = "Lclient!xa;")
	public static Class119 aClass119_20;

	@OriginalMember(owner = "client!os", name = "e", descriptor = "Lclient!ig;")
	public static Class133 aClass133_117;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_86 = new Class158(59, 15);

	@OriginalMember(owner = "client!os", name = "d", descriptor = "[I")
	public static final int[] anIntArray579 = new int[13];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;BLjava/awt/Color;I)V")
	public static void method5615(@OriginalArg(0) String arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(2) Graphics local2 = Static549.aCanvas15.getGraphics();
			if (Static181.aFont1 == null) {
				Static181.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			@Pc(68) int local68;
			try {
				if (Static298.anImage6 == null) {
					Static298.anImage6 = Static549.aCanvas15.createImage(Static480.anInt8652, Static412.anInt7547);
				}
				@Pc(53) Graphics local53 = Static298.anImage6.getGraphics();
				local53.setColor(Color.black);
				local53.fillRect(0, 0, Static480.anInt8652, Static412.anInt7547);
				local68 = Static480.anInt8652 / 2 - 152;
				@Pc(74) int local74 = Static412.anInt7547 / 2 - 18;
				local53.setColor(arg3);
				local53.drawRect(local68, local74, 303, 33);
				local53.setColor(arg1);
				local53.fillRect(local68 + 2, local74 + 2, arg4 * 3, 30);
				local53.setColor(Color.black);
				local53.drawRect(local68 + 1, local74 + 1, 301, 31);
				local53.fillRect(arg4 * 3 + local68 + 2, local74 + 2, 300 - arg4 * 3, 30);
				local53.setFont(Static181.aFont1);
				local53.setColor(arg2);
				local53.drawString(arg0, (304 - arg0.length() * 6) / 2 + local68, local74 - -22);
				if (Static217.aString35 != null) {
					local53.setFont(Static181.aFont1);
					local53.setColor(arg2);
					local53.drawString(Static217.aString35, Static480.anInt8652 / 2 - Static217.aString35.length() * 6 / 2, Static412.anInt7547 / 2 - 26);
				}
				local2.drawImage(Static298.anImage6, 0, 0, null);
			} catch (@Pc(189) Exception local189) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static480.anInt8652, Static412.anInt7547);
				@Pc(204) int local204 = Static480.anInt8652 / 2 - 152;
				local68 = Static412.anInt7547 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local204, local68, 303, 33);
				local2.setColor(arg1);
				local2.fillRect(local204 + 2, local68 + 2, arg4 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local204 + 1, local68 + 1, 301, 31);
				local2.fillRect(local204 + arg4 * 3 + 2, local68 + 2, 300 - arg4 * 3, 30);
				local2.setFont(Static181.aFont1);
				local2.setColor(arg2);
				if (Static217.aString35 != null) {
					local2.setFont(Static181.aFont1);
					local2.setColor(arg2);
					local2.drawString(Static217.aString35, Static480.anInt8652 / 2 - Static217.aString35.length() * 6 / 2, Static412.anInt7547 / 2 + -26);
				}
				local2.drawString(arg0, local204 + (304 - arg0.length() * 6) / 2, local68 + 22);
			}
		} catch (@Pc(318) Exception local318) {
			Static549.aCanvas15.repaint();
		}
	}
}
