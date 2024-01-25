import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class6_Sub32 extends Class6 {

	@OriginalMember(owner = "client!os", name = "m", descriptor = "I")
	public int anInt7572;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!os", name = "o", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "[Lclient!sk;")
	public Class306[] aClass306Array1;

	@OriginalMember(owner = "client!os", name = "v", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!os", name = "w", descriptor = "[Lclient!ut;")
	public Class6_Sub37_Sub1[] aClass6_Sub37_Sub1Array1;

	@OriginalMember(owner = "client!os", name = "x", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!os", name = "y", descriptor = "[I")
	private int[] anIntArray462;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	private Class6_Sub32() {
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "([B)V")
	public Class6_Sub32(@OriginalArg(0) byte[] arg0) {
		this.anIntArray462 = new int[128];
		this.aByteArray85 = new byte[128];
		this.aByteArray87 = new byte[128];
		this.aByteArray86 = new byte[128];
		this.aClass306Array1 = new Class306[128];
		this.aClass6_Sub37_Sub1Array1 = new Class6_Sub37_Sub1[128];
		this.aShortArray93 = new short[128];
		@Pc(36) Class6_Sub40 local36 = new Class6_Sub40(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray113[local38 + local36.anInt10169] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method8602();
		}
		local38++;
		local36.anInt10169++;
		@Pc(80) int local80 = local36.anInt10169;
		local36.anInt10169 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray113[local36.anInt10169 + local88] != 0; local88++) {
		}
		@Pc(102) byte[] local102 = new byte[local88];
		for (@Pc(104) int local104 = 0; local104 < local88; local104++) {
			local102[local104] = local36.method8602();
		}
		local36.anInt10169++;
		local88++;
		@Pc(126) int local126 = local36.anInt10169;
		local36.anInt10169 += local88;
		@Pc(134) int local134;
		for (local134 = 0; local36.aByteArray113[local134 + local36.anInt10169] != 0; local134++) {
		}
		@Pc(148) byte[] local148 = new byte[local134];
		for (@Pc(150) int local150 = 0; local150 < local134; local150++) {
			local148[local150] = local36.method8602();
		}
		local134++;
		local36.anInt10169++;
		@Pc(176) byte[] local176 = new byte[local134];
		@Pc(183) int local183;
		@Pc(195) int local195;
		@Pc(201) int local201;
		if (local134 <= 1) {
			local183 = local134;
		} else {
			local176[1] = 1;
			@Pc(191) int local191 = 1;
			local183 = 2;
			for (local195 = 2; local195 < local134; local195++) {
				local201 = local36.method8604();
				if (local201 == 0) {
					local191 = local183++;
				} else {
					if (local201 <= local191) {
						local201--;
					}
					local191 = local201;
				}
				local176[local195] = (byte) local191;
			}
		}
		@Pc(233) Class306[] local233 = new Class306[local183];
		for (local195 = 0; local195 < local233.length; local195++) {
			@Pc(245) Class306 local245 = local233[local195] = new Class306();
			@Pc(249) int local249 = local36.method8604();
			if (local249 > 0) {
				local245.aByteArray102 = new byte[local249 * 2];
			}
			local249 = local36.method8604();
			if (local249 > 0) {
				local245.aByteArray103 = new byte[local249 * 2 + 2];
				local245.aByteArray103[1] = 64;
			}
		}
		local201 = local36.method8604();
		@Pc(298) byte[] local298 = local201 <= 0 ? null : new byte[local201 * 2];
		local201 = local36.method8604();
		@Pc(314) byte[] local314 = local201 > 0 ? new byte[local201 * 2] : null;
		@Pc(316) int local316;
		for (local316 = 0; local36.aByteArray113[local36.anInt10169 + local316] != 0; local316++) {
		}
		@Pc(331) byte[] local331 = new byte[local316];
		for (@Pc(333) int local333 = 0; local333 < local316; local333++) {
			local331[local333] = local36.method8602();
		}
		local36.anInt10169++;
		local316++;
		@Pc(358) int local358 = 0;
		for (@Pc(360) int local360 = 0; local360 < 128; local360++) {
			local358 += local36.method8604();
			this.aShortArray93[local360] = (short) local358;
		}
		local358 = 0;
		for (@Pc(384) int local384 = 0; local384 < 128; local384++) {
			local358 += local36.method8604();
			this.aShortArray93[local384] = (short) (this.aShortArray93[local384] + (local358 << 8));
		}
		@Pc(411) int local411 = 0;
		@Pc(413) int local413 = 0;
		@Pc(415) int local415 = 0;
		for (@Pc(417) int local417 = 0; local417 < 128; local417++) {
			if (local411 == 0) {
				if (local413 < local331.length) {
					local411 = local331[local413++];
				} else {
					local411 = -1;
				}
				local415 = local36.method8575();
			}
			this.aShortArray93[local417] = (short) (this.aShortArray93[local417] + ((local415 - 1 & 0x2) << 14));
			local411--;
			this.anIntArray462[local417] = local415;
		}
		local413 = 0;
		local411 = 0;
		@Pc(475) int local475 = 0;
		for (@Pc(477) int local477 = 0; local477 < 128; local477++) {
			if (this.anIntArray462[local477] != 0) {
				if (local411 == 0) {
					if (local52.length > local413) {
						local411 = local52[local413++];
					} else {
						local411 = -1;
					}
					local475 = local36.aByteArray113[local80++] - 1;
				}
				this.aByteArray87[local477] = (byte) local475;
				local411--;
			}
		}
		local411 = 0;
		local413 = 0;
		@Pc(533) int local533 = 0;
		for (@Pc(535) int local535 = 0; local535 < 128; local535++) {
			if (this.anIntArray462[local535] != 0) {
				if (local411 == 0) {
					local533 = local36.aByteArray113[local126++] + 16 << 2;
					if (local102.length <= local413) {
						local411 = -1;
					} else {
						local411 = local102[local413++];
					}
				}
				local411--;
				this.aByteArray85[local535] = (byte) local533;
			}
		}
		local413 = 0;
		local411 = 0;
		@Pc(594) Class306 local594 = null;
		for (@Pc(596) int local596 = 0; local596 < 128; local596++) {
			if (this.anIntArray462[local596] != 0) {
				if (local411 == 0) {
					local594 = local233[local176[local413]];
					if (local148.length <= local413) {
						local411 = -1;
					} else {
						local411 = local148[local413++];
					}
				}
				local411--;
				this.aClass306Array1[local596] = local594;
			}
		}
		local413 = 0;
		local411 = 0;
		@Pc(648) int local648 = 0;
		for (@Pc(650) int local650 = 0; local650 < 128; local650++) {
			if (local411 == 0) {
				if (local331.length > local413) {
					local411 = local331[local413++];
				} else {
					local411 = -1;
				}
				if (this.anIntArray462[local650] > 0) {
					local648 = local36.method8604() + 1;
				}
			}
			this.aByteArray86[local650] = (byte) local648;
			local411--;
		}
		this.anInt7572 = local36.method8604() + 1;
		@Pc(718) int local718;
		for (@Pc(707) int local707 = 0; local707 < local183; local707++) {
			@Pc(713) Class306 local713 = local233[local707];
			if (local713.aByteArray102 != null) {
				for (local718 = 1; local718 < local713.aByteArray102.length; local718 += 2) {
					local713.aByteArray102[local718] = local36.method8602();
				}
			}
			if (local713.aByteArray103 != null) {
				for (local718 = 3; local718 < local713.aByteArray103.length - 2; local718 += 2) {
					local713.aByteArray103[local718] = local36.method8602();
				}
			}
		}
		@Pc(771) int local771;
		if (local298 != null) {
			for (local771 = 1; local771 < local298.length; local771 += 2) {
				local298[local771] = local36.method8602();
			}
		}
		if (local314 != null) {
			for (local771 = 1; local771 < local314.length; local771 += 2) {
				local314[local771] = local36.method8602();
			}
		}
		@Pc(820) int local820;
		for (local771 = 0; local771 < local183; local771++) {
			@Pc(813) Class306 local813 = local233[local771];
			if (local813.aByteArray103 != null) {
				local358 = 0;
				for (local820 = 2; local820 < local813.aByteArray103.length; local820 += 2) {
					local358 = local36.method8604() + local358 + 1;
					local813.aByteArray103[local820] = (byte) local358;
				}
			}
		}
		@Pc(861) int local861;
		for (local718 = 0; local718 < local183; local718++) {
			@Pc(854) Class306 local854 = local233[local718];
			if (local854.aByteArray102 != null) {
				local358 = 0;
				for (local861 = 2; local861 < local854.aByteArray102.length; local861 += 2) {
					local358 = local36.method8604() + local358 + 1;
					local854.aByteArray102[local861] = (byte) local358;
				}
			}
		}
		@Pc(942) int local942;
		@Pc(965) int local965;
		@Pc(971) byte local971;
		@Pc(990) int local990;
		@Pc(992) int local992;
		@Pc(1001) int local1001;
		@Pc(936) byte local936;
		@Pc(1042) int local1042;
		if (local298 != null) {
			local358 = local36.method8604();
			local298[0] = (byte) local358;
			for (local820 = 2; local820 < local298.length; local820 += 2) {
				local358 = local36.method8604() + local358 + 1;
				local298[local820] = (byte) local358;
			}
			local936 = local298[0];
			@Pc(940) byte local940 = local298[1];
			for (local942 = 0; local942 < local936; local942++) {
				this.aByteArray86[local942] = (byte) (this.aByteArray86[local942] * local940 + 32 >> 6);
			}
			for (local965 = 2; local965 < local298.length; local965 += 2) {
				local971 = local298[local965];
				@Pc(977) byte local977 = local298[local965 + 1];
				local990 = (local971 - local936) * local940 + (local971 - local936) / 2;
				for (local992 = local936; local992 < local971; local992++) {
					local1001 = Static252.method4533(local971 - local936, local990);
					local990 += local977 - local940;
					this.aByteArray86[local992] = (byte) (local1001 * this.aByteArray86[local992] + 32 >> 6);
				}
				local940 = local977;
				local936 = local971;
			}
			for (local1042 = local936; local1042 < 128; local1042++) {
				this.aByteArray86[local1042] = (byte) (this.aByteArray86[local1042] * local940 + 32 >> 6);
			}
		}
		@Pc(1109) int local1109;
		if (local314 != null) {
			local358 = local36.method8604();
			local314[0] = (byte) local358;
			for (local820 = 2; local820 < local314.length; local820 += 2) {
				local358 = local358 + local36.method8604() + 1;
				local314[local820] = (byte) local358;
			}
			local936 = local314[0];
			local1109 = local314[1] << 1;
			for (local942 = 0; local942 < local936; local942++) {
				local965 = local1109 + (this.aByteArray85[local942] & 0xFF);
				if (local965 < 0) {
					local965 = 0;
				}
				if (local965 > 128) {
					local965 = 128;
				}
				this.aByteArray85[local942] = (byte) local965;
			}
			local965 = 2;
			@Pc(1162) int local1162;
			while (local314.length > local965) {
				local971 = local314[local965];
				local1162 = local314[local965 + 1] << 1;
				local990 = (local971 - local936) * local1109 + (local971 - local936) / 2;
				for (local992 = local936; local992 < local971; local992++) {
					local1001 = Static252.method4533(local971 - local936, local990);
					@Pc(1196) int local1196 = local1001 + (this.aByteArray85[local992] & 0xFF);
					if (local1196 < 0) {
						local1196 = 0;
					}
					if (local1196 > 128) {
						local1196 = 128;
					}
					local990 += local1162 - local1109;
					this.aByteArray85[local992] = (byte) local1196;
				}
				local1109 = local1162;
				local965 += 2;
				local936 = local971;
			}
			for (local1042 = local936; local1042 < 128; local1042++) {
				local1162 = (this.aByteArray85[local1042] & 0xFF) + local1109;
				if (local1162 < 0) {
					local1162 = 0;
				}
				if (local1162 > 128) {
					local1162 = 128;
				}
				this.aByteArray85[local1042] = (byte) local1162;
			}
		}
		for (local820 = 0; local820 < local183; local820++) {
			local233[local820].anInt9114 = local36.method8604();
		}
		for (local861 = 0; local861 < local183; local861++) {
			@Pc(1313) Class306 local1313 = local233[local861];
			if (local1313.aByteArray102 != null) {
				local1313.anInt9116 = local36.method8604();
			}
			if (local1313.aByteArray103 != null) {
				local1313.anInt9111 = local36.method8604();
			}
			if (local1313.anInt9114 > 0) {
				local1313.anInt9115 = local36.method8604();
			}
		}
		for (local1109 = 0; local1109 < local183; local1109++) {
			local233[local1109].anInt9118 = local36.method8604();
		}
		for (local942 = 0; local942 < local183; local942++) {
			@Pc(1364) Class306 local1364 = local233[local942];
			if (local1364.anInt9118 > 0) {
				local1364.anInt9112 = local36.method8604();
			}
		}
		for (local965 = 0; local965 < local183; local965++) {
			@Pc(1391) Class306 local1391 = local233[local965];
			if (local1391.anInt9112 > 0) {
				local1391.anInt9113 = local36.method8604();
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	public void method6533() {
		this.anIntArray462 = null;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([IILclient!pea;[B)Z")
	public boolean method6535(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class253 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class6_Sub37_Sub1 local11 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg2 == null || arg2[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray462[local19];
				if (local34 != 0) {
					if (local34 != local9) {
						local9 = local34--;
						if ((local34 & 0x1) == 0) {
							local11 = arg1.method6733(arg0, local34 >> 2);
						} else {
							local11 = arg1.method6730(local34 >> 2, arg0);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass6_Sub37_Sub1Array1[local19] = local11;
						this.anIntArray462[local19] = 0;
					}
				}
			}
		}
		return local7;
	}
}
