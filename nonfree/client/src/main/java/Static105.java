import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Lclient!pc;")
	public static Class77 aClass77_57;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Z")
	public static boolean aBoolean119;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_697 = Static181.method2795("Loaded sprites");

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_699 = Static181.method2795("Walk here");

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "Lclient!qe;")
	public static Class83 aClass83_698 = aClass83_699;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
	public static int anInt2425 = 1;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_700 = Static181.method2795("details)3dat");

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "Lclient!qe;")
	public static Class83 aClass83_701 = aClass83_697;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public static void method1821() {
		try {
			if (Static124.aClass44_2 == null) {
				Static124.aClass44_2 = new Class44(Static23.aClass1_1, Static67.method1268(new Class83[] { Static75.aClass83_542, Static129.method2179(Static98.anInt2134), Static69.aClass83_517 }).method2427());
			} else {
				@Pc(14) byte[] local14 = Static124.aClass44_2.method1435();
				if (local14 != null) {
					@Pc(21) Class2_Sub3 local21 = new Class2_Sub3(local14);
					Static33.anInt869 = local21.method269();
					Static13.aClass75Array1 = new Class75[Static33.anInt869];
					for (@Pc(30) int local30 = 0; local30 < Static33.anInt869; local30++) {
						@Pc(40) Class75 local40 = Static13.aClass75Array1[local30] = new Class75();
						@Pc(44) int local44 = local21.method269();
						local40.aBoolean142 = (local44 & 0x8000) != 0;
						local40.anInt2988 = local44 & 0x7FFF;
						local40.aClass83_875 = local21.method259();
						local40.anInt2986 = local21.method242();
						local40.anInt2985 = local30;
						local40.anInt2981 = Static182.method2816(local21.method269());
					}
					Static99.method1687(Static13.aClass75Array1.length - 1, Static13.aClass75Array1, 0);
					Static124.aClass44_2 = null;
					Static120.aBoolean135 = true;
					return;
				}
			}
		} catch (@Pc(125) Exception local125) {
			local125.printStackTrace();
			Static124.aClass44_2 = null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IJ)Lclient!qe;")
	public static Class83 method1822(@OriginalArg(1) long arg0) {
		return Static32.method673(arg0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!qe;)V")
	public static void method1824(@OriginalArg(1) Class83 arg0) {
		@Pc(7) Class2_Sub7 local7 = Static54.method1042(arg0);
		if (local7 == null) {
			return;
		}
		Static121.anInt2748 = Static177.anInt3615 + Static57.anInt1431 - local7.anInt618;
		Static113.anInt2598 = local7.anInt617 - Static154.anInt3114;
		@Pc(42) int local42 = Static121.anInt2748 - (int) ((double) Static42.aClass5_8.anInt100 / Static131.aDouble11);
		@Pc(51) int local51 = (int) ((double) Static42.aClass5_8.anInt157 / Static131.aDouble11) + Static113.anInt2598;
		@Pc(61) int local61 = Static113.anInt2598 - (int) ((double) Static42.aClass5_8.anInt157 / Static131.aDouble11);
		@Pc(70) int local70 = (int) ((double) Static42.aClass5_8.anInt100 / Static131.aDouble11) + Static121.anInt2748;
		if (local42 < 0) {
			Static121.anInt2748 = (int) ((double) Static42.aClass5_8.anInt100 / Static131.aDouble11);
		}
		if (local70 > Static177.anInt3615) {
			Static121.anInt2748 = Static177.anInt3615 - (int) ((double) Static42.aClass5_8.anInt100 / Static131.aDouble11);
		}
		if (local61 < 0) {
			Static113.anInt2598 = (int) ((double) Static42.aClass5_8.anInt157 / Static131.aDouble11);
		}
		if (local51 > Static127.anInt2810) {
			Static113.anInt2598 = Static127.anInt2810 - (int) ((double) Static42.aClass5_8.anInt157 / Static131.aDouble11);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)V")
	public static void method1825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static132.anInt2855 == 0 || arg1 == 0 || Static194.anInt3846 >= 50 || arg0 == -1) {
			return;
		}
		Static129.anIntArray283[Static194.anInt3846] = arg0;
		Static140.anIntArray293[Static194.anInt3846] = arg1;
		Static79.anIntArray170[Static194.anInt3846] = arg2;
		Static86.aClass90Array1[Static194.anInt3846] = null;
		Static201.anIntArray392[Static194.anInt3846] = 0;
		Static194.anInt3846++;
	}
}
