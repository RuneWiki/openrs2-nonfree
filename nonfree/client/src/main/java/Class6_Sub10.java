import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class6_Sub10 extends Class6 {

	@OriginalMember(owner = "client!jf", name = "M", descriptor = "[I")
	public static int[] anIntArray191 = new int[32];

	@OriginalMember(owner = "client!jf", name = "U", descriptor = "[B")
	public final byte[] aByteArray22 = new byte[128];

	@OriginalMember(owner = "client!jf", name = "V", descriptor = "[S")
	public final short[] aShortArray10 = new short[128];

	@OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
	public final int anInt1807;

	@OriginalMember(owner = "client!jf", name = "X", descriptor = "[B")
	public final byte[] aByteArray23;

	@OriginalMember(owner = "client!jf", name = "Z", descriptor = "[I")
	private int[] anIntArray192 = new int[128];

	@OriginalMember(owner = "client!jf", name = "eb", descriptor = "[Lclient!kc;")
	public final Class42[] aClass42Array1 = new Class42[128];

	@OriginalMember(owner = "client!jf", name = "hb", descriptor = "[Lclient!ta;")
	public final Class6_Sub11_Sub1[] aClass6_Sub11_Sub1Array1 = new Class6_Sub11_Sub1[128];

	@OriginalMember(owner = "client!jf", name = "ob", descriptor = "[B")
	public final byte[] aByteArray24 = new byte[128];

	static {
		@Pc(38) int local38 = 2;
		for (@Pc(40) int local40 = 0; local40 < 32; local40++) {
			anIntArray191[local40] = local38 - 1;
			local38 += local38;
		}
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "([B)V")
	public Class6_Sub10(@OriginalArg(0) byte[] arg0) {
		@Pc(29) int local29 = 0;
		this.aByteArray23 = new byte[128];
		@Pc(38) Class6_Sub4 local38 = new Class6_Sub4(arg0);
		while (local38.aByteArray27[local38.anInt1949 + local29] != 0) {
			local29++;
		}
		@Pc(53) byte[] local53 = new byte[local29];
		for (@Pc(55) int local55 = 0; local55 < local29; local55++) {
			local53[local55] = local38.method1297();
		}
		local29++;
		local38.anInt1949++;
		@Pc(80) int local80 = 0;
		@Pc(83) int local83 = local38.anInt1949;
		local38.anInt1949 += local29;
		while (local38.aByteArray27[local80 + local38.anInt1949] != 0) {
			local80++;
		}
		@Pc(103) byte[] local103 = new byte[local80];
		for (@Pc(105) int local105 = 0; local105 < local80; local105++) {
			local103[local105] = local38.method1297();
		}
		local80++;
		local38.anInt1949++;
		@Pc(130) int local130 = 0;
		@Pc(133) int local133 = local38.anInt1949;
		local38.anInt1949 += local80;
		while (local38.aByteArray27[local130 + local38.anInt1949] != 0) {
			local130++;
		}
		@Pc(153) byte[] local153 = new byte[local130];
		for (@Pc(155) int local155 = 0; local155 < local130; local155++) {
			local153[local155] = local38.method1297();
		}
		local38.anInt1949++;
		local130++;
		@Pc(177) byte[] local177 = new byte[local130];
		@Pc(182) int local182;
		@Pc(194) int local194;
		@Pc(200) int local200;
		if (local130 <= 1) {
			local182 = local130;
		} else {
			local177[1] = 1;
			local182 = 2;
			@Pc(192) int local192 = 1;
			for (local194 = 2; local194 < local130; local194++) {
				local200 = local38.method1321();
				if (local200 == 0) {
					local192 = local182++;
				} else {
					if (local200 <= local192) {
						local200--;
					}
					local192 = local200;
				}
				local177[local194] = (byte) local192;
			}
		}
		@Pc(233) Class42[] local233 = new Class42[local182];
		for (local194 = 0; local194 < local233.length; local194++) {
			@Pc(245) Class42 local245 = local233[local194] = new Class42();
			@Pc(249) int local249 = local38.method1321();
			if (local249 > 0) {
				local245.aByteArray26 = new byte[local249 * 2];
			}
			local249 = local38.method1321();
			if (local249 > 0) {
				local245.aByteArray25 = new byte[local249 * 2 + 2];
				local245.aByteArray25[1] = 64;
			}
		}
		local200 = local38.method1321();
		@Pc(298) byte[] local298 = local200 <= 0 ? null : new byte[local200 * 2];
		local200 = local38.method1321();
		@Pc(314) byte[] local314 = local200 <= 0 ? null : new byte[local200 * 2];
		@Pc(316) int local316;
		for (local316 = 0; local38.aByteArray27[local316 + local38.anInt1949] != 0; local316++) {
		}
		@Pc(330) byte[] local330 = new byte[local316];
		for (@Pc(332) int local332 = 0; local332 < local316; local332++) {
			local330[local332] = local38.method1297();
		}
		local316++;
		@Pc(351) int local351 = 0;
		local38.anInt1949++;
		for (@Pc(359) int local359 = 0; local359 < 128; local359++) {
			local351 += local38.method1321();
			this.aShortArray10[local359] = (short) local351;
		}
		local351 = 0;
		for (@Pc(381) int local381 = 0; local381 < 128; local381++) {
			local351 += local38.method1321();
			this.aShortArray10[local381] = (short) (this.aShortArray10[local381] + (local351 << 8));
		}
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		for (@Pc(414) int local414 = 0; local414 < 128; local414++) {
			if (local408 == 0) {
				if (local410 < local330.length) {
					local408 = local330[local410++];
				} else {
					local408 = -1;
				}
				local412 = local38.method1320();
			}
			local408--;
			this.aShortArray10[local414] = (short) (this.aShortArray10[local414] + ((local412 - 1 & 0x2) << 14));
			this.anIntArray192[local414] = local412;
		}
		local410 = 0;
		@Pc(473) int local473 = 0;
		local408 = 0;
		for (@Pc(477) int local477 = 0; local477 < 128; local477++) {
			if (this.anIntArray192[local477] != 0) {
				if (local408 == 0) {
					if (local53.length <= local410) {
						local408 = -1;
					} else {
						local408 = local53[local410++];
					}
					local473 = local38.aByteArray27[local83++] - 1;
				}
				this.aByteArray24[local477] = (byte) local473;
				local408--;
			}
		}
		local410 = 0;
		local408 = 0;
		@Pc(533) int local533 = 0;
		for (@Pc(535) int local535 = 0; local535 < 128; local535++) {
			if (this.anIntArray192[local535] != 0) {
				if (local408 == 0) {
					local533 = local38.aByteArray27[local133++] + 16 << 2;
					if (local410 < local103.length) {
						local408 = local103[local410++];
					} else {
						local408 = -1;
					}
				}
				this.aByteArray23[local535] = (byte) local533;
				local408--;
			}
		}
		local410 = 0;
		@Pc(589) Class42 local589 = null;
		local408 = 0;
		for (@Pc(593) int local593 = 0; local593 < 128; local593++) {
			if (this.anIntArray192[local593] != 0) {
				if (local408 == 0) {
					local589 = local233[local177[local410]];
					if (local410 < local153.length) {
						local408 = local153[local410++];
					} else {
						local408 = -1;
					}
				}
				local408--;
				this.aClass42Array1[local593] = local589;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(644) int local644 = 0;
		for (@Pc(646) int local646 = 0; local646 < 128; local646++) {
			if (local408 == 0) {
				if (local410 < local330.length) {
					local408 = local330[local410++];
				} else {
					local408 = -1;
				}
				if (this.anIntArray192[local646] > 0) {
					local644 = local38.method1321() + 1;
				}
			}
			local408--;
			this.aByteArray22[local646] = (byte) local644;
		}
		this.anInt1807 = local38.method1321() + 1;
		@Pc(705) int local705;
		for (@Pc(694) int local694 = 0; local694 < local182; local694++) {
			@Pc(700) Class42 local700 = local233[local694];
			if (local700.aByteArray26 != null) {
				for (local705 = 1; local705 < local700.aByteArray26.length; local705 += 2) {
					local700.aByteArray26[local705] = local38.method1297();
				}
			}
			if (local700.aByteArray25 != null) {
				for (local705 = 3; local705 < local700.aByteArray25.length - 2; local705 += 2) {
					local700.aByteArray25[local705] = local38.method1297();
				}
			}
		}
		@Pc(758) int local758;
		if (local298 != null) {
			for (local758 = 1; local758 < local298.length; local758 += 2) {
				local298[local758] = local38.method1297();
			}
		}
		if (local314 != null) {
			for (local758 = 1; local758 < local314.length; local758 += 2) {
				local314[local758] = local38.method1297();
			}
		}
		@Pc(811) int local811;
		for (local758 = 0; local758 < local182; local758++) {
			@Pc(804) Class42 local804 = local233[local758];
			if (local804.aByteArray25 != null) {
				local351 = 0;
				for (local811 = 2; local811 < local804.aByteArray25.length; local811 += 2) {
					local351 = local351 + local38.method1321() + 1;
					local804.aByteArray25[local811] = (byte) local351;
				}
			}
		}
		@Pc(860) int local860;
		for (local705 = 0; local705 < local182; local705++) {
			@Pc(853) Class42 local853 = local233[local705];
			if (local853.aByteArray26 != null) {
				local351 = 0;
				for (local860 = 2; local860 < local853.aByteArray26.length; local860 += 2) {
					local351 = local351 + local38.method1321() + 1;
					local853.aByteArray26[local860] = (byte) local351;
				}
			}
		}
		@Pc(934) int local934;
		@Pc(957) int local957;
		@Pc(963) byte local963;
		@Pc(975) int local975;
		@Pc(984) int local984;
		@Pc(994) int local994;
		@Pc(932) byte local932;
		@Pc(1032) int local1032;
		if (local298 != null) {
			local351 = local38.method1321();
			local298[0] = (byte) local351;
			for (local811 = 2; local811 < local298.length; local811 += 2) {
				local351 += local38.method1321() + 1;
				local298[local811] = (byte) local351;
			}
			@Pc(928) byte local928 = local298[1];
			local932 = local298[0];
			for (local934 = 0; local934 < local932; local934++) {
				this.aByteArray22[local934] = (byte) (this.aByteArray22[local934] * local928 + 32 >> 6);
			}
			local957 = 2;
			while (local298.length > local957) {
				local963 = local298[local957];
				local975 = (local963 - local932) / 2 + (local963 - local932) * local928;
				@Pc(981) byte local981 = local298[local957 + 1];
				local957 += 2;
				for (local984 = local932; local984 < local963; local984++) {
					local994 = Static78.method1449(local975, local963 - local932);
					local975 += local981 - local928;
					this.aByteArray22[local984] = (byte) (local994 * this.aByteArray22[local984] + 32 >> 6);
				}
				local928 = local981;
				local932 = local963;
			}
			for (local1032 = local932; local1032 < 128; local1032++) {
				this.aByteArray22[local1032] = (byte) (this.aByteArray22[local1032] * local928 + 32 >> 6);
			}
		}
		@Pc(1098) int local1098;
		if (local314 != null) {
			local351 = local38.method1321();
			local314[0] = (byte) local351;
			for (local811 = 2; local811 < local314.length; local811 += 2) {
				local351 = local38.method1321() + local351 + 1;
				local314[local811] = (byte) local351;
			}
			local932 = local314[0];
			local1098 = local314[1] << 1;
			for (local934 = 0; local934 < local932; local934++) {
				local957 = local1098 + (this.aByteArray23[local934] & 0xFF);
				if (local957 < 0) {
					local957 = 0;
				}
				if (local957 > 128) {
					local957 = 128;
				}
				this.aByteArray23[local934] = (byte) local957;
			}
			local957 = 2;
			@Pc(1147) int local1147;
			while (local314.length > local957) {
				local1147 = local314[local957 + 1] << 1;
				local963 = local314[local957];
				local957 += 2;
				local975 = (local963 - local932) * local1098 + (local963 - local932) / 2;
				for (local984 = local932; local984 < local963; local984++) {
					local994 = Static78.method1449(local975, local963 - local932);
					@Pc(1185) int local1185 = local994 + (this.aByteArray23[local984] & 0xFF);
					local975 += local1147 - local1098;
					if (local1185 < 0) {
						local1185 = 0;
					}
					if (local1185 > 128) {
						local1185 = 128;
					}
					this.aByteArray23[local984] = (byte) local1185;
				}
				local932 = local963;
				local1098 = local1147;
			}
			for (local1032 = local932; local1032 < 128; local1032++) {
				local1147 = (this.aByteArray23[local1032] & 0xFF) + local1098;
				if (local1147 < 0) {
					local1147 = 0;
				}
				if (local1147 > 128) {
					local1147 = 128;
				}
				this.aByteArray23[local1032] = (byte) local1147;
			}
		}
		for (local811 = 0; local811 < local182; local811++) {
			local233[local811].anInt1839 = local38.method1321();
		}
		for (local860 = 0; local860 < local182; local860++) {
			@Pc(1291) Class42 local1291 = local233[local860];
			if (local1291.aByteArray26 != null) {
				local1291.anInt1840 = local38.method1321();
			}
			if (local1291.aByteArray25 != null) {
				local1291.anInt1837 = local38.method1321();
			}
			if (local1291.anInt1839 > 0) {
				local1291.anInt1834 = local38.method1321();
			}
		}
		for (local1098 = 0; local1098 < local182; local1098++) {
			local233[local1098].anInt1841 = local38.method1321();
		}
		for (local934 = 0; local934 < local182; local934++) {
			@Pc(1349) Class42 local1349 = local233[local934];
			if (local1349.anInt1841 > 0) {
				local1349.anInt1843 = local38.method1321();
			}
		}
		for (local957 = 0; local957 < local182; local957++) {
			@Pc(1373) Class42 local1373 = local233[local957];
			if (local1373.anInt1843 > 0) {
				local1373.anInt1836 = local38.method1321();
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)V")
	public void method1191() {
		this.anIntArray192 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ac;[BI[I)Z")
	public boolean method1193(@OriginalArg(0) Class4 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class6_Sub11_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray192[local13];
				if (local25 != 0) {
					if (local25 != local9) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg0.method32(local25 >> 2, arg2);
						} else {
							local11 = arg0.method33(arg2, local25 >> 2);
						}
						if (local11 == null) {
							local3 = false;
						}
					}
					if (local11 != null) {
						this.aClass6_Sub11_Sub1Array1[local13] = local11;
						this.anIntArray192[local13] = 0;
					}
				}
			}
		}
		return local3;
	}
}
