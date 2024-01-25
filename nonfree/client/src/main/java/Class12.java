import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class12 {

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "Z")
	public boolean aBoolean12 = true;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
	private int anInt195 = -1;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!nd;")
	private final Class62_Sub1 aClass62_Sub1_1;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
	private final int anInt194;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!hg;")
	private final Class128 aClass128_1;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
	private final int anInt196;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
	public final int anInt186;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Lclient!dea;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
	private int anInt191;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	private int anInt188;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!sp;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!nd;Lclient!hg;Lclient!hm;IIIII)V")
	public Class12(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) Class131_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass62_Sub1_1 = arg0;
		this.anInt194 = arg6;
		this.aClass128_1 = arg1;
		this.anInt196 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = arg2.anInt8873 * (local37 + local35) + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray6[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt186 = 0;
			this.anInterface3_1 = null;
		} else {
			this.anInt191 = Integer.MAX_VALUE;
			this.anInt188 = Integer.MIN_VALUE;
			this.anInterface13_1 = this.aClass62_Sub1_1.method4657(false);
			this.anInterface13_1.method3488(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(119) Buffer local119 = this.anInterface13_1.method3487();
				if (local119 != null) {
					@Pc(127) Stream local127 = this.aClass62_Sub1_1.method4693(local119);
					@Pc(131) int local131;
					@Pc(142) int local142;
					@Pc(144) int local144;
					@Pc(152) short[] local152;
					@Pc(156) int local156;
					@Pc(164) int local164;
					if (Stream.c()) {
						for (local131 = 0; local131 < local25; local131++) {
							local142 = local31 + (local35 + local131) * arg2.anInt8873;
							for (local144 = 0; local144 < local25; local144++) {
								local152 = arg2.aShortArrayArray6[local142++];
								if (local152 != null) {
									for (local156 = 0; local156 < local152.length; local156++) {
										local164 = local152[local156] & 0xFFFF;
										if (this.anInt191 > local164) {
											this.anInt191 = local164;
										}
										if (this.anInt188 < local164) {
											this.anInt188 = local164;
										}
										local127.e(local164);
									}
								}
							}
						}
					} else {
						for (local131 = 0; local131 < local25; local131++) {
							local142 = local31 + (local35 + local131) * arg2.anInt8873;
							for (local144 = 0; local144 < local25; local144++) {
								local152 = arg2.aShortArrayArray6[local142++];
								if (local152 != null) {
									for (local156 = 0; local156 < local152.length; local156++) {
										local164 = local152[local156] & 0xFFFF;
										if (this.anInt191 > local164) {
											this.anInt191 = local164;
										}
										if (local164 > this.anInt188) {
											this.anInt188 = local164;
										}
										local127.a(local164);
									}
								}
							}
						}
					}
					local127.b();
					if (this.anInterface13_1.method3492()) {
						break;
					}
				}
			}
			this.anInt186 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!sp;B)V")
	public void method325(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		if (arg0 > 0) {
			this.method326();
			this.aClass62_Sub1_1.method4676(this.anInterface3_1);
			this.aClass62_Sub1_1.method4727(Static403.aClass228_7, 0, this.anInt188 + 1 - this.anInt191, arg0, arg1, this.anInt191);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	private void method326() {
		if (!this.aBoolean12) {
			return;
		}
		this.aBoolean12 = false;
		@Pc(16) byte[] local16 = this.aClass128_1.aByteArray50;
		@Pc(18) int local18 = 0;
		@Pc(27) int local27 = this.aClass128_1.anInt3511;
		@Pc(38) int local38 = this.anInt194 + this.anInt196 * this.aClass128_1.anInt3511;
		@Pc(51) int local51;
		for (@Pc(40) int local40 = -128; local40 < 0; local40++) {
			local18 = (local18 << 8) - local18;
			for (local51 = -128; local51 < 0; local51++) {
				if (local16[local38++] != 0) {
					local18++;
				}
			}
			local38 += local27 - 128;
		}
		if (this.anInterface3_1 != null && local18 == this.anInt195) {
			this.aBoolean12 = false;
			return;
		}
		this.anInt195 = local18;
		local38 = this.anInt194 + this.anInt196 * local27;
		local51 = 0;
		@Pc(120) int local120;
		@Pc(124) int local124;
		@Pc(142) int local142;
		if (!this.aClass62_Sub1_1.method4739(Static523.aClass306_15, Static301.aClass174_10)) {
			if (Static64.anIntArray159 == null) {
				Static64.anIntArray159 = new int[16384];
			}
			@Pc(242) int[] local242 = Static64.anIntArray159;
			for (local120 = -128; local120 < 0; local120++) {
				for (local124 = -128; local124 < 0; local124++) {
					if (local16[local38] == 0) {
						local142 = 0;
						if (local16[local38 - 1] != 0) {
							local142++;
						}
						if (local16[local38 + 1] != 0) {
							local142++;
						}
						if (local16[local38 - local27] != 0) {
							local142++;
						}
						if (local16[local38 + local27] != 0) {
							local142++;
						}
						local242[local51++] = local142 * 17 << 24;
					} else {
						local242[local51++] = 1140850688;
					}
					local38++;
				}
				local38 += this.aClass128_1.anInt3511 - 128;
			}
			if (this.anInterface3_1 == null) {
				this.anInterface3_1 = this.aClass62_Sub1_1.method4692(false, 128, Static64.anIntArray159, 128);
				this.anInterface3_1.method7454(false, false);
			} else {
				this.anInterface3_1.method7452(0, 128, 128, Static64.anIntArray159, 0, 128);
			}
			return;
		}
		if (Static455.aByteArray92 == null) {
			Static455.aByteArray92 = new byte[16384];
		}
		@Pc(118) byte[] local118 = Static455.aByteArray92;
		for (local120 = -128; local120 < 0; local120++) {
			for (local124 = -128; local124 < 0; local124++) {
				if (local16[local38] == 0) {
					local142 = 0;
					if (local16[local38 - 1] != 0) {
						local142++;
					}
					if (local16[local38 + 1] != 0) {
						local142++;
					}
					if (local16[local38 - local27] != 0) {
						local142++;
					}
					if (local16[local38 + local27] != 0) {
						local142++;
					}
					local118[local51++] = (byte) (local142 * 17);
				} else {
					local118[local51++] = 68;
				}
				local38++;
			}
			local38 += this.aClass128_1.anInt3511 - 128;
		}
		if (this.anInterface3_1 == null) {
			this.anInterface3_1 = this.aClass62_Sub1_1.method4707(128, 128, false, Static455.aByteArray92, Static301.aClass174_10);
			this.anInterface3_1.method7454(false, false);
		} else {
			this.anInterface3_1.method7453(128, Static301.aClass174_10, 128, Static455.aByteArray92, 128);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public void method327() {
		this.method325(this.anInt186, this.anInterface13_1);
	}
}
