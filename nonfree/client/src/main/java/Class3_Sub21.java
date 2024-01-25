import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
	public int anInt2344;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "[Lclient!jp;")
	public Class3_Sub28_Sub1[] aClass3_Sub28_Sub1Array1;

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "[Lclient!fk;")
	public Class73[] aClass73Array1;

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!gg", name = "x", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	private Class3_Sub21() {
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "([B)V")
	public Class3_Sub21(@OriginalArg(0) byte[] arg0) {
		this.aByteArray44 = new byte[128];
		this.aClass3_Sub28_Sub1Array1 = new Class3_Sub28_Sub1[128];
		this.anIntArray117 = new int[128];
		this.aByteArray45 = new byte[128];
		this.aShortArray36 = new short[128];
		this.aClass73Array1 = new Class73[128];
		this.aByteArray46 = new byte[128];
		@Pc(36) Class3_Sub25 local36 = new Class3_Sub25(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray88[local36.anInt4974 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method4097();
		}
		local36.anInt4974++;
		local38++;
		@Pc(77) int local77 = local36.anInt4974;
		local36.anInt4974 += local38;
		@Pc(85) int local85;
		for (local85 = 0; local36.aByteArray88[local85 + local36.anInt4974] != 0; local85++) {
		}
		@Pc(99) byte[] local99 = new byte[local85];
		for (@Pc(101) int local101 = 0; local101 < local85; local101++) {
			local99[local101] = local36.method4097();
		}
		local36.anInt4974++;
		local85++;
		@Pc(127) int local127 = local36.anInt4974;
		local36.anInt4974 += local85;
		@Pc(135) int local135;
		for (local135 = 0; local36.aByteArray88[local36.anInt4974 + local135] != 0; local135++) {
		}
		@Pc(152) byte[] local152 = new byte[local135];
		for (@Pc(154) int local154 = 0; local154 < local135; local154++) {
			local152[local154] = local36.method4097();
		}
		local135++;
		local36.anInt4974++;
		@Pc(176) byte[] local176 = new byte[local135];
		@Pc(183) int local183;
		@Pc(195) int local195;
		@Pc(201) int local201;
		if (local135 <= 1) {
			local183 = local135;
		} else {
			local176[1] = 1;
			local183 = 2;
			@Pc(193) int local193 = 1;
			for (local195 = 2; local195 < local135; local195++) {
				local201 = local36.method4096();
				if (local201 == 0) {
					local193 = local183++;
				} else {
					if (local201 <= local193) {
						local201--;
					}
					local193 = local201;
				}
				local176[local195] = (byte) local193;
			}
		}
		@Pc(234) Class73[] local234 = new Class73[local183];
		for (local195 = 0; local195 < local234.length; local195++) {
			@Pc(246) Class73 local246 = local234[local195] = new Class73();
			@Pc(250) int local250 = local36.method4096();
			if (local250 > 0) {
				local246.aByteArray36 = new byte[local250 * 2];
			}
			local250 = local36.method4096();
			if (local250 > 0) {
				local246.aByteArray37 = new byte[local250 * 2 + 2];
				local246.aByteArray37[1] = 64;
			}
		}
		local201 = local36.method4096();
		@Pc(301) byte[] local301 = local201 <= 0 ? null : new byte[local201 * 2];
		local201 = local36.method4096();
		@Pc(314) byte[] local314 = local201 <= 0 ? null : new byte[local201 * 2];
		@Pc(316) int local316;
		for (local316 = 0; local36.aByteArray88[local36.anInt4974 + local316] != 0; local316++) {
		}
		@Pc(330) byte[] local330 = new byte[local316];
		for (@Pc(332) int local332 = 0; local332 < local316; local332++) {
			local330[local332] = local36.method4097();
		}
		local316++;
		local36.anInt4974++;
		@Pc(357) int local357 = 0;
		for (@Pc(359) int local359 = 0; local359 < 128; local359++) {
			local357 += local36.method4096();
			this.aShortArray36[local359] = (short) local357;
		}
		local357 = 0;
		for (@Pc(383) int local383 = 0; local383 < 128; local383++) {
			local357 += local36.method4096();
			this.aShortArray36[local383] = (short) (this.aShortArray36[local383] + (local357 << 8));
		}
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		for (@Pc(416) int local416 = 0; local416 < 128; local416++) {
			if (local410 == 0) {
				if (local412 >= local330.length) {
					local410 = -1;
				} else {
					local410 = local330[local412++];
				}
				local414 = local36.method4078();
			}
			this.aShortArray36[local416] = (short) (this.aShortArray36[local416] + ((local414 - 1 & 0x2) << 14));
			local410--;
			this.anIntArray117[local416] = local414;
		}
		local410 = 0;
		local412 = 0;
		@Pc(471) int local471 = 0;
		for (@Pc(473) int local473 = 0; local473 < 128; local473++) {
			if (this.anIntArray117[local473] != 0) {
				if (local410 == 0) {
					local471 = local36.aByteArray88[local77++] - 1;
					if (local53.length > local412) {
						local410 = local53[local412++];
					} else {
						local410 = -1;
					}
				}
				this.aByteArray45[local473] = (byte) local471;
				local410--;
			}
		}
		local410 = 0;
		local412 = 0;
		@Pc(527) int local527 = 0;
		for (@Pc(529) int local529 = 0; local529 < 128; local529++) {
			if (this.anIntArray117[local529] != 0) {
				if (local410 == 0) {
					local527 = local36.aByteArray88[local127++] + 16 << 2;
					if (local99.length <= local412) {
						local410 = -1;
					} else {
						local410 = local99[local412++];
					}
				}
				this.aByteArray46[local529] = (byte) local527;
				local410--;
			}
		}
		local412 = 0;
		local410 = 0;
		@Pc(581) Class73 local581 = null;
		for (@Pc(583) int local583 = 0; local583 < 128; local583++) {
			if (this.anIntArray117[local583] != 0) {
				if (local410 == 0) {
					local581 = local234[local176[local412]];
					if (local152.length <= local412) {
						local410 = -1;
					} else {
						local410 = local152[local412++];
					}
				}
				this.aClass73Array1[local583] = local581;
				local410--;
			}
		}
		local410 = 0;
		local412 = 0;
		@Pc(633) int local633 = 0;
		for (@Pc(635) int local635 = 0; local635 < 128; local635++) {
			if (local410 == 0) {
				if (local412 < local330.length) {
					local410 = local330[local412++];
				} else {
					local410 = -1;
				}
				if (this.anIntArray117[local635] > 0) {
					local633 = local36.method4096() + 1;
				}
			}
			local410--;
			this.aByteArray44[local635] = (byte) local633;
		}
		this.anInt2344 = local36.method4096() + 1;
		@Pc(696) int local696;
		for (@Pc(685) int local685 = 0; local685 < local183; local685++) {
			@Pc(691) Class73 local691 = local234[local685];
			if (local691.aByteArray36 != null) {
				for (local696 = 1; local696 < local691.aByteArray36.length; local696 += 2) {
					local691.aByteArray36[local696] = local36.method4097();
				}
			}
			if (local691.aByteArray37 != null) {
				for (local696 = 3; local696 < local691.aByteArray37.length - 2; local696 += 2) {
					local691.aByteArray37[local696] = local36.method4097();
				}
			}
		}
		@Pc(745) int local745;
		if (local301 != null) {
			for (local745 = 1; local745 < local301.length; local745 += 2) {
				local301[local745] = local36.method4097();
			}
		}
		if (local314 != null) {
			for (local745 = 1; local745 < local314.length; local745 += 2) {
				local314[local745] = local36.method4097();
			}
		}
		@Pc(790) int local790;
		for (local745 = 0; local745 < local183; local745++) {
			@Pc(783) Class73 local783 = local234[local745];
			if (local783.aByteArray37 != null) {
				local357 = 0;
				for (local790 = 2; local790 < local783.aByteArray37.length; local790 += 2) {
					local357 = local357 + local36.method4096() + 1;
					local783.aByteArray37[local790] = (byte) local357;
				}
			}
		}
		@Pc(839) int local839;
		for (local696 = 0; local696 < local183; local696++) {
			@Pc(832) Class73 local832 = local234[local696];
			if (local832.aByteArray36 != null) {
				local357 = 0;
				for (local839 = 2; local839 < local832.aByteArray36.length; local839 += 2) {
					local357 = local36.method4096() + local357 + 1;
					local832.aByteArray36[local839] = (byte) local357;
				}
			}
		}
		@Pc(916) int local916;
		@Pc(939) int local939;
		@Pc(945) byte local945;
		@Pc(965) int local965;
		@Pc(967) int local967;
		@Pc(976) int local976;
		@Pc(910) byte local910;
		@Pc(1019) int local1019;
		if (local301 != null) {
			local357 = local36.method4096();
			local301[0] = (byte) local357;
			for (local790 = 2; local790 < local301.length; local790 += 2) {
				local357 += local36.method4096() + 1;
				local301[local790] = (byte) local357;
			}
			local910 = local301[0];
			@Pc(914) byte local914 = local301[1];
			for (local916 = 0; local916 < local910; local916++) {
				this.aByteArray44[local916] = (byte) (local914 * this.aByteArray44[local916] + 32 >> 6);
			}
			local939 = 2;
			while (local939 < local301.length) {
				local945 = local301[local939];
				@Pc(951) byte local951 = local301[local939 + 1];
				local965 = (local945 - local910) * local914 + (local945 - local910) / 2;
				for (local967 = local910; local967 < local945; local967++) {
					local976 = Static393.method5430(local965, local945 - local910);
					this.aByteArray44[local967] = (byte) (this.aByteArray44[local967] * local976 + 32 >> 6);
					local965 += local951 - local914;
				}
				local910 = local945;
				local939 += 2;
				local914 = local951;
			}
			for (local1019 = local910; local1019 < 128; local1019++) {
				this.aByteArray44[local1019] = (byte) (local914 * this.aByteArray44[local1019] + 32 >> 6);
			}
		}
		@Pc(1086) int local1086;
		if (local314 != null) {
			local357 = local36.method4096();
			local314[0] = (byte) local357;
			for (local790 = 2; local790 < local314.length; local790 += 2) {
				local357 -= -local36.method4096() - 1;
				local314[local790] = (byte) local357;
			}
			local910 = local314[0];
			local1086 = local314[1] << 1;
			for (local916 = 0; local916 < local910; local916++) {
				local939 = (this.aByteArray46[local916] & 0xFF) + local1086;
				if (local939 < 0) {
					local939 = 0;
				}
				if (local939 > 128) {
					local939 = 128;
				}
				this.aByteArray46[local916] = (byte) local939;
			}
			local939 = 2;
			@Pc(1141) int local1141;
			while (local314.length > local939) {
				local945 = local314[local939];
				local1141 = local314[local939 + 1] << 1;
				local965 = (local945 - local910) / 2 + local1086 * (local945 - local910);
				for (local967 = local910; local967 < local945; local967++) {
					local976 = Static393.method5430(local965, local945 - local910);
					@Pc(1177) int local1177 = (this.aByteArray46[local967] & 0xFF) + local976;
					if (local1177 < 0) {
						local1177 = 0;
					}
					if (local1177 > 128) {
						local1177 = 128;
					}
					local965 += local1141 - local1086;
					this.aByteArray46[local967] = (byte) local1177;
				}
				local1086 = local1141;
				local939 += 2;
				local910 = local945;
			}
			for (local1019 = local910; local1019 < 128; local1019++) {
				local1141 = (this.aByteArray46[local1019] & 0xFF) + local1086;
				if (local1141 < 0) {
					local1141 = 0;
				}
				if (local1141 > 128) {
					local1141 = 128;
				}
				this.aByteArray46[local1019] = (byte) local1141;
			}
		}
		for (local790 = 0; local790 < local183; local790++) {
			local234[local790].anInt1979 = local36.method4096();
		}
		for (local839 = 0; local839 < local183; local839++) {
			@Pc(1278) Class73 local1278 = local234[local839];
			if (local1278.aByteArray36 != null) {
				local1278.anInt1975 = local36.method4096();
			}
			if (local1278.aByteArray37 != null) {
				local1278.anInt1981 = local36.method4096();
			}
			if (local1278.anInt1979 > 0) {
				local1278.anInt1974 = local36.method4096();
			}
		}
		for (local1086 = 0; local1086 < local183; local1086++) {
			local234[local1086].anInt1978 = local36.method4096();
		}
		for (local916 = 0; local916 < local183; local916++) {
			@Pc(1333) Class73 local1333 = local234[local916];
			if (local1333.anInt1978 > 0) {
				local1333.anInt1980 = local36.method4096();
			}
		}
		for (local939 = 0; local939 < local183; local939++) {
			@Pc(1357) Class73 local1357 = local234[local939];
			if (local1357.anInt1980 > 0) {
				local1357.anInt1976 = local36.method4096();
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public void method2029() {
		this.anIntArray117 = null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([II[BLclient!f;)Z")
	public boolean method2032(@OriginalArg(0) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class67 arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(17) int local17 = 0;
		@Pc(19) Class3_Sub28_Sub1 local19 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg1 == null || arg1[local21] != 0) {
				@Pc(36) int local36 = this.anIntArray117[local21];
				if (local36 != 0) {
					if (local36 != local17) {
						local17 = local36--;
						if ((local36 & 0x1) == 0) {
							local19 = arg2.method1726(arg0, local36 >> 2);
						} else {
							local19 = arg2.method1722(local36 >> 2, arg0);
						}
						if (local19 == null) {
							local15 = false;
						}
					}
					if (local19 != null) {
						this.aClass3_Sub28_Sub1Array1[local21] = local19;
						this.anIntArray117[local21] = 0;
					}
				}
			}
		}
		return local15;
	}
}
