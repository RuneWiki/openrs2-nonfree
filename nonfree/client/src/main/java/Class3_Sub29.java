import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class3_Sub29 extends Class3 {

	@OriginalMember(owner = "client!hda", name = "Q", descriptor = "Lclient!id;")
	private Interface15 anInterface15_6;

	@OriginalMember(owner = "client!hda", name = "R", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!hda", name = "T", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!hda", name = "K", descriptor = "I")
	public int anInt4145 = 0;

	@OriginalMember(owner = "client!hda", name = "o", descriptor = "Lclient!ew;")
	private final Class21_Sub3 aClass21_Sub3_1;

	@OriginalMember(owner = "client!hda", name = "s", descriptor = "I")
	public final int anInt4137;

	@OriginalMember(owner = "client!hda", name = "B", descriptor = "[I")
	private final int[] anIntArray371;

	@OriginalMember(owner = "client!hda", name = "y", descriptor = "I")
	public final int anInt4140;

	@OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
	public final int anInt4135;

	@OriginalMember(owner = "client!hda", name = "I", descriptor = "Lclient!ai;")
	private final Class13_Sub1 aClass13_Sub1_9;

	@OriginalMember(owner = "client!hda", name = "u", descriptor = "F")
	public final float aFloat90;

	@OriginalMember(owner = "client!hda", name = "N", descriptor = "I")
	public final int anInt4147;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!ew;IIIII)V")
	public Class3_Sub29(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass21_Sub3_1 = arg0;
		this.anInt4137 = arg1;
		this.anIntArray371 = new int[this.aClass21_Sub3_1.anInt9128 * this.aClass21_Sub3_1.anInt9129];
		this.anInt4140 = arg3;
		this.anInt4135 = arg5;
		this.aClass13_Sub1_9 = this.aClass21_Sub3_1.aClass13_Sub1_8;
		this.aFloat90 = (float) arg2;
		this.anInt4147 = arg4;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I[II)V")
	public void method3769(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Interface20 local19 = this.aClass13_Sub1_9.method7492(this.anInt4145 * 3);
		@Pc(24) Buffer local24 = local19.method7828();
		if (local24 == null) {
			return;
		}
		@Pc(33) Stream local33 = this.aClass13_Sub1_9.method7409(local24);
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 32767;
		@Pc(39) int local39 = -32768;
		@Pc(94) int local94;
		@Pc(60) short[] local60;
		@Pc(49) int local49;
		@Pc(54) int local54;
		@Pc(43) int local43;
		@Pc(69) int local69;
		@Pc(71) int local71;
		@Pc(85) int local85;
		if (Stream.c()) {
			label93: for (local43 = 0; local43 < arg1; local43++) {
				local49 = arg0[local43];
				local54 = this.anIntArray371[local49];
				local60 = this.aClass21_Sub3_1.aShortArrayArray13[local49];
				if (local54 != 0 && local60 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local71 >= local60.length) {
								continue label93;
							}
							if ((local54 & 0x1 << local69++) == 0) {
								local71 += 3;
							} else {
								local35++;
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local60[local71++] & 0xFFFF;
									local33.b(local94);
									if (local94 < local37) {
										local37 = local94;
									}
									if (local94 > local39) {
										local39 = local94;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label119: for (local43 = 0; local43 < arg1; local43++) {
				local49 = arg0[local43];
				local54 = this.anIntArray371[local49];
				local60 = this.aClass21_Sub3_1.aShortArrayArray13[local49];
				if (local54 != 0 && local60 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local71 >= local60.length) {
								continue label119;
							}
							if ((local54 & 0x1 << local69++) == 0) {
								local71 += 3;
							} else {
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local60[local71++] & 0xFFFF;
									if (local94 > local39) {
										local39 = local94;
									}
									if (local94 < local37) {
										local37 = local94;
									}
									local33.c(local94);
								}
								local35++;
							}
						}
					}
				}
			}
		}
		local33.a();
		if (!local19.method7826() || local35 <= 0) {
			return;
		}
		this.aClass13_Sub1_9.method7508((this.aClass21_Sub3_1.anInt2981 & 0x8) != 0, this.anInt4137, (this.aClass21_Sub3_1.anInt2981 & 0x7) != 0);
		if (this.aClass13_Sub1_9.aBoolean648) {
			this.aClass13_Sub1_9.EA(Integer.MAX_VALUE, this.anInt4140, this.anInt4147, this.anInt4135);
		}
		@Pc(265) Class239_Sub3 local265 = this.aClass13_Sub1_9.method7512();
		local265.method9260(1.0F / this.aFloat90, 1.0F, 1.0F / this.aFloat90);
		this.aClass13_Sub1_9.method7464(Static178.aClass94_4);
		this.aClass13_Sub1_9.method7423(this.anInterface15_6, 1);
		this.aClass13_Sub1_9.method7472(this.aClass21_Sub3_1.aClass233_8);
		this.aClass13_Sub1_9.method7424(local35, 0, local19, local37, local39 + 1 - local37, Static413.aClass393_4);
		this.aClass13_Sub1_9.method7510();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)V")
	public void method3772(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass13_Sub1_9.method7466(true, arg0 * 4);
		this.aStream2 = new Stream(this.aNativeHeapBuffer4, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(II)V")
	public void method3773(@OriginalArg(1) int arg0) {
		this.aStream2.a();
		this.anInterface15_6 = this.aClass13_Sub1_9.method7541(false);
		this.anInterface15_6.method8745(arg0 * 4, 4, this.aNativeHeapBuffer4);
		this.aStream2 = null;
		this.aNativeHeapBuffer4 = null;
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(II)V")
	public void method3774(@OriginalArg(1) int arg0) {
		this.aStream2.e(arg0 * 4 + 3);
		this.aStream2.a(-1);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIII)V")
	public void method3775(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray371[arg2 + arg0 * this.aClass21_Sub3_1.anInt9129] |= 0x1 << arg1;
		this.anInt4145++;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(FIIII)V")
	public void method3777(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(39) int local39;
		if (this.anInt4137 != -1) {
			@Pc(17) Class119 local17 = this.aClass13_Sub1_9.anInterface4_14.method4673(this.anInt4137);
			local22 = local17.aByte55 & 0xFF;
			@Pc(58) int local58;
			if (local22 != 0 && local17.aByte54 != 4) {
				if (arg1 < 0) {
					local39 = 0;
				} else if (arg1 <= 127) {
					local39 = arg1 * 131586;
				} else {
					local39 = 16777215;
				}
				if (local22 == 256) {
					arg2 = local39;
				} else {
					local58 = 256 - local22;
					arg2 = (local58 * (arg2 & 0xFF00FF) + (local39 & 0xFF00FF) * local22 & 0xFF00FF00) + (local58 * (arg2 & 0xFF00) + (local39 & 0xFF00) * local22 & 0xFF0000) >> 8;
				}
			}
			local39 = local17.aByte53 & 0xFF;
			if (local39 != 0) {
				local39 += 256;
				@Pc(108) int local108 = (arg2 >> 16 & 0xFF) * local39;
				if (local108 > 65535) {
					local108 = 65535;
				}
				local58 = local39 * (arg2 >> 8 & 0xFF);
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(132) int local132 = (arg2 & 0xFF) * local39;
				if (local132 > 65535) {
					local132 = 65535;
				}
				arg2 = (local132 >> 8) + (local58 & 0xFF00) + ((local108 & 0x7200FF00) << 8);
			}
		}
		this.aStream2.e(arg3 * 4);
		if (arg0 != 1.0F) {
			@Pc(167) int local167 = arg2 >> 16 & 0xFF;
			local22 = arg2 >> 8 & 0xFF;
			local39 = arg2 & 0xFF;
			local167 = (int) ((float) local167 * arg0);
			if (local167 < 0) {
				local167 = 0;
			} else if (local167 > 255) {
				local167 = 255;
			}
			local22 = (int) ((float) local22 * arg0);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			local39 = (int) ((float) local39 * arg0);
			if (local39 < 0) {
				local39 = 0;
			} else if (local39 > 255) {
				local39 = 255;
			}
			arg2 = local39 | local22 << 8 | local167 << 16;
		}
		if (this.aClass13_Sub1_9.anInt8623 == 0) {
			this.aStream2.a((byte) arg2);
			this.aStream2.a((byte) (arg2 >> 8));
			this.aStream2.a((byte) (arg2 >> 16));
		} else {
			this.aStream2.a((byte) (arg2 >> 16));
			this.aStream2.a((byte) (arg2 >> 8));
			this.aStream2.a((byte) arg2);
		}
	}
}
