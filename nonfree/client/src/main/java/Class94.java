import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class94 {

	@OriginalMember(owner = "client!er", name = "k", descriptor = "I")
	private int anInt2402 = -1;

	@OriginalMember(owner = "client!er", name = "p", descriptor = "Z")
	public boolean aBoolean150 = true;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "I")
	private final int anInt2394;

	@OriginalMember(owner = "client!er", name = "c", descriptor = "Lclient!bha;")
	private final Class36 aClass36_2;

	@OriginalMember(owner = "client!er", name = "j", descriptor = "I")
	private final int anInt2401;

	@OriginalMember(owner = "client!er", name = "s", descriptor = "Lclient!lba;")
	private final Class132_Sub1 aClass132_Sub1_8;

	@OriginalMember(owner = "client!er", name = "q", descriptor = "I")
	private int anInt2406;

	@OriginalMember(owner = "client!er", name = "r", descriptor = "I")
	private int anInt2407;

	@OriginalMember(owner = "client!er", name = "g", descriptor = "Lclient!pm;")
	private Interface21 anInterface21_1;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "I")
	public final int anInt2395;

	@OriginalMember(owner = "client!er", name = "n", descriptor = "Lclient!bw;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!lba;Lclient!bha;Lclient!aga;IIIII)V")
	public Class94(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) Class12_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2394 = arg7;
		this.aClass36_2 = arg1;
		this.anInt2401 = arg6;
		this.aClass132_Sub1_8 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = (local35 + local37) * arg2.anInt9314 + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray1[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt2395 = 0;
			this.anInterface2_2 = null;
		} else {
			this.anInt2406 = Integer.MIN_VALUE;
			this.anInt2407 = Integer.MAX_VALUE;
			this.anInterface21_1 = this.aClass132_Sub1_8.method7532(false);
			this.anInterface21_1.method5800(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(108) Buffer local108 = this.anInterface21_1.method5806();
				if (local108 != null) {
					@Pc(116) Stream local116 = this.aClass132_Sub1_8.method7592(local108);
					@Pc(120) int local120;
					@Pc(132) int local132;
					@Pc(134) int local134;
					@Pc(142) short[] local142;
					@Pc(146) int local146;
					@Pc(154) int local154;
					if (Stream.b()) {
						for (local120 = 0; local120 < local25; local120++) {
							local132 = local31 + arg2.anInt9314 * (local35 + local120);
							for (local134 = 0; local134 < local25; local134++) {
								local142 = arg2.aShortArrayArray1[local132++];
								if (local142 != null) {
									for (local146 = 0; local146 < local142.length; local146++) {
										local154 = local142[local146] & 0xFFFF;
										if (local154 < this.anInt2407) {
											this.anInt2407 = local154;
										}
										if (this.anInt2406 < local154) {
											this.anInt2406 = local154;
										}
										local116.b(local154);
									}
								}
							}
						}
					} else {
						for (local120 = 0; local120 < local25; local120++) {
							local132 = arg2.anInt9314 * (local120 + local35) + local31;
							for (local134 = 0; local134 < local25; local134++) {
								local142 = arg2.aShortArrayArray1[local132++];
								if (local142 != null) {
									for (local146 = 0; local146 < local142.length; local146++) {
										local154 = local142[local146] & 0xFFFF;
										if (this.anInt2406 < local154) {
											this.anInt2406 = local154;
										}
										if (this.anInt2407 > local154) {
											this.anInt2407 = local154;
										}
										local116.c(local154);
									}
								}
							}
						}
					}
					local116.c();
					if (this.anInterface21_1.method5808()) {
						break;
					}
				}
			}
			this.anInt2395 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!pm;I)V")
	public void method2060(@OriginalArg(0) int arg0, @OriginalArg(1) Interface21 arg1) {
		if (arg0 > 0) {
			this.method2064();
			this.aClass132_Sub1_8.method7635(this.anInterface2_2);
			this.aClass132_Sub1_8.method7573(0, Static122.aClass60_1, arg1, arg0, this.anInt2407, this.anInt2406 + 1 - this.anInt2407);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	private void method2064() {
		if (!this.aBoolean150) {
			return;
		}
		this.aBoolean150 = false;
		@Pc(16) byte[] local16 = this.aClass36_2.aByteArray10;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass36_2.anInt966;
		@Pc(33) int local33 = this.anInt2401 + this.anInt2394 * this.aClass36_2.anInt966;
		@Pc(54) int local54;
		for (@Pc(35) int local35 = -128; local35 < 0; local35++) {
			local18 = (local18 << 8) - local18;
			for (local54 = -128; local54 < 0; local54++) {
				if (local16[local33++] != 0) {
					local18++;
				}
			}
			local33 += local22 - 128;
		}
		if (this.anInterface2_2 != null && this.anInt2402 == local18) {
			this.aBoolean150 = false;
			return;
		}
		this.anInt2402 = local18;
		local54 = 0;
		local33 = local22 * this.anInt2394 + this.anInt2401;
		@Pc(123) int local123;
		@Pc(127) int local127;
		@Pc(138) int local138;
		if (!this.aClass132_Sub1_8.method7634(Static417.aClass250_14, Static447.aClass265_15)) {
			if (Static526.anIntArray581 == null) {
				Static526.anIntArray581 = new int[16384];
			}
			@Pc(121) int[] local121 = Static526.anIntArray581;
			for (local123 = -128; local123 < 0; local123++) {
				for (local127 = -128; local127 < 0; local127++) {
					if (local16[local33] == 0) {
						local138 = 0;
						if (local16[local33 - 1] != 0) {
							local138++;
						}
						if (local16[local33 + 1] != 0) {
							local138++;
						}
						if (local16[local33 - local22] != 0) {
							local138++;
						}
						if (local16[local22 + local33] != 0) {
							local138++;
						}
						local121[local54++] = local138 * 17 << 24;
					} else {
						local121[local54++] = 1140850688;
					}
					local33++;
				}
				local33 += this.aClass36_2.anInt966 - 128;
			}
			if (this.anInterface2_2 == null) {
				this.anInterface2_2 = this.aClass132_Sub1_8.method7590(128, 128, false, Static526.anIntArray581);
				this.anInterface2_2.method8901(false, false);
			} else {
				this.anInterface2_2.method8903(Static526.anIntArray581, 128, 0, 128, 0, 128);
			}
			return;
		}
		if (Static132.aByteArray24 == null) {
			Static132.aByteArray24 = new byte[16384];
		}
		@Pc(246) byte[] local246 = Static132.aByteArray24;
		for (local123 = -128; local123 < 0; local123++) {
			for (local127 = -128; local127 < 0; local127++) {
				if (local16[local33] == 0) {
					local138 = 0;
					if (local16[local33 - 1] != 0) {
						local138++;
					}
					if (local16[local33 + 1] != 0) {
						local138++;
					}
					if (local16[local33 - local22] != 0) {
						local138++;
					}
					if (local16[local33 + local22] != 0) {
						local138++;
					}
					local246[local54++] = (byte) (local138 * 17);
				} else {
					local246[local54++] = 68;
				}
				local33++;
			}
			local33 += this.aClass36_2.anInt966 - 128;
		}
		if (this.anInterface2_2 == null) {
			this.anInterface2_2 = this.aClass132_Sub1_8.method7550(128, 128, Static132.aByteArray24, false, Static447.aClass265_15);
			this.anInterface2_2.method8901(false, false);
		} else {
			this.anInterface2_2.method8899(128, Static132.aByteArray24, Static447.aClass265_15, 128, 128);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public void method2065() {
		this.method2060(this.anInt2395, this.anInterface21_1);
	}
}
