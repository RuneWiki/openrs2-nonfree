import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!vfa", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString138;

	@OriginalMember(owner = "client!vfa", name = "nb", descriptor = "I")
	public static int anInt9173;

	@OriginalMember(owner = "client!vfa", name = "W", descriptor = "Lclient!nb;")
	public static final Class232 aClass232_19 = new Class232("LOCAL", 4);

	@OriginalMember(owner = "client!vfa", name = "X", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!vfa", name = "mb", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_156 = new Class349(94, 10);

	@OriginalMember(owner = "client!vfa", name = "ob", descriptor = "[S")
	public static short[] aShortArray134 = new short[256];

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method7324(@OriginalArg(0) String arg0) {
		return Static197.method2479(fs.class, arg0);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!ps;IBI)V")
	public static void method7327(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static427.anInt6928 = arg1;
		Static117.anInt2048 = arg2;
		Static70.aClass273_2 = arg0;
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V")
	public static void method7328() {
		if (Static144.aFileOutputStream1 != null) {
			try {
				Static144.aFileOutputStream1.close();
			} catch (@Pc(12) IOException local12) {
			}
		}
		Static144.aFileOutputStream1 = null;
	}
}
