import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!lr", name = "P", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
	public static int anInt3955 = 0;

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
	public static int anInt3960 = 0;

	@OriginalMember(owner = "client!lr", name = "G", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_142 = new Class198(8);

	@OriginalMember(owner = "client!lr", name = "M", descriptor = "[I")
	public static final int[] anIntArray336 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!lr", name = "O", descriptor = "Z")
	public static boolean aBoolean306 = false;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIZII)V")
	public static void method3599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg3, 4);
		local8.method4908();
		local8.anInt5705 = arg2;
		local8.anInt5704 = arg1;
		local8.anInt5703 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)I")
	public static int method3601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(29) int local29 = local15 * (local15 * 15731 * local15 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method3603(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static332.aBoolean465) {
			try {
				@Pc(22) Class88 local22 = (Class88) Class.forName("Class88_Sub1").getDeclaredConstructor().newInstance();
				local22.method2542(arg0);
				return local22;
			} catch (@Pc(29) Throwable local29) {
				Static332.aBoolean465 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLclient!kb;)V")
	public static void method3604(@OriginalArg(1) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub7_5 != null) {
			arg0.aClass4_Sub7_5.anInt480 = 0;
		}
		arg0.aBoolean322 = false;
		for (@Pc(23) Class4_Sub1 local23 = arg0.method3784(); local23 != null; local23 = arg0.method3787()) {
			method3604(local23);
		}
	}
}
