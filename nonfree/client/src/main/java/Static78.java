import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!kc", name = "cb", descriptor = "[I")
	public static int[] anIntArray210;

	@OriginalMember(owner = "client!kc", name = "gb", descriptor = "Z")
	public static boolean aBoolean96;

	@OriginalMember(owner = "client!kc", name = "ib", descriptor = "Lclient!ea;")
	public static Class18 aClass18_575 = Static8.method128("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
	public static int anInt2403 = 0;

	@OriginalMember(owner = "client!kc", name = "mb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_576 = Static8.method128("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "(I)V")
	public static void method1712() {
		@Pc(10) int local10;
		for (@Pc(3) int local3 = -1; local3 < Static45.anInt1553; local3++) {
			if (local3 == -1) {
				local10 = 2047;
			} else {
				local10 = Static58.anIntArray140[local3];
			}
			@Pc(20) Class1_Sub1_Sub5_Sub1_Sub2 local20 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local10];
			if (local20 != null && local20.anInt3575 > 0) {
				local20.anInt3575--;
				if (local20.anInt3575 == 0) {
					local20.aClass18_899 = null;
				}
			}
		}
		for (local10 = 0; local10 < Static155.anInt4267; local10++) {
			@Pc(56) int local56 = Static150.anIntArray382[local10];
			@Pc(60) Class1_Sub1_Sub5_Sub1_Sub1 local60 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local56];
			if (local60 != null && local60.anInt3575 > 0) {
				local60.anInt3575--;
				if (local60.anInt3575 == 0) {
					local60.aClass18_899 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	public static void method1713() {
		aClass18_576 = null;
		anIntArray210 = null;
		aClass18_575 = null;
	}
}
