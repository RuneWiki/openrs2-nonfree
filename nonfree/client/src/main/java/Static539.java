import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!raa", name = "g", descriptor = "Lclient!rla;")
	public static Class325 aClass325_7;

	@OriginalMember(owner = "client!raa", name = "f", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_102 = new Class286(77, -1);

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIIB)V")
	public static void method8106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1010) {
			Static185.method2825(Static649.aClass258_15, arg1, arg2);
		} else if (arg0 == 1003) {
			Static185.method2825(Static195.aClass258_12, arg1, arg2);
		} else if (arg0 == 1008) {
			Static185.method2825(Static578.aClass258_14, arg1, arg2);
		} else if (arg0 == 1002) {
			Static185.method2825(Static290.aClass258_10, arg1, arg2);
		} else if (arg0 == 1009) {
			Static185.method2825(Static46.aClass258_1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILclient!cea;)[Lclient!el;")
	public static Class95[] method8107(@OriginalArg(1) Class47 arg0) {
		if (!arg0.method946()) {
			return new Class95[0];
		}
		@Pc(21) Class201 local21 = arg0.method942();
		while (local21.anInt5729 == 0) {
			Static564.method7845(10L);
		}
		if (local21.anInt5729 == 2) {
			return new Class95[0];
		}
		@Pc(47) int[] local47 = (int[]) local21.anObject16;
		@Pc(53) Class95[] local53 = new Class95[local47.length >> 2];
		for (@Pc(55) int local55 = 0; local55 < local53.length; local55++) {
			@Pc(61) Class95 local61 = new Class95();
			local53[local55] = local61;
			local61.anInt2811 = local47[local55 << 2];
			local61.anInt2808 = local47[(local55 << 2) + 1];
			local61.anInt2810 = local47[(local55 << 2) + 2];
			local61.anInt2806 = local47[(local55 << 2) + 3];
		}
		return local53;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIBIIII)V")
	public static void method8109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static85.anInt1313 <= arg4 - arg1 && arg1 + arg4 <= Static316.anInt6313 && Static280.anInt5114 <= arg5 - arg1 && arg5 + arg1 <= Static356.anInt6028) {
			Static636.method8629(arg5, arg0, arg4, arg1, arg3, arg2);
		} else {
			Static319.method9113(arg0, arg4, arg1, arg2, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)I")
	public static int method8113() {
		return Static293.anInt5243 == 1 ? Static648.anInt10431 : Static161.anInt2962;
	}
}
