import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class4_Sub49 extends Class4 {

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "[B")
	public byte[] aByteArray98;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "[Lclient!aia;")
	public Class4_Sub4_Sub1[] aClass4_Sub4_Sub1Array1;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "[S")
	public short[] aShortArray154;

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "[Lclient!jq;")
	public Class186[] aClass186Array1;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "[B")
	public byte[] aByteArray99;

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "[I")
	private int[] anIntArray657;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
	public int anInt9313;

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "[B")
	public byte[] aByteArray100;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	private Class4_Sub49() {
	}

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "([B)V")
	public Class4_Sub49(@OriginalArg(0) byte[] arg0) {
		this.aByteArray100 = new byte[128];
		this.aShortArray154 = new short[128];
		this.anIntArray657 = new int[128];
		this.aByteArray99 = new byte[128];
		this.aClass4_Sub4_Sub1Array1 = new Class4_Sub4_Sub1[128];
		this.aClass186Array1 = new Class186[128];
		this.aByteArray98 = new byte[128];
		@Pc(36) Class4_Sub11 local36 = new Class4_Sub11(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray107[local36.anInt10466 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method8861();
		}
		local36.anInt10466++;
		local38++;
		@Pc(84) int local84 = local36.anInt10466;
		local36.anInt10466 += local38;
		@Pc(92) int local92;
		for (local92 = 0; local36.aByteArray107[local92 + local36.anInt10466] != 0; local92++) {
		}
		@Pc(109) byte[] local109 = new byte[local92];
		for (@Pc(111) int local111 = 0; local111 < local92; local111++) {
			local109[local111] = local36.method8861();
		}
		local92++;
		local36.anInt10466++;
		@Pc(133) int local133 = local36.anInt10466;
		local36.anInt10466 += local92;
		@Pc(141) int local141;
		for (local141 = 0; local36.aByteArray107[local141 + local36.anInt10466] != 0; local141++) {
		}
		@Pc(158) byte[] local158 = new byte[local141];
		for (@Pc(160) int local160 = 0; local160 < local141; local160++) {
			local158[local160] = local36.method8861();
		}
		local141++;
		local36.anInt10466++;
		@Pc(186) byte[] local186 = new byte[local141];
		@Pc(197) int local197;
		@Pc(199) int local199;
		@Pc(205) int local205;
		if (local141 > 1) {
			local186[1] = 1;
			@Pc(195) int local195 = 1;
			local197 = 2;
			for (local199 = 2; local199 < local141; local199++) {
				local205 = local36.method8865();
				if (local205 == 0) {
					local195 = local197++;
				} else {
					if (local205 <= local195) {
						local205--;
					}
					local195 = local205;
				}
				local186[local199] = (byte) local195;
			}
		} else {
			local197 = local141;
		}
		@Pc(237) Class186[] local237 = new Class186[local197];
		for (local199 = 0; local199 < local237.length; local199++) {
			@Pc(249) Class186 local249 = local237[local199] = new Class186();
			@Pc(253) int local253 = local36.method8865();
			if (local253 > 0) {
				local249.aByteArray52 = new byte[local253 * 2];
			}
			local253 = local36.method8865();
			if (local253 > 0) {
				local249.aByteArray51 = new byte[local253 * 2 + 2];
				local249.aByteArray51[1] = 64;
			}
		}
		local205 = local36.method8865();
		@Pc(304) byte[] local304 = local205 <= 0 ? null : new byte[local205 * 2];
		local205 = local36.method8865();
		@Pc(317) byte[] local317 = local205 > 0 ? new byte[local205 * 2] : null;
		@Pc(319) int local319;
		for (local319 = 0; local36.aByteArray107[local319 + local36.anInt10466] != 0; local319++) {
		}
		@Pc(336) byte[] local336 = new byte[local319];
		for (@Pc(338) int local338 = 0; local338 < local319; local338++) {
			local336[local338] = local36.method8861();
		}
		local319++;
		local36.anInt10466++;
		@Pc(363) int local363 = 0;
		for (@Pc(365) int local365 = 0; local365 < 128; local365++) {
			local363 += local36.method8865();
			this.aShortArray154[local365] = (short) local363;
		}
		local363 = 0;
		for (@Pc(389) int local389 = 0; local389 < 128; local389++) {
			local363 += local36.method8865();
			this.aShortArray154[local389] = (short) (this.aShortArray154[local389] + (local363 << 8));
		}
		@Pc(416) int local416 = 0;
		@Pc(418) int local418 = 0;
		@Pc(420) int local420 = 0;
		for (@Pc(422) int local422 = 0; local422 < 128; local422++) {
			if (local416 == 0) {
				if (local418 >= local336.length) {
					local416 = -1;
				} else {
					local416 = local336[local418++];
				}
				local420 = local36.method8836();
			}
			this.aShortArray154[local422] = (short) (this.aShortArray154[local422] + ((local420 - 1 & 0x2) << 14));
			local416--;
			this.anIntArray657[local422] = local420;
		}
		local418 = 0;
		local416 = 0;
		@Pc(478) int local478 = 0;
		for (@Pc(480) int local480 = 0; local480 < 128; local480++) {
			if (this.anIntArray657[local480] != 0) {
				if (local416 == 0) {
					if (local418 < local56.length) {
						local416 = local56[local418++];
					} else {
						local416 = -1;
					}
					local478 = local36.aByteArray107[local84++] - 1;
				}
				local416--;
				this.aByteArray99[local480] = (byte) local478;
			}
		}
		local418 = 0;
		local416 = 0;
		@Pc(535) int local535 = 0;
		for (@Pc(537) int local537 = 0; local537 < 128; local537++) {
			if (this.anIntArray657[local537] != 0) {
				if (local416 == 0) {
					local535 = local36.aByteArray107[local133++] + 16 << 2;
					if (local109.length > local418) {
						local416 = local109[local418++];
					} else {
						local416 = -1;
					}
				}
				local416--;
				this.aByteArray98[local537] = (byte) local535;
			}
		}
		local416 = 0;
		local418 = 0;
		@Pc(593) Class186 local593 = null;
		for (@Pc(595) int local595 = 0; local595 < 128; local595++) {
			if (this.anIntArray657[local595] != 0) {
				if (local416 == 0) {
					local593 = local237[local186[local418]];
					if (local418 < local158.length) {
						local416 = local158[local418++];
					} else {
						local416 = -1;
					}
				}
				this.aClass186Array1[local595] = local593;
				local416--;
			}
		}
		local418 = 0;
		local416 = 0;
		@Pc(641) int local641 = 0;
		for (@Pc(643) int local643 = 0; local643 < 128; local643++) {
			if (local416 == 0) {
				if (local336.length <= local418) {
					local416 = -1;
				} else {
					local416 = local336[local418++];
				}
				if (this.anIntArray657[local643] > 0) {
					local641 = local36.method8865() + 1;
				}
			}
			this.aByteArray100[local643] = (byte) local641;
			local416--;
		}
		this.anInt9313 = local36.method8865() + 1;
		@Pc(704) int local704;
		for (@Pc(693) int local693 = 0; local693 < local197; local693++) {
			@Pc(699) Class186 local699 = local237[local693];
			if (local699.aByteArray52 != null) {
				for (local704 = 1; local704 < local699.aByteArray52.length; local704 += 2) {
					local699.aByteArray52[local704] = local36.method8861();
				}
			}
			if (local699.aByteArray51 != null) {
				for (local704 = 3; local704 < local699.aByteArray51.length - 2; local704 += 2) {
					local699.aByteArray51[local704] = local36.method8861();
				}
			}
		}
		@Pc(757) int local757;
		if (local304 != null) {
			for (local757 = 1; local757 < local304.length; local757 += 2) {
				local304[local757] = local36.method8861();
			}
		}
		if (local317 != null) {
			for (local757 = 1; local757 < local317.length; local757 += 2) {
				local317[local757] = local36.method8861();
			}
		}
		@Pc(810) int local810;
		for (local757 = 0; local757 < local197; local757++) {
			@Pc(803) Class186 local803 = local237[local757];
			if (local803.aByteArray51 != null) {
				local363 = 0;
				for (local810 = 2; local810 < local803.aByteArray51.length; local810 += 2) {
					local363 = local36.method8865() + local363 + 1;
					local803.aByteArray51[local810] = (byte) local363;
				}
			}
		}
		@Pc(855) int local855;
		for (local704 = 0; local704 < local197; local704++) {
			@Pc(848) Class186 local848 = local237[local704];
			if (local848.aByteArray52 != null) {
				local363 = 0;
				for (local855 = 2; local855 < local848.aByteArray52.length; local855 += 2) {
					local363 = local363 + local36.method8865() + 1;
					local848.aByteArray52[local855] = (byte) local363;
				}
			}
		}
		@Pc(928) int local928;
		@Pc(955) int local955;
		@Pc(961) byte local961;
		@Pc(981) int local981;
		@Pc(983) int local983;
		@Pc(992) int local992;
		@Pc(922) byte local922;
		@Pc(1032) int local1032;
		if (local304 != null) {
			local363 = local36.method8865();
			local304[0] = (byte) local363;
			for (local810 = 2; local810 < local304.length; local810 += 2) {
				local363 = local36.method8865() + local363 + 1;
				local304[local810] = (byte) local363;
			}
			local922 = local304[0];
			@Pc(926) byte local926 = local304[1];
			for (local928 = 0; local928 < local922; local928++) {
				this.aByteArray100[local928] = (byte) (this.aByteArray100[local928] * local926 + 32 >> 6);
			}
			local955 = 2;
			while (local304.length > local955) {
				local961 = local304[local955];
				@Pc(967) byte local967 = local304[local955 + 1];
				local981 = local926 * (local961 - local922) + (local961 - local922) / 2;
				for (local983 = local922; local983 < local961; local983++) {
					local992 = Static385.method4985(local981, local961 - local922);
					this.aByteArray100[local983] = (byte) (local992 * this.aByteArray100[local983] + 32 >> 6);
					local981 += local967 - local926;
				}
				local926 = local967;
				local955 += 2;
				local922 = local961;
			}
			for (local1032 = local922; local1032 < 128; local1032++) {
				this.aByteArray100[local1032] = (byte) (this.aByteArray100[local1032] * local926 + 32 >> 6);
			}
		}
		@Pc(1101) int local1101;
		if (local317 != null) {
			local363 = local36.method8865();
			local317[0] = (byte) local363;
			for (local810 = 2; local810 < local317.length; local810 += 2) {
				local363 += local36.method8865() + 1;
				local317[local810] = (byte) local363;
			}
			local922 = local317[0];
			local1101 = local317[1] << 1;
			for (local928 = 0; local928 < local922; local928++) {
				local955 = local1101 + (this.aByteArray98[local928] & 0xFF);
				if (local955 < 0) {
					local955 = 0;
				}
				if (local955 > 128) {
					local955 = 128;
				}
				this.aByteArray98[local928] = (byte) local955;
			}
			local955 = 2;
			@Pc(1156) int local1156;
			while (local955 < local317.length) {
				local961 = local317[local955];
				local1156 = local317[local955 + 1] << 1;
				local981 = local1101 * (local961 - local922) + (local961 - local922) / 2;
				for (local983 = local922; local983 < local961; local983++) {
					local992 = Static385.method4985(local981, local961 - local922);
					@Pc(1192) int local1192 = (this.aByteArray98[local983] & 0xFF) + local992;
					if (local1192 < 0) {
						local1192 = 0;
					}
					if (local1192 > 128) {
						local1192 = 128;
					}
					local981 += local1156 - local1101;
					this.aByteArray98[local983] = (byte) local1192;
				}
				local1101 = local1156;
				local955 += 2;
				local922 = local961;
			}
			for (local1032 = local922; local1032 < 128; local1032++) {
				local1156 = (this.aByteArray98[local1032] & 0xFF) + local1101;
				if (local1156 < 0) {
					local1156 = 0;
				}
				if (local1156 > 128) {
					local1156 = 128;
				}
				this.aByteArray98[local1032] = (byte) local1156;
			}
		}
		for (local810 = 0; local810 < local197; local810++) {
			local237[local810].anInt4593 = local36.method8865();
		}
		for (local855 = 0; local855 < local197; local855++) {
			@Pc(1302) Class186 local1302 = local237[local855];
			if (local1302.aByteArray52 != null) {
				local1302.anInt4597 = local36.method8865();
			}
			if (local1302.aByteArray51 != null) {
				local1302.anInt4598 = local36.method8865();
			}
			if (local1302.anInt4593 > 0) {
				local1302.anInt4591 = local36.method8865();
			}
		}
		for (local1101 = 0; local1101 < local197; local1101++) {
			local237[local1101].anInt4592 = local36.method8865();
		}
		for (local928 = 0; local928 < local197; local928++) {
			@Pc(1360) Class186 local1360 = local237[local928];
			if (local1360.anInt4592 > 0) {
				local1360.anInt4590 = local36.method8865();
			}
		}
		for (local955 = 0; local955 < local197; local955++) {
			@Pc(1380) Class186 local1380 = local237[local955];
			if (local1380.anInt4590 > 0) {
				local1380.anInt4594 = local36.method8865();
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "([IILclient!pl;[B)Z")
	public boolean method7950(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class287 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) boolean local13 = true;
		@Pc(15) int local15 = 0;
		@Pc(17) Class4_Sub4_Sub1 local17 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg2 == null || arg2[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray657[local19];
				if (local34 != 0) {
					if (local34 != local15) {
						local15 = local34--;
						if ((local34 & 0x1) == 0) {
							local17 = arg1.method6474(local34 >> 2, arg0);
						} else {
							local17 = arg1.method6471(local34 >> 2, arg0);
						}
						if (local17 == null) {
							local13 = false;
						}
					}
					if (local17 != null) {
						this.aClass4_Sub4_Sub1Array1[local19] = local17;
						this.anIntArray657[local19] = 0;
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
	public void method7954() {
		this.anIntArray657 = null;
	}
}
