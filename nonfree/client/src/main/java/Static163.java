import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public static int anInt3317;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array9;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "F")
	public static float aFloat117;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2969(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!jn;[IILclient!jn;)V")
	public static void method2970(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class176 arg2) {
		Static114.aClass176_130 = arg2;
		if (arg1 != null) {
			Static566.anIntArray532 = arg1;
		}
		Static478.aClass176_116 = arg0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ec;I)V")
	public static void method2973(@OriginalArg(0) Class1_Sub4_Sub2_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt8413 == Static106.anInt2418 || arg0.anInt8412 == -1 || arg0.anInt8378 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class365 local29 = Static61.aClass48_1.method1016(arg0.anInt8412);
			if (local29.aBoolean721 || local29.anIntArray552[arg0.anInt8391] < arg0.anInt8433 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(61) int local61 = arg0.anInt8413 - arg0.anInt8426;
			@Pc(66) int local66 = Static106.anInt2418 - arg0.anInt8426;
			@Pc(78) int local78 = arg0.anInt8382 * 512 + arg0.method6925() * 256;
			@Pc(90) int local90 = arg0.anInt8423 * 512 + arg0.method6925() * 256;
			@Pc(101) int local101 = arg0.anInt8408 * 512 + arg0.method6925() * 256;
			@Pc(112) int local112 = arg0.lb * 512 + arg0.method6925() * 256;
			arg0.anInt9934 = (local101 * local66 + (local61 - local66) * local78) / local61;
			arg0.anInt9935 = (local66 * local112 + (local61 - local66) * local90) / local61;
		}
		arg0.anInt8448 = 0;
		if (arg0.anInt8400 == 0) {
			arg0.method6934(false, 8192);
		}
		if (arg0.anInt8400 == 1) {
			arg0.method6934(false, 12288);
		}
		if (arg0.anInt8400 == 2) {
			arg0.method6934(false, 0);
		}
		if (arg0.anInt8400 == 3) {
			arg0.method6934(false, 4096);
		}
	}
}
