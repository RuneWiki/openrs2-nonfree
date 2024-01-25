import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!ip;I)V")
	public static void method358(@OriginalArg(0) Class4_Sub1_Sub1_Sub2_Sub1 arg0) {
		@Pc(11) Class5_Sub20 local11 = (Class5_Sub20) Static342.aClass306_24.method6943((long) arg0.anInt6843);
		if (local11 == null) {
			return;
		}
		if (local11.aClass5_Sub4_Sub4_1 != null) {
			Static265.aClass5_Sub4_Sub1_2.method332(local11.aClass5_Sub4_Sub4_1);
			local11.aClass5_Sub4_Sub4_1 = null;
		}
		local11.method9222();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZI)Z")
	public static boolean method359(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x37) != 0;
	}
}
