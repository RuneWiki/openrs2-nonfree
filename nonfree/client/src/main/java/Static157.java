import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_33 = new Class307(8);

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!afa;B)I")
	public static int method2548(@OriginalArg(0) Class9_Sub1_Sub1_Sub2_Sub1 arg0) {
		@Pc(16) int local16 = arg0.anInt542;
		@Pc(20) Class226 local20 = arg0.method7489();
		@Pc(25) int local25 = arg0.aClass45_9.method6577();
		if (local25 == -1 || arg0.aBoolean593) {
			local16 = arg0.anInt520;
		} else if (local20.anInt5787 == local25 || local20.anInt5819 == local25 || local25 == local20.anInt5815 || local25 == local20.anInt5780) {
			local16 = arg0.anInt531;
		} else if (local25 == local20.anInt5793 || local25 == local20.anInt5812 || local25 == local20.anInt5802 || local25 == local20.anInt5800) {
			local16 = arg0.anInt528;
		}
		return local16;
	}
}
