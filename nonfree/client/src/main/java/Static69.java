import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "Lclient!cd;")
	public static Class10 aClass10_712 = Static51.method932("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
	public static int anInt1633 = 0;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	public static int anInt1634 = -1;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
	public static int anInt1635 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public static void method1163() {
		Static179.aClass18_13 = new Class18(32);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I")
	public static int method1165(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(31) int local31 = (arg0 * local19 >> 12) + 40960;
		return local31 * local13 >> 12;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method1166() {
		aClass10_712 = null;
		aFont1 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method1167() {
		for (@Pc(3) int local3 = -1; local3 < Static54.anInt1354; local3++) {
			@Pc(11) int local11;
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static66.anIntArray175[local3];
			}
			@Pc(21) Class2_Sub1_Sub3_Sub2_Sub1 local21 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local11];
			if (local21 != null) {
				Static48.method889(1, local21);
			}
		}
	}
}
