import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_206 = new Class180(0, 4);

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "[Lclient!vq;")
	public static final Class372[] aClass372Array2 = new Class372[14];

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBIII)V")
	public static void method8919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static76.anInt1404 != 1) {
			return;
		}
		@Pc(13) int local13 = arg3 / Static336.anInt5533;
		@Pc(17) int local17 = arg0 / Static336.anInt5533;
		@Pc(21) int local21 = arg2 / Static9.anInt105;
		@Pc(25) int local25 = arg1 / Static9.anInt105;
		if (Static153.anInt3033 <= local13 || local17 < 0 || local21 >= Static37.anInt839 || local25 < 0) {
			return;
		}
		if (local21 < 0) {
			local21 = 0;
		}
		if (local13 < 0) {
			local13 = 0;
		}
		if (Static153.anInt3033 <= local17) {
			local17 = Static153.anInt3033 - 1;
		}
		if (local25 >= Static37.anInt839) {
			local25 = Static37.anInt839 - 1;
		}
		for (@Pc(90) int local90 = local21; local90 <= local25; local90++) {
			@Pc(101) int local101 = Static431.method6190(Static37.anInt839, Static218.anInt4139 + local90) * Static153.anInt3033;
			for (@Pc(103) int local103 = local13; local103 <= local17; local103++) {
				@Pc(114) int local114 = Static431.method6190(Static153.anInt3033, Static146.anInt2953 + local103) + local101;
				Static9.anIntArray17[local114] = Static677.anInt10887;
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!or;)Lclient!or;")
	public static Class260 method8921(@OriginalArg(1) Class260 arg0) {
		@Pc(14) Class260 local14 = Static79.method1525(arg0);
		if (local14 == null) {
			local14 = arg0.aClass260_15;
		}
		return local14;
	}
}
