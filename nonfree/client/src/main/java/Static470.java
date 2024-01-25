import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([B)[Lclient!ok;")
	private static Class190[] method4228(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub17 local4 = new Class2_Sub17(arg0);
		local4.anInt7523 = arg0.length - 2;
		@Pc(14) int local14 = local4.method6148();
		@Pc(17) Class190[] local17 = new Class190[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			local17[local19] = new Class190();
		}
		local4.anInt7523 = arg0.length - local14 * 8 - 7;
		@Pc(44) int local44 = local4.method6148();
		@Pc(48) int local48 = local4.method6148();
		@Pc(56) int local56 = (local4.method6138() & 0xFF) + 1;
		for (@Pc(58) int local58 = 0; local58 < local14; local58++) {
			local17[local58].anInt5311 = local4.method6148();
		}
		for (@Pc(72) int local72 = 0; local72 < local14; local72++) {
			local17[local72].anInt5315 = local4.method6148();
		}
		for (@Pc(86) int local86 = 0; local86 < local14; local86++) {
			local17[local86].anInt5312 = local4.method6148();
		}
		for (@Pc(100) int local100 = 0; local100 < local14; local100++) {
			local17[local100].anInt5313 = local4.method6148();
		}
		for (@Pc(114) int local114 = 0; local114 < local14; local114++) {
			@Pc(119) Class190 local119 = local17[local114];
			local119.anInt5310 = local44 - local119.anInt5312 - local119.anInt5311;
			local119.anInt5314 = local48 - local119.anInt5313 - local119.anInt5315;
		}
		local4.anInt7523 = arg0.length - local14 * 8 - (local56 - 1) * 3 - 7;
		@Pc(160) int[] local160 = new int[local56];
		for (@Pc(162) int local162 = 1; local162 < local56; local162++) {
			local160[local162] = local4.method6145();
			if (local160[local162] == 0) {
				local160[local162] = 1;
			}
		}
		for (@Pc(183) int local183 = 0; local183 < local14; local183++) {
			local17[local183].anIntArray453 = local160;
		}
		local4.anInt7523 = 0;
		for (@Pc(198) int local198 = 0; local198 < local14; local198++) {
			@Pc(203) Class190 local203 = local17[local198];
			@Pc(209) int local209 = local203.anInt5312 * local203.anInt5313;
			local203.aByteArray58 = new byte[local209];
			@Pc(217) int local217 = local4.method6138();
			@Pc(245) int local245;
			if ((local217 & 0x2) == 0) {
				@Pc(227) int local227;
				if ((local217 & 0x1) == 0) {
					for (local227 = 0; local227 < local209; local227++) {
						local203.aByteArray58[local227] = local4.method6120();
					}
				} else {
					for (local227 = 0; local227 < local203.anInt5312; local227++) {
						for (local245 = 0; local245 < local203.anInt5313; local245++) {
							local203.aByteArray58[local227 + local245 * local203.anInt5312] = local4.method6120();
						}
					}
				}
			} else {
				@Pc(271) boolean local271 = false;
				local203.aByteArray57 = new byte[local209];
				@Pc(295) int local295;
				if ((local217 & 0x1) == 0) {
					for (local245 = 0; local245 < local209; local245++) {
						local203.aByteArray58[local245] = local4.method6120();
					}
					for (local295 = 0; local295 < local209; local295++) {
						@Pc(305) byte local305 = local203.aByteArray57[local295] = local4.method6120();
						local271 |= local305 != -1;
					}
				} else {
					for (local245 = 0; local245 < local203.anInt5312; local245++) {
						for (local295 = 0; local295 < local203.anInt5313; local295++) {
							local203.aByteArray58[local245 + local295 * local203.anInt5312] = local4.method6120();
						}
					}
					for (local295 = 0; local295 < local203.anInt5312; local295++) {
						for (@Pc(352) int local352 = 0; local352 < local203.anInt5313; local352++) {
							@Pc(367) byte local367 = local203.aByteArray57[local295 + local352 * local203.anInt5312] = local4.method6120();
							local271 |= local367 != -1;
						}
					}
				}
				if (!local271) {
					local203.aByteArray57 = null;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!mn;I)[Lclient!ok;")
	public static Class190[] method4230(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method3664(arg1);
		return local4 == null ? null : method4228(local4);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!mn;II)[Lclient!ok;")
	public static Class190[] method4237(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method3658(arg1, 0);
		return local5 == null ? null : method4228(local5);
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lclient!mn;I)Lclient!ok;")
	public static Class190 method4239(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method3664(arg1);
		return local4 == null ? null : method4228(local4)[0];
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lclient!mn;II)Lclient!ok;")
	public static Class190 method4242(@OriginalArg(0) Class171 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3658(arg1, arg2);
		return local5 == null ? null : method4228(local5)[0];
	}
}
