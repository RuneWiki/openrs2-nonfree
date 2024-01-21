import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "J")
	public static long aLong99;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
	public static int anInt2709;

	@OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
	public static int anInt2716;

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
	public static int anInt2717;

	@OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
	public static int anInt2718;

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1590 = Static107.method1838("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "[I")
	public static int[] anIntArray261 = new int[200];

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1591 = Static107.method1838("Fertigkeit)2");

	@OriginalMember(owner = "client!nf", name = "G", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1592 = Static107.method1838("title_mute");

	@OriginalMember(owner = "client!nf", name = "H", descriptor = "J")
	public static long aLong100 = 0L;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
	public static void method1889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass64_1 = null;
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	public static void method1890() {
		aClass28_1590 = null;
		aClass28_1592 = null;
		anIntArray261 = null;
		aClass28_1591 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZI)Lclient!gg;")
	public static Class28 method1891(@OriginalArg(2) int arg0) {
		return Static142.method2254(true, arg0);
	}
}
