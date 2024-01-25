import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class201 {

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
	private int anInt5697 = -1;

	@OriginalMember(owner = "client!lca", name = "n", descriptor = "Z")
	public boolean aBoolean432 = true;

	@OriginalMember(owner = "client!lca", name = "q", descriptor = "Lclient!ica;")
	private final Class156 aClass156_1;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "Lclient!gt;")
	private final Class87_Sub1 aClass87_Sub1_15;

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
	private final int anInt5700;

	@OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
	private final int anInt5705;

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
	public final int anInt5699;

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "Lclient!wda;")
	private Interface26 anInterface26_4;

	@OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
	private int anInt5701;

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
	private int anInt5695;

	@OriginalMember(owner = "client!lca", name = "l", descriptor = "Lclient!ida;")
	private Interface10 anInterface10_7;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lclient!gt;Lclient!ica;Lclient!ov;IIIII)V")
	public Class201(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) Class112_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass156_1 = arg1;
		this.aClass87_Sub1_15 = arg0;
		this.anInt5700 = arg6;
		this.anInt5705 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = (local35 + local37) * arg2.anInt9348 + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray19[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt5699 = 0;
			this.anInterface26_4 = null;
		} else {
			this.anInt5701 = Integer.MIN_VALUE;
			this.anInt5695 = Integer.MAX_VALUE;
			this.anInterface10_7 = this.aClass87_Sub1_15.method5087(false);
			this.anInterface10_7.method7675(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(118) Buffer local118 = this.anInterface10_7.method7682();
				if (local118 != null) {
					@Pc(126) Stream local126 = this.aClass87_Sub1_15.method5128(local118);
					@Pc(130) int local130;
					@Pc(142) int local142;
					@Pc(144) int local144;
					@Pc(152) short[] local152;
					@Pc(156) int local156;
					@Pc(164) int local164;
					if (Stream.b()) {
						for (local130 = 0; local130 < local25; local130++) {
							local142 = arg2.anInt9348 * (local130 + local35) + local31;
							for (local144 = 0; local144 < local25; local144++) {
								local152 = arg2.aShortArrayArray19[local142++];
								if (local152 != null) {
									for (local156 = 0; local156 < local152.length; local156++) {
										local164 = local152[local156] & 0xFFFF;
										if (this.anInt5701 < local164) {
											this.anInt5701 = local164;
										}
										if (local164 < this.anInt5695) {
											this.anInt5695 = local164;
										}
										local126.c(local164);
									}
								}
							}
						}
					} else {
						for (local130 = 0; local130 < local25; local130++) {
							local142 = local31 + arg2.anInt9348 * (local130 + local35);
							for (local144 = 0; local144 < local25; local144++) {
								local152 = arg2.aShortArrayArray19[local142++];
								if (local152 != null) {
									for (local156 = 0; local156 < local152.length; local156++) {
										local164 = local152[local156] & 0xFFFF;
										if (local164 < this.anInt5695) {
											this.anInt5695 = local164;
										}
										if (local164 > this.anInt5701) {
											this.anInt5701 = local164;
										}
										local126.d(local164);
									}
								}
							}
						}
					}
					local126.a();
					if (this.anInterface10_7.method7683()) {
						break;
					}
				}
			}
			this.anInt5699 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
	public void method4759() {
		this.method4760(this.anInt5699, this.anInterface10_7);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILclient!ida;)V")
	public void method4760(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
		if (arg0 > 0) {
			this.method4762();
			this.aClass87_Sub1_15.method5079(this.anInterface26_4);
			this.aClass87_Sub1_15.method5136(0, this.anInt5701 + 1 - this.anInt5695, arg1, arg0, Static562.aClass334_7, this.anInt5695);
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)V")
	private void method4762() {
		if (!this.aBoolean432) {
			return;
		}
		this.aBoolean432 = false;
		@Pc(16) byte[] local16 = this.aClass156_1.aByteArray45;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass156_1.anInt4664;
		@Pc(32) int local32 = this.aClass156_1.anInt4664 * this.anInt5705 + this.anInt5700;
		@Pc(44) int local44;
		for (@Pc(34) int local34 = -128; local34 < 0; local34++) {
			local18 = (local18 << 8) - local18;
			for (local44 = -128; local44 < 0; local44++) {
				if (local16[local32++] != 0) {
					local18++;
				}
			}
			local32 += local22 - 128;
		}
		if (this.anInterface26_4 != null && this.anInt5697 == local18) {
			this.aBoolean432 = false;
			return;
		}
		this.anInt5697 = local18;
		local44 = 0;
		local32 = this.anInt5700 + local22 * this.anInt5705;
		@Pc(112) int local112;
		@Pc(116) int local116;
		@Pc(127) int local127;
		if (!this.aClass87_Sub1_15.method5091(Static545.aClass324_12, Static249.aClass187_7)) {
			if (Static600.anIntArray690 == null) {
				Static600.anIntArray690 = new int[16384];
			}
			@Pc(237) int[] local237 = Static600.anIntArray690;
			for (local112 = -128; local112 < 0; local112++) {
				for (local116 = -128; local116 < 0; local116++) {
					if (local16[local32] == 0) {
						local127 = 0;
						if (local16[local32 - 1] != 0) {
							local127++;
						}
						if (local16[local32 + 1] != 0) {
							local127++;
						}
						if (local16[local32 - local22] != 0) {
							local127++;
						}
						if (local16[local22 + local32] != 0) {
							local127++;
						}
						local237[local44++] = local127 * 17 << 24;
					} else {
						local237[local44++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass156_1.anInt4664 - 128;
			}
			if (this.anInterface26_4 == null) {
				this.anInterface26_4 = this.aClass87_Sub1_15.method5098(false, 128, 128, Static600.anIntArray690);
				this.anInterface26_4.method8053(false, false);
			} else {
				this.anInterface26_4.method8057(128, 0, 0, 128, 128, Static600.anIntArray690);
			}
			return;
		}
		if (Static467.aByteArray74 == null) {
			Static467.aByteArray74 = new byte[16384];
		}
		@Pc(110) byte[] local110 = Static467.aByteArray74;
		for (local112 = -128; local112 < 0; local112++) {
			for (local116 = -128; local116 < 0; local116++) {
				if (local16[local32] == 0) {
					local127 = 0;
					if (local16[local32 - 1] != 0) {
						local127++;
					}
					if (local16[local32 + 1] != 0) {
						local127++;
					}
					if (local16[local32 - local22] != 0) {
						local127++;
					}
					if (local16[local32 + local22] != 0) {
						local127++;
					}
					local110[local44++] = (byte) (local127 * 17);
				} else {
					local110[local44++] = 68;
				}
				local32++;
			}
			local32 += this.aClass156_1.anInt4664 - 128;
		}
		if (this.anInterface26_4 == null) {
			this.anInterface26_4 = this.aClass87_Sub1_15.method5113(Static467.aByteArray74, false, 128, Static249.aClass187_7, 128);
			this.anInterface26_4.method8053(false, false);
		} else {
			this.anInterface26_4.method8051(128, 128, 128, Static249.aClass187_7, Static467.aByteArray74);
		}
	}
}
