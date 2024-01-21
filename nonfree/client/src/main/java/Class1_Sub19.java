import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!re", name = "p", descriptor = "[I")
	private int[] anIntArray351;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "[Lclient!ai;")
	public final Class1_Sub4_Sub1[] aClass1_Sub4_Sub1Array1 = new Class1_Sub4_Sub1[128];

	@OriginalMember(owner = "client!re", name = "t", descriptor = "[Lclient!rd;")
	public final Class76[] aClass76Array1 = new Class76[128];

	@OriginalMember(owner = "client!re", name = "u", descriptor = "[S")
	public final short[] aShortArray42 = new short[128];

	@OriginalMember(owner = "client!re", name = "y", descriptor = "I")
	public final int anInt3592;

	@OriginalMember(owner = "client!re", name = "A", descriptor = "[B")
	public final byte[] aByteArray35 = new byte[128];

	@OriginalMember(owner = "client!re", name = "B", descriptor = "[B")
	public final byte[] aByteArray36 = new byte[128];

	@OriginalMember(owner = "client!re", name = "J", descriptor = "[B")
	public final byte[] aByteArray37 = new byte[128];

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "([B)V")
	public Class1_Sub19(@OriginalArg(0) byte[] arg0) {
		@Pc(29) int local29 = 0;
		this.anIntArray351 = new int[128];
		@Pc(38) Class1_Sub8 local38 = new Class1_Sub8(arg0);
		while (local38.aByteArray27[local29 + local38.anInt2195] != 0) {
			local29++;
		}
		@Pc(55) byte[] local55 = new byte[local29];
		for (@Pc(57) int local57 = 0; local57 < local29; local57++) {
			local55[local57] = local38.method1611();
		}
		local29++;
		local38.anInt2195++;
		@Pc(79) int local79 = local38.anInt2195;
		@Pc(81) int local81 = 0;
		local38.anInt2195 += local29;
		while (local38.aByteArray27[local38.anInt2195 + local81] != 0) {
			local81++;
		}
		@Pc(104) byte[] local104 = new byte[local81];
		for (@Pc(106) int local106 = 0; local106 < local81; local106++) {
			local104[local106] = local38.method1611();
		}
		local81++;
		local38.anInt2195++;
		@Pc(132) int local132 = local38.anInt2195;
		@Pc(134) int local134 = 0;
		local38.anInt2195 += local81;
		while (local38.aByteArray27[local134 + local38.anInt2195] != 0) {
			local134++;
		}
		@Pc(154) byte[] local154 = new byte[local134];
		for (@Pc(156) int local156 = 0; local156 < local134; local156++) {
			local154[local156] = local38.method1611();
		}
		local134++;
		local38.anInt2195++;
		@Pc(182) byte[] local182 = new byte[local134];
		@Pc(191) int local191;
		@Pc(195) int local195;
		@Pc(201) int local201;
		if (local134 > 1) {
			local182[1] = 1;
			local191 = 2;
			@Pc(193) int local193 = 1;
			for (local195 = 2; local195 < local134; local195++) {
				local201 = local38.method1607();
				if (local201 == 0) {
					local193 = local191++;
				} else {
					if (local201 <= local193) {
						local201--;
					}
					local193 = local201;
				}
				local182[local195] = (byte) local193;
			}
		} else {
			local191 = local134;
		}
		@Pc(237) Class76[] local237 = new Class76[local191];
		for (local195 = 0; local195 < local237.length; local195++) {
			@Pc(249) Class76 local249 = local237[local195] = new Class76();
			@Pc(253) int local253 = local38.method1607();
			if (local253 > 0) {
				local249.aByteArray34 = new byte[local253 * 2];
			}
			local253 = local38.method1607();
			if (local253 > 0) {
				local249.aByteArray33 = new byte[local253 * 2 + 2];
				local249.aByteArray33[1] = 64;
			}
		}
		local201 = local38.method1607();
		@Pc(305) byte[] local305 = local201 > 0 ? new byte[local201 * 2] : null;
		local201 = local38.method1607();
		@Pc(321) byte[] local321 = local201 <= 0 ? null : new byte[local201 * 2];
		@Pc(323) int local323;
		for (local323 = 0; local38.aByteArray27[local323 + local38.anInt2195] != 0; local323++) {
		}
		@Pc(337) byte[] local337 = new byte[local323];
		for (@Pc(339) int local339 = 0; local339 < local323; local339++) {
			local337[local339] = local38.method1611();
		}
		local323++;
		@Pc(358) int local358 = 0;
		local38.anInt2195++;
		for (@Pc(366) int local366 = 0; local366 < 128; local366++) {
			local358 += local38.method1607();
			this.aShortArray42[local366] = (short) local358;
		}
		local358 = 0;
		for (@Pc(390) int local390 = 0; local390 < 128; local390++) {
			local358 += local38.method1607();
			this.aShortArray42[local390] = (short) (this.aShortArray42[local390] + (local358 << 8));
		}
		@Pc(415) int local415 = 0;
		@Pc(417) int local417 = 0;
		@Pc(419) int local419 = 0;
		for (@Pc(421) int local421 = 0; local421 < 128; local421++) {
			if (local415 == 0) {
				if (local419 >= local337.length) {
					local415 = -1;
				} else {
					local415 = local337[local419++];
				}
				local417 = local38.method1628();
			}
			local415--;
			this.aShortArray42[local421] = (short) (this.aShortArray42[local421] + ((local417 - 1 & 0x2) << 14));
			this.anIntArray351[local421] = local417;
		}
		local415 = 0;
		local419 = 0;
		@Pc(482) int local482 = 0;
		for (@Pc(484) int local484 = 0; local484 < 128; local484++) {
			if (this.anIntArray351[local484] != 0) {
				if (local415 == 0) {
					local482 = local38.aByteArray27[local79++] - 1;
					if (local55.length <= local419) {
						local415 = -1;
					} else {
						local415 = local55[local419++];
					}
				}
				this.aByteArray35[local484] = (byte) local482;
				local415--;
			}
		}
		local419 = 0;
		local415 = 0;
		@Pc(534) int local534 = 0;
		for (@Pc(536) int local536 = 0; local536 < 128; local536++) {
			if (this.anIntArray351[local536] != 0) {
				if (local415 == 0) {
					if (local419 < local104.length) {
						local415 = local104[local419++];
					} else {
						local415 = -1;
					}
					local534 = local38.aByteArray27[local132++] + 16 << 2;
				}
				this.aByteArray37[local536] = (byte) local534;
				local415--;
			}
		}
		@Pc(593) Class76 local593 = null;
		local415 = 0;
		local419 = 0;
		for (@Pc(599) int local599 = 0; local599 < 128; local599++) {
			if (this.anIntArray351[local599] != 0) {
				if (local415 == 0) {
					local593 = local237[local182[local419]];
					if (local154.length > local419) {
						local415 = local154[local419++];
					} else {
						local415 = -1;
					}
				}
				local415--;
				this.aClass76Array1[local599] = local593;
			}
		}
		local419 = 0;
		local415 = 0;
		@Pc(644) int local644 = 0;
		for (@Pc(646) int local646 = 0; local646 < 128; local646++) {
			if (local415 == 0) {
				if (local337.length > local419) {
					local415 = local337[local419++];
				} else {
					local415 = -1;
				}
				if (this.anIntArray351[local646] > 0) {
					local644 = local38.method1607() + 1;
				}
			}
			local415--;
			this.aByteArray36[local646] = (byte) local644;
		}
		this.anInt3592 = local38.method1607() + 1;
		@Pc(713) int local713;
		for (@Pc(702) int local702 = 0; local702 < local191; local702++) {
			@Pc(708) Class76 local708 = local237[local702];
			if (local708.aByteArray34 != null) {
				for (local713 = 1; local713 < local708.aByteArray34.length; local713 += 2) {
					local708.aByteArray34[local713] = local38.method1611();
				}
			}
			if (local708.aByteArray33 != null) {
				for (local713 = 3; local713 < local708.aByteArray33.length - 2; local713 += 2) {
					local708.aByteArray33[local713] = local38.method1611();
				}
			}
		}
		@Pc(762) int local762;
		if (local305 != null) {
			for (local762 = 1; local762 < local305.length; local762 += 2) {
				local305[local762] = local38.method1611();
			}
		}
		if (local321 != null) {
			for (local762 = 1; local762 < local321.length; local762 += 2) {
				local321[local762] = local38.method1611();
			}
		}
		@Pc(811) int local811;
		for (local762 = 0; local762 < local191; local762++) {
			@Pc(804) Class76 local804 = local237[local762];
			if (local804.aByteArray33 != null) {
				local358 = 0;
				for (local811 = 2; local811 < local804.aByteArray33.length; local811 += 2) {
					local358 = local38.method1607() + local358 + 1;
					local804.aByteArray33[local811] = (byte) local358;
				}
			}
		}
		@Pc(852) int local852;
		for (local713 = 0; local713 < local191; local713++) {
			@Pc(845) Class76 local845 = local237[local713];
			if (local845.aByteArray34 != null) {
				local358 = 0;
				for (local852 = 2; local852 < local845.aByteArray34.length; local852 += 2) {
					local358 = local38.method1607() + local358 + 1;
					local845.aByteArray34[local852] = (byte) local358;
				}
			}
		}
		@Pc(921) int local921;
		@Pc(948) int local948;
		@Pc(960) byte local960;
		@Pc(974) int local974;
		@Pc(976) int local976;
		@Pc(985) int local985;
		@Pc(915) byte local915;
		@Pc(1030) int local1030;
		if (local305 != null) {
			local358 = local38.method1607();
			local305[0] = (byte) local358;
			for (local811 = 2; local811 < local305.length; local811 += 2) {
				local358 = local38.method1607() + local358 + 1;
				local305[local811] = (byte) local358;
			}
			local915 = local305[0];
			@Pc(919) byte local919 = local305[1];
			for (local921 = 0; local921 < local915; local921++) {
				this.aByteArray36[local921] = (byte) (local919 * this.aByteArray36[local921] + 32 >> 6);
			}
			local948 = 2;
			while (local305.length > local948) {
				@Pc(956) byte local956 = local305[local948 + 1];
				local960 = local305[local948];
				local948 += 2;
				local974 = (local960 - local915) * local919 + (local960 - local915) / 2;
				for (local976 = local915; local976 < local960; local976++) {
					local985 = Static143.method2547(local974, local960 - local915);
					local974 += local956 - local919;
					this.aByteArray36[local976] = (byte) (local985 * this.aByteArray36[local976] + 32 >> 6);
				}
				local919 = local956;
				local915 = local960;
			}
			for (local1030 = local915; local1030 < 128; local1030++) {
				this.aByteArray36[local1030] = (byte) (this.aByteArray36[local1030] * local919 + 32 >> 6);
			}
		}
		@Pc(1096) int local1096;
		if (local321 != null) {
			local358 = local38.method1607();
			local321[0] = (byte) local358;
			for (local811 = 2; local811 < local321.length; local811 += 2) {
				local358 += local38.method1607() + 1;
				local321[local811] = (byte) local358;
			}
			local915 = local321[0];
			local1096 = local321[1] << 1;
			for (local921 = 0; local921 < local915; local921++) {
				local948 = local1096 + (this.aByteArray37[local921] & 0xFF);
				if (local948 < 0) {
					local948 = 0;
				}
				if (local948 > 128) {
					local948 = 128;
				}
				this.aByteArray37[local921] = (byte) local948;
			}
			local948 = 2;
			@Pc(1150) int local1150;
			while (local321.length > local948) {
				local960 = local321[local948];
				local1150 = local321[local948 + 1] << 1;
				local974 = (local960 - local915) * local1096 + (local960 - local915) / 2;
				local948 += 2;
				for (local976 = local915; local976 < local960; local976++) {
					local985 = Static143.method2547(local974, local960 - local915);
					local974 += local1150 - local1096;
					@Pc(1192) int local1192 = local985 + (this.aByteArray37[local976] & 0xFF);
					if (local1192 < 0) {
						local1192 = 0;
					}
					if (local1192 > 128) {
						local1192 = 128;
					}
					this.aByteArray37[local976] = (byte) local1192;
				}
				local1096 = local1150;
				local915 = local960;
			}
			for (local1030 = local915; local1030 < 128; local1030++) {
				local1150 = local1096 + (this.aByteArray37[local1030] & 0xFF);
				if (local1150 < 0) {
					local1150 = 0;
				}
				if (local1150 > 128) {
					local1150 = 128;
				}
				this.aByteArray37[local1030] = (byte) local1150;
			}
		}
		for (local811 = 0; local811 < local191; local811++) {
			local237[local811].anInt3573 = local38.method1607();
		}
		for (local852 = 0; local852 < local191; local852++) {
			@Pc(1280) Class76 local1280 = local237[local852];
			if (local1280.aByteArray34 != null) {
				local1280.anInt3579 = local38.method1607();
			}
			if (local1280.aByteArray33 != null) {
				local1280.anInt3577 = local38.method1607();
			}
			if (local1280.anInt3573 > 0) {
				local1280.anInt3571 = local38.method1607();
			}
		}
		for (local1096 = 0; local1096 < local191; local1096++) {
			local237[local1096].anInt3576 = local38.method1607();
		}
		for (local921 = 0; local921 < local191; local921++) {
			@Pc(1339) Class76 local1339 = local237[local921];
			if (local1339.anInt3576 > 0) {
				local1339.anInt3578 = local38.method1607();
			}
		}
		for (local948 = 0; local948 < local191; local948++) {
			@Pc(1366) Class76 local1366 = local237[local948];
			if (local1366.anInt3578 > 0) {
				local1366.anInt3575 = local38.method1607();
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([I[BILclient!qf;)Z")
	public boolean method2593(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class72 arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(10) Class1_Sub4_Sub1 local10 = null;
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray351[local18];
				if (local30 != 0) {
					if (local16 != local30) {
						local16 = local30--;
						if ((local30 & 0x1) == 0) {
							local10 = arg2.method2503(arg0, local30 >> 2);
						} else {
							local10 = arg2.method2504(arg0, local30 >> 2);
						}
						if (local10 == null) {
							local3 = false;
						}
					}
					if (local10 != null) {
						this.aClass1_Sub4_Sub1Array1[local18] = local10;
						this.anIntArray351[local18] = 0;
					}
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	public void method2594() {
		this.anIntArray351 = null;
	}
}
