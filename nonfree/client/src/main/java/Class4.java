import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class4 {

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
	private int anInt15 = -1;

	@OriginalMember(owner = "client!aba", name = "q", descriptor = "Z")
	public boolean aBoolean1 = true;

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
	private final int anInt18;

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "Lclient!jj;")
	private final Class75_Sub1 aClass75_Sub1_1;

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
	private final int anInt12;

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "Lclient!bd;")
	private final Class33 aClass33_1;

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
	private int anInt11;

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
	private int anInt9;

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "Lclient!uba;")
	private Interface25 anInterface25_1;

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
	public final int anInt8;

	@OriginalMember(owner = "client!aba", name = "m", descriptor = "Lclient!cf;")
	private Interface7 anInterface7_1;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lclient!jj;Lclient!bd;Lclient!eh;IIIII)V")
	public Class4(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class96_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt18 = arg7;
		this.aClass75_Sub1_1 = arg0;
		this.anInt12 = arg6;
		this.aClass33_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local50 = local31 + (local37 + local35) * arg2.anInt9255;
			for (@Pc(52) int local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray5[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface7_1 = null;
			this.anInt8 = 0;
		} else {
			this.anInt11 = Integer.MIN_VALUE;
			this.anInt9 = Integer.MAX_VALUE;
			this.anInterface25_1 = this.aClass75_Sub1_1.method6817(false);
			this.anInterface25_1.method8679(local27);
			for (local50 = 0; local50 < 4; local50++) {
				@Pc(120) Buffer local120 = this.anInterface25_1.method8677();
				if (local120 != null) {
					@Pc(128) Stream local128 = this.aClass75_Sub1_1.method6788(local120);
					@Pc(132) int local132;
					@Pc(143) int local143;
					@Pc(145) int local145;
					@Pc(153) short[] local153;
					@Pc(157) int local157;
					@Pc(165) int local165;
					if (Stream.b()) {
						for (local132 = 0; local132 < local25; local132++) {
							local143 = local31 + (local132 + local35) * arg2.anInt9255;
							for (local145 = 0; local145 < local25; local145++) {
								local153 = arg2.aShortArrayArray5[local143++];
								if (local153 != null) {
									for (local157 = 0; local157 < local153.length; local157++) {
										local165 = local153[local157] & 0xFFFF;
										if (this.anInt9 > local165) {
											this.anInt9 = local165;
										}
										if (local165 > this.anInt11) {
											this.anInt11 = local165;
										}
										local128.b(local165);
									}
								}
							}
						}
					} else {
						for (local132 = 0; local132 < local25; local132++) {
							local143 = arg2.anInt9255 * (local132 + local35) + local31;
							for (local145 = 0; local145 < local25; local145++) {
								local153 = arg2.aShortArrayArray5[local143++];
								if (local153 != null) {
									for (local157 = 0; local157 < local153.length; local157++) {
										local165 = local153[local157] & 0xFFFF;
										if (local165 > this.anInt11) {
											this.anInt11 = local165;
										}
										if (this.anInt9 > local165) {
											this.anInt9 = local165;
										}
										local128.a(local165);
									}
								}
							}
						}
					}
					local128.a();
					if (this.anInterface25_1.method8676()) {
						break;
					}
				}
			}
			this.anInt8 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)V")
	public void method20() {
		this.method24(this.anInt8, this.anInterface25_1);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
	private void method22() {
		if (!this.aBoolean1) {
			return;
		}
		this.aBoolean1 = false;
		@Pc(25) byte[] local25 = this.aClass33_1.aByteArray6;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = this.aClass33_1.anInt470;
		@Pc(41) int local41 = this.anInt12 + this.anInt18 * this.aClass33_1.anInt470;
		@Pc(54) int local54;
		for (@Pc(43) int local43 = -128; local43 < 0; local43++) {
			local27 = (local27 << 8) - local27;
			for (local54 = -128; local54 < 0; local54++) {
				if (local25[local41++] != 0) {
					local27++;
				}
			}
			local41 += local31 - 128;
		}
		if (this.anInterface7_1 != null && local27 == this.anInt15) {
			this.aBoolean1 = false;
			return;
		}
		this.anInt15 = local27;
		local54 = 0;
		local41 = this.anInt18 * local31 + this.anInt12;
		@Pc(131) int local131;
		@Pc(135) int local135;
		@Pc(148) int local148;
		if (!this.aClass75_Sub1_1.method6786(Static435.aClass274_13, Static212.aClass155_46)) {
			if (Static648.anIntArray659 == null) {
				Static648.anIntArray659 = new int[16384];
			}
			@Pc(129) int[] local129 = Static648.anIntArray659;
			for (local131 = -128; local131 < 0; local131++) {
				for (local135 = -128; local135 < 0; local135++) {
					if (local25[local41] == 0) {
						local148 = 0;
						if (local25[local41 - 1] != 0) {
							local148++;
						}
						if (local25[local41 + 1] != 0) {
							local148++;
						}
						if (local25[local41 - local31] != 0) {
							local148++;
						}
						if (local25[local41 + local31] != 0) {
							local148++;
						}
						local129[local54++] = local148 * 17 << 24;
					} else {
						local129[local54++] = 1140850688;
					}
					local41++;
				}
				local41 += this.aClass33_1.anInt470 - 128;
			}
			if (this.anInterface7_1 == null) {
				this.anInterface7_1 = this.aClass75_Sub1_1.method6727(128, false, Static648.anIntArray659, 128);
				this.anInterface7_1.method8723(false, false);
			} else {
				this.anInterface7_1.method8721(0, 128, Static648.anIntArray659, 128, 128, 0);
			}
			return;
		}
		if (Static550.aByteArray101 == null) {
			Static550.aByteArray101 = new byte[16384];
		}
		@Pc(271) byte[] local271 = Static550.aByteArray101;
		for (local131 = -128; local131 < 0; local131++) {
			for (local135 = -128; local135 < 0; local135++) {
				if (local25[local41] == 0) {
					local148 = 0;
					if (local25[local41 - 1] != 0) {
						local148++;
					}
					if (local25[local41 + 1] != 0) {
						local148++;
					}
					if (local25[local41 - local31] != 0) {
						local148++;
					}
					if (local25[local31 + local41] != 0) {
						local148++;
					}
					local271[local54++] = (byte) (local148 * 17);
				} else {
					local271[local54++] = 68;
				}
				local41++;
			}
			local41 += this.aClass33_1.anInt470 - 128;
		}
		if (this.anInterface7_1 == null) {
			this.anInterface7_1 = this.aClass75_Sub1_1.method6825(128, false, Static550.aByteArray101, Static212.aClass155_46, 128);
			this.anInterface7_1.method8723(false, false);
		} else {
			this.anInterface7_1.method8716(Static212.aClass155_46, Static550.aByteArray101, 128, 128, 128);
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILclient!uba;B)V")
	public void method24(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1) {
		if (arg0 > 0) {
			this.method22();
			this.aClass75_Sub1_1.method6814(this.anInterface7_1);
			this.aClass75_Sub1_1.method6746(Static118.aClass51_4, this.anInt9, this.anInt11 + 1 - this.anInt9, arg1, 0, arg0);
		}
	}
}
