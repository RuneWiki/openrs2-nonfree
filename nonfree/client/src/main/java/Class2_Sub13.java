import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "[I")
	private int[] anIntArray133 = new int[128];

	@OriginalMember(owner = "client!dg", name = "x", descriptor = "[B")
	public byte[] aByteArray10 = new byte[128];

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "[Lclient!ni;")
	public Class69[] aClass69Array1;

	@OriginalMember(owner = "client!dg", name = "A", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!dg", name = "E", descriptor = "[S")
	public short[] aShortArray24 = new short[128];

	@OriginalMember(owner = "client!dg", name = "F", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
	public int anInt792;

	@OriginalMember(owner = "client!dg", name = "M", descriptor = "[Lclient!kh;")
	public Class2_Sub22_Sub1[] aClass2_Sub22_Sub1Array1;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "([B)V")
	public Class2_Sub13(@OriginalArg(0) byte[] arg0) {
		@Pc(15) int local15 = 0;
		this.aByteArray11 = new byte[128];
		this.aClass69Array1 = new Class69[128];
		this.aByteArray12 = new byte[128];
		this.aClass2_Sub22_Sub1Array1 = new Class2_Sub22_Sub1[128];
		@Pc(36) Class2_Sub23 local36 = new Class2_Sub23(arg0);
		while (local36.aByteArray41[local36.anInt2703 + local15] != 0) {
			local15++;
		}
		@Pc(53) byte[] local53 = new byte[local15];
		for (@Pc(55) int local55 = 0; local55 < local15; local55++) {
			local53[local55] = local36.method2114();
		}
		local15++;
		local36.anInt2703++;
		@Pc(80) int local80 = local36.anInt2703;
		@Pc(82) int local82 = 0;
		local36.anInt2703 += local15;
		while (local36.aByteArray41[local36.anInt2703 + local82] != 0) {
			local82++;
		}
		@Pc(104) byte[] local104 = new byte[local82];
		for (@Pc(106) int local106 = 0; local106 < local82; local106++) {
			local104[local106] = local36.method2114();
		}
		local36.anInt2703++;
		@Pc(129) int local129 = 0;
		@Pc(132) int local132 = local36.anInt2703;
		local82++;
		local36.anInt2703 += local82;
		while (local36.aByteArray41[local36.anInt2703 + local129] != 0) {
			local129++;
		}
		@Pc(155) byte[] local155 = new byte[local129];
		for (@Pc(157) int local157 = 0; local157 < local129; local157++) {
			local155[local157] = local36.method2114();
		}
		local129++;
		@Pc(176) byte[] local176 = new byte[local129];
		local36.anInt2703++;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		if (local129 > 1) {
			local187 = 2;
			local176[1] = 1;
			@Pc(193) int local193 = 1;
			for (local195 = 2; local195 < local129; local195++) {
				local200 = local36.method2122();
				if (local200 == 0) {
					local193 = local187++;
				} else {
					if (local200 <= local193) {
						local200--;
					}
					local193 = local200;
				}
				local176[local195] = (byte) local193;
			}
		} else {
			local187 = local129;
		}
		@Pc(227) Class69[] local227 = new Class69[local187];
		for (local195 = 0; local195 < local227.length; local195++) {
			@Pc(238) Class69 local238 = local227[local195] = new Class69();
			@Pc(242) int local242 = local36.method2122();
			if (local242 > 0) {
				local238.aByteArray44 = new byte[local242 * 2];
			}
			local242 = local36.method2122();
			if (local242 > 0) {
				local238.aByteArray43 = new byte[local242 * 2 + 2];
				local238.aByteArray43[1] = 64;
			}
		}
		local200 = local36.method2122();
		@Pc(283) int local283 = 0;
		@Pc(295) byte[] local295 = local200 <= 0 ? null : new byte[local200 * 2];
		local200 = local36.method2122();
		while (local36.aByteArray41[local36.anInt2703 + local283] != 0) {
			local283++;
		}
		@Pc(316) byte[] local316 = new byte[local283];
		for (@Pc(318) int local318 = 0; local318 < local283; local318++) {
			local316[local318] = local36.method2114();
		}
		@Pc(341) byte[] local341 = local200 <= 0 ? null : new byte[local200 * 2];
		local283++;
		local36.anInt2703++;
		@Pc(350) int local350 = 0;
		for (@Pc(352) int local352 = 0; local352 < 128; local352++) {
			local350 += local36.method2122();
			this.aShortArray24[local352] = (short) local350;
		}
		local350 = 0;
		for (@Pc(375) int local375 = 0; local375 < 128; local375++) {
			local350 += local36.method2122();
			this.aShortArray24[local375] = (short) (this.aShortArray24[local375] + (local350 << 8));
		}
		@Pc(399) int local399 = 0;
		@Pc(401) int local401 = 0;
		@Pc(403) int local403 = 0;
		for (@Pc(405) int local405 = 0; local405 < 128; local405++) {
			if (local399 == 0) {
				if (local403 < local316.length) {
					local399 = local316[local403++];
				} else {
					local399 = -1;
				}
				local401 = local36.method2105();
			}
			this.aShortArray24[local405] = (short) (this.aShortArray24[local405] + ((local401 - 1 & 0x2) << 14));
			local399--;
			this.anIntArray133[local405] = local401;
		}
		local399 = 0;
		local403 = 0;
		@Pc(462) int local462 = 0;
		for (@Pc(464) int local464 = 0; local464 < 128; local464++) {
			if (this.anIntArray133[local464] != 0) {
				if (local399 == 0) {
					if (local53.length <= local403) {
						local399 = -1;
					} else {
						local399 = local53[local403++];
					}
					local462 = local36.aByteArray41[local80++] - 1;
				}
				local399--;
				this.aByteArray11[local464] = (byte) local462;
			}
		}
		local403 = 0;
		local399 = 0;
		@Pc(514) int local514 = 0;
		for (@Pc(516) int local516 = 0; local516 < 128; local516++) {
			if (this.anIntArray133[local516] != 0) {
				if (local399 == 0) {
					if (local104.length <= local403) {
						local399 = -1;
					} else {
						local399 = local104[local403++];
					}
					local514 = local36.aByteArray41[local132++] + 16 << 2;
				}
				this.aByteArray12[local516] = (byte) local514;
				local399--;
			}
		}
		local399 = 0;
		@Pc(565) Class69 local565 = null;
		local403 = 0;
		for (@Pc(569) int local569 = 0; local569 < 128; local569++) {
			if (this.anIntArray133[local569] != 0) {
				if (local399 == 0) {
					local565 = local227[local176[local403]];
					if (local155.length > local403) {
						local399 = local155[local403++];
					} else {
						local399 = -1;
					}
				}
				this.aClass69Array1[local569] = local565;
				local399--;
			}
		}
		local403 = 0;
		@Pc(609) int local609 = 0;
		local399 = 0;
		for (@Pc(613) int local613 = 0; local613 < 128; local613++) {
			if (local399 == 0) {
				if (local316.length <= local403) {
					local399 = -1;
				} else {
					local399 = local316[local403++];
				}
				if (this.anIntArray133[local613] > 0) {
					local609 = local36.method2122() + 1;
				}
			}
			this.aByteArray10[local613] = (byte) local609;
			local399--;
		}
		this.anInt792 = local36.method2122() + 1;
		@Pc(675) int local675;
		for (@Pc(665) int local665 = 0; local665 < local187; local665++) {
			@Pc(670) Class69 local670 = local227[local665];
			if (local670.aByteArray44 != null) {
				for (local675 = 1; local675 < local670.aByteArray44.length; local675 += 2) {
					local670.aByteArray44[local675] = local36.method2114();
				}
			}
			if (local670.aByteArray43 != null) {
				for (local675 = 3; local675 < local670.aByteArray43.length - 2; local675 += 2) {
					local670.aByteArray43[local675] = local36.method2114();
				}
			}
		}
		@Pc(726) int local726;
		if (local295 != null) {
			for (local726 = 1; local726 < local295.length; local726 += 2) {
				local295[local726] = local36.method2114();
			}
		}
		if (local341 != null) {
			for (local726 = 1; local726 < local341.length; local726 += 2) {
				local341[local726] = local36.method2114();
			}
		}
		@Pc(776) int local776;
		for (local726 = 0; local726 < local187; local726++) {
			@Pc(769) Class69 local769 = local227[local726];
			if (local769.aByteArray43 != null) {
				local350 = 0;
				for (local776 = 2; local776 < local769.aByteArray43.length; local776 += 2) {
					local350 += local36.method2122() + 1;
					local769.aByteArray43[local776] = (byte) local350;
				}
			}
		}
		@Pc(815) int local815;
		for (local675 = 0; local675 < local187; local675++) {
			@Pc(808) Class69 local808 = local227[local675];
			if (local808.aByteArray44 != null) {
				local350 = 0;
				for (local815 = 2; local815 < local808.aByteArray44.length; local815 += 2) {
					local350 = local36.method2122() + local350 + 1;
					local808.aByteArray44[local815] = (byte) local350;
				}
			}
		}
		@Pc(887) int local887;
		@Pc(913) int local913;
		@Pc(918) byte local918;
		@Pc(938) int local938;
		@Pc(941) int local941;
		@Pc(949) int local949;
		@Pc(881) byte local881;
		@Pc(985) int local985;
		if (local295 != null) {
			local350 = local36.method2122();
			local295[0] = (byte) local350;
			for (local776 = 2; local776 < local295.length; local776 += 2) {
				local350 = local350 + local36.method2122() + 1;
				local295[local776] = (byte) local350;
			}
			local881 = local295[0];
			@Pc(885) byte local885 = local295[1];
			for (local887 = 0; local887 < local881; local887++) {
				this.aByteArray10[local887] = (byte) (local885 * this.aByteArray10[local887] + 32 >> 6);
			}
			local913 = 2;
			while (local295.length > local913) {
				local918 = local295[local913];
				@Pc(924) byte local924 = local295[local913 + 1];
				local938 = (local918 - local881) * local885 + (local918 - local881) / 2;
				local913 += 2;
				for (local941 = local881; local941 < local918; local941++) {
					local949 = Static148.method2651(local938, local918 - local881);
					local938 += local924 - local885;
					this.aByteArray10[local941] = (byte) (local949 * this.aByteArray10[local941] + 32 >> 6);
				}
				local885 = local924;
				local881 = local918;
			}
			for (local985 = local881; local985 < 128; local985++) {
				this.aByteArray10[local985] = (byte) (local885 * this.aByteArray10[local985] + 32 >> 6);
			}
		}
		@Pc(1053) int local1053;
		if (local341 != null) {
			local350 = local36.method2122();
			local341[0] = (byte) local350;
			for (local776 = 2; local776 < local341.length; local776 += 2) {
				local350 = local36.method2122() + local350 + 1;
				local341[local776] = (byte) local350;
			}
			local881 = local341[0];
			local1053 = local341[1] << 1;
			for (local887 = 0; local887 < local881; local887++) {
				local913 = (this.aByteArray12[local887] & 0xFF) + local1053;
				if (local913 < 0) {
					local913 = 0;
				}
				if (local913 > 128) {
					local913 = 128;
				}
				this.aByteArray12[local887] = (byte) local913;
			}
			local913 = 2;
			@Pc(1109) int local1109;
			while (local913 < local341.length) {
				local918 = local341[local913];
				local1109 = local341[local913 + 1] << 1;
				local938 = (local918 - local881) / 2 + local1053 * (local918 - local881);
				local913 += 2;
				for (local941 = local881; local941 < local918; local941++) {
					local949 = Static148.method2651(local938, local918 - local881);
					@Pc(1143) int local1143 = (this.aByteArray12[local941] & 0xFF) + local949;
					if (local1143 < 0) {
						local1143 = 0;
					}
					if (local1143 > 128) {
						local1143 = 128;
					}
					local938 += local1109 - local1053;
					this.aByteArray12[local941] = (byte) local1143;
				}
				local881 = local918;
				local1053 = local1109;
			}
			for (local985 = local881; local985 < 128; local985++) {
				local1109 = (this.aByteArray12[local985] & 0xFF) + local1053;
				if (local1109 < 0) {
					local1109 = 0;
				}
				if (local1109 > 128) {
					local1109 = 128;
				}
				this.aByteArray12[local985] = (byte) local1109;
			}
		}
		for (local776 = 0; local776 < local187; local776++) {
			local227[local776].anInt3195 = local36.method2122();
		}
		for (local815 = 0; local815 < local187; local815++) {
			@Pc(1236) Class69 local1236 = local227[local815];
			if (local1236.aByteArray44 != null) {
				local1236.anInt3190 = local36.method2122();
			}
			if (local1236.aByteArray43 != null) {
				local1236.anInt3194 = local36.method2122();
			}
			if (local1236.anInt3195 > 0) {
				local1236.anInt3188 = local36.method2122();
			}
		}
		for (local1053 = 0; local1053 < local187; local1053++) {
			local227[local1053].anInt3192 = local36.method2122();
		}
		for (local887 = 0; local887 < local187; local887++) {
			@Pc(1288) Class69 local1288 = local227[local887];
			if (local1288.anInt3192 > 0) {
				local1288.anInt3189 = local36.method2122();
			}
		}
		for (local913 = 0; local913 < local187; local913++) {
			@Pc(1307) Class69 local1307 = local227[local913];
			if (local1307.anInt3189 > 0) {
				local1307.anInt3191 = local36.method2122();
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
	public void method583() {
		this.anIntArray133 = null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[B[ILclient!ic;)Z")
	public boolean method584(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(7) int local7 = 0;
		@Pc(9) Class2_Sub22_Sub1 local9 = null;
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			if (arg0 == null || arg0[local17] != 0) {
				@Pc(32) int local32 = this.anIntArray133[local17];
				if (local32 != 0) {
					if (local32 != local7) {
						local7 = local32--;
						if ((local32 & 0x1) == 0) {
							local9 = arg2.method1594(arg1, local32 >> 2);
						} else {
							local9 = arg2.method1599(arg1, local32 >> 2);
						}
						if (local9 == null) {
							local1 = false;
						}
					}
					if (local9 != null) {
						this.aClass2_Sub22_Sub1Array1[local17] = local9;
						this.anIntArray133[local17] = 0;
					}
				}
			}
		}
		return local1;
	}
}
