import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
	public static int anInt6884;

	@OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
	public static int anInt6889;

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
	public static int anInt6887 = 0;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!rda;[IB)V")
	public static void method5727(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub4_Sub2_Sub1_Sub2 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg1.anIntArray459 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg1.anIntArray459.length; local12++) {
				if (arg2[local12] != arg1.anIntArray459[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg1.anInt8412 != -1) {
				@Pc(52) Class365 local52 = Static61.aClass48_1.method1016(arg1.anInt8412);
				@Pc(55) int local55 = local52.anInt10221;
				if (local55 == 1) {
					arg1.anInt8391 = 0;
					arg1.anInt8433 = 0;
					arg1.anInt8369 = 1;
					arg1.anInt8378 = arg0;
					arg1.anInt8436 = 0;
					if (!arg1.aBoolean590) {
						Static301.method5179(local52, arg1, arg1.anInt8391);
					}
				}
				if (local55 == 2) {
					arg1.anInt8436 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg2.length; local12++) {
			if (arg2[local12] != -1) {
				local10 = false;
			}
			if (arg1.anIntArray459 == null || arg1.anIntArray459[local12] == -1 || Static61.aClass48_1.method1016(arg2[local12]).anInt10218 >= Static61.aClass48_1.method1016(arg1.anIntArray459[local12]).anInt10218) {
				arg1.anInt8378 = arg0;
				arg1.anIntArray459 = arg2;
				break;
			}
		}
		if (local10) {
			arg1.anIntArray459 = arg2;
			arg1.anInt8378 = arg0;
		}
	}
}
