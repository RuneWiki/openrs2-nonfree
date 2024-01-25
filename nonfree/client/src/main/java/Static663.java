import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static663 {

	@OriginalMember(owner = "client!wja", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "Lclient!ow;")
	public static Class271 aClass271_67 = new Class271();

	@OriginalMember(owner = "client!wja", name = "i", descriptor = "[I")
	public static final int[] anIntArray593 = new int[13];

	@OriginalMember(owner = "client!wja", name = "k", descriptor = "Lclient!in;")
	public static final Class169 aClass169_265 = new Class169(41, 6);

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(B[B)Lclient!jn;")
	public static Class2_Sub1_Sub10 method9678(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class2_Sub1_Sub10 local9 = new Class2_Sub1_Sub10();
		@Pc(14) Class2_Sub8 local14 = new Class2_Sub8(arg0);
		local14.anInt5725 = local14.lb.length - 2;
		@Pc(25) int local25 = local14.method5211();
		@Pc(44) int local44 = local14.lb.length - local25 - 2 - 16;
		local14.anInt5725 = local44;
		@Pc(51) int local51 = local14.method5172();
		local9.anInt5356 = local14.method5211();
		local9.anInt5351 = local14.method5211();
		local9.anInt5354 = local14.method5211();
		local9.anInt5353 = local14.method5211();
		local9.anInt5352 = local14.method5211();
		local9.anInt5357 = local14.method5211();
		@Pc(85) int local85 = local14.method5203();
		@Pc(93) int local93;
		@Pc(99) int local99;
		if (local85 > 0) {
			local9.aClass335Array1 = new Class335[local85];
			for (local93 = 0; local93 < local85; local93++) {
				local99 = local14.method5211();
				@Pc(106) Class335 local106 = new Class335(Static432.method7064(local99));
				local9.aClass335Array1[local93] = local106;
				while (local99-- > 0) {
					@Pc(117) int local117 = local14.method5172();
					@Pc(121) int local121 = local14.method5172();
					local106.method8356(new Class2_Sub14(local121), (long) local117);
				}
			}
		}
		local14.anInt5725 = 0;
		local9.aString65 = local14.method5224();
		local9.anIntArray271 = new int[local51];
		local93 = 0;
		while (local44 > local14.anInt5725) {
			local99 = local14.method5211();
			if (local99 == 3) {
				if (local9.aStringArray31 == null) {
					local9.aStringArray31 = new String[local51];
				}
				local9.aStringArray31[local93] = local14.method5178().intern();
			} else if (local99 == 54) {
				if (local9.aLongArray13 == null) {
					local9.aLongArray13 = new long[local51];
				}
				local9.aLongArray13[local93] = local14.method5213();
			} else {
				if (local9.anIntArray272 == null) {
					local9.anIntArray272 = new int[local51];
				}
				if (local99 >= 150 || local99 == 21 || local99 == 38 || local99 == 39) {
					local9.anIntArray272[local93] = local14.method5203();
				} else {
					local9.anIntArray272[local93] = local14.method5172();
				}
			}
			local9.anIntArray271[local93++] = local99;
		}
		return local9;
	}
}
