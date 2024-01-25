import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class78 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "Z")
	public boolean aBoolean180 = true;

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
	private int anInt2427 = -1;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "Lclient!oaa;")
	private final Class232 aClass232_1;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	private final int anInt2430;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "Lclient!wu;")
	private final Class100_Sub1 aClass100_Sub1_7;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
	private final int anInt2434;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
	public final int anInt2429;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "Lclient!ch;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
	private int anInt2425;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
	private int anInt2426;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "Lclient!jf;")
	private Interface11 anInterface11_2;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!wu;Lclient!oaa;Lclient!lw;IIIII)V")
	public Class78(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class232 arg1, @OriginalArg(2) Class199_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass232_1 = arg1;
		this.anInt2430 = arg6;
		this.aClass100_Sub1_7 = arg0;
		this.anInt2434 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = (local35 + local37) * arg2.anInt10111 + local31;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray8[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt2429 = 0;
			this.anInterface3_2 = null;
		} else {
			this.anInt2425 = Integer.MAX_VALUE;
			this.anInt2426 = Integer.MIN_VALUE;
			this.anInterface11_2 = this.aClass100_Sub1_7.method6101(false);
			this.anInterface11_2.method8437(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(121) Buffer local121 = this.anInterface11_2.method3077();
				if (local121 != null) {
					@Pc(129) Stream local129 = this.aClass100_Sub1_7.method6131(local121);
					@Pc(133) int local133;
					@Pc(145) int local145;
					@Pc(147) int local147;
					@Pc(155) short[] local155;
					@Pc(159) int local159;
					@Pc(167) int local167;
					if (Stream.b()) {
						for (local133 = 0; local133 < local25; local133++) {
							local145 = (local133 + local35) * arg2.anInt10111 + local31;
							for (local147 = 0; local147 < local25; local147++) {
								local155 = arg2.aShortArrayArray8[local145++];
								if (local155 != null) {
									for (local159 = 0; local159 < local155.length; local159++) {
										local167 = local155[local159] & 0xFFFF;
										if (this.anInt2426 < local167) {
											this.anInt2426 = local167;
										}
										if (local167 < this.anInt2425) {
											this.anInt2425 = local167;
										}
										local129.d(local167);
									}
								}
							}
						}
					} else {
						for (local133 = 0; local133 < local25; local133++) {
							local145 = (local35 + local133) * arg2.anInt10111 + local31;
							for (local147 = 0; local147 < local25; local147++) {
								local155 = arg2.aShortArrayArray8[local145++];
								if (local155 != null) {
									for (local159 = 0; local159 < local155.length; local159++) {
										local167 = local155[local159] & 0xFFFF;
										if (local167 < this.anInt2425) {
											this.anInt2425 = local167;
										}
										if (local167 > this.anInt2426) {
											this.anInt2426 = local167;
										}
										local129.a(local167);
									}
								}
							}
						}
					}
					local129.c();
					if (this.anInterface11_2.method3078()) {
						break;
					}
				}
			}
			this.anInt2429 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	private void method2050() {
		if (!this.aBoolean180) {
			return;
		}
		this.aBoolean180 = false;
		@Pc(16) byte[] local16 = this.aClass232_1.aByteArray71;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass232_1.anInt7358;
		@Pc(33) int local33 = this.anInt2430 + this.anInt2434 * this.aClass232_1.anInt7358;
		@Pc(46) int local46;
		for (@Pc(35) int local35 = -128; local35 < 0; local35++) {
			local18 = (local18 << 8) - local18;
			for (local46 = -128; local46 < 0; local46++) {
				if (local16[local33++] != 0) {
					local18++;
				}
			}
			local33 += local22 - 128;
		}
		if (this.anInterface3_2 != null && this.anInt2427 == local18) {
			this.aBoolean180 = false;
			return;
		}
		this.anInt2427 = local18;
		local33 = this.anInt2434 * local22 + this.anInt2430;
		local46 = 0;
		@Pc(120) int local120;
		@Pc(124) int local124;
		@Pc(139) int local139;
		if (!this.aClass100_Sub1_7.method6050(Static409.aClass242_13, Static598.aClass250_15)) {
			if (Static344.anIntArray408 == null) {
				Static344.anIntArray408 = new int[16384];
			}
			@Pc(244) int[] local244 = Static344.anIntArray408;
			for (local120 = -128; local120 < 0; local120++) {
				for (local124 = -128; local124 < 0; local124++) {
					if (local16[local33] == 0) {
						local139 = 0;
						if (local16[local33 - 1] != 0) {
							local139++;
						}
						if (local16[local33 + 1] != 0) {
							local139++;
						}
						if (local16[local33 - local22] != 0) {
							local139++;
						}
						if (local16[local33 + local22] != 0) {
							local139++;
						}
						local244[local46++] = local139 * 17 << 24;
					} else {
						local244[local46++] = 1140850688;
					}
					local33++;
				}
				local33 += this.aClass232_1.anInt7358 - 128;
			}
			if (this.anInterface3_2 == null) {
				this.anInterface3_2 = this.aClass100_Sub1_7.method6097(false, 128, Static344.anIntArray408, 128);
				this.anInterface3_2.method7839(false, false);
			} else {
				this.anInterface3_2.method7842(128, 0, 128, 128, 0, Static344.anIntArray408);
			}
			return;
		}
		if (Static616.aByteArray126 == null) {
			Static616.aByteArray126 = new byte[16384];
		}
		@Pc(118) byte[] local118 = Static616.aByteArray126;
		for (local120 = -128; local120 < 0; local120++) {
			for (local124 = -128; local124 < 0; local124++) {
				if (local16[local33] == 0) {
					local139 = 0;
					if (local16[local33 - 1] != 0) {
						local139++;
					}
					if (local16[local33 + 1] != 0) {
						local139++;
					}
					if (local16[local33 - local22] != 0) {
						local139++;
					}
					if (local16[local33 + local22] != 0) {
						local139++;
					}
					local118[local46++] = (byte) (local139 * 17);
				} else {
					local118[local46++] = 68;
				}
				local33++;
			}
			local33 += this.aClass232_1.anInt7358 - 128;
		}
		if (this.anInterface3_2 == null) {
			this.anInterface3_2 = this.aClass100_Sub1_7.method6125(128, false, Static616.aByteArray126, Static598.aClass250_15, 128);
			this.anInterface3_2.method7839(false, false);
		} else {
			this.anInterface3_2.method7844(128, 128, 128, Static616.aByteArray126, Static598.aClass250_15);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
	public void method2051() {
		this.method2052(this.anInterface11_2, this.anInt2429);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!jf;II)V")
	public void method2052(@OriginalArg(0) Interface11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method2050();
			this.aClass100_Sub1_7.method6033(this.anInterface3_2);
			this.aClass100_Sub1_7.method6064(arg1, 0, this.anInt2426 + 1 - this.anInt2425, this.anInt2425, arg0, Static295.aClass77_2);
		}
	}
}
