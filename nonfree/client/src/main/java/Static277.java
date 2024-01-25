import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "Z")
	public static boolean aBoolean370 = false;

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
	public static int anInt4670 = 0;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!kh;B)I")
	public static int method3835(@OriginalArg(0) Class47_Sub1_Sub5_Sub1 arg0) {
		@Pc(13) Class196 local13 = arg0.aClass196_1;
		if (local13.anIntArray419 != null) {
			local13 = local13.method4412(Static237.aClass80_1);
			if (local13 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local13.anInt5554;
		@Pc(32) Class231 local32 = arg0.method4327();
		if (arg0.aBoolean432) {
			local28 = local13.anInt5549;
		} else if (arg0.anInt5393 == local32.anInt6975 || arg0.anInt5393 == local32.anInt6972 || arg0.anInt5393 == local32.anInt6998 || local32.anInt6984 == arg0.anInt5393) {
			local28 = local13.anInt5529;
		} else if (local32.anInt7005 == arg0.anInt5393 || local32.anInt6973 == arg0.anInt5393 || local32.anInt6976 == arg0.anInt5393 || local32.anInt7004 == arg0.anInt5393) {
			local28 = local13.anInt5541;
		}
		return local28;
	}
}
