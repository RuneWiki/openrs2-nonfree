import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class1_Sub37 extends Class1 {

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
	public int anInt6145;

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "[Lclient!nq;")
	public Class1_Sub28_Sub1[] aClass1_Sub28_Sub1Array1;

	@OriginalMember(owner = "client!sh", name = "v", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "[I")
	private int[] anIntArray374;

	@OriginalMember(owner = "client!sh", name = "y", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!sh", name = "z", descriptor = "[Lclient!mc;")
	public Class155[] aClass155Array1;

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "[B")
	public byte[] aByteArray70;

	static {
		new Class151("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	private Class1_Sub37() {
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "([B)V")
	public Class1_Sub37(@OriginalArg(0) byte[] arg0) {
		this.aByteArray70 = new byte[128];
		this.aClass155Array1 = new Class155[128];
		this.aByteArray68 = new byte[128];
		this.aByteArray69 = new byte[128];
		this.aClass1_Sub28_Sub1Array1 = new Class1_Sub28_Sub1[128];
		this.aShortArray77 = new short[128];
		this.anIntArray374 = new int[128];
		@Pc(36) Class1_Sub11 local36 = new Class1_Sub11(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray64[local36.anInt5766 + local38] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method4452();
		}
		local38++;
		local36.anInt5766++;
		@Pc(79) int local79 = local36.anInt5766;
		local36.anInt5766 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray64[local87 + local36.anInt5766] != 0; local87++) {
		}
		@Pc(101) byte[] local101 = new byte[local87];
		for (@Pc(103) int local103 = 0; local103 < local87; local103++) {
			local101[local103] = local36.method4452();
		}
		local36.anInt5766++;
		local87++;
		@Pc(129) int local129 = local36.anInt5766;
		local36.anInt5766 += local87;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray64[local36.anInt5766 + local137] != 0; local137++) {
		}
		@Pc(154) byte[] local154 = new byte[local137];
		for (@Pc(156) int local156 = 0; local156 < local137; local156++) {
			local154[local156] = local36.method4452();
		}
		local137++;
		local36.anInt5766++;
		@Pc(182) byte[] local182 = new byte[local137];
		@Pc(187) int local187;
		@Pc(199) int local199;
		@Pc(205) int local205;
		if (local137 <= 1) {
			local187 = local137;
		} else {
			local182[1] = 1;
			@Pc(195) int local195 = 1;
			local187 = 2;
			for (local199 = 2; local199 < local137; local199++) {
				local205 = local36.method4463();
				if (local205 == 0) {
					local195 = local187++;
				} else {
					if (local195 >= local205) {
						local205--;
					}
					local195 = local205;
				}
				local182[local199] = (byte) local195;
			}
		}
		@Pc(234) Class155[] local234 = new Class155[local187];
		for (local199 = 0; local199 < local234.length; local199++) {
			@Pc(246) Class155 local246 = local234[local199] = new Class155();
			@Pc(250) int local250 = local36.method4463();
			if (local250 > 0) {
				local246.aByteArray40 = new byte[local250 * 2];
			}
			local250 = local36.method4463();
			if (local250 > 0) {
				local246.aByteArray41 = new byte[local250 * 2 + 2];
				local246.aByteArray41[1] = 64;
			}
		}
		local205 = local36.method4463();
		@Pc(308) byte[] local308 = local205 > 0 ? new byte[local205 * 2] : null;
		local205 = local36.method4463();
		@Pc(324) byte[] local324 = local205 <= 0 ? null : new byte[local205 * 2];
		@Pc(326) int local326;
		for (local326 = 0; local36.aByteArray64[local36.anInt5766 + local326] != 0; local326++) {
		}
		@Pc(341) byte[] local341 = new byte[local326];
		for (@Pc(343) int local343 = 0; local343 < local326; local343++) {
			local341[local343] = local36.method4452();
		}
		local326++;
		local36.anInt5766++;
		@Pc(364) int local364 = 0;
		for (@Pc(366) int local366 = 0; local366 < 128; local366++) {
			local364 += local36.method4463();
			this.aShortArray77[local366] = (short) local364;
		}
		local364 = 0;
		for (@Pc(390) int local390 = 0; local390 < 128; local390++) {
			local364 += local36.method4463();
			this.aShortArray77[local390] = (short) (this.aShortArray77[local390] + (local364 << 8));
		}
		@Pc(415) int local415 = 0;
		@Pc(417) int local417 = 0;
		@Pc(419) int local419 = 0;
		for (@Pc(421) int local421 = 0; local421 < 128; local421++) {
			if (local415 == 0) {
				if (local417 >= local341.length) {
					local415 = -1;
				} else {
					local415 = local341[local417++];
				}
				local419 = local36.method4479();
			}
			this.aShortArray77[local421] = (short) (this.aShortArray77[local421] + ((local419 - 1 & 0x2) << 14));
			local415--;
			this.anIntArray374[local421] = local419;
		}
		local417 = 0;
		local415 = 0;
		@Pc(473) int local473 = 0;
		for (@Pc(475) int local475 = 0; local475 < 128; local475++) {
			if (this.anIntArray374[local475] != 0) {
				if (local415 == 0) {
					local473 = local36.aByteArray64[local79++] - 1;
					if (local417 < local55.length) {
						local415 = local55[local417++];
					} else {
						local415 = -1;
					}
				}
				this.aByteArray69[local475] = (byte) local473;
				local415--;
			}
		}
		local415 = 0;
		local417 = 0;
		@Pc(528) int local528 = 0;
		for (@Pc(530) int local530 = 0; local530 < 128; local530++) {
			if (this.anIntArray374[local530] != 0) {
				if (local415 == 0) {
					local528 = local36.aByteArray64[local129++] + 16 << 2;
					if (local101.length <= local417) {
						local415 = -1;
					} else {
						local415 = local101[local417++];
					}
				}
				this.aByteArray68[local530] = (byte) local528;
				local415--;
			}
		}
		local415 = 0;
		local417 = 0;
		@Pc(582) Class155 local582 = null;
		for (@Pc(584) int local584 = 0; local584 < 128; local584++) {
			if (this.anIntArray374[local584] != 0) {
				if (local415 == 0) {
					local582 = local234[local182[local417]];
					if (local417 >= local154.length) {
						local415 = -1;
					} else {
						local415 = local154[local417++];
					}
				}
				this.aClass155Array1[local584] = local582;
				local415--;
			}
		}
		local415 = 0;
		local417 = 0;
		@Pc(636) int local636 = 0;
		for (@Pc(638) int local638 = 0; local638 < 128; local638++) {
			if (local415 == 0) {
				if (local417 >= local341.length) {
					local415 = -1;
				} else {
					local415 = local341[local417++];
				}
				if (this.anIntArray374[local638] > 0) {
					local636 = local36.method4463() + 1;
				}
			}
			this.aByteArray70[local638] = (byte) local636;
			local415--;
		}
		this.anInt6145 = local36.method4463() + 1;
		@Pc(706) int local706;
		for (@Pc(695) int local695 = 0; local695 < local187; local695++) {
			@Pc(701) Class155 local701 = local234[local695];
			if (local701.aByteArray40 != null) {
				for (local706 = 1; local706 < local701.aByteArray40.length; local706 += 2) {
					local701.aByteArray40[local706] = local36.method4452();
				}
			}
			if (local701.aByteArray41 != null) {
				for (local706 = 3; local706 < local701.aByteArray41.length - 2; local706 += 2) {
					local701.aByteArray41[local706] = local36.method4452();
				}
			}
		}
		@Pc(759) int local759;
		if (local308 != null) {
			for (local759 = 1; local759 < local308.length; local759 += 2) {
				local308[local759] = local36.method4452();
			}
		}
		if (local324 != null) {
			for (local759 = 1; local759 < local324.length; local759 += 2) {
				local324[local759] = local36.method4452();
			}
		}
		@Pc(812) int local812;
		for (local759 = 0; local759 < local187; local759++) {
			@Pc(805) Class155 local805 = local234[local759];
			if (local805.aByteArray41 != null) {
				local364 = 0;
				for (local812 = 2; local812 < local805.aByteArray41.length; local812 += 2) {
					local364 = local364 + local36.method4463() + 1;
					local805.aByteArray41[local812] = (byte) local364;
				}
			}
		}
		@Pc(858) int local858;
		for (local706 = 0; local706 < local187; local706++) {
			@Pc(851) Class155 local851 = local234[local706];
			if (local851.aByteArray40 != null) {
				local364 = 0;
				for (local858 = 2; local858 < local851.aByteArray40.length; local858 += 2) {
					local364 = local364 + local36.method4463() + 1;
					local851.aByteArray40[local858] = (byte) local364;
				}
			}
		}
		@Pc(939) int local939;
		@Pc(966) int local966;
		@Pc(972) byte local972;
		@Pc(992) int local992;
		@Pc(994) int local994;
		@Pc(1003) int local1003;
		@Pc(933) byte local933;
		@Pc(1046) int local1046;
		if (local308 != null) {
			local364 = local36.method4463();
			local308[0] = (byte) local364;
			for (local812 = 2; local812 < local308.length; local812 += 2) {
				local364 = local36.method4463() + local364 + 1;
				local308[local812] = (byte) local364;
			}
			local933 = local308[0];
			@Pc(937) byte local937 = local308[1];
			for (local939 = 0; local939 < local933; local939++) {
				this.aByteArray70[local939] = (byte) (this.aByteArray70[local939] * local937 + 32 >> 6);
			}
			for (local966 = 2; local966 < local308.length; local966 += 2) {
				local972 = local308[local966];
				@Pc(978) byte local978 = local308[local966 + 1];
				local992 = (local972 - local933) * local937 + (local972 - local933) / 2;
				for (local994 = local933; local994 < local972; local994++) {
					local1003 = Static452.method5603(local972 - local933, local992);
					this.aByteArray70[local994] = (byte) (local1003 * this.aByteArray70[local994] + 32 >> 6);
					local992 += local978 - local937;
				}
				local933 = local972;
				local937 = local978;
			}
			for (local1046 = local933; local1046 < 128; local1046++) {
				this.aByteArray70[local1046] = (byte) (local937 * this.aByteArray70[local1046] + 32 >> 6);
			}
		}
		@Pc(1114) int local1114;
		if (local324 != null) {
			local364 = local36.method4463();
			local324[0] = (byte) local364;
			for (local812 = 2; local812 < local324.length; local812 += 2) {
				local364 = local364 + local36.method4463() + 1;
				local324[local812] = (byte) local364;
			}
			local933 = local324[0];
			local1114 = local324[1] << 1;
			for (local939 = 0; local939 < local933; local939++) {
				local966 = (this.aByteArray68[local939] & 0xFF) + local1114;
				if (local966 < 0) {
					local966 = 0;
				}
				if (local966 > 128) {
					local966 = 128;
				}
				this.aByteArray68[local939] = (byte) local966;
			}
			@Pc(1169) int local1169;
			for (local966 = 2; local966 < local324.length; local966 += 2) {
				local972 = local324[local966];
				local1169 = local324[local966 + 1] << 1;
				local992 = (local972 - local933) / 2 + local1114 * (local972 - local933);
				for (local994 = local933; local994 < local972; local994++) {
					local1003 = Static452.method5603(local972 - local933, local992);
					@Pc(1205) int local1205 = (this.aByteArray68[local994] & 0xFF) + local1003;
					if (local1205 < 0) {
						local1205 = 0;
					}
					if (local1205 > 128) {
						local1205 = 128;
					}
					local992 += local1169 - local1114;
					this.aByteArray68[local994] = (byte) local1205;
				}
				local1114 = local1169;
				local933 = local972;
			}
			for (local1046 = local933; local1046 < 128; local1046++) {
				local1169 = local1114 + (this.aByteArray68[local1046] & 0xFF);
				if (local1169 < 0) {
					local1169 = 0;
				}
				if (local1169 > 128) {
					local1169 = 128;
				}
				this.aByteArray68[local1046] = (byte) local1169;
			}
		}
		for (local812 = 0; local812 < local187; local812++) {
			local234[local812].anInt3863 = local36.method4463();
		}
		for (local858 = 0; local858 < local187; local858++) {
			@Pc(1312) Class155 local1312 = local234[local858];
			if (local1312.aByteArray40 != null) {
				local1312.anInt3865 = local36.method4463();
			}
			if (local1312.aByteArray41 != null) {
				local1312.anInt3866 = local36.method4463();
			}
			if (local1312.anInt3863 > 0) {
				local1312.anInt3869 = local36.method4463();
			}
		}
		for (local1114 = 0; local1114 < local187; local1114++) {
			local234[local1114].anInt3868 = local36.method4463();
		}
		for (local939 = 0; local939 < local187; local939++) {
			@Pc(1366) Class155 local1366 = local234[local939];
			if (local1366.anInt3868 > 0) {
				local1366.anInt3867 = local36.method4463();
			}
		}
		for (local966 = 0; local966 < local187; local966++) {
			@Pc(1389) Class155 local1389 = local234[local966];
			if (local1389.anInt3867 > 0) {
				local1389.anInt3864 = local36.method4463();
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V")
	public void method4728() {
		this.anIntArray374 = null;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([BILclient!rt;[I)Z")
	public boolean method4732(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class219 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub28_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray374[local13];
				if (local25 != 0) {
					if (local9 != local25) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg1.method4566(local25 >> 2, arg2);
						} else {
							local11 = arg1.method4569(arg2, local25 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub28_Sub1Array1[local13] = local11;
						this.anIntArray374[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
