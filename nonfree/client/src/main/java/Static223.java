import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "Lclient!pl;")
	public static Class259 aClass259_67;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
	public static int anInt4186;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	public static int anInt4187;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "[Lclient!mi;")
	public static final Class2_Sub32[] aClass2_Sub32Array1 = new Class2_Sub32[1024];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;ILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;I)V")
	public static void method3501(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4) {
		try {
			@Pc(6) Graphics local6 = Static471.aCanvas12.getGraphics();
			if (Static24.aFont1 == null) {
				Static24.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			@Pc(67) int local67;
			try {
				if (Static82.anImage1 == null) {
					Static82.anImage1 = Static471.aCanvas12.createImage(Static140.anInt2937, Static120.anInt2371);
				}
				@Pc(52) Graphics local52 = Static82.anImage1.getGraphics();
				local52.setColor(Color.black);
				local52.fillRect(0, 0, Static140.anInt2937, Static120.anInt2371);
				local67 = Static140.anInt2937 / 2 - 152;
				@Pc(73) int local73 = Static120.anInt2371 / 2 - 18;
				local52.setColor(arg3);
				local52.drawRect(local67, local73, 303, 33);
				local52.setColor(arg4);
				local52.fillRect(local67 + 2, local73 + 2, arg1 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(local67 + 1, local73 + 1, 301, 31);
				local52.fillRect(local67 + arg1 * 3 + 2, local73 + 2, 300 - arg1 * 3, 30);
				local52.setFont(Static24.aFont1);
				local52.setColor(arg2);
				local52.drawString(arg0, local67 + (304 - arg0.length() * 6) / 2, local73 + 22);
				if (Static537.aString95 != null) {
					local52.setFont(Static24.aFont1);
					local52.setColor(arg2);
					local52.drawString(Static537.aString95, Static140.anInt2937 / 2 - Static537.aString95.length() * 6 / 2, Static120.anInt2371 / 2 - 26);
				}
				local6.drawImage(Static82.anImage1, 0, 0, null);
			} catch (@Pc(189) Exception local189) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static140.anInt2937, Static120.anInt2371);
				@Pc(204) int local204 = Static140.anInt2937 / 2 - 152;
				local67 = Static120.anInt2371 / 2 - 18;
				local6.setColor(arg3);
				local6.drawRect(local204, local67, 303, 33);
				local6.setColor(arg4);
				local6.fillRect(local204 + 2, local67 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local204 + 1, local67 + 1, 301, 31);
				local6.fillRect(arg1 * 3 + local204 + 2, local67 + 2, 300 - arg1 * 3, 30);
				local6.setFont(Static24.aFont1);
				local6.setColor(arg2);
				if (Static537.aString95 != null) {
					local6.setFont(Static24.aFont1);
					local6.setColor(arg2);
					local6.drawString(Static537.aString95, Static140.anInt2937 / 2 - Static537.aString95.length() * 6 / 2, Static120.anInt2371 / 2 + -26);
				}
				local6.drawString(arg0, (304 - arg0.length() * 6) / 2 + local204, local67 + 22);
			}
		} catch (@Pc(318) Exception local318) {
			Static471.aCanvas12.repaint();
		}
	}
}
