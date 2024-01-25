import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!lt;II)Lclient!fd;")
	public static Class77 method1703(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3672(arg2, arg1);
		return local5 == null ? null : method1717(local5)[0];
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Lclient!lt;II)[Lclient!fd;")
	public static Class77[] method1708(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.method3672(0, arg1);
		return local5 == null ? null : method1717(local5);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!lt;I)[Lclient!fd;")
	public static Class77[] method1713(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method3691(arg1);
		return local4 == null ? null : method1717(local4);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Lclient!lt;I)Lclient!fd;")
	public static Class77 method1716(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method3691(arg1);
		return local4 == null ? null : method1717(local4)[0];
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([B)[Lclient!fd;")
	private static Class77[] method1717(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class6_Sub15 local4 = new Class6_Sub15(arg0);
		local4.anInt3487 = arg0.length - 2;
		@Pc(14) int local14 = local4.method3108();
		@Pc(17) Class77[] local17 = new Class77[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			local17[local19] = new Class77();
		}
		local4.anInt3487 = arg0.length - local14 * 8 - 7;
		@Pc(44) int local44 = local4.method3108();
		@Pc(48) int local48 = local4.method3108();
		@Pc(56) int local56 = (local4.method3111() & 0xFF) + 1;
		for (@Pc(58) int local58 = 0; local58 < local14; local58++) {
			local17[local58].anInt1845 = local4.method3108();
		}
		for (@Pc(72) int local72 = 0; local72 < local14; local72++) {
			local17[local72].anInt1846 = local4.method3108();
		}
		for (@Pc(86) int local86 = 0; local86 < local14; local86++) {
			local17[local86].anInt1842 = local4.method3108();
		}
		for (@Pc(100) int local100 = 0; local100 < local14; local100++) {
			local17[local100].anInt1844 = local4.method3108();
		}
		for (@Pc(114) int local114 = 0; local114 < local14; local114++) {
			@Pc(119) Class77 local119 = local17[local114];
			local119.anInt1847 = local44 - local119.anInt1842 - local119.anInt1845;
			local119.anInt1843 = local48 - local119.anInt1844 - local119.anInt1846;
		}
		local4.anInt3487 = arg0.length - local14 * 8 - (local56 - 1) * 3 - 7;
		@Pc(160) int[] local160 = new int[local56];
		for (@Pc(162) int local162 = 1; local162 < local56; local162++) {
			local160[local162] = local4.method3078();
			if (local160[local162] == 0) {
				local160[local162] = 1;
			}
		}
		for (@Pc(183) int local183 = 0; local183 < local14; local183++) {
			local17[local183].anIntArray196 = local160;
		}
		local4.anInt3487 = 0;
		for (@Pc(198) int local198 = 0; local198 < local14; local198++) {
			@Pc(203) Class77 local203 = local17[local198];
			@Pc(209) int local209 = local203.anInt1842 * local203.anInt1844;
			local203.aByteArray23 = new byte[local209];
			@Pc(217) int local217 = local4.method3111();
			@Pc(245) int local245;
			if ((local217 & 0x2) == 0) {
				@Pc(227) int local227;
				if ((local217 & 0x1) == 0) {
					for (local227 = 0; local227 < local209; local227++) {
						local203.aByteArray23[local227] = local4.method3116();
					}
				} else {
					for (local227 = 0; local227 < local203.anInt1842; local227++) {
						for (local245 = 0; local245 < local203.anInt1844; local245++) {
							local203.aByteArray23[local227 + local245 * local203.anInt1842] = local4.method3116();
						}
					}
				}
			} else {
				@Pc(271) boolean local271 = false;
				local203.aByteArray24 = new byte[local209];
				@Pc(295) int local295;
				if ((local217 & 0x1) == 0) {
					for (local245 = 0; local245 < local209; local245++) {
						local203.aByteArray23[local245] = local4.method3116();
					}
					for (local295 = 0; local295 < local209; local295++) {
						@Pc(305) byte local305 = local203.aByteArray24[local295] = local4.method3116();
						local271 |= local305 != -1;
					}
				} else {
					for (local245 = 0; local245 < local203.anInt1842; local245++) {
						for (local295 = 0; local295 < local203.anInt1844; local295++) {
							local203.aByteArray23[local245 + local295 * local203.anInt1842] = local4.method3116();
						}
					}
					for (local295 = 0; local295 < local203.anInt1842; local295++) {
						for (@Pc(352) int local352 = 0; local352 < local203.anInt1844; local352++) {
							@Pc(367) byte local367 = local203.aByteArray24[local295 + local352 * local203.anInt1842] = local4.method3116();
							local271 |= local367 != -1;
						}
					}
				}
				if (!local271) {
					local203.aByteArray24 = null;
				}
			}
		}
		return local17;
	}
}
