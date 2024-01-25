import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class3 {

	@OriginalMember(owner = "client!aba", name = "t", descriptor = "[I")
	public static final int[] anIntArray5 = new int[120];

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "Z")
	public boolean aBoolean2 = true;

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
	private int anInt42 = -1;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
	private final int anInt36;

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "Lclient!sv;")
	private final Class121_Sub2 aClass121_Sub2_1;

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "Lclient!rv;")
	private final Class283 aClass283_1;

	@OriginalMember(owner = "client!aba", name = "l", descriptor = "I")
	private final int anInt43;

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
	public final int anInt38;

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "Lclient!sd;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
	private int anInt40;

	@OriginalMember(owner = "client!aba", name = "v", descriptor = "I")
	private int anInt47;

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "Lclient!go;")
	private Interface11 anInterface11_1;

	static {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < 120; local16++) {
			@Pc(21) int local21 = local16 + 1;
			@Pc(34) int local34 = (int) (Math.pow(2.0D, (double) local21 / 7.0D) * 300.0D + (double) local21);
			local14 += local34;
			anIntArray5[local16] = local14 / 4;
		}
	}

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lclient!sv;Lclient!rv;Lclient!ua;IIIII)V")
	public Class3(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) Class60_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt36 = arg7;
		this.aClass121_Sub2_1 = arg0;
		this.aClass283_1 = arg1;
		this.anInt43 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = (local35 + local37) * arg2.anInt9656 + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray13[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt38 = 0;
			this.anInterface20_1 = null;
		} else {
			this.anInt40 = Integer.MAX_VALUE;
			this.anInt47 = Integer.MIN_VALUE;
			this.anInterface11_1 = this.aClass121_Sub2_1.method7204(false);
			this.anInterface11_1.method7560(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(118) Buffer local118 = this.anInterface11_1.method7569();
				if (local118 != null) {
					@Pc(126) Stream local126 = this.aClass121_Sub2_1.method7200(local118);
					@Pc(130) int local130;
					@Pc(141) int local141;
					@Pc(143) int local143;
					@Pc(151) short[] local151;
					@Pc(155) int local155;
					@Pc(163) int local163;
					if (Stream.a()) {
						for (local130 = 0; local130 < local25; local130++) {
							local141 = arg2.anInt9656 * (local130 + local35) + local31;
							for (local143 = 0; local143 < local25; local143++) {
								local151 = arg2.aShortArrayArray13[local141++];
								if (local151 != null) {
									for (local155 = 0; local155 < local151.length; local155++) {
										local163 = local151[local155] & 0xFFFF;
										if (local163 > this.anInt47) {
											this.anInt47 = local163;
										}
										if (this.anInt40 > local163) {
											this.anInt40 = local163;
										}
										local126.f(local163);
									}
								}
							}
						}
					} else {
						for (local130 = 0; local130 < local25; local130++) {
							local141 = local31 + (local35 + local130) * arg2.anInt9656;
							for (local143 = 0; local143 < local25; local143++) {
								local151 = arg2.aShortArrayArray13[local141++];
								if (local151 != null) {
									for (local155 = 0; local155 < local151.length; local155++) {
										local163 = local151[local155] & 0xFFFF;
										if (this.anInt47 < local163) {
											this.anInt47 = local163;
										}
										if (this.anInt40 > local163) {
											this.anInt40 = local163;
										}
										local126.b(local163);
									}
								}
							}
						}
					}
					local126.c();
					if (this.anInterface11_1.method7563()) {
						break;
					}
				}
			}
			this.anInt38 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)V")
	private void method52() {
		if (!this.aBoolean2) {
			return;
		}
		this.aBoolean2 = false;
		@Pc(16) byte[] local16 = this.aClass283_1.aByteArray105;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass283_1.anInt7773;
		@Pc(32) int local32 = this.anInt43 + this.anInt36 * this.aClass283_1.anInt7773;
		@Pc(45) int local45;
		for (@Pc(34) int local34 = -128; local34 < 0; local34++) {
			local18 = (local18 << 8) - local18;
			for (local45 = -128; local45 < 0; local45++) {
				if (local16[local32++] != 0) {
					local18++;
				}
			}
			local32 += local22 - 128;
		}
		if (this.anInterface20_1 != null && local18 == this.anInt42) {
			this.aBoolean2 = false;
			return;
		}
		this.anInt42 = local18;
		local45 = 0;
		local32 = this.anInt43 + this.anInt36 * local22;
		@Pc(113) int local113;
		@Pc(117) int local117;
		@Pc(125) int local125;
		if (!this.aClass121_Sub2_1.method7169(Static490.aClass214_14, Static108.aClass82_8)) {
			if (Static206.anIntArray402 == null) {
				Static206.anIntArray402 = new int[16384];
			}
			@Pc(230) int[] local230 = Static206.anIntArray402;
			for (local113 = -128; local113 < 0; local113++) {
				for (local117 = -128; local117 < 0; local117++) {
					if (local16[local32] == 0) {
						local125 = 0;
						if (local16[local32 - 1] != 0) {
							local125++;
						}
						if (local16[local32 + 1] != 0) {
							local125++;
						}
						if (local16[local32 - local22] != 0) {
							local125++;
						}
						if (local16[local32 + local22] != 0) {
							local125++;
						}
						local230[local45++] = local125 * 17 << 24;
					} else {
						local230[local45++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass283_1.anInt7773 - 128;
			}
			if (this.anInterface20_1 == null) {
				this.anInterface20_1 = this.aClass121_Sub2_1.method7248(128, 128, Static206.anIntArray402, false);
				this.anInterface20_1.method7531(false, false);
			} else {
				this.anInterface20_1.method7529(128, 0, Static206.anIntArray402, 128, 0, 128);
			}
			return;
		}
		if (Static310.aByteArray69 == null) {
			Static310.aByteArray69 = new byte[16384];
		}
		@Pc(111) byte[] local111 = Static310.aByteArray69;
		for (local113 = -128; local113 < 0; local113++) {
			for (local117 = -128; local117 < 0; local117++) {
				if (local16[local32] == 0) {
					local125 = 0;
					if (local16[local32 - 1] != 0) {
						local125++;
					}
					if (local16[local32 + 1] != 0) {
						local125++;
					}
					if (local16[local32 - local22] != 0) {
						local125++;
					}
					if (local16[local32 + local22] != 0) {
						local125++;
					}
					local111[local45++] = (byte) (local125 * 17);
				} else {
					local111[local45++] = 68;
				}
				local32++;
			}
			local32 += this.aClass283_1.anInt7773 - 128;
		}
		if (this.anInterface20_1 == null) {
			this.anInterface20_1 = this.aClass121_Sub2_1.method7251(128, Static310.aByteArray69, 128, false, Static490.aClass214_14);
			this.anInterface20_1.method7531(false, false);
		} else {
			this.anInterface20_1.method7532(Static490.aClass214_14, 128, Static310.aByteArray69, 128, 128);
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILclient!go;B)V")
	public void method53(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		if (arg0 > 0) {
			this.method52();
			this.aClass121_Sub2_1.method7167(this.anInterface20_1);
			this.aClass121_Sub2_1.method7239(this.anInt40, this.anInt47 + 1 - this.anInt40, arg1, arg0, Static503.aClass107_2, 0);
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V")
	public void method55() {
		this.method53(this.anInt38, this.anInterface11_1);
	}
}
