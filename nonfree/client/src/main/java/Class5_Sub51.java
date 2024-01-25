import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class5_Sub51 extends Class5 {

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "[Lclient!uo;")
	public Class347[] aClass347Array1;

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "[S")
	public short[] aShortArray190;

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "[I")
	private int[] anIntArray833;

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
	public int anInt10369;

	@OriginalMember(owner = "client!wo", name = "s", descriptor = "[Lclient!ct;")
	public Class5_Sub11_Sub1[] aClass5_Sub11_Sub1Array1;

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "[B")
	public byte[] aByteArray105;

	@OriginalMember(owner = "client!wo", name = "u", descriptor = "[B")
	public byte[] aByteArray106;

	@OriginalMember(owner = "client!wo", name = "v", descriptor = "[B")
	public byte[] aByteArray107;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	private Class5_Sub51() {
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "([B)V")
	public Class5_Sub51(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub11_Sub1Array1 = new Class5_Sub11_Sub1[128];
		this.aByteArray105 = new byte[128];
		this.aShortArray190 = new short[128];
		this.aByteArray106 = new byte[128];
		this.anIntArray833 = new int[128];
		this.aClass347Array1 = new Class347[128];
		this.aByteArray107 = new byte[128];
		@Pc(36) Class5_Sub12 local36 = new Class5_Sub12(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray104[local36.anInt10154 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method8635();
		}
		local38++;
		local36.anInt10154++;
		@Pc(81) int local81 = local36.anInt10154;
		local36.anInt10154 += local38;
		@Pc(89) int local89;
		for (local89 = 0; local36.aByteArray104[local89 + local36.anInt10154] != 0; local89++) {
		}
		@Pc(106) byte[] local106 = new byte[local89];
		for (@Pc(108) int local108 = 0; local108 < local89; local108++) {
			local106[local108] = local36.method8635();
		}
		local36.anInt10154++;
		local89++;
		@Pc(134) int local134 = local36.anInt10154;
		local36.anInt10154 += local89;
		@Pc(142) int local142;
		for (local142 = 0; local36.aByteArray104[local142 + local36.anInt10154] != 0; local142++) {
		}
		@Pc(156) byte[] local156 = new byte[local142];
		for (@Pc(158) int local158 = 0; local158 < local142; local158++) {
			local156[local158] = local36.method8635();
		}
		local142++;
		local36.anInt10154++;
		@Pc(184) byte[] local184 = new byte[local142];
		@Pc(193) int local193;
		@Pc(197) int local197;
		@Pc(203) int local203;
		if (local142 > 1) {
			local184[1] = 1;
			local193 = 2;
			@Pc(195) int local195 = 1;
			for (local197 = 2; local197 < local142; local197++) {
				local203 = local36.method8645();
				if (local203 == 0) {
					local195 = local193++;
				} else {
					if (local203 <= local195) {
						local203--;
					}
					local195 = local203;
				}
				local184[local197] = (byte) local195;
			}
		} else {
			local193 = local142;
		}
		@Pc(239) Class347[] local239 = new Class347[local193];
		for (local197 = 0; local197 < local239.length; local197++) {
			@Pc(251) Class347 local251 = local239[local197] = new Class347();
			@Pc(255) int local255 = local36.method8645();
			if (local255 > 0) {
				local251.aByteArray90 = new byte[local255 * 2];
			}
			local255 = local36.method8645();
			if (local255 > 0) {
				local251.aByteArray89 = new byte[local255 * 2 + 2];
				local251.aByteArray89[1] = 64;
			}
		}
		local203 = local36.method8645();
		@Pc(313) byte[] local313 = local203 <= 0 ? null : new byte[local203 * 2];
		local203 = local36.method8645();
		@Pc(329) byte[] local329 = local203 <= 0 ? null : new byte[local203 * 2];
		@Pc(331) int local331;
		for (local331 = 0; local36.aByteArray104[local36.anInt10154 + local331] != 0; local331++) {
		}
		@Pc(348) byte[] local348 = new byte[local331];
		for (@Pc(350) int local350 = 0; local350 < local331; local350++) {
			local348[local350] = local36.method8635();
		}
		local331++;
		local36.anInt10154++;
		@Pc(371) int local371 = 0;
		for (@Pc(373) int local373 = 0; local373 < 128; local373++) {
			local371 += local36.method8645();
			this.aShortArray190[local373] = (short) local371;
		}
		local371 = 0;
		for (@Pc(397) int local397 = 0; local397 < 128; local397++) {
			local371 += local36.method8645();
			this.aShortArray190[local397] = (short) (this.aShortArray190[local397] + (local371 << 8));
		}
		@Pc(424) int local424 = 0;
		@Pc(426) int local426 = 0;
		@Pc(428) int local428 = 0;
		for (@Pc(430) int local430 = 0; local430 < 128; local430++) {
			if (local424 == 0) {
				if (local348.length <= local426) {
					local424 = -1;
				} else {
					local424 = local348[local426++];
				}
				local428 = local36.method8600();
			}
			this.aShortArray190[local430] = (short) (this.aShortArray190[local430] + ((local428 - 1 & 0x2) << 14));
			this.anIntArray833[local430] = local428;
			local424--;
		}
		local424 = 0;
		local426 = 0;
		@Pc(482) int local482 = 0;
		for (@Pc(484) int local484 = 0; local484 < 128; local484++) {
			if (this.anIntArray833[local484] != 0) {
				if (local424 == 0) {
					if (local53.length <= local426) {
						local424 = -1;
					} else {
						local424 = local53[local426++];
					}
					local482 = local36.aByteArray104[local81++] - 1;
				}
				local424--;
				this.aByteArray105[local484] = (byte) local482;
			}
		}
		local426 = 0;
		local424 = 0;
		@Pc(536) int local536 = 0;
		for (@Pc(538) int local538 = 0; local538 < 128; local538++) {
			if (this.anIntArray833[local538] != 0) {
				if (local424 == 0) {
					local536 = local36.aByteArray104[local134++] + 16 << 2;
					if (local106.length > local426) {
						local424 = local106[local426++];
					} else {
						local424 = -1;
					}
				}
				local424--;
				this.aByteArray106[local538] = (byte) local536;
			}
		}
		local426 = 0;
		local424 = 0;
		@Pc(593) Class347 local593 = null;
		for (@Pc(595) int local595 = 0; local595 < 128; local595++) {
			if (this.anIntArray833[local595] != 0) {
				if (local424 == 0) {
					local593 = local239[local184[local426]];
					if (local426 < local156.length) {
						local424 = local156[local426++];
					} else {
						local424 = -1;
					}
				}
				this.aClass347Array1[local595] = local593;
				local424--;
			}
		}
		local424 = 0;
		local426 = 0;
		@Pc(646) int local646 = 0;
		for (@Pc(648) int local648 = 0; local648 < 128; local648++) {
			if (local424 == 0) {
				if (local348.length <= local426) {
					local424 = -1;
				} else {
					local424 = local348[local426++];
				}
				if (this.anIntArray833[local648] > 0) {
					local646 = local36.method8645() + 1;
				}
			}
			local424--;
			this.aByteArray107[local648] = (byte) local646;
		}
		this.anInt10369 = local36.method8645() + 1;
		@Pc(714) int local714;
		for (@Pc(703) int local703 = 0; local703 < local193; local703++) {
			@Pc(709) Class347 local709 = local239[local703];
			if (local709.aByteArray90 != null) {
				for (local714 = 1; local714 < local709.aByteArray90.length; local714 += 2) {
					local709.aByteArray90[local714] = local36.method8635();
				}
			}
			if (local709.aByteArray89 != null) {
				for (local714 = 3; local714 < local709.aByteArray89.length - 2; local714 += 2) {
					local709.aByteArray89[local714] = local36.method8635();
				}
			}
		}
		@Pc(767) int local767;
		if (local313 != null) {
			for (local767 = 1; local767 < local313.length; local767 += 2) {
				local313[local767] = local36.method8635();
			}
		}
		if (local329 != null) {
			for (local767 = 1; local767 < local329.length; local767 += 2) {
				local329[local767] = local36.method8635();
			}
		}
		@Pc(816) int local816;
		for (local767 = 0; local767 < local193; local767++) {
			@Pc(809) Class347 local809 = local239[local767];
			if (local809.aByteArray89 != null) {
				local371 = 0;
				for (local816 = 2; local816 < local809.aByteArray89.length; local816 += 2) {
					local371 = local371 + local36.method8645() + 1;
					local809.aByteArray89[local816] = (byte) local371;
				}
			}
		}
		@Pc(866) int local866;
		for (local714 = 0; local714 < local193; local714++) {
			@Pc(859) Class347 local859 = local239[local714];
			if (local859.aByteArray90 != null) {
				local371 = 0;
				for (local866 = 2; local866 < local859.aByteArray90.length; local866 += 2) {
					local371 = local371 + local36.method8645() + 1;
					local859.aByteArray90[local866] = (byte) local371;
				}
			}
		}
		@Pc(943) int local943;
		@Pc(966) int local966;
		@Pc(972) byte local972;
		@Pc(992) int local992;
		@Pc(994) int local994;
		@Pc(1003) int local1003;
		@Pc(937) byte local937;
		@Pc(1046) int local1046;
		if (local313 != null) {
			local371 = local36.method8645();
			local313[0] = (byte) local371;
			for (local816 = 2; local816 < local313.length; local816 += 2) {
				local371 = local36.method8645() + local371 + 1;
				local313[local816] = (byte) local371;
			}
			local937 = local313[0];
			@Pc(941) byte local941 = local313[1];
			for (local943 = 0; local943 < local937; local943++) {
				this.aByteArray107[local943] = (byte) (local941 * this.aByteArray107[local943] + 32 >> 6);
			}
			for (local966 = 2; local966 < local313.length; local966 += 2) {
				local972 = local313[local966];
				@Pc(978) byte local978 = local313[local966 + 1];
				local992 = (local972 - local937) * local941 + (local972 - local937) / 2;
				for (local994 = local937; local994 < local972; local994++) {
					local1003 = Static532.method7604(local992, local972 - local937);
					local992 += local978 - local941;
					this.aByteArray107[local994] = (byte) (this.aByteArray107[local994] * local1003 + 32 >> 6);
				}
				local937 = local972;
				local941 = local978;
			}
			for (local1046 = local937; local1046 < 128; local1046++) {
				this.aByteArray107[local1046] = (byte) (this.aByteArray107[local1046] * local941 + 32 >> 6);
			}
		}
		@Pc(1112) int local1112;
		if (local329 != null) {
			local371 = local36.method8645();
			local329[0] = (byte) local371;
			for (local816 = 2; local816 < local329.length; local816 += 2) {
				local371 = local36.method8645() + local371 + 1;
				local329[local816] = (byte) local371;
			}
			local937 = local329[0];
			local1112 = local329[1] << 1;
			for (local943 = 0; local943 < local937; local943++) {
				local966 = (this.aByteArray106[local943] & 0xFF) + local1112;
				if (local966 < 0) {
					local966 = 0;
				}
				if (local966 > 128) {
					local966 = 128;
				}
				this.aByteArray106[local943] = (byte) local966;
			}
			local966 = 2;
			@Pc(1167) int local1167;
			while (local966 < local329.length) {
				local972 = local329[local966];
				local1167 = local329[local966 + 1] << 1;
				local992 = (local972 - local937) / 2 + local1112 * (local972 - local937);
				for (local994 = local937; local994 < local972; local994++) {
					local1003 = Static532.method7604(local992, local972 - local937);
					@Pc(1202) int local1202 = local1003 + (this.aByteArray106[local994] & 0xFF);
					if (local1202 < 0) {
						local1202 = 0;
					}
					if (local1202 > 128) {
						local1202 = 128;
					}
					local992 += local1167 - local1112;
					this.aByteArray106[local994] = (byte) local1202;
				}
				local966 += 2;
				local937 = local972;
				local1112 = local1167;
			}
			for (local1046 = local937; local1046 < 128; local1046++) {
				local1167 = (this.aByteArray106[local1046] & 0xFF) + local1112;
				if (local1167 < 0) {
					local1167 = 0;
				}
				if (local1167 > 128) {
					local1167 = 128;
				}
				this.aByteArray106[local1046] = (byte) local1167;
			}
		}
		for (local816 = 0; local816 < local193; local816++) {
			local239[local816].anInt9530 = local36.method8645();
		}
		for (local866 = 0; local866 < local193; local866++) {
			@Pc(1299) Class347 local1299 = local239[local866];
			if (local1299.aByteArray90 != null) {
				local1299.anInt9534 = local36.method8645();
			}
			if (local1299.aByteArray89 != null) {
				local1299.anInt9533 = local36.method8645();
			}
			if (local1299.anInt9530 > 0) {
				local1299.anInt9527 = local36.method8645();
			}
		}
		for (local1112 = 0; local1112 < local193; local1112++) {
			local239[local1112].anInt9528 = local36.method8645();
		}
		for (local943 = 0; local943 < local193; local943++) {
			@Pc(1354) Class347 local1354 = local239[local943];
			if (local1354.anInt9528 > 0) {
				local1354.anInt9532 = local36.method8645();
			}
		}
		for (local966 = 0; local966 < local193; local966++) {
			@Pc(1377) Class347 local1377 = local239[local966];
			if (local1377.anInt9532 > 0) {
				local1377.anInt9529 = local36.method8645();
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	public void method8811() {
		this.anIntArray833 = null;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "([I[BZLclient!jj;)Z")
	public boolean method8813(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class173 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class5_Sub11_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray833[local13];
				if (local28 != 0) {
					if (local28 != local9) {
						local9 = local28--;
						if ((local28 & 0x1) == 0) {
							local11 = arg2.method4010(arg0, local28 >> 2);
						} else {
							local11 = arg2.method4013(arg0, local28 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass5_Sub11_Sub1Array1[local13] = local11;
						this.anIntArray833[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
