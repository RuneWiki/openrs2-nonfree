import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "Z")
	public static boolean aBoolean351 = false;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
	public static void method4614() {
		@Pc(13) int local13;
		if (Static461.aClass272Array44 != null) {
			for (local13 = 0; local13 < Static592.anInt9569; local13++) {
				Static461.aClass272Array44[local13] = null;
			}
			Static461.aClass272Array44 = null;
		}
		if (Static165.aClass272Array7 != null) {
			for (local13 = 0; local13 < Static393.anInt6534; local13++) {
				Static165.aClass272Array7[local13] = null;
			}
			Static165.aClass272Array7 = null;
		}
		if (Static621.aClass272Array40 != null) {
			for (local13 = 0; local13 < Static667.anInt10815; local13++) {
				Static621.aClass272Array40[local13] = null;
			}
			Static621.aClass272Array40 = null;
		}
		Static483.anInt7683 = -1;
		Static218.anInt3743 = -1;
		Static638.anIntArrayArrayArray18 = null;
		Static589.aClass272Array37 = null;
		Static260.anIntArray268 = null;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIZ)V")
	public static void method4615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class3_Sub5_Sub20 local14 = Static447.method6065((long) arg3 | (long) arg1 << 32, 19);
		local14.method8832();
		local14.anInt10756 = arg2;
		local14.anInt10754 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!uq;II)Lclient!lq;")
	public static Class3_Sub35 method4616(@OriginalArg(0) Class362 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte[] local12 = arg0.method8356(arg1);
		return local12 == null ? null : new Class3_Sub35(local12);
	}
}
