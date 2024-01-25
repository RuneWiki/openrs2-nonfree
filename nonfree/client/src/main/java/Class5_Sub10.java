import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class5_Sub10 extends Class5 {

	@OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
	public int anInt1153;

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!caa", name = "n", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!caa", name = "o", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!caa", name = "p", descriptor = "[Lclient!so;")
	public Class5_Sub37_Sub1[] aClass5_Sub37_Sub1Array1;

	@OriginalMember(owner = "client!caa", name = "t", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!caa", name = "v", descriptor = "[Lclient!uh;")
	public Class346[] aClass346Array1;

	@OriginalMember(owner = "client!caa", name = "w", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "()V")
	private Class5_Sub10() {
	}

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "([B)V")
	public Class5_Sub10(@OriginalArg(0) byte[] arg0) {
		this.anIntArray83 = new int[128];
		this.aByteArray15 = new byte[128];
		this.aClass5_Sub37_Sub1Array1 = new Class5_Sub37_Sub1[128];
		this.aByteArray16 = new byte[128];
		this.aShortArray28 = new short[128];
		this.aClass346Array1 = new Class346[128];
		this.aByteArray14 = new byte[128];
		@Pc(36) Class5_Sub22 local36 = new Class5_Sub22(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray71[local36.anInt6629 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method5963();
		}
		local38++;
		local36.anInt6629++;
		@Pc(84) int local84 = local36.anInt6629;
		local36.anInt6629 += local38;
		@Pc(92) int local92;
		for (local92 = 0; local36.aByteArray71[local92 + local36.anInt6629] != 0; local92++) {
		}
		@Pc(109) byte[] local109 = new byte[local92];
		for (@Pc(111) int local111 = 0; local111 < local92; local111++) {
			local109[local111] = local36.method5963();
		}
		local92++;
		local36.anInt6629++;
		@Pc(137) int local137 = local36.anInt6629;
		local36.anInt6629 += local92;
		@Pc(145) int local145;
		for (local145 = 0; local36.aByteArray71[local36.anInt6629 + local145] != 0; local145++) {
		}
		@Pc(163) byte[] local163 = new byte[local145];
		for (@Pc(165) int local165 = 0; local165 < local145; local165++) {
			local163[local165] = local36.method5963();
		}
		local145++;
		local36.anInt6629++;
		@Pc(187) byte[] local187 = new byte[local145];
		@Pc(200) int local200;
		@Pc(202) int local202;
		@Pc(208) int local208;
		if (local145 > 1) {
			local187[1] = 1;
			@Pc(198) int local198 = 1;
			local200 = 2;
			for (local202 = 2; local202 < local145; local202++) {
				local208 = local36.method5966();
				if (local208 == 0) {
					local198 = local200++;
				} else {
					if (local198 >= local208) {
						local208--;
					}
					local198 = local208;
				}
				local187[local202] = (byte) local198;
			}
		} else {
			local200 = local145;
		}
		@Pc(245) Class346[] local245 = new Class346[local200];
		for (local202 = 0; local202 < local245.length; local202++) {
			@Pc(257) Class346 local257 = local245[local202] = new Class346();
			@Pc(261) int local261 = local36.method5966();
			if (local261 > 0) {
				local257.aByteArray101 = new byte[local261 * 2];
			}
			local261 = local36.method5966();
			if (local261 > 0) {
				local257.aByteArray100 = new byte[local261 * 2 + 2];
				local257.aByteArray100[1] = 64;
			}
		}
		local208 = local36.method5966();
		@Pc(312) byte[] local312 = local208 > 0 ? new byte[local208 * 2] : null;
		local208 = local36.method5966();
		@Pc(325) byte[] local325 = local208 > 0 ? new byte[local208 * 2] : null;
		@Pc(327) int local327;
		for (local327 = 0; local36.aByteArray71[local327 + local36.anInt6629] != 0; local327++) {
		}
		@Pc(344) byte[] local344 = new byte[local327];
		for (@Pc(346) int local346 = 0; local346 < local327; local346++) {
			local344[local346] = local36.method5963();
		}
		local36.anInt6629++;
		local327++;
		@Pc(367) int local367 = 0;
		for (@Pc(369) int local369 = 0; local369 < 128; local369++) {
			local367 += local36.method5966();
			this.aShortArray28[local369] = (short) local367;
		}
		local367 = 0;
		for (@Pc(391) int local391 = 0; local391 < 128; local391++) {
			local367 += local36.method5966();
			this.aShortArray28[local391] = (short) (this.aShortArray28[local391] + (local367 << 8));
		}
		@Pc(418) int local418 = 0;
		@Pc(420) int local420 = 0;
		@Pc(422) int local422 = 0;
		for (@Pc(424) int local424 = 0; local424 < 128; local424++) {
			if (local418 == 0) {
				if (local420 < local344.length) {
					local418 = local344[local420++];
				} else {
					local418 = -1;
				}
				local422 = local36.method5939();
			}
			this.aShortArray28[local424] = (short) (this.aShortArray28[local424] + ((local422 - 1 & 0x2) << 14));
			local418--;
			this.anIntArray83[local424] = local422;
		}
		local420 = 0;
		local418 = 0;
		@Pc(479) int local479 = 0;
		for (@Pc(481) int local481 = 0; local481 < 128; local481++) {
			if (this.anIntArray83[local481] != 0) {
				if (local418 == 0) {
					if (local56.length <= local420) {
						local418 = -1;
					} else {
						local418 = local56[local420++];
					}
					local479 = local36.aByteArray71[local84++] - 1;
				}
				local418--;
				this.aByteArray16[local481] = (byte) local479;
			}
		}
		local418 = 0;
		local420 = 0;
		@Pc(537) int local537 = 0;
		for (@Pc(539) int local539 = 0; local539 < 128; local539++) {
			if (this.anIntArray83[local539] != 0) {
				if (local418 == 0) {
					if (local420 < local109.length) {
						local418 = local109[local420++];
					} else {
						local418 = -1;
					}
					local537 = local36.aByteArray71[local137++] + 16 << 2;
				}
				local418--;
				this.aByteArray14[local539] = (byte) local537;
			}
		}
		local418 = 0;
		local420 = 0;
		@Pc(592) Class346 local592 = null;
		for (@Pc(594) int local594 = 0; local594 < 128; local594++) {
			if (this.anIntArray83[local594] != 0) {
				if (local418 == 0) {
					local592 = local245[local187[local420]];
					if (local163.length > local420) {
						local418 = local163[local420++];
					} else {
						local418 = -1;
					}
				}
				this.aClass346Array1[local594] = local592;
				local418--;
			}
		}
		local420 = 0;
		local418 = 0;
		@Pc(647) int local647 = 0;
		for (@Pc(649) int local649 = 0; local649 < 128; local649++) {
			if (local418 == 0) {
				if (local344.length <= local420) {
					local418 = -1;
				} else {
					local418 = local344[local420++];
				}
				if (this.anIntArray83[local649] > 0) {
					local647 = local36.method5966() + 1;
				}
			}
			this.aByteArray15[local649] = (byte) local647;
			local418--;
		}
		this.anInt1153 = local36.method5966() + 1;
		@Pc(710) int local710;
		for (@Pc(699) int local699 = 0; local699 < local200; local699++) {
			@Pc(705) Class346 local705 = local245[local699];
			if (local705.aByteArray101 != null) {
				for (local710 = 1; local710 < local705.aByteArray101.length; local710 += 2) {
					local705.aByteArray101[local710] = local36.method5963();
				}
			}
			if (local705.aByteArray100 != null) {
				for (local710 = 3; local710 < local705.aByteArray100.length - 2; local710 += 2) {
					local705.aByteArray100[local710] = local36.method5963();
				}
			}
		}
		@Pc(763) int local763;
		if (local312 != null) {
			for (local763 = 1; local763 < local312.length; local763 += 2) {
				local312[local763] = local36.method5963();
			}
		}
		if (local325 != null) {
			for (local763 = 1; local763 < local325.length; local763 += 2) {
				local325[local763] = local36.method5963();
			}
		}
		@Pc(816) int local816;
		for (local763 = 0; local763 < local200; local763++) {
			@Pc(809) Class346 local809 = local245[local763];
			if (local809.aByteArray100 != null) {
				local367 = 0;
				for (local816 = 2; local816 < local809.aByteArray100.length; local816 += 2) {
					local367 = local36.method5966() + local367 + 1;
					local809.aByteArray100[local816] = (byte) local367;
				}
			}
		}
		@Pc(861) int local861;
		for (local710 = 0; local710 < local200; local710++) {
			@Pc(854) Class346 local854 = local245[local710];
			if (local854.aByteArray101 != null) {
				local367 = 0;
				for (local861 = 2; local861 < local854.aByteArray101.length; local861 += 2) {
					local367 = local36.method5966() + local367 + 1;
					local854.aByteArray101[local861] = (byte) local367;
				}
			}
		}
		@Pc(935) int local935;
		@Pc(958) int local958;
		@Pc(964) byte local964;
		@Pc(983) int local983;
		@Pc(985) int local985;
		@Pc(995) int local995;
		@Pc(929) byte local929;
		@Pc(1036) int local1036;
		if (local312 != null) {
			local367 = local36.method5966();
			local312[0] = (byte) local367;
			for (local816 = 2; local816 < local312.length; local816 += 2) {
				local367 = local367 + local36.method5966() + 1;
				local312[local816] = (byte) local367;
			}
			local929 = local312[0];
			@Pc(933) byte local933 = local312[1];
			for (local935 = 0; local935 < local929; local935++) {
				this.aByteArray15[local935] = (byte) (this.aByteArray15[local935] * local933 + 32 >> 6);
			}
			local958 = 2;
			while (local958 < local312.length) {
				local964 = local312[local958];
				@Pc(970) byte local970 = local312[local958 + 1];
				local983 = (local964 - local929) * local933 + (local964 - local929) / 2;
				for (local985 = local929; local985 < local964; local985++) {
					local995 = Static522.method7725(local983, local964 - local929);
					local983 += local970 - local933;
					this.aByteArray15[local985] = (byte) (local995 * this.aByteArray15[local985] + 32 >> 6);
				}
				local958 += 2;
				local929 = local964;
				local933 = local970;
			}
			for (local1036 = local929; local1036 < 128; local1036++) {
				this.aByteArray15[local1036] = (byte) (this.aByteArray15[local1036] * local933 + 32 >> 6);
			}
		}
		@Pc(1107) int local1107;
		if (local325 != null) {
			local367 = local36.method5966();
			local325[0] = (byte) local367;
			for (local816 = 2; local816 < local325.length; local816 += 2) {
				local367 = local367 + local36.method5966() + 1;
				local325[local816] = (byte) local367;
			}
			local929 = local325[0];
			local1107 = local325[1] << 1;
			for (local935 = 0; local935 < local929; local935++) {
				local958 = local1107 + (this.aByteArray14[local935] & 0xFF);
				if (local958 < 0) {
					local958 = 0;
				}
				if (local958 > 128) {
					local958 = 128;
				}
				this.aByteArray14[local935] = (byte) local958;
			}
			@Pc(1158) int local1158;
			for (local958 = 2; local958 < local325.length; local958 += 2) {
				local964 = local325[local958];
				local1158 = local325[local958 + 1] << 1;
				local983 = (local964 - local929) * local1107 + (local964 - local929) / 2;
				for (local985 = local929; local985 < local964; local985++) {
					local995 = Static522.method7725(local983, local964 - local929);
					@Pc(1193) int local1193 = (this.aByteArray14[local985] & 0xFF) + local995;
					if (local1193 < 0) {
						local1193 = 0;
					}
					if (local1193 > 128) {
						local1193 = 128;
					}
					local983 += local1158 - local1107;
					this.aByteArray14[local985] = (byte) local1193;
				}
				local1107 = local1158;
				local929 = local964;
			}
			for (local1036 = local929; local1036 < 128; local1036++) {
				local1158 = (this.aByteArray14[local1036] & 0xFF) + local1107;
				if (local1158 < 0) {
					local1158 = 0;
				}
				if (local1158 > 128) {
					local1158 = 128;
				}
				this.aByteArray14[local1036] = (byte) local1158;
			}
		}
		for (local816 = 0; local816 < local200; local816++) {
			local245[local816].anInt9569 = local36.method5966();
		}
		for (local861 = 0; local861 < local200; local861++) {
			@Pc(1291) Class346 local1291 = local245[local861];
			if (local1291.aByteArray101 != null) {
				local1291.anInt9570 = local36.method5966();
			}
			if (local1291.aByteArray100 != null) {
				local1291.anInt9566 = local36.method5966();
			}
			if (local1291.anInt9569 > 0) {
				local1291.anInt9568 = local36.method5966();
			}
		}
		for (local1107 = 0; local1107 < local200; local1107++) {
			local245[local1107].anInt9573 = local36.method5966();
		}
		for (local935 = 0; local935 < local200; local935++) {
			@Pc(1350) Class346 local1350 = local245[local935];
			if (local1350.anInt9573 > 0) {
				local1350.anInt9567 = local36.method5966();
			}
		}
		for (local958 = 0; local958 < local200; local958++) {
			@Pc(1373) Class346 local1373 = local245[local958];
			if (local1373.anInt9567 > 0) {
				local1373.anInt9572 = local36.method5966();
			}
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
	public void method976() {
		this.anIntArray83 = null;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!lr;I[I[B)Z")
	public boolean method977(@OriginalArg(0) Class219 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class5_Sub37_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray83[local13];
				if (local28 != 0) {
					if (local9 != local28) {
						local9 = local28--;
						if ((local28 & 0x1) == 0) {
							local11 = arg0.method4922(local28 >> 2, arg1);
						} else {
							local11 = arg0.method4921(local28 >> 2, arg1);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass5_Sub37_Sub1Array1[local13] = local11;
						this.anIntArray83[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
