import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "Z")
	public static boolean aBoolean548;

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_259 = new Class123(22, -2);

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
	public static int anInt7896 = 0;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IB)I")
	public static int method6192(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(CI)C")
	public static char method6194(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)[Lclient!ja;")
	public static Class154[] method6195() {
		return new Class154[] { Static580.aClass154_15, Static511.aClass154_14, Static232.aClass154_11 };
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IZLclient!sp;[I)V")
	public static void method6196(@OriginalArg(0) int arg0, @OriginalArg(2) Class25_Sub2_Sub2_Sub5_Sub2 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg1.anIntArray508 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg1.anIntArray508.length; local12++) {
				if (arg2[local12] != arg1.anIntArray508[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg1.anInt8545 != -1) {
				@Pc(49) Class270 local49 = Static245.aClass155_1.method3820(arg1.anInt8545);
				@Pc(52) int local52 = local49.anInt7686;
				if (local52 == 1) {
					arg1.anInt8539 = 0;
					arg1.anInt8526 = 1;
					arg1.anInt8543 = 0;
					arg1.anInt8492 = arg0;
					arg1.anInt8521 = 0;
					if (!arg1.aBoolean578) {
						Static217.method3600(arg1.anInt8539, arg1, local49);
					}
				}
				if (local52 == 2) {
					arg1.anInt8543 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg2.length; local12++) {
			if (arg2[local12] != -1) {
				local10 = false;
			}
			if (arg1.anIntArray508 == null || arg1.anIntArray508[local12] == -1 || Static245.aClass155_1.method3820(arg2[local12]).anInt7694 >= Static245.aClass155_1.method3820(arg1.anIntArray508[local12]).anInt7694) {
				arg1.anIntArray508 = arg2;
				arg1.anInt8578 = arg1.anInt8580;
				arg1.anInt8492 = arg0;
			}
		}
		if (local10) {
			arg1.anInt8578 = arg1.anInt8580;
			arg1.anInt8492 = arg0;
			arg1.anIntArray508 = arg2;
		}
	}
}
