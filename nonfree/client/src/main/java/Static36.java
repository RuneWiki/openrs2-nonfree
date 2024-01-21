import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!de", name = "j", descriptor = "[I")
	public static int[] anIntArray74;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!de", name = "m", descriptor = "I")
	public static int anInt977;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!gg;")
	private static Class28 aClass28_577 = Static107.method1838("wave:");

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!gg;")
	public static Class28 aClass28_574 = aClass28_577;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	public static int anInt975 = 99;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	public static int anInt976 = 0;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Lclient!gg;")
	public static Class28 aClass28_575 = Static107.method1838("Registrierter Benutzer");

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!gg;")
	public static Class28 aClass28_576 = aClass28_577;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Lclient!gg;")
	public static Class28 aClass28_578 = Static107.method1838("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method665() {
		aClass28_578 = null;
		aClass28_575 = null;
		anIntArray74 = null;
		aShortArrayArray2 = null;
		aClass28_577 = null;
		aClass28_576 = null;
		aClass28_574 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZI)I")
	public static int method666(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub11 local15 = (Class2_Sub11) Static101.aClass35_6.method1354((long) arg1);
		if (local15 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local15.anIntArray203.length) {
			return local15.anIntArray203[arg0];
		} else {
			return -1;
		}
	}
}
