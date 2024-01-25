import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "[Lclient!ke;")
	public Class139[] aClass139Array1;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "[I")
	private int[] anIntArray149;

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
	public int anInt1767;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "[Lclient!ck;")
	public Class2_Sub10_Sub1[] aClass2_Sub10_Sub1Array1;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	private Class2_Sub12() {
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([B)V")
	public Class2_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aShortArray16 = new short[128];
		this.aClass2_Sub10_Sub1Array1 = new Class2_Sub10_Sub1[128];
		this.aByteArray35 = new byte[128];
		this.aClass139Array1 = new Class139[128];
		this.aByteArray34 = new byte[128];
		this.anIntArray149 = new int[128];
		this.aByteArray36 = new byte[128];
		@Pc(36) Class2_Sub23 local36 = new Class2_Sub23(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray130[local38 + local36.anInt6952] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method5484();
		}
		local36.anInt6952++;
		local38++;
		@Pc(83) int local83 = local36.anInt6952;
		local36.anInt6952 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray130[local91 + local36.anInt6952] != 0; local91++) {
		}
		@Pc(105) byte[] local105 = new byte[local91];
		for (@Pc(107) int local107 = 0; local107 < local91; local107++) {
			local105[local107] = local36.method5484();
		}
		local36.anInt6952++;
		local91++;
		@Pc(129) int local129 = local36.anInt6952;
		local36.anInt6952 += local91;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray130[local36.anInt6952 + local137] != 0; local137++) {
		}
		@Pc(154) byte[] local154 = new byte[local137];
		for (@Pc(156) int local156 = 0; local156 < local137; local156++) {
			local154[local156] = local36.method5484();
		}
		local137++;
		local36.anInt6952++;
		@Pc(178) byte[] local178 = new byte[local137];
		@Pc(185) int local185;
		@Pc(197) int local197;
		@Pc(203) int local203;
		if (local137 <= 1) {
			local185 = local137;
		} else {
			local178[1] = 1;
			local185 = 2;
			@Pc(195) int local195 = 1;
			for (local197 = 2; local197 < local137; local197++) {
				local203 = local36.method5495();
				if (local203 == 0) {
					local195 = local185++;
				} else {
					if (local203 <= local195) {
						local203--;
					}
					local195 = local203;
				}
				local178[local197] = (byte) local195;
			}
		}
		@Pc(231) Class139[] local231 = new Class139[local185];
		for (local197 = 0; local197 < local231.length; local197++) {
			@Pc(243) Class139 local243 = local231[local197] = new Class139();
			@Pc(247) int local247 = local36.method5495();
			if (local247 > 0) {
				local243.aByteArray73 = new byte[local247 * 2];
			}
			local247 = local36.method5495();
			if (local247 > 0) {
				local243.aByteArray72 = new byte[local247 * 2 + 2];
				local243.aByteArray72[1] = 64;
			}
		}
		local203 = local36.method5495();
		@Pc(301) byte[] local301 = local203 <= 0 ? null : new byte[local203 * 2];
		local203 = local36.method5495();
		@Pc(314) byte[] local314 = local203 <= 0 ? null : new byte[local203 * 2];
		@Pc(316) int local316;
		for (local316 = 0; local36.aByteArray130[local316 + local36.anInt6952] != 0; local316++) {
		}
		@Pc(330) byte[] local330 = new byte[local316];
		for (@Pc(332) int local332 = 0; local332 < local316; local332++) {
			local330[local332] = local36.method5484();
		}
		local36.anInt6952++;
		local316++;
		@Pc(353) int local353 = 0;
		for (@Pc(355) int local355 = 0; local355 < 128; local355++) {
			local353 += local36.method5495();
			this.aShortArray16[local355] = (short) local353;
		}
		local353 = 0;
		for (@Pc(377) int local377 = 0; local377 < 128; local377++) {
			local353 += local36.method5495();
			this.aShortArray16[local377] = (short) (this.aShortArray16[local377] + (local353 << 8));
		}
		@Pc(404) int local404 = 0;
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		for (@Pc(410) int local410 = 0; local410 < 128; local410++) {
			if (local404 == 0) {
				if (local406 < local330.length) {
					local404 = local330[local406++];
				} else {
					local404 = -1;
				}
				local408 = local36.method5455();
			}
			this.aShortArray16[local410] = (short) (this.aShortArray16[local410] + ((local408 - 1 & 0x2) << 14));
			this.anIntArray149[local410] = local408;
			local404--;
		}
		local404 = 0;
		local406 = 0;
		@Pc(462) int local462 = 0;
		for (@Pc(464) int local464 = 0; local464 < 128; local464++) {
			if (this.anIntArray149[local464] != 0) {
				if (local404 == 0) {
					local462 = local36.aByteArray130[local83++] - 1;
					if (local406 < local55.length) {
						local404 = local55[local406++];
					} else {
						local404 = -1;
					}
				}
				this.aByteArray35[local464] = (byte) local462;
				local404--;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(520) int local520 = 0;
		for (@Pc(522) int local522 = 0; local522 < 128; local522++) {
			if (this.anIntArray149[local522] != 0) {
				if (local404 == 0) {
					local520 = local36.aByteArray130[local129++] + 16 << 2;
					if (local406 >= local105.length) {
						local404 = -1;
					} else {
						local404 = local105[local406++];
					}
				}
				local404--;
				this.aByteArray34[local522] = (byte) local520;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(576) Class139 local576 = null;
		for (@Pc(578) int local578 = 0; local578 < 128; local578++) {
			if (this.anIntArray149[local578] != 0) {
				if (local404 == 0) {
					local576 = local231[local178[local406]];
					if (local406 >= local154.length) {
						local404 = -1;
					} else {
						local404 = local154[local406++];
					}
				}
				this.aClass139Array1[local578] = local576;
				local404--;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(626) int local626 = 0;
		for (@Pc(628) int local628 = 0; local628 < 128; local628++) {
			if (local404 == 0) {
				if (local330.length <= local406) {
					local404 = -1;
				} else {
					local404 = local330[local406++];
				}
				if (this.anIntArray149[local628] > 0) {
					local626 = local36.method5495() + 1;
				}
			}
			this.aByteArray36[local628] = (byte) local626;
			local404--;
		}
		this.anInt1767 = local36.method5495() + 1;
		@Pc(692) int local692;
		for (@Pc(681) int local681 = 0; local681 < local185; local681++) {
			@Pc(687) Class139 local687 = local231[local681];
			if (local687.aByteArray73 != null) {
				for (local692 = 1; local692 < local687.aByteArray73.length; local692 += 2) {
					local687.aByteArray73[local692] = local36.method5484();
				}
			}
			if (local687.aByteArray72 != null) {
				for (local692 = 3; local692 < local687.aByteArray72.length - 2; local692 += 2) {
					local687.aByteArray72[local692] = local36.method5484();
				}
			}
		}
		@Pc(741) int local741;
		if (local301 != null) {
			for (local741 = 1; local741 < local301.length; local741 += 2) {
				local301[local741] = local36.method5484();
			}
		}
		if (local314 != null) {
			for (local741 = 1; local741 < local314.length; local741 += 2) {
				local314[local741] = local36.method5484();
			}
		}
		@Pc(790) int local790;
		for (local741 = 0; local741 < local185; local741++) {
			@Pc(783) Class139 local783 = local231[local741];
			if (local783.aByteArray72 != null) {
				local353 = 0;
				for (local790 = 2; local790 < local783.aByteArray72.length; local790 += 2) {
					local353 = local36.method5495() + local353 + 1;
					local783.aByteArray72[local790] = (byte) local353;
				}
			}
		}
		@Pc(839) int local839;
		for (local692 = 0; local692 < local185; local692++) {
			@Pc(832) Class139 local832 = local231[local692];
			if (local832.aByteArray73 != null) {
				local353 = 0;
				for (local839 = 2; local839 < local832.aByteArray73.length; local839 += 2) {
					local353 = local36.method5495() + local353 + 1;
					local832.aByteArray73[local839] = (byte) local353;
				}
			}
		}
		@Pc(917) int local917;
		@Pc(944) int local944;
		@Pc(950) byte local950;
		@Pc(969) int local969;
		@Pc(971) int local971;
		@Pc(980) int local980;
		@Pc(911) byte local911;
		@Pc(1021) int local1021;
		if (local301 != null) {
			local353 = local36.method5495();
			local301[0] = (byte) local353;
			for (local790 = 2; local790 < local301.length; local790 += 2) {
				local353 = local353 + local36.method5495() + 1;
				local301[local790] = (byte) local353;
			}
			local911 = local301[0];
			@Pc(915) byte local915 = local301[1];
			for (local917 = 0; local917 < local911; local917++) {
				this.aByteArray36[local917] = (byte) (local915 * this.aByteArray36[local917] + 32 >> 6);
			}
			local944 = 2;
			while (local301.length > local944) {
				local950 = local301[local944];
				@Pc(956) byte local956 = local301[local944 + 1];
				local969 = (local950 - local911) / 2 + (local950 - local911) * local915;
				for (local971 = local911; local971 < local950; local971++) {
					local980 = Static378.method5078(local969, local950 - local911);
					this.aByteArray36[local971] = (byte) (this.aByteArray36[local971] * local980 + 32 >> 6);
					local969 += local956 - local915;
				}
				local944 += 2;
				local911 = local950;
				local915 = local956;
			}
			for (local1021 = local911; local1021 < 128; local1021++) {
				this.aByteArray36[local1021] = (byte) (this.aByteArray36[local1021] * local915 + 32 >> 6);
			}
		}
		@Pc(1094) int local1094;
		if (local314 != null) {
			local353 = local36.method5495();
			local314[0] = (byte) local353;
			for (local790 = 2; local790 < local314.length; local790 += 2) {
				local353 = local353 + local36.method5495() + 1;
				local314[local790] = (byte) local353;
			}
			local911 = local314[0];
			local1094 = local314[1] << 1;
			for (local917 = 0; local917 < local911; local917++) {
				local944 = local1094 + (this.aByteArray34[local917] & 0xFF);
				if (local944 < 0) {
					local944 = 0;
				}
				if (local944 > 128) {
					local944 = 128;
				}
				this.aByteArray34[local917] = (byte) local944;
			}
			local944 = 2;
			@Pc(1149) int local1149;
			while (local944 < local314.length) {
				local950 = local314[local944];
				local1149 = local314[local944 + 1] << 1;
				local969 = (local950 - local911) * local1094 + (local950 - local911) / 2;
				for (local971 = local911; local971 < local950; local971++) {
					local980 = Static378.method5078(local969, local950 - local911);
					@Pc(1183) int local1183 = (this.aByteArray34[local971] & 0xFF) + local980;
					if (local1183 < 0) {
						local1183 = 0;
					}
					if (local1183 > 128) {
						local1183 = 128;
					}
					local969 += local1149 - local1094;
					this.aByteArray34[local971] = (byte) local1183;
				}
				local944 += 2;
				local1094 = local1149;
				local911 = local950;
			}
			for (local1021 = local911; local1021 < 128; local1021++) {
				local1149 = (this.aByteArray34[local1021] & 0xFF) + local1094;
				if (local1149 < 0) {
					local1149 = 0;
				}
				if (local1149 > 128) {
					local1149 = 128;
				}
				this.aByteArray34[local1021] = (byte) local1149;
			}
		}
		for (local790 = 0; local790 < local185; local790++) {
			local231[local790].anInt3812 = local36.method5495();
		}
		for (local839 = 0; local839 < local185; local839++) {
			@Pc(1283) Class139 local1283 = local231[local839];
			if (local1283.aByteArray73 != null) {
				local1283.anInt3810 = local36.method5495();
			}
			if (local1283.aByteArray72 != null) {
				local1283.anInt3811 = local36.method5495();
			}
			if (local1283.anInt3812 > 0) {
				local1283.anInt3813 = local36.method5495();
			}
		}
		for (local1094 = 0; local1094 < local185; local1094++) {
			local231[local1094].anInt3809 = local36.method5495();
		}
		for (local917 = 0; local917 < local185; local917++) {
			@Pc(1342) Class139 local1342 = local231[local917];
			if (local1342.anInt3809 > 0) {
				local1342.anInt3817 = local36.method5495();
			}
		}
		for (local944 = 0; local944 < local185; local944++) {
			@Pc(1369) Class139 local1369 = local231[local944];
			if (local1369.anInt3817 > 0) {
				local1369.anInt3814 = local36.method5495();
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public void method1471() {
		this.anIntArray149 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[I[BLclient!hf;)Z")
	public boolean method1472(@OriginalArg(1) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class105 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(16) Class2_Sub10_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray149[local18];
				if (local30 != 0) {
					if (local9 != local30) {
						local9 = local30--;
						if ((local30 & 0x1) == 0) {
							local16 = arg2.method2408(arg0, local30 >> 2);
						} else {
							local16 = arg2.method2410(local30 >> 2, arg0);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass2_Sub10_Sub1Array1[local18] = local16;
						this.anIntArray149[local18] = 0;
					}
				}
			}
		}
		return local7;
	}
}
