import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "[B")
	public byte[] aByteArray81;

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
	public int anInt3515;

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "[B")
	public byte[] aByteArray83;

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "[Lclient!se;")
	public Class300[] aClass300Array1;

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "[Lclient!qr;")
	public Class3_Sub17_Sub1[] aClass3_Sub17_Sub1Array1;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	private Class3_Sub19() {
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "([B)V")
	public Class3_Sub19(@OriginalArg(0) byte[] arg0) {
		this.anIntArray133 = new int[128];
		this.aByteArray82 = new byte[128];
		this.aByteArray83 = new byte[128];
		this.aClass3_Sub17_Sub1Array1 = new Class3_Sub17_Sub1[128];
		this.aByteArray81 = new byte[128];
		this.aShortArray53 = new short[128];
		this.aClass300Array1 = new Class300[128];
		@Pc(36) Class3_Sub26 local36 = new Class3_Sub26(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray213[local38 + local36.anInt8703] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method6825();
		}
		local36.anInt8703++;
		local38++;
		@Pc(83) int local83 = local36.anInt8703;
		local36.anInt8703 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray213[local36.anInt8703 + local91] != 0; local91++) {
		}
		@Pc(105) byte[] local105 = new byte[local91];
		for (@Pc(107) int local107 = 0; local107 < local91; local107++) {
			local105[local107] = local36.method6825();
		}
		local91++;
		local36.anInt8703++;
		@Pc(129) int local129 = local36.anInt8703;
		local36.anInt8703 += local91;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray213[local36.anInt8703 + local137] != 0; local137++) {
		}
		@Pc(154) byte[] local154 = new byte[local137];
		for (@Pc(156) int local156 = 0; local156 < local137; local156++) {
			local154[local156] = local36.method6825();
		}
		local36.anInt8703++;
		local137++;
		@Pc(182) byte[] local182 = new byte[local137];
		@Pc(195) int local195;
		@Pc(197) int local197;
		@Pc(203) int local203;
		if (local137 > 1) {
			local182[1] = 1;
			@Pc(193) int local193 = 1;
			local195 = 2;
			for (local197 = 2; local197 < local137; local197++) {
				local203 = local36.method6814();
				if (local203 == 0) {
					local193 = local195++;
				} else {
					if (local193 >= local203) {
						local203--;
					}
					local193 = local203;
				}
				local182[local197] = (byte) local193;
			}
		} else {
			local195 = local137;
		}
		@Pc(240) Class300[] local240 = new Class300[local195];
		for (local197 = 0; local197 < local240.length; local197++) {
			@Pc(252) Class300 local252 = local240[local197] = new Class300();
			@Pc(256) int local256 = local36.method6814();
			if (local256 > 0) {
				local252.aByteArray205 = new byte[local256 * 2];
			}
			local256 = local36.method6814();
			if (local256 > 0) {
				local252.aByteArray206 = new byte[local256 * 2 + 2];
				local252.aByteArray206[1] = 64;
			}
		}
		local203 = local36.method6814();
		@Pc(311) byte[] local311 = local203 <= 0 ? null : new byte[local203 * 2];
		local203 = local36.method6814();
		@Pc(324) byte[] local324 = local203 > 0 ? new byte[local203 * 2] : null;
		@Pc(326) int local326;
		for (local326 = 0; local36.aByteArray213[local326 + local36.anInt8703] != 0; local326++) {
		}
		@Pc(343) byte[] local343 = new byte[local326];
		for (@Pc(345) int local345 = 0; local345 < local326; local345++) {
			local343[local345] = local36.method6825();
		}
		local36.anInt8703++;
		local326++;
		@Pc(370) int local370 = 0;
		for (@Pc(372) int local372 = 0; local372 < 128; local372++) {
			local370 += local36.method6814();
			this.aShortArray53[local372] = (short) local370;
		}
		local370 = 0;
		for (@Pc(394) int local394 = 0; local394 < 128; local394++) {
			local370 += local36.method6814();
			this.aShortArray53[local394] = (short) (this.aShortArray53[local394] + (local370 << 8));
		}
		@Pc(421) int local421 = 0;
		@Pc(423) int local423 = 0;
		@Pc(425) int local425 = 0;
		for (@Pc(427) int local427 = 0; local427 < 128; local427++) {
			if (local421 == 0) {
				if (local423 < local343.length) {
					local421 = local343[local423++];
				} else {
					local421 = -1;
				}
				local425 = local36.method6806();
			}
			this.aShortArray53[local427] = (short) (this.aShortArray53[local427] + ((local425 - 1 & 0x2) << 14));
			this.anIntArray133[local427] = local425;
			local421--;
		}
		local421 = 0;
		local423 = 0;
		@Pc(484) int local484 = 0;
		for (@Pc(486) int local486 = 0; local486 < 128; local486++) {
			if (this.anIntArray133[local486] != 0) {
				if (local421 == 0) {
					local484 = local36.aByteArray213[local83++] - 1;
					if (local55.length <= local423) {
						local421 = -1;
					} else {
						local421 = local55[local423++];
					}
				}
				local421--;
				this.aByteArray83[local486] = (byte) local484;
			}
		}
		local423 = 0;
		local421 = 0;
		@Pc(536) int local536 = 0;
		for (@Pc(538) int local538 = 0; local538 < 128; local538++) {
			if (this.anIntArray133[local538] != 0) {
				if (local421 == 0) {
					if (local105.length <= local423) {
						local421 = -1;
					} else {
						local421 = local105[local423++];
					}
					local536 = local36.aByteArray213[local129++] + 16 << 2;
				}
				local421--;
				this.aByteArray82[local538] = (byte) local536;
			}
		}
		local423 = 0;
		local421 = 0;
		@Pc(591) Class300 local591 = null;
		for (@Pc(593) int local593 = 0; local593 < 128; local593++) {
			if (this.anIntArray133[local593] != 0) {
				if (local421 == 0) {
					local591 = local240[local182[local423]];
					if (local154.length <= local423) {
						local421 = -1;
					} else {
						local421 = local154[local423++];
					}
				}
				local421--;
				this.aClass300Array1[local593] = local591;
			}
		}
		local421 = 0;
		local423 = 0;
		@Pc(640) int local640 = 0;
		for (@Pc(642) int local642 = 0; local642 < 128; local642++) {
			if (local421 == 0) {
				if (local343.length <= local423) {
					local421 = -1;
				} else {
					local421 = local343[local423++];
				}
				if (this.anIntArray133[local642] > 0) {
					local640 = local36.method6814() + 1;
				}
			}
			local421--;
			this.aByteArray81[local642] = (byte) local640;
		}
		this.anInt3515 = local36.method6814() + 1;
		@Pc(701) int local701;
		for (@Pc(690) int local690 = 0; local690 < local195; local690++) {
			@Pc(696) Class300 local696 = local240[local690];
			if (local696.aByteArray205 != null) {
				for (local701 = 1; local701 < local696.aByteArray205.length; local701 += 2) {
					local696.aByteArray205[local701] = local36.method6825();
				}
			}
			if (local696.aByteArray206 != null) {
				for (local701 = 3; local701 < local696.aByteArray206.length - 2; local701 += 2) {
					local696.aByteArray206[local701] = local36.method6825();
				}
			}
		}
		@Pc(750) int local750;
		if (local311 != null) {
			for (local750 = 1; local750 < local311.length; local750 += 2) {
				local311[local750] = local36.method6825();
			}
		}
		if (local324 != null) {
			for (local750 = 1; local750 < local324.length; local750 += 2) {
				local324[local750] = local36.method6825();
			}
		}
		@Pc(799) int local799;
		for (local750 = 0; local750 < local195; local750++) {
			@Pc(792) Class300 local792 = local240[local750];
			if (local792.aByteArray206 != null) {
				local370 = 0;
				for (local799 = 2; local799 < local792.aByteArray206.length; local799 += 2) {
					local370 = local36.method6814() + local370 + 1;
					local792.aByteArray206[local799] = (byte) local370;
				}
			}
		}
		@Pc(844) int local844;
		for (local701 = 0; local701 < local195; local701++) {
			@Pc(837) Class300 local837 = local240[local701];
			if (local837.aByteArray205 != null) {
				local370 = 0;
				for (local844 = 2; local844 < local837.aByteArray205.length; local844 += 2) {
					local370 = local36.method6814() + local370 + 1;
					local837.aByteArray205[local844] = (byte) local370;
				}
			}
		}
		@Pc(921) int local921;
		@Pc(948) int local948;
		@Pc(954) byte local954;
		@Pc(975) int local975;
		@Pc(977) int local977;
		@Pc(987) int local987;
		@Pc(915) byte local915;
		@Pc(1034) int local1034;
		if (local311 != null) {
			local370 = local36.method6814();
			local311[0] = (byte) local370;
			for (local799 = 2; local799 < local311.length; local799 += 2) {
				local370 -= -local36.method6814() - 1;
				local311[local799] = (byte) local370;
			}
			local915 = local311[0];
			@Pc(919) byte local919 = local311[1];
			for (local921 = 0; local921 < local915; local921++) {
				this.aByteArray81[local921] = (byte) (this.aByteArray81[local921] * local919 + 32 >> 6);
			}
			local948 = 2;
			while (local311.length > local948) {
				local954 = local311[local948];
				@Pc(960) byte local960 = local311[local948 + 1];
				local975 = local919 * (local954 - local915) + (local954 - local915) / 2;
				for (local977 = local915; local977 < local954; local977++) {
					local987 = Static131.method2542(local975, local954 - local915);
					local975 += local960 - local919;
					this.aByteArray81[local977] = (byte) (local987 * this.aByteArray81[local977] + 32 >> 6);
				}
				local948 += 2;
				local915 = local954;
				local919 = local960;
			}
			for (local1034 = local915; local1034 < 128; local1034++) {
				this.aByteArray81[local1034] = (byte) (local919 * this.aByteArray81[local1034] + 32 >> 6);
			}
		}
		@Pc(1105) int local1105;
		if (local324 != null) {
			local370 = local36.method6814();
			local324[0] = (byte) local370;
			for (local799 = 2; local799 < local324.length; local799 += 2) {
				local370 += local36.method6814() + 1;
				local324[local799] = (byte) local370;
			}
			local915 = local324[0];
			local1105 = local324[1] << 1;
			for (local921 = 0; local921 < local915; local921++) {
				local948 = local1105 + (this.aByteArray82[local921] & 0xFF);
				if (local948 < 0) {
					local948 = 0;
				}
				if (local948 > 128) {
					local948 = 128;
				}
				this.aByteArray82[local921] = (byte) local948;
			}
			local948 = 2;
			@Pc(1158) int local1158;
			while (local324.length > local948) {
				local954 = local324[local948];
				local1158 = local324[local948 + 1] << 1;
				local975 = local1105 * (local954 - local915) + (local954 - local915) / 2;
				for (local977 = local915; local977 < local954; local977++) {
					local987 = Static131.method2542(local975, local954 - local915);
					@Pc(1193) int local1193 = local987 + (this.aByteArray82[local977] & 0xFF);
					if (local1193 < 0) {
						local1193 = 0;
					}
					if (local1193 > 128) {
						local1193 = 128;
					}
					local975 += local1158 - local1105;
					this.aByteArray82[local977] = (byte) local1193;
				}
				local948 += 2;
				local915 = local954;
				local1105 = local1158;
			}
			for (local1034 = local915; local1034 < 128; local1034++) {
				local1158 = local1105 + (this.aByteArray82[local1034] & 0xFF);
				if (local1158 < 0) {
					local1158 = 0;
				}
				if (local1158 > 128) {
					local1158 = 128;
				}
				this.aByteArray82[local1034] = (byte) local1158;
			}
		}
		for (local799 = 0; local799 < local195; local799++) {
			local240[local799].anInt8371 = local36.method6814();
		}
		for (local844 = 0; local844 < local195; local844++) {
			@Pc(1300) Class300 local1300 = local240[local844];
			if (local1300.aByteArray205 != null) {
				local1300.anInt8370 = local36.method6814();
			}
			if (local1300.aByteArray206 != null) {
				local1300.anInt8368 = local36.method6814();
			}
			if (local1300.anInt8371 > 0) {
				local1300.anInt8363 = local36.method6814();
			}
		}
		for (local1105 = 0; local1105 < local195; local1105++) {
			local240[local1105].anInt8367 = local36.method6814();
		}
		for (local921 = 0; local921 < local195; local921++) {
			@Pc(1355) Class300 local1355 = local240[local921];
			if (local1355.anInt8367 > 0) {
				local1355.anInt8369 = local36.method6814();
			}
		}
		for (local948 = 0; local948 < local195; local948++) {
			@Pc(1379) Class300 local1379 = local240[local948];
			if (local1379.anInt8369 > 0) {
				local1379.anInt8366 = local36.method6814();
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!ao;[IB[B)Z")
	public boolean method2851(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class3_Sub17_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(34) int local34 = this.anIntArray133[local13];
				if (local34 != 0) {
					if (local34 != local9) {
						local9 = local34--;
						if ((local34 & 0x1) == 0) {
							local11 = arg0.method216(local34 >> 2, arg1);
						} else {
							local11 = arg0.method215(local34 >> 2, arg1);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass3_Sub17_Sub1Array1[local13] = local11;
						this.anIntArray133[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
	public void method2853() {
		this.anIntArray133 = null;
	}
}
