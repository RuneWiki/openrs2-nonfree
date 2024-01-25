import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "ab", descriptor = "Lclient!bg;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!ah", name = "fb", descriptor = "I")
	public static int anInt583;

	@OriginalMember(owner = "client!ah", name = "gb", descriptor = "Z")
	public static boolean aBoolean56;

	@OriginalMember(owner = "client!ah", name = "Y", descriptor = "Lclient!cda;")
	public static final Class44 aClass44_1 = new Class44("runescape", 0);

	@OriginalMember(owner = "client!ah", name = "db", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_7 = new Class158(70, 5);

	@OriginalMember(owner = "client!ah", name = "eb", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)V")
	public static void method614() {
		if (Static393.aClass5_11 != null) {
			Static393.aClass5_11.method7437();
			Static393.aClass5_11 = null;
			Static506.aClass59_4 = null;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([BZI)[B")
	public static byte[] method615(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static559.method5957(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
