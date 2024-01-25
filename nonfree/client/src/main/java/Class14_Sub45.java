import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class14_Sub45 extends Class14 {

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "Lclient!hl;")
	private Interface10 anInterface10_12;

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
	public int anInt8260 = 0;

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "Lclient!mf;")
	private final Class51_Sub2 aClass51_Sub2_2;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "Lclient!pj;")
	private final Class137_Sub1 aClass137_Sub1_14;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
	public final int anInt8256;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "[I")
	private final int[] anIntArray625;

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
	public final int anInt8258;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
	public final int anInt8254;

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
	public final int anInt8255;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "F")
	public final float aFloat189;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!mf;IIIII)V")
	public Class14_Sub45(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass51_Sub2_2 = arg0;
		this.aClass137_Sub1_14 = this.aClass51_Sub2_2.aClass137_Sub1_9;
		this.anInt8256 = arg5;
		this.anIntArray625 = new int[this.aClass51_Sub2_2.anInt9512 * this.aClass51_Sub2_2.anInt9511];
		this.anInt8258 = arg1;
		this.anInt8254 = arg4;
		this.anInt8255 = arg3;
		this.aFloat189 = (float) arg2;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)V")
	public void method6870(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray625[arg0 + arg1 * this.aClass51_Sub2_2.anInt9511] |= 0x1 << arg2;
		this.anInt8260++;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([III)V")
	public void method6871(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface4 local14 = this.aClass137_Sub1_14.method8005(this.anInt8260 * 3);
		@Pc(19) Buffer local19 = local14.method5680();
		if (local19 == null) {
			return;
		}
		@Pc(30) Stream local30 = this.aClass137_Sub1_14.method8079(local19);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 32767;
		@Pc(36) int local36 = -32768;
		@Pc(89) int local89;
		@Pc(57) short[] local57;
		@Pc(46) int local46;
		@Pc(51) int local51;
		@Pc(40) int local40;
		@Pc(63) int local63;
		@Pc(65) int local65;
		@Pc(80) int local80;
		if (Stream.c()) {
			label121: for (local40 = 0; local40 < arg1; local40++) {
				local46 = arg0[local40];
				local51 = this.anIntArray625[local46];
				local57 = this.aClass51_Sub2_2.aShortArrayArray15[local46];
				if (local51 != 0 && local57 != null) {
					local63 = 0;
					local65 = 0;
					while (true) {
						while (true) {
							if (local65 >= local57.length) {
								continue label121;
							}
							if ((0x1 << local63++ & local51) == 0) {
								local65 += 3;
							} else {
								local32++;
								for (local80 = 0; local80 < 3; local80++) {
									local89 = local57[local65++] & 0xFFFF;
									local30.a(local89);
									if (local89 < local34) {
										local34 = local89;
									}
									if (local36 < local89) {
										local36 = local89;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label96: for (local40 = 0; local40 < arg1; local40++) {
				local46 = arg0[local40];
				local57 = this.aClass51_Sub2_2.aShortArrayArray15[local46];
				local51 = this.anIntArray625[local46];
				if (local51 != 0 && local57 != null) {
					local63 = 0;
					local65 = 0;
					while (true) {
						while (true) {
							if (local57.length <= local65) {
								continue label96;
							}
							if ((local51 & 0x1 << local63++) == 0) {
								local65 += 3;
							} else {
								for (local80 = 0; local80 < 3; local80++) {
									local89 = local57[local65++] & 0xFFFF;
									if (local89 > local36) {
										local36 = local89;
									}
									local30.e(local89);
									if (local89 < local34) {
										local34 = local89;
									}
								}
								local32++;
							}
						}
					}
				}
			}
		}
		local30.b();
		if (!local14.method5682() || local32 <= 0) {
			return;
		}
		this.aClass137_Sub1_14.method7962((this.aClass51_Sub2_2.anInt6747 & 0x7) != 0, this.anInt8258, (this.aClass51_Sub2_2.anInt6747 & 0x8) != 0);
		if (this.aClass137_Sub1_14.aBoolean669) {
			this.aClass137_Sub1_14.EA(Integer.MAX_VALUE, this.anInt8255, this.anInt8254, this.anInt8256);
		}
		@Pc(269) Class26_Sub1 local269 = this.aClass137_Sub1_14.method8050();
		local269.method790(1.0F / this.aFloat189, 1.0F / this.aFloat189, 1.0F);
		this.aClass137_Sub1_14.method8041(Static658.aClass70_6);
		this.aClass137_Sub1_14.method8067(1, this.anInterface10_12);
		this.aClass137_Sub1_14.method8000(this.aClass51_Sub2_2.aClass201_16);
		this.aClass137_Sub1_14.method7980(local32, local14, local34, 0, local36 + 1 - local34, Static620.aClass54_6);
		this.aClass137_Sub1_14.method8071();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IFIII)V")
	public void method6874(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(28) int local28;
		if (this.anInt8258 != -1) {
			@Pc(13) Class224 local13 = this.aClass137_Sub1_14.anInterface3_11.method6177(this.anInt8258);
			local18 = local13.aByte100 & 0xFF;
			@Pc(55) int local55;
			if (local18 != 0 && local13.aByte96 != 4) {
				if (arg2 < 0) {
					local28 = 0;
				} else if (arg2 <= 127) {
					local28 = arg2 * 131586;
				} else {
					local28 = 16777215;
				}
				if (local18 == 256) {
					arg3 = local28;
				} else {
					local55 = 256 - local18;
					arg3 = ((local28 & 0xFF00) * local18 + local55 * (arg3 & 0xFF00) & 0xFF0000) + ((local28 & 0xFF00FF) * local18 + (arg3 & 0xFF00FF) * local55 & 0xFF00FF00) >> 8;
				}
			}
			local28 = local13.aByte99 & 0xFF;
			if (local28 != 0) {
				local28 += 256;
				@Pc(109) int local109 = (arg3 >> 16 & 0xFF) * local28;
				if (local109 > 65535) {
					local109 = 65535;
				}
				local55 = (arg3 >> 8 & 0xFF) * local28;
				if (local55 > 65535) {
					local55 = 65535;
				}
				@Pc(137) int local137 = local28 * (arg3 & 0xFF);
				if (local137 > 65535) {
					local137 = 65535;
				}
				arg3 = (local55 & 0xFF00) + (local109 << 8 & 0xFF0017) + (local137 >> 8);
			}
		}
		if (arg1 != 1.0F) {
			@Pc(170) int local170 = arg3 >> 16 & 0xFF;
			local18 = arg3 >> 8 & 0xFF;
			local28 = arg3 & 0xFF;
			local170 = (int) ((float) local170 * arg1);
			local18 = (int) ((float) local18 * arg1);
			if (local170 < 0) {
				local170 = 0;
			} else if (local170 > 255) {
				local170 = 255;
			}
			local28 = (int) ((float) local28 * arg1);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			if (local28 < 0) {
				local28 = 0;
			} else if (local28 > 255) {
				local28 = 255;
			}
			arg3 = local170 << 16 | local18 << 8 | local28;
		}
		this.aStream6.b(arg0 * 4);
		if (this.aClass137_Sub1_14.anInt9724 == 0) {
			this.aStream6.f((byte) arg3);
			this.aStream6.f((byte) (arg3 >> 8));
			this.aStream6.f((byte) (arg3 >> 16));
		} else {
			this.aStream6.f((byte) (arg3 >> 16));
			this.aStream6.f((byte) (arg3 >> 8));
			this.aStream6.f((byte) arg3);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)V")
	public void method6877(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer7 = this.aClass137_Sub1_14.method8043(true, arg0 * 4);
		this.aStream6 = new Stream(this.aNativeHeapBuffer7, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)V")
	public void method6878(@OriginalArg(1) int arg0) {
		this.aStream6.b(arg0 * 4 + 3);
		this.aStream6.f(-1);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V")
	public void method6879(@OriginalArg(0) int arg0) {
		this.aStream6.b();
		this.anInterface10_12 = this.aClass137_Sub1_14.method7963(false);
		this.anInterface10_12.method3993(4, this.aNativeHeapBuffer7, arg0 * 4);
		this.aStream6 = null;
		this.aNativeHeapBuffer7 = null;
	}
}
