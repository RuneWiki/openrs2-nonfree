import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ala", name = "p", descriptor = "I")
	public static int anInt717;

	@OriginalMember(owner = "client!ala", name = "q", descriptor = "[I")
	public static int[] anIntArray50;

	@OriginalMember(owner = "client!ala", name = "k", descriptor = "I")
	public static int anInt715 = 0;

	@OriginalMember(owner = "client!ala", name = "l", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_13 = new Class397(121, 10);

	@OriginalMember(owner = "client!ala", name = "b", descriptor = "(II)V")
	public static void method649(@OriginalArg(0) int arg0) {
		Static482.anInt7542 = arg0;
	}

	@OriginalMember(owner = "client!ala", name = "a", descriptor = "(II)V")
	public static void method650(@OriginalArg(0) int arg0) {
		if (!Static610.method6274()) {
			return;
		}
		if (Static66.anInt1579 != arg0) {
			Static441.aString88 = "";
		}
		Static66.anInt1579 = arg0;
		Static95.aClass292_1.method6852();
		Static336.method4832(5);
	}

	@OriginalMember(owner = "client!ala", name = "a", descriptor = "(ILclient!of;Lclient!ika;)Lclient!el;")
	public static Class99 method651(@OriginalArg(1) Class275 arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		@Pc(16) Class99 local16 = new Class99(arg0);
		@Pc(20) int local20 = arg1.method2048(255);
		@Pc(29) boolean local29 = (local20 & 0x1) != 0;
		@Pc(38) boolean local38 = (local20 & 0x2) != 0;
		@Pc(47) boolean local47 = (local20 & 0x4) != 0;
		@Pc(59) boolean local59 = (local20 & 0x8) != 0;
		if (local29) {
			local16.anIntArray169[0] = arg1.method2030();
			local16.anIntArray170[0] = arg1.method2030();
			if (arg0.anInt7286 != -1 || arg0.anInt7249 != -1) {
				local16.anIntArray169[1] = arg1.method2030();
				local16.anIntArray170[1] = arg1.method2030();
			}
			if (arg0.anInt7268 != -1 || arg0.anInt7227 != -1) {
				local16.anIntArray169[2] = arg1.method2030();
				local16.anIntArray170[2] = arg1.method2030();
			}
		}
		if (local38) {
			local16.anIntArray171[0] = arg1.method2030();
			local16.anIntArray172[0] = arg1.method2030();
			if (arg0.anInt7229 != -1 || arg0.anInt7292 != -1) {
				local16.anIntArray171[1] = arg1.method2030();
				local16.anIntArray172[1] = arg1.method2030();
			}
		}
		@Pc(183) int local183;
		@Pc(186) int[] local186;
		@Pc(218) int local218;
		if (local47) {
			local183 = arg1.method2028(-14795);
			local186 = new int[] { local183 & 0xF, local183 >> 4 & 0xF, local183 >> 8 & 0xF, local183 >> 12 & 0xF };
			for (local218 = 0; local218 < 4; local218++) {
				if (local186[local218] != 15) {
					local16.aShortArray14[local186[local218]] = (short) arg1.method2028(-14795);
				}
			}
		}
		if (local59) {
			local183 = arg1.method2048(255);
			local186 = new int[] { local183 & 0xF, local183 >> 4 & 0xF };
			for (local218 = 0; local218 < 2; local218++) {
				if (local186[local218] != 15) {
					local16.aShortArray15[local186[local218]] = (short) arg1.method2028(-14795);
				}
			}
		}
		return local16;
	}
}
