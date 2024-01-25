import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!hi", name = "Kb", descriptor = "Lclient!cj;")
	public static Class3_Sub4 aClass3_Sub4_1;

	@OriginalMember(owner = "client!hi", name = "Ob", descriptor = "[Lclient!bd;")
	public static Class23_Sub1[] aClass23_Sub1Array2;

	@OriginalMember(owner = "client!hi", name = "rb", descriptor = "Lclient!us;")
	public static final Class234 aClass234_52 = new Class234(36, -2);

	@OriginalMember(owner = "client!hi", name = "xb", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!hi", name = "Gb", descriptor = "Lclient!us;")
	public static final Class234 aClass234_53 = new Class234(20, 8);

	@OriginalMember(owner = "client!hi", name = "Hb", descriptor = "Lclient!us;")
	public static final Class234 aClass234_54 = new Class234(21, 1);

	@OriginalMember(owner = "client!hi", name = "Ib", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_46 = new Class57("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!hi", name = "Jb", descriptor = "I")
	public static int anInt2589 = 0;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIZII)V")
	public static void method2132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static216.anInt6071 = arg1;
		Static157.anInt2809 = arg5;
		Static47.anInt971 = arg0;
		Static258.anInt4650 = arg4;
		Static37.anInt658 = arg2;
		if (arg3 && Static157.anInt2809 >= 100) {
			Static339.anInt5726 = Static258.anInt4650 * 128 + 64;
			Static206.anInt3639 = Static37.anInt658 * 128 + 64;
			Static243.anInt4289 = Static55.method1005(Static339.anInt5726, Static363.anInt6170, Static206.anInt3639) - Static47.anInt971;
		}
		Static88.anInt1815 = 2;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
	public static void method2133() {
		Static392.anIntArray705 = null;
		Static56.anIntArray102 = null;
		Static98.anIntArray199 = null;
		Static113.aBoolean163 = false;
		Static199.anIntArray388 = null;
		Static69.anIntArray133 = null;
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)J")
	public static long method2154() {
		return Static169.aClass34_1.method3925();
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)Lclient!o;")
	public static Class171 method2164(@OriginalArg(0) int arg0) {
		@Pc(13) Class171[] local13 = Static151.method2382();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class171 local21 = local13[local15];
			if (arg0 == local21.anInt4292) {
				return local21;
			}
		}
		return null;
	}
}
