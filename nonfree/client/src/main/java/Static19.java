import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!cd", name = "eb", descriptor = "Lclient!c;")
	public static Class10 aClass10_21;

	@OriginalMember(owner = "client!cd", name = "Z", descriptor = "Lclient!ai;")
	private static Class6 aClass6_144 = Static38.method685("Type");

	@OriginalMember(owner = "client!cd", name = "Q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_143 = aClass6_144;

	@OriginalMember(owner = "client!cd", name = "U", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
	public static int anInt509 = 0;

	@OriginalMember(owner = "client!cd", name = "cb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_145 = Static38.method685("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
	public static void method371() {
		aClass6_145 = null;
		aClass6_143 = null;
		aClass6_144 = null;
		aClass10_21 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!c;Lclient!c;Lclient!c;B)V")
	public static void method372(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) Class10 arg2) {
		Static42.aClass10_49 = arg2;
		Static159.aClass10_129 = arg1;
		Static87.aClass10_73 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V")
	public static void method373() {
		if (Static16.aClass43_1 != null) {
			Static16.aClass43_1.method1236();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)V")
	public static void method374(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class2_Sub3_Sub7 local3 = Static22.method391(arg0);
		@Pc(10) int local10 = local3.anInt1472;
		@Pc(21) int local21 = local3.anInt1481;
		@Pc(24) int local24 = local3.anInt1473;
		@Pc(31) int local31 = Class2_Sub3_Sub11.anIntArray177[local24 - local21];
		if (arg1 < 0 || local31 < arg1) {
			arg1 = 0;
		}
		local31 <<= local21;
		Static11.anIntArray9[local10] = arg1 << local21 & local31 | Static11.anIntArray9[local10] & ~local31;
	}
}
