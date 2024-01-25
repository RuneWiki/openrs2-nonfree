import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
	public static int anInt2044;

	@OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
	public static int anInt2045;

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(IIIB)I")
	public static int method1932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13 = 255 - arg0;
		@Pc(31) int local31 = (arg0 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
		return (((arg2 & 0xFF00FF) * local13 & 0xFF00FF00 | (arg2 & 0xFF00) * local13 & 0xFF0000) >>> 8) + local31;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)V")
	public static void method1933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class251 local7 = Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null && local7.aClass1_Sub3_2 != null) {
			local7.aClass1_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(IIIB)I")
	public static int method1934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)V")
	public static void method1935() {
		Static216.method3597(Static302.aClass11_48);
		for (@Pc(17) Class2_Sub38 local17 = (Class2_Sub38) Static12.aClass246_2.method5606(); local17 != null; local17 = (Class2_Sub38) Static12.aClass246_2.method5614()) {
			if (!local17.method5618()) {
				local17 = (Class2_Sub38) Static12.aClass246_2.method5606();
				if (local17 == null) {
					break;
				}
			}
			if (local17.anInt4974 == 0) {
				Static293.method5577(local17, true, true);
			}
		}
		if (Static108.aClass4_26 != null) {
			Static51.method872(Static108.aClass4_26);
			Static108.aClass4_26 = null;
		}
	}
}
