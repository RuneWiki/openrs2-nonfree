import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Lclient!in;")
	public static final Class169 aClass169_223 = new Class169(6, -2);

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Z")
	public static boolean aBoolean680 = false;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public static int anInt9366 = -1;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IZ)V")
	public static void method8254() {
		@Pc(22) Class2_Sub52 local22 = Static311.method5098(Static570.aClass341_95, Static125.aClass179_1);
		Static38.method791(local22);
		for (@Pc(30) Class2_Sub20 local30 = (Class2_Sub20) Static507.aClass335_33.method8358(); local30 != null; local30 = (Class2_Sub20) Static507.aClass335_33.method8355()) {
			if (!local30.method9823()) {
				local30 = (Class2_Sub20) Static507.aClass335_33.method8358();
				if (local30 == null) {
					break;
				}
			}
			if (local30.anInt1668 == 0) {
				Static349.method6045(true, local30, true);
			}
		}
		if (Static122.aClass357_40 != null) {
			Static473.method7526(Static122.aClass357_40);
			Static122.aClass357_40 = null;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB)Z")
	public static boolean method8257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static345.method5979(arg0, arg1) || Static318.method5257(arg0, arg1) || Static329.method5444(arg1, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Lclient!jg;")
	public static Class2_Sub33 method8258() {
		if (Static331.aClass271_65 == null || Static567.aClass370_1 == null) {
			return null;
		}
		Static567.aClass370_1.method9307(Static331.aClass271_65);
		@Pc(18) Class2_Sub33 local18 = (Class2_Sub33) Static567.aClass370_1.method9306();
		if (local18 == null) {
			return null;
		} else {
			@Pc(28) Class218 local28 = Static331.aClass5_4.method94(local18.anInt5215);
			return local28 != null && local28.aBoolean506 && local28.method6003(Static331.anInterface15_2) ? local18 : Static305.method5017();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public static void method8259() {
		Static130.anInt2508 = 0;
		Static7.anInt133 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static395.anInt7388; local11++) {
			@Pc(17) int local17 = Static19.anInt353 * local11;
			for (@Pc(19) int local19 = 0; local19 < Static19.anInt353; local19++) {
				@Pc(26) int local26 = local17 + local19;
				Static17.anInterface17Array7[local26].method9555(Static532.anInt9333 * local19, local11 * Static341.anInt6402, Static532.anInt9333, Static341.anInt6402, true);
			}
		}
	}
}
