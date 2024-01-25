import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sja")
public final class Class5_Sub46 extends Class5 {

	@OriginalMember(owner = "client!sja", name = "i", descriptor = "[Lclient!ig;")
	public Class163[] aClass163Array1;

	@OriginalMember(owner = "client!sja", name = "j", descriptor = "[B")
	public byte[] aByteArray84;

	@OriginalMember(owner = "client!sja", name = "k", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!sja", name = "n", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!sja", name = "o", descriptor = "I")
	public int anInt8894;

	@OriginalMember(owner = "client!sja", name = "t", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!sja", name = "u", descriptor = "[Lclient!bc;")
	public Class5_Sub9_Sub1[] aClass5_Sub9_Sub1Array1;

	@OriginalMember(owner = "client!sja", name = "v", descriptor = "[I")
	private int[] anIntArray488;

	@OriginalMember(owner = "client!sja", name = "<init>", descriptor = "()V")
	private Class5_Sub46() {
	}

	@OriginalMember(owner = "client!sja", name = "<init>", descriptor = "([B)V")
	public Class5_Sub46(@OriginalArg(0) byte[] arg0) {
		this.aShortArray104 = new short[128];
		this.aByteArray85 = new byte[128];
		this.anIntArray488 = new int[128];
		this.aByteArray86 = new byte[128];
		this.aByteArray84 = new byte[128];
		this.aClass5_Sub9_Sub1Array1 = new Class5_Sub9_Sub1[128];
		this.aClass163Array1 = new Class163[128];
		@Pc(36) Class5_Sub15 local36 = new Class5_Sub15(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray45[local36.anInt4144 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method3677();
		}
		local38++;
		local36.anInt4144++;
		@Pc(80) int local80 = local36.anInt4144;
		local36.anInt4144 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray45[local36.anInt4144 + local88] != 0; local88++) {
		}
		@Pc(102) byte[] local102 = new byte[local88];
		for (@Pc(104) int local104 = 0; local104 < local88; local104++) {
			local102[local104] = local36.method3677();
		}
		local36.anInt4144++;
		local88++;
		@Pc(126) int local126 = local36.anInt4144;
		local36.anInt4144 += local88;
		@Pc(134) int local134;
		for (local134 = 0; local36.aByteArray45[local134 + local36.anInt4144] != 0; local134++) {
		}
		@Pc(148) byte[] local148 = new byte[local134];
		for (@Pc(150) int local150 = 0; local150 < local134; local150++) {
			local148[local150] = local36.method3677();
		}
		local36.anInt4144++;
		local134++;
		@Pc(172) byte[] local172 = new byte[local134];
		@Pc(177) int local177;
		@Pc(189) int local189;
		@Pc(195) int local195;
		if (local134 <= 1) {
			local177 = local134;
		} else {
			local172[1] = 1;
			@Pc(185) int local185 = 1;
			local177 = 2;
			for (local189 = 2; local189 < local134; local189++) {
				local195 = local36.method3642();
				if (local195 == 0) {
					local185 = local177++;
				} else {
					if (local195 <= local185) {
						local195--;
					}
					local185 = local195;
				}
				local172[local189] = (byte) local185;
			}
		}
		@Pc(224) Class163[] local224 = new Class163[local177];
		for (local189 = 0; local189 < local224.length; local189++) {
			@Pc(236) Class163 local236 = local224[local189] = new Class163();
			@Pc(240) int local240 = local36.method3642();
			if (local240 > 0) {
				local236.aByteArray44 = new byte[local240 * 2];
			}
			local240 = local36.method3642();
			if (local240 > 0) {
				local236.aByteArray43 = new byte[local240 * 2 + 2];
				local236.aByteArray43[1] = 64;
			}
		}
		local195 = local36.method3642();
		@Pc(291) byte[] local291 = local195 <= 0 ? null : new byte[local195 * 2];
		local195 = local36.method3642();
		@Pc(307) byte[] local307 = local195 <= 0 ? null : new byte[local195 * 2];
		@Pc(309) int local309;
		for (local309 = 0; local36.aByteArray45[local309 + local36.anInt4144] != 0; local309++) {
		}
		@Pc(323) byte[] local323 = new byte[local309];
		for (@Pc(325) int local325 = 0; local325 < local309; local325++) {
			local323[local325] = local36.method3677();
		}
		local309++;
		local36.anInt4144++;
		@Pc(350) int local350 = 0;
		for (@Pc(352) int local352 = 0; local352 < 128; local352++) {
			local350 += local36.method3642();
			this.aShortArray104[local352] = (short) local350;
		}
		local350 = 0;
		for (@Pc(376) int local376 = 0; local376 < 128; local376++) {
			local350 += local36.method3642();
			this.aShortArray104[local376] = (short) (this.aShortArray104[local376] + (local350 << 8));
		}
		@Pc(403) int local403 = 0;
		@Pc(405) int local405 = 0;
		@Pc(407) int local407 = 0;
		for (@Pc(409) int local409 = 0; local409 < 128; local409++) {
			if (local403 == 0) {
				if (local323.length > local405) {
					local403 = local323[local405++];
				} else {
					local403 = -1;
				}
				local407 = local36.method3681();
			}
			this.aShortArray104[local409] = (short) (this.aShortArray104[local409] + ((local407 - 1 & 0x2) << 14));
			this.anIntArray488[local409] = local407;
			local403--;
		}
		local405 = 0;
		local403 = 0;
		@Pc(463) int local463 = 0;
		for (@Pc(465) int local465 = 0; local465 < 128; local465++) {
			if (this.anIntArray488[local465] != 0) {
				if (local403 == 0) {
					if (local405 < local56.length) {
						local403 = local56[local405++];
					} else {
						local403 = -1;
					}
					local463 = local36.aByteArray45[local80++] - 1;
				}
				this.aByteArray85[local465] = (byte) local463;
				local403--;
			}
		}
		local405 = 0;
		local403 = 0;
		@Pc(519) int local519 = 0;
		for (@Pc(521) int local521 = 0; local521 < 128; local521++) {
			if (this.anIntArray488[local521] != 0) {
				if (local403 == 0) {
					local519 = local36.aByteArray45[local126++] + 16 << 2;
					if (local405 < local102.length) {
						local403 = local102[local405++];
					} else {
						local403 = -1;
					}
				}
				this.aByteArray84[local521] = (byte) local519;
				local403--;
			}
		}
		local403 = 0;
		local405 = 0;
		@Pc(573) Class163 local573 = null;
		for (@Pc(575) int local575 = 0; local575 < 128; local575++) {
			if (this.anIntArray488[local575] != 0) {
				if (local403 == 0) {
					local573 = local224[local172[local405]];
					if (local405 < local148.length) {
						local403 = local148[local405++];
					} else {
						local403 = -1;
					}
				}
				this.aClass163Array1[local575] = local573;
				local403--;
			}
		}
		local403 = 0;
		local405 = 0;
		@Pc(622) int local622 = 0;
		for (@Pc(624) int local624 = 0; local624 < 128; local624++) {
			if (local403 == 0) {
				if (local323.length > local405) {
					local403 = local323[local405++];
				} else {
					local403 = -1;
				}
				if (this.anIntArray488[local624] > 0) {
					local622 = local36.method3642() + 1;
				}
			}
			this.aByteArray86[local624] = (byte) local622;
			local403--;
		}
		this.anInt8894 = local36.method3642() + 1;
		@Pc(690) int local690;
		for (@Pc(679) int local679 = 0; local679 < local177; local679++) {
			@Pc(685) Class163 local685 = local224[local679];
			if (local685.aByteArray44 != null) {
				for (local690 = 1; local690 < local685.aByteArray44.length; local690 += 2) {
					local685.aByteArray44[local690] = local36.method3677();
				}
			}
			if (local685.aByteArray43 != null) {
				for (local690 = 3; local690 < local685.aByteArray43.length - 2; local690 += 2) {
					local685.aByteArray43[local690] = local36.method3677();
				}
			}
		}
		@Pc(739) int local739;
		if (local291 != null) {
			for (local739 = 1; local739 < local291.length; local739 += 2) {
				local291[local739] = local36.method3677();
			}
		}
		if (local307 != null) {
			for (local739 = 1; local739 < local307.length; local739 += 2) {
				local307[local739] = local36.method3677();
			}
		}
		@Pc(784) int local784;
		for (local739 = 0; local739 < local177; local739++) {
			@Pc(777) Class163 local777 = local224[local739];
			if (local777.aByteArray43 != null) {
				local350 = 0;
				for (local784 = 2; local784 < local777.aByteArray43.length; local784 += 2) {
					local350 += local36.method3642() + 1;
					local777.aByteArray43[local784] = (byte) local350;
				}
			}
		}
		@Pc(829) int local829;
		for (local690 = 0; local690 < local177; local690++) {
			@Pc(822) Class163 local822 = local224[local690];
			if (local822.aByteArray44 != null) {
				local350 = 0;
				for (local829 = 2; local829 < local822.aByteArray44.length; local829 += 2) {
					local350 += local36.method3642() + 1;
					local822.aByteArray44[local829] = (byte) local350;
				}
			}
		}
		@Pc(906) int local906;
		@Pc(929) int local929;
		@Pc(935) byte local935;
		@Pc(954) int local954;
		@Pc(956) int local956;
		@Pc(965) int local965;
		@Pc(900) byte local900;
		@Pc(1006) int local1006;
		if (local291 != null) {
			local350 = local36.method3642();
			local291[0] = (byte) local350;
			for (local784 = 2; local784 < local291.length; local784 += 2) {
				local350 = local36.method3642() + local350 + 1;
				local291[local784] = (byte) local350;
			}
			local900 = local291[0];
			@Pc(904) byte local904 = local291[1];
			for (local906 = 0; local906 < local900; local906++) {
				this.aByteArray86[local906] = (byte) (this.aByteArray86[local906] * local904 + 32 >> 6);
			}
			for (local929 = 2; local929 < local291.length; local929 += 2) {
				local935 = local291[local929];
				@Pc(941) byte local941 = local291[local929 + 1];
				local954 = local904 * (local935 - local900) + (local935 - local900) / 2;
				for (local956 = local900; local956 < local935; local956++) {
					local965 = Static536.method7434(local954, local935 - local900);
					this.aByteArray86[local956] = (byte) (this.aByteArray86[local956] * local965 + 32 >> 6);
					local954 += local941 - local904;
				}
				local904 = local941;
				local900 = local935;
			}
			for (local1006 = local900; local1006 < 128; local1006++) {
				this.aByteArray86[local1006] = (byte) (this.aByteArray86[local1006] * local904 + 32 >> 6);
			}
		}
		@Pc(1076) int local1076;
		if (local307 != null) {
			local350 = local36.method3642();
			local307[0] = (byte) local350;
			for (local784 = 2; local784 < local307.length; local784 += 2) {
				local350 = local36.method3642() + local350 + 1;
				local307[local784] = (byte) local350;
			}
			local900 = local307[0];
			local1076 = local307[1] << 1;
			for (local906 = 0; local906 < local900; local906++) {
				local929 = (this.aByteArray84[local906] & 0xFF) + local1076;
				if (local929 < 0) {
					local929 = 0;
				}
				if (local929 > 128) {
					local929 = 128;
				}
				this.aByteArray84[local906] = (byte) local929;
			}
			local929 = 2;
			@Pc(1133) int local1133;
			while (local929 < local307.length) {
				local935 = local307[local929];
				local1133 = local307[local929 + 1] << 1;
				local954 = (local935 - local900) * local1076 + (local935 - local900) / 2;
				for (local956 = local900; local956 < local935; local956++) {
					local965 = Static536.method7434(local954, local935 - local900);
					@Pc(1168) int local1168 = (this.aByteArray84[local956] & 0xFF) + local965;
					if (local1168 < 0) {
						local1168 = 0;
					}
					if (local1168 > 128) {
						local1168 = 128;
					}
					this.aByteArray84[local956] = (byte) local1168;
					local954 += local1133 - local1076;
				}
				local1076 = local1133;
				local929 += 2;
				local900 = local935;
			}
			for (local1006 = local900; local1006 < 128; local1006++) {
				local1133 = (this.aByteArray84[local1006] & 0xFF) + local1076;
				if (local1133 < 0) {
					local1133 = 0;
				}
				if (local1133 > 128) {
					local1133 = 128;
				}
				this.aByteArray84[local1006] = (byte) local1133;
			}
		}
		for (local784 = 0; local784 < local177; local784++) {
			local224[local784].anInt3965 = local36.method3642();
		}
		for (local829 = 0; local829 < local177; local829++) {
			@Pc(1274) Class163 local1274 = local224[local829];
			if (local1274.aByteArray44 != null) {
				local1274.anInt3963 = local36.method3642();
			}
			if (local1274.aByteArray43 != null) {
				local1274.anInt3969 = local36.method3642();
			}
			if (local1274.anInt3965 > 0) {
				local1274.anInt3962 = local36.method3642();
			}
		}
		for (local1076 = 0; local1076 < local177; local1076++) {
			local224[local1076].anInt3964 = local36.method3642();
		}
		for (local906 = 0; local906 < local177; local906++) {
			@Pc(1325) Class163 local1325 = local224[local906];
			if (local1325.anInt3964 > 0) {
				local1325.anInt3967 = local36.method3642();
			}
		}
		for (local929 = 0; local929 < local177; local929++) {
			@Pc(1349) Class163 local1349 = local224[local929];
			if (local1349.anInt3967 > 0) {
				local1349.anInt3966 = local36.method3642();
			}
		}
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(I)V")
	public void method7498() {
		this.anIntArray488 = null;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(Lclient!bia;[B[II)Z")
	public boolean method7499(@OriginalArg(0) Class37 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(17) int local17 = 0;
		@Pc(19) Class5_Sub9_Sub1 local19 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg1 == null || arg1[local21] != 0) {
				@Pc(33) int local33 = this.anIntArray488[local21];
				if (local33 != 0) {
					if (local17 != local33) {
						local17 = local33--;
						if ((local33 & 0x1) == 0) {
							local19 = arg0.method618(local33 >> 2, arg2);
						} else {
							local19 = arg0.method613(local33 >> 2, arg2);
						}
						if (local19 == null) {
							local15 = false;
						}
					}
					if (local19 != null) {
						this.aClass5_Sub9_Sub1Array1[local21] = local19;
						this.anIntArray488[local21] = 0;
					}
				}
			}
		}
		return local15;
	}
}
