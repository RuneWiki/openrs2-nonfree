import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	public static int anInt714;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
	public static int[] anIntArray46;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString42 = "green:";

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString43 = "Examine";

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIBII)V")
	public static void method634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub18 local12 = (Class2_Sub18) Static50.aClass79_4.method2002((long) arg2);
		if (local12 == null) {
			local12 = new Class2_Sub18();
			Static50.aClass79_4.method1994((long) arg2, local12);
		}
		if (local12.anIntArray289.length <= arg1) {
			@Pc(43) int[] local43 = new int[arg1 + 1];
			@Pc(48) int[] local48 = new int[arg1 + 1];
			@Pc(50) int local50;
			for (local50 = 0; local50 < local12.anIntArray289.length; local50++) {
				local43[local50] = local12.anIntArray289[local50];
				local48[local50] = local12.anIntArray290[local50];
			}
			for (local50 = local12.anIntArray289.length; local50 < arg1; local50++) {
				local43[local50] = -1;
				local48[local50] = 0;
			}
			local12.anIntArray289 = local43;
			local12.anIntArray290 = local48;
		}
		local12.anIntArray289[arg1] = arg3;
		local12.anIntArray290[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIZII)V")
	public static void method635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static257.anInt5357 = arg2;
		Static153.anInt3232 = arg4;
		Static72.anInt1561 = arg3;
		Static229.anInt5459 = arg1;
		Static88.anInt4713 = arg0;
		if (Static229.anInt5459 >= 100) {
			@Pc(24) int local24 = Static153.anInt3232 * 128 + 64;
			@Pc(30) int local30 = Static257.anInt5357 * 128 + 64;
			@Pc(39) int local39 = Static99.method1894(Static208.anInt4335, local30, local24) - Static72.anInt1561;
			@Pc(43) int local43 = local39 - Static133.anInt2729;
			@Pc(48) int local48 = local24 - Static271.anInt5632;
			@Pc(53) int local53 = local30 - Static255.anInt5182;
			@Pc(65) int local65 = (int) Math.sqrt((double) (local48 * local48 + local53 * local53));
			Static210.anInt4376 = (int) (Math.atan2((double) local43, (double) local65) * 325.949D) & 0x7FF;
			Static265.anInt5500 = (int) (Math.atan2((double) local48, (double) local53) * -325.949D) & 0x7FF;
			if (Static210.anInt4376 < 128) {
				Static210.anInt4376 = 128;
			}
			if (Static210.anInt4376 > 383) {
				Static210.anInt4376 = 383;
			}
		}
		Static101.anInt6027 = 2;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)Lclient!pa;")
	public static Class132_Sub1 method637() {
		return Static278.aClass132_Sub1Array2.length <= Static49.anInt1133 ? null : Static278.aClass132_Sub1Array2[Static49.anInt1133++];
	}
}
