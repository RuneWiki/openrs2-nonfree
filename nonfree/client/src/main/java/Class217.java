import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class217 {

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "Z")
	public boolean aBoolean586 = true;

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
	private int anInt6940 = -1;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!fc;")
	private final Class15_Sub2 aClass15_Sub2_11;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "Lclient!rb;")
	private final Class277 aClass277_1;

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
	private final int anInt6943;

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
	private final int anInt6939;

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
	private int anInt6937;

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
	private int anInt6941;

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "Lclient!ui;")
	private Interface20 anInterface20_6;

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
	public final int anInt6944;

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "Lclient!qaa;")
	private Interface14 anInterface14_3;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!fc;Lclient!rb;Lclient!os;IIIII)V")
	public Class217(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) Class4_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass15_Sub2_11 = arg0;
		this.aClass277_1 = arg1;
		this.anInt6943 = arg6;
		this.anInt6939 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = arg2.anInt10461 * (local35 + local37) + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray10[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface14_3 = null;
			this.anInt6944 = 0;
		} else {
			this.anInt6937 = Integer.MAX_VALUE;
			this.anInt6941 = Integer.MIN_VALUE;
			this.anInterface20_6 = this.aClass15_Sub2_11.method5489(false);
			this.anInterface20_6.method6240(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(104) Buffer local104 = this.anInterface20_6.method6243();
				if (local104 != null) {
					@Pc(112) Stream local112 = this.aClass15_Sub2_11.method5409(local104);
					@Pc(116) int local116;
					@Pc(127) int local127;
					@Pc(129) int local129;
					@Pc(137) short[] local137;
					@Pc(141) int local141;
					@Pc(149) int local149;
					if (Stream.b()) {
						for (local116 = 0; local116 < local25; local116++) {
							local127 = local31 + arg2.anInt10461 * (local116 + local35);
							for (local129 = 0; local129 < local25; local129++) {
								local137 = arg2.aShortArrayArray10[local127++];
								if (local137 != null) {
									for (local141 = 0; local141 < local137.length; local141++) {
										local149 = local137[local141] & 0xFFFF;
										if (local149 < this.anInt6937) {
											this.anInt6937 = local149;
										}
										if (local149 > this.anInt6941) {
											this.anInt6941 = local149;
										}
										local112.f(local149);
									}
								}
							}
						}
					} else {
						for (local116 = 0; local116 < local25; local116++) {
							local127 = local31 + (local35 + local116) * arg2.anInt10461;
							for (local129 = 0; local129 < local25; local129++) {
								local137 = arg2.aShortArrayArray10[local127++];
								if (local137 != null) {
									for (local141 = 0; local141 < local137.length; local141++) {
										local149 = local137[local141] & 0xFFFF;
										if (this.anInt6941 < local149) {
											this.anInt6941 = local149;
										}
										if (this.anInt6937 > local149) {
											this.anInt6937 = local149;
										}
										local112.d(local149);
									}
								}
							}
						}
					}
					local112.a();
					if (this.anInterface20_6.method6241()) {
						break;
					}
				}
			}
			this.anInt6944 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	private void method5780() {
		if (!this.aBoolean586) {
			return;
		}
		this.aBoolean586 = false;
		@Pc(16) byte[] local16 = this.aClass277_1.aByteArray91;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass277_1.anInt8440;
		@Pc(32) int local32 = this.anInt6943 + this.aClass277_1.anInt8440 * this.anInt6939;
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
		if (this.anInterface14_3 != null && local18 == this.anInt6940) {
			this.aBoolean586 = false;
			return;
		}
		this.anInt6940 = local18;
		local32 = this.anInt6939 * local22 + this.anInt6943;
		local45 = 0;
		@Pc(112) int local112;
		@Pc(116) int local116;
		@Pc(127) int local127;
		if (!this.aClass15_Sub2_11.method5443(Static379.aClass261_10, Static302.aClass200_11)) {
			if (Static507.anIntArray612 == null) {
				Static507.anIntArray612 = new int[16384];
			}
			@Pc(242) int[] local242 = Static507.anIntArray612;
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
						local242[local45++] = local127 * 17 << 24;
					} else {
						local242[local45++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass277_1.anInt8440 - 128;
			}
			if (this.anInterface14_3 == null) {
				this.anInterface14_3 = this.aClass15_Sub2_11.method5385(Static507.anIntArray612, 128, 128, false);
				this.anInterface14_3.method8238(false, false);
			} else {
				this.anInterface14_3.method8237(Static507.anIntArray612, 0, 128, 128, 0, 128);
			}
			return;
		}
		if (Static288.aByteArray69 == null) {
			Static288.aByteArray69 = new byte[16384];
		}
		@Pc(110) byte[] local110 = Static288.aByteArray69;
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
					local110[local45++] = (byte) (local127 * 17);
				} else {
					local110[local45++] = 68;
				}
				local32++;
			}
			local32 += this.aClass277_1.anInt8440 - 128;
		}
		if (this.anInterface14_3 == null) {
			this.anInterface14_3 = this.aClass15_Sub2_11.method5484(128, Static288.aByteArray69, false, 128, Static379.aClass261_10);
			this.anInterface14_3.method8238(false, false);
		} else {
			this.anInterface14_3.method8241(128, Static379.aClass261_10, 128, Static288.aByteArray69, 128);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZLclient!ui;)V")
	public void method5781(@OriginalArg(0) int arg0, @OriginalArg(2) Interface20 arg1) {
		if (arg0 > 0) {
			this.method5780();
			this.aClass15_Sub2_11.method5414(this.anInterface14_3);
			this.aClass15_Sub2_11.method5375(this.anInt6937, Static18.aClass32_2, 0, arg0, this.anInt6941 + 1 - this.anInt6937, arg1);
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
	public void method5782() {
		this.method5781(this.anInt6944, this.anInterface20_6);
	}
}
