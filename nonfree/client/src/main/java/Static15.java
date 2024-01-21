import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!bc", name = "gb", descriptor = "I")
	public static int anInt404;

	@OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
	public static int anInt400 = -1;

	@OriginalMember(owner = "client!bc", name = "jb", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!bc", name = "pb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_309 = Static118.method2249("Art");

	@OriginalMember(owner = "client!bc", name = "ub", descriptor = "I")
	public static int anInt416 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lclient!ve;")
	public static Class1_Sub2_Sub24 method282(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub2_Sub24 local15 = (Class1_Sub2_Sub24) Static58.aClass87_30.method3062((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static180.aClass60_35.method2340(arg0, 27);
		local15 = new Class1_Sub2_Sub24();
		if (local25 != null) {
			local15.method3205(new Class1_Sub14(local25));
		}
		Static58.aClass87_30.method3068(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[Lclient!wd;)V")
	public static void method284(@OriginalArg(1) int arg0, @OriginalArg(2) Class97[] arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1.length; local10++) {
			@Pc(15) Class97 local15 = arg1[local10];
			if (local15 != null) {
				if (local15.anInt4329 == 0) {
					if (local15.aClass97Array2 != null) {
						method284(arg0, local15.aClass97Array2);
					}
					@Pc(36) Class1_Sub20 local36 = (Class1_Sub20) Static200.aClass99_14.method3292((long) local15.anInt4376);
					if (local36 != null) {
						Static123.method2354(local36.anInt3111, arg0);
					}
				}
				@Pc(52) Class1_Sub26 local52;
				if (arg0 == 0 && local15.anObjectArray29 != null) {
					local52 = new Class1_Sub26();
					local52.aClass97_14 = local15;
					local52.anObjectArray3 = local15.anObjectArray29;
					Static94.method1780(local52);
				}
				if (arg0 == 1 && local15.anObjectArray8 != null) {
					if (local15.anInt4330 >= 0) {
						@Pc(76) Class97 local76 = Static154.method2691(local15.anInt4376);
						if (local76 == null || local76.aClass97Array2 == null || local15.anInt4330 >= local76.aClass97Array2.length || local76.aClass97Array2[local15.anInt4330] != local15) {
							continue;
						}
					}
					local52 = new Class1_Sub26();
					local52.anObjectArray3 = local15.anObjectArray8;
					local52.aClass97_14 = local15;
					Static94.method1780(local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method285(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BII)V")
	public static void method287(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static135.anInt3352 != 0 && arg0 != -1) {
			Static165.method2842(Static90.aClass60_Sub1_168, Static135.anInt3352, arg0);
			Static128.aBoolean132 = true;
		}
	}
}
