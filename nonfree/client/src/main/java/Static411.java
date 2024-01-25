import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!op", name = "d", descriptor = "Lclient!tw;")
	public static Class331 aClass331_2;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "I")
	public static int anInt7649;

	@OriginalMember(owner = "client!op", name = "g", descriptor = "[I")
	public static final int[] anIntArray382 = new int[2];

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method6448() {
		return Static199.aBoolean358 || Static469.aClass6_Sub5_Sub9_2 == null ? "" : Static469.aClass6_Sub5_Sub9_2.aString26;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIII)Lclient!oi;")
	public static Class9_Sub4_Sub2_Sub1 method6449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class186 local11 = Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(22) Class9_Sub4_Sub2_Sub1 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class168 local27 = local11.aClass168_3; local27 != null; local27 = local27.aClass168_2) {
			@Pc(31) Class9_Sub4_Sub2 local31 = local27.aClass9_Sub4_Sub2_1;
			if (local31 instanceof Class9_Sub4_Sub2_Sub1) {
				@Pc(37) Class9_Sub4_Sub2_Sub1 local37 = (Class9_Sub4_Sub2_Sub1) local31;
				@Pc(47) int local47 = local37.method3620() * 256 + 252 - 256;
				@Pc(55) int local55 = local37.anInt10360 - local47 >> 9;
				@Pc(63) int local63 = local37.anInt10357 - local47 >> 9;
				@Pc(70) int local70 = local37.anInt10360 + local47 >> 9;
				@Pc(77) int local77 = local37.anInt10357 + local47 >> 9;
				if (arg1 >= local55 && arg2 >= local63 && arg1 <= local70 && arg2 <= local77) {
					@Pc(110) int local110 = (local77 + 1 - arg2) * (local70 + 1 + -arg1);
					if (local110 > local24) {
						local24 = local110;
						local22 = local37;
					}
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
	public static void method6450(@OriginalArg(1) int arg0) {
		if (Static569.anIntArray521 == null || Static569.anIntArray521.length < arg0) {
			Static569.anIntArray521 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V")
	public static void method6453() {
		Static119.method2558(11);
		Static531.method7544();
		System.gc();
	}
}
