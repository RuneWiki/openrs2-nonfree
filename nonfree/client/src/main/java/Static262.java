import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!kw", name = "Y", descriptor = "F")
	public static float aFloat184;

	@OriginalMember(owner = "client!kw", name = "P", descriptor = "I")
	public static int anInt7124 = -1;

	@OriginalMember(owner = "client!kw", name = "Db", descriptor = "I")
	public static int anInt7160 = 0;

	@OriginalMember(owner = "client!kw", name = "Pd", descriptor = "I")
	public static int anInt7270 = 0;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(III)Z")
	public static boolean method6141(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(III)V")
	public static void method6148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static399.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass1_Sub2_3 != null) {
			local7.aClass1_Sub2_3 = null;
		}
		if (local7.aClass1_Sub2_2 != null) {
			local7.aClass1_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "(Z)V")
	public static void method6201() {
		if (Static482.aString183.toLowerCase().indexOf("microsoft") != -1) {
			Static215.anIntArray622[189] = 26;
			Static215.anIntArray622[221] = 43;
			Static215.anIntArray622[222] = 59;
			Static215.anIntArray622[192] = 58;
			Static215.anIntArray622[186] = 57;
			Static215.anIntArray622[187] = 27;
			Static215.anIntArray622[219] = 42;
			Static215.anIntArray622[188] = 71;
			Static215.anIntArray622[220] = 74;
			Static215.anIntArray622[191] = 73;
			Static215.anIntArray622[223] = 28;
			Static215.anIntArray622[190] = 72;
			return;
		}
		Static215.anIntArray622[92] = 74;
		Static215.anIntArray622[45] = 26;
		Static215.anIntArray622[59] = 57;
		Static215.anIntArray622[91] = 42;
		Static215.anIntArray622[46] = 72;
		Static215.anIntArray622[44] = 71;
		Static215.anIntArray622[93] = 43;
		Static215.anIntArray622[61] = 27;
		if (Static482.aMethod1 == null) {
			Static215.anIntArray622[222] = 59;
			Static215.anIntArray622[192] = 58;
		} else {
			Static215.anIntArray622[192] = 28;
			Static215.anIntArray622[520] = 59;
			Static215.anIntArray622[222] = 58;
		}
		Static215.anIntArray622[47] = 73;
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(III)Z")
	public static boolean method6209(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
