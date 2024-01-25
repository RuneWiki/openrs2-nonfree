import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cfa", name = "E", descriptor = "I")
	public static int anInt1565;

	@OriginalMember(owner = "client!cfa", name = "C", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_36 = new Class319(49, 3);

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!wv;B)Lclient!wv;")
	public static Class365 method1426(@OriginalArg(0) Class365 arg0) {
		@Pc(11) Class365 local11 = Static72.method1568(arg0);
		if (local11 == null) {
			local11 = arg0.aClass365_17;
		}
		return local11;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method1427(@OriginalArg(2) String arg0) {
		return Static456.method6391(arg0, 16);
	}

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "(I)V")
	public static void method1429() {
		if (Static102.anInt2115 == 1 || Static102.anInt2115 == 3 || Static442.anInt7704 != Static102.anInt2115 && (Static102.anInt2115 == 0 || Static442.anInt7704 == 0)) {
			Static491.anInt1754 = 0;
			Static480.anInt8097 = 0;
			Static131.aClass356_32.method7802();
		}
		Static442.anInt7704 = Static102.anInt2115;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIZ)V")
	public static void method1430(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class1_Sub46 local10 = Static365.method5363(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray577.length; local15++) {
				local10.anIntArray577[local15] = -1;
				local10.anIntArray576[local15] = 0;
			}
		}
	}
}
