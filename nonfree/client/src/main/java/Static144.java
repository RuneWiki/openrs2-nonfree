import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Lclient!lj;")
	public static Class1_Sub5_Sub6 aClass1_Sub5_Sub6_5;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
	public static int anInt2797;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "Lclient!ah;")
	public static Class6 aClass6_4;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
	public static int anInt2798 = 0;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "[C")
	public static char[] aCharArray4 = new char[128];

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method2513() {
		@Pc(1) String local1 = "";
		@Pc(3) String local3 = "www";
		if (Static210.anInt4011 != 0) {
			local3 = "www-wtqa";
		}
		if (Static258.aString177 != null) {
			local1 = "/p=" + Static258.aString177;
		}
		return "http://" + local3 + ".runescape.com/l=" + Static114.anInt2343 + "/a=" + Static158.anInt3622 + local1 + "/";
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
	public static void method2515() {
		Static231.anInt4330++;
	}
}
