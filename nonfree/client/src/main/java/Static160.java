import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
	public static final int anInt3293 = 2;

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_108 = new Class18(11, 16);

	@OriginalMember(owner = "client!ka", name = "U", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[200];

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[5];

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
	public static void method3013() {
		Static224.aClass115_1.method4523();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static20.aLongArray2[local10] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static230.aLongArray4[local30] = 0L;
		}
		Static152.anInt3171 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)Z")
	public static boolean method3014(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static9.aClass63_1.method4657();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static9.aClass63_1.method4591();
		} else if (!Static9.aClass63_1.method4648()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static271.aBoolean33 = arg0;
			Static206.method4914(Static227.aClass75_5);
			return true;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3015(@OriginalArg(1) String arg0) {
		if (Static282.aStringArray33 == null) {
			Static359.method5945();
		}
		@Pc(14) String[] local14 = Static143.method2850('\n', arg0);
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			for (@Pc(24) int local24 = Static13.anInt332; local24 > 0; local24--) {
				Static282.aStringArray33[local24] = Static282.aStringArray33[local24 - 1];
			}
			Static282.aStringArray33[0] = local14[local20];
			if (Static13.anInt332 < Static282.aStringArray33.length - 1) {
				Static13.anInt332++;
				if (Static24.anInt577 > 0) {
					Static24.anInt577++;
				}
			}
		}
	}
}
