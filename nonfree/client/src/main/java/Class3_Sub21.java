import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!r", name = "p", descriptor = "[S")
	public final short[] aShortArray44 = new short[128];

	@OriginalMember(owner = "client!r", name = "q", descriptor = "[Lclient!tb;")
	public final Class3_Sub24_Sub1[] aClass3_Sub24_Sub1Array1 = new Class3_Sub24_Sub1[128];

	@OriginalMember(owner = "client!r", name = "r", descriptor = "[B")
	public final byte[] aByteArray34 = new byte[128];

	@OriginalMember(owner = "client!r", name = "u", descriptor = "[Lclient!hj;")
	public final Class43[] aClass43Array1 = new Class43[128];

	@OriginalMember(owner = "client!r", name = "v", descriptor = "[B")
	public final byte[] aByteArray35 = new byte[128];

	@OriginalMember(owner = "client!r", name = "w", descriptor = "[B")
	public final byte[] aByteArray36 = new byte[128];

	@OriginalMember(owner = "client!r", name = "x", descriptor = "I")
	public final int anInt3310;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "[I")
	private int[] anIntArray249 = new int[128];

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "([B)V")
	public Class3_Sub21(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class3_Sub4 local36 = new Class3_Sub4(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray12[local38 + local36.anInt1758] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method1248();
		}
		local36.anInt1758++;
		local38++;
		@Pc(79) int local79 = local36.anInt1758;
		local36.anInt1758 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray12[local36.anInt1758 + local87] != 0; local87++) {
		}
		@Pc(102) byte[] local102 = new byte[local87];
		for (@Pc(104) int local104 = 0; local104 < local87; local104++) {
			local102[local104] = local36.method1248();
		}
		local36.anInt1758++;
		local87++;
		@Pc(129) int local129 = 0;
		@Pc(132) int local132 = local36.anInt1758;
		local36.anInt1758 += local87;
		while (local36.aByteArray12[local36.anInt1758 + local129] != 0) {
			local129++;
		}
		@Pc(155) byte[] local155 = new byte[local129];
		for (@Pc(157) int local157 = 0; local157 < local129; local157++) {
			local155[local157] = local36.method1248();
		}
		local36.anInt1758++;
		local129++;
		@Pc(183) byte[] local183 = new byte[local129];
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(204) int local204;
		if (local129 > 1) {
			local190 = 2;
			local183[1] = 1;
			@Pc(196) int local196 = 1;
			for (local198 = 2; local198 < local129; local198++) {
				local204 = local36.method1278();
				if (local204 == 0) {
					local196 = local190++;
				} else {
					if (local196 >= local204) {
						local204--;
					}
					local196 = local204;
				}
				local183[local198] = (byte) local196;
			}
		} else {
			local190 = local129;
		}
		@Pc(240) Class43[] local240 = new Class43[local190];
		for (local198 = 0; local198 < local240.length; local198++) {
			@Pc(252) Class43 local252 = local240[local198] = new Class43();
			@Pc(256) int local256 = local36.method1278();
			if (local256 > 0) {
				local252.aByteArray10 = new byte[local256 * 2];
			}
			local256 = local36.method1278();
			if (local256 > 0) {
				local252.aByteArray11 = new byte[local256 * 2 + 2];
				local252.aByteArray11[1] = 64;
			}
		}
		local204 = local36.method1278();
		@Pc(314) byte[] local314 = local204 > 0 ? new byte[local204 * 2] : null;
		@Pc(316) int local316 = 0;
		local204 = local36.method1278();
		@Pc(329) byte[] local329 = local204 <= 0 ? null : new byte[local204 * 2];
		while (local36.aByteArray12[local36.anInt1758 + local316] != 0) {
			local316++;
		}
		@Pc(347) byte[] local347 = new byte[local316];
		for (@Pc(349) int local349 = 0; local349 < local316; local349++) {
			local347[local349] = local36.method1248();
		}
		local316++;
		local36.anInt1758++;
		@Pc(374) int local374 = 0;
		for (@Pc(376) int local376 = 0; local376 < 128; local376++) {
			local374 += local36.method1278();
			this.aShortArray44[local376] = (short) local374;
		}
		local374 = 0;
		for (@Pc(400) int local400 = 0; local400 < 128; local400++) {
			local374 += local36.method1278();
			this.aShortArray44[local400] = (short) (this.aShortArray44[local400] + (local374 << 8));
		}
		@Pc(425) int local425 = 0;
		@Pc(427) int local427 = 0;
		@Pc(429) int local429 = 0;
		for (@Pc(431) int local431 = 0; local431 < 128; local431++) {
			if (local425 == 0) {
				if (local347.length <= local427) {
					local425 = -1;
				} else {
					local425 = local347[local427++];
				}
				local429 = local36.method1256();
			}
			this.aShortArray44[local431] = (short) (this.aShortArray44[local431] + ((local429 - 1 & 0x2) << 14));
			this.anIntArray249[local431] = local429;
			local425--;
		}
		@Pc(482) int local482 = 0;
		local427 = 0;
		local425 = 0;
		for (@Pc(488) int local488 = 0; local488 < 128; local488++) {
			if (this.anIntArray249[local488] != 0) {
				if (local425 == 0) {
					local482 = local36.aByteArray12[local79++] - 1;
					if (local55.length > local427) {
						local425 = local55[local427++];
					} else {
						local425 = -1;
					}
				}
				local425--;
				this.aByteArray35[local488] = (byte) local482;
			}
		}
		@Pc(531) int local531 = 0;
		local425 = 0;
		local427 = 0;
		for (@Pc(537) int local537 = 0; local537 < 128; local537++) {
			if (this.anIntArray249[local537] != 0) {
				if (local425 == 0) {
					local531 = local36.aByteArray12[local132++] + 16 << 2;
					if (local102.length <= local427) {
						local425 = -1;
					} else {
						local425 = local102[local427++];
					}
				}
				local425--;
				this.aByteArray34[local537] = (byte) local531;
			}
		}
		local427 = 0;
		local425 = 0;
		@Pc(593) Class43 local593 = null;
		for (@Pc(595) int local595 = 0; local595 < 128; local595++) {
			if (this.anIntArray249[local595] != 0) {
				if (local425 == 0) {
					local593 = local240[local183[local427]];
					if (local427 >= local155.length) {
						local425 = -1;
					} else {
						local425 = local155[local427++];
					}
				}
				this.aClass43Array1[local595] = local593;
				local425--;
			}
		}
		local425 = 0;
		local427 = 0;
		@Pc(640) int local640 = 0;
		for (@Pc(642) int local642 = 0; local642 < 128; local642++) {
			if (local425 == 0) {
				if (local427 >= local347.length) {
					local425 = -1;
				} else {
					local425 = local347[local427++];
				}
				if (this.anIntArray249[local642] > 0) {
					local640 = local36.method1278() + 1;
				}
			}
			this.aByteArray36[local642] = (byte) local640;
			local425--;
		}
		this.anInt3310 = local36.method1278() + 1;
		@Pc(708) int local708;
		for (@Pc(697) int local697 = 0; local697 < local190; local697++) {
			@Pc(703) Class43 local703 = local240[local697];
			if (local703.aByteArray10 != null) {
				for (local708 = 1; local708 < local703.aByteArray10.length; local708 += 2) {
					local703.aByteArray10[local708] = local36.method1248();
				}
			}
			if (local703.aByteArray11 != null) {
				for (local708 = 3; local708 < local703.aByteArray11.length - 2; local708 += 2) {
					local703.aByteArray11[local708] = local36.method1248();
				}
			}
		}
		@Pc(761) int local761;
		if (local314 != null) {
			for (local761 = 1; local761 < local314.length; local761 += 2) {
				local314[local761] = local36.method1248();
			}
		}
		if (local329 != null) {
			for (local761 = 1; local761 < local329.length; local761 += 2) {
				local329[local761] = local36.method1248();
			}
		}
		@Pc(810) int local810;
		for (local761 = 0; local761 < local190; local761++) {
			@Pc(803) Class43 local803 = local240[local761];
			if (local803.aByteArray11 != null) {
				local374 = 0;
				for (local810 = 2; local810 < local803.aByteArray11.length; local810 += 2) {
					local374 = local36.method1278() + local374 + 1;
					local803.aByteArray11[local810] = (byte) local374;
				}
			}
		}
		@Pc(859) int local859;
		for (local708 = 0; local708 < local190; local708++) {
			@Pc(852) Class43 local852 = local240[local708];
			if (local852.aByteArray10 != null) {
				local374 = 0;
				for (local859 = 2; local859 < local852.aByteArray10.length; local859 += 2) {
					local374 = local374 + local36.method1278() + 1;
					local852.aByteArray10[local859] = (byte) local374;
				}
			}
		}
		@Pc(934) int local934;
		@Pc(961) int local961;
		@Pc(973) byte local973;
		@Pc(988) int local988;
		@Pc(990) int local990;
		@Pc(1000) int local1000;
		@Pc(928) byte local928;
		@Pc(1036) int local1036;
		if (local314 != null) {
			local374 = local36.method1278();
			local314[0] = (byte) local374;
			for (local810 = 2; local810 < local314.length; local810 += 2) {
				local374 = local374 + local36.method1278() + 1;
				local314[local810] = (byte) local374;
			}
			local928 = local314[0];
			@Pc(932) byte local932 = local314[1];
			for (local934 = 0; local934 < local928; local934++) {
				this.aByteArray36[local934] = (byte) (this.aByteArray36[local934] * local932 + 32 >> 6);
			}
			local961 = 2;
			while (local314.length > local961) {
				@Pc(969) byte local969 = local314[local961 + 1];
				local973 = local314[local961];
				local961 += 2;
				local988 = local932 * (local973 - local928) + (local973 - local928) / 2;
				for (local990 = local928; local990 < local973; local990++) {
					local1000 = Static136.method1942(local973 - local928, local988);
					local988 += local969 - local932;
					this.aByteArray36[local990] = (byte) (this.aByteArray36[local990] * local1000 + 32 >> 6);
				}
				local932 = local969;
				local928 = local973;
			}
			for (local1036 = local928; local1036 < 128; local1036++) {
				this.aByteArray36[local1036] = (byte) (this.aByteArray36[local1036] * local932 + 32 >> 6);
			}
		}
		@Pc(1103) int local1103;
		if (local329 != null) {
			local374 = local36.method1278();
			local329[0] = (byte) local374;
			for (local810 = 2; local810 < local329.length; local810 += 2) {
				local374 = local374 + local36.method1278() + 1;
				local329[local810] = (byte) local374;
			}
			local928 = local329[0];
			local1103 = local329[1] << 1;
			for (local934 = 0; local934 < local928; local934++) {
				local961 = (this.aByteArray34[local934] & 0xFF) + local1103;
				if (local961 < 0) {
					local961 = 0;
				}
				if (local961 > 128) {
					local961 = 128;
				}
				this.aByteArray34[local934] = (byte) local961;
			}
			local961 = 2;
			@Pc(1161) int local1161;
			while (local329.length > local961) {
				local973 = local329[local961];
				local1161 = local329[local961 + 1] << 1;
				local961 += 2;
				local988 = (local973 - local928) / 2 + local1103 * (local973 - local928);
				for (local990 = local928; local990 < local973; local990++) {
					local1000 = Static136.method1942(local973 - local928, local988);
					local988 += local1161 - local1103;
					@Pc(1204) int local1204 = (this.aByteArray34[local990] & 0xFF) + local1000;
					if (local1204 < 0) {
						local1204 = 0;
					}
					if (local1204 > 128) {
						local1204 = 128;
					}
					this.aByteArray34[local990] = (byte) local1204;
				}
				local1103 = local1161;
				local928 = local973;
			}
			for (local1036 = local928; local1036 < 128; local1036++) {
				local1161 = (this.aByteArray34[local1036] & 0xFF) + local1103;
				if (local1161 < 0) {
					local1161 = 0;
				}
				if (local1161 > 128) {
					local1161 = 128;
				}
				this.aByteArray34[local1036] = (byte) local1161;
			}
		}
		for (local810 = 0; local810 < local190; local810++) {
			local240[local810].anInt1618 = local36.method1278();
		}
		for (local859 = 0; local859 < local190; local859++) {
			@Pc(1303) Class43 local1303 = local240[local859];
			if (local1303.aByteArray10 != null) {
				local1303.anInt1623 = local36.method1278();
			}
			if (local1303.aByteArray11 != null) {
				local1303.anInt1625 = local36.method1278();
			}
			if (local1303.anInt1618 > 0) {
				local1303.anInt1619 = local36.method1278();
			}
		}
		for (local1103 = 0; local1103 < local190; local1103++) {
			local240[local1103].anInt1627 = local36.method1278();
		}
		for (local934 = 0; local934 < local190; local934++) {
			@Pc(1357) Class43 local1357 = local240[local934];
			if (local1357.anInt1627 > 0) {
				local1357.anInt1629 = local36.method1278();
			}
		}
		for (local961 = 0; local961 < local190; local961++) {
			@Pc(1381) Class43 local1381 = local240[local961];
			if (local1381.anInt1629 > 0) {
				local1381.anInt1621 = local36.method1278();
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!mb;[I[B)Z")
	public boolean method2419(@OriginalArg(1) Class61 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class3_Sub24_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray249[local18];
				if (local30 != 0) {
					if (local30 != local14) {
						local14 = local30--;
						if ((local30 & 0x1) == 0) {
							local16 = arg0.method1767(local30 >> 2, arg1);
						} else {
							local16 = arg0.method1763(local30 >> 2, arg1);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass3_Sub24_Sub1Array1[local18] = local16;
						this.anIntArray249[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	public void method2420() {
		this.anIntArray249 = null;
	}
}
