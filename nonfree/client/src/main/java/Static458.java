import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!ru", name = "O", descriptor = "Lclient!nd;")
	public static final Class214 aClass214_3 = new Class214();

	@OriginalMember(owner = "client!ru", name = "P", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_102 = new Class316(72, 11);

	@OriginalMember(owner = "client!ru", name = "Q", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_103 = new Class316(82, 8);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;ILjava/awt/Color;I)V")
	public static void method6413(@OriginalArg(0) String arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(6) Graphics local6 = Static77.aCanvas1.getGraphics();
			if (Static176.aFont3 == null) {
				Static176.aFont3 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			@Pc(75) int local75;
			try {
				if (Static550.anImage3 == null) {
					Static550.anImage3 = Static77.aCanvas1.createImage(Static367.anInt6719, Static154.anInt2867);
				}
				@Pc(60) Graphics local60 = Static550.anImage3.getGraphics();
				local60.setColor(Color.black);
				local60.fillRect(0, 0, Static367.anInt6719, Static154.anInt2867);
				local75 = Static367.anInt6719 / 2 - 152;
				@Pc(81) int local81 = Static154.anInt2867 / 2 - 18;
				local60.setColor(arg1);
				local60.drawRect(local75, local81, 303, 33);
				local60.setColor(arg2);
				local60.fillRect(local75 + 2, local81 + 2, arg4 * 3, 30);
				local60.setColor(Color.black);
				local60.drawRect(local75 + 1, local81 + 1, 301, 31);
				local60.fillRect(local75 + arg4 * 3 + 2, local81 + 2, 300 - arg4 * 3, 30);
				local60.setFont(Static176.aFont3);
				local60.setColor(arg3);
				local60.drawString(arg0, (304 - arg0.length() * 6) / 2 + local75, local81 + 22);
				if (Static115.aString10 != null) {
					local60.setFont(Static176.aFont3);
					local60.setColor(arg3);
					local60.drawString(Static115.aString10, Static367.anInt6719 / 2 - Static115.aString10.length() * 6 / 2, Static154.anInt2867 / 2 + -26);
				}
				local6.drawImage(Static550.anImage3, 0, 0, null);
			} catch (@Pc(194) Exception local194) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static367.anInt6719, Static154.anInt2867);
				@Pc(209) int local209 = Static367.anInt6719 / 2 - 152;
				local75 = Static154.anInt2867 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local209, local75, 303, 33);
				local6.setColor(arg2);
				local6.fillRect(local209 + 2, local75 + 2, arg4 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local209 + 1, local75 + 1, 301, 31);
				local6.fillRect(local209 + arg4 * 3 + 2, local75 + 2, 300 - arg4 * 3, 30);
				local6.setFont(Static176.aFont3);
				local6.setColor(arg3);
				if (Static115.aString10 != null) {
					local6.setFont(Static176.aFont3);
					local6.setColor(arg3);
					local6.drawString(Static115.aString10, Static367.anInt6719 / 2 - Static115.aString10.length() * 6 / 2, Static154.anInt2867 / 2 + -26);
				}
				local6.drawString(arg0, local209 + (304 - arg0.length() * 6) / 2, local75 + 22);
			}
		} catch (@Pc(324) Exception local324) {
			Static77.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ljava/lang/String;IZLclient!pj;)Lclient!kea;")
	public static Class170 method6414(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class248 arg2) {
		@Pc(10) int local10 = arg2.method5777(arg0);
		if (local10 == -1) {
			return new Class170(0);
		}
		@Pc(24) int[] local24 = arg2.method5796(local10);
		@Pc(30) Class170 local30 = new Class170(local24.length);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		while (true) {
			while (local30.anInt4734 > local32) {
				@Pc(48) Class6_Sub12 local48 = new Class6_Sub12(arg2.method5797(local10, local24[local34++]));
				@Pc(52) int local52 = local48.method6015();
				@Pc(56) int local56 = local48.method6044();
				@Pc(60) int local60 = local48.method6019();
				if (!arg1 && local60 == 1) {
					local30.anInt4734--;
				} else {
					local30.anIntArray391[local32] = local52;
					local30.anIntArray390[local32] = local56;
					local32++;
				}
			}
			return local30;
		}
	}
}
