import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class327 {

	@OriginalMember(owner = "client!sda", name = "r", descriptor = "I")
	private int anInt9253 = -1;

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "Z")
	public boolean aBoolean641 = true;

	@OriginalMember(owner = "client!sda", name = "g", descriptor = "Lclient!jga;")
	private final Class187 aClass187_2;

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
	private final int anInt9247;

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
	private final int anInt9254;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "Lclient!he;")
	private final Class144_Sub1 aClass144_Sub1_23;

	@OriginalMember(owner = "client!sda", name = "s", descriptor = "I")
	public final int anInt9251;

	@OriginalMember(owner = "client!sda", name = "k", descriptor = "Lclient!gka;")
	private Interface9 anInterface9_6;

	@OriginalMember(owner = "client!sda", name = "o", descriptor = "I")
	private int anInt9252;

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
	private int anInt9245;

	@OriginalMember(owner = "client!sda", name = "n", descriptor = "Lclient!fm;")
	private Interface8 anInterface8_6;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!he;Lclient!jga;Lclient!hn;IIIII)V")
	public Class327(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) Class159_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass187_2 = arg1;
		this.anInt9247 = arg7;
		this.anInt9254 = arg6;
		this.aClass144_Sub1_23 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(52) int local52;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local52 = arg2.anInt9504 * (local35 + local37) + local31;
			for (@Pc(54) int local54 = 0; local54 < local25; local54++) {
				@Pc(62) short[] local62 = arg2.aShortArrayArray1[local52++];
				if (local62 != null) {
					local27 += local62.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt9251 = 0;
			this.anInterface9_6 = null;
		} else {
			this.anInt9252 = Integer.MIN_VALUE;
			this.anInt9245 = Integer.MAX_VALUE;
			this.anInterface8_6 = this.aClass144_Sub1_23.method5736(false);
			this.anInterface8_6.method5084(local27);
			for (local52 = 0; local52 < 4; local52++) {
				@Pc(130) Buffer local130 = this.anInterface8_6.method5085();
				if (local130 != null) {
					@Pc(138) Stream local138 = this.aClass144_Sub1_23.method5747(local130);
					@Pc(142) int local142;
					@Pc(154) int local154;
					@Pc(156) int local156;
					@Pc(164) short[] local164;
					@Pc(168) int local168;
					@Pc(176) int local176;
					if (Stream.c()) {
						for (local142 = 0; local142 < local25; local142++) {
							local154 = local31 + (local35 + local142) * arg2.anInt9504;
							for (local156 = 0; local156 < local25; local156++) {
								local164 = arg2.aShortArrayArray1[local154++];
								if (local164 != null) {
									for (local168 = 0; local168 < local164.length; local168++) {
										local176 = local164[local168] & 0xFFFF;
										if (local176 > this.anInt9252) {
											this.anInt9252 = local176;
										}
										if (this.anInt9245 > local176) {
											this.anInt9245 = local176;
										}
										local138.a(local176);
									}
								}
							}
						}
					} else {
						for (local142 = 0; local142 < local25; local142++) {
							local154 = local31 + arg2.anInt9504 * (local35 + local142);
							for (local156 = 0; local156 < local25; local156++) {
								local164 = arg2.aShortArrayArray1[local154++];
								if (local164 != null) {
									for (local168 = 0; local168 < local164.length; local168++) {
										local176 = local164[local168] & 0xFFFF;
										if (this.anInt9245 > local176) {
											this.anInt9245 = local176;
										}
										if (local176 > this.anInt9252) {
											this.anInt9252 = local176;
										}
										local138.d(local176);
									}
								}
							}
						}
					}
					local138.b();
					if (this.anInterface8_6.method5081()) {
						break;
					}
				}
			}
			this.anInt9251 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V")
	public void method7973() {
		this.method7975(this.anInterface8_6, this.anInt9251);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lclient!fm;IZ)V")
	public void method7975(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 0) {
			this.method7978();
			this.aClass144_Sub1_23.method5643(this.anInterface9_6);
			this.aClass144_Sub1_23.method5746(arg1, this.anInt9245, arg0, this.anInt9252 + 1 - this.anInt9245, Static469.aClass213_46, 0);
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
	private void method7978() {
		if (!this.aBoolean641) {
			return;
		}
		this.aBoolean641 = false;
		@Pc(17) byte[] local17 = this.aClass187_2.aByteArray64;
		@Pc(19) int local19 = 0;
		@Pc(31) int local31 = this.aClass187_2.anInt5159;
		@Pc(42) int local42 = this.anInt9254 + this.aClass187_2.anInt5159 * this.anInt9247;
		@Pc(55) int local55;
		for (@Pc(44) int local44 = -128; local44 < 0; local44++) {
			local19 = (local19 << 8) - local19;
			for (local55 = -128; local55 < 0; local55++) {
				if (local17[local42++] != 0) {
					local19++;
				}
			}
			local42 += local31 - 128;
		}
		if (this.anInterface9_6 != null && this.anInt9253 == local19) {
			this.aBoolean641 = false;
			return;
		}
		this.anInt9253 = local19;
		local55 = 0;
		local42 = this.anInt9247 * local31 + this.anInt9254;
		@Pc(136) int local136;
		@Pc(140) int local140;
		@Pc(153) int local153;
		if (!this.aClass144_Sub1_23.method5757(Static18.aClass19_4, Static60.aClass260_3)) {
			if (Static49.anIntArray54 == null) {
				Static49.anIntArray54 = new int[16384];
			}
			@Pc(285) int[] local285 = Static49.anIntArray54;
			for (local136 = -128; local136 < 0; local136++) {
				for (local140 = -128; local140 < 0; local140++) {
					if (local17[local42] == 0) {
						local153 = 0;
						if (local17[local42 - 1] != 0) {
							local153++;
						}
						if (local17[local42 + 1] != 0) {
							local153++;
						}
						if (local17[local42 - local31] != 0) {
							local153++;
						}
						if (local17[local42 + local31] != 0) {
							local153++;
						}
						local285[local55++] = local153 * 17 << 24;
					} else {
						local285[local55++] = 1140850688;
					}
					local42++;
				}
				local42 += this.aClass187_2.anInt5159 - 128;
			}
			if (this.anInterface9_6 == null) {
				this.anInterface9_6 = this.aClass144_Sub1_23.method5687(128, false, 128, Static49.anIntArray54);
				this.anInterface9_6.method4773(false, false);
			} else {
				this.anInterface9_6.method4771(128, 128, Static49.anIntArray54, 0, 128, 0);
			}
			return;
		}
		if (Static302.aByteArray65 == null) {
			Static302.aByteArray65 = new byte[16384];
		}
		@Pc(134) byte[] local134 = Static302.aByteArray65;
		for (local136 = -128; local136 < 0; local136++) {
			for (local140 = -128; local140 < 0; local140++) {
				if (local17[local42] == 0) {
					local153 = 0;
					if (local17[local42 - 1] != 0) {
						local153++;
					}
					if (local17[local42 + 1] != 0) {
						local153++;
					}
					if (local17[local42 - local31] != 0) {
						local153++;
					}
					if (local17[local42 + local31] != 0) {
						local153++;
					}
					local134[local55++] = (byte) (local153 * 17);
				} else {
					local134[local55++] = 68;
				}
				local42++;
			}
			local42 += this.aClass187_2.anInt5159 - 128;
		}
		if (this.anInterface9_6 == null) {
			this.anInterface9_6 = this.aClass144_Sub1_23.method5714(Static302.aByteArray65, 128, false, 128, Static60.aClass260_3);
			this.anInterface9_6.method4773(false, false);
		} else {
			this.anInterface9_6.method4776(128, Static60.aClass260_3, 128, 128, Static302.aByteArray65);
		}
	}
}
