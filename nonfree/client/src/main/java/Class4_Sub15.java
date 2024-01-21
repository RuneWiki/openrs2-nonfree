import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class4_Sub15 extends Class4 {

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
	public final int anInt1892;

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "[Lclient!ke;")
	public final Class4_Sub6_Sub1[] aClass4_Sub6_Sub1Array1 = new Class4_Sub6_Sub1[128];

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "[I")
	private int[] anIntArray214 = new int[128];

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "[B")
	public final byte[] aByteArray17 = new byte[128];

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "[S")
	public final short[] aShortArray6 = new short[128];

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "[Lclient!ob;")
	public final Class56[] aClass56Array1;

	@OriginalMember(owner = "client!nd", name = "O", descriptor = "[B")
	public final byte[] aByteArray18;

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "[B")
	public final byte[] aByteArray19 = new byte[128];

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([B)V")
	public Class4_Sub15(@OriginalArg(0) byte[] arg0) {
		@Pc(25) int local25 = 0;
		this.aClass56Array1 = new Class56[128];
		this.aByteArray18 = new byte[128];
		@Pc(38) Class4_Sub16 local38 = new Class4_Sub16(arg0);
		while (local38.aByteArray22[local25 + local38.anInt2019] != 0) {
			local25++;
		}
		@Pc(55) byte[] local55 = new byte[local25];
		for (@Pc(57) int local57 = 0; local57 < local25; local57++) {
			local55[local57] = local38.method1477();
		}
		local25++;
		local38.anInt2019++;
		@Pc(79) int local79 = local38.anInt2019;
		@Pc(81) int local81 = 0;
		local38.anInt2019 += local25;
		while (local38.aByteArray22[local81 + local38.anInt2019] != 0) {
			local81++;
		}
		@Pc(101) byte[] local101 = new byte[local81];
		for (@Pc(103) int local103 = 0; local103 < local81; local103++) {
			local101[local103] = local38.method1477();
		}
		local81++;
		@Pc(118) int local118 = 0;
		local38.anInt2019++;
		@Pc(127) int local127 = local38.anInt2019;
		local38.anInt2019 += local81;
		while (local38.aByteArray22[local38.anInt2019 + local118] != 0) {
			local118++;
		}
		@Pc(148) byte[] local148 = new byte[local118];
		for (@Pc(150) int local150 = 0; local150 < local118; local150++) {
			local148[local150] = local38.method1477();
		}
		local38.anInt2019++;
		local118++;
		@Pc(176) byte[] local176 = new byte[local118];
		@Pc(187) int local187;
		@Pc(191) int local191;
		@Pc(197) int local197;
		if (local118 > 1) {
			local176[1] = 1;
			local187 = 2;
			@Pc(189) int local189 = 1;
			for (local191 = 2; local191 < local118; local191++) {
				local197 = local38.method1474();
				if (local197 == 0) {
					local189 = local187++;
				} else {
					if (local197 <= local189) {
						local197--;
					}
					local189 = local197;
				}
				local176[local191] = (byte) local189;
			}
		} else {
			local187 = local118;
		}
		@Pc(233) Class56[] local233 = new Class56[local187];
		for (local191 = 0; local191 < local233.length; local191++) {
			@Pc(245) Class56 local245 = local233[local191] = new Class56();
			@Pc(249) int local249 = local38.method1474();
			if (local249 > 0) {
				local245.aByteArray24 = new byte[local249 * 2];
			}
			local249 = local38.method1474();
			if (local249 > 0) {
				local245.aByteArray23 = new byte[local249 * 2 + 2];
				local245.aByteArray23[1] = 64;
			}
		}
		local197 = local38.method1474();
		@Pc(303) byte[] local303 = local197 <= 0 ? null : new byte[local197 * 2];
		local197 = local38.method1474();
		@Pc(309) int local309;
		for (local309 = 0; local38.aByteArray22[local38.anInt2019 + local309] != 0; local309++) {
		}
		@Pc(333) byte[] local333 = local197 <= 0 ? null : new byte[local197 * 2];
		@Pc(336) byte[] local336 = new byte[local309];
		for (@Pc(338) int local338 = 0; local338 < local309; local338++) {
			local336[local338] = local38.method1477();
		}
		local38.anInt2019++;
		local309++;
		@Pc(359) int local359 = 0;
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			local359 += local38.method1474();
			this.aShortArray6[local361] = (short) local359;
		}
		local359 = 0;
		for (@Pc(383) int local383 = 0; local383 < 128; local383++) {
			local359 += local38.method1474();
			this.aShortArray6[local383] = (short) (this.aShortArray6[local383] + (local359 << 8));
		}
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		for (@Pc(414) int local414 = 0; local414 < 128; local414++) {
			if (local410 == 0) {
				if (local336.length <= local408) {
					local410 = -1;
				} else {
					local410 = local336[local408++];
				}
				local412 = local38.method1455();
			}
			local410--;
			this.aShortArray6[local414] = (short) (this.aShortArray6[local414] + ((local412 - 1 & 0x2) << 14));
			this.anIntArray214[local414] = local412;
		}
		local410 = 0;
		@Pc(473) int local473 = 0;
		local408 = 0;
		for (@Pc(477) int local477 = 0; local477 < 128; local477++) {
			if (this.anIntArray214[local477] != 0) {
				if (local410 == 0) {
					local473 = local38.aByteArray22[local79++] - 1;
					if (local408 >= local55.length) {
						local410 = -1;
					} else {
						local410 = local55[local408++];
					}
				}
				this.aByteArray17[local477] = (byte) local473;
				local410--;
			}
		}
		local410 = 0;
		@Pc(532) int local532 = 0;
		local408 = 0;
		for (@Pc(536) int local536 = 0; local536 < 128; local536++) {
			if (this.anIntArray214[local536] != 0) {
				if (local410 == 0) {
					local532 = local38.aByteArray22[local127++] + 16 << 2;
					if (local408 >= local101.length) {
						local410 = -1;
					} else {
						local410 = local101[local408++];
					}
				}
				local410--;
				this.aByteArray19[local536] = (byte) local532;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(589) Class56 local589 = null;
		for (@Pc(591) int local591 = 0; local591 < 128; local591++) {
			if (this.anIntArray214[local591] != 0) {
				if (local410 == 0) {
					local589 = local233[local176[local408]];
					if (local148.length <= local408) {
						local410 = -1;
					} else {
						local410 = local148[local408++];
					}
				}
				this.aClass56Array1[local591] = local589;
				local410--;
			}
		}
		local410 = 0;
		local408 = 0;
		@Pc(637) int local637 = 0;
		for (@Pc(639) int local639 = 0; local639 < 128; local639++) {
			if (local410 == 0) {
				if (local408 < local336.length) {
					local410 = local336[local408++];
				} else {
					local410 = -1;
				}
				if (this.anIntArray214[local639] > 0) {
					local637 = local38.method1474() + 1;
				}
			}
			local410--;
			this.aByteArray18[local639] = (byte) local637;
		}
		this.anInt1892 = local38.method1474() + 1;
		@Pc(708) int local708;
		for (@Pc(697) int local697 = 0; local697 < local187; local697++) {
			@Pc(703) Class56 local703 = local233[local697];
			if (local703.aByteArray24 != null) {
				for (local708 = 1; local708 < local703.aByteArray24.length; local708 += 2) {
					local703.aByteArray24[local708] = local38.method1477();
				}
			}
			if (local703.aByteArray23 != null) {
				for (local708 = 3; local708 < local703.aByteArray23.length - 2; local708 += 2) {
					local703.aByteArray23[local708] = local38.method1477();
				}
			}
		}
		@Pc(753) int local753;
		if (local303 != null) {
			for (local753 = 1; local753 < local303.length; local753 += 2) {
				local303[local753] = local38.method1477();
			}
		}
		if (local333 != null) {
			for (local753 = 1; local753 < local333.length; local753 += 2) {
				local333[local753] = local38.method1477();
			}
		}
		@Pc(802) int local802;
		for (local753 = 0; local753 < local187; local753++) {
			@Pc(795) Class56 local795 = local233[local753];
			if (local795.aByteArray23 != null) {
				local359 = 0;
				for (local802 = 2; local802 < local795.aByteArray23.length; local802 += 2) {
					local359 = local38.method1474() + local359 + 1;
					local795.aByteArray23[local802] = (byte) local359;
				}
			}
		}
		@Pc(843) int local843;
		for (local708 = 0; local708 < local187; local708++) {
			@Pc(836) Class56 local836 = local233[local708];
			if (local836.aByteArray24 != null) {
				local359 = 0;
				for (local843 = 2; local843 < local836.aByteArray24.length; local843 += 2) {
					local359 = local359 + local38.method1474() + 1;
					local836.aByteArray24[local843] = (byte) local359;
				}
			}
		}
		@Pc(916) int local916;
		@Pc(943) int local943;
		@Pc(955) byte local955;
		@Pc(968) int local968;
		@Pc(971) int local971;
		@Pc(981) int local981;
		@Pc(910) byte local910;
		@Pc(1021) int local1021;
		if (local303 != null) {
			local359 = local38.method1474();
			local303[0] = (byte) local359;
			for (local802 = 2; local802 < local303.length; local802 += 2) {
				local359 = local359 + local38.method1474() + 1;
				local303[local802] = (byte) local359;
			}
			local910 = local303[0];
			@Pc(914) byte local914 = local303[1];
			for (local916 = 0; local916 < local910; local916++) {
				this.aByteArray18[local916] = (byte) (local914 * this.aByteArray18[local916] + 32 >> 6);
			}
			local943 = 2;
			while (local943 < local303.length) {
				@Pc(951) byte local951 = local303[local943 + 1];
				local955 = local303[local943];
				local968 = (local955 - local910) / 2 + local914 * (local955 - local910);
				local943 += 2;
				for (local971 = local910; local971 < local955; local971++) {
					local981 = Static71.method1199(local968, local955 - local910);
					this.aByteArray18[local971] = (byte) (this.aByteArray18[local971] * local981 + 32 >> 6);
					local968 += local951 - local914;
				}
				local914 = local951;
				local910 = local955;
			}
			for (local1021 = local910; local1021 < 128; local1021++) {
				this.aByteArray18[local1021] = (byte) (this.aByteArray18[local1021] * local914 + 32 >> 6);
			}
		}
		@Pc(1088) int local1088;
		if (local333 != null) {
			local359 = local38.method1474();
			local333[0] = (byte) local359;
			for (local802 = 2; local802 < local333.length; local802 += 2) {
				local359 = local359 + local38.method1474() + 1;
				local333[local802] = (byte) local359;
			}
			local910 = local333[0];
			local1088 = local333[1] << 1;
			for (local916 = 0; local916 < local910; local916++) {
				local943 = (this.aByteArray19[local916] & 0xFF) + local1088;
				if (local943 < 0) {
					local943 = 0;
				}
				if (local943 > 128) {
					local943 = 128;
				}
				this.aByteArray19[local916] = (byte) local943;
			}
			local943 = 2;
			@Pc(1136) int local1136;
			while (local333.length > local943) {
				local955 = local333[local943];
				local1136 = local333[local943 + 1] << 1;
				local943 += 2;
				local968 = (local955 - local910) * local1088 + (local955 - local910) / 2;
				for (local971 = local910; local971 < local955; local971++) {
					local981 = Static71.method1199(local968, local955 - local910);
					@Pc(1173) int local1173 = (this.aByteArray19[local971] & 0xFF) + local981;
					if (local1173 < 0) {
						local1173 = 0;
					}
					if (local1173 > 128) {
						local1173 = 128;
					}
					local968 += local1136 - local1088;
					this.aByteArray19[local971] = (byte) local1173;
				}
				local910 = local955;
				local1088 = local1136;
			}
			for (local1021 = local910; local1021 < 128; local1021++) {
				local1136 = (this.aByteArray19[local1021] & 0xFF) + local1088;
				if (local1136 < 0) {
					local1136 = 0;
				}
				if (local1136 > 128) {
					local1136 = 128;
				}
				this.aByteArray19[local1021] = (byte) local1136;
			}
		}
		for (local802 = 0; local802 < local187; local802++) {
			local233[local802].anInt2121 = local38.method1474();
		}
		for (local843 = 0; local843 < local187; local843++) {
			@Pc(1279) Class56 local1279 = local233[local843];
			if (local1279.aByteArray24 != null) {
				local1279.anInt2124 = local38.method1474();
			}
			if (local1279.aByteArray23 != null) {
				local1279.anInt2119 = local38.method1474();
			}
			if (local1279.anInt2121 > 0) {
				local1279.anInt2118 = local38.method1474();
			}
		}
		for (local1088 = 0; local1088 < local187; local1088++) {
			local233[local1088].anInt2123 = local38.method1474();
		}
		for (local916 = 0; local916 < local187; local916++) {
			@Pc(1330) Class56 local1330 = local233[local916];
			if (local1330.anInt2123 > 0) {
				local1330.anInt2114 = local38.method1474();
			}
		}
		for (local943 = 0; local943 < local187; local943++) {
			@Pc(1353) Class56 local1353 = local233[local943];
			if (local1353.anInt2114 > 0) {
				local1353.anInt2120 = local38.method1474();
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ca;[B[IB)Z")
	public boolean method1324(@OriginalArg(0) Class13 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2) {
		@Pc(14) boolean local14 = true;
		@Pc(16) int local16 = 0;
		@Pc(18) Class4_Sub6_Sub1 local18 = null;
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			if (arg1 == null || arg1[local20] != 0) {
				@Pc(35) int local35 = this.anIntArray214[local20];
				if (local35 != 0) {
					if (local35 != local16) {
						local16 = local35--;
						if ((local35 & 0x1) == 0) {
							local18 = arg0.method242(local35 >> 2, arg2);
						} else {
							local18 = arg0.method243(arg2, local35 >> 2);
						}
						if (local18 == null) {
							local14 = false;
						}
					}
					if (local18 != null) {
						this.aClass4_Sub6_Sub1Array1[local20] = local18;
						this.anIntArray214[local20] = 0;
					}
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public void method1327() {
		this.anIntArray214 = null;
	}
}
