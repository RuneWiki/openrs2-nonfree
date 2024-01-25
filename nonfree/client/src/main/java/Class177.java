import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class177 {

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
	private int anInt5098 = -1;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "Z")
	public boolean aBoolean360 = true;

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "Lclient!kea;")
	private final Class14_Sub2 aClass14_Sub2_7;

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
	private final int anInt5096;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
	private final int anInt5094;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "Lclient!o;")
	private final Class229 aClass229_2;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
	private int anInt5089;

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
	private int anInt5095;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "Lclient!vl;")
	private Interface23 anInterface23_3;

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
	public final int anInt5093;

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "Lclient!em;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!kea;Lclient!o;Lclient!iq;IIIII)V")
	public Class177(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class59_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass14_Sub2_7 = arg0;
		this.anInt5096 = arg7;
		this.anInt5094 = arg6;
		this.aClass229_2 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = arg2.anInt9640 * (local37 + local35) + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray7[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt5093 = 0;
			this.anInterface6_1 = null;
		} else {
			this.anInt5089 = Integer.MAX_VALUE;
			this.anInt5095 = Integer.MIN_VALUE;
			this.anInterface23_3 = this.aClass14_Sub2_7.method7005(false);
			this.anInterface23_3.method4092(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(112) Buffer local112 = this.anInterface23_3.method4095();
				if (local112 != null) {
					@Pc(120) Stream local120 = this.aClass14_Sub2_7.method6939(local112);
					@Pc(124) int local124;
					@Pc(135) int local135;
					@Pc(137) int local137;
					@Pc(145) short[] local145;
					@Pc(149) int local149;
					@Pc(157) int local157;
					if (Stream.b()) {
						for (local124 = 0; local124 < local25; local124++) {
							local135 = local31 + (local35 + local124) * arg2.anInt9640;
							for (local137 = 0; local137 < local25; local137++) {
								local145 = arg2.aShortArrayArray7[local135++];
								if (local145 != null) {
									for (local149 = 0; local149 < local145.length; local149++) {
										local157 = local145[local149] & 0xFFFF;
										if (this.anInt5095 < local157) {
											this.anInt5095 = local157;
										}
										if (this.anInt5089 > local157) {
											this.anInt5089 = local157;
										}
										local120.c(local157);
									}
								}
							}
						}
					} else {
						for (local124 = 0; local124 < local25; local124++) {
							local135 = (local35 + local124) * arg2.anInt9640 + local31;
							for (local137 = 0; local137 < local25; local137++) {
								local145 = arg2.aShortArrayArray7[local135++];
								if (local145 != null) {
									for (local149 = 0; local149 < local145.length; local149++) {
										local157 = local145[local149] & 0xFFFF;
										if (local157 > this.anInt5095) {
											this.anInt5095 = local157;
										}
										if (local157 < this.anInt5089) {
											this.anInt5089 = local157;
										}
										local120.a(local157);
									}
								}
							}
						}
					}
					local120.c();
					if (this.anInterface23_3.method4094()) {
						break;
					}
				}
			}
			this.anInt5093 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILclient!vl;)V")
	public void method4387(@OriginalArg(1) int arg0, @OriginalArg(2) Interface23 arg1) {
		if (arg0 > 0) {
			this.method4388();
			this.aClass14_Sub2_7.method7034(this.anInterface6_1);
			this.aClass14_Sub2_7.method7026(0, this.anInt5089, this.anInt5095 + 1 - this.anInt5089, arg0, Static181.aClass311_4, arg1);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	private void method4388() {
		if (!this.aBoolean360) {
			return;
		}
		this.aBoolean360 = false;
		@Pc(16) byte[] local16 = this.aClass229_2.aByteArray79;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass229_2.anInt6288;
		@Pc(32) int local32 = this.aClass229_2.anInt6288 * this.anInt5096 + this.anInt5094;
		@Pc(52) int local52;
		for (@Pc(42) int local42 = -128; local42 < 0; local42++) {
			local18 = (local18 << 8) - local18;
			for (local52 = -128; local52 < 0; local52++) {
				if (local16[local32++] != 0) {
					local18++;
				}
			}
			local32 += local22 - 128;
		}
		if (this.anInterface6_1 != null && local18 == this.anInt5098) {
			this.aBoolean360 = false;
			return;
		}
		this.anInt5098 = local18;
		local32 = local22 * this.anInt5096 + this.anInt5094;
		local52 = 0;
		@Pc(118) int local118;
		@Pc(122) int local122;
		@Pc(137) int local137;
		if (!this.aClass14_Sub2_7.method6924(Static239.aClass161_12, Static145.aClass219_10)) {
			if (Static55.anIntArray108 == null) {
				Static55.anIntArray108 = new int[16384];
			}
			@Pc(116) int[] local116 = Static55.anIntArray108;
			for (local118 = -128; local118 < 0; local118++) {
				for (local122 = -128; local122 < 0; local122++) {
					if (local16[local32] == 0) {
						local137 = 0;
						if (local16[local32 - 1] != 0) {
							local137++;
						}
						if (local16[local32 + 1] != 0) {
							local137++;
						}
						if (local16[local32 - local22] != 0) {
							local137++;
						}
						if (local16[local22 + local32] != 0) {
							local137++;
						}
						local116[local52++] = local137 * 17 << 24;
					} else {
						local116[local52++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass229_2.anInt6288 - 128;
			}
			if (this.anInterface6_1 == null) {
				this.anInterface6_1 = this.aClass14_Sub2_7.method6950(128, Static55.anIntArray108, 128, false);
				this.anInterface6_1.method7606(false, false);
			} else {
				this.anInterface6_1.method7603(Static55.anIntArray108, 128, 128, 0, 128, 0);
			}
			return;
		}
		if (Static254.aByteArray108 == null) {
			Static254.aByteArray108 = new byte[16384];
		}
		@Pc(234) byte[] local234 = Static254.aByteArray108;
		for (local118 = -128; local118 < 0; local118++) {
			for (local122 = -128; local122 < 0; local122++) {
				if (local16[local32] == 0) {
					local137 = 0;
					if (local16[local32 - 1] != 0) {
						local137++;
					}
					if (local16[local32 + 1] != 0) {
						local137++;
					}
					if (local16[local32 - local22] != 0) {
						local137++;
					}
					if (local16[local22 + local32] != 0) {
						local137++;
					}
					local234[local52++] = (byte) (local137 * 17);
				} else {
					local234[local52++] = 68;
				}
				local32++;
			}
			local32 += this.aClass229_2.anInt6288 - 128;
		}
		if (this.anInterface6_1 == null) {
			this.anInterface6_1 = this.aClass14_Sub2_7.method6934(128, Static254.aByteArray108, false, Static145.aClass219_10, 128);
			this.anInterface6_1.method7606(false, false);
		} else {
			this.anInterface6_1.method7602(128, 128, Static145.aClass219_10, 128, Static254.aByteArray108);
		}
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
	public void method4390() {
		this.method4387(this.anInt5093, this.anInterface23_3);
	}
}
