import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "Lclient!tv;")
	public static Class2_Sub6_Sub21 aClass2_Sub6_Sub21_3;

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
	public static int anInt4754;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!vo;)[Lclient!mi;")
	public static Class242[] method4326(@OriginalArg(1) Class389 arg0) {
		if (!arg0.method9275()) {
			return new Class242[0];
		}
		@Pc(17) Class163 local17 = arg0.method9272();
		while (local17.anInt3843 == 0) {
			Static570.method7907(10L);
		}
		if (local17.anInt3843 == 2) {
			return new Class242[0];
		}
		@Pc(43) int[] local43 = (int[]) local17.anObject5;
		@Pc(49) Class242[] local49 = new Class242[local43.length >> 2];
		for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
			@Pc(57) Class242 local57 = new Class242();
			local49[local51] = local57;
			local57.anInt6519 = local43[local51 << 2];
			local57.anInt6517 = local43[(local51 << 2) + 1];
			local57.anInt6516 = local43[(local51 << 2) + 2];
			local57.anInt6518 = local43[(local51 << 2) + 3];
		}
		return local49;
	}
}
