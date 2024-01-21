import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
	public static int anInt1421;

	@OriginalMember(owner = "client!kb", name = "U", descriptor = "Lclient!r;")
	public static Class70 aClass70_4;

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "Lclient!pe;")
	public static Class65 aClass65_619 = Static119.method1462("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
	public static int anInt1425 = 0;

	@OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
	public static int anInt1426 = 1;

	@OriginalMember(owner = "client!kb", name = "W", descriptor = "[I")
	public static int[] anIntArray176 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!kb", name = "X", descriptor = "Lclient!pe;")
	public static Class65 aClass65_620 = Static119.method1462("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_621 = Static119.method1462("OFF");

	@OriginalMember(owner = "client!kb", name = "fb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_622 = Static119.method1462("mapback");

	@OriginalMember(owner = "client!kb", name = "kb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_623 = aClass65_621;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public static void method1067() {
		aClass65_619 = null;
		aClass65_620 = null;
		aClass65_622 = null;
		anIntArray176 = null;
		aClass65_623 = null;
		aClass65_621 = null;
		aClass70_4 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIB)I")
	public static int method1071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 2) {
			@Pc(22) int local22 = method1071(arg0 >> 1, arg1 * arg1);
			if ((arg0 & 0x1) != 0) {
				local22 *= arg1;
			}
			return local22;
		} else if (arg0 == 1) {
			return arg1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!na;Lclient!pe;Lclient!pe;I)Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2 method1073(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(8) int local8 = arg0.method1690(arg2);
		@Pc(19) int local19 = arg0.method1667(arg1, local8);
		return Static76.method1281(local19, arg0, local8);
	}
}
