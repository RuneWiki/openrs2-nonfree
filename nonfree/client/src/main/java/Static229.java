import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!om", name = "s", descriptor = "I")
	public static int anInt4641;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "[I")
	public static final int[] anIntArray379 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!om", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!om", name = "z", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_159 = new Class106("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!om", name = "D", descriptor = "I")
	public static int anInt4649 = 0;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V")
	public static void method4278() {
		if (Static207.anInt4093 < 0) {
			Static286.anInt5852 = -1;
			Static207.anInt4093 = 0;
			Static253.anInt5163 = -1;
		}
		if (Static269.anInt3324 < Static207.anInt4093) {
			Static286.anInt5852 = -1;
			Static207.anInt4093 = Static269.anInt3324;
			Static253.anInt5163 = -1;
		}
		if (Static299.anInt4033 < 0) {
			Static286.anInt5852 = -1;
			Static299.anInt4033 = 0;
			Static253.anInt5163 = -1;
		}
		if (Static299.anInt4033 > Static269.anInt3321) {
			Static286.anInt5852 = -1;
			Static299.anInt4033 = Static269.anInt3321;
			Static253.anInt5163 = -1;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Lclient!ef;")
	public static Class1_Sub4_Sub7 method4279(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub4_Sub7 local15 = (Class1_Sub4_Sub7) Static102.aClass21_181.method854((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static56.aClass30_13.method1161(arg0, 26);
		local15 = new Class1_Sub4_Sub7();
		if (local25 != null) {
			local15.method1591(new Class1_Sub7(local25));
		}
		Static102.aClass21_181.method843(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)V")
	public static void method4281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class155 local7 = Static105.aClass155ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class11_Sub4 local13 = local7.aClass11_Sub4_1;
		@Pc(16) Class11_Sub4 local16 = local7.aClass11_Sub4_2;
		if (local13 != null) {
			local13.anInt6829 = local13.anInt6829 * arg3 / 16;
			local13.anInt6833 = local13.anInt6833 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt6829 = local16.anInt6829 * arg3 / 16;
			local16.anInt6833 = local16.anInt6833 * arg3 / 16;
		}
	}
}
