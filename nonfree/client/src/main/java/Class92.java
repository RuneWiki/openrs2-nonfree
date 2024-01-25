import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class92 {

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
	private int anInt2621 = -1;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "Z")
	public boolean aBoolean218 = true;

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "Lclient!kw;")
	private final Class39_Sub2 aClass39_Sub2_9;

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "Lclient!pr;")
	private final Class227 aClass227_2;

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
	private final int anInt2620;

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
	private final int anInt2617;

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
	public final int anInt2616;

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "Lclient!hc;")
	private Interface8 anInterface8_2;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
	private int anInt2618;

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
	private int anInt2623;

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "Lclient!g;")
	private Interface7 anInterface7_2;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!kw;Lclient!pr;Lclient!eo;IIIII)V")
	public Class92(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class227 arg1, @OriginalArg(2) Class75_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass39_Sub2_9 = arg0;
		this.aClass227_2 = arg1;
		this.anInt2620 = arg6;
		this.anInt2617 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = (local35 + local37) * arg2.anInt7998 + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray1[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt2616 = 0;
			this.anInterface8_2 = null;
		} else {
			this.anInt2618 = Integer.MAX_VALUE;
			this.anInt2623 = Integer.MIN_VALUE;
			this.anInterface7_2 = this.aClass39_Sub2_9.method6204(false);
			this.anInterface7_2.method6949(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(114) Buffer local114 = this.anInterface7_2.method6952();
				if (local114 != null) {
					@Pc(122) Stream local122 = this.aClass39_Sub2_9.method6195(local114);
					@Pc(126) int local126;
					@Pc(137) int local137;
					@Pc(139) int local139;
					@Pc(147) short[] local147;
					@Pc(151) int local151;
					@Pc(159) int local159;
					if (Stream.a()) {
						for (local126 = 0; local126 < local25; local126++) {
							local137 = arg2.anInt7998 * (local126 + local35) + local31;
							for (local139 = 0; local139 < local25; local139++) {
								local147 = arg2.aShortArrayArray1[local137++];
								if (local147 != null) {
									for (local151 = 0; local151 < local147.length; local151++) {
										local159 = local147[local151] & 0xFFFF;
										if (local159 > this.anInt2623) {
											this.anInt2623 = local159;
										}
										if (local159 < this.anInt2618) {
											this.anInt2618 = local159;
										}
										local122.f(local159);
									}
								}
							}
						}
					} else {
						for (local126 = 0; local126 < local25; local126++) {
							local137 = local31 + arg2.anInt7998 * (local35 + local126);
							for (local139 = 0; local139 < local25; local139++) {
								local147 = arg2.aShortArrayArray1[local137++];
								if (local147 != null) {
									for (local151 = 0; local151 < local147.length; local151++) {
										local159 = local147[local151] & 0xFFFF;
										if (this.anInt2618 > local159) {
											this.anInt2618 = local159;
										}
										if (local159 > this.anInt2623) {
											this.anInt2623 = local159;
										}
										local122.e(local159);
									}
								}
							}
						}
					}
					local122.c();
					if (this.anInterface7_2.method6954()) {
						break;
					}
				}
			}
			this.anInt2616 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
	public void method2473() {
		this.method2475(this.anInt2616, this.anInterface7_2);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	private void method2474() {
		if (!this.aBoolean218) {
			return;
		}
		this.aBoolean218 = false;
		@Pc(16) byte[] local16 = this.aClass227_2.aByteArray98;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass227_2.anInt7018;
		@Pc(32) int local32 = this.aClass227_2.anInt7018 * this.anInt2617 + this.anInt2620;
		@Pc(49) int local49;
		for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
			local18 = (local18 << 8) - local18;
			for (local49 = -128; local49 < 0; local49++) {
				if (local16[local32++] != 0) {
					local18++;
				}
			}
			local32 += local22 - 128;
		}
		if (this.anInterface8_2 != null && local18 == this.anInt2621) {
			this.aBoolean218 = false;
			return;
		}
		this.anInt2621 = local18;
		local32 = this.anInt2617 * local22 + this.anInt2620;
		local49 = 0;
		@Pc(112) int local112;
		@Pc(116) int local116;
		@Pc(124) int local124;
		if (!this.aClass39_Sub2_9.method6103(Static268.aClass171_10, Static160.aClass150_3)) {
			if (Static376.anIntArray566 == null) {
				Static376.anIntArray566 = new int[16384];
			}
			@Pc(110) int[] local110 = Static376.anIntArray566;
			for (local112 = -128; local112 < 0; local112++) {
				for (local116 = -128; local116 < 0; local116++) {
					if (local16[local32] == 0) {
						local124 = 0;
						if (local16[local32 - 1] != 0) {
							local124++;
						}
						if (local16[local32 + 1] != 0) {
							local124++;
						}
						if (local16[local32 - local22] != 0) {
							local124++;
						}
						if (local16[local22 + local32] != 0) {
							local124++;
						}
						local110[local49++] = local124 * 17 << 24;
					} else {
						local110[local49++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass227_2.anInt7018 - 128;
			}
			if (this.anInterface8_2 == null) {
				this.anInterface8_2 = this.aClass39_Sub2_9.method6106(Static376.anIntArray566, false, 128, 128);
				this.anInterface8_2.method5780(false, false);
			} else {
				this.anInterface8_2.method5779(0, 128, Static376.anIntArray566, 128, 0, 128);
			}
			return;
		}
		if (Static323.aByteArray95 == null) {
			Static323.aByteArray95 = new byte[16384];
		}
		@Pc(232) byte[] local232 = Static323.aByteArray95;
		for (local112 = -128; local112 < 0; local112++) {
			for (local116 = -128; local116 < 0; local116++) {
				if (local16[local32] == 0) {
					local124 = 0;
					if (local16[local32 - 1] != 0) {
						local124++;
					}
					if (local16[local32 + 1] != 0) {
						local124++;
					}
					if (local16[local32 - local22] != 0) {
						local124++;
					}
					if (local16[local22 + local32] != 0) {
						local124++;
					}
					local232[local49++] = (byte) (local124 * 17);
				} else {
					local232[local49++] = 68;
				}
				local32++;
			}
			local32 += this.aClass227_2.anInt7018 - 128;
		}
		if (this.anInterface8_2 == null) {
			this.anInterface8_2 = this.aClass39_Sub2_9.method6198(false, Static323.aByteArray95, 128, 128, Static160.aClass150_3);
			this.anInterface8_2.method5780(false, false);
		} else {
			this.anInterface8_2.method5776(Static160.aClass150_3, Static323.aByteArray95, 128, 128, 128);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IILclient!g;)V")
	public void method2475(@OriginalArg(1) int arg0, @OriginalArg(2) Interface7 arg1) {
		if (arg0 > 0) {
			this.method2474();
			this.aClass39_Sub2_9.method6179(this.anInterface8_2);
			this.aClass39_Sub2_9.method6215(arg1, 0, Static514.aClass281_6, arg0, this.anInt2618, this.anInt2623 + 1 - this.anInt2618);
		}
	}
}
