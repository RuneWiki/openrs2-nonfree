import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class1_Sub48 extends Class1 {

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "[Lclient!sfa;")
	public Class309[] aClass309Array1;

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
	public int anInt9272;

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "[I")
	private int[] anIntArray583;

	@OriginalMember(owner = "client!vk", name = "n", descriptor = "[S")
	public short[] aShortArray136;

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!vk", name = "r", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!vk", name = "s", descriptor = "[B")
	public byte[] aByteArray95;

	@OriginalMember(owner = "client!vk", name = "t", descriptor = "[Lclient!bu;")
	public Class1_Sub13_Sub1[] aClass1_Sub13_Sub1Array1;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	private Class1_Sub48() {
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "([B)V")
	public Class1_Sub48(@OriginalArg(0) byte[] arg0) {
		this.anIntArray583 = new int[128];
		this.aClass1_Sub13_Sub1Array1 = new Class1_Sub13_Sub1[128];
		this.aClass309Array1 = new Class309[128];
		this.aShortArray136 = new short[128];
		this.aByteArray93 = new byte[128];
		this.aByteArray94 = new byte[128];
		this.aByteArray95 = new byte[128];
		@Pc(36) Class1_Sub3 local36 = new Class1_Sub3(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray104[local36.anInt9802 + local38] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method7963();
		}
		local36.anInt9802++;
		local38++;
		@Pc(76) int local76 = local36.anInt9802;
		local36.anInt9802 += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray104[local36.anInt9802 + local84] != 0; local84++) {
		}
		@Pc(98) byte[] local98 = new byte[local84];
		for (@Pc(100) int local100 = 0; local100 < local84; local100++) {
			local98[local100] = local36.method7963();
		}
		local36.anInt9802++;
		local84++;
		@Pc(122) int local122 = local36.anInt9802;
		local36.anInt9802 += local84;
		@Pc(130) int local130;
		for (local130 = 0; local36.aByteArray104[local36.anInt9802 + local130] != 0; local130++) {
		}
		@Pc(144) byte[] local144 = new byte[local130];
		for (@Pc(146) int local146 = 0; local146 < local130; local146++) {
			local144[local146] = local36.method7963();
		}
		local130++;
		local36.anInt9802++;
		@Pc(172) byte[] local172 = new byte[local130];
		@Pc(179) int local179;
		@Pc(191) int local191;
		@Pc(197) int local197;
		if (local130 <= 1) {
			local179 = local130;
		} else {
			local172[1] = 1;
			local179 = 2;
			@Pc(189) int local189 = 1;
			for (local191 = 2; local191 < local130; local191++) {
				local197 = local36.method7974();
				if (local197 == 0) {
					local189 = local179++;
				} else {
					if (local189 >= local197) {
						local197--;
					}
					local189 = local197;
				}
				local172[local191] = (byte) local189;
			}
		}
		@Pc(229) Class309[] local229 = new Class309[local179];
		for (local191 = 0; local191 < local229.length; local191++) {
			@Pc(241) Class309 local241 = local229[local191] = new Class309();
			@Pc(245) int local245 = local36.method7974();
			if (local245 > 0) {
				local241.aByteArray86 = new byte[local245 * 2];
			}
			local245 = local36.method7974();
			if (local245 > 0) {
				local241.aByteArray85 = new byte[local245 * 2 + 2];
				local241.aByteArray85[1] = 64;
			}
		}
		local197 = local36.method7974();
		@Pc(297) byte[] local297 = local197 > 0 ? new byte[local197 * 2] : null;
		local197 = local36.method7974();
		@Pc(310) byte[] local310 = local197 > 0 ? new byte[local197 * 2] : null;
		@Pc(312) int local312;
		for (local312 = 0; local36.aByteArray104[local312 + local36.anInt9802] != 0; local312++) {
		}
		@Pc(326) byte[] local326 = new byte[local312];
		for (@Pc(328) int local328 = 0; local328 < local312; local328++) {
			local326[local328] = local36.method7963();
		}
		local312++;
		local36.anInt9802++;
		@Pc(353) int local353 = 0;
		for (@Pc(355) int local355 = 0; local355 < 128; local355++) {
			local353 += local36.method7974();
			this.aShortArray136[local355] = (short) local353;
		}
		local353 = 0;
		for (@Pc(377) int local377 = 0; local377 < 128; local377++) {
			local353 += local36.method7974();
			this.aShortArray136[local377] = (short) (this.aShortArray136[local377] + (local353 << 8));
		}
		@Pc(402) int local402 = 0;
		@Pc(404) int local404 = 0;
		@Pc(406) int local406 = 0;
		for (@Pc(408) int local408 = 0; local408 < 128; local408++) {
			if (local402 == 0) {
				if (local404 < local326.length) {
					local402 = local326[local404++];
				} else {
					local402 = -1;
				}
				local406 = local36.method7929();
			}
			this.aShortArray136[local408] = (short) (this.aShortArray136[local408] + ((local406 - 1 & 0x2) << 14));
			this.anIntArray583[local408] = local406;
			local402--;
		}
		local404 = 0;
		local402 = 0;
		@Pc(464) int local464 = 0;
		for (@Pc(466) int local466 = 0; local466 < 128; local466++) {
			if (this.anIntArray583[local466] != 0) {
				if (local402 == 0) {
					local464 = local36.aByteArray104[local76++] - 1;
					if (local52.length > local404) {
						local402 = local52[local404++];
					} else {
						local402 = -1;
					}
				}
				local402--;
				this.aByteArray93[local466] = (byte) local464;
			}
		}
		local402 = 0;
		local404 = 0;
		@Pc(519) int local519 = 0;
		for (@Pc(521) int local521 = 0; local521 < 128; local521++) {
			if (this.anIntArray583[local521] != 0) {
				if (local402 == 0) {
					local519 = local36.aByteArray104[local122++] + 16 << 2;
					if (local404 < local98.length) {
						local402 = local98[local404++];
					} else {
						local402 = -1;
					}
				}
				this.aByteArray94[local521] = (byte) local519;
				local402--;
			}
		}
		local404 = 0;
		local402 = 0;
		@Pc(577) Class309 local577 = null;
		for (@Pc(579) int local579 = 0; local579 < 128; local579++) {
			if (this.anIntArray583[local579] != 0) {
				if (local402 == 0) {
					local577 = local229[local172[local404]];
					if (local404 >= local144.length) {
						local402 = -1;
					} else {
						local402 = local144[local404++];
					}
				}
				this.aClass309Array1[local579] = local577;
				local402--;
			}
		}
		local404 = 0;
		local402 = 0;
		@Pc(630) int local630 = 0;
		for (@Pc(632) int local632 = 0; local632 < 128; local632++) {
			if (local402 == 0) {
				if (local404 < local326.length) {
					local402 = local326[local404++];
				} else {
					local402 = -1;
				}
				if (this.anIntArray583[local632] > 0) {
					local630 = local36.method7974() + 1;
				}
			}
			this.aByteArray95[local632] = (byte) local630;
			local402--;
		}
		this.anInt9272 = local36.method7974() + 1;
		@Pc(696) int local696;
		for (@Pc(685) int local685 = 0; local685 < local179; local685++) {
			@Pc(691) Class309 local691 = local229[local685];
			if (local691.aByteArray86 != null) {
				for (local696 = 1; local696 < local691.aByteArray86.length; local696 += 2) {
					local691.aByteArray86[local696] = local36.method7963();
				}
			}
			if (local691.aByteArray85 != null) {
				for (local696 = 3; local696 < local691.aByteArray85.length - 2; local696 += 2) {
					local691.aByteArray85[local696] = local36.method7963();
				}
			}
		}
		@Pc(749) int local749;
		if (local297 != null) {
			for (local749 = 1; local749 < local297.length; local749 += 2) {
				local297[local749] = local36.method7963();
			}
		}
		if (local310 != null) {
			for (local749 = 1; local749 < local310.length; local749 += 2) {
				local310[local749] = local36.method7963();
			}
		}
		@Pc(798) int local798;
		for (local749 = 0; local749 < local179; local749++) {
			@Pc(791) Class309 local791 = local229[local749];
			if (local791.aByteArray85 != null) {
				local353 = 0;
				for (local798 = 2; local798 < local791.aByteArray85.length; local798 += 2) {
					local353 = local36.method7974() + local353 + 1;
					local791.aByteArray85[local798] = (byte) local353;
				}
			}
		}
		@Pc(839) int local839;
		for (local696 = 0; local696 < local179; local696++) {
			@Pc(832) Class309 local832 = local229[local696];
			if (local832.aByteArray86 != null) {
				local353 = 0;
				for (local839 = 2; local839 < local832.aByteArray86.length; local839 += 2) {
					local353 = local353 + local36.method7974() + 1;
					local832.aByteArray86[local839] = (byte) local353;
				}
			}
		}
		@Pc(920) int local920;
		@Pc(947) int local947;
		@Pc(953) byte local953;
		@Pc(973) int local973;
		@Pc(975) int local975;
		@Pc(985) int local985;
		@Pc(914) byte local914;
		@Pc(1028) int local1028;
		if (local297 != null) {
			local353 = local36.method7974();
			local297[0] = (byte) local353;
			for (local798 = 2; local798 < local297.length; local798 += 2) {
				local353 = local353 + local36.method7974() + 1;
				local297[local798] = (byte) local353;
			}
			local914 = local297[0];
			@Pc(918) byte local918 = local297[1];
			for (local920 = 0; local920 < local914; local920++) {
				this.aByteArray95[local920] = (byte) (this.aByteArray95[local920] * local918 + 32 >> 6);
			}
			local947 = 2;
			while (local947 < local297.length) {
				local953 = local297[local947];
				@Pc(959) byte local959 = local297[local947 + 1];
				local973 = (local953 - local914) * local918 + (local953 - local914) / 2;
				for (local975 = local914; local975 < local953; local975++) {
					local985 = Static344.method5119(local953 - local914, local973);
					this.aByteArray95[local975] = (byte) (this.aByteArray95[local975] * local985 + 32 >> 6);
					local973 += local959 - local918;
				}
				local947 += 2;
				local918 = local959;
				local914 = local953;
			}
			for (local1028 = local914; local1028 < 128; local1028++) {
				this.aByteArray95[local1028] = (byte) (local918 * this.aByteArray95[local1028] + 32 >> 6);
			}
		}
		@Pc(1093) int local1093;
		if (local310 != null) {
			local353 = local36.method7974();
			local310[0] = (byte) local353;
			for (local798 = 2; local798 < local310.length; local798 += 2) {
				local353 = local353 + local36.method7974() + 1;
				local310[local798] = (byte) local353;
			}
			local914 = local310[0];
			local1093 = local310[1] << 1;
			for (local920 = 0; local920 < local914; local920++) {
				local947 = (this.aByteArray94[local920] & 0xFF) + local1093;
				if (local947 < 0) {
					local947 = 0;
				}
				if (local947 > 128) {
					local947 = 128;
				}
				this.aByteArray94[local920] = (byte) local947;
			}
			local947 = 2;
			@Pc(1147) int local1147;
			while (local947 < local310.length) {
				local953 = local310[local947];
				local1147 = local310[local947 + 1] << 1;
				local973 = (local953 - local914) * local1093 + (local953 - local914) / 2;
				for (local975 = local914; local975 < local953; local975++) {
					local985 = Static344.method5119(local953 - local914, local973);
					@Pc(1182) int local1182 = local985 + (this.aByteArray94[local975] & 0xFF);
					if (local1182 < 0) {
						local1182 = 0;
					}
					if (local1182 > 128) {
						local1182 = 128;
					}
					this.aByteArray94[local975] = (byte) local1182;
					local973 += local1147 - local1093;
				}
				local1093 = local1147;
				local947 += 2;
				local914 = local953;
			}
			for (local1028 = local914; local1028 < 128; local1028++) {
				local1147 = (this.aByteArray94[local1028] & 0xFF) + local1093;
				if (local1147 < 0) {
					local1147 = 0;
				}
				if (local1147 > 128) {
					local1147 = 128;
				}
				this.aByteArray94[local1028] = (byte) local1147;
			}
		}
		for (local798 = 0; local798 < local179; local798++) {
			local229[local798].anInt8189 = local36.method7974();
		}
		for (local839 = 0; local839 < local179; local839++) {
			@Pc(1286) Class309 local1286 = local229[local839];
			if (local1286.aByteArray86 != null) {
				local1286.anInt8198 = local36.method7974();
			}
			if (local1286.aByteArray85 != null) {
				local1286.anInt8196 = local36.method7974();
			}
			if (local1286.anInt8189 > 0) {
				local1286.anInt8195 = local36.method7974();
			}
		}
		for (local1093 = 0; local1093 < local179; local1093++) {
			local229[local1093].anInt8194 = local36.method7974();
		}
		for (local920 = 0; local920 < local179; local920++) {
			@Pc(1345) Class309 local1345 = local229[local920];
			if (local1345.anInt8194 > 0) {
				local1345.anInt8193 = local36.method7974();
			}
		}
		for (local947 = 0; local947 < local179; local947++) {
			@Pc(1368) Class309 local1368 = local229[local947];
			if (local1368.anInt8193 > 0) {
				local1368.anInt8190 = local36.method7974();
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([B[IILclient!on;)Z")
	public boolean method7550(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class257 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub13_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray583[local13];
				if (local25 != 0) {
					if (local25 != local9) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg2.method5478(arg1, local25 >> 2);
						} else {
							local11 = arg2.method5479(local25 >> 2, arg1);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub13_Sub1Array1[local13] = local11;
						this.anIntArray583[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public void method7551() {
		this.anIntArray583 = null;
	}
}
