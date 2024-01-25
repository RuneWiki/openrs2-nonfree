import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class127 {

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "Z")
	public boolean aBoolean307 = true;

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
	private int anInt3763 = -1;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "Lclient!bda;")
	private final Class4_Sub2 aClass4_Sub2_8;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "Lclient!rt;")
	private final Class260 aClass260_1;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
	private final int anInt3758;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
	private final int anInt3762;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
	private int anInt3767;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
	private int anInt3761;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "Lclient!iaa;")
	private Interface9 anInterface9_3;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
	public final int anInt3755;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "Lclient!eea;")
	private Interface5 anInterface5_3;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!bda;Lclient!rt;Lclient!ml;IIIII)V")
	public Class127(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) Class7_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass4_Sub2_8 = arg0;
		this.aClass260_1 = arg1;
		this.anInt3758 = arg7;
		this.anInt3762 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = (local35 + local37) * arg2.anInt9577 + local31;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray6[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface5_3 = null;
			this.anInt3755 = 0;
		} else {
			this.anInt3767 = Integer.MIN_VALUE;
			this.anInt3761 = Integer.MAX_VALUE;
			this.anInterface9_3 = this.aClass4_Sub2_8.method7227(false);
			this.anInterface9_3.method7607(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(103) Buffer local103 = this.anInterface9_3.method7613();
				if (local103 != null) {
					@Pc(111) Stream local111 = this.aClass4_Sub2_8.method7263(local103);
					@Pc(115) int local115;
					@Pc(126) int local126;
					@Pc(128) int local128;
					@Pc(136) short[] local136;
					@Pc(140) int local140;
					@Pc(148) int local148;
					if (Stream.a()) {
						for (local115 = 0; local115 < local25; local115++) {
							local126 = arg2.anInt9577 * (local35 + local115) + local31;
							for (local128 = 0; local128 < local25; local128++) {
								local136 = arg2.aShortArrayArray6[local126++];
								if (local136 != null) {
									for (local140 = 0; local140 < local136.length; local140++) {
										local148 = local136[local140] & 0xFFFF;
										if (this.anInt3761 > local148) {
											this.anInt3761 = local148;
										}
										if (this.anInt3767 < local148) {
											this.anInt3767 = local148;
										}
										local111.c(local148);
									}
								}
							}
						}
					} else {
						for (local115 = 0; local115 < local25; local115++) {
							local126 = local31 + arg2.anInt9577 * (local115 + local35);
							for (local128 = 0; local128 < local25; local128++) {
								local136 = arg2.aShortArrayArray6[local126++];
								if (local136 != null) {
									for (local140 = 0; local140 < local136.length; local140++) {
										local148 = local136[local140] & 0xFFFF;
										if (this.anInt3761 > local148) {
											this.anInt3761 = local148;
										}
										if (this.anInt3767 < local148) {
											this.anInt3767 = local148;
										}
										local111.d(local148);
									}
								}
							}
						}
					}
					local111.b();
					if (this.anInterface9_3.method7614()) {
						break;
					}
				}
			}
			this.anInt3755 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!iaa;B)V")
	public void method3509(@OriginalArg(0) int arg0, @OriginalArg(1) Interface9 arg1) {
		if (arg0 > 0) {
			this.method3511();
			this.aClass4_Sub2_8.method7316(this.anInterface5_3);
			this.aClass4_Sub2_8.method7291(this.anInt3761, this.anInt3767 + 1 - this.anInt3761, Static416.aClass263_5, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
	private void method3511() {
		if (!this.aBoolean307) {
			return;
		}
		this.aBoolean307 = false;
		@Pc(16) byte[] local16 = this.aClass260_1.aByteArray98;
		@Pc(18) int local18 = 0;
		@Pc(30) int local30 = this.aClass260_1.anInt7497;
		@Pc(40) int local40 = this.anInt3762 + this.aClass260_1.anInt7497 * this.anInt3758;
		@Pc(53) int local53;
		for (@Pc(42) int local42 = -128; local42 < 0; local42++) {
			local18 = (local18 << 8) - local18;
			for (local53 = -128; local53 < 0; local53++) {
				if (local16[local40++] != 0) {
					local18++;
				}
			}
			local40 += local30 - 128;
		}
		if (this.anInterface5_3 != null && local18 == this.anInt3763) {
			this.aBoolean307 = false;
			return;
		}
		this.anInt3763 = local18;
		local53 = 0;
		local40 = this.anInt3762 + this.anInt3758 * local30;
		@Pc(116) int local116;
		@Pc(120) int local120;
		@Pc(131) int local131;
		if (!this.aClass4_Sub2_8.method7308(Static517.aClass308_15, Static504.aClass110_22)) {
			if (Static536.anIntArray830 == null) {
				Static536.anIntArray830 = new int[16384];
			}
			@Pc(237) int[] local237 = Static536.anIntArray830;
			for (local116 = -128; local116 < 0; local116++) {
				for (local120 = -128; local120 < 0; local120++) {
					if (local16[local40] == 0) {
						local131 = 0;
						if (local16[local40 - 1] != 0) {
							local131++;
						}
						if (local16[local40 + 1] != 0) {
							local131++;
						}
						if (local16[local40 - local30] != 0) {
							local131++;
						}
						if (local16[local30 + local40] != 0) {
							local131++;
						}
						local237[local53++] = local131 * 17 << 24;
					} else {
						local237[local53++] = 1140850688;
					}
					local40++;
				}
				local40 += this.aClass260_1.anInt7497 - 128;
			}
			if (this.anInterface5_3 == null) {
				this.anInterface5_3 = this.aClass4_Sub2_8.method7271(Static536.anIntArray830, 128, 128, false);
				this.anInterface5_3.method7769(false, false);
			} else {
				this.anInterface5_3.method7773(Static536.anIntArray830, 128, 0, 128, 128, 0);
			}
			return;
		}
		if (Static284.aByteArray74 == null) {
			Static284.aByteArray74 = new byte[16384];
		}
		@Pc(114) byte[] local114 = Static284.aByteArray74;
		for (local116 = -128; local116 < 0; local116++) {
			for (local120 = -128; local120 < 0; local120++) {
				if (local16[local40] == 0) {
					local131 = 0;
					if (local16[local40 - 1] != 0) {
						local131++;
					}
					if (local16[local40 + 1] != 0) {
						local131++;
					}
					if (local16[local40 - local30] != 0) {
						local131++;
					}
					if (local16[local30 + local40] != 0) {
						local131++;
					}
					local114[local53++] = (byte) (local131 * 17);
				} else {
					local114[local53++] = 68;
				}
				local40++;
			}
			local40 += this.aClass260_1.anInt7497 - 128;
		}
		if (this.anInterface5_3 == null) {
			this.anInterface5_3 = this.aClass4_Sub2_8.method7347(128, Static284.aByteArray74, false, Static504.aClass110_22, 128);
			this.anInterface5_3.method7769(false, false);
		} else {
			this.anInterface5_3.method7772(128, Static504.aClass110_22, 128, 128, Static284.aByteArray74);
		}
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)V")
	public void method3513() {
		this.method3509(this.anInt3755, this.anInterface9_3);
	}
}
