import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!eq;I)Lclient!fw;")
	public static Class120 method3064(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method2570(arg1);
		return local4 == null ? null : method3066(local4)[0];
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "([B)[Lclient!fw;")
	private static Class120[] method3066(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub34 local4 = new Class2_Sub34(arg0);
		local4.anInt8188 = arg0.length - 2;
		@Pc(14) int local14 = local4.method6884();
		@Pc(17) Class120[] local17 = new Class120[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			local17[local19] = new Class120();
		}
		local4.anInt8188 = arg0.length - local14 * 8 - 7;
		@Pc(44) int local44 = local4.method6884();
		@Pc(48) int local48 = local4.method6884();
		@Pc(56) int local56 = (local4.method6904() & 0xFF) + 1;
		for (@Pc(58) int local58 = 0; local58 < local14; local58++) {
			local17[local58].anInt3708 = local4.method6884();
		}
		for (@Pc(72) int local72 = 0; local72 < local14; local72++) {
			local17[local72].anInt3705 = local4.method6884();
		}
		for (@Pc(86) int local86 = 0; local86 < local14; local86++) {
			local17[local86].anInt3710 = local4.method6884();
		}
		for (@Pc(100) int local100 = 0; local100 < local14; local100++) {
			local17[local100].anInt3707 = local4.method6884();
		}
		for (@Pc(114) int local114 = 0; local114 < local14; local114++) {
			@Pc(119) Class120 local119 = local17[local114];
			local119.anInt3706 = local44 - local119.anInt3710 - local119.anInt3708;
			local119.anInt3709 = local48 - local119.anInt3707 - local119.anInt3705;
		}
		local4.anInt8188 = arg0.length - local14 * 8 - (local56 - 1) * 3 - 7;
		@Pc(160) int[] local160 = new int[local56];
		for (@Pc(162) int local162 = 1; local162 < local56; local162++) {
			local160[local162] = local4.method6870();
			if (local160[local162] == 0) {
				local160[local162] = 1;
			}
		}
		for (@Pc(183) int local183 = 0; local183 < local14; local183++) {
			local17[local183].anIntArray261 = local160;
		}
		local4.anInt8188 = 0;
		for (@Pc(198) int local198 = 0; local198 < local14; local198++) {
			@Pc(203) Class120 local203 = local17[local198];
			@Pc(209) int local209 = local203.anInt3710 * local203.anInt3707;
			local203.aByteArray36 = new byte[local209];
			@Pc(217) int local217 = local4.method6904();
			@Pc(245) int local245;
			if ((local217 & 0x2) == 0) {
				@Pc(227) int local227;
				if ((local217 & 0x1) == 0) {
					for (local227 = 0; local227 < local209; local227++) {
						local203.aByteArray36[local227] = local4.method6908();
					}
				} else {
					for (local227 = 0; local227 < local203.anInt3710; local227++) {
						for (local245 = 0; local245 < local203.anInt3707; local245++) {
							local203.aByteArray36[local227 + local245 * local203.anInt3710] = local4.method6908();
						}
					}
				}
			} else {
				@Pc(271) boolean local271 = false;
				local203.aByteArray35 = new byte[local209];
				@Pc(295) int local295;
				if ((local217 & 0x1) == 0) {
					for (local245 = 0; local245 < local209; local245++) {
						local203.aByteArray36[local245] = local4.method6908();
					}
					for (local295 = 0; local295 < local209; local295++) {
						@Pc(305) byte local305 = local203.aByteArray35[local295] = local4.method6908();
						local271 |= local305 != -1;
					}
				} else {
					for (local245 = 0; local245 < local203.anInt3710; local245++) {
						for (local295 = 0; local295 < local203.anInt3707; local295++) {
							local203.aByteArray36[local245 + local295 * local203.anInt3710] = local4.method6908();
						}
					}
					for (local295 = 0; local295 < local203.anInt3710; local295++) {
						for (@Pc(352) int local352 = 0; local352 < local203.anInt3707; local352++) {
							@Pc(367) byte local367 = local203.aByteArray35[local295 + local352 * local203.anInt3710] = local4.method6908();
							local271 |= local367 != -1;
						}
					}
				}
				if (!local271) {
					local203.aByteArray35 = null;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!eq;II)Lclient!fw;")
	public static Class120 method3070(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method2545(arg2, arg1);
		return local5 == null ? null : method3066(local5)[0];
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(Lclient!eq;I)[Lclient!fw;")
	public static Class120[] method3073(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method2570(arg1);
		return local4 == null ? null : method3066(local4);
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(Lclient!eq;II)[Lclient!fw;")
	public static Class120[] method3075(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method2545(0, arg1);
		return local5 == null ? null : method3066(local5);
	}
}
