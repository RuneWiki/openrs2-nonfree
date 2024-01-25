import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
	public int anInt1559;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "[Lclient!uv;")
	public Class297[] aClass297Array1;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "[Lclient!qk;")
	public Class1_Sub32_Sub1[] aClass1_Sub32_Sub1Array1;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	private Class1_Sub8() {
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([B)V")
	public Class1_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub32_Sub1Array1 = new Class1_Sub32_Sub1[128];
		this.aByteArray20 = new byte[128];
		this.aClass297Array1 = new Class297[128];
		this.aShortArray19 = new short[128];
		this.anIntArray143 = new int[128];
		this.aByteArray19 = new byte[128];
		this.aByteArray18 = new byte[128];
		@Pc(36) Class1_Sub13 local36 = new Class1_Sub13(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray45[local38 + local36.anInt3400] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method3073();
		}
		local36.anInt3400++;
		local38++;
		@Pc(79) int local79 = local36.anInt3400;
		local36.anInt3400 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray45[local36.anInt3400 + local87] != 0; local87++) {
		}
		@Pc(102) byte[] local102 = new byte[local87];
		for (@Pc(104) int local104 = 0; local104 < local87; local104++) {
			local102[local104] = local36.method3073();
		}
		local36.anInt3400++;
		local87++;
		@Pc(126) int local126 = local36.anInt3400;
		local36.anInt3400 += local87;
		@Pc(134) int local134;
		for (local134 = 0; local36.aByteArray45[local36.anInt3400 + local134] != 0; local134++) {
		}
		@Pc(148) byte[] local148 = new byte[local134];
		for (@Pc(150) int local150 = 0; local150 < local134; local150++) {
			local148[local150] = local36.method3073();
		}
		local134++;
		local36.anInt3400++;
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
				local195 = local36.method3043();
				if (local195 == 0) {
					local185 = local177++;
				} else {
					if (local185 >= local195) {
						local195--;
					}
					local185 = local195;
				}
				local172[local189] = (byte) local185;
			}
		}
		@Pc(220) Class297[] local220 = new Class297[local177];
		for (local189 = 0; local189 < local220.length; local189++) {
			@Pc(232) Class297 local232 = local220[local189] = new Class297();
			@Pc(236) int local236 = local36.method3043();
			if (local236 > 0) {
				local232.aByteArray108 = new byte[local236 * 2];
			}
			local236 = local36.method3043();
			if (local236 > 0) {
				local232.aByteArray107 = new byte[local236 * 2 + 2];
				local232.aByteArray107[1] = 64;
			}
		}
		local195 = local36.method3043();
		@Pc(294) byte[] local294 = local195 > 0 ? new byte[local195 * 2] : null;
		local195 = local36.method3043();
		@Pc(307) byte[] local307 = local195 <= 0 ? null : new byte[local195 * 2];
		@Pc(309) int local309;
		for (local309 = 0; local36.aByteArray45[local309 + local36.anInt3400] != 0; local309++) {
		}
		@Pc(323) byte[] local323 = new byte[local309];
		for (@Pc(325) int local325 = 0; local325 < local309; local325++) {
			local323[local325] = local36.method3073();
		}
		local309++;
		local36.anInt3400++;
		@Pc(346) int local346 = 0;
		for (@Pc(348) int local348 = 0; local348 < 128; local348++) {
			local346 += local36.method3043();
			this.aShortArray19[local348] = (short) local346;
		}
		local346 = 0;
		for (@Pc(372) int local372 = 0; local372 < 128; local372++) {
			local346 += local36.method3043();
			this.aShortArray19[local372] = (short) (this.aShortArray19[local372] + (local346 << 8));
		}
		@Pc(399) int local399 = 0;
		@Pc(401) int local401 = 0;
		@Pc(403) int local403 = 0;
		for (@Pc(405) int local405 = 0; local405 < 128; local405++) {
			if (local399 == 0) {
				if (local323.length <= local401) {
					local399 = -1;
				} else {
					local399 = local323[local401++];
				}
				local403 = local36.method3032();
			}
			this.aShortArray19[local405] = (short) (this.aShortArray19[local405] + ((local403 - 1 & 0x2) << 14));
			this.anIntArray143[local405] = local403;
			local399--;
		}
		local401 = 0;
		local399 = 0;
		@Pc(464) int local464 = 0;
		for (@Pc(466) int local466 = 0; local466 < 128; local466++) {
			if (this.anIntArray143[local466] != 0) {
				if (local399 == 0) {
					if (local55.length <= local401) {
						local399 = -1;
					} else {
						local399 = local55[local401++];
					}
					local464 = local36.aByteArray45[local79++] - 1;
				}
				local399--;
				this.aByteArray18[local466] = (byte) local464;
			}
		}
		local401 = 0;
		local399 = 0;
		@Pc(521) int local521 = 0;
		for (@Pc(523) int local523 = 0; local523 < 128; local523++) {
			if (this.anIntArray143[local523] != 0) {
				if (local399 == 0) {
					local521 = local36.aByteArray45[local126++] + 16 << 2;
					if (local102.length > local401) {
						local399 = local102[local401++];
					} else {
						local399 = -1;
					}
				}
				this.aByteArray19[local523] = (byte) local521;
				local399--;
			}
		}
		local399 = 0;
		local401 = 0;
		@Pc(579) Class297 local579 = null;
		for (@Pc(581) int local581 = 0; local581 < 128; local581++) {
			if (this.anIntArray143[local581] != 0) {
				if (local399 == 0) {
					local579 = local220[local172[local401]];
					if (local401 < local148.length) {
						local399 = local148[local401++];
					} else {
						local399 = -1;
					}
				}
				local399--;
				this.aClass297Array1[local581] = local579;
			}
		}
		local399 = 0;
		local401 = 0;
		@Pc(630) int local630 = 0;
		for (@Pc(632) int local632 = 0; local632 < 128; local632++) {
			if (local399 == 0) {
				if (local401 < local323.length) {
					local399 = local323[local401++];
				} else {
					local399 = -1;
				}
				if (this.anIntArray143[local632] > 0) {
					local630 = local36.method3043() + 1;
				}
			}
			local399--;
			this.aByteArray20[local632] = (byte) local630;
		}
		this.anInt1559 = local36.method3043() + 1;
		@Pc(694) int local694;
		for (@Pc(683) int local683 = 0; local683 < local177; local683++) {
			@Pc(689) Class297 local689 = local220[local683];
			if (local689.aByteArray108 != null) {
				for (local694 = 1; local694 < local689.aByteArray108.length; local694 += 2) {
					local689.aByteArray108[local694] = local36.method3073();
				}
			}
			if (local689.aByteArray107 != null) {
				for (local694 = 3; local694 < local689.aByteArray107.length - 2; local694 += 2) {
					local689.aByteArray107[local694] = local36.method3073();
				}
			}
		}
		@Pc(743) int local743;
		if (local294 != null) {
			for (local743 = 1; local743 < local294.length; local743 += 2) {
				local294[local743] = local36.method3073();
			}
		}
		if (local307 != null) {
			for (local743 = 1; local743 < local307.length; local743 += 2) {
				local307[local743] = local36.method3073();
			}
		}
		@Pc(792) int local792;
		for (local743 = 0; local743 < local177; local743++) {
			@Pc(785) Class297 local785 = local220[local743];
			if (local785.aByteArray107 != null) {
				local346 = 0;
				for (local792 = 2; local792 < local785.aByteArray107.length; local792 += 2) {
					local346 = local346 + local36.method3043() + 1;
					local785.aByteArray107[local792] = (byte) local346;
				}
			}
		}
		@Pc(834) int local834;
		for (local694 = 0; local694 < local177; local694++) {
			@Pc(827) Class297 local827 = local220[local694];
			if (local827.aByteArray108 != null) {
				local346 = 0;
				for (local834 = 2; local834 < local827.aByteArray108.length; local834 += 2) {
					local346 = local346 + local36.method3043() + 1;
					local827.aByteArray108[local834] = (byte) local346;
				}
			}
		}
		@Pc(913) int local913;
		@Pc(940) int local940;
		@Pc(946) byte local946;
		@Pc(966) int local966;
		@Pc(968) int local968;
		@Pc(978) int local978;
		@Pc(907) byte local907;
		@Pc(1025) int local1025;
		if (local294 != null) {
			local346 = local36.method3043();
			local294[0] = (byte) local346;
			for (local792 = 2; local792 < local294.length; local792 += 2) {
				local346 = local346 + local36.method3043() + 1;
				local294[local792] = (byte) local346;
			}
			local907 = local294[0];
			@Pc(911) byte local911 = local294[1];
			for (local913 = 0; local913 < local907; local913++) {
				this.aByteArray20[local913] = (byte) (this.aByteArray20[local913] * local911 + 32 >> 6);
			}
			local940 = 2;
			while (local940 < local294.length) {
				local946 = local294[local940];
				@Pc(952) byte local952 = local294[local940 + 1];
				local966 = (local946 - local907) * local911 + (local946 - local907) / 2;
				for (local968 = local907; local968 < local946; local968++) {
					local978 = Static226.method3965(local966, local946 - local907);
					local966 += local952 - local911;
					this.aByteArray20[local968] = (byte) (this.aByteArray20[local968] * local978 + 32 >> 6);
				}
				local907 = local946;
				local940 += 2;
				local911 = local952;
			}
			for (local1025 = local907; local1025 < 128; local1025++) {
				this.aByteArray20[local1025] = (byte) (local911 * this.aByteArray20[local1025] + 32 >> 6);
			}
		}
		@Pc(1096) int local1096;
		if (local307 != null) {
			local346 = local36.method3043();
			local307[0] = (byte) local346;
			for (local792 = 2; local792 < local307.length; local792 += 2) {
				local346 = local346 + local36.method3043() + 1;
				local307[local792] = (byte) local346;
			}
			local907 = local307[0];
			local1096 = local307[1] << 1;
			for (local913 = 0; local913 < local907; local913++) {
				local940 = local1096 + (this.aByteArray19[local913] & 0xFF);
				if (local940 < 0) {
					local940 = 0;
				}
				if (local940 > 128) {
					local940 = 128;
				}
				this.aByteArray19[local913] = (byte) local940;
			}
			local940 = 2;
			@Pc(1149) int local1149;
			while (local940 < local307.length) {
				local946 = local307[local940];
				local1149 = local307[local940 + 1] << 1;
				local966 = local1096 * (local946 - local907) + (local946 - local907) / 2;
				for (local968 = local907; local968 < local946; local968++) {
					local978 = Static226.method3965(local966, local946 - local907);
					@Pc(1185) int local1185 = (this.aByteArray19[local968] & 0xFF) + local978;
					if (local1185 < 0) {
						local1185 = 0;
					}
					if (local1185 > 128) {
						local1185 = 128;
					}
					this.aByteArray19[local968] = (byte) local1185;
					local966 += local1149 - local1096;
				}
				local907 = local946;
				local940 += 2;
				local1096 = local1149;
			}
			for (local1025 = local907; local1025 < 128; local1025++) {
				local1149 = local1096 + (this.aByteArray19[local1025] & 0xFF);
				if (local1149 < 0) {
					local1149 = 0;
				}
				if (local1149 > 128) {
					local1149 = 128;
				}
				this.aByteArray19[local1025] = (byte) local1149;
			}
		}
		for (local792 = 0; local792 < local177; local792++) {
			local220[local792].anInt8473 = local36.method3043();
		}
		for (local834 = 0; local834 < local177; local834++) {
			@Pc(1295) Class297 local1295 = local220[local834];
			if (local1295.aByteArray108 != null) {
				local1295.anInt8475 = local36.method3043();
			}
			if (local1295.aByteArray107 != null) {
				local1295.anInt8472 = local36.method3043();
			}
			if (local1295.anInt8473 > 0) {
				local1295.anInt8478 = local36.method3043();
			}
		}
		for (local1096 = 0; local1096 < local177; local1096++) {
			local220[local1096].anInt8477 = local36.method3043();
		}
		for (local913 = 0; local913 < local177; local913++) {
			@Pc(1353) Class297 local1353 = local220[local913];
			if (local1353.anInt8477 > 0) {
				local1353.anInt8470 = local36.method3043();
			}
		}
		for (local940 = 0; local940 < local177; local940++) {
			@Pc(1377) Class297 local1377 = local220[local940];
			if (local1377.anInt8470 > 0) {
				local1377.anInt8471 = local36.method3043();
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!iba;I[I[B)Z")
	public boolean method1555(@OriginalArg(0) Class131 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub32_Sub1 local11 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg2 == null || arg2[local21] != 0) {
				@Pc(33) int local33 = this.anIntArray143[local21];
				if (local33 != 0) {
					if (local9 != local33) {
						local9 = local33--;
						if ((local33 & 0x1) == 0) {
							local11 = arg0.method3657(arg1, local33 >> 2);
						} else {
							local11 = arg0.method3649(arg1, local33 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub32_Sub1Array1[local21] = local11;
						this.anIntArray143[local21] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public void method1556() {
		this.anIntArray143 = null;
	}
}
