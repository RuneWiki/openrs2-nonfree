import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class12_Sub25 extends Class12 {

	@OriginalMember(owner = "client!il", name = "o", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!il", name = "q", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!il", name = "r", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!il", name = "v", descriptor = "[Lclient!ke;")
	public Class12_Sub29_Sub1[] aClass12_Sub29_Sub1Array1;

	@OriginalMember(owner = "client!il", name = "w", descriptor = "[Lclient!taa;")
	public Class281[] aClass281Array1;

	@OriginalMember(owner = "client!il", name = "x", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!il", name = "y", descriptor = "I")
	public int anInt4581;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	private Class12_Sub25() {
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "([B)V")
	public Class12_Sub25(@OriginalArg(0) byte[] arg0) {
		this.aClass281Array1 = new Class281[128];
		this.aClass12_Sub29_Sub1Array1 = new Class12_Sub29_Sub1[128];
		this.aByteArray53 = new byte[128];
		this.aByteArray55 = new byte[128];
		this.anIntArray338 = new int[128];
		this.aShortArray74 = new short[128];
		this.aByteArray54 = new byte[128];
		@Pc(36) Class12_Sub8 local36 = new Class12_Sub8(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray82[local36.anInt6217 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method5173();
		}
		local38++;
		local36.anInt6217++;
		@Pc(80) int local80 = local36.anInt6217;
		local36.anInt6217 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray82[local88 + local36.anInt6217] != 0; local88++) {
		}
		@Pc(102) byte[] local102 = new byte[local88];
		for (@Pc(104) int local104 = 0; local104 < local88; local104++) {
			local102[local104] = local36.method5173();
		}
		local88++;
		local36.anInt6217++;
		@Pc(126) int local126 = local36.anInt6217;
		local36.anInt6217 += local88;
		@Pc(134) int local134;
		for (local134 = 0; local36.aByteArray82[local36.anInt6217 + local134] != 0; local134++) {
		}
		@Pc(149) byte[] local149 = new byte[local134];
		for (@Pc(151) int local151 = 0; local151 < local134; local151++) {
			local149[local151] = local36.method5173();
		}
		local134++;
		local36.anInt6217++;
		@Pc(173) byte[] local173 = new byte[local134];
		@Pc(184) int local184;
		@Pc(188) int local188;
		@Pc(194) int local194;
		if (local134 > 1) {
			local173[1] = 1;
			local184 = 2;
			@Pc(186) int local186 = 1;
			for (local188 = 2; local188 < local134; local188++) {
				local194 = local36.method5216();
				if (local194 == 0) {
					local186 = local184++;
				} else {
					if (local186 >= local194) {
						local194--;
					}
					local186 = local194;
				}
				local173[local188] = (byte) local186;
			}
		} else {
			local184 = local134;
		}
		@Pc(223) Class281[] local223 = new Class281[local184];
		for (local188 = 0; local188 < local223.length; local188++) {
			@Pc(235) Class281 local235 = local223[local188] = new Class281();
			@Pc(239) int local239 = local36.method5216();
			if (local239 > 0) {
				local235.aByteArray104 = new byte[local239 * 2];
			}
			local239 = local36.method5216();
			if (local239 > 0) {
				local235.aByteArray103 = new byte[local239 * 2 + 2];
				local235.aByteArray103[1] = 64;
			}
		}
		local194 = local36.method5216();
		@Pc(290) byte[] local290 = local194 <= 0 ? null : new byte[local194 * 2];
		local194 = local36.method5216();
		@Pc(306) byte[] local306 = local194 > 0 ? new byte[local194 * 2] : null;
		@Pc(308) int local308;
		for (local308 = 0; local36.aByteArray82[local308 + local36.anInt6217] != 0; local308++) {
		}
		@Pc(322) byte[] local322 = new byte[local308];
		for (@Pc(324) int local324 = 0; local324 < local308; local324++) {
			local322[local324] = local36.method5173();
		}
		local36.anInt6217++;
		local308++;
		@Pc(349) int local349 = 0;
		for (@Pc(351) int local351 = 0; local351 < 128; local351++) {
			local349 += local36.method5216();
			this.aShortArray74[local351] = (short) local349;
		}
		local349 = 0;
		for (@Pc(373) int local373 = 0; local373 < 128; local373++) {
			local349 += local36.method5216();
			this.aShortArray74[local373] = (short) (this.aShortArray74[local373] + (local349 << 8));
		}
		@Pc(398) int local398 = 0;
		@Pc(400) int local400 = 0;
		@Pc(402) int local402 = 0;
		for (@Pc(404) int local404 = 0; local404 < 128; local404++) {
			if (local398 == 0) {
				if (local322.length > local400) {
					local398 = local322[local400++];
				} else {
					local398 = -1;
				}
				local402 = local36.method5229();
			}
			this.aShortArray74[local404] = (short) (this.aShortArray74[local404] + ((local402 - 1 & 0x2) << 14));
			local398--;
			this.anIntArray338[local404] = local402;
		}
		local400 = 0;
		local398 = 0;
		@Pc(462) int local462 = 0;
		for (@Pc(464) int local464 = 0; local464 < 128; local464++) {
			if (this.anIntArray338[local464] != 0) {
				if (local398 == 0) {
					if (local56.length > local400) {
						local398 = local56[local400++];
					} else {
						local398 = -1;
					}
					local462 = local36.aByteArray82[local80++] - 1;
				}
				this.aByteArray55[local464] = (byte) local462;
				local398--;
			}
		}
		local400 = 0;
		local398 = 0;
		@Pc(516) int local516 = 0;
		for (@Pc(518) int local518 = 0; local518 < 128; local518++) {
			if (this.anIntArray338[local518] != 0) {
				if (local398 == 0) {
					if (local400 < local102.length) {
						local398 = local102[local400++];
					} else {
						local398 = -1;
					}
					local516 = local36.aByteArray82[local126++] + 16 << 2;
				}
				this.aByteArray54[local518] = (byte) local516;
				local398--;
			}
		}
		local400 = 0;
		local398 = 0;
		@Pc(573) Class281 local573 = null;
		for (@Pc(575) int local575 = 0; local575 < 128; local575++) {
			if (this.anIntArray338[local575] != 0) {
				if (local398 == 0) {
					local573 = local223[local173[local400]];
					if (local400 < local149.length) {
						local398 = local149[local400++];
					} else {
						local398 = -1;
					}
				}
				local398--;
				this.aClass281Array1[local575] = local573;
			}
		}
		local400 = 0;
		local398 = 0;
		@Pc(626) int local626 = 0;
		for (@Pc(628) int local628 = 0; local628 < 128; local628++) {
			if (local398 == 0) {
				if (local400 < local322.length) {
					local398 = local322[local400++];
				} else {
					local398 = -1;
				}
				if (this.anIntArray338[local628] > 0) {
					local626 = local36.method5216() + 1;
				}
			}
			local398--;
			this.aByteArray53[local628] = (byte) local626;
		}
		this.anInt4581 = local36.method5216() + 1;
		@Pc(693) int local693;
		for (@Pc(682) int local682 = 0; local682 < local184; local682++) {
			@Pc(688) Class281 local688 = local223[local682];
			if (local688.aByteArray104 != null) {
				for (local693 = 1; local693 < local688.aByteArray104.length; local693 += 2) {
					local688.aByteArray104[local693] = local36.method5173();
				}
			}
			if (local688.aByteArray103 != null) {
				for (local693 = 3; local693 < local688.aByteArray103.length - 2; local693 += 2) {
					local688.aByteArray103[local693] = local36.method5173();
				}
			}
		}
		@Pc(742) int local742;
		if (local290 != null) {
			for (local742 = 1; local742 < local290.length; local742 += 2) {
				local290[local742] = local36.method5173();
			}
		}
		if (local306 != null) {
			for (local742 = 1; local742 < local306.length; local742 += 2) {
				local306[local742] = local36.method5173();
			}
		}
		@Pc(791) int local791;
		for (local742 = 0; local742 < local184; local742++) {
			@Pc(784) Class281 local784 = local223[local742];
			if (local784.aByteArray103 != null) {
				local349 = 0;
				for (local791 = 2; local791 < local784.aByteArray103.length; local791 += 2) {
					local349 = local36.method5216() + local349 + 1;
					local784.aByteArray103[local791] = (byte) local349;
				}
			}
		}
		@Pc(836) int local836;
		for (local693 = 0; local693 < local184; local693++) {
			@Pc(829) Class281 local829 = local223[local693];
			if (local829.aByteArray104 != null) {
				local349 = 0;
				for (local836 = 2; local836 < local829.aByteArray104.length; local836 += 2) {
					local349 = local349 + local36.method5216() + 1;
					local829.aByteArray104[local836] = (byte) local349;
				}
			}
		}
		@Pc(909) int local909;
		@Pc(932) int local932;
		@Pc(938) byte local938;
		@Pc(958) int local958;
		@Pc(960) int local960;
		@Pc(970) int local970;
		@Pc(903) byte local903;
		@Pc(1011) int local1011;
		if (local290 != null) {
			local349 = local36.method5216();
			local290[0] = (byte) local349;
			for (local791 = 2; local791 < local290.length; local791 += 2) {
				local349 = local36.method5216() + local349 + 1;
				local290[local791] = (byte) local349;
			}
			local903 = local290[0];
			@Pc(907) byte local907 = local290[1];
			for (local909 = 0; local909 < local903; local909++) {
				this.aByteArray53[local909] = (byte) (local907 * this.aByteArray53[local909] + 32 >> 6);
			}
			for (local932 = 2; local932 < local290.length; local932 += 2) {
				local938 = local290[local932];
				@Pc(944) byte local944 = local290[local932 + 1];
				local958 = (local938 - local903) * local907 + (local938 - local903) / 2;
				for (local960 = local903; local960 < local938; local960++) {
					local970 = Static185.method3622(local958, local938 - local903);
					local958 += local944 - local907;
					this.aByteArray53[local960] = (byte) (local970 * this.aByteArray53[local960] + 32 >> 6);
				}
				local907 = local944;
				local903 = local938;
			}
			for (local1011 = local903; local1011 < 128; local1011++) {
				this.aByteArray53[local1011] = (byte) (local907 * this.aByteArray53[local1011] + 32 >> 6);
			}
		}
		@Pc(1083) int local1083;
		if (local306 != null) {
			local349 = local36.method5216();
			local306[0] = (byte) local349;
			for (local791 = 2; local791 < local306.length; local791 += 2) {
				local349 = local36.method5216() + local349 + 1;
				local306[local791] = (byte) local349;
			}
			local903 = local306[0];
			local1083 = local306[1] << 1;
			for (local909 = 0; local909 < local903; local909++) {
				local932 = local1083 + (this.aByteArray54[local909] & 0xFF);
				if (local932 < 0) {
					local932 = 0;
				}
				if (local932 > 128) {
					local932 = 128;
				}
				this.aByteArray54[local909] = (byte) local932;
			}
			@Pc(1140) int local1140;
			for (local932 = 2; local932 < local306.length; local932 += 2) {
				local938 = local306[local932];
				local1140 = local306[local932 + 1] << 1;
				local958 = local1083 * (local938 - local903) + (local938 - local903) / 2;
				for (local960 = local903; local960 < local938; local960++) {
					local970 = Static185.method3622(local958, local938 - local903);
					@Pc(1176) int local1176 = local970 + (this.aByteArray54[local960] & 0xFF);
					if (local1176 < 0) {
						local1176 = 0;
					}
					if (local1176 > 128) {
						local1176 = 128;
					}
					local958 += local1140 - local1083;
					this.aByteArray54[local960] = (byte) local1176;
				}
				local1083 = local1140;
				local903 = local938;
			}
			for (local1011 = local903; local1011 < 128; local1011++) {
				local1140 = (this.aByteArray54[local1011] & 0xFF) + local1083;
				if (local1140 < 0) {
					local1140 = 0;
				}
				if (local1140 > 128) {
					local1140 = 128;
				}
				this.aByteArray54[local1011] = (byte) local1140;
			}
		}
		for (local791 = 0; local791 < local184; local791++) {
			local223[local791].anInt8372 = local36.method5216();
		}
		for (local836 = 0; local836 < local184; local836++) {
			@Pc(1281) Class281 local1281 = local223[local836];
			if (local1281.aByteArray104 != null) {
				local1281.anInt8371 = local36.method5216();
			}
			if (local1281.aByteArray103 != null) {
				local1281.anInt8373 = local36.method5216();
			}
			if (local1281.anInt8372 > 0) {
				local1281.anInt8367 = local36.method5216();
			}
		}
		for (local1083 = 0; local1083 < local184; local1083++) {
			local223[local1083].anInt8374 = local36.method5216();
		}
		for (local909 = 0; local909 < local184; local909++) {
			@Pc(1339) Class281 local1339 = local223[local909];
			if (local1339.anInt8374 > 0) {
				local1339.anInt8370 = local36.method5216();
			}
		}
		for (local932 = 0; local932 < local184; local932++) {
			@Pc(1359) Class281 local1359 = local223[local932];
			if (local1359.anInt8370 > 0) {
				local1359.anInt8368 = local36.method5216();
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([IBLclient!hj;[B)Z")
	public boolean method3851(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class132 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class12_Sub29_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray338[local18];
				if (local30 != 0) {
					if (local14 != local30) {
						local14 = local30--;
						if ((local30 & 0x1) == 0) {
							local16 = arg1.method3616(local30 >> 2, arg0);
						} else {
							local16 = arg1.method3614(arg0, local30 >> 2);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass12_Sub29_Sub1Array1[local18] = local16;
						this.anIntArray338[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
	public void method3853() {
		this.anIntArray338 = null;
	}
}
