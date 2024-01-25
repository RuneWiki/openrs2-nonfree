import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cr", name = "A", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!cr", name = "B", descriptor = "F")
	public static float aFloat16;

	@OriginalMember(owner = "client!cr", name = "D", descriptor = "[[I")
	public static int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "[Lclient!vs;")
	public static final Class3_Sub3_Sub17[] aClass3_Sub3_Sub17Array1 = new Class3_Sub3_Sub17[14];

	@OriginalMember(owner = "client!cr", name = "w", descriptor = "Lclient!et;")
	public static final Class65 aClass65_1 = new Class65();

	@OriginalMember(owner = "client!cr", name = "z", descriptor = "Lclient!la;")
	public static final Class136 aClass136_26 = new Class136(20, 4);

	@OriginalMember(owner = "client!cr", name = "E", descriptor = "F")
	public static float aFloat17 = 1.0F;

	@OriginalMember(owner = "client!cr", name = "F", descriptor = "[I")
	public static final int[] anIntArray57 = new int[1];

	@OriginalMember(owner = "client!cr", name = "G", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_34 = new Class163(71, 7);

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(II)V")
	public static void method1134() {
		Static28.anInt494 = 0;
		Static111.anInt1973 = 2;
		Static63.anInt7101 = 1;
		Static134.aBoolean185 = false;
		Static88.anInt1592 = -1;
		Static107.anInt1917 = -1;
		Static395.aClass250_95 = null;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method1135(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static12.anInt180; local19++) {
			if (arg0.equalsIgnoreCase(Static296.aStringArray32[local19])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static203.aClass1_Sub2_Sub6_Sub2_1.aString69);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1136(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
	public static void method1138() {
		if (Static367.anInt6206 <= 0) {
			Static121.aString29 = "";
			return;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static363.aStringArray39.length; local18++) {
			if (Static363.aStringArray39[local18].startsWith("--> ")) {
				local16++;
				if (local16 == Static367.anInt6206) {
					Static121.aString29 = Static363.aStringArray39[local18].substring(4);
					return;
				}
			}
		}
	}
}
