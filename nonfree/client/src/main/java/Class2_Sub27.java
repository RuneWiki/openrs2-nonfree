import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "[I")
	private int[] anIntArray294;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "[Lclient!ho;")
	public Class136[] aClass136Array1;

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
	public int anInt5524;

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!jf", name = "z", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "[Lclient!ob;")
	public Class2_Sub29_Sub1[] aClass2_Sub29_Sub1Array1;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	private Class2_Sub27() {
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "([B)V")
	public Class2_Sub27(@OriginalArg(0) byte[] arg0) {
		this.aShortArray65 = new short[128];
		this.aByteArray73 = new byte[128];
		this.aByteArray74 = new byte[128];
		this.aByteArray75 = new byte[128];
		this.aClass2_Sub29_Sub1Array1 = new Class2_Sub29_Sub1[128];
		this.aClass136Array1 = new Class136[128];
		this.anIntArray294 = new int[128];
		@Pc(36) Class2_Sub11 local36 = new Class2_Sub11(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray128[local38 + local36.anInt10066] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method8384();
		}
		local36.anInt10066++;
		local38++;
		@Pc(76) int local76 = local36.anInt10066;
		local36.anInt10066 += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray128[local84 + local36.anInt10066] != 0; local84++) {
		}
		@Pc(101) byte[] local101 = new byte[local84];
		for (@Pc(103) int local103 = 0; local103 < local84; local103++) {
			local101[local103] = local36.method8384();
		}
		local84++;
		local36.anInt10066++;
		@Pc(129) int local129 = local36.anInt10066;
		local36.anInt10066 += local84;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray128[local36.anInt10066 + local137] != 0; local137++) {
		}
		@Pc(151) byte[] local151 = new byte[local137];
		for (@Pc(153) int local153 = 0; local153 < local137; local153++) {
			local151[local153] = local36.method8384();
		}
		local36.anInt10066++;
		local137++;
		@Pc(175) byte[] local175 = new byte[local137];
		@Pc(184) int local184;
		@Pc(188) int local188;
		@Pc(194) int local194;
		if (local137 > 1) {
			local175[1] = 1;
			local184 = 2;
			@Pc(186) int local186 = 1;
			for (local188 = 2; local188 < local137; local188++) {
				local194 = local36.method8383();
				if (local194 == 0) {
					local186 = local184++;
				} else {
					if (local194 <= local186) {
						local194--;
					}
					local186 = local194;
				}
				local175[local188] = (byte) local186;
			}
		} else {
			local184 = local137;
		}
		@Pc(226) Class136[] local226 = new Class136[local184];
		for (local188 = 0; local188 < local226.length; local188++) {
			@Pc(238) Class136 local238 = local226[local188] = new Class136();
			@Pc(242) int local242 = local36.method8383();
			if (local242 > 0) {
				local238.aByteArray60 = new byte[local242 * 2];
			}
			local242 = local36.method8383();
			if (local242 > 0) {
				local238.aByteArray59 = new byte[local242 * 2 + 2];
				local238.aByteArray59[1] = 64;
			}
		}
		local194 = local36.method8383();
		@Pc(297) byte[] local297 = local194 > 0 ? new byte[local194 * 2] : null;
		local194 = local36.method8383();
		@Pc(313) byte[] local313 = local194 > 0 ? new byte[local194 * 2] : null;
		@Pc(315) int local315;
		for (local315 = 0; local36.aByteArray128[local36.anInt10066 + local315] != 0; local315++) {
		}
		@Pc(330) byte[] local330 = new byte[local315];
		for (@Pc(332) int local332 = 0; local332 < local315; local332++) {
			local330[local332] = local36.method8384();
		}
		local36.anInt10066++;
		local315++;
		@Pc(357) int local357 = 0;
		for (@Pc(359) int local359 = 0; local359 < 128; local359++) {
			local357 += local36.method8383();
			this.aShortArray65[local359] = (short) local357;
		}
		local357 = 0;
		for (@Pc(381) int local381 = 0; local381 < 128; local381++) {
			local357 += local36.method8383();
			this.aShortArray65[local381] = (short) (this.aShortArray65[local381] + (local357 << 8));
		}
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		for (@Pc(414) int local414 = 0; local414 < 128; local414++) {
			if (local408 == 0) {
				if (local330.length > local410) {
					local408 = local330[local410++];
				} else {
					local408 = -1;
				}
				local412 = local36.method8362();
			}
			this.aShortArray65[local414] = (short) (this.aShortArray65[local414] + ((local412 - 1 & 0x2) << 14));
			local408--;
			this.anIntArray294[local414] = local412;
		}
		local410 = 0;
		local408 = 0;
		@Pc(472) int local472 = 0;
		for (@Pc(474) int local474 = 0; local474 < 128; local474++) {
			if (this.anIntArray294[local474] != 0) {
				if (local408 == 0) {
					local472 = local36.aByteArray128[local76++] - 1;
					if (local410 < local52.length) {
						local408 = local52[local410++];
					} else {
						local408 = -1;
					}
				}
				local408--;
				this.aByteArray74[local474] = (byte) local472;
			}
		}
		local410 = 0;
		local408 = 0;
		@Pc(524) int local524 = 0;
		for (@Pc(526) int local526 = 0; local526 < 128; local526++) {
			if (this.anIntArray294[local526] != 0) {
				if (local408 == 0) {
					if (local410 >= local101.length) {
						local408 = -1;
					} else {
						local408 = local101[local410++];
					}
					local524 = local36.aByteArray128[local129++] + 16 << 2;
				}
				local408--;
				this.aByteArray73[local526] = (byte) local524;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(580) Class136 local580 = null;
		for (@Pc(582) int local582 = 0; local582 < 128; local582++) {
			if (this.anIntArray294[local582] != 0) {
				if (local408 == 0) {
					local580 = local226[local175[local410]];
					if (local410 < local151.length) {
						local408 = local151[local410++];
					} else {
						local408 = -1;
					}
				}
				local408--;
				this.aClass136Array1[local582] = local580;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(630) int local630 = 0;
		for (@Pc(632) int local632 = 0; local632 < 128; local632++) {
			if (local408 == 0) {
				if (local330.length > local410) {
					local408 = local330[local410++];
				} else {
					local408 = -1;
				}
				if (this.anIntArray294[local632] > 0) {
					local630 = local36.method8383() + 1;
				}
			}
			this.aByteArray75[local632] = (byte) local630;
			local408--;
		}
		this.anInt5524 = local36.method8383() + 1;
		@Pc(699) int local699;
		for (@Pc(688) int local688 = 0; local688 < local184; local688++) {
			@Pc(694) Class136 local694 = local226[local688];
			if (local694.aByteArray60 != null) {
				for (local699 = 1; local699 < local694.aByteArray60.length; local699 += 2) {
					local694.aByteArray60[local699] = local36.method8384();
				}
			}
			if (local694.aByteArray59 != null) {
				for (local699 = 3; local699 < local694.aByteArray59.length - 2; local699 += 2) {
					local694.aByteArray59[local699] = local36.method8384();
				}
			}
		}
		@Pc(744) int local744;
		if (local297 != null) {
			for (local744 = 1; local744 < local297.length; local744 += 2) {
				local297[local744] = local36.method8384();
			}
		}
		if (local313 != null) {
			for (local744 = 1; local744 < local313.length; local744 += 2) {
				local313[local744] = local36.method8384();
			}
		}
		@Pc(793) int local793;
		for (local744 = 0; local744 < local184; local744++) {
			@Pc(786) Class136 local786 = local226[local744];
			if (local786.aByteArray59 != null) {
				local357 = 0;
				for (local793 = 2; local793 < local786.aByteArray59.length; local793 += 2) {
					local357 = local357 + local36.method8383() + 1;
					local786.aByteArray59[local793] = (byte) local357;
				}
			}
		}
		@Pc(835) int local835;
		for (local699 = 0; local699 < local184; local699++) {
			@Pc(828) Class136 local828 = local226[local699];
			if (local828.aByteArray60 != null) {
				local357 = 0;
				for (local835 = 2; local835 < local828.aByteArray60.length; local835 += 2) {
					local357 = local357 + local36.method8383() + 1;
					local828.aByteArray60[local835] = (byte) local357;
				}
			}
		}
		@Pc(910) int local910;
		@Pc(933) int local933;
		@Pc(939) byte local939;
		@Pc(959) int local959;
		@Pc(961) int local961;
		@Pc(971) int local971;
		@Pc(904) byte local904;
		@Pc(1016) int local1016;
		if (local297 != null) {
			local357 = local36.method8383();
			local297[0] = (byte) local357;
			for (local793 = 2; local793 < local297.length; local793 += 2) {
				local357 = local357 + local36.method8383() + 1;
				local297[local793] = (byte) local357;
			}
			local904 = local297[0];
			@Pc(908) byte local908 = local297[1];
			for (local910 = 0; local910 < local904; local910++) {
				this.aByteArray75[local910] = (byte) (local908 * this.aByteArray75[local910] + 32 >> 6);
			}
			local933 = 2;
			while (local933 < local297.length) {
				local939 = local297[local933];
				@Pc(945) byte local945 = local297[local933 + 1];
				local959 = (local939 - local904) / 2 + (local939 - local904) * local908;
				for (local961 = local904; local961 < local939; local961++) {
					local971 = Static560.method8412(local939 - local904, local959);
					this.aByteArray75[local961] = (byte) (this.aByteArray75[local961] * local971 + 32 >> 6);
					local959 += local945 - local908;
				}
				local904 = local939;
				local933 += 2;
				local908 = local945;
			}
			for (local1016 = local904; local1016 < 128; local1016++) {
				this.aByteArray75[local1016] = (byte) (local908 * this.aByteArray75[local1016] + 32 >> 6);
			}
		}
		@Pc(1084) int local1084;
		if (local313 != null) {
			local357 = local36.method8383();
			local313[0] = (byte) local357;
			for (local793 = 2; local793 < local313.length; local793 += 2) {
				local357 = local36.method8383() + local357 + 1;
				local313[local793] = (byte) local357;
			}
			local904 = local313[0];
			local1084 = local313[1] << 1;
			for (local910 = 0; local910 < local904; local910++) {
				local933 = (this.aByteArray73[local910] & 0xFF) + local1084;
				if (local933 < 0) {
					local933 = 0;
				}
				if (local933 > 128) {
					local933 = 128;
				}
				this.aByteArray73[local910] = (byte) local933;
			}
			@Pc(1141) int local1141;
			for (local933 = 2; local933 < local313.length; local933 += 2) {
				local939 = local313[local933];
				local1141 = local313[local933 + 1] << 1;
				local959 = (local939 - local904) * local1084 + (local939 - local904) / 2;
				for (local961 = local904; local961 < local939; local961++) {
					local971 = Static560.method8412(local939 - local904, local959);
					@Pc(1176) int local1176 = (this.aByteArray73[local961] & 0xFF) + local971;
					if (local1176 < 0) {
						local1176 = 0;
					}
					if (local1176 > 128) {
						local1176 = 128;
					}
					this.aByteArray73[local961] = (byte) local1176;
					local959 += local1141 - local1084;
				}
				local1084 = local1141;
				local904 = local939;
			}
			for (local1016 = local904; local1016 < 128; local1016++) {
				local1141 = local1084 + (this.aByteArray73[local1016] & 0xFF);
				if (local1141 < 0) {
					local1141 = 0;
				}
				if (local1141 > 128) {
					local1141 = 128;
				}
				this.aByteArray73[local1016] = (byte) local1141;
			}
		}
		for (local793 = 0; local793 < local184; local793++) {
			local226[local793].anInt4911 = local36.method8383();
		}
		for (local835 = 0; local835 < local184; local835++) {
			@Pc(1288) Class136 local1288 = local226[local835];
			if (local1288.aByteArray60 != null) {
				local1288.anInt4909 = local36.method8383();
			}
			if (local1288.aByteArray59 != null) {
				local1288.anInt4912 = local36.method8383();
			}
			if (local1288.anInt4911 > 0) {
				local1288.anInt4913 = local36.method8383();
			}
		}
		for (local1084 = 0; local1084 < local184; local1084++) {
			local226[local1084].anInt4914 = local36.method8383();
		}
		for (local910 = 0; local910 < local184; local910++) {
			@Pc(1346) Class136 local1346 = local226[local910];
			if (local1346.anInt4914 > 0) {
				local1346.anInt4915 = local36.method8383();
			}
		}
		for (local933 = 0; local933 < local184; local933++) {
			@Pc(1366) Class136 local1366 = local226[local933];
			if (local1366.anInt4915 > 0) {
				local1366.anInt4910 = local36.method8383();
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!hs;[I[BI)Z")
	public boolean method4753(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class2_Sub29_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray294[local13];
				if (local28 != 0) {
					if (local28 != local9) {
						local9 = local28--;
						if ((local28 & 0x1) == 0) {
							local11 = arg0.method4287(local28 >> 2, arg1);
						} else {
							local11 = arg0.method4288(arg1, local28 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass2_Sub29_Sub1Array1[local13] = local11;
						this.anIntArray294[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
	public void method4754() {
		this.anIntArray294 = null;
	}
}
