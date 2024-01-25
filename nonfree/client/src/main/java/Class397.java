import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class397 {

	@OriginalMember(owner = "client!wea", name = "h", descriptor = "Z")
	public boolean aBoolean926 = true;

	@OriginalMember(owner = "client!wea", name = "k", descriptor = "I")
	private int anInt10796 = -1;

	@OriginalMember(owner = "client!wea", name = "i", descriptor = "Lclient!lb;")
	private final Class145_Sub1 aClass145_Sub1_23;

	@OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
	private final int anInt10790;

	@OriginalMember(owner = "client!wea", name = "p", descriptor = "Lclient!jp;")
	private final Class201 aClass201_2;

	@OriginalMember(owner = "client!wea", name = "n", descriptor = "I")
	private final int anInt10794;

	@OriginalMember(owner = "client!wea", name = "l", descriptor = "I")
	public final int anInt10789;

	@OriginalMember(owner = "client!wea", name = "g", descriptor = "Lclient!de;")
	private Interface4 anInterface4_6;

	@OriginalMember(owner = "client!wea", name = "j", descriptor = "I")
	private int anInt10791;

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
	private int anInt10792;

	@OriginalMember(owner = "client!wea", name = "o", descriptor = "Lclient!lg;")
	private Interface15 anInterface15_7;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lclient!lb;Lclient!jp;Lclient!rj;IIIII)V")
	public Class397(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) Class133_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass145_Sub1_23 = arg0;
		this.anInt10790 = arg6;
		this.aClass201_2 = arg1;
		this.anInt10794 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(52) int local52;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local52 = arg2.anInt9318 * (local35 + local37) + local31;
			for (@Pc(54) int local54 = 0; local54 < local25; local54++) {
				@Pc(62) short[] local62 = arg2.aShortArrayArray5[local52++];
				if (local62 != null) {
					local27 += local62.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt10789 = 0;
			this.anInterface4_6 = null;
		} else {
			this.anInt10791 = Integer.MAX_VALUE;
			this.anInt10792 = Integer.MIN_VALUE;
			this.anInterface15_7 = this.aClass145_Sub1_23.method9776(false);
			this.anInterface15_7.method9224(local27);
			for (local52 = 0; local52 < 4; local52++) {
				@Pc(127) Buffer local127 = this.anInterface15_7.method4689();
				if (local127 != null) {
					@Pc(135) Stream local135 = this.aClass145_Sub1_23.method9844(local127);
					@Pc(139) int local139;
					@Pc(151) int local151;
					@Pc(153) int local153;
					@Pc(161) short[] local161;
					@Pc(165) int local165;
					@Pc(173) int local173;
					if (Stream.b()) {
						for (local139 = 0; local139 < local25; local139++) {
							local151 = local31 + (local139 + local35) * arg2.anInt9318;
							for (local153 = 0; local153 < local25; local153++) {
								local161 = arg2.aShortArrayArray5[local151++];
								if (local161 != null) {
									for (local165 = 0; local165 < local161.length; local165++) {
										local173 = local161[local165] & 0xFFFF;
										if (this.anInt10791 > local173) {
											this.anInt10791 = local173;
										}
										if (this.anInt10792 < local173) {
											this.anInt10792 = local173;
										}
										local135.d(local173);
									}
								}
							}
						}
					} else {
						for (local139 = 0; local139 < local25; local139++) {
							local151 = local31 + arg2.anInt9318 * (local35 + local139);
							for (local153 = 0; local153 < local25; local153++) {
								local161 = arg2.aShortArrayArray5[local151++];
								if (local161 != null) {
									for (local165 = 0; local165 < local161.length; local165++) {
										local173 = local161[local165] & 0xFFFF;
										if (this.anInt10791 > local173) {
											this.anInt10791 = local173;
										}
										if (local173 > this.anInt10792) {
											this.anInt10792 = local173;
										}
										local135.b(local173);
									}
								}
							}
						}
					}
					local135.a();
					if (this.anInterface15_7.method4691()) {
						break;
					}
				}
			}
			this.anInt10789 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V")
	private void method9425() {
		if (!this.aBoolean926) {
			return;
		}
		this.aBoolean926 = false;
		@Pc(17) byte[] local17 = this.aClass201_2.aByteArray67;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = this.aClass201_2.anInt4757;
		@Pc(41) int local41 = this.anInt10790 + this.aClass201_2.anInt4757 * this.anInt10794;
		@Pc(54) int local54;
		for (@Pc(43) int local43 = -128; local43 < 0; local43++) {
			local19 = (local19 << 8) - local19;
			for (local54 = -128; local54 < 0; local54++) {
				if (local17[local41++] != 0) {
					local19++;
				}
			}
			local41 += local23 - 128;
		}
		if (this.anInterface4_6 != null && this.anInt10796 == local19) {
			this.aBoolean926 = false;
			return;
		}
		this.anInt10796 = local19;
		local41 = this.anInt10790 + local23 * this.anInt10794;
		local54 = 0;
		@Pc(139) int local139;
		@Pc(143) int local143;
		@Pc(156) int local156;
		if (!this.aClass145_Sub1_23.method9843(Static408.aClass295_11, Static243.aClass158_10)) {
			if (Static421.anIntArray484 == null) {
				Static421.anIntArray484 = new int[16384];
			}
			@Pc(137) int[] local137 = Static421.anIntArray484;
			for (local139 = -128; local139 < 0; local139++) {
				for (local143 = -128; local143 < 0; local143++) {
					if (local17[local41] == 0) {
						local156 = 0;
						if (local17[local41 - 1] != 0) {
							local156++;
						}
						if (local17[local41 + 1] != 0) {
							local156++;
						}
						if (local17[local41 - local23] != 0) {
							local156++;
						}
						if (local17[local23 + local41] != 0) {
							local156++;
						}
						local137[local54++] = local156 * 17 << 24;
					} else {
						local137[local54++] = 1140850688;
					}
					local41++;
				}
				local41 += this.aClass201_2.anInt4757 - 128;
			}
			if (this.anInterface4_6 == null) {
				this.anInterface4_6 = this.aClass145_Sub1_23.method9753(Static421.anIntArray484, false, 128, 128);
				this.anInterface4_6.method6853(false, false);
			} else {
				this.anInterface4_6.method6855(0, 0, 128, Static421.anIntArray484, 128, 128);
			}
			return;
		}
		if (Static82.aByteArray11 == null) {
			Static82.aByteArray11 = new byte[16384];
		}
		@Pc(282) byte[] local282 = Static82.aByteArray11;
		for (local139 = -128; local139 < 0; local139++) {
			for (local143 = -128; local143 < 0; local143++) {
				if (local17[local41] == 0) {
					local156 = 0;
					if (local17[local41 - 1] != 0) {
						local156++;
					}
					if (local17[local41 + 1] != 0) {
						local156++;
					}
					if (local17[local41 - local23] != 0) {
						local156++;
					}
					if (local17[local41 + local23] != 0) {
						local156++;
					}
					local282[local54++] = (byte) (local156 * 17);
				} else {
					local282[local54++] = 68;
				}
				local41++;
			}
			local41 += this.aClass201_2.anInt4757 - 128;
		}
		if (this.anInterface4_6 == null) {
			this.anInterface4_6 = this.aClass145_Sub1_23.method9841(Static82.aByteArray11, false, 128, 128, Static408.aClass295_11);
			this.anInterface4_6.method6853(false, false);
		} else {
			this.anInterface4_6.method6854(128, Static82.aByteArray11, 128, Static408.aClass295_11, 128);
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(BILclient!lg;)V")
	public void method9426(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
		if (arg0 > 0) {
			this.method9425();
			this.aClass145_Sub1_23.method9754(this.anInterface4_6);
			this.aClass145_Sub1_23.method9778(0, Static601.aClass317_8, arg0, this.anInt10791, this.anInt10792 + 1 - this.anInt10791, arg1);
		}
	}

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)V")
	public void method9427() {
		this.method9426(this.anInt10789, this.anInterface15_7);
	}
}
