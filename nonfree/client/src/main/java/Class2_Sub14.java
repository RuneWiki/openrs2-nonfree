import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!h", name = "u", descriptor = "I")
	public int anInt1992;

	@OriginalMember(owner = "client!h", name = "w", descriptor = "[B")
	public byte[] aByteArray18 = new byte[128];

	@OriginalMember(owner = "client!h", name = "y", descriptor = "[S")
	public short[] aShortArray38 = new short[128];

	@OriginalMember(owner = "client!h", name = "z", descriptor = "[Lclient!uf;")
	public Class170[] aClass170Array1 = new Class170[128];

	@OriginalMember(owner = "client!h", name = "A", descriptor = "[I")
	private int[] anIntArray145 = new int[128];

	@OriginalMember(owner = "client!h", name = "B", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!h", name = "C", descriptor = "[Lclient!id;")
	public Class2_Sub9_Sub1[] aClass2_Sub9_Sub1Array1 = new Class2_Sub9_Sub1[128];

	@OriginalMember(owner = "client!h", name = "G", descriptor = "[B")
	public byte[] aByteArray20 = new byte[128];

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "([B)V")
	public Class2_Sub14(@OriginalArg(0) byte[] arg0) {
		@Pc(29) int local29 = 0;
		this.aByteArray19 = new byte[128];
		@Pc(38) Class2_Sub26 local38 = new Class2_Sub26(arg0);
		while (local38.aByteArray72[local38.anInt5328 + local29] != 0) {
			local29++;
		}
		@Pc(54) byte[] local54 = new byte[local29];
		@Pc(56) int local56;
		for (local56 = 0; local56 < local29; local56++) {
			local54[local56] = local38.method4220();
		}
		local38.anInt5328++;
		local29++;
		local56 = local38.anInt5328;
		local38.anInt5328 += local29;
		@Pc(86) int local86;
		for (local86 = 0; local38.aByteArray72[local38.anInt5328 + local86] != 0; local86++) {
		}
		@Pc(102) byte[] local102 = new byte[local86];
		@Pc(104) int local104;
		for (local104 = 0; local104 < local86; local104++) {
			local102[local104] = local38.method4220();
		}
		@Pc(118) int local118 = 0;
		local86++;
		local38.anInt5328++;
		local104 = local38.anInt5328;
		local38.anInt5328 += local86;
		while (local38.aByteArray72[local118 + local38.anInt5328] != 0) {
			local118++;
		}
		@Pc(151) byte[] local151 = new byte[local118];
		for (@Pc(153) int local153 = 0; local153 < local118; local153++) {
			local151[local153] = local38.method4220();
		}
		local118++;
		local38.anInt5328++;
		@Pc(175) byte[] local175 = new byte[local118];
		@Pc(186) int local186;
		@Pc(188) int local188;
		if (local118 > 1) {
			local175[1] = 1;
			@Pc(184) int local184 = 1;
			local186 = 2;
			for (local188 = 2; local188 < local118; local188++) {
				@Pc(195) int local195 = local38.method4261();
				if (local195 == 0) {
					local184 = local186++;
				} else {
					if (local184 >= local195) {
						local195--;
					}
					local184 = local195;
				}
				local175[local188] = (byte) local184;
			}
		} else {
			local186 = local118;
		}
		@Pc(227) Class170[] local227 = new Class170[local186];
		for (local188 = 0; local188 < local227.length; local188++) {
			@Pc(245) Class170 local245 = local227[local188] = new Class170();
			@Pc(249) int local249 = local38.method4261();
			if (local249 > 0) {
				local245.aByteArray73 = new byte[local249 * 2];
			}
			local249 = local38.method4261();
			if (local249 > 0) {
				local245.aByteArray74 = new byte[local249 * 2 + 2];
				local245.aByteArray74[1] = 64;
			}
		}
		local188 = local38.method4261();
		@Pc(300) byte[] local300 = local188 > 0 ? new byte[local188 * 2] : null;
		@Pc(302) int local302 = 0;
		local188 = local38.method4261();
		while (local38.aByteArray72[local38.anInt5328 + local302] != 0) {
			local302++;
		}
		@Pc(329) byte[] local329 = local188 <= 0 ? null : new byte[local188 * 2];
		@Pc(332) byte[] local332 = new byte[local302];
		@Pc(334) int local334;
		for (local334 = 0; local334 < local302; local334++) {
			local332[local334] = local38.method4220();
		}
		local38.anInt5328++;
		local302++;
		local334 = 0;
		@Pc(357) int local357;
		for (local357 = 0; local357 < 128; local357++) {
			local334 += local38.method4261();
			this.aShortArray38[local357] = (short) local334;
		}
		local334 = 0;
		for (local357 = 0; local357 < 128; local357++) {
			local334 += local38.method4261();
			this.aShortArray38[local357] = (short) (this.aShortArray38[local357] + (local334 << 8));
		}
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		local357 = 0;
		@Pc(414) int local414;
		for (local414 = 0; local414 < 128; local414++) {
			if (local357 == 0) {
				if (local408 < local332.length) {
					local357 = local332[local408++];
				} else {
					local357 = -1;
				}
				local410 = local38.method4251();
			}
			this.aShortArray38[local414] = (short) (this.aShortArray38[local414] + ((local410 - 1 & 0x2) << 14));
			local357--;
			this.anIntArray145[local414] = local410;
		}
		local408 = 0;
		local357 = 0;
		local414 = 0;
		@Pc(475) int local475;
		for (local475 = 0; local475 < 128; local475++) {
			if (this.anIntArray145[local475] != 0) {
				if (local357 == 0) {
					local414 = local38.aByteArray72[local56++] - 1;
					if (local54.length <= local408) {
						local357 = -1;
					} else {
						local357 = local54[local408++];
					}
				}
				local357--;
				this.aByteArray19[local475] = (byte) local414;
			}
		}
		local357 = 0;
		local475 = 0;
		local408 = 0;
		for (@Pc(530) int local530 = 0; local530 < 128; local530++) {
			if (this.anIntArray145[local530] != 0) {
				if (local357 == 0) {
					if (local102.length <= local408) {
						local357 = -1;
					} else {
						local357 = local102[local408++];
					}
					local475 = local38.aByteArray72[local104++] + 16 << 2;
				}
				this.aByteArray18[local530] = (byte) local475;
				local357--;
			}
		}
		local408 = 0;
		@Pc(590) Class170 local590 = null;
		local357 = 0;
		@Pc(594) int local594;
		for (local594 = 0; local594 < 128; local594++) {
			if (this.anIntArray145[local594] != 0) {
				if (local357 == 0) {
					local590 = local227[local175[local408]];
					if (local408 >= local151.length) {
						local357 = -1;
					} else {
						local357 = local151[local408++];
					}
				}
				local357--;
				this.aClass170Array1[local594] = local590;
			}
		}
		local357 = 0;
		local408 = 0;
		local594 = 0;
		@Pc(651) int local651;
		for (local651 = 0; local651 < 128; local651++) {
			if (local357 == 0) {
				if (local408 < local332.length) {
					local357 = local332[local408++];
				} else {
					local357 = -1;
				}
				if (this.anIntArray145[local651] > 0) {
					local594 = local38.method4261() + 1;
				}
			}
			local357--;
			this.aByteArray20[local651] = (byte) local594;
		}
		this.anInt1992 = local38.method4261() + 1;
		@Pc(720) Class170 local720;
		@Pc(726) int local726;
		for (local651 = 0; local651 < local186; local651++) {
			local720 = local227[local651];
			if (local720.aByteArray73 != null) {
				for (local726 = 1; local726 < local720.aByteArray73.length; local726 += 2) {
					local720.aByteArray73[local726] = local38.method4220();
				}
			}
			if (local720.aByteArray74 != null) {
				for (local726 = 3; local726 < local720.aByteArray74.length - 2; local726 += 2) {
					local720.aByteArray74[local726] = local38.method4220();
				}
			}
		}
		if (local300 != null) {
			for (local651 = 1; local651 < local300.length; local651 += 2) {
				local300[local651] = local38.method4220();
			}
		}
		if (local329 != null) {
			for (local651 = 1; local651 < local329.length; local651 += 2) {
				local329[local651] = local38.method4220();
			}
		}
		for (local651 = 0; local651 < local186; local651++) {
			local720 = local227[local651];
			if (local720.aByteArray74 != null) {
				local334 = 0;
				for (local726 = 2; local726 < local720.aByteArray74.length; local726 += 2) {
					local334 = local38.method4261() + local334 + 1;
					local720.aByteArray74[local726] = (byte) local334;
				}
			}
		}
		for (local651 = 0; local651 < local186; local651++) {
			local720 = local227[local651];
			if (local720.aByteArray73 != null) {
				local334 = 0;
				for (local726 = 2; local726 < local720.aByteArray73.length; local726 += 2) {
					local334 = local38.method4261() + local334 + 1;
					local720.aByteArray73[local726] = (byte) local334;
				}
			}
		}
		@Pc(982) byte local982;
		@Pc(996) int local996;
		@Pc(1004) int local1004;
		@Pc(1019) int local1019;
		@Pc(1053) int local1053;
		@Pc(937) byte local937;
		if (local300 != null) {
			local334 = local38.method4261();
			local300[0] = (byte) local334;
			for (local651 = 2; local651 < local300.length; local651 += 2) {
				local334 -= -local38.method4261() - 1;
				local300[local651] = (byte) local334;
			}
			local937 = local300[0];
			@Pc(941) byte local941 = local300[1];
			for (local726 = 0; local726 < local937; local726++) {
				this.aByteArray20[local726] = (byte) (local941 * this.aByteArray20[local726] + 32 >> 6);
			}
			local726 = 2;
			while (local726 < local300.length) {
				local982 = local300[local726];
				local996 = (local982 - local937) / 2 + local941 * (local982 - local937);
				@Pc(1002) byte local1002 = local300[local726 + 1];
				for (local1004 = local937; local1004 < local982; local1004++) {
					local1019 = Static11.method256(local996, local982 - local937);
					this.aByteArray20[local1004] = (byte) (this.aByteArray20[local1004] * local1019 + 32 >> 6);
					local996 += local1002 - local941;
				}
				local937 = local982;
				local726 += 2;
				local941 = local1002;
			}
			for (local1053 = local937; local1053 < 128; local1053++) {
				this.aByteArray20[local1053] = (byte) (this.aByteArray20[local1053] * local941 + 32 >> 6);
			}
		}
		if (local329 != null) {
			local334 = local38.method4261();
			local329[0] = (byte) local334;
			for (local651 = 2; local651 < local329.length; local651 += 2) {
				local334 = local334 + local38.method4261() + 1;
				local329[local651] = (byte) local334;
			}
			local937 = local329[0];
			@Pc(1125) int local1125 = local329[1] << 1;
			for (local726 = 0; local726 < local937; local726++) {
				local1053 = local1125 + (this.aByteArray18[local726] & 0xFF);
				if (local1053 < 0) {
					local1053 = 0;
				}
				if (local1053 > 128) {
					local1053 = 128;
				}
				this.aByteArray18[local726] = (byte) local1053;
			}
			local726 = 2;
			@Pc(1178) int local1178;
			while (local726 < local329.length) {
				local1178 = local329[local726 + 1] << 1;
				local982 = local329[local726];
				local726 += 2;
				local996 = (local982 - local937) / 2 + (local982 - local937) * local1125;
				for (local1004 = local937; local1004 < local982; local1004++) {
					local1019 = Static11.method256(local996, local982 - local937);
					@Pc(1219) int local1219 = local1019 + (this.aByteArray18[local1004] & 0xFF);
					if (local1219 < 0) {
						local1219 = 0;
					}
					local996 += local1178 - local1125;
					if (local1219 > 128) {
						local1219 = 128;
					}
					this.aByteArray18[local1004] = (byte) local1219;
				}
				local1125 = local1178;
				local937 = local982;
			}
			for (local1053 = local937; local1053 < 128; local1053++) {
				local1178 = local1125 + (this.aByteArray18[local1053] & 0xFF);
				if (local1178 < 0) {
					local1178 = 0;
				}
				if (local1178 > 128) {
					local1178 = 128;
				}
				this.aByteArray18[local1053] = (byte) local1178;
			}
		}
		for (local651 = 0; local651 < local186; local651++) {
			local227[local651].anInt5496 = local38.method4261();
		}
		for (local651 = 0; local651 < local186; local651++) {
			local720 = local227[local651];
			if (local720.aByteArray73 != null) {
				local720.anInt5493 = local38.method4261();
			}
			if (local720.aByteArray74 != null) {
				local720.anInt5495 = local38.method4261();
			}
			if (local720.anInt5496 > 0) {
				local720.anInt5499 = local38.method4261();
			}
		}
		for (local651 = 0; local651 < local186; local651++) {
			local227[local651].anInt5504 = local38.method4261();
		}
		for (local651 = 0; local651 < local186; local651++) {
			local720 = local227[local651];
			if (local720.anInt5504 > 0) {
				local720.anInt5497 = local38.method4261();
			}
		}
		for (local651 = 0; local651 < local186; local651++) {
			local720 = local227[local651];
			if (local720.anInt5497 > 0) {
				local720.anInt5501 = local38.method4261();
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	public void method1685() {
		this.anIntArray145 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([BLclient!ed;[II)Z")
	public boolean method1686(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class2_Sub9_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(34) int local34 = this.anIntArray145[local18];
				if (local34 != 0) {
					if (local34 != local14) {
						local14 = local34--;
						if ((local34 & 0x1) == 0) {
							local16 = arg1.method1083(arg2, local34 >> 2);
						} else {
							local16 = arg1.method1086(local34 >> 2, arg2);
						}
						if (local16 == null) {
							local12 = false;
						}
					}
					if (local16 != null) {
						this.aClass2_Sub9_Sub1Array1[local18] = local16;
						this.anIntArray145[local18] = 0;
					}
				}
			}
		}
		return local12;
	}
}
