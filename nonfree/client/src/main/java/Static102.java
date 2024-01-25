import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!e", name = "n", descriptor = "I")
	public static int anInt6216;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array14;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_89 = new Class173(31, -1);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([Ljava/lang/String;[SZII)V")
	public static void method5285(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg3;
		@Pc(14) String local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(28) short local28 = arg1[local8];
		arg1[local8] = arg1[arg2];
		arg1[arg2] = local28;
		for (@Pc(40) int local40 = arg3; local40 < arg2; local40++) {
			if (local14 == null || arg0[local40] != null && arg0[local40].compareTo(local14) < (local40 & 0x1)) {
				@Pc(64) String local64 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local64;
				@Pc(78) short local78 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local78;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg2] = arg1[local10];
		arg1[local10] = local28;
		method5285(arg0, arg1, local10 - 1, arg3);
		method5285(arg0, arg1, arg2, local10 + 1);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5286(@OriginalArg(1) String arg0) {
		if (Class332.aString91.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class332.aString91.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class332.aString91.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method5288() {
		Static499.anInt3412 = 0;
		Static536.anInt9532 = 0;
		Static439.anInt8200 = 0;
		Static116.anInt2680 = 0;
	}
}
