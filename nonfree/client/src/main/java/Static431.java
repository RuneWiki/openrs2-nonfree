import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray14 = new int[2][][];

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
	public static int anInt6735 = -1;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5277(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static30.method641(Static123.aClass217_46);
			Static302.aClass3_Sub7_Sub1_2.method2628(Static24.method582(arg0));
			Static302.aClass3_Sub7_Sub1_2.method2608(arg0);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIZII)V")
	public static void method5279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(17) long local17 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg0);
		@Pc(23) Class3_Sub32 local23 = (Class3_Sub32) Static188.aClass11_24.method324(local17);
		if (local23 == null) {
			local23 = new Class3_Sub32();
			Static188.aClass11_24.method319(local23, local17);
		}
		if (local23.anIntArray339.length <= arg1) {
			@Pc(46) int[] local46 = new int[arg1 + 1];
			@Pc(51) int[] local51 = new int[arg1 + 1];
			for (@Pc(53) int local53 = 0; local53 < local23.anIntArray339.length; local53++) {
				local46[local53] = local23.anIntArray339[local53];
				local51[local53] = local23.anIntArray340[local53];
			}
			for (@Pc(82) int local82 = local23.anIntArray339.length; local82 < arg1; local82++) {
				local46[local82] = -1;
				local51[local82] = 0;
			}
			local23.anIntArray339 = local46;
			local23.anIntArray340 = local51;
		}
		local23.anIntArray339[arg1] = arg2;
		local23.anIntArray340[arg1] = arg4;
	}
}
