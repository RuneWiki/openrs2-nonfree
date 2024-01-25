import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "Lclient!fea;")
	public static Class122 aClass122_1;

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "[I")
	public static int[] anIntArray143 = new int[2];

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
	public static final int anInt2520 = 1;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V")
	public static void method2205() {
		if (Static107.anInt1746 == 3) {
			Static21.method316(4);
		} else if (Static107.anInt1746 == 7) {
			Static21.method316(8);
		} else if (Static107.anInt1746 == 10) {
			Static21.method316(11);
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!d;Lclient!la;I)V")
	public static void method2206(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class208 arg1) {
		Static156.anInterface1_3 = arg0;
		Static206.aClass208_52 = arg1;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZLclient!ib;)Lclient!lr;")
	public static Class225 method2207(@OriginalArg(1) Class5_Sub23 arg0) {
		@Pc(13) int local13 = arg0.method8529();
		@Pc(20) Class219 local20 = Static67.method1093()[arg0.method8529()];
		@Pc(27) Class368 local27 = Static290.method4382()[arg0.method8529()];
		@Pc(31) int local31 = arg0.method8516();
		@Pc(35) int local35 = arg0.method8516();
		@Pc(39) int local39 = arg0.method8519();
		@Pc(43) int local43 = arg0.method8519();
		@Pc(47) int local47 = arg0.method8527();
		@Pc(51) int local51 = arg0.method8527();
		@Pc(55) int local55 = arg0.method8527();
		@Pc(65) boolean local65 = arg0.method8529() == 1;
		return new Class225(local13, local20, local27, local31, local35, local39, local43, local47, local51, local55, local65);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
	public static void method2208() {
		if (Static359.aString87.toLowerCase().indexOf("microsoft") != -1) {
			Static319.anIntArray315[189] = 26;
			Static319.anIntArray315[223] = 28;
			Static319.anIntArray315[186] = 57;
			Static319.anIntArray315[192] = 58;
			Static319.anIntArray315[219] = 42;
			Static319.anIntArray315[221] = 43;
			Static319.anIntArray315[190] = 72;
			Static319.anIntArray315[187] = 27;
			Static319.anIntArray315[191] = 73;
			Static319.anIntArray315[188] = 71;
			Static319.anIntArray315[222] = 59;
			Static319.anIntArray315[220] = 74;
			return;
		}
		Static319.anIntArray315[46] = 72;
		Static319.anIntArray315[61] = 27;
		Static319.anIntArray315[59] = 57;
		Static319.anIntArray315[47] = 73;
		Static319.anIntArray315[92] = 74;
		Static319.anIntArray315[44] = 71;
		Static319.anIntArray315[91] = 42;
		Static319.anIntArray315[45] = 26;
		Static319.anIntArray315[93] = 43;
		if (Static359.aMethod1 == null) {
			Static319.anIntArray315[222] = 59;
			Static319.anIntArray315[192] = 58;
		} else {
			Static319.anIntArray315[520] = 59;
			Static319.anIntArray315[192] = 28;
			Static319.anIntArray315[222] = 58;
		}
	}
}
