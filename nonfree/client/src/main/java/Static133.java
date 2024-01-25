import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!eia", name = "p", descriptor = "I")
	public static final int anInt2088 = 16777215;

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(III)Z")
	public static boolean method2018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static385.method5887(arg1, arg2) & Static391.method5935(arg1, arg2);
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V")
	public static void method2020(@OriginalArg(0) int arg0) {
		Static60.anInt991 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static654.anInt10715; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static180.anInt2928; local6++) {
				if (Static63.aClass89ArrayArrayArray1[arg0][local3][local6] == null) {
					Static63.aClass89ArrayArrayArray1[arg0][local3][local6] = new Class89(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(II)Lclient!fba;")
	public static Class109 method2022(@OriginalArg(1) int arg0) {
		@Pc(10) Class109 local10 = (Class109) Static349.aClass317_30.method7882((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static685.aClass310_54.method7803(arg0, 0);
		local10 = new Class109();
		if (local21 != null) {
			local10.method2227(new Class14_Sub21(local21), arg0);
		}
		Static349.aClass317_30.method7875((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IIZII)V")
	public static void method2023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (Static558.method8063(arg3)) {
			Static439.method6589(arg2, arg0, Static339.aClass299ArrayArray1[arg3], arg1, -1);
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IIIIII)V")
	public static void method2024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(23) int local23 = arg4 - arg3;
		if (local18 == 0) {
			if (local23 != 0) {
				Static200.method8478(arg3, arg1, arg4, arg0);
			}
		} else if (local23 == 0) {
			Static403.method6105(arg3, arg0, arg1, arg2);
		} else {
			@Pc(57) int local57 = (local23 << 12) / local18;
			@Pc(66) int local66 = arg3 - (local57 * arg0 >> 12);
			@Pc(86) int local86;
			@Pc(84) int local84;
			if (Static468.anInt7895 > arg0) {
				local84 = (local57 * Static468.anInt7895 >> 12) + local66;
				local86 = Static468.anInt7895;
			} else if (arg0 <= Static382.anInt6719) {
				local84 = arg3;
				local86 = arg0;
			} else {
				local86 = Static382.anInt6719;
				local84 = local66 + (local57 * Static382.anInt6719 >> 12);
			}
			@Pc(128) int local128;
			@Pc(130) int local130;
			if (Static468.anInt7895 > arg2) {
				local128 = Static468.anInt7895;
				local130 = (Static468.anInt7895 * local57 >> 12) + local66;
			} else if (arg2 <= Static382.anInt6719) {
				local128 = arg2;
				local130 = arg4;
			} else {
				local128 = Static382.anInt6719;
				local130 = (local57 * Static382.anInt6719 >> 12) + local66;
			}
			if (local130 < Static410.anInt7068) {
				local130 = Static410.anInt7068;
				local128 = (Static410.anInt7068 - local66 << 12) / local57;
			} else if (Static281.anInt5188 < local130) {
				local130 = Static281.anInt5188;
				local128 = (Static281.anInt5188 - local66 << 12) / local57;
			}
			if (Static410.anInt7068 > local84) {
				local86 = (Static410.anInt7068 - local66 << 12) / local57;
				local84 = Static410.anInt7068;
			} else if (local84 > Static281.anInt5188) {
				local86 = (Static281.anInt5188 - local66 << 12) / local57;
				local84 = Static281.anInt5188;
			}
			Static425.method6394(local84, arg1, local128, local130, local86);
		}
	}
}
