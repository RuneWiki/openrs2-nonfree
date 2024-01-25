import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class6_Sub40 extends Class6 {

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "[Lclient!qr;")
	public Class6_Sub6_Sub1[] aClass6_Sub6_Sub1Array1;

	@OriginalMember(owner = "client!pv", name = "o", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!pv", name = "r", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!pv", name = "u", descriptor = "[Lclient!jk;")
	public Class156[] aClass156Array1;

	@OriginalMember(owner = "client!pv", name = "v", descriptor = "[I")
	private int[] anIntArray506;

	@OriginalMember(owner = "client!pv", name = "y", descriptor = "[S")
	public short[] aShortArray121;

	@OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
	public int anInt7386;

	@OriginalMember(owner = "client!pv", name = "C", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V")
	private Class6_Sub40() {
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "([B)V")
	public Class6_Sub40(@OriginalArg(0) byte[] arg0) {
		this.aByteArray91 = new byte[128];
		this.anIntArray506 = new int[128];
		this.aByteArray92 = new byte[128];
		this.aByteArray93 = new byte[128];
		this.aShortArray121 = new short[128];
		this.aClass156Array1 = new Class156[128];
		this.aClass6_Sub6_Sub1Array1 = new Class6_Sub6_Sub1[128];
		@Pc(36) Class6_Sub12 local36 = new Class6_Sub12(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray97[local38 + local36.anInt7556] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method6049();
		}
		local36.anInt7556++;
		local38++;
		@Pc(79) int local79 = local36.anInt7556;
		local36.anInt7556 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray97[local36.anInt7556 + local87] != 0; local87++) {
		}
		@Pc(104) byte[] local104 = new byte[local87];
		for (@Pc(106) int local106 = 0; local106 < local87; local106++) {
			local104[local106] = local36.method6049();
		}
		local87++;
		local36.anInt7556++;
		@Pc(132) int local132 = local36.anInt7556;
		local36.anInt7556 += local87;
		@Pc(140) int local140;
		for (local140 = 0; local36.aByteArray97[local36.anInt7556 + local140] != 0; local140++) {
		}
		@Pc(155) byte[] local155 = new byte[local140];
		for (@Pc(157) int local157 = 0; local157 < local140; local157++) {
			local155[local157] = local36.method6049();
		}
		local140++;
		local36.anInt7556++;
		@Pc(183) byte[] local183 = new byte[local140];
		@Pc(188) int local188;
		@Pc(200) int local200;
		@Pc(206) int local206;
		if (local140 <= 1) {
			local188 = local140;
		} else {
			local183[1] = 1;
			local188 = 2;
			@Pc(198) int local198 = 1;
			for (local200 = 2; local200 < local140; local200++) {
				local206 = local36.method6019();
				if (local206 == 0) {
					local198 = local188++;
				} else {
					if (local198 >= local206) {
						local206--;
					}
					local198 = local206;
				}
				local183[local200] = (byte) local198;
			}
		}
		@Pc(238) Class156[] local238 = new Class156[local188];
		for (local200 = 0; local200 < local238.length; local200++) {
			@Pc(250) Class156 local250 = local238[local200] = new Class156();
			@Pc(254) int local254 = local36.method6019();
			if (local254 > 0) {
				local250.aByteArray61 = new byte[local254 * 2];
			}
			local254 = local36.method6019();
			if (local254 > 0) {
				local250.aByteArray60 = new byte[local254 * 2 + 2];
				local250.aByteArray60[1] = 64;
			}
		}
		local206 = local36.method6019();
		@Pc(305) byte[] local305 = local206 > 0 ? new byte[local206 * 2] : null;
		local206 = local36.method6019();
		@Pc(318) byte[] local318 = local206 > 0 ? new byte[local206 * 2] : null;
		@Pc(320) int local320;
		for (local320 = 0; local36.aByteArray97[local36.anInt7556 + local320] != 0; local320++) {
		}
		@Pc(338) byte[] local338 = new byte[local320];
		for (@Pc(340) int local340 = 0; local340 < local320; local340++) {
			local338[local340] = local36.method6049();
		}
		local36.anInt7556++;
		local320++;
		@Pc(361) int local361 = 0;
		for (@Pc(363) int local363 = 0; local363 < 128; local363++) {
			local361 += local36.method6019();
			this.aShortArray121[local363] = (short) local361;
		}
		local361 = 0;
		for (@Pc(387) int local387 = 0; local387 < 128; local387++) {
			local361 += local36.method6019();
			this.aShortArray121[local387] = (short) (this.aShortArray121[local387] + (local361 << 8));
		}
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		@Pc(416) int local416 = 0;
		for (@Pc(418) int local418 = 0; local418 < 128; local418++) {
			if (local412 == 0) {
				if (local338.length > local414) {
					local412 = local338[local414++];
				} else {
					local412 = -1;
				}
				local416 = local36.method6029();
			}
			this.aShortArray121[local418] = (short) (this.aShortArray121[local418] + ((local416 - 1 & 0x2) << 14));
			local412--;
			this.anIntArray506[local418] = local416;
		}
		local414 = 0;
		local412 = 0;
		@Pc(472) int local472 = 0;
		for (@Pc(474) int local474 = 0; local474 < 128; local474++) {
			if (this.anIntArray506[local474] != 0) {
				if (local412 == 0) {
					if (local414 >= local55.length) {
						local412 = -1;
					} else {
						local412 = local55[local414++];
					}
					local472 = local36.aByteArray97[local79++] - 1;
				}
				local412--;
				this.aByteArray91[local474] = (byte) local472;
			}
		}
		local412 = 0;
		local414 = 0;
		@Pc(524) int local524 = 0;
		for (@Pc(526) int local526 = 0; local526 < 128; local526++) {
			if (this.anIntArray506[local526] != 0) {
				if (local412 == 0) {
					if (local104.length <= local414) {
						local412 = -1;
					} else {
						local412 = local104[local414++];
					}
					local524 = local36.aByteArray97[local132++] + 16 << 2;
				}
				local412--;
				this.aByteArray92[local526] = (byte) local524;
			}
		}
		local412 = 0;
		local414 = 0;
		@Pc(577) Class156 local577 = null;
		for (@Pc(579) int local579 = 0; local579 < 128; local579++) {
			if (this.anIntArray506[local579] != 0) {
				if (local412 == 0) {
					local577 = local238[local183[local414]];
					if (local155.length <= local414) {
						local412 = -1;
					} else {
						local412 = local155[local414++];
					}
				}
				this.aClass156Array1[local579] = local577;
				local412--;
			}
		}
		local412 = 0;
		local414 = 0;
		@Pc(628) int local628 = 0;
		for (@Pc(630) int local630 = 0; local630 < 128; local630++) {
			if (local412 == 0) {
				if (local338.length <= local414) {
					local412 = -1;
				} else {
					local412 = local338[local414++];
				}
				if (this.anIntArray506[local630] > 0) {
					local628 = local36.method6019() + 1;
				}
			}
			this.aByteArray93[local630] = (byte) local628;
			local412--;
		}
		this.anInt7386 = local36.method6019() + 1;
		@Pc(698) int local698;
		for (@Pc(687) int local687 = 0; local687 < local188; local687++) {
			@Pc(693) Class156 local693 = local238[local687];
			if (local693.aByteArray61 != null) {
				for (local698 = 1; local698 < local693.aByteArray61.length; local698 += 2) {
					local693.aByteArray61[local698] = local36.method6049();
				}
			}
			if (local693.aByteArray60 != null) {
				for (local698 = 3; local698 < local693.aByteArray60.length - 2; local698 += 2) {
					local693.aByteArray60[local698] = local36.method6049();
				}
			}
		}
		@Pc(743) int local743;
		if (local305 != null) {
			for (local743 = 1; local743 < local305.length; local743 += 2) {
				local305[local743] = local36.method6049();
			}
		}
		if (local318 != null) {
			for (local743 = 1; local743 < local318.length; local743 += 2) {
				local318[local743] = local36.method6049();
			}
		}
		@Pc(796) int local796;
		for (local743 = 0; local743 < local188; local743++) {
			@Pc(789) Class156 local789 = local238[local743];
			if (local789.aByteArray60 != null) {
				local361 = 0;
				for (local796 = 2; local796 < local789.aByteArray60.length; local796 += 2) {
					local361 = local36.method6019() + local361 + 1;
					local789.aByteArray60[local796] = (byte) local361;
				}
			}
		}
		@Pc(841) int local841;
		for (local698 = 0; local698 < local188; local698++) {
			@Pc(834) Class156 local834 = local238[local698];
			if (local834.aByteArray61 != null) {
				local361 = 0;
				for (local841 = 2; local841 < local834.aByteArray61.length; local841 += 2) {
					local361 = local361 + local36.method6019() + 1;
					local834.aByteArray61[local841] = (byte) local361;
				}
			}
		}
		@Pc(915) int local915;
		@Pc(942) int local942;
		@Pc(948) byte local948;
		@Pc(967) int local967;
		@Pc(969) int local969;
		@Pc(978) int local978;
		@Pc(909) byte local909;
		@Pc(1025) int local1025;
		if (local305 != null) {
			local361 = local36.method6019();
			local305[0] = (byte) local361;
			for (local796 = 2; local796 < local305.length; local796 += 2) {
				local361 = local361 + local36.method6019() + 1;
				local305[local796] = (byte) local361;
			}
			local909 = local305[0];
			@Pc(913) byte local913 = local305[1];
			for (local915 = 0; local915 < local909; local915++) {
				this.aByteArray93[local915] = (byte) (local913 * this.aByteArray93[local915] + 32 >> 6);
			}
			local942 = 2;
			while (local305.length > local942) {
				local948 = local305[local942];
				@Pc(954) byte local954 = local305[local942 + 1];
				local967 = (local948 - local909) * local913 + (local948 - local909) / 2;
				for (local969 = local909; local969 < local948; local969++) {
					local978 = Static369.method5432(local948 - local909, local967);
					local967 += local954 - local913;
					this.aByteArray93[local969] = (byte) (local978 * this.aByteArray93[local969] + 32 >> 6);
				}
				local909 = local948;
				local942 += 2;
				local913 = local954;
			}
			for (local1025 = local909; local1025 < 128; local1025++) {
				this.aByteArray93[local1025] = (byte) (local913 * this.aByteArray93[local1025] + 32 >> 6);
			}
		}
		@Pc(1089) int local1089;
		if (local318 != null) {
			local361 = local36.method6019();
			local318[0] = (byte) local361;
			for (local796 = 2; local796 < local318.length; local796 += 2) {
				local361 = local36.method6019() + local361 + 1;
				local318[local796] = (byte) local361;
			}
			local909 = local318[0];
			local1089 = local318[1] << 1;
			for (local915 = 0; local915 < local909; local915++) {
				local942 = local1089 + (this.aByteArray92[local915] & 0xFF);
				if (local942 < 0) {
					local942 = 0;
				}
				if (local942 > 128) {
					local942 = 128;
				}
				this.aByteArray92[local915] = (byte) local942;
			}
			local942 = 2;
			@Pc(1144) int local1144;
			while (local318.length > local942) {
				local948 = local318[local942];
				local1144 = local318[local942 + 1] << 1;
				local967 = (local948 - local909) / 2 + (local948 - local909) * local1089;
				for (local969 = local909; local969 < local948; local969++) {
					local978 = Static369.method5432(local948 - local909, local967);
					@Pc(1179) int local1179 = local978 + (this.aByteArray92[local969] & 0xFF);
					if (local1179 < 0) {
						local1179 = 0;
					}
					if (local1179 > 128) {
						local1179 = 128;
					}
					local967 += local1144 - local1089;
					this.aByteArray92[local969] = (byte) local1179;
				}
				local909 = local948;
				local942 += 2;
				local1089 = local1144;
			}
			for (local1025 = local909; local1025 < 128; local1025++) {
				local1144 = (this.aByteArray92[local1025] & 0xFF) + local1089;
				if (local1144 < 0) {
					local1144 = 0;
				}
				if (local1144 > 128) {
					local1144 = 128;
				}
				this.aByteArray92[local1025] = (byte) local1144;
			}
		}
		for (local796 = 0; local796 < local188; local796++) {
			local238[local796].anInt4563 = local36.method6019();
		}
		for (local841 = 0; local841 < local188; local841++) {
			@Pc(1279) Class156 local1279 = local238[local841];
			if (local1279.aByteArray61 != null) {
				local1279.anInt4568 = local36.method6019();
			}
			if (local1279.aByteArray60 != null) {
				local1279.anInt4566 = local36.method6019();
			}
			if (local1279.anInt4563 > 0) {
				local1279.anInt4569 = local36.method6019();
			}
		}
		for (local1089 = 0; local1089 < local188; local1089++) {
			local238[local1089].anInt4565 = local36.method6019();
		}
		for (local915 = 0; local915 < local188; local915++) {
			@Pc(1337) Class156 local1337 = local238[local915];
			if (local1337.anInt4565 > 0) {
				local1337.anInt4564 = local36.method6019();
			}
		}
		for (local942 = 0; local942 < local188; local942++) {
			@Pc(1361) Class156 local1361 = local238[local942];
			if (local1361.anInt4564 > 0) {
				local1361.anInt4567 = local36.method6019();
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "([IZLclient!me;[B)Z")
	public boolean method5898(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class198 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class6_Sub6_Sub1 local11 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray506[local18];
				if (local33 != 0) {
					if (local33 != local9) {
						local9 = local33--;
						if ((local33 & 0x1) == 0) {
							local11 = arg1.method4921(arg0, local33 >> 2);
						} else {
							local11 = arg1.method4920(local33 >> 2, arg0);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass6_Sub6_Sub1Array1[local18] = local11;
						this.anIntArray506[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V")
	public void method5899() {
		this.anIntArray506 = null;
	}
}
