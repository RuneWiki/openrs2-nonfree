import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
	public static int anInt2438;

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
	public static int anInt2433 = 0;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "Z")
	public static boolean aBoolean204 = false;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZLclient!sl;I)Lclient!sj;")
	public static Class2_Sub2_Sub16 method1792(@OriginalArg(0) int arg0, @OriginalArg(2) Class222 arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = arg1.anInt6365 | arg2 << 8;
		@Pc(28) Class2_Sub2_Sub16 local28 = (Class2_Sub2_Sub16) Static365.aClass164_2.method3874((long) local19 << 16);
		if (local28 != null) {
			return local28;
		}
		@Pc(40) byte[] local40 = Static317.aClass188_86.method4282(Static317.aClass188_86.method4278(local19));
		if (local40 == null) {
			local19 = arg1.anInt6365 | arg0 + 65536 << 8;
			local28 = (Class2_Sub2_Sub16) Static365.aClass164_2.method3874((long) local19 << 16);
			if (local28 != null) {
				return local28;
			}
			local40 = Static317.aClass188_86.method4282(Static317.aClass188_86.method4278(local19));
			if (local40 == null) {
				local19 = arg1.anInt6365 | 0xFFFF00;
				local28 = (Class2_Sub2_Sub16) Static365.aClass164_2.method3874((long) local19 << 16);
				if (local28 != null) {
					return local28;
				}
				local40 = Static317.aClass188_86.method4282(Static317.aClass188_86.method4278(local19));
				if (local40 == null) {
					return null;
				} else if (local40.length <= 1) {
					return null;
				} else {
					local28 = Static321.method4606(local40);
					local28.aClass222_9 = arg1;
					Static365.aClass164_2.method3877(local28, (long) local19 << 16);
					return local28;
				}
			} else if (local40.length <= 1) {
				return null;
			} else {
				local28 = Static321.method4606(local40);
				local28.aClass222_9 = arg1;
				Static365.aClass164_2.method3877(local28, (long) local19 << 16);
				return local28;
			}
		} else if (local40.length <= 1) {
			return null;
		} else {
			local28 = Static321.method4606(local40);
			local28.aClass222_9 = arg1;
			Static365.aClass164_2.method3877(local28, (long) local19 << 16);
			return local28;
		}
	}
}
