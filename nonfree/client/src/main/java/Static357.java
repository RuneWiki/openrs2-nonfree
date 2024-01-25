import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
	public static int anInt5881;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
	public static int anInt5884 = 0;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!lq;")
	public static Class31_Sub2 method4896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class80 local7 = client.lb[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class22 local14 = local7.aClass22_2; local14 != null; local14 = local14.aClass22_1) {
			@Pc(18) Class31_Sub2 local18 = local14.aClass31_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort103 == arg1 && local18.aShort102 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!ya;III)V")
	public static void method4897(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static427.aClass93ArrayArray3 = new Class93[arg1][arg2];
		Static201.aClass39_6 = arg0;
		if (Static331.anIntArray649 != null) {
			Static48.aClass16_1 = Static265.method3925(Static331.anIntArray649[3], Static331.anIntArray649[5], Static331.anIntArray649[1], Static331.anIntArray649[4], Static331.anIntArray649[0], Static331.anIntArray649[2]);
		}
		Static269.aClass93_1 = new Class93();
		Static48.method870();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!od;I)[Lclient!rd;")
	public static Class206[] method4899(@OriginalArg(0) Class180 arg0) {
		if (!arg0.method4088()) {
			return new Class206[0];
		}
		@Pc(21) Class9 local21 = arg0.method4079();
		while (local21.anInt368 == 0) {
			Static224.method3441(10L);
		}
		if (local21.anInt368 == 2) {
			return new Class206[0];
		}
		@Pc(39) int[] local39 = (int[]) local21.anObject2;
		@Pc(45) Class206[] local45 = new Class206[local39.length >> 2];
		for (@Pc(47) int local47 = 0; local47 < local45.length; local47++) {
			@Pc(52) Class206 local52 = new Class206();
			local45[local47] = local52;
			local52.anInt5763 = local39[local47 << 2];
			local52.anInt5765 = local39[(local47 << 2) + 1];
			local52.anInt5766 = local39[(local47 << 2) + 2];
			local52.anInt5764 = local39[(local47 << 2) + 3];
		}
		return local45;
	}
}
