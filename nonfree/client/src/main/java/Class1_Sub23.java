import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "[B")
	public byte[] aByteArray41 = new byte[128];

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "[B")
	public byte[] aByteArray42 = new byte[128];

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "[I")
	private int[] anIntArray302;

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "[Lclient!fn;")
	public Class1_Sub5_Sub1[] aClass1_Sub5_Sub1Array1;

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
	public int anInt3629;

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "[Lclient!tc;")
	public Class168[] aClass168Array1;

	@OriginalMember(owner = "client!nj", name = "C", descriptor = "[S")
	public short[] aShortArray65 = new short[128];

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([B)V")
	public Class1_Sub23(@OriginalArg(0) byte[] arg0) {
		@Pc(17) int local17 = 0;
		this.anIntArray302 = new int[128];
		this.aClass168Array1 = new Class168[128];
		this.aByteArray43 = new byte[128];
		this.aClass1_Sub5_Sub1Array1 = new Class1_Sub5_Sub1[128];
		@Pc(38) Class1_Sub14 local38 = new Class1_Sub14(arg0);
		while (local38.aByteArray17[local38.anInt1480 + local17] != 0) {
			local17++;
		}
		@Pc(55) byte[] local55 = new byte[local17];
		@Pc(57) int local57;
		for (local57 = 0; local57 < local17; local57++) {
			local55[local57] = local38.method1363();
		}
		local38.anInt1480++;
		local17++;
		local57 = local38.anInt1480;
		local38.anInt1480 += local17;
		@Pc(87) int local87;
		for (local87 = 0; local38.aByteArray17[local38.anInt1480 + local87] != 0; local87++) {
		}
		@Pc(102) byte[] local102 = new byte[local87];
		@Pc(104) int local104;
		for (local104 = 0; local104 < local87; local104++) {
			local102[local104] = local38.method1363();
		}
		local87++;
		local38.anInt1480++;
		local104 = local38.anInt1480;
		local38.anInt1480 += local87;
		@Pc(138) int local138;
		for (local138 = 0; local38.aByteArray17[local38.anInt1480 + local138] != 0; local138++) {
		}
		@Pc(155) byte[] local155 = new byte[local138];
		for (@Pc(157) int local157 = 0; local157 < local138; local157++) {
			local155[local157] = local38.method1363();
		}
		local138++;
		local38.anInt1480++;
		@Pc(179) byte[] local179 = new byte[local138];
		@Pc(184) int local184;
		@Pc(192) int local192;
		if (local138 > 1) {
			local184 = 2;
			local179[1] = 1;
			@Pc(190) int local190 = 1;
			for (local192 = 2; local192 < local138; local192++) {
				@Pc(203) int local203 = local38.method1378();
				if (local203 == 0) {
					local190 = local184++;
				} else {
					if (local203 <= local190) {
						local203--;
					}
					local190 = local203;
				}
				local179[local192] = (byte) local190;
			}
		} else {
			local184 = local138;
		}
		@Pc(235) Class168[] local235 = new Class168[local184];
		for (local192 = 0; local192 < local235.length; local192++) {
			@Pc(249) Class168 local249 = local235[local192] = new Class168();
			@Pc(253) int local253 = local38.method1378();
			if (local253 > 0) {
				local249.aByteArray71 = new byte[local253 * 2];
			}
			local253 = local38.method1378();
			if (local253 > 0) {
				local249.aByteArray70 = new byte[local253 * 2 + 2];
				local249.aByteArray70[1] = 64;
			}
		}
		local192 = local38.method1378();
		@Pc(300) byte[] local300 = local192 <= 0 ? null : new byte[local192 * 2];
		local192 = local38.method1378();
		@Pc(316) byte[] local316 = local192 > 0 ? new byte[local192 * 2] : null;
		@Pc(318) int local318;
		for (local318 = 0; local38.aByteArray17[local318 + local38.anInt1480] != 0; local318++) {
		}
		@Pc(335) byte[] local335 = new byte[local318];
		@Pc(337) int local337;
		for (local337 = 0; local337 < local318; local337++) {
			local335[local337] = local38.method1363();
		}
		local318++;
		local38.anInt1480++;
		local337 = 0;
		@Pc(360) int local360;
		for (local360 = 0; local360 < 128; local360++) {
			local337 += local38.method1378();
			this.aShortArray65[local360] = (short) local337;
		}
		local337 = 0;
		for (local360 = 0; local360 < 128; local360++) {
			local337 += local38.method1378();
			this.aShortArray65[local360] = (short) (this.aShortArray65[local360] + (local337 << 8));
		}
		@Pc(411) int local411 = 0;
		@Pc(413) int local413 = 0;
		local360 = 0;
		@Pc(417) int local417;
		for (local417 = 0; local417 < 128; local417++) {
			if (local360 == 0) {
				if (local335.length > local411) {
					local360 = local335[local411++];
				} else {
					local360 = -1;
				}
				local413 = local38.method1350();
			}
			this.aShortArray65[local417] = (short) (this.aShortArray65[local417] + ((local413 - 1 & 0x2) << 14));
			local360--;
			this.anIntArray302[local417] = local413;
		}
		local360 = 0;
		local411 = 0;
		local417 = 0;
		@Pc(473) int local473;
		for (local473 = 0; local473 < 128; local473++) {
			if (this.anIntArray302[local473] != 0) {
				if (local360 == 0) {
					local417 = local38.aByteArray17[local57++] - 1;
					if (local55.length > local411) {
						local360 = local55[local411++];
					} else {
						local360 = -1;
					}
				}
				local360--;
				this.aByteArray41[local473] = (byte) local417;
			}
		}
		local411 = 0;
		local473 = 0;
		local360 = 0;
		for (@Pc(528) int local528 = 0; local528 < 128; local528++) {
			if (this.anIntArray302[local528] != 0) {
				if (local360 == 0) {
					local473 = local38.aByteArray17[local104++] + 16 << 2;
					if (local102.length <= local411) {
						local360 = -1;
					} else {
						local360 = local102[local411++];
					}
				}
				local360--;
				this.aByteArray42[local528] = (byte) local473;
			}
		}
		local360 = 0;
		local411 = 0;
		@Pc(581) Class168 local581 = null;
		@Pc(583) int local583;
		for (local583 = 0; local583 < 128; local583++) {
			if (this.anIntArray302[local583] != 0) {
				if (local360 == 0) {
					local581 = local235[local179[local411]];
					if (local155.length > local411) {
						local360 = local155[local411++];
					} else {
						local360 = -1;
					}
				}
				this.aClass168Array1[local583] = local581;
				local360--;
			}
		}
		local360 = 0;
		local583 = 0;
		local411 = 0;
		@Pc(636) int local636;
		for (local636 = 0; local636 < 128; local636++) {
			if (local360 == 0) {
				if (local411 < local335.length) {
					local360 = local335[local411++];
				} else {
					local360 = -1;
				}
				if (this.anIntArray302[local636] > 0) {
					local583 = local38.method1378() + 1;
				}
			}
			this.aByteArray43[local636] = (byte) local583;
			local360--;
		}
		this.anInt3629 = local38.method1378() + 1;
		@Pc(692) Class168 local692;
		@Pc(697) int local697;
		for (local636 = 0; local636 < local184; local636++) {
			local692 = local235[local636];
			if (local692.aByteArray71 != null) {
				for (local697 = 1; local697 < local692.aByteArray71.length; local697 += 2) {
					local692.aByteArray71[local697] = local38.method1363();
				}
			}
			if (local692.aByteArray70 != null) {
				for (local697 = 3; local697 < local692.aByteArray70.length - 2; local697 += 2) {
					local692.aByteArray70[local697] = local38.method1363();
				}
			}
		}
		if (local300 != null) {
			for (local636 = 1; local636 < local300.length; local636 += 2) {
				local300[local636] = local38.method1363();
			}
		}
		if (local316 != null) {
			for (local636 = 1; local636 < local316.length; local636 += 2) {
				local316[local636] = local38.method1363();
			}
		}
		for (local636 = 0; local636 < local184; local636++) {
			local692 = local235[local636];
			if (local692.aByteArray70 != null) {
				local337 = 0;
				for (local697 = 2; local697 < local692.aByteArray70.length; local697 += 2) {
					local337 -= -local38.method1378() - 1;
					local692.aByteArray70[local697] = (byte) local337;
				}
			}
		}
		for (local636 = 0; local636 < local184; local636++) {
			local692 = local235[local636];
			if (local692.aByteArray71 != null) {
				local337 = 0;
				for (local697 = 2; local697 < local692.aByteArray71.length; local697 += 2) {
					local337 = local38.method1378() + local337 + 1;
					local692.aByteArray71[local697] = (byte) local337;
				}
			}
		}
		@Pc(961) byte local961;
		@Pc(974) int local974;
		@Pc(976) int local976;
		@Pc(987) int local987;
		@Pc(1023) int local1023;
		@Pc(910) byte local910;
		if (local300 != null) {
			local337 = local38.method1378();
			local300[0] = (byte) local337;
			for (local636 = 2; local636 < local300.length; local636 += 2) {
				local337 = local337 + local38.method1378() + 1;
				local300[local636] = (byte) local337;
			}
			local910 = local300[0];
			@Pc(914) byte local914 = local300[1];
			for (local697 = 0; local697 < local910; local697++) {
				this.aByteArray43[local697] = (byte) (this.aByteArray43[local697] * local914 + 32 >> 6);
			}
			local697 = 2;
			while (local300.length > local697) {
				@Pc(957) byte local957 = local300[local697 + 1];
				local961 = local300[local697];
				local974 = local914 * (local961 - local910) + (local961 - local910) / 2;
				for (local976 = local910; local976 < local961; local976++) {
					local987 = Static210.method3345(local961 - local910, local974);
					local974 += local957 - local914;
					this.aByteArray43[local976] = (byte) (local987 * this.aByteArray43[local976] + 32 >> 6);
				}
				local697 += 2;
				local910 = local961;
				local914 = local957;
			}
			for (local1023 = local910; local1023 < 128; local1023++) {
				this.aByteArray43[local1023] = (byte) (this.aByteArray43[local1023] * local914 + 32 >> 6);
			}
		}
		if (local316 != null) {
			local337 = local38.method1378();
			local316[0] = (byte) local337;
			for (local636 = 2; local636 < local316.length; local636 += 2) {
				local337 -= -local38.method1378() - 1;
				local316[local636] = (byte) local337;
			}
			local910 = local316[0];
			@Pc(1089) int local1089 = local316[1] << 1;
			for (local697 = 0; local697 < local910; local697++) {
				local1023 = local1089 + (this.aByteArray42[local697] & 0xFF);
				if (local1023 < 0) {
					local1023 = 0;
				}
				if (local1023 > 128) {
					local1023 = 128;
				}
				this.aByteArray42[local697] = (byte) local1023;
			}
			local697 = 2;
			@Pc(1137) int local1137;
			while (local697 < local316.length) {
				local1137 = local316[local697 + 1] << 1;
				local961 = local316[local697];
				local974 = (local961 - local910) / 2 + local1089 * (local961 - local910);
				for (local976 = local910; local976 < local961; local976++) {
					local987 = Static210.method3345(local961 - local910, local974);
					local974 += local1137 - local1089;
					@Pc(1183) int local1183 = local987 + (this.aByteArray42[local976] & 0xFF);
					if (local1183 < 0) {
						local1183 = 0;
					}
					if (local1183 > 128) {
						local1183 = 128;
					}
					this.aByteArray42[local976] = (byte) local1183;
				}
				local910 = local961;
				local697 += 2;
				local1089 = local1137;
			}
			for (local1023 = local910; local1023 < 128; local1023++) {
				local1137 = local1089 + (this.aByteArray42[local1023] & 0xFF);
				if (local1137 < 0) {
					local1137 = 0;
				}
				if (local1137 > 128) {
					local1137 = 128;
				}
				this.aByteArray42[local1023] = (byte) local1137;
			}
		}
		for (local636 = 0; local636 < local184; local636++) {
			local235[local636].anInt4877 = local38.method1378();
		}
		for (local636 = 0; local636 < local184; local636++) {
			local692 = local235[local636];
			if (local692.aByteArray71 != null) {
				local692.anInt4874 = local38.method1378();
			}
			if (local692.aByteArray70 != null) {
				local692.anInt4875 = local38.method1378();
			}
			if (local692.anInt4877 > 0) {
				local692.anInt4871 = local38.method1378();
			}
		}
		for (local636 = 0; local636 < local184; local636++) {
			local235[local636].anInt4876 = local38.method1378();
		}
		for (local636 = 0; local636 < local184; local636++) {
			local692 = local235[local636];
			if (local692.anInt4876 > 0) {
				local692.anInt4872 = local38.method1378();
			}
		}
		for (local636 = 0; local636 < local184; local636++) {
			local692 = local235[local636];
			if (local692.anInt4872 > 0) {
				local692.anInt4873 = local38.method1378();
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	public void method3103() {
		this.anIntArray302 = null;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!fi;I[I[B)Z")
	public boolean method3104(@OriginalArg(0) Class51 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(5) int local5 = 0;
		@Pc(16) Class1_Sub5_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(39) int local39 = this.anIntArray302[local18];
				if (local39 != 0) {
					if (local39 != local5) {
						local5 = local39--;
						if ((local39 & 0x1) == 0) {
							local16 = arg0.method1564(local39 >> 2, arg1);
						} else {
							local16 = arg0.method1563(arg1, local39 >> 2);
						}
						if (local16 == null) {
							local3 = false;
						}
					}
					if (local16 != null) {
						this.aClass1_Sub5_Sub1Array1[local18] = local16;
						this.anIntArray302[local18] = 0;
					}
				}
			}
		}
		return local3;
	}
}
