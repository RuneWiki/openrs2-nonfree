import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class14_Sub24 extends Class14 {

	@OriginalMember(owner = "client!po", name = "l", descriptor = "[B")
	public byte[] aByteArray145;

	@OriginalMember(owner = "client!po", name = "m", descriptor = "[I")
	private int[] anIntArray438;

	@OriginalMember(owner = "client!po", name = "o", descriptor = "[B")
	public byte[] aByteArray146;

	@OriginalMember(owner = "client!po", name = "t", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!po", name = "v", descriptor = "[B")
	public byte[] aByteArray147;

	@OriginalMember(owner = "client!po", name = "w", descriptor = "[Lclient!lp;")
	public Class131[] aClass131Array1;

	@OriginalMember(owner = "client!po", name = "z", descriptor = "I")
	public int anInt4855;

	@OriginalMember(owner = "client!po", name = "C", descriptor = "[Lclient!kr;")
	public Class14_Sub11_Sub1[] aClass14_Sub11_Sub1Array1;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	private Class14_Sub24() {
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "([B)V")
	public Class14_Sub24(@OriginalArg(0) byte[] arg0) {
		this.aClass14_Sub11_Sub1Array1 = new Class14_Sub11_Sub1[128];
		this.aByteArray146 = new byte[128];
		this.aShortArray99 = new short[128];
		this.anIntArray438 = new int[128];
		this.aByteArray145 = new byte[128];
		this.aByteArray147 = new byte[128];
		this.aClass131Array1 = new Class131[128];
		@Pc(36) Class14_Sub4 local36 = new Class14_Sub4(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray74[local38 + local36.anInt2637] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method2553();
		}
		local36.anInt2637++;
		local38++;
		@Pc(76) int local76 = local36.anInt2637;
		local36.anInt2637 += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray74[local84 + local36.anInt2637] != 0; local84++) {
		}
		@Pc(101) byte[] local101 = new byte[local84];
		for (@Pc(103) int local103 = 0; local103 < local84; local103++) {
			local101[local103] = local36.method2553();
		}
		local36.anInt2637++;
		local84++;
		@Pc(129) int local129 = local36.anInt2637;
		local36.anInt2637 += local84;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray74[local137 + local36.anInt2637] != 0; local137++) {
		}
		@Pc(154) byte[] local154 = new byte[local137];
		for (@Pc(156) int local156 = 0; local156 < local137; local156++) {
			local154[local156] = local36.method2553();
		}
		local137++;
		local36.anInt2637++;
		@Pc(182) byte[] local182 = new byte[local137];
		@Pc(195) int local195;
		@Pc(197) int local197;
		@Pc(203) int local203;
		if (local137 > 1) {
			local182[1] = 1;
			@Pc(193) int local193 = 1;
			local195 = 2;
			for (local197 = 2; local197 < local137; local197++) {
				local203 = local36.method2548();
				if (local203 == 0) {
					local193 = local195++;
				} else {
					if (local203 <= local193) {
						local203--;
					}
					local193 = local203;
				}
				local182[local197] = (byte) local193;
			}
		} else {
			local195 = local137;
		}
		@Pc(243) Class131[] local243 = new Class131[local195];
		for (local197 = 0; local197 < local243.length; local197++) {
			@Pc(255) Class131 local255 = local243[local197] = new Class131();
			@Pc(259) int local259 = local36.method2548();
			if (local259 > 0) {
				local255.aByteArray108 = new byte[local259 * 2];
			}
			local259 = local36.method2548();
			if (local259 > 0) {
				local255.aByteArray109 = new byte[local259 * 2 + 2];
				local255.aByteArray109[1] = 64;
			}
		}
		local203 = local36.method2548();
		@Pc(310) byte[] local310 = local203 > 0 ? new byte[local203 * 2] : null;
		local203 = local36.method2548();
		@Pc(323) byte[] local323 = local203 > 0 ? new byte[local203 * 2] : null;
		@Pc(325) int local325;
		for (local325 = 0; local36.aByteArray74[local325 + local36.anInt2637] != 0; local325++) {
		}
		@Pc(339) byte[] local339 = new byte[local325];
		for (@Pc(341) int local341 = 0; local341 < local325; local341++) {
			local339[local341] = local36.method2553();
		}
		local36.anInt2637++;
		local325++;
		@Pc(366) int local366 = 0;
		for (@Pc(368) int local368 = 0; local368 < 128; local368++) {
			local366 += local36.method2548();
			this.aShortArray99[local368] = (short) local366;
		}
		local366 = 0;
		for (@Pc(392) int local392 = 0; local392 < 128; local392++) {
			local366 += local36.method2548();
			this.aShortArray99[local392] = (short) (this.aShortArray99[local392] + (local366 << 8));
		}
		@Pc(417) int local417 = 0;
		@Pc(419) int local419 = 0;
		@Pc(421) int local421 = 0;
		for (@Pc(423) int local423 = 0; local423 < 128; local423++) {
			if (local417 == 0) {
				if (local339.length > local419) {
					local417 = local339[local419++];
				} else {
					local417 = -1;
				}
				local421 = local36.method2497();
			}
			this.aShortArray99[local423] = (short) (this.aShortArray99[local423] + ((local421 - 1 & 0x2) << 14));
			local417--;
			this.anIntArray438[local423] = local421;
		}
		local419 = 0;
		local417 = 0;
		@Pc(484) int local484 = 0;
		for (@Pc(486) int local486 = 0; local486 < 128; local486++) {
			if (this.anIntArray438[local486] != 0) {
				if (local417 == 0) {
					local484 = local36.aByteArray74[local76++] - 1;
					if (local419 < local52.length) {
						local417 = local52[local419++];
					} else {
						local417 = -1;
					}
				}
				local417--;
				this.aByteArray146[local486] = (byte) local484;
			}
		}
		local419 = 0;
		local417 = 0;
		@Pc(533) int local533 = 0;
		for (@Pc(535) int local535 = 0; local535 < 128; local535++) {
			if (this.anIntArray438[local535] != 0) {
				if (local417 == 0) {
					local533 = local36.aByteArray74[local129++] + 16 << 2;
					if (local101.length > local419) {
						local417 = local101[local419++];
					} else {
						local417 = -1;
					}
				}
				local417--;
				this.aByteArray145[local535] = (byte) local533;
			}
		}
		local417 = 0;
		local419 = 0;
		@Pc(591) Class131 local591 = null;
		for (@Pc(593) int local593 = 0; local593 < 128; local593++) {
			if (this.anIntArray438[local593] != 0) {
				if (local417 == 0) {
					local591 = local243[local182[local419]];
					if (local419 < local154.length) {
						local417 = local154[local419++];
					} else {
						local417 = -1;
					}
				}
				local417--;
				this.aClass131Array1[local593] = local591;
			}
		}
		local417 = 0;
		local419 = 0;
		@Pc(639) int local639 = 0;
		for (@Pc(641) int local641 = 0; local641 < 128; local641++) {
			if (local417 == 0) {
				if (local419 < local339.length) {
					local417 = local339[local419++];
				} else {
					local417 = -1;
				}
				if (this.anIntArray438[local641] > 0) {
					local639 = local36.method2548() + 1;
				}
			}
			this.aByteArray147[local641] = (byte) local639;
			local417--;
		}
		this.anInt4855 = local36.method2548() + 1;
		@Pc(712) int local712;
		for (@Pc(701) int local701 = 0; local701 < local195; local701++) {
			@Pc(707) Class131 local707 = local243[local701];
			if (local707.aByteArray108 != null) {
				for (local712 = 1; local712 < local707.aByteArray108.length; local712 += 2) {
					local707.aByteArray108[local712] = local36.method2553();
				}
			}
			if (local707.aByteArray109 != null) {
				for (local712 = 3; local712 < local707.aByteArray109.length - 2; local712 += 2) {
					local707.aByteArray109[local712] = local36.method2553();
				}
			}
		}
		@Pc(761) int local761;
		if (local310 != null) {
			for (local761 = 1; local761 < local310.length; local761 += 2) {
				local310[local761] = local36.method2553();
			}
		}
		if (local323 != null) {
			for (local761 = 1; local761 < local323.length; local761 += 2) {
				local323[local761] = local36.method2553();
			}
		}
		@Pc(806) int local806;
		for (local761 = 0; local761 < local195; local761++) {
			@Pc(799) Class131 local799 = local243[local761];
			if (local799.aByteArray109 != null) {
				local366 = 0;
				for (local806 = 2; local806 < local799.aByteArray109.length; local806 += 2) {
					local366 -= -local36.method2548() - 1;
					local799.aByteArray109[local806] = (byte) local366;
				}
			}
		}
		@Pc(856) int local856;
		for (local712 = 0; local712 < local195; local712++) {
			@Pc(849) Class131 local849 = local243[local712];
			if (local849.aByteArray108 != null) {
				local366 = 0;
				for (local856 = 2; local856 < local849.aByteArray108.length; local856 += 2) {
					local366 = local366 + local36.method2548() + 1;
					local849.aByteArray108[local856] = (byte) local366;
				}
			}
		}
		@Pc(935) int local935;
		@Pc(958) int local958;
		@Pc(964) byte local964;
		@Pc(984) int local984;
		@Pc(986) int local986;
		@Pc(996) int local996;
		@Pc(929) byte local929;
		@Pc(1041) int local1041;
		if (local310 != null) {
			local366 = local36.method2548();
			local310[0] = (byte) local366;
			for (local806 = 2; local806 < local310.length; local806 += 2) {
				local366 = local366 + local36.method2548() + 1;
				local310[local806] = (byte) local366;
			}
			local929 = local310[0];
			@Pc(933) byte local933 = local310[1];
			for (local935 = 0; local935 < local929; local935++) {
				this.aByteArray147[local935] = (byte) (this.aByteArray147[local935] * local933 + 32 >> 6);
			}
			local958 = 2;
			while (local958 < local310.length) {
				local964 = local310[local958];
				@Pc(970) byte local970 = local310[local958 + 1];
				local984 = local933 * (local964 - local929) + (local964 - local929) / 2;
				for (local986 = local929; local986 < local964; local986++) {
					local996 = Static321.method5532(local964 - local929, local984);
					local984 += local970 - local933;
					this.aByteArray147[local986] = (byte) (local996 * this.aByteArray147[local986] + 32 >> 6);
				}
				local933 = local970;
				local958 += 2;
				local929 = local964;
			}
			for (local1041 = local929; local1041 < 128; local1041++) {
				this.aByteArray147[local1041] = (byte) (local933 * this.aByteArray147[local1041] + 32 >> 6);
			}
		}
		@Pc(1110) int local1110;
		if (local323 != null) {
			local366 = local36.method2548();
			local323[0] = (byte) local366;
			for (local806 = 2; local806 < local323.length; local806 += 2) {
				local366 = local366 + local36.method2548() + 1;
				local323[local806] = (byte) local366;
			}
			local929 = local323[0];
			local1110 = local323[1] << 1;
			for (local935 = 0; local935 < local929; local935++) {
				local958 = local1110 + (this.aByteArray145[local935] & 0xFF);
				if (local958 < 0) {
					local958 = 0;
				}
				if (local958 > 128) {
					local958 = 128;
				}
				this.aByteArray145[local935] = (byte) local958;
			}
			local958 = 2;
			@Pc(1158) int local1158;
			while (local958 < local323.length) {
				local964 = local323[local958];
				local1158 = local323[local958 + 1] << 1;
				local984 = local1110 * (local964 - local929) + (local964 - local929) / 2;
				for (local986 = local929; local986 < local964; local986++) {
					local996 = Static321.method5532(local964 - local929, local984);
					@Pc(1193) int local1193 = local996 + (this.aByteArray145[local986] & 0xFF);
					if (local1193 < 0) {
						local1193 = 0;
					}
					if (local1193 > 128) {
						local1193 = 128;
					}
					local984 += local1158 - local1110;
					this.aByteArray145[local986] = (byte) local1193;
				}
				local929 = local964;
				local958 += 2;
				local1110 = local1158;
			}
			for (local1041 = local929; local1041 < 128; local1041++) {
				local1158 = local1110 + (this.aByteArray145[local1041] & 0xFF);
				if (local1158 < 0) {
					local1158 = 0;
				}
				if (local1158 > 128) {
					local1158 = 128;
				}
				this.aByteArray145[local1041] = (byte) local1158;
			}
		}
		for (local806 = 0; local806 < local195; local806++) {
			local243[local806].anInt3820 = local36.method2548();
		}
		for (local856 = 0; local856 < local195; local856++) {
			@Pc(1302) Class131 local1302 = local243[local856];
			if (local1302.aByteArray108 != null) {
				local1302.anInt3824 = local36.method2548();
			}
			if (local1302.aByteArray109 != null) {
				local1302.anInt3819 = local36.method2548();
			}
			if (local1302.anInt3820 > 0) {
				local1302.anInt3825 = local36.method2548();
			}
		}
		for (local1110 = 0; local1110 < local195; local1110++) {
			local243[local1110].anInt3827 = local36.method2548();
		}
		for (local935 = 0; local935 < local195; local935++) {
			@Pc(1364) Class131 local1364 = local243[local935];
			if (local1364.anInt3827 > 0) {
				local1364.anInt3821 = local36.method2548();
			}
		}
		for (local958 = 0; local958 < local195; local958++) {
			@Pc(1387) Class131 local1387 = local243[local958];
			if (local1387.anInt3821 > 0) {
				local1387.anInt3822 = local36.method2548();
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!eq;[B[II)Z")
	public boolean method4371(@OriginalArg(0) Class55 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2) {
		@Pc(13) boolean local13 = true;
		@Pc(15) int local15 = 0;
		@Pc(17) Class14_Sub11_Sub1 local17 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg1 == null || arg1[local19] != 0) {
				@Pc(31) int local31 = this.anIntArray438[local19];
				if (local31 != 0) {
					if (local15 != local31) {
						local15 = local31--;
						if ((local31 & 0x1) == 0) {
							local17 = arg0.method1909(local31 >> 2, arg2);
						} else {
							local17 = arg0.method1914(arg2, local31 >> 2);
						}
						if (local17 == null) {
							local13 = false;
						}
					}
					if (local17 != null) {
						this.aClass14_Sub11_Sub1Array1[local19] = local17;
						this.anIntArray438[local19] = 0;
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V")
	public void method4372() {
		this.anIntArray438 = null;
	}
}
