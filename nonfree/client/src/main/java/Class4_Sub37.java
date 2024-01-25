import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class4_Sub37 extends Class4 {

	@OriginalMember(owner = "client!oha", name = "k", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!oha", name = "x", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!oha", name = "B", descriptor = "Lclient!oda;")
	private Interface19 anInterface19_12;

	@OriginalMember(owner = "client!oha", name = "r", descriptor = "I")
	public int anInt6815 = 0;

	@OriginalMember(owner = "client!oha", name = "y", descriptor = "Lclient!ll;")
	private final Class42_Sub3 aClass42_Sub3_2;

	@OriginalMember(owner = "client!oha", name = "E", descriptor = "I")
	public final int anInt6823;

	@OriginalMember(owner = "client!oha", name = "t", descriptor = "I")
	public final int anInt6816;

	@OriginalMember(owner = "client!oha", name = "u", descriptor = "I")
	public final int anInt6817;

	@OriginalMember(owner = "client!oha", name = "s", descriptor = "[I")
	private final int[] anIntArray470;

	@OriginalMember(owner = "client!oha", name = "j", descriptor = "Lclient!wg;")
	private final Class33_Sub2 aClass33_Sub2_14;

	@OriginalMember(owner = "client!oha", name = "n", descriptor = "F")
	public final float aFloat160;

	@OriginalMember(owner = "client!oha", name = "m", descriptor = "I")
	public final int anInt6812;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lclient!ll;IIIII)V")
	public Class4_Sub37(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass42_Sub3_2 = arg0;
		this.anInt6823 = arg1;
		this.anInt6816 = arg4;
		this.anInt6817 = arg3;
		this.anIntArray470 = new int[this.aClass42_Sub3_2.anInt8638 * this.aClass42_Sub3_2.anInt8630];
		this.aClass33_Sub2_14 = this.aClass42_Sub3_2.aClass33_Sub2_12;
		this.aFloat160 = (float) arg2;
		this.anInt6812 = arg5;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIII)V")
	public void method5969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray470[arg1 * this.aClass42_Sub3_2.anInt8638 + arg0] |= 0x1 << arg2;
		this.anInt6815++;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)V")
	public void method5971(@OriginalArg(1) int arg0) {
		this.aStream5.c();
		this.anInterface19_12 = this.aClass33_Sub2_14.method8157(false);
		this.anInterface19_12.method6565(this.aNativeHeapBuffer3, arg0 * 4, 4);
		this.aNativeHeapBuffer3 = null;
		this.aStream5 = null;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(ZI)V")
	public void method5972(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer3 = this.aClass33_Sub2_14.method8192(arg0 * 4, true);
		this.aStream5 = new Stream(this.aNativeHeapBuffer3, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I[IB)V")
	public void method5974(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(14) Interface16 local14 = this.aClass33_Sub2_14.method8247(this.anInt6815 * 3);
		@Pc(19) Buffer local19 = local14.method8364();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass33_Sub2_14.method8168(local19);
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 32767;
		@Pc(38) int local38 = -32768;
		@Pc(94) int local94;
		@Pc(54) short[] local54;
		@Pc(48) int local48;
		@Pc(59) int local59;
		@Pc(42) int local42;
		@Pc(68) int local68;
		@Pc(70) int local70;
		@Pc(85) int local85;
		if (Stream.b()) {
			label116: for (local42 = 0; local42 < arg0; local42++) {
				local48 = arg1[local42];
				local54 = this.aClass42_Sub3_2.aShortArrayArray12[local48];
				local59 = this.anIntArray470[local48];
				if (local59 != 0 && local54 != null) {
					local68 = 0;
					local70 = 0;
					while (true) {
						while (true) {
							if (local70 >= local54.length) {
								continue label116;
							}
							if ((0x1 << local68++ & local59) == 0) {
								local70 += 3;
							} else {
								local34++;
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local54[local70++] & 0xFFFF;
									if (local94 > local38) {
										local38 = local94;
									}
									if (local94 < local36) {
										local36 = local94;
									}
									local28.f(local94);
								}
							}
						}
					}
				}
			}
		} else {
			label92: for (local42 = 0; local42 < arg0; local42++) {
				local48 = arg1[local42];
				local54 = this.aClass42_Sub3_2.aShortArrayArray12[local48];
				local59 = this.anIntArray470[local48];
				if (local59 != 0 && local54 != null) {
					local68 = 0;
					local70 = 0;
					while (true) {
						while (true) {
							if (local54.length <= local70) {
								continue label92;
							}
							if ((0x1 << local68++ & local59) == 0) {
								local70 += 3;
							} else {
								local34++;
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local54[local70++] & 0xFFFF;
									local28.d(local94);
									if (local94 > local38) {
										local38 = local94;
									}
									if (local36 > local94) {
										local36 = local94;
									}
								}
							}
						}
					}
				}
			}
		}
		local28.c();
		if (!local14.method8363() || local34 <= 0) {
			return;
		}
		this.aClass33_Sub2_14.method8272((this.aClass42_Sub3_2.anInt5317 & 0x7) != 0, this.anInt6823, (this.aClass42_Sub3_2.anInt5317 & 0x8) != 0);
		if (this.aClass33_Sub2_14.aBoolean734) {
			this.aClass33_Sub2_14.EA(Integer.MAX_VALUE, this.anInt6817, this.anInt6816, this.anInt6812);
		}
		@Pc(280) Class92_Sub1 local280 = this.aClass33_Sub2_14.method8271();
		local280.method2302(1.0F / this.aFloat160, 1.0F, 1.0F / this.aFloat160);
		this.aClass33_Sub2_14.method8286(Static100.aClass331_1);
		this.aClass33_Sub2_14.method8175(this.anInterface19_12, 1);
		this.aClass33_Sub2_14.method8179(this.aClass42_Sub3_2.aClass247_1);
		this.aClass33_Sub2_14.method8279(local14, local38 + 1 - local36, Static83.aClass194_13, 0, local34, local36);
		this.aClass33_Sub2_14.method8201();
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(II)V")
	public void method5975(@OriginalArg(1) int arg0) {
		this.aStream5.b(arg0 * 4 + 3);
		this.aStream5.a(-1);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(FIIII)V")
	public void method5977(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(23) int local23;
		@Pc(36) int local36;
		if (this.anInt6823 != -1) {
			@Pc(18) Class130 local18 = this.aClass33_Sub2_14.anInterface9_12.method1558(this.anInt6823);
			local23 = local18.aByte40 & 0xFF;
			@Pc(63) int local63;
			if (local23 != 0 && local18.aByte39 != 4) {
				if (arg3 < 0) {
					local36 = 0;
				} else if (arg3 > 127) {
					local36 = 16777215;
				} else {
					local36 = arg3 * 131586;
				}
				if (local23 == 256) {
					arg1 = local36;
				} else {
					local63 = 256 - local23;
					arg1 = (local63 * (arg1 & 0xFF00) + local23 * (local36 & 0xFF00) & 0xFF0000) + ((arg1 & 0xFF00FF) * local63 + (local36 & 0xFF00FF) * local23 & 0xFF00FF00) >> 8;
				}
			}
			local36 = local18.aByte38 & 0xFF;
			if (local36 != 0) {
				local36 += 256;
				@Pc(109) int local109 = local36 * (arg1 >> 16 & 0xFF);
				if (local109 > 65535) {
					local109 = 65535;
				}
				local63 = (arg1 >> 8 & 0xFF) * local36;
				if (local63 > 65535) {
					local63 = 65535;
				}
				@Pc(137) int local137 = (arg1 & 0xFF) * local36;
				if (local137 > 65535) {
					local137 = 65535;
				}
				arg1 = (local137 >> 8) + (local63 & 0xFF00) + ((local109 & 0x5F00FF00) << 8);
			}
		}
		this.aStream5.b(arg2 * 4);
		if (arg0 != 1.0F) {
			@Pc(174) int local174 = arg1 >> 16 & 0xFF;
			local23 = arg1 >> 8 & 0xFF;
			local174 = (int) ((float) local174 * arg0);
			local36 = arg1 & 0xFF;
			if (local174 < 0) {
				local174 = 0;
			} else if (local174 > 255) {
				local174 = 255;
			}
			local23 = (int) ((float) local23 * arg0);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			local36 = (int) ((float) local36 * arg0);
			if (local36 < 0) {
				local36 = 0;
			} else if (local36 > 255) {
				local36 = 255;
			}
			arg1 = local36 | local174 << 16 | local23 << 8;
		}
		if (this.aClass33_Sub2_14.anInt9650 == 0) {
			this.aStream5.a((byte) arg1);
			this.aStream5.a((byte) (arg1 >> 8));
			this.aStream5.a((byte) (arg1 >> 16));
		} else {
			this.aStream5.a((byte) (arg1 >> 16));
			this.aStream5.a((byte) (arg1 >> 8));
			this.aStream5.a((byte) arg1);
		}
	}
}
