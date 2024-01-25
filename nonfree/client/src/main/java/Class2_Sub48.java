import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class2_Sub48 extends Class2 {

	@OriginalMember(owner = "client!uw", name = "i", descriptor = "[S")
	public short[] aShortArray133;

	@OriginalMember(owner = "client!uw", name = "j", descriptor = "[I")
	private int[] anIntArray588;

	@OriginalMember(owner = "client!uw", name = "k", descriptor = "[B")
	public byte[] aByteArray97;

	@OriginalMember(owner = "client!uw", name = "o", descriptor = "[Lclient!wm;")
	public Class2_Sub13_Sub1[] aClass2_Sub13_Sub1Array1;

	@OriginalMember(owner = "client!uw", name = "p", descriptor = "[B")
	public byte[] aByteArray98;

	@OriginalMember(owner = "client!uw", name = "q", descriptor = "I")
	public int anInt9004;

	@OriginalMember(owner = "client!uw", name = "s", descriptor = "[B")
	public byte[] aByteArray99;

	@OriginalMember(owner = "client!uw", name = "u", descriptor = "[Lclient!db;")
	public Class69[] aClass69Array1;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "()V")
	private Class2_Sub48() {
	}

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "([B)V")
	public Class2_Sub48(@OriginalArg(0) byte[] arg0) {
		this.aShortArray133 = new short[128];
		this.anIntArray588 = new int[128];
		this.aByteArray97 = new byte[128];
		this.aClass69Array1 = new Class69[128];
		this.aClass2_Sub13_Sub1Array1 = new Class2_Sub13_Sub1[128];
		this.aByteArray98 = new byte[128];
		this.aByteArray99 = new byte[128];
		@Pc(36) Class2_Sub7 local36 = new Class2_Sub7(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray52[local36.anInt5186 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method4477();
		}
		local36.anInt5186++;
		local38++;
		@Pc(80) int local80 = local36.anInt5186;
		local36.anInt5186 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray52[local88 + local36.anInt5186] != 0; local88++) {
		}
		@Pc(102) byte[] local102 = new byte[local88];
		for (@Pc(104) int local104 = 0; local104 < local88; local104++) {
			local102[local104] = local36.method4477();
		}
		local36.anInt5186++;
		local88++;
		@Pc(130) int local130 = local36.anInt5186;
		local36.anInt5186 += local88;
		@Pc(138) int local138;
		for (local138 = 0; local36.aByteArray52[local36.anInt5186 + local138] != 0; local138++) {
		}
		@Pc(155) byte[] local155 = new byte[local138];
		for (@Pc(157) int local157 = 0; local157 < local138; local157++) {
			local155[local157] = local36.method4477();
		}
		local36.anInt5186++;
		local138++;
		@Pc(183) byte[] local183 = new byte[local138];
		@Pc(196) int local196;
		@Pc(198) int local198;
		@Pc(204) int local204;
		if (local138 > 1) {
			local183[1] = 1;
			@Pc(194) int local194 = 1;
			local196 = 2;
			for (local198 = 2; local198 < local138; local198++) {
				local204 = local36.method4464();
				if (local204 == 0) {
					local194 = local196++;
				} else {
					if (local194 >= local204) {
						local204--;
					}
					local194 = local204;
				}
				local183[local198] = (byte) local194;
			}
		} else {
			local196 = local138;
		}
		@Pc(236) Class69[] local236 = new Class69[local196];
		for (local198 = 0; local198 < local236.length; local198++) {
			@Pc(248) Class69 local248 = local236[local198] = new Class69();
			@Pc(252) int local252 = local36.method4464();
			if (local252 > 0) {
				local248.aByteArray28 = new byte[local252 * 2];
			}
			local252 = local36.method4464();
			if (local252 > 0) {
				local248.aByteArray27 = new byte[local252 * 2 + 2];
				local248.aByteArray27[1] = 64;
			}
		}
		local204 = local36.method4464();
		@Pc(303) byte[] local303 = local204 > 0 ? new byte[local204 * 2] : null;
		local204 = local36.method4464();
		@Pc(316) byte[] local316 = local204 > 0 ? new byte[local204 * 2] : null;
		@Pc(318) int local318;
		for (local318 = 0; local36.aByteArray52[local318 + local36.anInt5186] != 0; local318++) {
		}
		@Pc(335) byte[] local335 = new byte[local318];
		for (@Pc(337) int local337 = 0; local337 < local318; local337++) {
			local335[local337] = local36.method4477();
		}
		local318++;
		local36.anInt5186++;
		@Pc(358) int local358 = 0;
		for (@Pc(360) int local360 = 0; local360 < 128; local360++) {
			local358 += local36.method4464();
			this.aShortArray133[local360] = (short) local358;
		}
		local358 = 0;
		for (@Pc(384) int local384 = 0; local384 < 128; local384++) {
			local358 += local36.method4464();
			this.aShortArray133[local384] = (short) (this.aShortArray133[local384] + (local358 << 8));
		}
		@Pc(411) int local411 = 0;
		@Pc(413) int local413 = 0;
		@Pc(415) int local415 = 0;
		for (@Pc(417) int local417 = 0; local417 < 128; local417++) {
			if (local411 == 0) {
				if (local335.length <= local413) {
					local411 = -1;
				} else {
					local411 = local335[local413++];
				}
				local415 = local36.method4463();
			}
			this.aShortArray133[local417] = (short) (this.aShortArray133[local417] + ((local415 - 1 & 0x2) << 14));
			this.anIntArray588[local417] = local415;
			local411--;
		}
		local411 = 0;
		local413 = 0;
		@Pc(472) int local472 = 0;
		for (@Pc(474) int local474 = 0; local474 < 128; local474++) {
			if (this.anIntArray588[local474] != 0) {
				if (local411 == 0) {
					local472 = local36.aByteArray52[local80++] - 1;
					if (local56.length <= local413) {
						local411 = -1;
					} else {
						local411 = local56[local413++];
					}
				}
				local411--;
				this.aByteArray97[local474] = (byte) local472;
			}
		}
		local413 = 0;
		local411 = 0;
		@Pc(528) int local528 = 0;
		for (@Pc(530) int local530 = 0; local530 < 128; local530++) {
			if (this.anIntArray588[local530] != 0) {
				if (local411 == 0) {
					local528 = local36.aByteArray52[local130++] + 16 << 2;
					if (local413 >= local102.length) {
						local411 = -1;
					} else {
						local411 = local102[local413++];
					}
				}
				this.aByteArray98[local530] = (byte) local528;
				local411--;
			}
		}
		local413 = 0;
		local411 = 0;
		@Pc(581) Class69 local581 = null;
		for (@Pc(583) int local583 = 0; local583 < 128; local583++) {
			if (this.anIntArray588[local583] != 0) {
				if (local411 == 0) {
					local581 = local236[local183[local413]];
					if (local155.length <= local413) {
						local411 = -1;
					} else {
						local411 = local155[local413++];
					}
				}
				this.aClass69Array1[local583] = local581;
				local411--;
			}
		}
		local411 = 0;
		local413 = 0;
		@Pc(632) int local632 = 0;
		for (@Pc(634) int local634 = 0; local634 < 128; local634++) {
			if (local411 == 0) {
				if (local413 >= local335.length) {
					local411 = -1;
				} else {
					local411 = local335[local413++];
				}
				if (this.anIntArray588[local634] > 0) {
					local632 = local36.method4464() + 1;
				}
			}
			this.aByteArray99[local634] = (byte) local632;
			local411--;
		}
		this.anInt9004 = local36.method4464() + 1;
		@Pc(705) int local705;
		for (@Pc(694) int local694 = 0; local694 < local196; local694++) {
			@Pc(700) Class69 local700 = local236[local694];
			if (local700.aByteArray28 != null) {
				for (local705 = 1; local705 < local700.aByteArray28.length; local705 += 2) {
					local700.aByteArray28[local705] = local36.method4477();
				}
			}
			if (local700.aByteArray27 != null) {
				for (local705 = 3; local705 < local700.aByteArray27.length - 2; local705 += 2) {
					local700.aByteArray27[local705] = local36.method4477();
				}
			}
		}
		@Pc(758) int local758;
		if (local303 != null) {
			for (local758 = 1; local758 < local303.length; local758 += 2) {
				local303[local758] = local36.method4477();
			}
		}
		if (local316 != null) {
			for (local758 = 1; local758 < local316.length; local758 += 2) {
				local316[local758] = local36.method4477();
			}
		}
		@Pc(803) int local803;
		for (local758 = 0; local758 < local196; local758++) {
			@Pc(796) Class69 local796 = local236[local758];
			if (local796.aByteArray27 != null) {
				local358 = 0;
				for (local803 = 2; local803 < local796.aByteArray27.length; local803 += 2) {
					local358 = local358 + local36.method4464() + 1;
					local796.aByteArray27[local803] = (byte) local358;
				}
			}
		}
		@Pc(848) int local848;
		for (local705 = 0; local705 < local196; local705++) {
			@Pc(841) Class69 local841 = local236[local705];
			if (local841.aByteArray28 != null) {
				local358 = 0;
				for (local848 = 2; local848 < local841.aByteArray28.length; local848 += 2) {
					local358 = local36.method4464() + local358 + 1;
					local841.aByteArray28[local848] = (byte) local358;
				}
			}
		}
		@Pc(929) int local929;
		@Pc(956) int local956;
		@Pc(962) byte local962;
		@Pc(983) int local983;
		@Pc(985) int local985;
		@Pc(995) int local995;
		@Pc(923) byte local923;
		@Pc(1032) int local1032;
		if (local303 != null) {
			local358 = local36.method4464();
			local303[0] = (byte) local358;
			for (local803 = 2; local803 < local303.length; local803 += 2) {
				local358 += local36.method4464() + 1;
				local303[local803] = (byte) local358;
			}
			local923 = local303[0];
			@Pc(927) byte local927 = local303[1];
			for (local929 = 0; local929 < local923; local929++) {
				this.aByteArray99[local929] = (byte) (this.aByteArray99[local929] * local927 + 32 >> 6);
			}
			for (local956 = 2; local956 < local303.length; local956 += 2) {
				local962 = local303[local956];
				@Pc(968) byte local968 = local303[local956 + 1];
				local983 = (local962 - local923) * local927 + (local962 - local923) / 2;
				for (local985 = local923; local985 < local962; local985++) {
					local995 = Static147.method2016(local962 - local923, local983);
					local983 += local968 - local927;
					this.aByteArray99[local985] = (byte) (this.aByteArray99[local985] * local995 + 32 >> 6);
				}
				local927 = local968;
				local923 = local962;
			}
			for (local1032 = local923; local1032 < 128; local1032++) {
				this.aByteArray99[local1032] = (byte) (this.aByteArray99[local1032] * local927 + 32 >> 6);
			}
		}
		@Pc(1100) int local1100;
		if (local316 != null) {
			local358 = local36.method4464();
			local316[0] = (byte) local358;
			for (local803 = 2; local803 < local316.length; local803 += 2) {
				local358 = local36.method4464() + local358 + 1;
				local316[local803] = (byte) local358;
			}
			local923 = local316[0];
			local1100 = local316[1] << 1;
			for (local929 = 0; local929 < local923; local929++) {
				local956 = local1100 + (this.aByteArray98[local929] & 0xFF);
				if (local956 < 0) {
					local956 = 0;
				}
				if (local956 > 128) {
					local956 = 128;
				}
				this.aByteArray98[local929] = (byte) local956;
			}
			local956 = 2;
			@Pc(1152) int local1152;
			while (local956 < local316.length) {
				local962 = local316[local956];
				local1152 = local316[local956 + 1] << 1;
				local983 = (local962 - local923) / 2 + (local962 - local923) * local1100;
				for (local985 = local923; local985 < local962; local985++) {
					local995 = Static147.method2016(local962 - local923, local983);
					@Pc(1186) int local1186 = (this.aByteArray98[local985] & 0xFF) + local995;
					if (local1186 < 0) {
						local1186 = 0;
					}
					if (local1186 > 128) {
						local1186 = 128;
					}
					this.aByteArray98[local985] = (byte) local1186;
					local983 += local1152 - local1100;
				}
				local956 += 2;
				local1100 = local1152;
				local923 = local962;
			}
			for (local1032 = local923; local1032 < 128; local1032++) {
				local1152 = local1100 + (this.aByteArray98[local1032] & 0xFF);
				if (local1152 < 0) {
					local1152 = 0;
				}
				if (local1152 > 128) {
					local1152 = 128;
				}
				this.aByteArray98[local1032] = (byte) local1152;
			}
		}
		for (local803 = 0; local803 < local196; local803++) {
			local236[local803].anInt1432 = local36.method4464();
		}
		for (local848 = 0; local848 < local196; local848++) {
			@Pc(1287) Class69 local1287 = local236[local848];
			if (local1287.aByteArray28 != null) {
				local1287.anInt1431 = local36.method4464();
			}
			if (local1287.aByteArray27 != null) {
				local1287.anInt1429 = local36.method4464();
			}
			if (local1287.anInt1432 > 0) {
				local1287.anInt1440 = local36.method4464();
			}
		}
		for (local1100 = 0; local1100 < local196; local1100++) {
			local236[local1100].anInt1439 = local36.method4464();
		}
		for (local929 = 0; local929 < local196; local929++) {
			@Pc(1345) Class69 local1345 = local236[local929];
			if (local1345.anInt1439 > 0) {
				local1345.anInt1433 = local36.method4464();
			}
		}
		for (local956 = 0; local956 < local196; local956++) {
			@Pc(1365) Class69 local1365 = local236[local956];
			if (local1365.anInt1433 > 0) {
				local1365.anInt1437 = local36.method4464();
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z)V")
	public void method7171() {
		this.anIntArray588 = null;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "([BLclient!ne;I[I)Z")
	public boolean method7176(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class234 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class2_Sub13_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray588[local13];
				if (local25 != 0) {
					if (local9 != local25) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg1.method5044(arg2, local25 >> 2);
						} else {
							local11 = arg1.method5043(local25 >> 2, arg2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass2_Sub13_Sub1Array1[local13] = local11;
						this.anIntArray588[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
