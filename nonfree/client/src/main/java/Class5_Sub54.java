import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class5_Sub54 extends Class5 {

	@OriginalMember(owner = "client!wfa", name = "l", descriptor = "I")
	public int anInt10606;

	@OriginalMember(owner = "client!wfa", name = "t", descriptor = "[I")
	private int[] anIntArray612;

	@OriginalMember(owner = "client!wfa", name = "j", descriptor = "[S")
	public short[] aShortArray157;

	@OriginalMember(owner = "client!wfa", name = "r", descriptor = "[B")
	public byte[] aByteArray110;

	@OriginalMember(owner = "client!wfa", name = "s", descriptor = "[Lclient!ps;")
	public Class5_Sub24_Sub1[] aClass5_Sub24_Sub1Array1;

	@OriginalMember(owner = "client!wfa", name = "u", descriptor = "[B")
	public byte[] aByteArray111;

	@OriginalMember(owner = "client!wfa", name = "n", descriptor = "[Lclient!hha;")
	public Class159[] aClass159Array1;

	@OriginalMember(owner = "client!wfa", name = "q", descriptor = "[B")
	public byte[] aByteArray112;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "()V")
	private Class5_Sub54() {
	}

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "([B)V")
	public Class5_Sub54(@OriginalArg(0) byte[] arg0) {
		this.anIntArray612 = new int[128];
		this.aShortArray157 = new short[128];
		this.aClass159Array1 = new Class159[128];
		this.aByteArray112 = new byte[128];
		this.aByteArray111 = new byte[128];
		this.aClass5_Sub24_Sub1Array1 = new Class5_Sub24_Sub1[128];
		this.aByteArray110 = new byte[128];
		@Pc(36) Class5_Sub23 local36 = new Class5_Sub23(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray102[local38 + local36.anInt9869] != 0; local38++) {
		}
		@Pc(57) byte[] local57 = new byte[local38];
		for (@Pc(59) int local59 = 0; local59 < local38; local59++) {
			local57[local59] = local36.method8488();
		}
		local38++;
		local36.anInt9869++;
		@Pc(87) int local87 = local36.anInt9869;
		local36.anInt9869 += local38;
		@Pc(95) int local95;
		for (local95 = 0; local36.aByteArray102[local95 + local36.anInt9869] != 0; local95++) {
		}
		@Pc(113) byte[] local113 = new byte[local95];
		for (@Pc(115) int local115 = 0; local115 < local95; local115++) {
			local113[local115] = local36.method8488();
		}
		local95++;
		local36.anInt9869++;
		@Pc(143) int local143 = local36.anInt9869;
		local36.anInt9869 += local95;
		@Pc(151) int local151;
		for (local151 = 0; local36.aByteArray102[local151 + local36.anInt9869] != 0; local151++) {
		}
		@Pc(172) byte[] local172 = new byte[local151];
		for (@Pc(174) int local174 = 0; local174 < local151; local174++) {
			local172[local174] = local36.method8488();
		}
		local151++;
		local36.anInt9869++;
		@Pc(198) byte[] local198 = new byte[local151];
		@Pc(207) int local207;
		@Pc(219) int local219;
		@Pc(225) int local225;
		if (local151 <= 1) {
			local207 = local151;
		} else {
			local198[1] = 1;
			@Pc(215) int local215 = 1;
			local207 = 2;
			for (local219 = 2; local219 < local151; local219++) {
				local225 = local36.method8529();
				if (local225 == 0) {
					local215 = local207++;
				} else {
					if (local215 >= local225) {
						local225--;
					}
					local215 = local225;
				}
				local198[local219] = (byte) local215;
			}
		}
		@Pc(261) Class159[] local261 = new Class159[local207];
		for (local219 = 0; local219 < local261.length; local219++) {
			@Pc(273) Class159 local273 = local261[local219] = new Class159();
			@Pc(277) int local277 = local36.method8529();
			if (local277 > 0) {
				local273.aByteArray18 = new byte[local277 * 2];
			}
			local277 = local36.method8529();
			if (local277 > 0) {
				local273.aByteArray19 = new byte[local277 * 2 + 2];
				local273.aByteArray19[1] = 64;
			}
		}
		local225 = local36.method8529();
		@Pc(333) byte[] local333 = local225 > 0 ? new byte[local225 * 2] : null;
		local225 = local36.method8529();
		@Pc(347) byte[] local347 = local225 <= 0 ? null : new byte[local225 * 2];
		@Pc(349) int local349;
		for (local349 = 0; local36.aByteArray102[local349 + local36.anInt9869] != 0; local349++) {
		}
		@Pc(365) byte[] local365 = new byte[local349];
		for (@Pc(367) int local367 = 0; local367 < local349; local367++) {
			local365[local367] = local36.method8488();
		}
		local349++;
		local36.anInt9869++;
		@Pc(390) int local390 = 0;
		for (@Pc(392) int local392 = 0; local392 < 128; local392++) {
			local390 += local36.method8529();
			this.aShortArray157[local392] = (short) local390;
		}
		local390 = 0;
		for (@Pc(416) int local416 = 0; local416 < 128; local416++) {
			local390 += local36.method8529();
			this.aShortArray157[local416] = (short) (this.aShortArray157[local416] + (local390 << 8));
		}
		@Pc(443) int local443 = 0;
		@Pc(445) int local445 = 0;
		@Pc(447) int local447 = 0;
		for (@Pc(449) int local449 = 0; local449 < 128; local449++) {
			if (local443 == 0) {
				if (local445 < local365.length) {
					local443 = local365[local445++];
				} else {
					local443 = -1;
				}
				local447 = local36.method8498();
			}
			this.aShortArray157[local449] = (short) (this.aShortArray157[local449] + ((local447 - 1 & 0x2) << 14));
			this.anIntArray612[local449] = local447;
			local443--;
		}
		local443 = 0;
		local445 = 0;
		@Pc(512) int local512 = 0;
		for (@Pc(514) int local514 = 0; local514 < 128; local514++) {
			if (this.anIntArray612[local514] != 0) {
				if (local443 == 0) {
					if (local57.length > local445) {
						local443 = local57[local445++];
					} else {
						local443 = -1;
					}
					local512 = local36.aByteArray102[local87++] - 1;
				}
				local443--;
				this.aByteArray110[local514] = (byte) local512;
			}
		}
		local445 = 0;
		local443 = 0;
		@Pc(576) int local576 = 0;
		for (@Pc(578) int local578 = 0; local578 < 128; local578++) {
			if (this.anIntArray612[local578] != 0) {
				if (local443 == 0) {
					local576 = local36.aByteArray102[local143++] + 16 << 2;
					if (local113.length > local445) {
						local443 = local113[local445++];
					} else {
						local443 = -1;
					}
				}
				this.aByteArray112[local578] = (byte) local576;
				local443--;
			}
		}
		local445 = 0;
		local443 = 0;
		@Pc(645) Class159 local645 = null;
		for (@Pc(647) int local647 = 0; local647 < 128; local647++) {
			if (this.anIntArray612[local647] != 0) {
				if (local443 == 0) {
					local645 = local261[local198[local445]];
					if (local172.length > local445) {
						local443 = local172[local445++];
					} else {
						local443 = -1;
					}
				}
				local443--;
				this.aClass159Array1[local647] = local645;
			}
		}
		local443 = 0;
		local445 = 0;
		@Pc(700) int local700 = 0;
		for (@Pc(702) int local702 = 0; local702 < 128; local702++) {
			if (local443 == 0) {
				if (local445 >= local365.length) {
					local443 = -1;
				} else {
					local443 = local365[local445++];
				}
				if (this.anIntArray612[local702] > 0) {
					local700 = local36.method8529() + 1;
				}
			}
			this.aByteArray111[local702] = (byte) local700;
			local443--;
		}
		this.anInt10606 = local36.method8529() + 1;
		@Pc(769) int local769;
		for (@Pc(756) int local756 = 0; local756 < local207; local756++) {
			@Pc(764) Class159 local764 = local261[local756];
			if (local764.aByteArray18 != null) {
				for (local769 = 1; local769 < local764.aByteArray18.length; local769 += 2) {
					local764.aByteArray18[local769] = local36.method8488();
				}
			}
			if (local764.aByteArray19 != null) {
				for (local769 = 3; local769 < local764.aByteArray19.length - 2; local769 += 2) {
					local764.aByteArray19[local769] = local36.method8488();
				}
			}
		}
		@Pc(836) int local836;
		if (local333 != null) {
			for (local836 = 1; local836 < local333.length; local836 += 2) {
				local333[local836] = local36.method8488();
			}
		}
		if (local347 != null) {
			for (local836 = 1; local836 < local347.length; local836 += 2) {
				local347[local836] = local36.method8488();
			}
		}
		@Pc(899) int local899;
		for (local836 = 0; local836 < local207; local836++) {
			@Pc(892) Class159 local892 = local261[local836];
			if (local892.aByteArray19 != null) {
				local390 = 0;
				for (local899 = 2; local899 < local892.aByteArray19.length; local899 += 2) {
					local390 += local36.method8529() + 1;
					local892.aByteArray19[local899] = (byte) local390;
				}
			}
		}
		@Pc(950) int local950;
		for (local769 = 0; local769 < local207; local769++) {
			@Pc(943) Class159 local943 = local261[local769];
			if (local943.aByteArray18 != null) {
				local390 = 0;
				for (local950 = 2; local950 < local943.aByteArray18.length; local950 += 2) {
					local390 = local390 + local36.method8529() + 1;
					local943.aByteArray18[local950] = (byte) local390;
				}
			}
		}
		@Pc(1028) int local1028;
		@Pc(1059) int local1059;
		@Pc(1067) byte local1067;
		@Pc(1088) int local1088;
		@Pc(1090) int local1090;
		@Pc(1102) int local1102;
		@Pc(1022) byte local1022;
		@Pc(1146) int local1146;
		if (local333 != null) {
			local390 = local36.method8529();
			local333[0] = (byte) local390;
			for (local899 = 2; local899 < local333.length; local899 += 2) {
				local390 = local390 + local36.method8529() + 1;
				local333[local899] = (byte) local390;
			}
			local1022 = local333[0];
			@Pc(1026) byte local1026 = local333[1];
			for (local1028 = 0; local1028 < local1022; local1028++) {
				this.aByteArray111[local1028] = (byte) (this.aByteArray111[local1028] * local1026 + 32 >> 6);
			}
			local1059 = 2;
			while (local333.length > local1059) {
				local1067 = local333[local1059];
				@Pc(1073) byte local1073 = local333[local1059 + 1];
				local1088 = (local1067 - local1022) * local1026 + (local1067 - local1022) / 2;
				for (local1090 = local1022; local1090 < local1067; local1090++) {
					local1102 = Static422.method6307(local1067 - local1022, local1088);
					this.aByteArray111[local1090] = (byte) (local1102 * this.aByteArray111[local1090] + 32 >> 6);
					local1088 += local1073 - local1026;
				}
				local1026 = local1073;
				local1059 += 2;
				local1022 = local1067;
			}
			for (local1146 = local1022; local1146 < 128; local1146++) {
				this.aByteArray111[local1146] = (byte) (local1026 * this.aByteArray111[local1146] + 32 >> 6);
			}
		}
		@Pc(1220) int local1220;
		if (local347 != null) {
			local390 = local36.method8529();
			local347[0] = (byte) local390;
			for (local899 = 2; local899 < local347.length; local899 += 2) {
				local390 += local36.method8529() + 1;
				local347[local899] = (byte) local390;
			}
			local1022 = local347[0];
			local1220 = local347[1] << 1;
			for (local1028 = 0; local1028 < local1022; local1028++) {
				local1059 = (this.aByteArray112[local1028] & 0xFF) + local1220;
				if (local1059 < 0) {
					local1059 = 0;
				}
				if (local1059 > 128) {
					local1059 = 128;
				}
				this.aByteArray112[local1028] = (byte) local1059;
			}
			local1059 = 2;
			@Pc(1276) int local1276;
			while (local1059 < local347.length) {
				local1067 = local347[local1059];
				local1276 = local347[local1059 + 1] << 1;
				local1088 = (local1067 - local1022) / 2 + (local1067 - local1022) * local1220;
				for (local1090 = local1022; local1090 < local1067; local1090++) {
					local1102 = Static422.method6307(local1067 - local1022, local1088);
					@Pc(1313) int local1313 = local1102 + (this.aByteArray112[local1090] & 0xFF);
					if (local1313 < 0) {
						local1313 = 0;
					}
					if (local1313 > 128) {
						local1313 = 128;
					}
					this.aByteArray112[local1090] = (byte) local1313;
					local1088 += local1276 - local1220;
				}
				local1059 += 2;
				local1022 = local1067;
				local1220 = local1276;
			}
			for (local1146 = local1022; local1146 < 128; local1146++) {
				local1276 = local1220 + (this.aByteArray112[local1146] & 0xFF);
				if (local1276 < 0) {
					local1276 = 0;
				}
				if (local1276 > 128) {
					local1276 = 128;
				}
				this.aByteArray112[local1146] = (byte) local1276;
			}
		}
		for (local899 = 0; local899 < local207; local899++) {
			local261[local899].anInt3624 = local36.method8529();
		}
		for (local950 = 0; local950 < local207; local950++) {
			@Pc(1422) Class159 local1422 = local261[local950];
			if (local1422.aByteArray18 != null) {
				local1422.anInt3621 = local36.method8529();
			}
			if (local1422.aByteArray19 != null) {
				local1422.anInt3620 = local36.method8529();
			}
			if (local1422.anInt3624 > 0) {
				local1422.anInt3619 = local36.method8529();
			}
		}
		for (local1220 = 0; local1220 < local207; local1220++) {
			local261[local1220].anInt3618 = local36.method8529();
		}
		for (local1028 = 0; local1028 < local207; local1028++) {
			@Pc(1483) Class159 local1483 = local261[local1028];
			if (local1483.anInt3618 > 0) {
				local1483.anInt3616 = local36.method8529();
			}
		}
		for (local1059 = 0; local1059 < local207; local1059++) {
			@Pc(1505) Class159 local1505 = local261[local1059];
			if (local1505.anInt3616 > 0) {
				local1505.anInt3622 = local36.method8529();
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
	public void method9141() {
		this.anIntArray612 = null;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "([II[BLclient!fia;)Z")
	public boolean method9142(@OriginalArg(0) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class126 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class5_Sub24_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(32) int local32 = this.anIntArray612[local13];
				if (local32 != 0) {
					if (local32 != local9) {
						local9 = local32--;
						if ((local32 & 0x1) == 0) {
							local11 = arg2.method2493(local32 >> 2, arg0);
						} else {
							local11 = arg2.method2489(local32 >> 2, arg0);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass5_Sub24_Sub1Array1[local13] = local11;
						this.anIntArray612[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
