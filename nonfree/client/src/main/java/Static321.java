import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!ql", name = "fd", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_76 = new Class44(49, 8);

	@OriginalMember(owner = "client!ql", name = "pd", descriptor = "I")
	public static int anInt5749 = 0;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4602(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static366.method5100("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z[B)Lclient!sj;")
	public static Class2_Sub2_Sub16 method4606(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class2_Sub2_Sub16 local9 = new Class2_Sub2_Sub16();
		@Pc(14) Class2_Sub20 local14 = new Class2_Sub20(arg0);
		local14.anInt4608 = local14.aByteArray136.length - 2;
		@Pc(25) int local25 = local14.method3711();
		@Pc(36) int local36 = local14.aByteArray136.length - local25 - 2 - 12;
		local14.anInt4608 = local36;
		@Pc(43) int local43 = local14.method3731();
		local9.anInt6336 = local14.method3711();
		local9.anInt6339 = local14.method3711();
		local9.anInt6343 = local14.method3711();
		local9.anInt6342 = local14.method3711();
		@Pc(72) int local72 = local14.method3737();
		@Pc(83) int local83;
		@Pc(89) int local89;
		if (local72 > 0) {
			local9.aClass240Array1 = new Class240[local72];
			for (local83 = 0; local83 < local72; local83++) {
				local89 = local14.method3711();
				@Pc(96) Class240 local96 = new Class240(Static316.method4530(local89));
				local9.aClass240Array1[local83] = local96;
				while (local89-- > 0) {
					@Pc(107) int local107 = local14.method3731();
					@Pc(111) int local111 = local14.method3731();
					local96.method5430((long) local107, new Class2_Sub16(local111));
				}
			}
		}
		local14.anInt4608 = 0;
		local9.aString52 = local14.method3688();
		local9.anIntArray424 = new int[local43];
		local9.anIntArray423 = new int[local43];
		local9.aStringArray34 = new String[local43];
		local83 = 0;
		while (local36 > local14.anInt4608) {
			local89 = local14.method3711();
			if (local89 == 3) {
				local9.aStringArray34[local83] = local14.method3717().intern();
			} else if (local89 >= 100 || local89 == 21 || local89 == 38 || local89 == 39) {
				local9.anIntArray423[local83] = local14.method3737();
			} else {
				local9.anIntArray423[local83] = local14.method3731();
			}
			local9.anIntArray424[local83++] = local89;
		}
		return local9;
	}
}
