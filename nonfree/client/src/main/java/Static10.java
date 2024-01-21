import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "Lclient!ea;")
	public static Class20 aClass20_8;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	public static int anInt206 = 0;

	@OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
	public static int anInt209 = -1;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
	public static void method162() {
		for (@Pc(3) int local3 = 0; local3 < Static84.anInt2255; local3++) {
			@Pc(9) int local9 = Static13.anIntArray33[local3];
			@Pc(13) Class4_Sub1_Sub3_Sub2_Sub2 local13 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local9];
			if (local13 != null) {
				Static27.method436(local13.aClass4_Sub1_Sub10_1.anInt2153, local13);
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method163() {
		if (Static21.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static76.anIntArray201[191] = 73;
			Static76.anIntArray201[220] = 74;
			Static76.anIntArray201[190] = 72;
			Static76.anIntArray201[222] = 59;
			Static76.anIntArray201[221] = 43;
			Static76.anIntArray201[219] = 42;
			Static76.anIntArray201[223] = 28;
			Static76.anIntArray201[187] = 27;
			Static76.anIntArray201[189] = 26;
			Static76.anIntArray201[192] = 58;
			Static76.anIntArray201[188] = 71;
			Static76.anIntArray201[186] = 57;
			return;
		}
		Static76.anIntArray201[92] = 74;
		Static76.anIntArray201[61] = 27;
		Static76.anIntArray201[46] = 72;
		if (Static21.aMethod1 == null) {
			Static76.anIntArray201[192] = 58;
			Static76.anIntArray201[222] = 59;
		} else {
			Static76.anIntArray201[222] = 58;
			Static76.anIntArray201[520] = 59;
			Static76.anIntArray201[192] = 28;
		}
		Static76.anIntArray201[44] = 71;
		Static76.anIntArray201[93] = 43;
		Static76.anIntArray201[47] = 73;
		Static76.anIntArray201[59] = 57;
		Static76.anIntArray201[45] = 26;
		Static76.anIntArray201[91] = 42;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	public static void method164() {
		aClass20_8 = null;
	}
}
