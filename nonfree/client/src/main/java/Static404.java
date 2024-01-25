import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([B)[Lclient!ua;")
	private static Class224[] method5303(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub13 local4 = new Class2_Sub13(arg0);
		local4.anInt4788 = arg0.length - 2;
		@Pc(14) int local14 = local4.method4245();
		@Pc(17) Class224[] local17 = new Class224[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			local17[local19] = new Class224();
		}
		local4.anInt4788 = arg0.length - local14 * 8 - 7;
		@Pc(44) int local44 = local4.method4245();
		@Pc(48) int local48 = local4.method4245();
		@Pc(56) int local56 = (local4.method4240() & 0xFF) + 1;
		for (@Pc(58) int local58 = 0; local58 < local14; local58++) {
			local17[local58].anInt6144 = local4.method4245();
		}
		for (@Pc(72) int local72 = 0; local72 < local14; local72++) {
			local17[local72].anInt6141 = local4.method4245();
		}
		for (@Pc(86) int local86 = 0; local86 < local14; local86++) {
			local17[local86].anInt6145 = local4.method4245();
		}
		for (@Pc(100) int local100 = 0; local100 < local14; local100++) {
			local17[local100].anInt6142 = local4.method4245();
		}
		for (@Pc(114) int local114 = 0; local114 < local14; local114++) {
			@Pc(119) Class224 local119 = local17[local114];
			local119.anInt6143 = local44 - local119.anInt6145 - local119.anInt6144;
			local119.anInt6146 = local48 - local119.anInt6142 - local119.anInt6141;
		}
		local4.anInt4788 = arg0.length - local14 * 8 - (local56 - 1) * 3 - 7;
		@Pc(160) int[] local160 = new int[local56];
		for (@Pc(162) int local162 = 1; local162 < local56; local162++) {
			local160[local162] = local4.method4235();
			if (local160[local162] == 0) {
				local160[local162] = 1;
			}
		}
		for (@Pc(183) int local183 = 0; local183 < local14; local183++) {
			local17[local183].anIntArray735 = local160;
		}
		local4.anInt4788 = 0;
		for (@Pc(198) int local198 = 0; local198 < local14; local198++) {
			@Pc(203) Class224 local203 = local17[local198];
			@Pc(209) int local209 = local203.anInt6145 * local203.anInt6142;
			local203.aByteArray97 = new byte[local209];
			@Pc(217) int local217 = local4.method4240();
			@Pc(245) int local245;
			if ((local217 & 0x2) == 0) {
				@Pc(227) int local227;
				if ((local217 & 0x1) == 0) {
					for (local227 = 0; local227 < local209; local227++) {
						local203.aByteArray97[local227] = local4.method4217();
					}
				} else {
					for (local227 = 0; local227 < local203.anInt6145; local227++) {
						for (local245 = 0; local245 < local203.anInt6142; local245++) {
							local203.aByteArray97[local227 + local245 * local203.anInt6145] = local4.method4217();
						}
					}
				}
			} else {
				@Pc(271) boolean local271 = false;
				local203.aByteArray96 = new byte[local209];
				@Pc(295) int local295;
				if ((local217 & 0x1) == 0) {
					for (local245 = 0; local245 < local209; local245++) {
						local203.aByteArray97[local245] = local4.method4217();
					}
					for (local295 = 0; local295 < local209; local295++) {
						@Pc(305) byte local305 = local203.aByteArray96[local295] = local4.method4217();
						local271 |= local305 != -1;
					}
				} else {
					for (local245 = 0; local245 < local203.anInt6145; local245++) {
						for (local295 = 0; local295 < local203.anInt6142; local295++) {
							local203.aByteArray97[local245 + local295 * local203.anInt6145] = local4.method4217();
						}
					}
					for (local295 = 0; local295 < local203.anInt6145; local295++) {
						for (@Pc(352) int local352 = 0; local352 < local203.anInt6142; local352++) {
							@Pc(367) byte local367 = local203.aByteArray96[local295 + local352 * local203.anInt6145] = local4.method4217();
							local271 |= local367 != -1;
						}
					}
				}
				if (!local271) {
					local203.aByteArray96 = null;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!fc;II)Lclient!ua;")
	public static Class224 method5304(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method1555(arg1, arg2);
		return local5 == null ? null : method5303(local5)[0];
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Lclient!fc;II)[Lclient!ua;")
	public static Class224[] method5314(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method1555(arg1, 0);
		return local5 == null ? null : method5303(local5);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!fc;I)[Lclient!ua;")
	public static Class224[] method5315(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method1564(arg1);
		return local4 == null ? null : method5303(local4);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Lclient!fc;I)Lclient!ua;")
	public static Class224 method5316(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method1564(arg1);
		return local4 == null ? null : method5303(local4)[0];
	}
}
