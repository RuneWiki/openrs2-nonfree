import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cma")
public final class Class55 {

	@OriginalMember(owner = "client!cma", name = "h", descriptor = "I")
	private int anInt1476 = -1;

	@OriginalMember(owner = "client!cma", name = "l", descriptor = "Z")
	public boolean aBoolean124 = true;

	@OriginalMember(owner = "client!cma", name = "p", descriptor = "Lclient!jv;")
	private final Class196 aClass196_1;

	@OriginalMember(owner = "client!cma", name = "m", descriptor = "Lclient!nb;")
	private final Class67_Sub1 aClass67_Sub1_2;

	@OriginalMember(owner = "client!cma", name = "f", descriptor = "I")
	private final int anInt1477;

	@OriginalMember(owner = "client!cma", name = "t", descriptor = "I")
	private final int anInt1473;

	@OriginalMember(owner = "client!cma", name = "g", descriptor = "I")
	public final int anInt1475;

	@OriginalMember(owner = "client!cma", name = "n", descriptor = "Lclient!gp;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!cma", name = "c", descriptor = "I")
	private int anInt1474;

	@OriginalMember(owner = "client!cma", name = "d", descriptor = "I")
	private int anInt1469;

	@OriginalMember(owner = "client!cma", name = "i", descriptor = "Lclient!fh;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!cma", name = "<init>", descriptor = "(Lclient!nb;Lclient!jv;Lclient!tla;IIIII)V")
	public Class55(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class313_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass196_1 = arg1;
		this.aClass67_Sub1_2 = arg0;
		this.anInt1477 = arg7;
		this.anInt1473 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local50 = local31 + arg2.anInt10875 * (local35 + local37);
			for (@Pc(52) int local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray5[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt1475 = 0;
			this.anInterface6_1 = null;
		} else {
			this.anInt1474 = Integer.MAX_VALUE;
			this.anInt1469 = Integer.MIN_VALUE;
			this.anInterface5_2 = this.aClass67_Sub1_2.method5684(false);
			this.anInterface5_2.method9248(local27);
			for (local50 = 0; local50 < 4; local50++) {
				@Pc(128) Buffer local128 = this.anInterface5_2.method9252();
				if (local128 != null) {
					@Pc(136) Stream local136 = this.aClass67_Sub1_2.method5616(local128);
					@Pc(140) int local140;
					@Pc(152) int local152;
					@Pc(154) int local154;
					@Pc(162) short[] local162;
					@Pc(166) int local166;
					@Pc(174) int local174;
					if (Stream.b()) {
						for (local140 = 0; local140 < local25; local140++) {
							local152 = (local140 + local35) * arg2.anInt10875 + local31;
							for (local154 = 0; local154 < local25; local154++) {
								local162 = arg2.aShortArrayArray5[local152++];
								if (local162 != null) {
									for (local166 = 0; local166 < local162.length; local166++) {
										local174 = local162[local166] & 0xFFFF;
										if (this.anInt1469 < local174) {
											this.anInt1469 = local174;
										}
										if (local174 < this.anInt1474) {
											this.anInt1474 = local174;
										}
										local136.b(local174);
									}
								}
							}
						}
					} else {
						for (local140 = 0; local140 < local25; local140++) {
							local152 = local31 + (local35 + local140) * arg2.anInt10875;
							for (local154 = 0; local154 < local25; local154++) {
								local162 = arg2.aShortArrayArray5[local152++];
								if (local162 != null) {
									for (local166 = 0; local166 < local162.length; local166++) {
										local174 = local162[local166] & 0xFFFF;
										if (local174 < this.anInt1474) {
											this.anInt1474 = local174;
										}
										if (local174 > this.anInt1469) {
											this.anInt1469 = local174;
										}
										local136.d(local174);
									}
								}
							}
						}
					}
					local136.a();
					if (this.anInterface5_2.method9250()) {
						break;
					}
				}
			}
			this.anInt1475 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!cma", name = "b", descriptor = "(B)V")
	public void method1194() {
		this.method1196(this.anInt1475, this.anInterface5_2);
	}

	@OriginalMember(owner = "client!cma", name = "a", descriptor = "(IILclient!fh;)V")
	public void method1196(@OriginalArg(0) int arg0, @OriginalArg(2) Interface5 arg1) {
		if (arg0 > 0) {
			this.method1198();
			this.aClass67_Sub1_2.method5612(this.anInterface6_1);
			this.aClass67_Sub1_2.method5659(arg1, 0, this.anInt1469 + 1 - this.anInt1474, arg0, this.anInt1474, Static508.aClass281_7);
		}
	}

	@OriginalMember(owner = "client!cma", name = "a", descriptor = "(B)V")
	private void method1198() {
		if (!this.aBoolean124) {
			return;
		}
		this.aBoolean124 = false;
		@Pc(22) byte[] local22 = this.aClass196_1.aByteArray47;
		@Pc(24) int local24 = 0;
		@Pc(28) int local28 = this.aClass196_1.anInt5613;
		@Pc(38) int local38 = this.anInt1477 * this.aClass196_1.anInt5613 + this.anInt1473;
		@Pc(51) int local51;
		for (@Pc(40) int local40 = -128; local40 < 0; local40++) {
			local24 = (local24 << 8) - local24;
			for (local51 = -128; local51 < 0; local51++) {
				if (local22[local38++] != 0) {
					local24++;
				}
			}
			local38 += local28 - 128;
		}
		if (this.anInterface6_1 != null && local24 == this.anInt1476) {
			this.aBoolean124 = false;
			return;
		}
		this.anInt1476 = local24;
		local51 = 0;
		local38 = local28 * this.anInt1477 + this.anInt1473;
		@Pc(136) int local136;
		@Pc(140) int local140;
		@Pc(159) int local159;
		if (!this.aClass67_Sub1_2.method5563(Static438.aClass261_14, Static407.aClass145_13)) {
			if (Static671.anIntArray599 == null) {
				Static671.anIntArray599 = new int[16384];
			}
			@Pc(134) int[] local134 = Static671.anIntArray599;
			for (local136 = -128; local136 < 0; local136++) {
				for (local140 = -128; local140 < 0; local140++) {
					if (local22[local38] == 0) {
						local159 = 0;
						if (local22[local38 - 1] != 0) {
							local159++;
						}
						if (local22[local38 + 1] != 0) {
							local159++;
						}
						if (local22[local38 - local28] != 0) {
							local159++;
						}
						if (local22[local38 + local28] != 0) {
							local159++;
						}
						local134[local51++] = local159 * 17 << 24;
					} else {
						local134[local51++] = 1140850688;
					}
					local38++;
				}
				local38 += this.aClass196_1.anInt5613 - 128;
			}
			if (this.anInterface6_1 == null) {
				this.anInterface6_1 = this.aClass67_Sub1_2.method5567(128, false, 128, Static671.anIntArray599);
				this.anInterface6_1.method9275(false, false);
			} else {
				this.anInterface6_1.method9273(Static671.anIntArray599, 0, 128, 0, 128, 128);
			}
			return;
		}
		if (Static400.aByteArray56 == null) {
			Static400.aByteArray56 = new byte[16384];
		}
		@Pc(278) byte[] local278 = Static400.aByteArray56;
		for (local136 = -128; local136 < 0; local136++) {
			for (local140 = -128; local140 < 0; local140++) {
				if (local22[local38] == 0) {
					local159 = 0;
					if (local22[local38 - 1] != 0) {
						local159++;
					}
					if (local22[local38 + 1] != 0) {
						local159++;
					}
					if (local22[local38 - local28] != 0) {
						local159++;
					}
					if (local22[local38 + local28] != 0) {
						local159++;
					}
					local278[local51++] = (byte) (local159 * 17);
				} else {
					local278[local51++] = 68;
				}
				local38++;
			}
			local38 += this.aClass196_1.anInt5613 - 128;
		}
		if (this.anInterface6_1 == null) {
			this.anInterface6_1 = this.aClass67_Sub1_2.method5670(Static400.aByteArray56, 128, false, Static407.aClass145_13, 128);
			this.anInterface6_1.method9275(false, false);
		} else {
			this.anInterface6_1.method9270(128, Static400.aByteArray56, Static407.aClass145_13, 128, 128);
		}
	}
}
