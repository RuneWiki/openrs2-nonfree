import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!rv", name = "ob", descriptor = "Lclient!naa;")
	public static final Class232 aClass232_7 = new Class232();

	@OriginalMember(owner = "client!rv", name = "rb", descriptor = "Lclient!jv;")
	public static final Class179 aClass179_4 = new Class179(128);

	@OriginalMember(owner = "client!rv", name = "ub", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "(I)V")
	public static void method7734() {
		Static393.anInt6147 = 0;
		for (@Pc(13) int local13 = 0; local13 < 2048; local13++) {
			Static188.aClass3_Sub25Array1[local13] = null;
			Static185.aByteArray28[local13] = 1;
			Static583.aClass251Array1[local13] = null;
		}
	}
}
