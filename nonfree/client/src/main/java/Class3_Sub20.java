import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!gca", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!gca", name = "z", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!gca", name = "A", descriptor = "Lclient!og;")
	private Interface15 anInterface15_5;

	@OriginalMember(owner = "client!gca", name = "K", descriptor = "I")
	public int anInt3715 = 0;

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "Lclient!hm;")
	private final Class127_Sub1 aClass127_Sub1_1;

	@OriginalMember(owner = "client!gca", name = "L", descriptor = "I")
	public final int anInt3716;

	@OriginalMember(owner = "client!gca", name = "D", descriptor = "F")
	public final float aFloat105;

	@OriginalMember(owner = "client!gca", name = "w", descriptor = "I")
	public final int anInt3708;

	@OriginalMember(owner = "client!gca", name = "v", descriptor = "Lclient!rr;")
	private final Class31_Sub1 aClass31_Sub1_5;

	@OriginalMember(owner = "client!gca", name = "s", descriptor = "I")
	public final int anInt3706;

	@OriginalMember(owner = "client!gca", name = "B", descriptor = "[I")
	private final int[] anIntArray151;

	@OriginalMember(owner = "client!gca", name = "I", descriptor = "I")
	public final int anInt3714;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!hm;IIIII)V")
	public Class3_Sub20(@OriginalArg(0) Class127_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass127_Sub1_1 = arg0;
		this.anInt3716 = arg5;
		this.aFloat105 = arg2;
		this.anInt3708 = arg4;
		this.aClass31_Sub1_5 = this.aClass127_Sub1_1.aClass31_Sub1_7;
		this.anInt3706 = arg3;
		this.anIntArray151 = new int[this.aClass127_Sub1_1.anInt10007 * this.aClass127_Sub1_1.anInt10004];
		this.anInt3714 = arg1;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIZI)V")
	public void method3003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray151[arg1 * this.aClass127_Sub1_1.anInt10004 + arg2] |= 0x1 << arg0;
		this.anInt3715++;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BI)V")
	public void method3004(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass31_Sub1_5.method7150(true, arg0 * 4);
		this.aStream3 = new Stream(this.aNativeHeapBuffer4, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(BI)V")
	public void method3005(@OriginalArg(1) int arg0) {
		this.aStream3.a(arg0 * 4 + 3);
		this.aStream3.f(-1);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIF)V")
	public void method3006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (this.anInt3714 != -1) {
			@Pc(15) Class172 local15 = this.aClass31_Sub1_5.anInterface4_14.method7229(this.anInt3714);
			local20 = local15.aByte61 & 0xFF;
			@Pc(58) int local58;
			if (local20 != 0 && local15.aByte62 != 4) {
				if (arg2 < 0) {
					local38 = 0;
				} else if (arg2 <= 127) {
					local38 = arg2 * 131586;
				} else {
					local38 = 16777215;
				}
				if (local20 == 256) {
					arg0 = local38;
				} else {
					local58 = 256 - local20;
					arg0 = ((local38 & 0xFF00FF) * local20 + (arg0 & 0xFF00FF) * local58 & 0xFF00FF00) + ((arg0 & 0xFF00) * local58 + local20 * (local38 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local38 = local15.aByte58 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(110) int local110 = local38 * (arg0 >> 16 & 0xFF);
				if (local110 > 65535) {
					local110 = 65535;
				}
				local58 = local38 * (arg0 >> 8 & 0xFF);
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(136) int local136 = local38 * (arg0 & 0xFF);
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg0 = (local136 >> 8) + (local58 & 0xFF00) + (local110 << 8 & 0xFF0023);
			}
		}
		this.aStream3.a(arg1 * 4);
		if (arg3 != 1.0F) {
			@Pc(181) int local181 = arg0 >> 16 & 0xFF;
			local20 = arg0 >> 8 & 0xFF;
			local38 = arg0 & 0xFF;
			local181 = (int) ((float) local181 * arg3);
			local20 = (int) ((float) local20 * arg3);
			if (local181 < 0) {
				local181 = 0;
			} else if (local181 > 255) {
				local181 = 255;
			}
			local38 = (int) ((float) local38 * arg3);
			if (local20 < 0) {
				local20 = 0;
			} else if (local20 > 255) {
				local20 = 255;
			}
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			arg0 = local20 << 8 | local181 << 16 | local38;
		}
		if (this.aClass31_Sub1_5.anInt9122 == 0) {
			this.aStream3.f((byte) arg0);
			this.aStream3.f((byte) (arg0 >> 8));
			this.aStream3.f((byte) (arg0 >> 16));
		} else {
			this.aStream3.f((byte) (arg0 >> 16));
			this.aStream3.f((byte) (arg0 >> 8));
			this.aStream3.f((byte) arg0);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)V")
	public void method3007(@OriginalArg(0) int arg0) {
		this.aStream3.c();
		this.anInterface15_5 = this.aClass31_Sub1_5.method7132(false);
		this.anInterface15_5.method5278(this.aNativeHeapBuffer4, 4, arg0 * 4);
		this.aStream3 = null;
		this.aNativeHeapBuffer4 = null;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I[II)V")
	public void method3010(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface2 local14 = this.aClass31_Sub1_5.method7119(this.anInt3715 * 3);
		@Pc(19) Buffer local19 = local14.method7292();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass31_Sub1_5.method7154(local19);
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 32767;
		@Pc(40) int local40 = -32768;
		@Pc(90) int local90;
		@Pc(61) short[] local61;
		@Pc(50) int local50;
		@Pc(55) int local55;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(69) int local69;
		@Pc(81) int local81;
		if (Stream.a()) {
			label96: for (local44 = 0; local44 < arg1; local44++) {
				local50 = arg0[local44];
				local55 = this.anIntArray151[local50];
				local61 = this.aClass127_Sub1_1.aShortArrayArray4[local50];
				if (local55 != 0 && local61 != null) {
					local67 = 0;
					local69 = 0;
					while (true) {
						while (true) {
							if (local61.length <= local69) {
								continue label96;
							}
							if ((0x1 << local67++ & local55) == 0) {
								local69 += 3;
							} else {
								for (local81 = 0; local81 < 3; local81++) {
									local90 = local61[local69++] & 0xFFFF;
									local28.e(local90);
									if (local40 < local90) {
										local40 = local90;
									}
									if (local32 > local90) {
										local32 = local90;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		} else {
			label121: for (local44 = 0; local44 < arg1; local44++) {
				local50 = arg0[local44];
				local55 = this.anIntArray151[local50];
				local61 = this.aClass127_Sub1_1.aShortArrayArray4[local50];
				if (local55 != 0 && local61 != null) {
					local67 = 0;
					local69 = 0;
					while (true) {
						while (true) {
							if (local69 >= local61.length) {
								continue label121;
							}
							if ((0x1 << local67++ & local55) == 0) {
								local69 += 3;
							} else {
								local30++;
								for (local81 = 0; local81 < 3; local81++) {
									local90 = local61[local69++] & 0xFFFF;
									if (local90 < local32) {
										local32 = local90;
									}
									if (local90 > local40) {
										local40 = local90;
									}
									local28.c(local90);
								}
							}
						}
					}
				}
			}
		}
		local28.c();
		if (!local14.method7291() || local30 <= 0) {
			return;
		}
		this.aClass31_Sub1_5.method7088((this.aClass127_Sub1_1.anInt4304 & 0x8) != 0, this.anInt3714, (this.aClass127_Sub1_1.anInt4304 & 0x7) != 0);
		if (this.aClass31_Sub1_5.aBoolean600) {
			this.aClass31_Sub1_5.YA(Integer.MAX_VALUE, this.anInt3706, this.anInt3708, this.anInt3716);
		}
		@Pc(264) Class42_Sub3 local264 = this.aClass31_Sub1_5.method7146();
		local264.method7532(1.0F / this.aFloat105, 1.0F / this.aFloat105, 1.0F);
		this.aClass31_Sub1_5.method7161(Static130.aClass51_15);
		this.aClass31_Sub1_5.method7113(this.anInterface15_5, 1);
		this.aClass31_Sub1_5.method7149(this.aClass127_Sub1_1.aClass1_13);
		this.aClass31_Sub1_5.method7174(Static486.aClass265_10, local40 + 1 - local32, local14, 0, local30, local32);
		this.aClass31_Sub1_5.method7120();
	}
}
