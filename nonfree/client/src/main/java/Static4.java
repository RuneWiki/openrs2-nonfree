import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
	public static int anInt127;

	@OriginalMember(owner = "client!ad", name = "jb", descriptor = "Lclient!fb;")
	public static Class3_Sub2_Sub2_Sub4 aClass3_Sub2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ad", name = "gb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_37 = Static170.method3101("Hidden");

	@OriginalMember(owner = "client!ad", name = "kb", descriptor = "Lclient!pa;")
	public static Class63 aClass63_1 = new Class63(500);

	@OriginalMember(owner = "client!ad", name = "lb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_38 = Static170.method3101("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!ad", name = "mb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_39 = aClass28_37;

	@OriginalMember(owner = "client!ad", name = "nb", descriptor = "I")
	public static int anInt128 = 0;

	@OriginalMember(owner = "client!ad", name = "ob", descriptor = "Lclient!eh;")
	public static Class28 aClass28_40 = Static170.method3101("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ad", name = "qb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_41 = Static170.method3101("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
	public static void method95() {
		aClass63_1 = null;
		aClass28_37 = null;
		aClass28_41 = null;
		aClass3_Sub2_Sub2_Sub4_1 = null;
		aClass28_40 = null;
		aClass28_38 = null;
		aClass28_39 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([Lclient!eh;B)Lclient!eh;")
	public static Class28 method96(@OriginalArg(0) Class28[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static63.method1492(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!gf;B)I")
	public static int method97(@OriginalArg(0) Class33 arg0) {
		@Pc(18) Class3_Sub24 local18 = (Class3_Sub24) Static30.aClass87_3.method3201(((long) arg0.anInt1471 << 32) + (long) arg0.anInt1496);
		return local18 == null ? arg0.anInt1479 : local18.anInt3994;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)V")
	public static void method98(@OriginalArg(0) int arg0) {
		@Pc(18) Class3_Sub15 local18 = (Class3_Sub15) Static1.aClass87_1.method3201((long) arg0);
		if (local18 != null) {
			local18.method3167();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIBI)I")
	public static int method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}
}
