import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fl", name = "Q", descriptor = "Ljava/lang/Class;")
	public static Class aClass6;

	@OriginalMember(owner = "client!fl", name = "L", descriptor = "[I")
	public static int[] anIntArray187 = new int[1];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3293(@OriginalArg(1) String arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static205.aStringArray17.length; local13++) {
			if (Static205.aStringArray17[local13].equalsIgnoreCase(arg0)) {
				return local13;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V")
	public static void method3296(@OriginalArg(1) boolean arg0) {
		@Pc(3) Class260[] local3 = Static525.aClass260Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class260 local11 = local3[local5];
			local11.method6400();
		}
		Static78.method1078();
		Static375.method5662();
		Static460.method7012();
		for (@Pc(34) int local34 = 0; local34 < 4; local34++) {
			Static669.aClass356Array1[local34].method8400();
		}
		Static159.method3128(false);
		System.gc();
		Static476.method7131();
		Static588.aBoolean698 = false;
		Static478.anInt8119 = -1;
		Static666.method8844();
		Static658.method8776(true);
		Static91.method1335();
		Static199.method3721((byte) -126);
		Static18.method227();
		if (arg0) {
			Static307.method4889(13);
			return;
		}
		Static307.method4889(3);
		try {
			Static692.method2495("loggedout", Static371.anApplet1);
		} catch (@Pc(96) Throwable local96) {
		}
	}
}
