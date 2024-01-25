import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class6_Sub41 extends Class6 {

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "Lclient!fw;")
	private Interface12 anInterface12_10;

	@OriginalMember(owner = "client!nk", name = "y", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
	public int anInt6678 = 0;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "Lclient!aga;")
	private final Class12_Sub1 aClass12_Sub1_3;

	@OriginalMember(owner = "client!nk", name = "A", descriptor = "I")
	public final int anInt6679;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "F")
	public final float aFloat78;

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
	public final int anInt6676;

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
	public final int anInt6674;

	@OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
	public final int anInt6677;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "[I")
	private final int[] anIntArray421;

	@OriginalMember(owner = "client!nk", name = "x", descriptor = "Lclient!lba;")
	private final Class132_Sub1 aClass132_Sub1_18;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!aga;IIIII)V")
	public Class6_Sub41(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass12_Sub1_3 = arg0;
		this.anInt6679 = arg3;
		this.aFloat78 = (float) arg2;
		this.anInt6676 = arg5;
		this.anInt6674 = arg1;
		this.anInt6677 = arg4;
		this.anIntArray421 = new int[this.aClass12_Sub1_3.anInt9314 * this.aClass12_Sub1_3.anInt9313];
		this.aClass132_Sub1_18 = this.aClass12_Sub1_3.aClass132_Sub1_1;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)V")
	public void method5721(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass132_Sub1_18.method7524(true, arg0 * 4);
		this.aStream5 = new Stream(this.aNativeHeapBuffer5, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
	public void method5722(@OriginalArg(0) int arg0) {
		this.aStream5.a(arg0 * 4 + 3);
		this.aStream5.d(-1);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)V")
	public void method5723(@OriginalArg(1) int arg0) {
		this.aStream5.c();
		this.anInterface12_10 = this.aClass132_Sub1_18.method7564(false);
		this.anInterface12_10.method8890(4, this.aNativeHeapBuffer5, arg0 * 4);
		this.aStream5 = null;
		this.aNativeHeapBuffer5 = null;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)V")
	public void method5724(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray421[arg1 + arg2 * this.aClass12_Sub1_3.anInt9314] |= 0x1 << arg0;
		this.anInt6678++;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "([III)V")
	public void method5725(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface21 local14 = this.aClass132_Sub1_18.method7606(this.anInt6678 * 3);
		@Pc(19) Buffer local19 = local14.method5806();
		if (local19 == null) {
			return;
		}
		@Pc(30) Stream local30 = this.aClass132_Sub1_18.method7592(local19);
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = 32767;
		@Pc(37) int local37 = -32768;
		@Pc(92) int local92;
		@Pc(58) short[] local58;
		@Pc(47) int local47;
		@Pc(52) int local52;
		@Pc(41) int local41;
		@Pc(64) int local64;
		@Pc(66) int local66;
		@Pc(83) int local83;
		if (Stream.b()) {
			label96: for (local41 = 0; local41 < arg1; local41++) {
				local47 = arg0[local41];
				local58 = this.aClass12_Sub1_3.aShortArrayArray1[local47];
				local52 = this.anIntArray421[local47];
				if (local52 != 0 && local58 != null) {
					local64 = 0;
					local66 = 0;
					while (true) {
						while (true) {
							if (local58.length <= local66) {
								continue label96;
							}
							if ((local52 & 0x1 << local64++) == 0) {
								local66 += 3;
							} else {
								for (local83 = 0; local83 < 3; local83++) {
									local92 = local58[local66++] & 0xFFFF;
									local30.b(local92);
									if (local92 > local37) {
										local37 = local92;
									}
									if (local92 < local35) {
										local35 = local92;
									}
								}
								local32++;
							}
						}
					}
				}
			}
		} else {
			label122: for (local41 = 0; local41 < arg1; local41++) {
				local47 = arg0[local41];
				local52 = this.anIntArray421[local47];
				local58 = this.aClass12_Sub1_3.aShortArrayArray1[local47];
				if (local52 != 0 && local58 != null) {
					local64 = 0;
					local66 = 0;
					while (true) {
						while (true) {
							if (local66 >= local58.length) {
								continue label122;
							}
							if ((0x1 << local64++ & local52) == 0) {
								local66 += 3;
							} else {
								for (local83 = 0; local83 < 3; local83++) {
									local92 = local58[local66++] & 0xFFFF;
									if (local35 > local92) {
										local35 = local92;
									}
									local30.c(local92);
									if (local37 < local92) {
										local37 = local92;
									}
								}
								local32++;
							}
						}
					}
				}
			}
		}
		local30.c();
		if (!local14.method5808() || local32 <= 0) {
			return;
		}
		this.aClass132_Sub1_18.method7610((this.aClass12_Sub1_3.anInt420 & 0x8) != 0, (this.aClass12_Sub1_3.anInt420 & 0x7) != 0, this.anInt6674);
		if (this.aClass132_Sub1_18.aBoolean629) {
			this.aClass132_Sub1_18.EA(Integer.MAX_VALUE, this.anInt6679, this.anInt6677, this.anInt6676);
		}
		@Pc(273) Class207_Sub3 local273 = this.aClass132_Sub1_18.method7613();
		local273.method8239(1.0F / this.aFloat78, 1.0F / this.aFloat78, 1.0F);
		this.aClass132_Sub1_18.method7618(Static87.aClass257_2);
		this.aClass132_Sub1_18.method7529(this.anInterface12_10, 1);
		this.aClass132_Sub1_18.method7628(this.aClass12_Sub1_3.aClass34_1);
		this.aClass132_Sub1_18.method7573(0, Static122.aClass60_1, local14, local32, local35, local37 + 1 - local35);
		this.aClass132_Sub1_18.method7520();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIFI)V")
	public void method5726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(23) int local23;
		@Pc(43) int local43;
		if (this.anInt6674 != -1) {
			@Pc(18) Class294 local18 = this.aClass132_Sub1_18.anInterface6_11.method7088(this.anInt6674);
			local23 = local18.aByte118 & 0xFF;
			@Pc(66) int local66;
			if (local23 != 0 && local18.aByte120 != 4) {
				if (arg1 < 0) {
					local43 = 0;
				} else if (arg1 <= 127) {
					local43 = arg1 * 131586;
				} else {
					local43 = 16777215;
				}
				if (local23 == 256) {
					arg2 = local43;
				} else {
					local66 = 256 - local23;
					arg2 = ((local43 & 0xFF00FF) * local23 + local66 * (arg2 & 0xFF00FF) & 0xFF00FF00) + (local23 * (local43 & 0xFF00) + local66 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local43 = local18.aByte116 & 0xFF;
			if (local43 != 0) {
				local43 += 256;
				@Pc(113) int local113 = (arg2 >> 16 & 0xFF) * local43;
				if (local113 > 65535) {
					local113 = 65535;
				}
				local66 = (arg2 >> 8 & 0xFF) * local43;
				if (local66 > 65535) {
					local66 = 65535;
				}
				@Pc(137) int local137 = local43 * (arg2 & 0xFF);
				if (local137 > 65535) {
					local137 = 65535;
				}
				arg2 = (local137 >> 8) + ((local113 & 0x2C00FF00) << 8) + (local66 & 0xFF00);
			}
		}
		this.aStream5.a(arg0 * 4);
		if (arg3 != 1.0F) {
			@Pc(173) int local173 = arg2 >> 16 & 0xFF;
			local23 = arg2 >> 8 & 0xFF;
			local43 = arg2 & 0xFF;
			local173 = (int) ((float) local173 * arg3);
			if (local173 < 0) {
				local173 = 0;
			} else if (local173 > 255) {
				local173 = 255;
			}
			local23 = (int) ((float) local23 * arg3);
			local43 = (int) ((float) local43 * arg3);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			if (local43 < 0) {
				local43 = 0;
			} else if (local43 > 255) {
				local43 = 255;
			}
			arg2 = local43 | local23 << 8 | local173 << 16;
		}
		if (this.aClass132_Sub1_18.anInt8981 == 0) {
			this.aStream5.d((byte) arg2);
			this.aStream5.d((byte) (arg2 >> 8));
			this.aStream5.d((byte) (arg2 >> 16));
		} else {
			this.aStream5.d((byte) (arg2 >> 16));
			this.aStream5.d((byte) (arg2 >> 8));
			this.aStream5.d((byte) arg2);
		}
	}
}
