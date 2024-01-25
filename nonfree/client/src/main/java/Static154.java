import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!gaa", name = "h", descriptor = "J")
	public static long aLong90;

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "Z")
	public static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "([Ljava/lang/String;[SIBI)V")
	public static void method2220(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) String local20 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local20;
		@Pc(34) short local34 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg2; local46++) {
			if (local20 == null || arg0[local46] != null && arg0[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(67) String local67 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local67;
				@Pc(81) short local81 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16++] = local81;
			}
		}
		arg0[arg2] = arg0[local16];
		arg0[local16] = local20;
		arg1[arg2] = arg1[local16];
		arg1[local16] = local34;
		method2220(arg0, arg1, local16 - 1, arg3);
		method2220(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I[Lclient!f;)V")
	public static void method2221(@OriginalArg(1) Class22[] arg0) {
		Static389.anInt6691 = arg0.length;
		Static104.aClass22Array5 = new Class22[Static389.anInt6691 + 10];
		Static550.anIntArray689 = new int[Static389.anInt6691 + 10];
		Static598.method1175(arg0, 0, Static104.aClass22Array5, 0, Static389.anInt6691);
		for (@Pc(26) int local26 = 0; local26 < Static389.anInt6691; local26++) {
			Static550.anIntArray689[local26] = Static104.aClass22Array5[local26].ca();
		}
		for (@Pc(47) int local47 = Static389.anInt6691; local47 < Static104.aClass22Array5.length; local47++) {
			Static550.anIntArray689[local47] = 12;
		}
	}
}
