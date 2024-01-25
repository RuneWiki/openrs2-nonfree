import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "[I")
	private int[] anIntArray554;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
	public int anInt5566;

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "[Lclient!ub;")
	public Class289[] aClass289Array1;

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "[Lclient!ti;")
	public Class1_Sub37_Sub1[] aClass1_Sub37_Sub1Array1;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
	private Class1_Sub31() {
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "([B)V")
	public Class1_Sub31(@OriginalArg(0) byte[] arg0) {
		this.aByteArray89 = new byte[128];
		this.aShortArray105 = new short[128];
		this.aClass289Array1 = new Class289[128];
		this.aClass1_Sub37_Sub1Array1 = new Class1_Sub37_Sub1[128];
		this.aByteArray87 = new byte[128];
		this.aByteArray88 = new byte[128];
		this.anIntArray554 = new int[128];
		@Pc(36) Class1_Sub6 local36 = new Class1_Sub6(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray66[local36.anInt4555 + local38] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method3928();
		}
		local38++;
		local36.anInt4555++;
		@Pc(76) int local76 = local36.anInt4555;
		local36.anInt4555 += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray66[local84 + local36.anInt4555] != 0; local84++) {
		}
		@Pc(101) byte[] local101 = new byte[local84];
		for (@Pc(103) int local103 = 0; local103 < local84; local103++) {
			local101[local103] = local36.method3928();
		}
		local36.anInt4555++;
		local84++;
		@Pc(129) int local129 = local36.anInt4555;
		local36.anInt4555 += local84;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray66[local36.anInt4555 + local137] != 0; local137++) {
		}
		@Pc(152) byte[] local152 = new byte[local137];
		for (@Pc(154) int local154 = 0; local154 < local137; local154++) {
			local152[local154] = local36.method3928();
		}
		local137++;
		local36.anInt4555++;
		@Pc(180) byte[] local180 = new byte[local137];
		@Pc(185) int local185;
		@Pc(197) int local197;
		@Pc(203) int local203;
		if (local137 <= 1) {
			local185 = local137;
		} else {
			local180[1] = 1;
			@Pc(193) int local193 = 1;
			local185 = 2;
			for (local197 = 2; local197 < local137; local197++) {
				local203 = local36.method3922();
				if (local203 == 0) {
					local193 = local185++;
				} else {
					if (local203 <= local193) {
						local203--;
					}
					local193 = local203;
				}
				local180[local197] = (byte) local193;
			}
		}
		@Pc(239) Class289[] local239 = new Class289[local185];
		for (local197 = 0; local197 < local239.length; local197++) {
			@Pc(251) Class289 local251 = local239[local197] = new Class289();
			@Pc(255) int local255 = local36.method3922();
			if (local255 > 0) {
				local251.aByteArray112 = new byte[local255 * 2];
			}
			local255 = local36.method3922();
			if (local255 > 0) {
				local251.aByteArray113 = new byte[local255 * 2 + 2];
				local251.aByteArray113[1] = 64;
			}
		}
		local203 = local36.method3922();
		@Pc(310) byte[] local310 = local203 <= 0 ? null : new byte[local203 * 2];
		local203 = local36.method3922();
		@Pc(326) byte[] local326 = local203 <= 0 ? null : new byte[local203 * 2];
		@Pc(328) int local328;
		for (local328 = 0; local36.aByteArray66[local36.anInt4555 + local328] != 0; local328++) {
		}
		@Pc(343) byte[] local343 = new byte[local328];
		for (@Pc(345) int local345 = 0; local345 < local328; local345++) {
			local343[local345] = local36.method3928();
		}
		local36.anInt4555++;
		local328++;
		@Pc(370) int local370 = 0;
		for (@Pc(372) int local372 = 0; local372 < 128; local372++) {
			local370 += local36.method3922();
			this.aShortArray105[local372] = (short) local370;
		}
		local370 = 0;
		for (@Pc(396) int local396 = 0; local396 < 128; local396++) {
			local370 += local36.method3922();
			this.aShortArray105[local396] = (short) (this.aShortArray105[local396] + (local370 << 8));
		}
		@Pc(423) int local423 = 0;
		@Pc(425) int local425 = 0;
		@Pc(427) int local427 = 0;
		for (@Pc(429) int local429 = 0; local429 < 128; local429++) {
			if (local423 == 0) {
				if (local425 >= local343.length) {
					local423 = -1;
				} else {
					local423 = local343[local425++];
				}
				local427 = local36.method3958();
			}
			this.aShortArray105[local429] = (short) (this.aShortArray105[local429] + ((local427 - 1 & 0x2) << 14));
			this.anIntArray554[local429] = local427;
			local423--;
		}
		local425 = 0;
		local423 = 0;
		@Pc(483) int local483 = 0;
		for (@Pc(485) int local485 = 0; local485 < 128; local485++) {
			if (this.anIntArray554[local485] != 0) {
				if (local423 == 0) {
					local483 = local36.aByteArray66[local76++] - 1;
					if (local425 < local52.length) {
						local423 = local52[local425++];
					} else {
						local423 = -1;
					}
				}
				this.aByteArray87[local485] = (byte) local483;
				local423--;
			}
		}
		local423 = 0;
		local425 = 0;
		@Pc(540) int local540 = 0;
		for (@Pc(542) int local542 = 0; local542 < 128; local542++) {
			if (this.anIntArray554[local542] != 0) {
				if (local423 == 0) {
					if (local425 >= local101.length) {
						local423 = -1;
					} else {
						local423 = local101[local425++];
					}
					local540 = local36.aByteArray66[local129++] + 16 << 2;
				}
				local423--;
				this.aByteArray88[local542] = (byte) local540;
			}
		}
		local425 = 0;
		local423 = 0;
		@Pc(597) Class289 local597 = null;
		for (@Pc(599) int local599 = 0; local599 < 128; local599++) {
			if (this.anIntArray554[local599] != 0) {
				if (local423 == 0) {
					local597 = local239[local180[local425]];
					if (local425 < local152.length) {
						local423 = local152[local425++];
					} else {
						local423 = -1;
					}
				}
				this.aClass289Array1[local599] = local597;
				local423--;
			}
		}
		local425 = 0;
		local423 = 0;
		@Pc(652) int local652 = 0;
		for (@Pc(654) int local654 = 0; local654 < 128; local654++) {
			if (local423 == 0) {
				if (local425 < local343.length) {
					local423 = local343[local425++];
				} else {
					local423 = -1;
				}
				if (this.anIntArray554[local654] > 0) {
					local652 = local36.method3922() + 1;
				}
			}
			this.aByteArray89[local654] = (byte) local652;
			local423--;
		}
		this.anInt5566 = local36.method3922() + 1;
		@Pc(720) int local720;
		for (@Pc(709) int local709 = 0; local709 < local185; local709++) {
			@Pc(715) Class289 local715 = local239[local709];
			if (local715.aByteArray112 != null) {
				for (local720 = 1; local720 < local715.aByteArray112.length; local720 += 2) {
					local715.aByteArray112[local720] = local36.method3928();
				}
			}
			if (local715.aByteArray113 != null) {
				for (local720 = 3; local720 < local715.aByteArray113.length - 2; local720 += 2) {
					local715.aByteArray113[local720] = local36.method3928();
				}
			}
		}
		@Pc(769) int local769;
		if (local310 != null) {
			for (local769 = 1; local769 < local310.length; local769 += 2) {
				local310[local769] = local36.method3928();
			}
		}
		if (local326 != null) {
			for (local769 = 1; local769 < local326.length; local769 += 2) {
				local326[local769] = local36.method3928();
			}
		}
		@Pc(818) int local818;
		for (local769 = 0; local769 < local185; local769++) {
			@Pc(811) Class289 local811 = local239[local769];
			if (local811.aByteArray113 != null) {
				local370 = 0;
				for (local818 = 2; local818 < local811.aByteArray113.length; local818 += 2) {
					local370 = local36.method3922() + local370 + 1;
					local811.aByteArray113[local818] = (byte) local370;
				}
			}
		}
		@Pc(863) int local863;
		for (local720 = 0; local720 < local185; local720++) {
			@Pc(856) Class289 local856 = local239[local720];
			if (local856.aByteArray112 != null) {
				local370 = 0;
				for (local863 = 2; local863 < local856.aByteArray112.length; local863 += 2) {
					local370 = local36.method3922() + local370 + 1;
					local856.aByteArray112[local863] = (byte) local370;
				}
			}
		}
		@Pc(936) int local936;
		@Pc(959) int local959;
		@Pc(965) byte local965;
		@Pc(985) int local985;
		@Pc(987) int local987;
		@Pc(997) int local997;
		@Pc(930) byte local930;
		@Pc(1041) int local1041;
		if (local310 != null) {
			local370 = local36.method3922();
			local310[0] = (byte) local370;
			for (local818 = 2; local818 < local310.length; local818 += 2) {
				local370 = local36.method3922() + local370 + 1;
				local310[local818] = (byte) local370;
			}
			local930 = local310[0];
			@Pc(934) byte local934 = local310[1];
			for (local936 = 0; local936 < local930; local936++) {
				this.aByteArray89[local936] = (byte) (this.aByteArray89[local936] * local934 + 32 >> 6);
			}
			local959 = 2;
			while (local959 < local310.length) {
				local965 = local310[local959];
				@Pc(971) byte local971 = local310[local959 + 1];
				local985 = local934 * (local965 - local930) + (local965 - local930) / 2;
				for (local987 = local930; local987 < local965; local987++) {
					local997 = Static527.method7324(local985, local965 - local930);
					local985 += local971 - local934;
					this.aByteArray89[local987] = (byte) (local997 * this.aByteArray89[local987] + 32 >> 6);
				}
				local930 = local965;
				local959 += 2;
				local934 = local971;
			}
			for (local1041 = local930; local1041 < 128; local1041++) {
				this.aByteArray89[local1041] = (byte) (this.aByteArray89[local1041] * local934 + 32 >> 6);
			}
		}
		@Pc(1113) int local1113;
		if (local326 != null) {
			local370 = local36.method3922();
			local326[0] = (byte) local370;
			for (local818 = 2; local818 < local326.length; local818 += 2) {
				local370 = local36.method3922() + local370 + 1;
				local326[local818] = (byte) local370;
			}
			local930 = local326[0];
			local1113 = local326[1] << 1;
			for (local936 = 0; local936 < local930; local936++) {
				local959 = (this.aByteArray88[local936] & 0xFF) + local1113;
				if (local959 < 0) {
					local959 = 0;
				}
				if (local959 > 128) {
					local959 = 128;
				}
				this.aByteArray88[local936] = (byte) local959;
			}
			local959 = 2;
			@Pc(1165) int local1165;
			while (local959 < local326.length) {
				local965 = local326[local959];
				local1165 = local326[local959 + 1] << 1;
				local985 = (local965 - local930) / 2 + local1113 * (local965 - local930);
				for (local987 = local930; local987 < local965; local987++) {
					local997 = Static527.method7324(local985, local965 - local930);
					@Pc(1200) int local1200 = local997 + (this.aByteArray88[local987] & 0xFF);
					if (local1200 < 0) {
						local1200 = 0;
					}
					if (local1200 > 128) {
						local1200 = 128;
					}
					this.aByteArray88[local987] = (byte) local1200;
					local985 += local1165 - local1113;
				}
				local930 = local965;
				local959 += 2;
				local1113 = local1165;
			}
			for (local1041 = local930; local1041 < 128; local1041++) {
				local1165 = (this.aByteArray88[local1041] & 0xFF) + local1113;
				if (local1165 < 0) {
					local1165 = 0;
				}
				if (local1165 > 128) {
					local1165 = 128;
				}
				this.aByteArray88[local1041] = (byte) local1165;
			}
		}
		for (local818 = 0; local818 < local185; local818++) {
			local239[local818].anInt7991 = local36.method3922();
		}
		for (local863 = 0; local863 < local185; local863++) {
			@Pc(1309) Class289 local1309 = local239[local863];
			if (local1309.aByteArray112 != null) {
				local1309.anInt7998 = local36.method3922();
			}
			if (local1309.aByteArray113 != null) {
				local1309.anInt7999 = local36.method3922();
			}
			if (local1309.anInt7991 > 0) {
				local1309.anInt7996 = local36.method3922();
			}
		}
		for (local1113 = 0; local1113 < local185; local1113++) {
			local239[local1113].anInt7997 = local36.method3922();
		}
		for (local936 = 0; local936 < local185; local936++) {
			@Pc(1367) Class289 local1367 = local239[local936];
			if (local1367.anInt7997 > 0) {
				local1367.anInt7995 = local36.method3922();
			}
		}
		for (local959 = 0; local959 < local185; local959++) {
			@Pc(1391) Class289 local1391 = local239[local959];
			if (local1391.anInt7995 > 0) {
				local1391.anInt7994 = local36.method3922();
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!rl;[IB[B)Z")
	public boolean method4765(@OriginalArg(0) Class258 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class1_Sub37_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray554[local18];
				if (local30 != 0) {
					if (local30 != local14) {
						local14 = local30--;
						if ((local30 & 0x1) == 0) {
							local16 = arg0.method6147(arg1, local30 >> 2);
						} else {
							local16 = arg0.method6150(local30 >> 2, arg1);
						}
						if (local16 == null) {
							local12 = false;
						}
					}
					if (local16 != null) {
						this.aClass1_Sub37_Sub1Array1[local18] = local16;
						this.anIntArray554[local18] = 0;
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
	public void method4767() {
		this.anIntArray554 = null;
	}
}
