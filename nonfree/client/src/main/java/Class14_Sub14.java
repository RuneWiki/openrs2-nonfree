import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class14_Sub14 extends Class14 {

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "[I")
	public int[] anIntArray106 = new int[] { -1 };

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "[I")
	public int[] anIntArray107 = new int[1];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!wt;IZILclient!ha;Lclient!jaa;)Lclient!ka;")
	public Class129 method1787(@OriginalArg(1) Class398 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(5) Class144 arg3, @OriginalArg(6) Class181 arg4) {
		@Pc(7) Class129 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(19) Class141 local19 = null;
		if (arg1 != -1) {
			local19 = Static52.aClass175_1.method4257(arg1);
		}
		@Pc(31) int[] local31 = this.anIntArray106;
		if (local19 != null && local19.anIntArray206 != null) {
			local31 = new int[local19.anIntArray206.length];
			for (@Pc(45) int local45 = 0; local45 < local19.anIntArray206.length; local45++) {
				@Pc(52) int local52 = local19.anIntArray206[local45];
				if (local52 >= 0 && local52 < this.anIntArray106.length) {
					local31[local45] = this.anIntArray106[local52];
				} else {
					local31[local45] = -1;
				}
			}
		}
		if (arg4 != null) {
			local9 = arg4.method8947() | 0x800;
		}
		@Pc(119) long local119 = this.method1789(arg2, local31, arg1, arg0 == null ? null : arg0.anIntArray601);
		if (Static595.aClass317_66 != null) {
			local7 = (Class129) Static595.aClass317_66.method7882(local119);
		}
		if (local7 == null || arg3.method6967(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg3.method6937(local9, local7.ua());
			}
			@Pc(152) int local152 = local9;
			@Pc(154) boolean local154 = false;
			for (@Pc(156) int local156 = 0; local156 < local31.length; local156++) {
				if (local31[local156] != -1 && !Static252.aClass56_1.method1052(local31[local156]).method6832((Class206) null, arg2)) {
					local154 = true;
				}
			}
			if (local154) {
				return null;
			}
			@Pc(198) Class72[] local198 = new Class72[local31.length];
			for (@Pc(200) int local200 = 0; local200 < local31.length; local200++) {
				if (local31[local200] != -1) {
					local198[local200] = Static252.aClass56_1.method1052(local31[local200]).method6830((Class206) null, arg2);
				}
			}
			@Pc(272) int local272;
			@Pc(279) int local279;
			if (local19 != null && local19.anIntArrayArray24 != null) {
				for (@Pc(246) int local246 = 0; local246 < local19.anIntArrayArray24.length; local246++) {
					if (local19.anIntArrayArray24[local246] != null && local198[local246] != null) {
						local272 = local19.anIntArrayArray24[local246][0];
						local279 = local19.anIntArrayArray24[local246][1];
						@Pc(286) int local286 = local19.anIntArrayArray24[local246][2];
						@Pc(293) int local293 = local19.anIntArrayArray24[local246][3];
						@Pc(300) int local300 = local19.anIntArrayArray24[local246][4];
						@Pc(307) int local307 = local19.anIntArrayArray24[local246][5];
						if (local293 != 0 || local300 != 0 || local307 != 0) {
							local198[local246].method1686(local307, local300, local293);
						}
						if (local272 != 0 || local279 != 0 || local286 != 0) {
							local198[local246].method1694(local286, local279, local272);
						}
					}
				}
			}
			if (arg0 != null) {
				local152 = local9 | 0x4000;
			}
			@Pc(378) Class72 local378 = new Class72(local198, local198.length);
			local7 = arg3.method6908(local378, local152, Static174.anInt2842, 64, 850);
			if (arg0 != null) {
				for (local272 = 0; local272 < 10; local272++) {
					for (local279 = 0; local279 < Static673.aShortArrayArray6[local272].length; local279++) {
						if (arg0.anIntArray601[local272] < Static222.aShortArrayArrayArray1[local272][local279].length) {
							local7.ia(Static673.aShortArrayArray6[local272][local279], Static222.aShortArrayArrayArray1[local272][local279][arg0.anIntArray601[local272]]);
						}
					}
				}
			}
			if (Static595.aClass317_66 != null) {
				local7.s(local9);
				Static595.aClass317_66.method7875(local119, local7);
			}
		}
		if (arg4 == null) {
			return local7;
		} else {
			@Pc(472) Class129 local472 = local7.method5288((byte) 1, local9, true);
			arg4.method8956(local472, 0);
			return local472;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z[IIB[I)J")
	private long method1789(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(18) long[] local18 = Class14_Sub7_Sub2.aLongArray5;
		@Pc(20) long local20 = -1L;
		@Pc(36) long local36 = local18[(int) (((long) (arg2 >> 8) ^ local20) & 0xFFL)] ^ local20 >>> 8;
		local20 = local36 >>> 8 ^ local18[(int) (((long) arg2 ^ local36) & 0xFFL)];
		for (@Pc(52) int local52 = 0; local52 < arg1.length; local52++) {
			local20 = local18[(int) ((local20 ^ (long) (arg1[local52] >> 24)) & 0xFFL)] ^ local20 >>> 8;
			local20 = local18[(int) (((long) (arg1[local52] >> 16) ^ local20) & 0xFFL)] ^ local20 >>> 8;
			local20 = local18[(int) (((long) (arg1[local52] >> 8) ^ local20) & 0xFFL)] ^ local20 >>> 8;
			local20 = local18[(int) (((long) arg1[local52] ^ local20) & 0xFFL)] ^ local20 >>> 8;
		}
		if (arg3 != null) {
			for (@Pc(137) int local137 = 0; local137 < 5; local137++) {
				local20 = local18[(int) ((local20 ^ (long) arg3[local137]) & 0xFFL)] ^ local20 >>> 8;
			}
		}
		return local18[(int) (((long) (arg0 ? 1 : 0) ^ local20) & 0xFFL)] ^ local20 >>> 8;
	}
}
