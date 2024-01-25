import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class4_Sub26 extends Class4 {

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
	public int anInt4182;

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "[Lclient!kd;")
	public Class144[] aClass144Array1;

	@OriginalMember(owner = "client!mq", name = "r", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!mq", name = "s", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!mq", name = "t", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "[Lclient!jc;")
	public Class4_Sub15_Sub1[] aClass4_Sub15_Sub1Array1;

	static {
		new Class15("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	private Class4_Sub26() {
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "([B)V")
	public Class4_Sub26(@OriginalArg(0) byte[] arg0) {
		this.aByteArray56 = new byte[128];
		this.aShortArray81 = new short[128];
		this.aClass4_Sub15_Sub1Array1 = new Class4_Sub15_Sub1[128];
		this.anIntArray348 = new int[128];
		this.aClass144Array1 = new Class144[128];
		this.aByteArray57 = new byte[128];
		this.aByteArray55 = new byte[128];
		@Pc(36) Class4_Sub9 local36 = new Class4_Sub9(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray81[local36.anInt6207 + local38] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method5063();
		}
		local36.anInt6207++;
		local38++;
		@Pc(79) int local79 = local36.anInt6207;
		local36.anInt6207 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray81[local87 + local36.anInt6207] != 0; local87++) {
		}
		@Pc(101) byte[] local101 = new byte[local87];
		for (@Pc(103) int local103 = 0; local103 < local87; local103++) {
			local101[local103] = local36.method5063();
		}
		local87++;
		local36.anInt6207++;
		@Pc(129) int local129 = local36.anInt6207;
		local36.anInt6207 += local87;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray81[local36.anInt6207 + local137] != 0; local137++) {
		}
		@Pc(154) byte[] local154 = new byte[local137];
		for (@Pc(156) int local156 = 0; local156 < local137; local156++) {
			local154[local156] = local36.method5063();
		}
		local36.anInt6207++;
		local137++;
		@Pc(178) byte[] local178 = new byte[local137];
		@Pc(183) int local183;
		@Pc(195) int local195;
		@Pc(201) int local201;
		if (local137 <= 1) {
			local183 = local137;
		} else {
			local178[1] = 1;
			@Pc(191) int local191 = 1;
			local183 = 2;
			for (local195 = 2; local195 < local137; local195++) {
				local201 = local36.method5007();
				if (local201 == 0) {
					local191 = local183++;
				} else {
					if (local201 <= local191) {
						local201--;
					}
					local191 = local201;
				}
				local178[local195] = (byte) local191;
			}
		}
		@Pc(226) Class144[] local226 = new Class144[local183];
		for (local195 = 0; local195 < local226.length; local195++) {
			@Pc(238) Class144 local238 = local226[local195] = new Class144();
			@Pc(242) int local242 = local36.method5007();
			if (local242 > 0) {
				local238.aByteArray38 = new byte[local242 * 2];
			}
			local242 = local36.method5007();
			if (local242 > 0) {
				local238.aByteArray39 = new byte[local242 * 2 + 2];
				local238.aByteArray39[1] = 64;
			}
		}
		local201 = local36.method5007();
		@Pc(297) byte[] local297 = local201 <= 0 ? null : new byte[local201 * 2];
		local201 = local36.method5007();
		@Pc(310) byte[] local310 = local201 > 0 ? new byte[local201 * 2] : null;
		@Pc(312) int local312;
		for (local312 = 0; local36.aByteArray81[local36.anInt6207 + local312] != 0; local312++) {
		}
		@Pc(327) byte[] local327 = new byte[local312];
		for (@Pc(329) int local329 = 0; local329 < local312; local329++) {
			local327[local329] = local36.method5063();
		}
		local312++;
		local36.anInt6207++;
		@Pc(350) int local350 = 0;
		for (@Pc(352) int local352 = 0; local352 < 128; local352++) {
			local350 += local36.method5007();
			this.aShortArray81[local352] = (short) local350;
		}
		local350 = 0;
		for (@Pc(374) int local374 = 0; local374 < 128; local374++) {
			local350 += local36.method5007();
			this.aShortArray81[local374] = (short) (this.aShortArray81[local374] + (local350 << 8));
		}
		@Pc(401) int local401 = 0;
		@Pc(403) int local403 = 0;
		@Pc(405) int local405 = 0;
		for (@Pc(407) int local407 = 0; local407 < 128; local407++) {
			if (local401 == 0) {
				if (local327.length > local403) {
					local401 = local327[local403++];
				} else {
					local401 = -1;
				}
				local405 = local36.method5000();
			}
			this.aShortArray81[local407] = (short) (this.aShortArray81[local407] + ((local405 - 1 & 0x2) << 14));
			local401--;
			this.anIntArray348[local407] = local405;
		}
		local403 = 0;
		local401 = 0;
		@Pc(461) int local461 = 0;
		for (@Pc(463) int local463 = 0; local463 < 128; local463++) {
			if (this.anIntArray348[local463] != 0) {
				if (local401 == 0) {
					if (local403 < local55.length) {
						local401 = local55[local403++];
					} else {
						local401 = -1;
					}
					local461 = local36.aByteArray81[local79++] - 1;
				}
				this.aByteArray56[local463] = (byte) local461;
				local401--;
			}
		}
		local401 = 0;
		local403 = 0;
		@Pc(515) int local515 = 0;
		for (@Pc(517) int local517 = 0; local517 < 128; local517++) {
			if (this.anIntArray348[local517] != 0) {
				if (local401 == 0) {
					local515 = local36.aByteArray81[local129++] + 16 << 2;
					if (local403 >= local101.length) {
						local401 = -1;
					} else {
						local401 = local101[local403++];
					}
				}
				local401--;
				this.aByteArray57[local517] = (byte) local515;
			}
		}
		local403 = 0;
		local401 = 0;
		@Pc(576) Class144 local576 = null;
		for (@Pc(578) int local578 = 0; local578 < 128; local578++) {
			if (this.anIntArray348[local578] != 0) {
				if (local401 == 0) {
					local576 = local226[local178[local403]];
					if (local154.length <= local403) {
						local401 = -1;
					} else {
						local401 = local154[local403++];
					}
				}
				this.aClass144Array1[local578] = local576;
				local401--;
			}
		}
		local403 = 0;
		local401 = 0;
		@Pc(624) int local624 = 0;
		for (@Pc(626) int local626 = 0; local626 < 128; local626++) {
			if (local401 == 0) {
				if (local327.length <= local403) {
					local401 = -1;
				} else {
					local401 = local327[local403++];
				}
				if (this.anIntArray348[local626] > 0) {
					local624 = local36.method5007() + 1;
				}
			}
			local401--;
			this.aByteArray55[local626] = (byte) local624;
		}
		this.anInt4182 = local36.method5007() + 1;
		@Pc(687) int local687;
		for (@Pc(676) int local676 = 0; local676 < local183; local676++) {
			@Pc(682) Class144 local682 = local226[local676];
			if (local682.aByteArray38 != null) {
				for (local687 = 1; local687 < local682.aByteArray38.length; local687 += 2) {
					local682.aByteArray38[local687] = local36.method5063();
				}
			}
			if (local682.aByteArray39 != null) {
				for (local687 = 3; local687 < local682.aByteArray39.length - 2; local687 += 2) {
					local682.aByteArray39[local687] = local36.method5063();
				}
			}
		}
		@Pc(736) int local736;
		if (local297 != null) {
			for (local736 = 1; local736 < local297.length; local736 += 2) {
				local297[local736] = local36.method5063();
			}
		}
		if (local310 != null) {
			for (local736 = 1; local736 < local310.length; local736 += 2) {
				local310[local736] = local36.method5063();
			}
		}
		@Pc(785) int local785;
		for (local736 = 0; local736 < local183; local736++) {
			@Pc(778) Class144 local778 = local226[local736];
			if (local778.aByteArray39 != null) {
				local350 = 0;
				for (local785 = 2; local785 < local778.aByteArray39.length; local785 += 2) {
					local350 = local350 + local36.method5007() + 1;
					local778.aByteArray39[local785] = (byte) local350;
				}
			}
		}
		@Pc(827) int local827;
		for (local687 = 0; local687 < local183; local687++) {
			@Pc(820) Class144 local820 = local226[local687];
			if (local820.aByteArray38 != null) {
				local350 = 0;
				for (local827 = 2; local827 < local820.aByteArray38.length; local827 += 2) {
					local350 = local350 + local36.method5007() + 1;
					local820.aByteArray38[local827] = (byte) local350;
				}
			}
		}
		@Pc(900) int local900;
		@Pc(927) int local927;
		@Pc(933) byte local933;
		@Pc(953) int local953;
		@Pc(955) int local955;
		@Pc(964) int local964;
		@Pc(894) byte local894;
		@Pc(1005) int local1005;
		if (local297 != null) {
			local350 = local36.method5007();
			local297[0] = (byte) local350;
			for (local785 = 2; local785 < local297.length; local785 += 2) {
				local350 = local36.method5007() + local350 + 1;
				local297[local785] = (byte) local350;
			}
			local894 = local297[0];
			@Pc(898) byte local898 = local297[1];
			for (local900 = 0; local900 < local894; local900++) {
				this.aByteArray55[local900] = (byte) (this.aByteArray55[local900] * local898 + 32 >> 6);
			}
			local927 = 2;
			while (local297.length > local927) {
				local933 = local297[local927];
				@Pc(939) byte local939 = local297[local927 + 1];
				local953 = local898 * (local933 - local894) + (local933 - local894) / 2;
				for (local955 = local894; local955 < local933; local955++) {
					local964 = Static290.method3785(local933 - local894, local953);
					local953 += local939 - local898;
					this.aByteArray55[local955] = (byte) (local964 * this.aByteArray55[local955] + 32 >> 6);
				}
				local898 = local939;
				local927 += 2;
				local894 = local933;
			}
			for (local1005 = local894; local1005 < 128; local1005++) {
				this.aByteArray55[local1005] = (byte) (this.aByteArray55[local1005] * local898 + 32 >> 6);
			}
		}
		@Pc(1071) int local1071;
		if (local310 != null) {
			local350 = local36.method5007();
			local310[0] = (byte) local350;
			for (local785 = 2; local785 < local310.length; local785 += 2) {
				local350 += local36.method5007() + 1;
				local310[local785] = (byte) local350;
			}
			local894 = local310[0];
			local1071 = local310[1] << 1;
			for (local900 = 0; local900 < local894; local900++) {
				local927 = local1071 + (this.aByteArray57[local900] & 0xFF);
				if (local927 < 0) {
					local927 = 0;
				}
				if (local927 > 128) {
					local927 = 128;
				}
				this.aByteArray57[local900] = (byte) local927;
			}
			local927 = 2;
			@Pc(1126) int local1126;
			while (local927 < local310.length) {
				local933 = local310[local927];
				local1126 = local310[local927 + 1] << 1;
				local953 = (local933 - local894) * local1071 + (local933 - local894) / 2;
				for (local955 = local894; local955 < local933; local955++) {
					local964 = Static290.method3785(local933 - local894, local953);
					@Pc(1160) int local1160 = local964 + (this.aByteArray57[local955] & 0xFF);
					if (local1160 < 0) {
						local1160 = 0;
					}
					if (local1160 > 128) {
						local1160 = 128;
					}
					local953 += local1126 - local1071;
					this.aByteArray57[local955] = (byte) local1160;
				}
				local1071 = local1126;
				local927 += 2;
				local894 = local933;
			}
			for (local1005 = local894; local1005 < 128; local1005++) {
				local1126 = (this.aByteArray57[local1005] & 0xFF) + local1071;
				if (local1126 < 0) {
					local1126 = 0;
				}
				if (local1126 > 128) {
					local1126 = 128;
				}
				this.aByteArray57[local1005] = (byte) local1126;
			}
		}
		for (local785 = 0; local785 < local183; local785++) {
			local226[local785].anInt3570 = local36.method5007();
		}
		for (local827 = 0; local827 < local183; local827++) {
			@Pc(1262) Class144 local1262 = local226[local827];
			if (local1262.aByteArray38 != null) {
				local1262.anInt3579 = local36.method5007();
			}
			if (local1262.aByteArray39 != null) {
				local1262.anInt3578 = local36.method5007();
			}
			if (local1262.anInt3570 > 0) {
				local1262.anInt3569 = local36.method5007();
			}
		}
		for (local1071 = 0; local1071 < local183; local1071++) {
			local226[local1071].anInt3575 = local36.method5007();
		}
		for (local900 = 0; local900 < local183; local900++) {
			@Pc(1317) Class144 local1317 = local226[local900];
			if (local1317.anInt3575 > 0) {
				local1317.anInt3580 = local36.method5007();
			}
		}
		for (local927 = 0; local927 < local183; local927++) {
			@Pc(1341) Class144 local1341 = local226[local927];
			if (local1341.anInt3580 > 0) {
				local1341.anInt3581 = local36.method5007();
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "([I[BBLclient!jj;)Z")
	public boolean method3328(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class136 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(18) Class4_Sub15_Sub1 local18 = null;
		for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
			if (arg1 == null || arg1[local20] != 0) {
				@Pc(35) int local35 = this.anIntArray348[local20];
				if (local35 != 0) {
					if (local9 != local35) {
						local9 = local35--;
						if ((local35 & 0x1) == 0) {
							local18 = arg2.method2731(arg0, local35 >> 2);
						} else {
							local18 = arg2.method2727(arg0, local35 >> 2);
						}
						if (local18 == null) {
							local7 = false;
						}
					}
					if (local18 != null) {
						this.aClass4_Sub15_Sub1Array1[local20] = local18;
						this.anIntArray348[local20] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(Z)V")
	public void method3329() {
		this.anIntArray348 = null;
	}
}
