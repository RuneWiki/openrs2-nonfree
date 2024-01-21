import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	public static int anInt1803 = 0;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!af;")
	private static Class5 aClass5_895 = Static45.method1937("Loaded fonts");

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_894 = aClass5_895;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_896 = Static45.method1937("scrollbar");

	@OriginalMember(owner = "client!md", name = "n", descriptor = "Lclient!af;")
	public static Class5 aClass5_897 = Static45.method1937("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!md", name = "o", descriptor = "I")
	public static volatile int anInt1808 = -1;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "Lclient!af;")
	public static Class5 aClass5_898 = Static45.method1937("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!md", name = "y", descriptor = "I")
	public static int anInt1817 = 0;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "[I")
	public static int[] anIntArray299 = new int[2048];

	@OriginalMember(owner = "client!md", name = "B", descriptor = "Lclient!af;")
	public static Class5 aClass5_899 = Static45.method1937("mapback");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lclient!nc;")
	public static Class1_Sub3_Sub11 method1316(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub3_Sub11 local10 = (Class1_Sub3_Sub11) Static81.aClass28_56.method796((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static113.aClass41_28.method1710(12, arg0);
		local10 = new Class1_Sub3_Sub11();
		if (local25 != null) {
			local10.method1440(new Class1_Sub20(local25));
		}
		local10.method1438();
		Static81.aClass28_56.method789(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	public static void method1326() {
		aClass5_896 = null;
		anIntArray299 = null;
		aClass5_899 = null;
		aClass5_898 = null;
		aClass5_895 = null;
		aClass5_894 = null;
		aClass5_897 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method1329(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static73.aClass62_1);
		arg0.removeFocusListener(Static73.aClass62_1);
		Static95.anInt2355 = -1;
	}
}
