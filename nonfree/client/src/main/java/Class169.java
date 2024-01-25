import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class169 {

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
	private int anInt4793 = -1;

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "Z")
	public boolean aBoolean319 = true;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
	private final int anInt4791;

	@OriginalMember(owner = "client!jfa", name = "m", descriptor = "Lclient!ch;")
	private final Class5_Sub1 aClass5_Sub1_13;

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "Lclient!lba;")
	private final Class199 aClass199_2;

	@OriginalMember(owner = "client!jfa", name = "s", descriptor = "I")
	private final int anInt4802;

	@OriginalMember(owner = "client!jfa", name = "r", descriptor = "I")
	private int anInt4801;

	@OriginalMember(owner = "client!jfa", name = "o", descriptor = "I")
	private int anInt4799;

	@OriginalMember(owner = "client!jfa", name = "q", descriptor = "Lclient!rr;")
	private Interface19 anInterface19_5;

	@OriginalMember(owner = "client!jfa", name = "l", descriptor = "I")
	public final int anInt4797;

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "Lclient!ug;")
	private Interface24 anInterface24_4;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!ch;Lclient!lba;Lclient!cj;IIIII)V")
	public Class169(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(2) Class51_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt4791 = arg6;
		this.aClass5_Sub1_13 = arg0;
		this.aClass199_2 = arg1;
		this.anInt4802 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = arg2.anInt9121 * (local37 + local35) + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray1[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt4797 = 0;
			this.anInterface24_4 = null;
		} else {
			this.anInt4801 = Integer.MAX_VALUE;
			this.anInt4799 = Integer.MIN_VALUE;
			this.anInterface19_5 = this.aClass5_Sub1_13.method5671(false);
			this.anInterface19_5.method7981(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(111) Buffer local111 = this.anInterface19_5.method7984();
				if (local111 != null) {
					@Pc(119) Stream local119 = this.aClass5_Sub1_13.method5647(local111);
					@Pc(123) int local123;
					@Pc(134) int local134;
					@Pc(136) int local136;
					@Pc(144) short[] local144;
					@Pc(148) int local148;
					@Pc(156) int local156;
					if (Stream.a()) {
						for (local123 = 0; local123 < local25; local123++) {
							local134 = local31 + arg2.anInt9121 * (local123 + local35);
							for (local136 = 0; local136 < local25; local136++) {
								local144 = arg2.aShortArrayArray1[local134++];
								if (local144 != null) {
									for (local148 = 0; local148 < local144.length; local148++) {
										local156 = local144[local148] & 0xFFFF;
										if (local156 > this.anInt4799) {
											this.anInt4799 = local156;
										}
										if (this.anInt4801 > local156) {
											this.anInt4801 = local156;
										}
										local119.e(local156);
									}
								}
							}
						}
					} else {
						for (local123 = 0; local123 < local25; local123++) {
							local134 = arg2.anInt9121 * (local35 + local123) + local31;
							for (local136 = 0; local136 < local25; local136++) {
								local144 = arg2.aShortArrayArray1[local134++];
								if (local144 != null) {
									for (local148 = 0; local148 < local144.length; local148++) {
										local156 = local144[local148] & 0xFFFF;
										if (local156 > this.anInt4799) {
											this.anInt4799 = local156;
										}
										if (local156 < this.anInt4801) {
											this.anInt4801 = local156;
										}
										local119.d(local156);
									}
								}
							}
						}
					}
					local119.b();
					if (this.anInterface19_5.method7985()) {
						break;
					}
				}
			}
			this.anInt4797 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V")
	public void method4318() {
		this.method4321(this.anInterface19_5, this.anInt4797);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V")
	private void method4319() {
		if (!this.aBoolean319) {
			return;
		}
		this.aBoolean319 = false;
		@Pc(20) byte[] local20 = this.aClass199_2.aByteArray64;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass199_2.anInt5905;
		@Pc(37) int local37 = this.anInt4791 + this.anInt4802 * this.aClass199_2.anInt5905;
		@Pc(50) int local50;
		for (@Pc(39) int local39 = -128; local39 < 0; local39++) {
			local22 = (local22 << 8) - local22;
			for (local50 = -128; local50 < 0; local50++) {
				if (local20[local37++] != 0) {
					local22++;
				}
			}
			local37 += local26 - 128;
		}
		if (this.anInterface24_4 != null && local22 == this.anInt4793) {
			this.aBoolean319 = false;
			return;
		}
		this.anInt4793 = local22;
		local50 = 0;
		local37 = this.anInt4791 + this.anInt4802 * local26;
		@Pc(123) int local123;
		@Pc(127) int local127;
		@Pc(135) int local135;
		if (!this.aClass5_Sub1_13.method5602(Static355.aClass182_12, Static637.aClass376_16)) {
			if (Static497.anIntArray529 == null) {
				Static497.anIntArray529 = new int[16384];
			}
			@Pc(243) int[] local243 = Static497.anIntArray529;
			for (local123 = -128; local123 < 0; local123++) {
				for (local127 = -128; local127 < 0; local127++) {
					if (local20[local37] == 0) {
						local135 = 0;
						if (local20[local37 - 1] != 0) {
							local135++;
						}
						if (local20[local37 + 1] != 0) {
							local135++;
						}
						if (local20[local37 - local26] != 0) {
							local135++;
						}
						if (local20[local37 + local26] != 0) {
							local135++;
						}
						local243[local50++] = local135 * 17 << 24;
					} else {
						local243[local50++] = 1140850688;
					}
					local37++;
				}
				local37 += this.aClass199_2.anInt5905 - 128;
			}
			if (this.anInterface24_4 == null) {
				this.anInterface24_4 = this.aClass5_Sub1_13.method5633(false, 128, 128, Static497.anIntArray529);
				this.anInterface24_4.method7475(false, false);
			} else {
				this.anInterface24_4.method7477(Static497.anIntArray529, 128, 128, 0, 128, 0);
			}
			return;
		}
		if (Static228.aByteArray53 == null) {
			Static228.aByteArray53 = new byte[16384];
		}
		@Pc(121) byte[] local121 = Static228.aByteArray53;
		for (local123 = -128; local123 < 0; local123++) {
			for (local127 = -128; local127 < 0; local127++) {
				if (local20[local37] == 0) {
					local135 = 0;
					if (local20[local37 - 1] != 0) {
						local135++;
					}
					if (local20[local37 + 1] != 0) {
						local135++;
					}
					if (local20[local37 - local26] != 0) {
						local135++;
					}
					if (local20[local37 + local26] != 0) {
						local135++;
					}
					local121[local50++] = (byte) (local135 * 17);
				} else {
					local121[local50++] = 68;
				}
				local37++;
			}
			local37 += this.aClass199_2.anInt5905 - 128;
		}
		if (this.anInterface24_4 == null) {
			this.anInterface24_4 = this.aClass5_Sub1_13.method5662(128, Static228.aByteArray53, false, 128, Static355.aClass182_12);
			this.anInterface24_4.method7475(false, false);
		} else {
			this.anInterface24_4.method7480(Static355.aClass182_12, Static228.aByteArray53, 128, 128, 128);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!rr;I)V")
	public void method4321(@OriginalArg(1) Interface19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method4319();
			this.aClass5_Sub1_13.method5609(this.anInterface24_4);
			this.aClass5_Sub1_13.method5665(Static67.aClass292_2, this.anInt4801, this.anInt4799 + 1 - this.anInt4801, arg0, arg1, 0);
		}
	}
}
