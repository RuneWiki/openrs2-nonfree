import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class3_Sub22 extends Class3 {

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "[S")
	public final short[] aShortArray30;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "[B")
	public final byte[] aByteArray41;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "[B")
	public final byte[] aByteArray42;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "[Lclient!ph;")
	public final Class66[] aClass66Array1;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "[I")
	private int[] anIntArray385;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "[B")
	public final byte[] aByteArray43;

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
	public final int anInt3296;

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "[Lclient!wc;")
	public final Class3_Sub9_Sub1[] aClass3_Sub9_Sub1Array1;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
	public Class3_Sub22(@OriginalArg(0) byte[] arg0) {
		@Pc(5) int local5 = 0;
		this.aByteArray42 = new byte[128];
		this.anIntArray385 = new int[128];
		this.aByteArray41 = new byte[128];
		this.aShortArray30 = new short[128];
		this.aClass3_Sub9_Sub1Array1 = new Class3_Sub9_Sub1[128];
		this.aByteArray43 = new byte[128];
		this.aClass66Array1 = new Class66[128];
		@Pc(38) Class3_Sub4 local38 = new Class3_Sub4(arg0);
		while (local38.aByteArray5[local38.anInt232 + local5] != 0) {
			local5++;
		}
		@Pc(53) byte[] local53 = new byte[local5];
		for (@Pc(55) int local55 = 0; local55 < local5; local55++) {
			local53[local55] = local38.method203();
		}
		local5++;
		local38.anInt232++;
		@Pc(81) int local81 = local38.anInt232;
		@Pc(83) int local83 = 0;
		local38.anInt232 += local5;
		while (local38.aByteArray5[local83 + local38.anInt232] != 0) {
			local83++;
		}
		@Pc(106) byte[] local106 = new byte[local83];
		for (@Pc(108) int local108 = 0; local108 < local83; local108++) {
			local106[local108] = local38.method203();
		}
		local38.anInt232++;
		local83++;
		@Pc(134) int local134 = local38.anInt232;
		@Pc(136) int local136 = 0;
		local38.anInt232 += local83;
		while (local38.aByteArray5[local136 + local38.anInt232] != 0) {
			local136++;
		}
		@Pc(156) byte[] local156 = new byte[local136];
		for (@Pc(158) int local158 = 0; local158 < local136; local158++) {
			local156[local158] = local38.method203();
		}
		local38.anInt232++;
		local136++;
		@Pc(184) byte[] local184 = new byte[local136];
		@Pc(189) int local189;
		@Pc(197) int local197;
		@Pc(203) int local203;
		if (local136 > 1) {
			local189 = 2;
			local184[1] = 1;
			@Pc(195) int local195 = 1;
			for (local197 = 2; local197 < local136; local197++) {
				local203 = local38.method191();
				if (local203 == 0) {
					local195 = local189++;
				} else {
					if (local195 >= local203) {
						local203--;
					}
					local195 = local203;
				}
				local184[local197] = (byte) local195;
			}
		} else {
			local189 = local136;
		}
		@Pc(239) Class66[] local239 = new Class66[local189];
		for (local197 = 0; local197 < local239.length; local197++) {
			@Pc(251) Class66 local251 = local239[local197] = new Class66();
			@Pc(255) int local255 = local38.method191();
			if (local255 > 0) {
				local251.aByteArray36 = new byte[local255 * 2];
			}
			local255 = local38.method191();
			if (local255 > 0) {
				local251.aByteArray37 = new byte[local255 * 2 + 2];
				local251.aByteArray37[1] = 64;
			}
		}
		local203 = local38.method191();
		@Pc(307) byte[] local307 = local203 > 0 ? new byte[local203 * 2] : null;
		local203 = local38.method191();
		@Pc(313) int local313 = 0;
		@Pc(325) byte[] local325 = local203 <= 0 ? null : new byte[local203 * 2];
		while (local38.aByteArray5[local313 + local38.anInt232] != 0) {
			local313++;
		}
		@Pc(342) byte[] local342 = new byte[local313];
		for (@Pc(344) int local344 = 0; local344 < local313; local344++) {
			local342[local344] = local38.method203();
		}
		local313++;
		@Pc(359) int local359 = 0;
		local38.anInt232++;
		for (@Pc(367) int local367 = 0; local367 < 128; local367++) {
			local359 += local38.method191();
			this.aShortArray30[local367] = (short) local359;
		}
		local359 = 0;
		for (@Pc(389) int local389 = 0; local389 < 128; local389++) {
			local359 += local38.method191();
			this.aShortArray30[local389] = (short) (this.aShortArray30[local389] + (local359 << 8));
		}
		@Pc(414) int local414 = 0;
		@Pc(416) int local416 = 0;
		@Pc(418) int local418 = 0;
		for (@Pc(420) int local420 = 0; local420 < 128; local420++) {
			if (local414 == 0) {
				if (local416 < local342.length) {
					local414 = local342[local416++];
				} else {
					local414 = -1;
				}
				local418 = local38.method169();
			}
			local414--;
			this.aShortArray30[local420] = (short) (this.aShortArray30[local420] + ((local418 - 1 & 0x2) << 14));
			this.anIntArray385[local420] = local418;
		}
		local414 = 0;
		local416 = 0;
		@Pc(474) int local474 = 0;
		for (@Pc(476) int local476 = 0; local476 < 128; local476++) {
			if (this.anIntArray385[local476] != 0) {
				if (local414 == 0) {
					local474 = local38.aByteArray5[local81++] - 1;
					if (local416 >= local53.length) {
						local414 = -1;
					} else {
						local414 = local53[local416++];
					}
				}
				this.aByteArray42[local476] = (byte) local474;
				local414--;
			}
		}
		local414 = 0;
		local416 = 0;
		@Pc(523) int local523 = 0;
		for (@Pc(525) int local525 = 0; local525 < 128; local525++) {
			if (this.anIntArray385[local525] != 0) {
				if (local414 == 0) {
					local523 = local38.aByteArray5[local134++] + 16 << 2;
					if (local416 < local106.length) {
						local414 = local106[local416++];
					} else {
						local414 = -1;
					}
				}
				this.aByteArray41[local525] = (byte) local523;
				local414--;
			}
		}
		local414 = 0;
		local416 = 0;
		@Pc(577) Class66 local577 = null;
		for (@Pc(579) int local579 = 0; local579 < 128; local579++) {
			if (this.anIntArray385[local579] != 0) {
				if (local414 == 0) {
					local577 = local239[local184[local416]];
					if (local156.length > local416) {
						local414 = local156[local416++];
					} else {
						local414 = -1;
					}
				}
				this.aClass66Array1[local579] = local577;
				local414--;
			}
		}
		local416 = 0;
		local414 = 0;
		@Pc(628) int local628 = 0;
		for (@Pc(630) int local630 = 0; local630 < 128; local630++) {
			if (local414 == 0) {
				if (local342.length > local416) {
					local414 = local342[local416++];
				} else {
					local414 = -1;
				}
				if (this.anIntArray385[local630] > 0) {
					local628 = local38.method191() + 1;
				}
			}
			this.aByteArray43[local630] = (byte) local628;
			local414--;
		}
		this.anInt3296 = local38.method191() + 1;
		@Pc(701) int local701;
		for (@Pc(690) int local690 = 0; local690 < local189; local690++) {
			@Pc(696) Class66 local696 = local239[local690];
			if (local696.aByteArray36 != null) {
				for (local701 = 1; local701 < local696.aByteArray36.length; local701 += 2) {
					local696.aByteArray36[local701] = local38.method203();
				}
			}
			if (local696.aByteArray37 != null) {
				for (local701 = 3; local701 < local696.aByteArray37.length - 2; local701 += 2) {
					local696.aByteArray37[local701] = local38.method203();
				}
			}
		}
		@Pc(754) int local754;
		if (local307 != null) {
			for (local754 = 1; local754 < local307.length; local754 += 2) {
				local307[local754] = local38.method203();
			}
		}
		if (local325 != null) {
			for (local754 = 1; local754 < local325.length; local754 += 2) {
				local325[local754] = local38.method203();
			}
		}
		@Pc(807) int local807;
		for (local754 = 0; local754 < local189; local754++) {
			@Pc(800) Class66 local800 = local239[local754];
			if (local800.aByteArray37 != null) {
				local359 = 0;
				for (local807 = 2; local807 < local800.aByteArray37.length; local807 += 2) {
					local359 = local38.method191() + local359 + 1;
					local800.aByteArray37[local807] = (byte) local359;
				}
			}
		}
		@Pc(848) int local848;
		for (local701 = 0; local701 < local189; local701++) {
			@Pc(841) Class66 local841 = local239[local701];
			if (local841.aByteArray36 != null) {
				local359 = 0;
				for (local848 = 2; local848 < local841.aByteArray36.length; local848 += 2) {
					local359 += local38.method191() + 1;
					local841.aByteArray36[local848] = (byte) local359;
				}
			}
		}
		@Pc(922) int local922;
		@Pc(949) int local949;
		@Pc(955) byte local955;
		@Pc(976) int local976;
		@Pc(978) int local978;
		@Pc(988) int local988;
		@Pc(916) byte local916;
		@Pc(1029) int local1029;
		if (local307 != null) {
			local359 = local38.method191();
			local307[0] = (byte) local359;
			for (local807 = 2; local807 < local307.length; local807 += 2) {
				local359 -= -local38.method191() - 1;
				local307[local807] = (byte) local359;
			}
			local916 = local307[0];
			@Pc(920) byte local920 = local307[1];
			for (local922 = 0; local922 < local916; local922++) {
				this.aByteArray43[local922] = (byte) (this.aByteArray43[local922] * local920 + 32 >> 6);
			}
			local949 = 2;
			while (local949 < local307.length) {
				local955 = local307[local949];
				@Pc(961) byte local961 = local307[local949 + 1];
				local949 += 2;
				local976 = local920 * (local955 - local916) + (local955 - local916) / 2;
				for (local978 = local916; local978 < local955; local978++) {
					local988 = Static165.method2655(local976, local955 - local916);
					this.aByteArray43[local978] = (byte) (this.aByteArray43[local978] * local988 + 32 >> 6);
					local976 += local961 - local920;
				}
				local916 = local955;
				local920 = local961;
			}
			for (local1029 = local916; local1029 < 128; local1029++) {
				this.aByteArray43[local1029] = (byte) (local920 * this.aByteArray43[local1029] + 32 >> 6);
			}
		}
		@Pc(1097) int local1097;
		if (local325 != null) {
			local359 = local38.method191();
			local325[0] = (byte) local359;
			for (local807 = 2; local807 < local325.length; local807 += 2) {
				local359 -= -local38.method191() - 1;
				local325[local807] = (byte) local359;
			}
			local916 = local325[0];
			local1097 = local325[1] << 1;
			for (local922 = 0; local922 < local916; local922++) {
				local949 = (this.aByteArray41[local922] & 0xFF) + local1097;
				if (local949 < 0) {
					local949 = 0;
				}
				if (local949 > 128) {
					local949 = 128;
				}
				this.aByteArray41[local922] = (byte) local949;
			}
			@Pc(1163) int local1163;
			for (local949 = 2; local949 < local325.length; local949 += 2) {
				local955 = local325[local949];
				local976 = (local955 - local916) * local1097 + (local955 - local916) / 2;
				local1163 = local325[local949 + 1] << 1;
				for (local978 = local916; local978 < local955; local978++) {
					local988 = Static165.method2655(local976, local955 - local916);
					@Pc(1184) int local1184 = local988 + (this.aByteArray41[local978] & 0xFF);
					local976 += local1163 - local1097;
					if (local1184 < 0) {
						local1184 = 0;
					}
					if (local1184 > 128) {
						local1184 = 128;
					}
					this.aByteArray41[local978] = (byte) local1184;
				}
				local916 = local955;
				local1097 = local1163;
			}
			for (local1029 = local916; local1029 < 128; local1029++) {
				local1163 = (this.aByteArray41[local1029] & 0xFF) + local1097;
				if (local1163 < 0) {
					local1163 = 0;
				}
				if (local1163 > 128) {
					local1163 = 128;
				}
				this.aByteArray41[local1029] = (byte) local1163;
			}
		}
		for (local807 = 0; local807 < local189; local807++) {
			local239[local807].anInt3015 = local38.method191();
		}
		for (local848 = 0; local848 < local189; local848++) {
			@Pc(1289) Class66 local1289 = local239[local848];
			if (local1289.aByteArray36 != null) {
				local1289.anInt3016 = local38.method191();
			}
			if (local1289.aByteArray37 != null) {
				local1289.anInt3019 = local38.method191();
			}
			if (local1289.anInt3015 > 0) {
				local1289.anInt3022 = local38.method191();
			}
		}
		for (local1097 = 0; local1097 < local189; local1097++) {
			local239[local1097].anInt3011 = local38.method191();
		}
		for (local922 = 0; local922 < local189; local922++) {
			@Pc(1344) Class66 local1344 = local239[local922];
			if (local1344.anInt3011 > 0) {
				local1344.anInt3017 = local38.method191();
			}
		}
		for (local949 = 0; local949 < local189; local949++) {
			@Pc(1367) Class66 local1367 = local239[local949];
			if (local1367.anInt3017 > 0) {
				local1367.anInt3018 = local38.method191();
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!of;[II[B)Z")
	public boolean method2408(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class3_Sub9_Sub1 local9 = null;
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray385[local13];
				if (local25 != 0) {
					if (local11 != local25) {
						local11 = local25--;
						if ((local25 & 0x1) == 0) {
							local9 = arg0.method1962(arg1, local25 >> 2);
						} else {
							local9 = arg0.method1956(arg1, local25 >> 2);
						}
						if (local9 == null) {
							local7 = false;
						}
					}
					if (local9 != null) {
						this.aClass3_Sub9_Sub1Array1[local13] = local9;
						this.anIntArray385[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public void method2409() {
		this.anIntArray385 = null;
	}
}
