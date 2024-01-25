import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class207 {

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "[I")
	public static final int[] anIntArray361 = new int[128];

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
	private int anInt5566 = -1;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Z")
	public boolean aBoolean430 = true;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "Lclient!cm;")
	private final Class63 aClass63_2;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
	private final int anInt5560;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	private final int anInt5567;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "Lclient!sf;")
	private final Class16_Sub1 aClass16_Sub1_13;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "Lclient!gl;")
	private Interface11 anInterface11_2;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
	public final int anInt5564;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
	private int anInt5565;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
	private int anInt5559;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "Lclient!ta;")
	private Interface22 anInterface22_3;

	static {
		for (@Pc(10) int local10 = 0; local10 < anIntArray361.length; local10++) {
			anIntArray361[local10] = -1;
		}
		for (@Pc(22) int local22 = 65; local22 <= 90; local22++) {
			anIntArray361[local22] = local22 - 65;
		}
		for (@Pc(35) int local35 = 97; local35 <= 122; local35++) {
			anIntArray361[local35] = local35 + 26 - 97;
		}
		for (@Pc(52) int local52 = 48; local52 <= 57; local52++) {
			anIntArray361[local52] = local52 + 4;
		}
		anIntArray361[45] = anIntArray361[47] = 63;
		anIntArray361[42] = anIntArray361[43] = 62;
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!sf;Lclient!cm;Lclient!ek;IIIII)V")
	public Class207(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) Class104_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass63_2 = arg1;
		this.anInt5560 = arg6;
		this.anInt5567 = arg7;
		this.aClass16_Sub1_13 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = local31 + (local37 + local35) * arg2.anInt9718;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray7[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface11_2 = null;
			this.anInt5564 = 0;
		} else {
			this.anInt5565 = Integer.MIN_VALUE;
			this.anInt5559 = Integer.MAX_VALUE;
			this.anInterface22_3 = this.aClass16_Sub1_13.method6262(false);
			this.anInterface22_3.method7734(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(117) Buffer local117 = this.anInterface22_3.method7739();
				if (local117 != null) {
					@Pc(125) Stream local125 = this.aClass16_Sub1_13.method6328(local117);
					@Pc(129) int local129;
					@Pc(140) int local140;
					@Pc(142) int local142;
					@Pc(150) short[] local150;
					@Pc(154) int local154;
					@Pc(162) int local162;
					if (Stream.c()) {
						for (local129 = 0; local129 < local25; local129++) {
							local140 = (local35 + local129) * arg2.anInt9718 + local31;
							for (local142 = 0; local142 < local25; local142++) {
								local150 = arg2.aShortArrayArray7[local140++];
								if (local150 != null) {
									for (local154 = 0; local154 < local150.length; local154++) {
										local162 = local150[local154] & 0xFFFF;
										if (this.anInt5565 < local162) {
											this.anInt5565 = local162;
										}
										if (local162 < this.anInt5559) {
											this.anInt5559 = local162;
										}
										local125.e(local162);
									}
								}
							}
						}
					} else {
						for (local129 = 0; local129 < local25; local129++) {
							local140 = local31 + (local129 + local35) * arg2.anInt9718;
							for (local142 = 0; local142 < local25; local142++) {
								local150 = arg2.aShortArrayArray7[local140++];
								if (local150 != null) {
									for (local154 = 0; local154 < local150.length; local154++) {
										local162 = local150[local154] & 0xFFFF;
										if (this.anInt5565 < local162) {
											this.anInt5565 = local162;
										}
										if (local162 < this.anInt5559) {
											this.anInt5559 = local162;
										}
										local125.a(local162);
									}
								}
							}
						}
					}
					local125.b();
					if (this.anInterface22_3.method7738()) {
						break;
					}
				}
			}
			this.anInt5564 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
	public void method4694() {
		this.method4697(this.anInt5564, this.anInterface22_3);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILclient!ta;)V")
	public void method4697(@OriginalArg(0) int arg0, @OriginalArg(2) Interface22 arg1) {
		if (arg0 > 0) {
			this.method4703();
			this.aClass16_Sub1_13.method6197(this.anInterface11_2);
			this.aClass16_Sub1_13.method6306(this.anInt5565 + 1 - this.anInt5559, arg1, Static425.aClass44_5, arg0, this.anInt5559, 0);
		}
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
	private void method4703() {
		if (!this.aBoolean430) {
			return;
		}
		this.aBoolean430 = false;
		@Pc(24) byte[] local24 = this.aClass63_2.aByteArray8;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = this.aClass63_2.anInt1907;
		@Pc(40) int local40 = this.aClass63_2.anInt1907 * this.anInt5567 + this.anInt5560;
		@Pc(53) int local53;
		for (@Pc(42) int local42 = -128; local42 < 0; local42++) {
			local26 = (local26 << 8) - local26;
			for (local53 = -128; local53 < 0; local53++) {
				if (local24[local40++] != 0) {
					local26++;
				}
			}
			local40 += local30 - 128;
		}
		if (this.anInterface11_2 != null && this.anInt5566 == local26) {
			this.aBoolean430 = false;
			return;
		}
		this.anInt5566 = local26;
		local40 = local30 * this.anInt5567 + this.anInt5560;
		local53 = 0;
		@Pc(126) int local126;
		@Pc(130) int local130;
		@Pc(138) int local138;
		if (!this.aClass16_Sub1_13.method6292(Static553.aClass330_14, Static550.aClass361_15)) {
			if (Static498.anIntArray542 == null) {
				Static498.anIntArray542 = new int[16384];
			}
			@Pc(124) int[] local124 = Static498.anIntArray542;
			for (local126 = -128; local126 < 0; local126++) {
				for (local130 = -128; local130 < 0; local130++) {
					if (local24[local40] == 0) {
						local138 = 0;
						if (local24[local40 - 1] != 0) {
							local138++;
						}
						if (local24[local40 + 1] != 0) {
							local138++;
						}
						if (local24[local40 - local30] != 0) {
							local138++;
						}
						if (local24[local30 + local40] != 0) {
							local138++;
						}
						local124[local53++] = local138 * 17 << 24;
					} else {
						local124[local53++] = 1140850688;
					}
					local40++;
				}
				local40 += this.aClass63_2.anInt1907 - 128;
			}
			if (this.anInterface11_2 == null) {
				this.anInterface11_2 = this.aClass16_Sub1_13.method6276(128, false, 128, Static498.anIntArray542);
				this.anInterface11_2.method8761(false, false);
			} else {
				this.anInterface11_2.method8768(Static498.anIntArray542, 0, 0, 128, 128, 128);
			}
			return;
		}
		if (Static12.aByteArray2 == null) {
			Static12.aByteArray2 = new byte[16384];
		}
		@Pc(246) byte[] local246 = Static12.aByteArray2;
		for (local126 = -128; local126 < 0; local126++) {
			for (local130 = -128; local130 < 0; local130++) {
				if (local24[local40] == 0) {
					local138 = 0;
					if (local24[local40 - 1] != 0) {
						local138++;
					}
					if (local24[local40 + 1] != 0) {
						local138++;
					}
					if (local24[local40 - local30] != 0) {
						local138++;
					}
					if (local24[local30 + local40] != 0) {
						local138++;
					}
					local246[local53++] = (byte) (local138 * 17);
				} else {
					local246[local53++] = 68;
				}
				local40++;
			}
			local40 += this.aClass63_2.anInt1907 - 128;
		}
		if (this.anInterface11_2 == null) {
			this.anInterface11_2 = this.aClass16_Sub1_13.method6301(Static550.aClass361_15, 128, 128, Static12.aByteArray2, false);
			this.anInterface11_2.method8761(false, false);
		} else {
			this.anInterface11_2.method8764(Static12.aByteArray2, 128, Static550.aClass361_15, 128, 128);
		}
	}
}
