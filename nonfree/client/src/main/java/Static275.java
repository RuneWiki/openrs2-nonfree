import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static275 {

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
	public static int anInt5381;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
	public static int anInt5384;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
	public static int anInt5385;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "[[[Lclient!dn;")
	public static Class51[][][] aClass51ArrayArrayArray3;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "[I")
	public static final int[] anIntArray405 = new int[128];

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	public static int anInt5386 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
	public static int method4687() {
		return Static72.anInt1799;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ra;Lclient!ra;Lclient!ra;I)V")
	public static void method4688(@OriginalArg(0) Class170 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) Class170 arg2) {
		Static318.aClass170_104 = arg0;
		Static244.method4159(arg2, arg1);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZIZI)V")
	public static void method4689(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static140.method2609(arg0, 0, Static63.aClass47_Sub1Array1.length - 1, arg1, arg2, arg3);
		Static194.anInt3826 = 0;
		Static217.aClass5_Sub6_1 = null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZI)V")
	public static void method4691(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static55.anInt1337 = arg1 - Static186.anInt6012;
		Static321.anInt6091 = arg0 - Static186.anInt6007;
	}
}
