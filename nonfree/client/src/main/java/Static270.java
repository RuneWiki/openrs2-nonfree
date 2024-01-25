import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!rh", name = "H", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_141 = new Class140(8);

	@OriginalMember(owner = "client!rh", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString212 = "Loaded textures";

	@OriginalMember(owner = "client!rh", name = "O", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
	public static int anInt5295 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!qj;Lclient!qj;)V")
	public static void method4716(@OriginalArg(1) Class165 arg0, @OriginalArg(2) Class165 arg1) {
		Static172.aClass165_91 = arg0;
		Static260.aClass165_76 = arg1;
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(B)V")
	public static void method4719() {
		Static66.aClass90Array4 = null;
		Static265.aClass90Array13 = null;
		Static286.aClass90Array15 = null;
		Static338.aClass90Array17 = null;
		Static233.aClass90Array12 = null;
		Static105.aClass13_4 = null;
		Static302.aClass13_7 = null;
		Static227.aClass90Array11 = null;
		Static72.aClass90Array5 = null;
		Static211.aClass90Array10 = null;
		Static43.aClass90Array8 = null;
		Static45.aClass90_5 = null;
		Static278.aClass90Array14 = null;
		Static9.aClass13_1 = null;
		Static163.aClass90Array9 = null;
		Static87.aClass90Array7 = null;
		Static75.aClass90Array6 = null;
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
	public static void method4722() {
		@Pc(1) Class140 local1 = Static344.aClass140_169;
		synchronized (Static344.aClass140_169) {
			Static344.aClass140_169.method3819();
		}
		local1 = Static249.aClass140_129;
		synchronized (Static249.aClass140_129) {
			Static249.aClass140_129.method3819();
		}
		local1 = Static152.aClass140_78;
		synchronized (Static152.aClass140_78) {
			Static152.aClass140_78.method3819();
		}
		local1 = Static210.aClass140_111;
		synchronized (Static210.aClass140_111) {
			Static210.aClass140_111.method3819();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	public static void method4725(@OriginalArg(0) int arg0) {
		@Pc(1) Class181 local1 = Static74.aClass181_3;
		synchronized (Static74.aClass181_3) {
			Static171.anInt3580 = arg0;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!jk;IIII)V")
	public static void method4726(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static334.method5570(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static222.anInt4391) {
			Static334.method5570(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static334.method5570(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static74.anInt3404) {
			Static334.method5570(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static74.anInt3404) {
			Static334.method5570(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static222.anInt4391 && arg4 <= Static74.anInt3404) {
			Static334.method5570(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static334.method5570(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static222.anInt4391 && arg4 > 0) {
			Static334.method5570(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
