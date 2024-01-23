import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class3_Sub22 extends Class3 {

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "[S")
	public short[] aShortArray72 = new short[128];

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
	public int anInt3712;

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "[Lclient!oa;")
	public Class126[] aClass126Array1 = new Class126[128];

	@OriginalMember(owner = "client!nj", name = "z", descriptor = "[Lclient!qj;")
	public Class3_Sub11_Sub1[] aClass3_Sub11_Sub1Array1 = new Class3_Sub11_Sub1[128];

	@OriginalMember(owner = "client!nj", name = "A", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([B)V")
	public Class3_Sub22(@OriginalArg(0) byte[] arg0) {
		@Pc(17) int local17 = 0;
		this.anIntArray429 = new int[128];
		this.aByteArray46 = new byte[128];
		this.aByteArray44 = new byte[128];
		this.aByteArray45 = new byte[128];
		@Pc(38) Class3_Sub26 local38 = new Class3_Sub26(arg0);
		while (local38.aByteArray64[local17 + local38.anInt4615] != 0) {
			local17++;
		}
		@Pc(52) byte[] local52 = new byte[local17];
		@Pc(54) int local54;
		for (local54 = 0; local54 < local17; local54++) {
			local52[local54] = local38.method3920();
		}
		@Pc(68) int local68 = 0;
		local17++;
		local38.anInt4615++;
		local54 = local38.anInt4615;
		local38.anInt4615 += local17;
		while (local38.aByteArray64[local68 + local38.anInt4615] != 0) {
			local68++;
		}
		@Pc(98) byte[] local98 = new byte[local68];
		@Pc(100) int local100;
		for (local100 = 0; local100 < local68; local100++) {
			local98[local100] = local38.method3920();
		}
		local68++;
		local38.anInt4615++;
		local100 = local38.anInt4615;
		@Pc(124) int local124 = 0;
		local38.anInt4615 += local68;
		while (local38.aByteArray64[local38.anInt4615 + local124] != 0) {
			local124++;
		}
		@Pc(148) byte[] local148 = new byte[local124];
		for (@Pc(150) int local150 = 0; local150 < local124; local150++) {
			local148[local150] = local38.method3920();
		}
		local124++;
		@Pc(166) byte[] local166 = new byte[local124];
		local38.anInt4615++;
		@Pc(185) int local185;
		@Pc(187) int local187;
		if (local124 > 1) {
			@Pc(179) int local179 = 1;
			local166[1] = 1;
			local185 = 2;
			for (local187 = 2; local187 < local124; local187++) {
				@Pc(194) int local194 = local38.method3915();
				if (local194 == 0) {
					local179 = local185++;
				} else {
					if (local179 >= local194) {
						local194--;
					}
					local179 = local194;
				}
				local166[local187] = (byte) local179;
			}
		} else {
			local185 = local124;
		}
		@Pc(229) Class126[] local229 = new Class126[local185];
		for (local187 = 0; local187 < local229.length; local187++) {
			@Pc(243) Class126 local243 = local229[local187] = new Class126();
			@Pc(247) int local247 = local38.method3915();
			if (local247 > 0) {
				local243.aByteArray49 = new byte[local247 * 2];
			}
			local247 = local38.method3915();
			if (local247 > 0) {
				local243.aByteArray50 = new byte[local247 * 2 + 2];
				local243.aByteArray50[1] = 64;
			}
		}
		local187 = local38.method3915();
		@Pc(295) byte[] local295 = local187 <= 0 ? null : new byte[local187 * 2];
		local187 = local38.method3915();
		@Pc(311) byte[] local311 = local187 > 0 ? new byte[local187 * 2] : null;
		@Pc(313) int local313;
		for (local313 = 0; local38.aByteArray64[local38.anInt4615 + local313] != 0; local313++) {
		}
		@Pc(330) byte[] local330 = new byte[local313];
		@Pc(332) int local332;
		for (local332 = 0; local332 < local313; local332++) {
			local330[local332] = local38.method3920();
		}
		local332 = 0;
		local313++;
		local38.anInt4615++;
		@Pc(355) int local355;
		for (local355 = 0; local355 < 128; local355++) {
			local332 += local38.method3915();
			this.aShortArray72[local355] = (short) local332;
		}
		local332 = 0;
		for (local355 = 0; local355 < 128; local355++) {
			local332 += local38.method3915();
			this.aShortArray72[local355] = (short) (this.aShortArray72[local355] + (local332 << 8));
		}
		local355 = 0;
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		@Pc(410) int local410;
		for (local410 = 0; local410 < 128; local410++) {
			if (local355 == 0) {
				if (local330.length > local406) {
					local355 = local330[local406++];
				} else {
					local355 = -1;
				}
				local408 = local38.method3918();
			}
			local355--;
			this.aShortArray72[local410] = (short) (this.aShortArray72[local410] + ((local408 - 1 & 0x2) << 14));
			this.anIntArray429[local410] = local408;
		}
		local406 = 0;
		local355 = 0;
		local410 = 0;
		@Pc(469) int local469;
		for (local469 = 0; local469 < 128; local469++) {
			if (this.anIntArray429[local469] != 0) {
				if (local355 == 0) {
					local410 = local38.aByteArray64[local54++] - 1;
					if (local406 < local52.length) {
						local355 = local52[local406++];
					} else {
						local355 = -1;
					}
				}
				this.aByteArray46[local469] = (byte) local410;
				local355--;
			}
		}
		local355 = 0;
		local406 = 0;
		local469 = 0;
		for (@Pc(528) int local528 = 0; local528 < 128; local528++) {
			if (this.anIntArray429[local528] != 0) {
				if (local355 == 0) {
					local469 = local38.aByteArray64[local100++] + 16 << 2;
					if (local406 >= local98.length) {
						local355 = -1;
					} else {
						local355 = local98[local406++];
					}
				}
				local355--;
				this.aByteArray44[local528] = (byte) local469;
			}
		}
		@Pc(578) Class126 local578 = null;
		local355 = 0;
		local406 = 0;
		@Pc(584) int local584;
		for (local584 = 0; local584 < 128; local584++) {
			if (this.anIntArray429[local584] != 0) {
				if (local355 == 0) {
					local578 = local229[local166[local406]];
					if (local406 >= local148.length) {
						local355 = -1;
					} else {
						local355 = local148[local406++];
					}
				}
				this.aClass126Array1[local584] = local578;
				local355--;
			}
		}
		local584 = 0;
		local355 = 0;
		local406 = 0;
		@Pc(641) int local641;
		for (local641 = 0; local641 < 128; local641++) {
			if (local355 == 0) {
				if (local330.length <= local406) {
					local355 = -1;
				} else {
					local355 = local330[local406++];
				}
				if (this.anIntArray429[local641] > 0) {
					local584 = local38.method3915() + 1;
				}
			}
			this.aByteArray45[local641] = (byte) local584;
			local355--;
		}
		this.anInt3712 = local38.method3915() + 1;
		@Pc(706) Class126 local706;
		@Pc(712) int local712;
		for (local641 = 0; local641 < local185; local641++) {
			local706 = local229[local641];
			if (local706.aByteArray49 != null) {
				for (local712 = 1; local712 < local706.aByteArray49.length; local712 += 2) {
					local706.aByteArray49[local712] = local38.method3920();
				}
			}
			if (local706.aByteArray50 != null) {
				for (local712 = 3; local712 < local706.aByteArray50.length - 2; local712 += 2) {
					local706.aByteArray50[local712] = local38.method3920();
				}
			}
		}
		if (local295 != null) {
			for (local641 = 1; local641 < local295.length; local641 += 2) {
				local295[local641] = local38.method3920();
			}
		}
		if (local311 != null) {
			for (local641 = 1; local641 < local311.length; local641 += 2) {
				local311[local641] = local38.method3920();
			}
		}
		for (local641 = 0; local641 < local185; local641++) {
			local706 = local229[local641];
			if (local706.aByteArray50 != null) {
				local332 = 0;
				for (local712 = 2; local712 < local706.aByteArray50.length; local712 += 2) {
					local332 = local332 + local38.method3915() + 1;
					local706.aByteArray50[local712] = (byte) local332;
				}
			}
		}
		for (local641 = 0; local641 < local185; local641++) {
			local706 = local229[local641];
			if (local706.aByteArray49 != null) {
				local332 = 0;
				for (local712 = 2; local712 < local706.aByteArray49.length; local712 += 2) {
					local332 += local38.method3915() + 1;
					local706.aByteArray49[local712] = (byte) local332;
				}
			}
		}
		@Pc(979) byte local979;
		@Pc(994) int local994;
		@Pc(996) int local996;
		@Pc(1011) int local1011;
		@Pc(1044) int local1044;
		@Pc(932) byte local932;
		if (local295 != null) {
			local332 = local38.method3915();
			local295[0] = (byte) local332;
			for (local641 = 2; local641 < local295.length; local641 += 2) {
				local332 = local38.method3915() + local332 + 1;
				local295[local641] = (byte) local332;
			}
			local932 = local295[0];
			@Pc(936) byte local936 = local295[1];
			for (local712 = 0; local712 < local932; local712++) {
				this.aByteArray45[local712] = (byte) (local936 * this.aByteArray45[local712] + 32 >> 6);
			}
			local712 = 2;
			while (local712 < local295.length) {
				@Pc(975) byte local975 = local295[local712 + 1];
				local979 = local295[local712];
				local712 += 2;
				local994 = (local979 - local932) / 2 + (local979 - local932) * local936;
				for (local996 = local932; local996 < local979; local996++) {
					local1011 = Static253.method4285(local979 - local932, local994);
					local994 += local975 - local936;
					this.aByteArray45[local996] = (byte) (this.aByteArray45[local996] * local1011 + 32 >> 6);
				}
				local932 = local979;
				local936 = local975;
			}
			for (local1044 = local932; local1044 < 128; local1044++) {
				this.aByteArray45[local1044] = (byte) (this.aByteArray45[local1044] * local936 + 32 >> 6);
			}
		}
		if (local311 != null) {
			local332 = local38.method3915();
			local311[0] = (byte) local332;
			for (local641 = 2; local641 < local311.length; local641 += 2) {
				local332 = local332 + local38.method3915() + 1;
				local311[local641] = (byte) local332;
			}
			@Pc(1115) int local1115 = local311[1] << 1;
			local932 = local311[0];
			for (local712 = 0; local712 < local932; local712++) {
				local1044 = local1115 + (this.aByteArray44[local712] & 0xFF);
				if (local1044 < 0) {
					local1044 = 0;
				}
				if (local1044 > 128) {
					local1044 = 128;
				}
				this.aByteArray44[local712] = (byte) local1044;
			}
			local712 = 2;
			@Pc(1173) int local1173;
			while (local712 < local311.length) {
				local979 = local311[local712];
				local1173 = local311[local712 + 1] << 1;
				local994 = (local979 - local932) * local1115 + (local979 - local932) / 2;
				for (local996 = local932; local996 < local979; local996++) {
					local1011 = Static253.method4285(local979 - local932, local994);
					local994 += local1173 - local1115;
					@Pc(1221) int local1221 = (this.aByteArray44[local996] & 0xFF) + local1011;
					if (local1221 < 0) {
						local1221 = 0;
					}
					if (local1221 > 128) {
						local1221 = 128;
					}
					this.aByteArray44[local996] = (byte) local1221;
				}
				local1115 = local1173;
				local712 += 2;
				local932 = local979;
			}
			for (local1044 = local932; local1044 < 128; local1044++) {
				local1173 = local1115 + (this.aByteArray44[local1044] & 0xFF);
				if (local1173 < 0) {
					local1173 = 0;
				}
				if (local1173 > 128) {
					local1173 = 128;
				}
				this.aByteArray44[local1044] = (byte) local1173;
			}
		}
		for (local641 = 0; local641 < local185; local641++) {
			local229[local641].anInt3819 = local38.method3915();
		}
		for (local641 = 0; local641 < local185; local641++) {
			local706 = local229[local641];
			if (local706.aByteArray49 != null) {
				local706.anInt3812 = local38.method3915();
			}
			if (local706.aByteArray50 != null) {
				local706.anInt3820 = local38.method3915();
			}
			if (local706.anInt3819 > 0) {
				local706.anInt3823 = local38.method3915();
			}
		}
		for (local641 = 0; local641 < local185; local641++) {
			local229[local641].anInt3822 = local38.method3915();
		}
		for (local641 = 0; local641 < local185; local641++) {
			local706 = local229[local641];
			if (local706.anInt3822 > 0) {
				local706.anInt3813 = local38.method3915();
			}
		}
		for (local641 = 0; local641 < local185; local641++) {
			local706 = local229[local641];
			if (local706.anInt3813 > 0) {
				local706.anInt3821 = local38.method3915();
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([BILclient!kb;[I)Z")
	public boolean method3145(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class92 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) int local17 = 0;
		@Pc(19) Class3_Sub11_Sub1 local19 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg0 == null || arg0[local21] != 0) {
				@Pc(37) int local37 = this.anIntArray429[local21];
				if (local37 != 0) {
					if (local37 != local17) {
						local17 = local37--;
						if ((local37 & 0x1) == 0) {
							local19 = arg1.method2395(local37 >> 2, arg2);
						} else {
							local19 = arg1.method2398(local37 >> 2, arg2);
						}
						if (local19 == null) {
							local7 = false;
						}
					}
					if (local19 != null) {
						this.aClass3_Sub11_Sub1Array1[local21] = local19;
						this.anIntArray429[local21] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
	public void method3146() {
		this.anIntArray429 = null;
	}
}
