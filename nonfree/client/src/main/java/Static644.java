import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "I")
	public static int anInt10625;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IB)C")
	public static char method9020(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(46) char local46 = Static555.aCharArray6[local12 - 128];
			if (local46 == '\u0000') {
				local46 = '?';
			}
			local12 = local46;
		}
		return (char) local12;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIB)I")
	public static int method9021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static11.aClass61Array1 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 9;
		@Pc(15) int local15 = arg0 >> 9;
		if (local11 < 0 || local15 < 0 || Static326.anInt5541 - 1 < local11 || Static448.anInt7637 - 1 < local15) {
			return 0;
		}
		@Pc(51) int local51 = arg2;
		if (arg2 < 3 && (Static305.aByteArrayArrayArray18[1][local11][local15] & 0x2) != 0) {
			local51 = arg2 + 1;
		}
		return Static11.aClass61Array1[local51].method8584(arg0, arg1);
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
	public static void method9022() {
		if (!Static358.aBoolean432) {
			Static216.aFloat87 += (-12.0F - Static216.aFloat87) / 2.0F;
			Static358.aBoolean432 = true;
			Static187.aBoolean232 = true;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
	public static void method9023() {
		if (Static144.aString32.toLowerCase().indexOf("microsoft") != -1) {
			Static180.anIntArray176[223] = 28;
			Static180.anIntArray176[220] = 74;
			Static180.anIntArray176[219] = 42;
			Static180.anIntArray176[187] = 27;
			Static180.anIntArray176[221] = 43;
			Static180.anIntArray176[189] = 26;
			Static180.anIntArray176[190] = 72;
			Static180.anIntArray176[222] = 59;
			Static180.anIntArray176[186] = 57;
			Static180.anIntArray176[192] = 58;
			Static180.anIntArray176[191] = 73;
			Static180.anIntArray176[188] = 71;
			return;
		}
		if (Static144.aMethod1 == null) {
			Static180.anIntArray176[222] = 59;
			Static180.anIntArray176[192] = 58;
		} else {
			Static180.anIntArray176[520] = 59;
			Static180.anIntArray176[192] = 28;
			Static180.anIntArray176[222] = 58;
		}
		Static180.anIntArray176[44] = 71;
		Static180.anIntArray176[45] = 26;
		Static180.anIntArray176[91] = 42;
		Static180.anIntArray176[61] = 27;
		Static180.anIntArray176[92] = 74;
		Static180.anIntArray176[47] = 73;
		Static180.anIntArray176[93] = 43;
		Static180.anIntArray176[59] = 57;
		Static180.anIntArray176[46] = 72;
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(B)V")
	public static void method9024() {
		Static404.aClass5_Sub1_Sub5_2.method8318();
		Static72.anInt1497 = 1;
		Static217.aClass207_53 = null;
		Static591.aClass5_Sub1_Sub5_4 = null;
	}
}
