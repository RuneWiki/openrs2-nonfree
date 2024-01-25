import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
	public static int anInt2834;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "[I")
	public static int[] anIntArray338;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	public static int anInt2835 = 0;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "[I")
	public static final int[] anIntArray337 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "Z")
	public static boolean aBoolean244 = false;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBIIIIIIZ)Z")
	public static boolean method2334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(8) int local8 = Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray296[0];
		@Pc(13) int local13 = Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray295[0];
		if (local8 < 0 || Static92.anInt1675 <= local8 || local13 < 0 || local13 >= Static262.anInt6340) {
			return false;
		} else if (arg3 >= 0 && arg3 < Static92.anInt1675 && arg0 >= 0 && Static262.anInt6340 > arg0) {
			@Pc(77) int local77 = Static126.method1835(arg4, Static321.aClass25_Sub1_Sub1_Sub1_2.method1877(), local8, Static42.anIntArray123, arg2, Static257.aClass222Array1[Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70], arg0, Static48.anIntArray134, arg3, arg6, local13, arg5, arg7, arg1);
			if (local77 < 1) {
				return false;
			}
			Static190.anInt3337 = Static48.anIntArray134[local77 - 1];
			Static76.anInt5658 = Static42.anIntArray123[local77 - 1];
			Static46.aBoolean78 = false;
			Static308.method4585();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method2335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class132 local7 = Static25.aClass132ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class116 local13 = local7.aClass116_3; local13 != null; local13 = local13.aClass116_2) {
			@Pc(17) Class25_Sub1 local17 = local13.aClass25_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort88 == arg1 && local17.aShort89 == arg2) {
				Static385.method5447(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public static void method2337() {
		Static331.anInt5548 = 0;
		for (@Pc(13) int local13 = 0; local13 < 2048; local13++) {
			Static322.aClass1_Sub33Array1[local13] = null;
			Static268.aByteArray75[local13] = 1;
		}
	}
}
