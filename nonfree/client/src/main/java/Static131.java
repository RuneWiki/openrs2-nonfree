import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3 aClass4_Sub3_Sub6_Sub3_6;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	public static int anInt2918;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "Lclient!od;")
	public static Class60 aClass60_1132 = null;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "[Lclient!od;")
	public static Class60[] aClass60Array23 = new Class60[1000];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z")
	public static boolean method1977(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public static void method1978() {
		for (@Pc(11) Class4_Sub18 local11 = (Class4_Sub18) Static78.aClass75_10.method1897(); local11 != null; local11 = (Class4_Sub18) Static78.aClass75_10.method1891()) {
			@Pc(16) int local16 = local11.anInt2589;
			if (Static118.method1894(local16)) {
				@Pc(22) boolean local22 = true;
				@Pc(26) Class4_Sub14[] local26 = Static82.aClass4_Sub14ArrayArray1[local16];
				for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
					if (local26[local28] != null) {
						local22 = local26[local28].aBoolean95;
						break;
					}
				}
				if (!local22) {
					@Pc(56) int local56 = (int) local11.aLong100;
					@Pc(60) Class4_Sub14 local60 = Static61.method991(local56);
					if (local60 != null) {
						Static36.method558(local60);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method1979(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	public static void method1980() {
		aClass60_1132 = null;
		aClass4_Sub3_Sub6_Sub3_6 = null;
		aClass60Array23 = null;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
	public static void method1981() {
		Static50.aClass12_11.method284();
	}
}
