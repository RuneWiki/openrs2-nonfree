import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "q", descriptor = "Lclient!vk;")
	public static Class185 aClass185_2;

	@OriginalMember(owner = "client!af", name = "C", descriptor = "[[[Lclient!nh;")
	public static Class4_Sub19[][][] aClass4_Sub19ArrayArrayArray1;

	@OriginalMember(owner = "client!af", name = "E", descriptor = "Lclient!fh;")
	public static Class58 aClass58_3;

	@OriginalMember(owner = "client!af", name = "v", descriptor = "Lclient!cc;")
	public static Class26 aClass26_1 = new Class26(50);

	@OriginalMember(owner = "client!af", name = "A", descriptor = "[I")
	public static int[] anIntArray13 = new int[5];

	@OriginalMember(owner = "client!af", name = "D", descriptor = "[I")
	public static int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!af", name = "F", descriptor = "I")
	public static int anInt113 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lclient!vh;")
	public static Class184 method99(@OriginalArg(0) int arg0) {
		@Pc(14) Class184 local14 = (Class184) Static91.aClass26_19.method518((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(28) byte[] local28 = Static66.aClass58_38.method1372(Static304.method4699(arg0), Static187.method2993(arg0));
		local14 = new Class184();
		local14.anInt5554 = arg0;
		if (local28 != null) {
			local14.method4491(new Class4_Sub10(local28));
		}
		local14.method4503();
		if (!Static52.aBoolean152 && local14.aBoolean376) {
			local14.aStringArray39 = null;
		}
		if (local14.aBoolean386) {
			local14.anInt5510 = 0;
			local14.aBoolean375 = false;
		}
		Static91.aClass26_19.method510(local14, (long) arg0);
		return local14;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIBII)V")
	public static void method100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static48.anInt902 <= arg4 - arg0 && arg0 + arg4 <= Static131.anInt2553 && arg2 - arg0 >= Static156.anInt3086 && Static218.anInt4231 >= arg0 + arg2) {
			Static21.method896(arg5, arg1, arg0, arg3, arg4, arg2);
		} else {
			Static70.method1082(arg0, arg5, arg4, arg1, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(B)V")
	public static void method101() {
		Static93.anInt2582 = 0;
		Static133.anInt2574 = 1;
		Static40.aBoolean38 = false;
		Static190.anInt3570 = 0;
		Static237.anInt4459 = 0;
		Static225.anInt4325 = -1;
		Static75.anInt1641 = -3;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)[Lclient!vn;")
	public static Class4_Sub3_Sub14_Sub1[] method103() {
		@Pc(8) Class4_Sub3_Sub14_Sub1[] local8 = new Class4_Sub3_Sub14_Sub1[Static143.anInt2748];
		for (@Pc(10) int local10 = 0; local10 < Static143.anInt2748; local10++) {
			@Pc(21) int local21 = Static301.anIntArray643[local10] * Static110.anIntArray185[local10];
			@Pc(24) int[] local24 = new int[local21];
			@Pc(28) byte[] local28 = Static230.aByteArrayArray36[local10];
			for (@Pc(30) int local30 = 0; local30 < local21; local30++) {
				local24[local30] = Static58.anIntArray85[local28[local30] & 0xFF];
			}
			local8[local10] = new Class4_Sub3_Sub14_Sub1(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[local10], Static187.anIntArray391[local10], Static110.anIntArray185[local10], Static301.anIntArray643[local10], local24);
		}
		Static304.method4707();
		return local8;
	}
}
