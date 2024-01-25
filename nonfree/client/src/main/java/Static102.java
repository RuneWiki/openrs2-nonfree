import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
	public static int anInt1883;

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_49 = new Class40(23, -2);

	@OriginalMember(owner = "client!eba", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray29 = new int[128][128];

	@OriginalMember(owner = "client!eba", name = "q", descriptor = "I")
	public static int anInt1886 = -2;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZI)I")
	public static int method1655(@OriginalArg(0) int arg0) {
		@Pc(14) Class6_Sub13 local14 = Static59.method44(arg0, false);
		if (local14 == null) {
			return Static59.aClass42_2.method688(arg0).anInt7619;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray171.length; local26++) {
			if (local14.anIntArray171[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static59.aClass42_2.method688(arg0).anInt7619 - local14.anIntArray171.length;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIII)V")
	public static void method1656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static218.aClass6_Sub14_Sub2_1.method5990(arg0);
		Static218.aClass6_Sub14_Sub2_1.method5999(arg2);
		Static218.aClass6_Sub14_Sub2_1.method5997(arg1);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IBIILclient!ud;)V")
	public static void method1657(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class29_Sub2_Sub1_Sub2 arg2) {
		@Pc(10) int local10 = arg2.anIntArray661[0];
		@Pc(15) int local15 = arg2.anIntArray660[0];
		if (local10 < 0 || Static301.anInt4912 <= local10 || local15 < 0 || local15 >= Static473.anInt7969 || (arg0 < 0 || Static301.anInt4912 <= arg0 || arg1 < 0 || Static473.anInt7969 <= arg1)) {
			return;
		}
		@Pc(77) int local77 = Static394.method5824(arg0, local15, 0, Static281.anIntArray451, arg1, -4, 0, true, 0, Static77.anIntArray94, Static296.aClass295Array3[arg2.aByte103], 0, arg2.method7008(), local10);
		if (local77 >= 1 && local77 <= 3) {
			for (@Pc(91) int local91 = 0; local91 < local77 - 1; local91++) {
				arg2.method7011((byte) 2, Static281.anIntArray451[local91], Static77.anIntArray94[local91]);
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIZZI)V")
	public static void method1658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		Static106.method1730(Static376.aClass8_Sub1Array2.length - 1, arg3, arg1, arg2, arg0, 0);
		Static432.anInt7942 = 0;
		Static49.aClass6_Sub15_1 = null;
	}
}
