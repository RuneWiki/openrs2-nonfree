import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "[Lclient!vo;")
	public Class2_Sub12_Sub1[] aClass2_Sub12_Sub1Array1;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
	public int anInt1367;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!ds", name = "x", descriptor = "[Lclient!wd;")
	public Class209[] aClass209Array1;

	@OriginalMember(owner = "client!ds", name = "C", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
	private Class2_Sub14() {
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "([B)V")
	public Class2_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray20 = new byte[128];
		this.aClass2_Sub12_Sub1Array1 = new Class2_Sub12_Sub1[128];
		this.aByteArray19 = new byte[128];
		this.anIntArray140 = new int[128];
		this.aByteArray21 = new byte[128];
		this.aClass209Array1 = new Class209[128];
		this.aShortArray42 = new short[128];
		@Pc(36) Class2_Sub10 local36 = new Class2_Sub10(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray57[local38 + local36.anInt4807] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method4436();
		}
		local38++;
		local36.anInt4807++;
		@Pc(80) int local80 = local36.anInt4807;
		local36.anInt4807 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray57[local36.anInt4807 + local88] != 0; local88++) {
		}
		@Pc(102) byte[] local102 = new byte[local88];
		for (@Pc(104) int local104 = 0; local104 < local88; local104++) {
			local102[local104] = local36.method4436();
		}
		local88++;
		local36.anInt4807++;
		@Pc(126) int local126 = local36.anInt4807;
		local36.anInt4807 += local88;
		@Pc(134) int local134;
		for (local134 = 0; local36.aByteArray57[local134 + local36.anInt4807] != 0; local134++) {
		}
		@Pc(148) byte[] local148 = new byte[local134];
		for (@Pc(150) int local150 = 0; local150 < local134; local150++) {
			local148[local150] = local36.method4436();
		}
		local36.anInt4807++;
		local134++;
		@Pc(176) byte[] local176 = new byte[local134];
		@Pc(187) int local187;
		@Pc(189) int local189;
		@Pc(195) int local195;
		if (local134 > 1) {
			local176[1] = 1;
			@Pc(185) int local185 = 1;
			local187 = 2;
			for (local189 = 2; local189 < local134; local189++) {
				local195 = local36.method4421();
				if (local195 == 0) {
					local185 = local187++;
				} else {
					if (local195 <= local185) {
						local195--;
					}
					local185 = local195;
				}
				local176[local189] = (byte) local185;
			}
		} else {
			local187 = local134;
		}
		@Pc(224) Class209[] local224 = new Class209[local187];
		for (local189 = 0; local189 < local224.length; local189++) {
			@Pc(236) Class209 local236 = local224[local189] = new Class209();
			@Pc(240) int local240 = local36.method4421();
			if (local240 > 0) {
				local236.aByteArray92 = new byte[local240 * 2];
			}
			local240 = local36.method4421();
			if (local240 > 0) {
				local236.aByteArray93 = new byte[local240 * 2 + 2];
				local236.aByteArray93[1] = 64;
			}
		}
		local195 = local36.method4421();
		@Pc(289) byte[] local289 = local195 <= 0 ? null : new byte[local195 * 2];
		local195 = local36.method4421();
		@Pc(302) byte[] local302 = local195 <= 0 ? null : new byte[local195 * 2];
		@Pc(304) int local304;
		for (local304 = 0; local36.aByteArray57[local36.anInt4807 + local304] != 0; local304++) {
		}
		@Pc(322) byte[] local322 = new byte[local304];
		for (@Pc(324) int local324 = 0; local324 < local304; local324++) {
			local322[local324] = local36.method4436();
		}
		local304++;
		local36.anInt4807++;
		@Pc(349) int local349 = 0;
		for (@Pc(351) int local351 = 0; local351 < 128; local351++) {
			local349 += local36.method4421();
			this.aShortArray42[local351] = (short) local349;
		}
		local349 = 0;
		for (@Pc(373) int local373 = 0; local373 < 128; local373++) {
			local349 += local36.method4421();
			this.aShortArray42[local373] = (short) (this.aShortArray42[local373] + (local349 << 8));
		}
		@Pc(400) int local400 = 0;
		@Pc(402) int local402 = 0;
		@Pc(404) int local404 = 0;
		for (@Pc(406) int local406 = 0; local406 < 128; local406++) {
			if (local400 == 0) {
				if (local322.length > local402) {
					local400 = local322[local402++];
				} else {
					local400 = -1;
				}
				local404 = local36.method4429();
			}
			this.aShortArray42[local406] = (short) (this.aShortArray42[local406] + ((local404 - 1 & 0x2) << 14));
			local400--;
			this.anIntArray140[local406] = local404;
		}
		local402 = 0;
		local400 = 0;
		@Pc(458) int local458 = 0;
		for (@Pc(460) int local460 = 0; local460 < 128; local460++) {
			if (this.anIntArray140[local460] != 0) {
				if (local400 == 0) {
					if (local402 < local52.length) {
						local400 = local52[local402++];
					} else {
						local400 = -1;
					}
					local458 = local36.aByteArray57[local80++] - 1;
				}
				this.aByteArray20[local460] = (byte) local458;
				local400--;
			}
		}
		local400 = 0;
		local402 = 0;
		@Pc(515) int local515 = 0;
		for (@Pc(517) int local517 = 0; local517 < 128; local517++) {
			if (this.anIntArray140[local517] != 0) {
				if (local400 == 0) {
					if (local102.length > local402) {
						local400 = local102[local402++];
					} else {
						local400 = -1;
					}
					local515 = local36.aByteArray57[local126++] + 16 << 2;
				}
				this.aByteArray19[local517] = (byte) local515;
				local400--;
			}
		}
		local400 = 0;
		local402 = 0;
		@Pc(571) Class209 local571 = null;
		for (@Pc(573) int local573 = 0; local573 < 128; local573++) {
			if (this.anIntArray140[local573] != 0) {
				if (local400 == 0) {
					local571 = local224[local176[local402]];
					if (local402 < local148.length) {
						local400 = local148[local402++];
					} else {
						local400 = -1;
					}
				}
				this.aClass209Array1[local573] = local571;
				local400--;
			}
		}
		local400 = 0;
		local402 = 0;
		@Pc(625) int local625 = 0;
		for (@Pc(627) int local627 = 0; local627 < 128; local627++) {
			if (local400 == 0) {
				if (local322.length <= local402) {
					local400 = -1;
				} else {
					local400 = local322[local402++];
				}
				if (this.anIntArray140[local627] > 0) {
					local625 = local36.method4421() + 1;
				}
			}
			this.aByteArray21[local627] = (byte) local625;
			local400--;
		}
		this.anInt1367 = local36.method4421() + 1;
		@Pc(686) int local686;
		for (@Pc(675) int local675 = 0; local675 < local187; local675++) {
			@Pc(681) Class209 local681 = local224[local675];
			if (local681.aByteArray92 != null) {
				for (local686 = 1; local686 < local681.aByteArray92.length; local686 += 2) {
					local681.aByteArray92[local686] = local36.method4436();
				}
			}
			if (local681.aByteArray93 != null) {
				for (local686 = 3; local686 < local681.aByteArray93.length - 2; local686 += 2) {
					local681.aByteArray93[local686] = local36.method4436();
				}
			}
		}
		@Pc(735) int local735;
		if (local289 != null) {
			for (local735 = 1; local735 < local289.length; local735 += 2) {
				local289[local735] = local36.method4436();
			}
		}
		if (local302 != null) {
			for (local735 = 1; local735 < local302.length; local735 += 2) {
				local302[local735] = local36.method4436();
			}
		}
		@Pc(784) int local784;
		for (local735 = 0; local735 < local187; local735++) {
			@Pc(777) Class209 local777 = local224[local735];
			if (local777.aByteArray93 != null) {
				local349 = 0;
				for (local784 = 2; local784 < local777.aByteArray93.length; local784 += 2) {
					local349 = local36.method4421() + local349 + 1;
					local777.aByteArray93[local784] = (byte) local349;
				}
			}
		}
		@Pc(825) int local825;
		for (local686 = 0; local686 < local187; local686++) {
			@Pc(818) Class209 local818 = local224[local686];
			if (local818.aByteArray92 != null) {
				local349 = 0;
				for (local825 = 2; local825 < local818.aByteArray92.length; local825 += 2) {
					local349 += local36.method4421() + 1;
					local818.aByteArray92[local825] = (byte) local349;
				}
			}
		}
		@Pc(899) int local899;
		@Pc(922) int local922;
		@Pc(928) byte local928;
		@Pc(947) int local947;
		@Pc(949) int local949;
		@Pc(959) int local959;
		@Pc(893) byte local893;
		@Pc(1000) int local1000;
		if (local289 != null) {
			local349 = local36.method4421();
			local289[0] = (byte) local349;
			for (local784 = 2; local784 < local289.length; local784 += 2) {
				local349 = local349 + local36.method4421() + 1;
				local289[local784] = (byte) local349;
			}
			local893 = local289[0];
			@Pc(897) byte local897 = local289[1];
			for (local899 = 0; local899 < local893; local899++) {
				this.aByteArray21[local899] = (byte) (local897 * this.aByteArray21[local899] + 32 >> 6);
			}
			for (local922 = 2; local922 < local289.length; local922 += 2) {
				local928 = local289[local922];
				@Pc(934) byte local934 = local289[local922 + 1];
				local947 = (local928 - local893) * local897 + (local928 - local893) / 2;
				for (local949 = local893; local949 < local928; local949++) {
					local959 = Static136.method2712(local947, local928 - local893);
					local947 += local934 - local897;
					this.aByteArray21[local949] = (byte) (this.aByteArray21[local949] * local959 + 32 >> 6);
				}
				local897 = local934;
				local893 = local928;
			}
			for (local1000 = local893; local1000 < 128; local1000++) {
				this.aByteArray21[local1000] = (byte) (this.aByteArray21[local1000] * local897 + 32 >> 6);
			}
		}
		@Pc(1066) int local1066;
		if (local302 != null) {
			local349 = local36.method4421();
			local302[0] = (byte) local349;
			for (local784 = 2; local784 < local302.length; local784 += 2) {
				local349 = local36.method4421() + local349 + 1;
				local302[local784] = (byte) local349;
			}
			local893 = local302[0];
			local1066 = local302[1] << 1;
			for (local899 = 0; local899 < local893; local899++) {
				local922 = (this.aByteArray19[local899] & 0xFF) + local1066;
				if (local922 < 0) {
					local922 = 0;
				}
				if (local922 > 128) {
					local922 = 128;
				}
				this.aByteArray19[local899] = (byte) local922;
			}
			local922 = 2;
			@Pc(1120) int local1120;
			while (local922 < local302.length) {
				local928 = local302[local922];
				local1120 = local302[local922 + 1] << 1;
				local947 = local1066 * (local928 - local893) + (local928 - local893) / 2;
				for (local949 = local893; local949 < local928; local949++) {
					local959 = Static136.method2712(local947, local928 - local893);
					@Pc(1154) int local1154 = (this.aByteArray19[local949] & 0xFF) + local959;
					if (local1154 < 0) {
						local1154 = 0;
					}
					if (local1154 > 128) {
						local1154 = 128;
					}
					this.aByteArray19[local949] = (byte) local1154;
					local947 += local1120 - local1066;
				}
				local922 += 2;
				local1066 = local1120;
				local893 = local928;
			}
			for (local1000 = local893; local1000 < 128; local1000++) {
				local1120 = (this.aByteArray19[local1000] & 0xFF) + local1066;
				if (local1120 < 0) {
					local1120 = 0;
				}
				if (local1120 > 128) {
					local1120 = 128;
				}
				this.aByteArray19[local1000] = (byte) local1120;
			}
		}
		for (local784 = 0; local784 < local187; local784++) {
			local224[local784].anInt6868 = local36.method4421();
		}
		for (local825 = 0; local825 < local187; local825++) {
			@Pc(1262) Class209 local1262 = local224[local825];
			if (local1262.aByteArray92 != null) {
				local1262.anInt6870 = local36.method4421();
			}
			if (local1262.aByteArray93 != null) {
				local1262.anInt6874 = local36.method4421();
			}
			if (local1262.anInt6868 > 0) {
				local1262.anInt6871 = local36.method4421();
			}
		}
		for (local1066 = 0; local1066 < local187; local1066++) {
			local224[local1066].anInt6877 = local36.method4421();
		}
		for (local899 = 0; local899 < local187; local899++) {
			@Pc(1316) Class209 local1316 = local224[local899];
			if (local1316.anInt6877 > 0) {
				local1316.anInt6873 = local36.method4421();
			}
		}
		for (local922 = 0; local922 < local187; local922++) {
			@Pc(1336) Class209 local1336 = local224[local922];
			if (local1336.anInt6873 > 0) {
				local1336.anInt6878 = local36.method4421();
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!il;[BI[I)Z")
	public boolean method1481(@OriginalArg(0) Class90 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(16) Class2_Sub12_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray140[local18];
				if (local33 != 0) {
					if (local9 != local33) {
						local9 = local33--;
						if ((local33 & 0x1) == 0) {
							local16 = arg0.method2752(local33 >> 2, arg2);
						} else {
							local16 = arg0.method2756(arg2, local33 >> 2);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass2_Sub12_Sub1Array1[local18] = local16;
						this.anIntArray140[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
	public void method1482() {
		this.anIntArray140 = null;
	}
}
