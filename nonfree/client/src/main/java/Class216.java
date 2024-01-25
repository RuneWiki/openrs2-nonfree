import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class216 {

	@OriginalMember(owner = "client!lfa", name = "h", descriptor = "Z")
	public boolean aBoolean439 = true;

	@OriginalMember(owner = "client!lfa", name = "n", descriptor = "I")
	private int anInt6026 = -1;

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
	private final int anInt6019;

	@OriginalMember(owner = "client!lfa", name = "p", descriptor = "Lclient!wk;")
	private final Class143_Sub1 aClass143_Sub1_8;

	@OriginalMember(owner = "client!lfa", name = "k", descriptor = "Lclient!ht;")
	private final Class159 aClass159_1;

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
	private final int anInt6022;

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "I")
	private int anInt6021;

	@OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
	private int anInt6023;

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "Lclient!mq;")
	private Interface16 anInterface16_4;

	@OriginalMember(owner = "client!lfa", name = "q", descriptor = "I")
	public final int anInt6027;

	@OriginalMember(owner = "client!lfa", name = "j", descriptor = "Lclient!kt;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lclient!wk;Lclient!ht;Lclient!mg;IIIII)V")
	public Class216(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6019 = arg7;
		this.aClass143_Sub1_8 = arg0;
		this.aClass159_1 = arg1;
		this.anInt6022 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = arg2.anInt10541 * (local37 + local35) + local31;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray14[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface12_1 = null;
			this.anInt6027 = 0;
		} else {
			this.anInt6021 = Integer.MIN_VALUE;
			this.anInt6023 = Integer.MAX_VALUE;
			this.anInterface16_4 = this.aClass143_Sub1_8.method6279(false);
			this.anInterface16_4.method7863(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(110) Buffer local110 = this.anInterface16_4.method7864();
				if (local110 != null) {
					@Pc(118) Stream local118 = this.aClass143_Sub1_8.method6361(local110);
					@Pc(122) int local122;
					@Pc(134) int local134;
					@Pc(136) int local136;
					@Pc(144) short[] local144;
					@Pc(148) int local148;
					@Pc(156) int local156;
					if (Stream.a()) {
						for (local122 = 0; local122 < local25; local122++) {
							local134 = (local122 + local35) * arg2.anInt10541 + local31;
							for (local136 = 0; local136 < local25; local136++) {
								local144 = arg2.aShortArrayArray14[local134++];
								if (local144 != null) {
									for (local148 = 0; local148 < local144.length; local148++) {
										local156 = local144[local148] & 0xFFFF;
										if (local156 > this.anInt6021) {
											this.anInt6021 = local156;
										}
										if (this.anInt6023 > local156) {
											this.anInt6023 = local156;
										}
										local118.b(local156);
									}
								}
							}
						}
					} else {
						for (local122 = 0; local122 < local25; local122++) {
							local134 = local31 + (local122 + local35) * arg2.anInt10541;
							for (local136 = 0; local136 < local25; local136++) {
								local144 = arg2.aShortArrayArray14[local134++];
								if (local144 != null) {
									for (local148 = 0; local148 < local144.length; local148++) {
										local156 = local144[local148] & 0xFFFF;
										if (this.anInt6023 > local156) {
											this.anInt6023 = local156;
										}
										if (this.anInt6021 < local156) {
											this.anInt6021 = local156;
										}
										local118.f(local156);
									}
								}
							}
						}
					}
					local118.c();
					if (this.anInterface16_4.method7862()) {
						break;
					}
				}
			}
			this.anInt6027 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IBLclient!mq;)V")
	public void method5132(@OriginalArg(0) int arg0, @OriginalArg(2) Interface16 arg1) {
		if (arg0 > 0) {
			this.method5136();
			this.aClass143_Sub1_8.method6338(this.anInterface12_1);
			this.aClass143_Sub1_8.method6367(Static536.aClass323_4, this.anInt6023, arg1, 0, this.anInt6021 + 1 - this.anInt6023, arg0);
		}
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)V")
	public void method5135() {
		this.method5132(this.anInt6027, this.anInterface16_4);
	}

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "(I)V")
	private void method5136() {
		if (!this.aBoolean439) {
			return;
		}
		this.aBoolean439 = false;
		@Pc(16) byte[] local16 = this.aClass159_1.aByteArray40;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass159_1.anInt3800;
		@Pc(32) int local32 = this.aClass159_1.anInt3800 * this.anInt6019 + this.anInt6022;
		@Pc(48) int local48;
		for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
			local18 = (local18 << 8) - local18;
			for (local48 = -128; local48 < 0; local48++) {
				if (local16[local32++] != 0) {
					local18++;
				}
			}
			local32 += local22 - 128;
		}
		if (this.anInterface12_1 != null && local18 == this.anInt6026) {
			this.aBoolean439 = false;
			return;
		}
		this.anInt6026 = local18;
		local48 = 0;
		local32 = this.anInt6022 + this.anInt6019 * local22;
		@Pc(115) int local115;
		@Pc(119) int local119;
		@Pc(134) int local134;
		if (!this.aClass143_Sub1_8.method6304(Static83.aClass255_1, Static314.aClass206_12)) {
			if (Static634.anIntArray578 == null) {
				Static634.anIntArray578 = new int[16384];
			}
			@Pc(113) int[] local113 = Static634.anIntArray578;
			for (local115 = -128; local115 < 0; local115++) {
				for (local119 = -128; local119 < 0; local119++) {
					if (local16[local32] == 0) {
						local134 = 0;
						if (local16[local32 - 1] != 0) {
							local134++;
						}
						if (local16[local32 + 1] != 0) {
							local134++;
						}
						if (local16[local32 - local22] != 0) {
							local134++;
						}
						if (local16[local22 + local32] != 0) {
							local134++;
						}
						local113[local48++] = local134 * 17 << 24;
					} else {
						local113[local48++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass159_1.anInt3800 - 128;
			}
			if (this.anInterface12_1 == null) {
				this.anInterface12_1 = this.aClass143_Sub1_8.method6292(false, Static634.anIntArray578, 128, 128);
				this.anInterface12_1.method7449(false, false);
			} else {
				this.anInterface12_1.method7451(128, 128, 0, 128, 0, Static634.anIntArray578);
			}
			return;
		}
		if (Static289.aByteArray50 == null) {
			Static289.aByteArray50 = new byte[16384];
		}
		@Pc(234) byte[] local234 = Static289.aByteArray50;
		for (local115 = -128; local115 < 0; local115++) {
			for (local119 = -128; local119 < 0; local119++) {
				if (local16[local32] == 0) {
					local134 = 0;
					if (local16[local32 - 1] != 0) {
						local134++;
					}
					if (local16[local32 + 1] != 0) {
						local134++;
					}
					if (local16[local32 - local22] != 0) {
						local134++;
					}
					if (local16[local32 + local22] != 0) {
						local134++;
					}
					local234[local48++] = (byte) (local134 * 17);
				} else {
					local234[local48++] = 68;
				}
				local32++;
			}
			local32 += this.aClass159_1.anInt3800 - 128;
		}
		if (this.anInterface12_1 == null) {
			this.anInterface12_1 = this.aClass143_Sub1_8.method6339(Static289.aByteArray50, 128, 128, Static83.aClass255_1, false);
			this.anInterface12_1.method7449(false, false);
		} else {
			this.anInterface12_1.method7452(128, 128, Static83.aClass255_1, Static289.aByteArray50, 128);
		}
	}
}
