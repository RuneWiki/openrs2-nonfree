import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class3_Sub33 extends Class3 {

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "Lclient!rv;")
	private Interface22 anInterface22_15;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
	public int anInt6100 = 0;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!eha;")
	private final Class91_Sub1 aClass91_Sub1_3;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "[I")
	private final int[] anIntArray334;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "F")
	public final float aFloat140;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
	public final int anInt6097;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
	public final int anInt6093;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Lclient!rl;")
	private final Class82_Sub3 aClass82_Sub3_14;

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
	public final int anInt6104;

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
	public final int anInt6103;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!eha;IIIII)V")
	public Class3_Sub33(@OriginalArg(0) Class91_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass91_Sub1_3 = arg0;
		this.anIntArray334 = new int[this.aClass91_Sub1_3.anInt8985 * this.aClass91_Sub1_3.anInt8983];
		this.aFloat140 = (float) arg2;
		this.anInt6097 = arg4;
		this.anInt6093 = arg3;
		this.aClass82_Sub3_14 = this.aClass91_Sub1_3.aClass82_Sub3_5;
		this.anInt6104 = arg5;
		this.anInt6103 = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
	public void method5271(@OriginalArg(1) int arg0) {
		this.aStream7.b();
		this.anInterface22_15 = this.aClass82_Sub3_14.method4925(false);
		this.anInterface22_15.method1388(arg0 * 4, 4, this.aNativeHeapBuffer7);
		this.aNativeHeapBuffer7 = null;
		this.aStream7 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(FIIII)V")
	public void method5274(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(19) int local19;
		@Pc(40) int local40;
		if (this.anInt6103 != -1) {
			@Pc(14) Class355 local14 = this.aClass82_Sub3_14.anInterface5_9.method4129(this.anInt6103);
			local19 = local14.aByte121 & 0xFF;
			@Pc(58) int local58;
			if (local19 != 0 && local14.aByte119 != 4) {
				if (arg2 < 0) {
					local40 = 0;
				} else if (arg2 <= 127) {
					local40 = arg2 * 131586;
				} else {
					local40 = 16777215;
				}
				if (local19 == 256) {
					arg1 = local40;
				} else {
					local58 = 256 - local19;
					arg1 = ((local40 & 0xFF00) * local19 + local58 * (arg1 & 0xFF00) & 0xFF0000) + ((arg1 & 0xFF00FF) * local58 + local19 * (local40 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local40 = local14.aByte124 & 0xFF;
			if (local40 != 0) {
				local40 += 256;
				@Pc(111) int local111 = (arg1 >> 16 & 0xFF) * local40;
				if (local111 > 65535) {
					local111 = 65535;
				}
				local58 = local40 * (arg1 >> 8 & 0xFF);
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(139) int local139 = (arg1 & 0xFF) * local40;
				if (local139 > 65535) {
					local139 = 65535;
				}
				arg1 = (local139 >> 8) + (local58 & 0xFF00) + ((local111 & 0xCB00FF00) << 8);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(184) int local184 = arg1 >> 16 & 0xFF;
			local19 = arg1 >> 8 & 0xFF;
			local184 = (int) ((float) local184 * arg0);
			local40 = arg1 & 0xFF;
			local19 = (int) ((float) local19 * arg0);
			if (local184 < 0) {
				local184 = 0;
			} else if (local184 > 255) {
				local184 = 255;
			}
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local40 = (int) ((float) local40 * arg0);
			if (local40 < 0) {
				local40 = 0;
			} else if (local40 > 255) {
				local40 = 255;
			}
			arg1 = local40 | local19 << 8 | local184 << 16;
		}
		this.aStream7.e(arg3 * 4);
		if (this.aClass82_Sub3_14.anInt5858 == 0) {
			this.aStream7.b((byte) arg1);
			this.aStream7.b((byte) (arg1 >> 8));
			this.aStream7.b((byte) (arg1 >> 16));
		} else {
			this.aStream7.b((byte) (arg1 >> 16));
			this.aStream7.b((byte) (arg1 >> 8));
			this.aStream7.b((byte) arg1);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([III)V")
	public void method5275(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Interface12 local18 = this.aClass82_Sub3_14.method5026(this.anInt6100 * 3);
		@Pc(23) Buffer local23 = local18.method7573();
		if (local23 == null) {
			return;
		}
		@Pc(32) Stream local32 = this.aClass82_Sub3_14.method4986(local23);
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 32767;
		@Pc(38) int local38 = -32768;
		@Pc(94) int local94;
		@Pc(54) short[] local54;
		@Pc(48) int local48;
		@Pc(59) int local59;
		@Pc(42) int local42;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(85) int local85;
		if (Stream.c()) {
			label94: for (local42 = 0; local42 < arg1; local42++) {
				local48 = arg0[local42];
				local59 = this.anIntArray334[local48];
				local54 = this.aClass91_Sub1_3.aShortArrayArray3[local48];
				if (local59 != 0 && local54 != null) {
					local65 = 0;
					local67 = 0;
					while (true) {
						while (true) {
							if (local67 >= local54.length) {
								continue label94;
							}
							if ((local59 & 0x1 << local65++) == 0) {
								local67 += 3;
							} else {
								local34++;
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local54[local67++] & 0xFFFF;
									if (local94 < local36) {
										local36 = local94;
									}
									if (local38 < local94) {
										local38 = local94;
									}
									local32.c(local94);
								}
							}
						}
					}
				}
			}
		} else {
			label118: for (local42 = 0; local42 < arg1; local42++) {
				local48 = arg0[local42];
				local54 = this.aClass91_Sub1_3.aShortArrayArray3[local48];
				local59 = this.anIntArray334[local48];
				if (local59 != 0 && local54 != null) {
					local65 = 0;
					local67 = 0;
					while (true) {
						while (true) {
							if (local54.length <= local67) {
								continue label118;
							}
							if ((0x1 << local65++ & local59) == 0) {
								local67 += 3;
							} else {
								local34++;
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local54[local67++] & 0xFFFF;
									local32.f(local94);
									if (local38 < local94) {
										local38 = local94;
									}
									if (local94 < local36) {
										local36 = local94;
									}
								}
							}
						}
					}
				}
			}
		}
		local32.b();
		if (!local18.method7574() || local34 <= 0) {
			return;
		}
		this.aClass82_Sub3_14.method4988((this.aClass91_Sub1_3.anInt2723 & 0x7) != 0, (this.aClass91_Sub1_3.anInt2723 & 0x8) != 0, this.anInt6103);
		if (this.aClass82_Sub3_14.aBoolean409) {
			this.aClass82_Sub3_14.EA(Integer.MAX_VALUE, this.anInt6093, this.anInt6097, this.anInt6104);
		}
		@Pc(273) Class31_Sub2 local273 = this.aClass82_Sub3_14.method4931();
		local273.method7672(1.0F, 1.0F / this.aFloat140, 1.0F / this.aFloat140);
		this.aClass82_Sub3_14.method4974(Static230.aClass193_3);
		this.aClass82_Sub3_14.method4995(1, this.anInterface22_15);
		this.aClass82_Sub3_14.method4960(this.aClass91_Sub1_3.aClass43_1);
		this.aClass82_Sub3_14.method4993(local38 + 1 - local36, local18, Static525.aClass376_6, local34, local36, 0);
		this.aClass82_Sub3_14.method4973();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)V")
	public void method5276(@OriginalArg(0) int arg0) {
		this.aStream7.e(arg0 * 4 + 3);
		this.aStream7.b(-1);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)V")
	public void method5277(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer7 = this.aClass82_Sub3_14.method5004(true, arg0 * 4);
		this.aStream7 = new Stream(this.aNativeHeapBuffer7, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
	public void method5278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray334[arg0 + arg2 * this.aClass91_Sub1_3.anInt8983] |= 0x1 << arg1;
		this.anInt6100++;
	}
}
