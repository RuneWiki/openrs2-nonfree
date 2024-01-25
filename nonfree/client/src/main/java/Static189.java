import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!gw", name = "T", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_45 = new Class71(56, 12);

	@OriginalMember(owner = "client!gw", name = "ub", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_39 = new Class257(28, -1);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!bda;I)V")
	public static void method3590(@OriginalArg(0) Class15_Sub1_Sub2_Sub2 arg0) {
		if (arg0 instanceof Class15_Sub1_Sub2_Sub2_Sub2) {
			@Pc(35) Class15_Sub1_Sub2_Sub2_Sub2 local35 = (Class15_Sub1_Sub2_Sub2_Sub2) arg0;
			if (local35.aClass300_1 == null) {
				return;
			}
			Static98.method2231(local35.aByte124 != Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124, local35);
		} else if (arg0 instanceof Class15_Sub1_Sub2_Sub2_Sub1) {
			@Pc(16) Class15_Sub1_Sub2_Sub2_Sub1 local16 = (Class15_Sub1_Sub2_Sub2_Sub1) arg0;
			Static393.method6283(local16.aByte124 != Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124, local16);
			return;
		}
	}
}
