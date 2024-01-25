import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class6_Sub39 extends Class6 {

	@OriginalMember(owner = "client!nfa", name = "w", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!nfa", name = "r", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!nfa", name = "x", descriptor = "Lclient!bl;")
	private Interface6 anInterface6_11;

	@OriginalMember(owner = "client!nfa", name = "p", descriptor = "I")
	public int anInt6797 = 0;

	@OriginalMember(owner = "client!nfa", name = "B", descriptor = "Lclient!eh;")
	private final Class96_Sub1 aClass96_Sub1_3;

	@OriginalMember(owner = "client!nfa", name = "s", descriptor = "Lclient!jj;")
	private final Class75_Sub1 aClass75_Sub1_18;

	@OriginalMember(owner = "client!nfa", name = "l", descriptor = "I")
	public final int anInt6804;

	@OriginalMember(owner = "client!nfa", name = "k", descriptor = "I")
	public final int anInt6803;

	@OriginalMember(owner = "client!nfa", name = "z", descriptor = "[I")
	private final int[] anIntArray408;

	@OriginalMember(owner = "client!nfa", name = "m", descriptor = "I")
	public final int anInt6809;

	@OriginalMember(owner = "client!nfa", name = "t", descriptor = "I")
	public final int anInt6799;

	@OriginalMember(owner = "client!nfa", name = "C", descriptor = "F")
	public final float aFloat133;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!eh;IIIII)V")
	public Class6_Sub39(@OriginalArg(0) Class96_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass96_Sub1_3 = arg0;
		this.aClass75_Sub1_18 = this.aClass96_Sub1_3.aClass75_Sub1_8;
		this.anInt6804 = arg3;
		this.anInt6803 = arg5;
		this.anIntArray408 = new int[this.aClass96_Sub1_3.anInt9257 * this.aClass96_Sub1_3.anInt9255];
		this.anInt6809 = arg4;
		this.anInt6799 = arg1;
		this.aFloat133 = (float) arg2;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZI)V")
	public void method6041(@OriginalArg(1) int arg0) {
		this.aStream6.a();
		this.anInterface6_11 = this.aClass75_Sub1_18.method6768(false);
		this.anInterface6_11.method3660(this.aNativeHeapBuffer7, 4, arg0 * 4);
		this.aStream6 = null;
		this.aNativeHeapBuffer7 = null;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "([III)V")
	public void method6042(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Interface25 local14 = this.aClass75_Sub1_18.method6852(this.anInt6797 * 3);
		@Pc(19) Buffer local19 = local14.method8677();
		if (local19 == null) {
			return;
		}
		@Pc(29) Stream local29 = this.aClass75_Sub1_18.method6788(local19);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 32767;
		@Pc(40) int local40 = -32768;
		@Pc(102) int local102;
		@Pc(61) short[] local61;
		@Pc(50) int local50;
		@Pc(55) int local55;
		@Pc(44) int local44;
		@Pc(69) int local69;
		@Pc(71) int local71;
		@Pc(93) int local93;
		if (Stream.b()) {
			label92: for (local44 = 0; local44 < arg1; local44++) {
				local50 = arg0[local44];
				local61 = this.aClass96_Sub1_3.aShortArrayArray5[local50];
				local55 = this.anIntArray408[local50];
				if (local55 != 0 && local61 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local61.length <= local71) {
								continue label92;
							}
							if ((0x1 << local69++ & local55) == 0) {
								local71 += 3;
							} else {
								local36++;
								for (local93 = 0; local93 < 3; local93++) {
									local102 = local61[local71++] & 0xFFFF;
									local29.b(local102);
									if (local102 > local40) {
										local40 = local102;
									}
									if (local38 > local102) {
										local38 = local102;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label116: for (local44 = 0; local44 < arg1; local44++) {
				local50 = arg0[local44];
				local55 = this.anIntArray408[local50];
				local61 = this.aClass96_Sub1_3.aShortArrayArray5[local50];
				if (local55 != 0 && local61 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local71 >= local61.length) {
								continue label116;
							}
							if ((0x1 << local69++ & local55) == 0) {
								local71 += 3;
							} else {
								local36++;
								for (local93 = 0; local93 < 3; local93++) {
									local102 = local61[local71++] & 0xFFFF;
									if (local102 < local38) {
										local38 = local102;
									}
									if (local102 > local40) {
										local40 = local102;
									}
									local29.a(local102);
								}
							}
						}
					}
				}
			}
		}
		local29.a();
		if (!local14.method8676() || local36 <= 0) {
			return;
		}
		this.aClass75_Sub1_18.method6809((this.aClass96_Sub1_3.anInt2585 & 0x8) != 0, (this.aClass96_Sub1_3.anInt2585 & 0x7) != 0, this.anInt6799);
		if (this.aClass75_Sub1_18.aBoolean556) {
			this.aClass75_Sub1_18.EA(Integer.MAX_VALUE, this.anInt6804, this.anInt6809, this.anInt6803);
		}
		@Pc(315) Class109_Sub3 local315 = this.aClass75_Sub1_18.method6775();
		local315.method4355(1.0F / this.aFloat133, 1.0F, 1.0F / this.aFloat133);
		this.aClass75_Sub1_18.method6787(Static82.aClass211_2);
		this.aClass75_Sub1_18.method6827(this.anInterface6_11, 1);
		this.aClass75_Sub1_18.method6753(this.aClass96_Sub1_3.aClass207_15);
		this.aClass75_Sub1_18.method6746(Static118.aClass51_4, local38, local40 + 1 - local38, local14, 0, local36);
		this.aClass75_Sub1_18.method6744();
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)V")
	public void method6043(@OriginalArg(1) int arg0) {
		this.aStream6.d(arg0 * 4 + 3);
		this.aStream6.c(-1);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIB)V")
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray408[this.aClass96_Sub1_3.anInt9255 * arg2 + arg1] |= 0x1 << arg0;
		this.anInt6797++;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IB)V")
	public void method6045(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer7 = this.aClass75_Sub1_18.method6822(true, arg0 * 4);
		this.aStream6 = new Stream(this.aNativeHeapBuffer7, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIBF)V")
	public void method6046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3) {
		@Pc(23) int local23;
		@Pc(39) int local39;
		if (this.anInt6799 != -1) {
			@Pc(18) Class297 local18 = this.aClass75_Sub1_18.anInterface11_10.method6027(this.anInt6799);
			local23 = local18.aByte118 & 0xFF;
			@Pc(68) int local68;
			if (local23 != 0 && local18.aByte124 != 4) {
				if (arg0 < 0) {
					local39 = 0;
				} else if (arg0 <= 127) {
					local39 = arg0 * 131586;
				} else {
					local39 = 16777215;
				}
				if (local23 == 256) {
					arg1 = local39;
				} else {
					local68 = 256 - local23;
					arg1 = ((local39 & 0xFF00FF) * local23 + local68 * (arg1 & 0xFF00FF) & 0xFF00FF00) + ((arg1 & 0xFF00) * local68 + local23 * (local39 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local39 = local18.aByte123 & 0xFF;
			if (local39 != 0) {
				local39 += 256;
				@Pc(115) int local115 = (arg1 >> 16 & 0xFF) * local39;
				if (local115 > 65535) {
					local115 = 65535;
				}
				local68 = (arg1 >> 8 & 0xFF) * local39;
				if (local68 > 65535) {
					local68 = 65535;
				}
				@Pc(141) int local141 = (arg1 & 0xFF) * local39;
				if (local141 > 65535) {
					local141 = 65535;
				}
				arg1 = (local141 >> 8) + (local68 & 0xFF00) + ((local115 & 0x8F00FF00) << 8);
			}
		}
		this.aStream6.d(arg2 * 4);
		if (arg3 != 1.0F) {
			@Pc(178) int local178 = arg1 >> 16 & 0xFF;
			local23 = arg1 >> 8 & 0xFF;
			local178 = (int) ((float) local178 * arg3);
			local39 = arg1 & 0xFF;
			local23 = (int) ((float) local23 * arg3);
			if (local178 < 0) {
				local178 = 0;
			} else if (local178 > 255) {
				local178 = 255;
			}
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			local39 = (int) ((float) local39 * arg3);
			if (local39 < 0) {
				local39 = 0;
			} else if (local39 > 255) {
				local39 = 255;
			}
			arg1 = local39 | local178 << 16 | local23 << 8;
		}
		if (this.aClass75_Sub1_18.anInt7674 == 0) {
			this.aStream6.c((byte) arg1);
			this.aStream6.c((byte) (arg1 >> 8));
			this.aStream6.c((byte) (arg1 >> 16));
		} else {
			this.aStream6.c((byte) (arg1 >> 16));
			this.aStream6.c((byte) (arg1 >> 8));
			this.aStream6.c((byte) arg1);
		}
	}
}
