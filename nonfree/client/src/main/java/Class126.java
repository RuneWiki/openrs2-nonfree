import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class126 {

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
	private int anInt4270 = -1;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "Z")
	public boolean aBoolean316 = true;

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "Lclient!tu;")
	private final Class5_Sub3 aClass5_Sub3_8;

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
	private final int anInt4271;

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "Lclient!ob;")
	private final Class211 aClass211_2;

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
	private final int anInt4274;

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
	private int anInt4275;

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
	private int anInt4264;

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "Lclient!nq;")
	private Interface14 anInterface14_3;

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
	public final int anInt4267;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "Lclient!ica;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!tu;Lclient!ob;Lclient!ha;IIIII)V")
	public Class126(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) Class211 arg1, @OriginalArg(2) Class52_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass5_Sub3_8 = arg0;
		this.anInt4271 = arg6;
		this.aClass211_2 = arg1;
		this.anInt4274 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = local31 + (local37 + local35) * arg2.anInt9491;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray3[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface9_2 = null;
			this.anInt4267 = 0;
		} else {
			this.anInt4275 = Integer.MAX_VALUE;
			this.anInt4264 = Integer.MIN_VALUE;
			this.anInterface14_3 = this.aClass5_Sub3_8.method6325(false);
			this.anInterface14_3.method3137(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(107) Buffer local107 = this.anInterface14_3.method3136();
				if (local107 != null) {
					@Pc(115) Stream local115 = this.aClass5_Sub3_8.method6352(local107);
					@Pc(119) int local119;
					@Pc(131) int local131;
					@Pc(133) int local133;
					@Pc(141) short[] local141;
					@Pc(145) int local145;
					@Pc(153) int local153;
					if (Stream.c()) {
						for (local119 = 0; local119 < local25; local119++) {
							local131 = local31 + (local35 + local119) * arg2.anInt9491;
							for (local133 = 0; local133 < local25; local133++) {
								local141 = arg2.aShortArrayArray3[local131++];
								if (local141 != null) {
									for (local145 = 0; local145 < local141.length; local145++) {
										local153 = local141[local145] & 0xFFFF;
										if (this.anInt4275 > local153) {
											this.anInt4275 = local153;
										}
										if (local153 > this.anInt4264) {
											this.anInt4264 = local153;
										}
										local115.c(local153);
									}
								}
							}
						}
					} else {
						for (local119 = 0; local119 < local25; local119++) {
							local131 = local31 + (local119 + local35) * arg2.anInt9491;
							for (local133 = 0; local133 < local25; local133++) {
								local141 = arg2.aShortArrayArray3[local131++];
								if (local141 != null) {
									for (local145 = 0; local145 < local141.length; local145++) {
										local153 = local141[local145] & 0xFFFF;
										if (local153 > this.anInt4264) {
											this.anInt4264 = local153;
										}
										if (this.anInt4275 > local153) {
											this.anInt4275 = local153;
										}
										local115.b(local153);
									}
								}
							}
						}
					}
					local115.a();
					if (this.anInterface14_3.method3135()) {
						break;
					}
				}
			}
			this.anInt4267 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!nq;II)V")
	public void method3525(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 0) {
			this.method3530();
			this.aClass5_Sub3_8.method6416(this.anInterface9_2);
			this.aClass5_Sub3_8.method6295(this.anInt4275, arg1, this.anInt4264 + 1 - this.anInt4275, 0, Static524.aClass87_7, arg0);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
	public void method3529() {
		this.method3525(this.anInterface14_3, this.anInt4267);
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	private void method3530() {
		if (!this.aBoolean316) {
			return;
		}
		this.aBoolean316 = false;
		@Pc(20) byte[] local20 = this.aClass211_2.aByteArray62;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass211_2.anInt6457;
		@Pc(36) int local36 = this.anInt4271 + this.aClass211_2.anInt6457 * this.anInt4274;
		@Pc(49) int local49;
		for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
			local22 = (local22 << 8) - local22;
			for (local49 = -128; local49 < 0; local49++) {
				if (local20[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.anInterface9_2 != null && local22 == this.anInt4270) {
			this.aBoolean316 = false;
			return;
		}
		this.anInt4270 = local22;
		local36 = local26 * this.anInt4274 + this.anInt4271;
		local49 = 0;
		@Pc(119) int local119;
		@Pc(123) int local123;
		@Pc(134) int local134;
		if (!this.aClass5_Sub3_8.method6310(Static212.aClass167_7, Static524.aClass310_16)) {
			if (Static22.anIntArray691 == null) {
				Static22.anIntArray691 = new int[16384];
			}
			@Pc(117) int[] local117 = Static22.anIntArray691;
			for (local119 = -128; local119 < 0; local119++) {
				for (local123 = -128; local123 < 0; local123++) {
					if (local20[local36] == 0) {
						local134 = 0;
						if (local20[local36 - 1] != 0) {
							local134++;
						}
						if (local20[local36 + 1] != 0) {
							local134++;
						}
						if (local20[local36 - local26] != 0) {
							local134++;
						}
						if (local20[local26 + local36] != 0) {
							local134++;
						}
						local117[local49++] = local134 * 17 << 24;
					} else {
						local117[local49++] = 1140850688;
					}
					local36++;
				}
				local36 += this.aClass211_2.anInt6457 - 128;
			}
			if (this.anInterface9_2 == null) {
				this.anInterface9_2 = this.aClass5_Sub3_8.method6373(Static22.anIntArray691, false, 128, 128);
				this.anInterface9_2.method3270(false, false);
			} else {
				this.anInterface9_2.method3271(0, 128, 128, 0, Static22.anIntArray691, 128);
			}
			return;
		}
		if (Static140.aByteArray40 == null) {
			Static140.aByteArray40 = new byte[16384];
		}
		@Pc(250) byte[] local250 = Static140.aByteArray40;
		for (local119 = -128; local119 < 0; local119++) {
			for (local123 = -128; local123 < 0; local123++) {
				if (local20[local36] == 0) {
					local134 = 0;
					if (local20[local36 - 1] != 0) {
						local134++;
					}
					if (local20[local36 + 1] != 0) {
						local134++;
					}
					if (local20[local36 - local26] != 0) {
						local134++;
					}
					if (local20[local36 + local26] != 0) {
						local134++;
					}
					local250[local49++] = (byte) (local134 * 17);
				} else {
					local250[local49++] = 68;
				}
				local36++;
			}
			local36 += this.aClass211_2.anInt6457 - 128;
		}
		if (this.anInterface9_2 == null) {
			this.anInterface9_2 = this.aClass5_Sub3_8.method6374(Static212.aClass167_7, Static140.aByteArray40, 128, 128, false);
			this.anInterface9_2.method3270(false, false);
		} else {
			this.anInterface9_2.method3274(128, 128, Static212.aClass167_7, Static140.aByteArray40, 128);
		}
	}
}
