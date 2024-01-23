import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!rl", name = "fb", descriptor = "Lclient!km;")
	public static Class91 aClass91_168;

	@OriginalMember(owner = "client!rl", name = "jb", descriptor = "[Lclient!pn;")
	public static Class1_Sub2_Sub11[] aClass1_Sub2_Sub11Array9;

	@OriginalMember(owner = "client!rl", name = "Q", descriptor = "Lclient!qc;")
	public static Class135 aClass135_28 = new Class135(5);

	@OriginalMember(owner = "client!rl", name = "ab", descriptor = "Z")
	public static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!rl", name = "db", descriptor = "[I")
	public static int[] anIntArray405 = new int[2];

	@OriginalMember(owner = "client!rl", name = "kb", descriptor = "I")
	public static int anInt4573 = 0;

	@OriginalMember(owner = "client!rl", name = "lb", descriptor = "[[B")
	public static byte[][] aByteArrayArray12 = new byte[1000][];

	@OriginalMember(owner = "client!rl", name = "mb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11 = new int[2][][];

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(II)V")
	public static void method3597() {
		Static263.aClass135_37.method3320(5);
		Static244.aClass135_30.method3320(5);
		Static55.aClass135_3.method3320(5);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!km;ILclient!km;)I")
	public static int method3598(@OriginalArg(0) Class91 arg0, @OriginalArg(2) Class91 arg1) {
		@Pc(10) int local10 = 0;
		if (arg0.method2501(Static185.anInt3837)) {
			local10++;
		}
		if (arg0.method2501(Static197.anInt4052)) {
			local10++;
		}
		if (arg0.method2501(Static39.anInt1012)) {
			local10++;
		}
		if (arg1.method2501(Static185.anInt3837)) {
			local10++;
		}
		if (arg1.method2501(Static197.anInt4052)) {
			local10++;
		}
		if (arg1.method2501(Static39.anInt1012)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!km;Lclient!km;ZIB)Lclient!gk;")
	public static Class1_Sub2_Sub10 method3600(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = arg1.method2494(arg2);
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < local12.length; local16++) {
			@Pc(32) byte[] local32 = arg1.method2487(arg2, local12[local16]);
			if (local32 == null) {
				local14 = false;
			} else {
				@Pc(53) int local53 = (local32[0] & 0xFF) << 8 | local32[1] & 0xFF;
				@Pc(69) byte[] local69 = arg0.method2487(local53, 0);
				if (local69 == null) {
					local14 = false;
				}
			}
		}
		if (!local14) {
			return null;
		}
		try {
			return new Class1_Sub2_Sub10(arg1, arg0, arg2, false);
		} catch (@Pc(95) Exception local95) {
			return null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "(I)V")
	public static void method3602() {
		Static123.method2162(0, 0);
	}
}
