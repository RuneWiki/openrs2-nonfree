import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!gp", name = "A", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
	public static int anInt3236 = 13156520;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!in;)Lclient!in;")
	public static Class160 method2765(@OriginalArg(1) Class160 arg0) {
		@Pc(6) Class160 local6 = Static67.method1097(arg0);
		if (local6 == null) {
			local6 = arg0.aClass160_15;
		}
		return local6;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIILclient!cu;)Z")
	public static boolean method2766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class11_Sub1_Sub3 arg3) {
		if (!Static204.aBoolean276) {
			return false;
		} else if (Static397.anInt7106 < 100) {
			return false;
		} else if (Static120.method2175(arg2, arg0, arg1)) {
			@Pc(34) int local34 = arg1 << Static166.anInt7796;
			@Pc(38) int local38 = arg2 << Static166.anInt7796;
			@Pc(48) int local48 = Static310.aClass129Array5[arg0].method6481(arg2, arg1) - 1;
			@Pc(54) int local54 = arg3.method7212() + local48;
			if (arg3.aShort33 == 1) {
				if (!Static561.method7582(local34, local38, local54, Static165.anInt3157 + local38, local34, local48, local38, local54, local34)) {
					return false;
				} else if (Static561.method7582(local34, Static165.anInt3157 + local38, local48, Static165.anInt3157 + local38, local34, local48, local38, local54, local34)) {
					Static276.anInt5044++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort33 == 2) {
				if (!Static561.method7582(local34 + Static165.anInt3157, Static165.anInt3157 + local38, local54, local38 + Static165.anInt3157, local34, local48, Static165.anInt3157 + local38, local54, local34)) {
					return false;
				} else if (Static561.method7582(local34 + Static165.anInt3157, local38 + Static165.anInt3157, local54, Static165.anInt3157 + local38, local34, local48, Static165.anInt3157 + local38, local48, Static165.anInt3157 + local34)) {
					Static276.anInt5044++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort33 == 4) {
				if (!Static561.method7582(local34 + Static165.anInt3157, local38, local54, Static165.anInt3157 + local38, Static165.anInt3157 + local34, local48, local38, local54, Static165.anInt3157 + local34)) {
					return false;
				} else if (Static561.method7582(local34 + Static165.anInt3157, local38 - -Static165.anInt3157, local48, Static165.anInt3157 + local38, Static165.anInt3157 + local34, local48, local38, local54, local34 + Static165.anInt3157)) {
					Static276.anInt5044++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort33 == 8) {
				if (!Static561.method7582(Static165.anInt3157 + local34, local38, local54, local38, local34, local48, local38, local54, local34)) {
					return false;
				} else if (Static561.method7582(Static165.anInt3157 + local34, local38, local54, local38, local34, local48, local38, local48, local34 + Static165.anInt3157)) {
					Static276.anInt5044++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort33 == 16) {
				if (Static396.method1621(Static513.anInt8858, local48, local34, Static513.anInt8858, local54, local38 + Static513.anInt8858)) {
					Static276.anInt5044++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort33 == 32) {
				if (Static396.method1621(Static513.anInt8858, local48, Static513.anInt8858 + local34, Static513.anInt8858, local54, Static513.anInt8858 + local38)) {
					Static276.anInt5044++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort33 == 64) {
				if (Static396.method1621(Static513.anInt8858, local48, local34 + Static513.anInt8858, Static513.anInt8858, local54, local38)) {
					Static276.anInt5044++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort33 != 128) {
				return true;
			} else if (Static396.method1621(Static513.anInt8858, local48, local34, Static513.anInt8858, local54, local38)) {
				Static276.anInt5044++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
