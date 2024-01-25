import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
	public static int anInt4553 = -1;

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "Z")
	public static boolean aBoolean338 = false;

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "Lclient!ub;")
	public static final Class244 aClass244_23 = new Class244();

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!cq;BII)Lclient!pi;")
	public static Class4_Sub2_Sub15 method3633(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1 << 8 | arg0.anInt1053;
		@Pc(19) Class4_Sub2_Sub15 local19 = (Class4_Sub2_Sub15) Static119.aClass260_6.method5744((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(36) byte[] local36 = Static4.aClass211_2.method4353(Static4.aClass211_2.method4370(local10));
		if (local36 == null) {
			local10 = arg0.anInt1053 | arg2 + 65536 << 8;
			local19 = (Class4_Sub2_Sub15) Static119.aClass260_6.method5744((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local36 = Static4.aClass211_2.method4353(Static4.aClass211_2.method4370(local10));
			if (local36 == null) {
				local10 = arg0.anInt1053 | 0xFFFF00;
				local19 = (Class4_Sub2_Sub15) Static119.aClass260_6.method5744((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local36 = Static4.aClass211_2.method4353(Static4.aClass211_2.method4370(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local19 = Static236.method3190(local36);
					local19.aClass43_14 = arg0;
					Static119.aClass260_6.method5746(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local19 = Static236.method3190(local36);
				local19.aClass43_14 = arg0;
				Static119.aClass260_6.method5746(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local19 = Static236.method3190(local36);
			local19.aClass43_14 = arg0;
			Static119.aClass260_6.method5746(local19, (long) local10 << 16);
			return local19;
		}
	}
}
