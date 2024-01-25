import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Lclient!rk;")
	public static Class180 aClass180_1;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public static int anInt79 = -50;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
	public static int anInt82 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)V")
	public static void method61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class7_Sub1_Sub15 local8 = Static315.method5104(12, arg1);
		local8.method4790();
		local8.anInt5687 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
	public static int method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static20.anIntArrayArray5 == null ? 0 : Static20.anIntArrayArray5[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method64() {
		Static305.aClass103_62.method2684();
		Static177.aClass103_29.method2684();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIII)V")
	public static void method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static121.anInt2750 = arg3;
		Static136.anInt2916 = arg0;
		Static126.anInt2791 = arg4;
		Static42.anInt1100 = arg2;
		Static175.anInt3621 = arg1;
		if (Static126.anInt2791 >= 100) {
			@Pc(28) int local28 = Static121.anInt2750 * 128 + 64;
			@Pc(34) int local34 = Static175.anInt3621 * 128 + 64;
			@Pc(43) int local43 = Static341.method5540(Static168.anInt3508, local34, local28) - Static42.anInt1100;
			@Pc(48) int local48 = local28 - Static203.anInt4014;
			@Pc(53) int local53 = local43 - Static271.anInt5361;
			@Pc(58) int local58 = local34 - Static24.anInt478;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local58 * local58 + local48 * local48));
			Static179.anInt3660 = (int) (Math.atan2((double) local53, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static138.anInt3022 = (int) (Math.atan2((double) local48, (double) local58) * -2607.5945876176133D) & 0x3FFF;
			if (Static179.anInt3660 < 1024) {
				Static179.anInt3660 = 1024;
			}
			if (Static179.anInt3660 > 3072) {
				Static179.anInt3660 = 3072;
			}
		}
		Static118.anInt6324 = 2;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Z")
	public static boolean method66() {
		return Static129.anInt2826 == 0 ? Static214.aClass7_Sub8_Sub2_3.method3115() : true;
	}
}
