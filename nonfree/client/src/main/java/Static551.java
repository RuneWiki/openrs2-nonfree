import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!kea;II)[Lclient!af;")
	public static Class9[] method526(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method4243(0, arg1);
		return local5 == null ? null : method528(local5);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([B)[Lclient!af;")
	private static Class9[] method528(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub27 local4 = new Class3_Sub27(arg0);
		local4.anInt9191 = arg0.length - 2;
		@Pc(14) int local14 = local4.method7591();
		@Pc(17) Class9[] local17 = new Class9[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			local17[local19] = new Class9();
		}
		local4.anInt9191 = arg0.length - local14 * 8 - 7;
		@Pc(44) int local44 = local4.method7591();
		@Pc(48) int local48 = local4.method7591();
		@Pc(56) int local56 = (local4.method7548() & 0xFF) + 1;
		for (@Pc(58) int local58 = 0; local58 < local14; local58++) {
			local17[local58].anInt476 = local4.method7591();
		}
		for (@Pc(72) int local72 = 0; local72 < local14; local72++) {
			local17[local72].anInt477 = local4.method7591();
		}
		for (@Pc(86) int local86 = 0; local86 < local14; local86++) {
			local17[local86].anInt478 = local4.method7591();
		}
		for (@Pc(100) int local100 = 0; local100 < local14; local100++) {
			local17[local100].anInt481 = local4.method7591();
		}
		for (@Pc(114) int local114 = 0; local114 < local14; local114++) {
			@Pc(119) Class9 local119 = local17[local114];
			local119.anInt480 = local44 - local119.anInt478 - local119.anInt476;
			local119.anInt479 = local48 - local119.anInt481 - local119.anInt477;
		}
		local4.anInt9191 = arg0.length - local14 * 8 - (local56 - 1) * 3 - 7;
		@Pc(160) int[] local160 = new int[local56];
		for (@Pc(162) int local162 = 1; local162 < local56; local162++) {
			local160[local162] = local4.method7551();
			if (local160[local162] == 0) {
				local160[local162] = 1;
			}
		}
		for (@Pc(183) int local183 = 0; local183 < local14; local183++) {
			local17[local183].anIntArray90 = local160;
		}
		local4.anInt9191 = 0;
		for (@Pc(198) int local198 = 0; local198 < local14; local198++) {
			@Pc(203) Class9 local203 = local17[local198];
			@Pc(209) int local209 = local203.anInt478 * local203.anInt481;
			local203.aByteArray13 = new byte[local209];
			@Pc(217) int local217 = local4.method7548();
			@Pc(245) int local245;
			if ((local217 & 0x2) == 0) {
				@Pc(227) int local227;
				if ((local217 & 0x1) == 0) {
					for (local227 = 0; local227 < local209; local227++) {
						local203.aByteArray13[local227] = local4.method7584();
					}
				} else {
					for (local227 = 0; local227 < local203.anInt478; local227++) {
						for (local245 = 0; local245 < local203.anInt481; local245++) {
							local203.aByteArray13[local227 + local245 * local203.anInt478] = local4.method7584();
						}
					}
				}
			} else {
				@Pc(271) boolean local271 = false;
				local203.aByteArray12 = new byte[local209];
				@Pc(295) int local295;
				if ((local217 & 0x1) == 0) {
					for (local245 = 0; local245 < local209; local245++) {
						local203.aByteArray13[local245] = local4.method7584();
					}
					for (local295 = 0; local295 < local209; local295++) {
						@Pc(305) byte local305 = local203.aByteArray12[local295] = local4.method7584();
						local271 |= local305 != -1;
					}
				} else {
					for (local245 = 0; local245 < local203.anInt478; local245++) {
						for (local295 = 0; local295 < local203.anInt481; local295++) {
							local203.aByteArray13[local245 + local295 * local203.anInt478] = local4.method7584();
						}
					}
					for (local295 = 0; local295 < local203.anInt478; local295++) {
						for (@Pc(352) int local352 = 0; local352 < local203.anInt481; local352++) {
							@Pc(367) byte local367 = local203.aByteArray12[local295 + local352 * local203.anInt478] = local4.method7584();
							local271 |= local367 != -1;
						}
					}
				}
				if (!local271) {
					local203.aByteArray12 = null;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(Lclient!kea;II)Lclient!af;")
	public static Class9 method531(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method4243(arg2, arg1);
		return local5 == null ? null : method528(local5)[0];
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!kea;I)[Lclient!af;")
	public static Class9[] method533(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method4265(arg1);
		return local4 == null ? null : method528(local4);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(Lclient!kea;I)Lclient!af;")
	public static Class9 method538(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method4265(arg1);
		return local4 == null ? null : method528(local4)[0];
	}
}
