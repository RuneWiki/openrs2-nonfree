import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class3_Sub35 extends Class3 {

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
	public int anInt6007;

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "[Lclient!uga;")
	public Class353[] aClass353Array1;

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "[I")
	private int[] anIntArray327;

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!lq", name = "v", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!lq", name = "w", descriptor = "[Lclient!pv;")
	public Class3_Sub39_Sub1[] aClass3_Sub39_Sub1Array1;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
	private Class3_Sub35() {
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "([B)V")
	public Class3_Sub35(@OriginalArg(0) byte[] arg0) {
		this.aByteArray52 = new byte[128];
		this.aByteArray51 = new byte[128];
		this.aByteArray53 = new byte[128];
		this.aClass353Array1 = new Class353[128];
		this.aClass3_Sub39_Sub1Array1 = new Class3_Sub39_Sub1[128];
		this.aShortArray72 = new short[128];
		this.anIntArray327 = new int[128];
		@Pc(36) Class3_Sub4 local36 = new Class3_Sub4(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray90[local36.anInt9739 + local38] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method7960();
		}
		local36.anInt9739++;
		local38++;
		@Pc(83) int local83 = local36.anInt9739;
		local36.anInt9739 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray90[local91 + local36.anInt9739] != 0; local91++) {
		}
		@Pc(105) byte[] local105 = new byte[local91];
		for (@Pc(107) int local107 = 0; local107 < local91; local107++) {
			local105[local107] = local36.method7960();
		}
		local36.anInt9739++;
		local91++;
		@Pc(133) int local133 = local36.anInt9739;
		local36.anInt9739 += local91;
		@Pc(141) int local141;
		for (local141 = 0; local36.aByteArray90[local36.anInt9739 + local141] != 0; local141++) {
		}
		@Pc(155) byte[] local155 = new byte[local141];
		for (@Pc(157) int local157 = 0; local157 < local141; local157++) {
			local155[local157] = local36.method7960();
		}
		local141++;
		local36.anInt9739++;
		@Pc(179) byte[] local179 = new byte[local141];
		@Pc(186) int local186;
		@Pc(198) int local198;
		@Pc(204) int local204;
		if (local141 <= 1) {
			local186 = local141;
		} else {
			local179[1] = 1;
			@Pc(194) int local194 = 1;
			local186 = 2;
			for (local198 = 2; local198 < local141; local198++) {
				local204 = local36.method7954();
				if (local204 == 0) {
					local194 = local186++;
				} else {
					if (local194 >= local204) {
						local204--;
					}
					local194 = local204;
				}
				local179[local198] = (byte) local194;
			}
		}
		@Pc(233) Class353[] local233 = new Class353[local186];
		for (local198 = 0; local198 < local233.length; local198++) {
			@Pc(245) Class353 local245 = local233[local198] = new Class353();
			@Pc(249) int local249 = local36.method7954();
			if (local249 > 0) {
				local245.aByteArray92 = new byte[local249 * 2];
			}
			local249 = local36.method7954();
			if (local249 > 0) {
				local245.aByteArray91 = new byte[local249 * 2 + 2];
				local245.aByteArray91[1] = 64;
			}
		}
		local204 = local36.method7954();
		@Pc(297) byte[] local297 = local204 > 0 ? new byte[local204 * 2] : null;
		local204 = local36.method7954();
		@Pc(313) byte[] local313 = local204 <= 0 ? null : new byte[local204 * 2];
		@Pc(315) int local315;
		for (local315 = 0; local36.aByteArray90[local315 + local36.anInt9739] != 0; local315++) {
		}
		@Pc(332) byte[] local332 = new byte[local315];
		for (@Pc(334) int local334 = 0; local334 < local315; local334++) {
			local332[local334] = local36.method7960();
		}
		local36.anInt9739++;
		local315++;
		@Pc(359) int local359 = 0;
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			local359 += local36.method7954();
			this.aShortArray72[local361] = (short) local359;
		}
		local359 = 0;
		for (@Pc(383) int local383 = 0; local383 < 128; local383++) {
			local359 += local36.method7954();
			this.aShortArray72[local383] = (short) (this.aShortArray72[local383] + (local359 << 8));
		}
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		for (@Pc(414) int local414 = 0; local414 < 128; local414++) {
			if (local408 == 0) {
				if (local332.length > local410) {
					local408 = local332[local410++];
				} else {
					local408 = -1;
				}
				local412 = local36.method7925();
			}
			this.aShortArray72[local414] = (short) (this.aShortArray72[local414] + ((local412 - 1 & 0x2) << 14));
			this.anIntArray327[local414] = local412;
			local408--;
		}
		local408 = 0;
		local410 = 0;
		@Pc(466) int local466 = 0;
		for (@Pc(468) int local468 = 0; local468 < 128; local468++) {
			if (this.anIntArray327[local468] != 0) {
				if (local408 == 0) {
					if (local410 < local55.length) {
						local408 = local55[local410++];
					} else {
						local408 = -1;
					}
					local466 = local36.aByteArray90[local83++] - 1;
				}
				local408--;
				this.aByteArray51[local468] = (byte) local466;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(524) int local524 = 0;
		for (@Pc(526) int local526 = 0; local526 < 128; local526++) {
			if (this.anIntArray327[local526] != 0) {
				if (local408 == 0) {
					if (local410 < local105.length) {
						local408 = local105[local410++];
					} else {
						local408 = -1;
					}
					local524 = local36.aByteArray90[local133++] + 16 << 2;
				}
				this.aByteArray53[local526] = (byte) local524;
				local408--;
			}
		}
		local410 = 0;
		local408 = 0;
		@Pc(582) Class353 local582 = null;
		for (@Pc(584) int local584 = 0; local584 < 128; local584++) {
			if (this.anIntArray327[local584] != 0) {
				if (local408 == 0) {
					local582 = local233[local179[local410]];
					if (local410 < local155.length) {
						local408 = local155[local410++];
					} else {
						local408 = -1;
					}
				}
				this.aClass353Array1[local584] = local582;
				local408--;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(639) int local639 = 0;
		for (@Pc(641) int local641 = 0; local641 < 128; local641++) {
			if (local408 == 0) {
				if (local410 < local332.length) {
					local408 = local332[local410++];
				} else {
					local408 = -1;
				}
				if (this.anIntArray327[local641] > 0) {
					local639 = local36.method7954() + 1;
				}
			}
			local408--;
			this.aByteArray52[local641] = (byte) local639;
		}
		this.anInt6007 = local36.method7954() + 1;
		@Pc(705) int local705;
		for (@Pc(694) int local694 = 0; local694 < local186; local694++) {
			@Pc(700) Class353 local700 = local233[local694];
			if (local700.aByteArray92 != null) {
				for (local705 = 1; local705 < local700.aByteArray92.length; local705 += 2) {
					local700.aByteArray92[local705] = local36.method7960();
				}
			}
			if (local700.aByteArray91 != null) {
				for (local705 = 3; local705 < local700.aByteArray91.length - 2; local705 += 2) {
					local700.aByteArray91[local705] = local36.method7960();
				}
			}
		}
		@Pc(758) int local758;
		if (local297 != null) {
			for (local758 = 1; local758 < local297.length; local758 += 2) {
				local297[local758] = local36.method7960();
			}
		}
		if (local313 != null) {
			for (local758 = 1; local758 < local313.length; local758 += 2) {
				local313[local758] = local36.method7960();
			}
		}
		@Pc(807) int local807;
		for (local758 = 0; local758 < local186; local758++) {
			@Pc(800) Class353 local800 = local233[local758];
			if (local800.aByteArray91 != null) {
				local359 = 0;
				for (local807 = 2; local807 < local800.aByteArray91.length; local807 += 2) {
					local359 = local359 + local36.method7954() + 1;
					local800.aByteArray91[local807] = (byte) local359;
				}
			}
		}
		@Pc(853) int local853;
		for (local705 = 0; local705 < local186; local705++) {
			@Pc(846) Class353 local846 = local233[local705];
			if (local846.aByteArray92 != null) {
				local359 = 0;
				for (local853 = 2; local853 < local846.aByteArray92.length; local853 += 2) {
					local359 = local36.method7954() + local359 + 1;
					local846.aByteArray92[local853] = (byte) local359;
				}
			}
		}
		@Pc(930) int local930;
		@Pc(957) int local957;
		@Pc(963) byte local963;
		@Pc(983) int local983;
		@Pc(985) int local985;
		@Pc(994) int local994;
		@Pc(924) byte local924;
		@Pc(1037) int local1037;
		if (local297 != null) {
			local359 = local36.method7954();
			local297[0] = (byte) local359;
			for (local807 = 2; local807 < local297.length; local807 += 2) {
				local359 = local36.method7954() + local359 + 1;
				local297[local807] = (byte) local359;
			}
			local924 = local297[0];
			@Pc(928) byte local928 = local297[1];
			for (local930 = 0; local930 < local924; local930++) {
				this.aByteArray52[local930] = (byte) (local928 * this.aByteArray52[local930] + 32 >> 6);
			}
			local957 = 2;
			while (local957 < local297.length) {
				local963 = local297[local957];
				@Pc(969) byte local969 = local297[local957 + 1];
				local983 = (local963 - local924) / 2 + local928 * (local963 - local924);
				for (local985 = local924; local985 < local963; local985++) {
					local994 = Static501.method6575(local963 - local924, local983);
					this.aByteArray52[local985] = (byte) (this.aByteArray52[local985] * local994 + 32 >> 6);
					local983 += local969 - local928;
				}
				local957 += 2;
				local928 = local969;
				local924 = local963;
			}
			for (local1037 = local924; local1037 < 128; local1037++) {
				this.aByteArray52[local1037] = (byte) (this.aByteArray52[local1037] * local928 + 32 >> 6);
			}
		}
		@Pc(1101) int local1101;
		if (local313 != null) {
			local359 = local36.method7954();
			local313[0] = (byte) local359;
			for (local807 = 2; local807 < local313.length; local807 += 2) {
				local359 = local36.method7954() + local359 + 1;
				local313[local807] = (byte) local359;
			}
			local924 = local313[0];
			local1101 = local313[1] << 1;
			for (local930 = 0; local930 < local924; local930++) {
				local957 = (this.aByteArray53[local930] & 0xFF) + local1101;
				if (local957 < 0) {
					local957 = 0;
				}
				if (local957 > 128) {
					local957 = 128;
				}
				this.aByteArray53[local930] = (byte) local957;
			}
			local957 = 2;
			@Pc(1153) int local1153;
			while (local957 < local313.length) {
				local963 = local313[local957];
				local1153 = local313[local957 + 1] << 1;
				local983 = (local963 - local924) / 2 + local1101 * (local963 - local924);
				for (local985 = local924; local985 < local963; local985++) {
					local994 = Static501.method6575(local963 - local924, local983);
					@Pc(1187) int local1187 = (this.aByteArray53[local985] & 0xFF) + local994;
					if (local1187 < 0) {
						local1187 = 0;
					}
					if (local1187 > 128) {
						local1187 = 128;
					}
					this.aByteArray53[local985] = (byte) local1187;
					local983 += local1153 - local1101;
				}
				local924 = local963;
				local957 += 2;
				local1101 = local1153;
			}
			for (local1037 = local924; local1037 < 128; local1037++) {
				local1153 = (this.aByteArray53[local1037] & 0xFF) + local1101;
				if (local1153 < 0) {
					local1153 = 0;
				}
				if (local1153 > 128) {
					local1153 = 128;
				}
				this.aByteArray53[local1037] = (byte) local1153;
			}
		}
		for (local807 = 0; local807 < local186; local807++) {
			local233[local807].anInt10118 = local36.method7954();
		}
		for (local853 = 0; local853 < local186; local853++) {
			@Pc(1289) Class353 local1289 = local233[local853];
			if (local1289.aByteArray92 != null) {
				local1289.anInt10125 = local36.method7954();
			}
			if (local1289.aByteArray91 != null) {
				local1289.anInt10124 = local36.method7954();
			}
			if (local1289.anInt10118 > 0) {
				local1289.anInt10119 = local36.method7954();
			}
		}
		for (local1101 = 0; local1101 < local186; local1101++) {
			local233[local1101].anInt10122 = local36.method7954();
		}
		for (local930 = 0; local930 < local186; local930++) {
			@Pc(1348) Class353 local1348 = local233[local930];
			if (local1348.anInt10122 > 0) {
				local1348.anInt10123 = local36.method7954();
			}
		}
		for (local957 = 0; local957 < local186; local957++) {
			@Pc(1368) Class353 local1368 = local233[local957];
			if (local1368.anInt10123 > 0) {
				local1368.anInt10121 = local36.method7954();
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	public void method5059() {
		this.anIntArray327 = null;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZLclient!cga;[I[B)Z")
	public boolean method5060(@OriginalArg(1) Class53 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class3_Sub39_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray327[local13];
				if (local28 != 0) {
					if (local28 != local9) {
						local9 = local28--;
						if ((local28 & 0x1) == 0) {
							local11 = arg0.method1301(local28 >> 2, arg1);
						} else {
							local11 = arg0.method1300(arg1, local28 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass3_Sub39_Sub1Array1[local13] = local11;
						this.anIntArray327[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
