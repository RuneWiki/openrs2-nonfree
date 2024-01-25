import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "[Lclient!ta;")
	public static Class165[] aClass165Array1;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
	public static int anInt407;

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
	public static final int anInt403 = 1401;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!gk;)Lclient!ie;")
	public static Class60_Sub2 method311(@OriginalArg(1) Class7_Sub14 arg0) {
		return new Class60_Sub2(arg0.method3961(), arg0.method3961(), arg0.method3961(), arg0.method3961(), arg0.method3975(), arg0.method3981());
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([BB)Lclient!tq;")
	public static Class7_Sub4_Sub16 method312(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class7_Sub4_Sub16 local9 = new Class7_Sub4_Sub16();
		@Pc(14) Class7_Sub14 local14 = new Class7_Sub14(arg0);
		local14.anInt4989 = local14.aByteArray75.length - 2;
		@Pc(30) int local30 = local14.method3943();
		@Pc(41) int local41 = local14.aByteArray75.length - local30 - 2 - 12;
		local14.anInt4989 = local41;
		@Pc(48) int local48 = local14.method3938();
		local9.anInt6298 = local14.method3943();
		local9.anInt6301 = local14.method3943();
		local9.anInt6296 = local14.method3943();
		local9.anInt6302 = local14.method3943();
		@Pc(72) int local72 = local14.method3981();
		@Pc(83) int local83;
		@Pc(89) int local89;
		if (local72 > 0) {
			local9.aClass164Array1 = new Class164[local72];
			for (local83 = 0; local83 < local72; local83++) {
				local89 = local14.method3943();
				@Pc(96) Class164 local96 = new Class164(Static444.method5654(local89));
				local9.aClass164Array1[local83] = local96;
				while (local89-- > 0) {
					@Pc(107) int local107 = local14.method3938();
					@Pc(111) int local111 = local14.method3938();
					local96.method3508((long) local107, new Class7_Sub2(local111));
				}
			}
		}
		local14.anInt4989 = 0;
		local9.aString63 = local14.method3957();
		local9.anIntArray568 = new int[local48];
		local9.aStringArray50 = new String[local48];
		local9.anIntArray567 = new int[local48];
		local83 = 0;
		while (local41 > local14.anInt4989) {
			local89 = local14.method3943();
			if (local89 == 3) {
				local9.aStringArray50[local83] = local14.method3986().intern();
			} else if (local89 >= 100 || local89 == 21 || local89 == 38 || local89 == 39) {
				local9.anIntArray568[local83] = local14.method3981();
			} else {
				local9.anIntArray568[local83] = local14.method3938();
			}
			local9.anIntArray567[local83++] = local89;
		}
		return local9;
	}
}
