import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class7_Sub31 extends Class7 {

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "[Lclient!kf;")
	public Class7_Sub20_Sub1[] aClass7_Sub20_Sub1Array1;

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "[Lclient!qn;")
	public Class173[] aClass173Array1;

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
	public int anInt4939;

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "[I")
	private int[] anIntArray648;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	private Class7_Sub31() {
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "([B)V")
	public Class7_Sub31(@OriginalArg(0) byte[] arg0) {
		this.aShortArray106 = new short[128];
		this.aByteArray72 = new byte[128];
		this.anIntArray648 = new int[128];
		this.aByteArray73 = new byte[128];
		this.aClass173Array1 = new Class173[128];
		this.aClass7_Sub20_Sub1Array1 = new Class7_Sub20_Sub1[128];
		this.aByteArray74 = new byte[128];
		@Pc(36) Class7_Sub3 local36 = new Class7_Sub3(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray33[local36.anInt3005 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method2779();
		}
		local36.anInt3005++;
		local38++;
		@Pc(84) int local84 = local36.anInt3005;
		local36.anInt3005 += local38;
		@Pc(92) int local92;
		for (local92 = 0; local36.aByteArray33[local36.anInt3005 + local92] != 0; local92++) {
		}
		@Pc(109) byte[] local109 = new byte[local92];
		for (@Pc(111) int local111 = 0; local111 < local92; local111++) {
			local109[local111] = local36.method2779();
		}
		local92++;
		local36.anInt3005++;
		@Pc(137) int local137 = local36.anInt3005;
		local36.anInt3005 += local92;
		@Pc(145) int local145;
		for (local145 = 0; local36.aByteArray33[local145 + local36.anInt3005] != 0; local145++) {
		}
		@Pc(159) byte[] local159 = new byte[local145];
		for (@Pc(161) int local161 = 0; local161 < local145; local161++) {
			local159[local161] = local36.method2779();
		}
		local36.anInt3005++;
		local145++;
		@Pc(187) byte[] local187 = new byte[local145];
		@Pc(198) int local198;
		@Pc(200) int local200;
		@Pc(206) int local206;
		if (local145 > 1) {
			local187[1] = 1;
			@Pc(196) int local196 = 1;
			local198 = 2;
			for (local200 = 2; local200 < local145; local200++) {
				local206 = local36.method2772();
				if (local206 == 0) {
					local196 = local198++;
				} else {
					if (local196 >= local206) {
						local206--;
					}
					local196 = local206;
				}
				local187[local200] = (byte) local196;
			}
		} else {
			local198 = local145;
		}
		@Pc(243) Class173[] local243 = new Class173[local198];
		for (local200 = 0; local200 < local243.length; local200++) {
			@Pc(255) Class173 local255 = local243[local200] = new Class173();
			@Pc(259) int local259 = local36.method2772();
			if (local259 > 0) {
				local255.aByteArray76 = new byte[local259 * 2];
			}
			local259 = local36.method2772();
			if (local259 > 0) {
				local255.aByteArray75 = new byte[local259 * 2 + 2];
				local255.aByteArray75[1] = 64;
			}
		}
		local206 = local36.method2772();
		@Pc(314) byte[] local314 = local206 > 0 ? new byte[local206 * 2] : null;
		local206 = local36.method2772();
		@Pc(330) byte[] local330 = local206 <= 0 ? null : new byte[local206 * 2];
		@Pc(332) int local332;
		for (local332 = 0; local36.aByteArray33[local36.anInt3005 + local332] != 0; local332++) {
		}
		@Pc(349) byte[] local349 = new byte[local332];
		for (@Pc(351) int local351 = 0; local351 < local332; local351++) {
			local349[local351] = local36.method2779();
		}
		local332++;
		local36.anInt3005++;
		@Pc(376) int local376 = 0;
		for (@Pc(378) int local378 = 0; local378 < 128; local378++) {
			local376 += local36.method2772();
			this.aShortArray106[local378] = (short) local376;
		}
		local376 = 0;
		for (@Pc(402) int local402 = 0; local402 < 128; local402++) {
			local376 += local36.method2772();
			this.aShortArray106[local402] = (short) (this.aShortArray106[local402] + (local376 << 8));
		}
		@Pc(427) int local427 = 0;
		@Pc(429) int local429 = 0;
		@Pc(431) int local431 = 0;
		for (@Pc(433) int local433 = 0; local433 < 128; local433++) {
			if (local427 == 0) {
				if (local429 >= local349.length) {
					local427 = -1;
				} else {
					local427 = local349[local429++];
				}
				local431 = local36.method2761();
			}
			this.aShortArray106[local433] = (short) (this.aShortArray106[local433] + ((local431 - 1 & 0x2) << 14));
			local427--;
			this.anIntArray648[local433] = local431;
		}
		local429 = 0;
		local427 = 0;
		@Pc(491) int local491 = 0;
		for (@Pc(493) int local493 = 0; local493 < 128; local493++) {
			if (this.anIntArray648[local493] != 0) {
				if (local427 == 0) {
					if (local429 < local56.length) {
						local427 = local56[local429++];
					} else {
						local427 = -1;
					}
					local491 = local36.aByteArray33[local84++] - 1;
				}
				this.aByteArray72[local493] = (byte) local491;
				local427--;
			}
		}
		local427 = 0;
		local429 = 0;
		@Pc(544) int local544 = 0;
		for (@Pc(546) int local546 = 0; local546 < 128; local546++) {
			if (this.anIntArray648[local546] != 0) {
				if (local427 == 0) {
					local544 = local36.aByteArray33[local137++] + 16 << 2;
					if (local109.length > local429) {
						local427 = local109[local429++];
					} else {
						local427 = -1;
					}
				}
				this.aByteArray74[local546] = (byte) local544;
				local427--;
			}
		}
		local429 = 0;
		local427 = 0;
		@Pc(604) Class173 local604 = null;
		for (@Pc(606) int local606 = 0; local606 < 128; local606++) {
			if (this.anIntArray648[local606] != 0) {
				if (local427 == 0) {
					local604 = local243[local187[local429]];
					if (local159.length <= local429) {
						local427 = -1;
					} else {
						local427 = local159[local429++];
					}
				}
				this.aClass173Array1[local606] = local604;
				local427--;
			}
		}
		local429 = 0;
		local427 = 0;
		@Pc(661) int local661 = 0;
		for (@Pc(663) int local663 = 0; local663 < 128; local663++) {
			if (local427 == 0) {
				if (local349.length > local429) {
					local427 = local349[local429++];
				} else {
					local427 = -1;
				}
				if (this.anIntArray648[local663] > 0) {
					local661 = local36.method2772() + 1;
				}
			}
			local427--;
			this.aByteArray73[local663] = (byte) local661;
		}
		this.anInt4939 = local36.method2772() + 1;
		@Pc(728) int local728;
		for (@Pc(717) int local717 = 0; local717 < local198; local717++) {
			@Pc(723) Class173 local723 = local243[local717];
			if (local723.aByteArray76 != null) {
				for (local728 = 1; local728 < local723.aByteArray76.length; local728 += 2) {
					local723.aByteArray76[local728] = local36.method2779();
				}
			}
			if (local723.aByteArray75 != null) {
				for (local728 = 3; local728 < local723.aByteArray75.length - 2; local728 += 2) {
					local723.aByteArray75[local728] = local36.method2779();
				}
			}
		}
		@Pc(777) int local777;
		if (local314 != null) {
			for (local777 = 1; local777 < local314.length; local777 += 2) {
				local314[local777] = local36.method2779();
			}
		}
		if (local330 != null) {
			for (local777 = 1; local777 < local330.length; local777 += 2) {
				local330[local777] = local36.method2779();
			}
		}
		@Pc(826) int local826;
		for (local777 = 0; local777 < local198; local777++) {
			@Pc(819) Class173 local819 = local243[local777];
			if (local819.aByteArray75 != null) {
				local376 = 0;
				for (local826 = 2; local826 < local819.aByteArray75.length; local826 += 2) {
					local376 += local36.method2772() + 1;
					local819.aByteArray75[local826] = (byte) local376;
				}
			}
		}
		@Pc(875) int local875;
		for (local728 = 0; local728 < local198; local728++) {
			@Pc(868) Class173 local868 = local243[local728];
			if (local868.aByteArray76 != null) {
				local376 = 0;
				for (local875 = 2; local875 < local868.aByteArray76.length; local875 += 2) {
					local376 = local376 + local36.method2772() + 1;
					local868.aByteArray76[local875] = (byte) local376;
				}
			}
		}
		@Pc(952) int local952;
		@Pc(979) int local979;
		@Pc(985) byte local985;
		@Pc(1005) int local1005;
		@Pc(1007) int local1007;
		@Pc(1017) int local1017;
		@Pc(946) byte local946;
		@Pc(1057) int local1057;
		if (local314 != null) {
			local376 = local36.method2772();
			local314[0] = (byte) local376;
			for (local826 = 2; local826 < local314.length; local826 += 2) {
				local376 = local36.method2772() + local376 + 1;
				local314[local826] = (byte) local376;
			}
			local946 = local314[0];
			@Pc(950) byte local950 = local314[1];
			for (local952 = 0; local952 < local946; local952++) {
				this.aByteArray73[local952] = (byte) (local950 * this.aByteArray73[local952] + 32 >> 6);
			}
			for (local979 = 2; local979 < local314.length; local979 += 2) {
				local985 = local314[local979];
				@Pc(991) byte local991 = local314[local979 + 1];
				local1005 = (local985 - local946) / 2 + local950 * (local985 - local946);
				for (local1007 = local946; local1007 < local985; local1007++) {
					local1017 = Static247.method4269(local985 - local946, local1005);
					local1005 += local991 - local950;
					this.aByteArray73[local1007] = (byte) (this.aByteArray73[local1007] * local1017 + 32 >> 6);
				}
				local946 = local985;
				local950 = local991;
			}
			for (local1057 = local946; local1057 < 128; local1057++) {
				this.aByteArray73[local1057] = (byte) (this.aByteArray73[local1057] * local950 + 32 >> 6);
			}
		}
		@Pc(1127) int local1127;
		if (local330 != null) {
			local376 = local36.method2772();
			local330[0] = (byte) local376;
			for (local826 = 2; local826 < local330.length; local826 += 2) {
				local376 = local36.method2772() + local376 + 1;
				local330[local826] = (byte) local376;
			}
			local946 = local330[0];
			local1127 = local330[1] << 1;
			for (local952 = 0; local952 < local946; local952++) {
				local979 = local1127 + (this.aByteArray74[local952] & 0xFF);
				if (local979 < 0) {
					local979 = 0;
				}
				if (local979 > 128) {
					local979 = 128;
				}
				this.aByteArray74[local952] = (byte) local979;
			}
			local979 = 2;
			@Pc(1181) int local1181;
			while (local330.length > local979) {
				local985 = local330[local979];
				local1181 = local330[local979 + 1] << 1;
				local1005 = (local985 - local946) / 2 + local1127 * (local985 - local946);
				for (local1007 = local946; local1007 < local985; local1007++) {
					local1017 = Static247.method4269(local985 - local946, local1005);
					@Pc(1215) int local1215 = (this.aByteArray74[local1007] & 0xFF) + local1017;
					if (local1215 < 0) {
						local1215 = 0;
					}
					if (local1215 > 128) {
						local1215 = 128;
					}
					this.aByteArray74[local1007] = (byte) local1215;
					local1005 += local1181 - local1127;
				}
				local946 = local985;
				local979 += 2;
				local1127 = local1181;
			}
			for (local1057 = local946; local1057 < 128; local1057++) {
				local1181 = local1127 + (this.aByteArray74[local1057] & 0xFF);
				if (local1181 < 0) {
					local1181 = 0;
				}
				if (local1181 > 128) {
					local1181 = 128;
				}
				this.aByteArray74[local1057] = (byte) local1181;
			}
		}
		for (local826 = 0; local826 < local198; local826++) {
			local243[local826].anInt5053 = local36.method2772();
		}
		for (local875 = 0; local875 < local198; local875++) {
			@Pc(1322) Class173 local1322 = local243[local875];
			if (local1322.aByteArray76 != null) {
				local1322.anInt5056 = local36.method2772();
			}
			if (local1322.aByteArray75 != null) {
				local1322.anInt5052 = local36.method2772();
			}
			if (local1322.anInt5053 > 0) {
				local1322.anInt5050 = local36.method2772();
			}
		}
		for (local1127 = 0; local1127 < local198; local1127++) {
			local243[local1127].anInt5047 = local36.method2772();
		}
		for (local952 = 0; local952 < local198; local952++) {
			@Pc(1377) Class173 local1377 = local243[local952];
			if (local1377.anInt5047 > 0) {
				local1377.anInt5055 = local36.method2772();
			}
		}
		for (local979 = 0; local979 < local198; local979++) {
			@Pc(1401) Class173 local1401 = local243[local979];
			if (local1401.anInt5055 > 0) {
				local1401.anInt5057 = local36.method2772();
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
	public void method4308() {
		this.anIntArray648 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([B[IBLclient!ie;)Z")
	public boolean method4310(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class7_Sub20_Sub1 local11 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg0 == null || arg0[local21] != 0) {
				@Pc(33) int local33 = this.anIntArray648[local21];
				if (local33 != 0) {
					if (local9 != local33) {
						local9 = local33--;
						if ((local33 & 0x1) == 0) {
							local11 = arg2.method2641(local33 >> 2, arg1);
						} else {
							local11 = arg2.method2642(local33 >> 2, arg1);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass7_Sub20_Sub1Array1[local21] = local11;
						this.anIntArray648[local21] = 0;
					}
				}
			}
		}
		return local7;
	}
}
