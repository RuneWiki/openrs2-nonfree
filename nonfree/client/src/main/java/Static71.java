import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!j", name = "cb", descriptor = "Lclient!f;")
	public static Class13 aClass13_13;

	@OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
	public static int anInt1634;

	@OriginalMember(owner = "client!j", name = "U", descriptor = "Lclient!sd;")
	public static Class73 aClass73_884 = Static122.method531("");

	@OriginalMember(owner = "client!j", name = "ab", descriptor = "[I")
	public static int[] anIntArray175 = new int[4000];

	@OriginalMember(owner = "client!j", name = "db", descriptor = "I")
	public static int anInt1633 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B[Lclient!vd;I)V")
	public static void method1254(@OriginalArg(1) Class83[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class83 local17 = arg0[local11];
			if (local17 != null) {
				if (local17.anInt3722 == 0) {
					if (local17.aClass83Array2 != null) {
						method1254(local17.aClass83Array2, arg1);
					}
					@Pc(41) Class3_Sub13 local41 = (Class3_Sub13) Static91.aClass16_9.method554((long) local17.anInt3676);
					if (local41 != null) {
						Static148.method2412(arg1, local41.anInt1133);
					}
				}
				@Pc(60) Class3_Sub17 local60;
				if (arg1 == 0 && local17.anObjectArray5 != null) {
					local60 = new Class3_Sub17();
					local60.aClass83_13 = local17;
					local60.anObjectArray3 = local17.anObjectArray5;
					Static148.method2418(local60);
				}
				if (arg1 == 1 && local17.anObjectArray21 != null) {
					if (local17.anInt3677 >= 0) {
						@Pc(89) Class83 local89 = Static80.method1396(local17.anInt3676);
						if (local89 == null || local89.aClass83Array2 == null || local17.anInt3677 >= local89.aClass83Array2.length || local89.aClass83Array2[local17.anInt3677] != local17) {
							continue;
						}
					}
					local60 = new Class3_Sub17();
					local60.aClass83_13 = local17;
					local60.anObjectArray3 = local17.anObjectArray21;
					Static148.method2418(local60);
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method1255(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
	public static void method1256() {
		anIntArray175 = null;
		aClass73_884 = null;
		aClass13_13 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!f;Lclient!f;Lclient!f;Lclient!f;)V")
	public static void method1257(@OriginalArg(1) Class13 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) Class13 arg3) {
		Static158.aClass13_28 = arg0;
		Static63.aClass13_12 = arg3;
		Static165.aClass13_3 = arg1;
		Static72.aClass13_14 = arg2;
		Static57.aClass83ArrayArray1 = new Class83[Static63.aClass13_12.method352()][];
		Static175.aBooleanArray18 = new boolean[Static63.aClass13_12.method352()];
	}
}
