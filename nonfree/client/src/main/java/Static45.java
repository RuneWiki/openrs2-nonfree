import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bia", name = "d", descriptor = "[I")
	public static final int[] anIntArray35 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lclient!mc;B)Lclient!jl;")
	public static Class10_Sub2_Sub1 method606(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(12) Class10_Sub2 local12 = Static432.method6352(arg0);
		@Pc(16) int local16 = arg0.method7849();
		return new Class10_Sub2_Sub1(local12.aClass275_17, local12.aClass81_17, local12.anInt10597, local12.anInt10602, local12.anInt10594, local12.anInt10595, local12.anInt10598, local12.anInt10601, local12.anInt10596, local12.anInt5656, local12.anInt5649, local12.anInt5652, local12.anInt5650, local12.anInt5651, local12.anInt5653, local16);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)I")
	public static int method607() {
		return Static204.method3291(false);
	}
}
