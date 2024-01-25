import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "[I")
	public static final int[] anIntArray126 = new int[13];

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "[Lclient!nfa;")
	public static Class33_Sub1[] aClass33_Sub1Array2 = new Class33_Sub1[0];

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!nfa;ZIZLclient!nfa;)I")
	public static int method1644(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class33_Sub1 arg3) {
		@Pc(16) int local16;
		@Pc(19) int local19;
		if (arg2 == 1) {
			local16 = arg3.anInt6148;
			local19 = arg0.anInt6148;
			if (!arg1) {
				if (local19 == -1) {
					local19 = 2001;
				}
				if (local16 == -1) {
					local16 = 2001;
				}
			}
			return local16 - local19;
		} else if (arg2 == 2) {
			return Static219.method3768(Static266.anInt4796, arg3.method5456().aString65, arg0.method5456().aString65);
		} else if (arg2 == 3) {
			if (arg3.aString63.equals("-")) {
				if (arg0.aString63.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString63.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static219.method3768(Static266.anInt4796, arg3.aString63, arg0.aString63);
			}
		} else if (arg2 == 4) {
			if (arg3.method5452()) {
				return arg0.method5452() ? 0 : 1;
			} else if (arg0.method5452()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg3.method5449()) {
				return arg0.method5449() ? 0 : 1;
			} else if (arg0.method5449()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg3.method5455()) {
				return arg0.method5455() ? 0 : 1;
			} else if (arg0.method5455()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg3.method5451()) {
				return arg0.method5451() ? 0 : 1;
			} else if (arg0.method5451()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local16 = arg3.anInt6154;
			local19 = arg0.anInt6154;
			if (arg1) {
				if (local19 == 1000) {
					local19 = -1;
				}
				if (local16 == 1000) {
					local16 = -1;
				}
			} else {
				if (local19 == -1) {
					local19 = 1000;
				}
				if (local16 == -1) {
					local16 = 1000;
				}
			}
			return local16 - local19;
		} else {
			return arg3.anInt6152 - arg0.anInt6152;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIBI)V")
	public static void method1647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static305.aByteArrayArrayArray18 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
	public static void method1648() {
		Static511.anInt8845 = -1;
		Static606.anInt10177 = 0;
		Static16.anInt249 = -1;
	}
}
