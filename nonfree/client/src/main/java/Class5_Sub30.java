import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kja")
public final class Class5_Sub30 extends Class5 {

	@OriginalMember(owner = "client!kja", name = "q", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!kja", name = "p", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!kja", name = "w", descriptor = "Lclient!sfa;")
	private Interface25 anInterface25_9;

	@OriginalMember(owner = "client!kja", name = "t", descriptor = "I")
	public int anInt5559 = 0;

	@OriginalMember(owner = "client!kja", name = "v", descriptor = "Lclient!im;")
	private final Class22_Sub2 aClass22_Sub2_1;

	@OriginalMember(owner = "client!kja", name = "o", descriptor = "I")
	public final int anInt5547;

	@OriginalMember(owner = "client!kja", name = "s", descriptor = "I")
	public final int anInt5558;

	@OriginalMember(owner = "client!kja", name = "r", descriptor = "F")
	public final float aFloat85;

	@OriginalMember(owner = "client!kja", name = "D", descriptor = "Lclient!kd;")
	private final Class57_Sub3 aClass57_Sub3_13;

	@OriginalMember(owner = "client!kja", name = "F", descriptor = "I")
	public final int anInt5553;

	@OriginalMember(owner = "client!kja", name = "C", descriptor = "[I")
	private final int[] anIntArray309;

	@OriginalMember(owner = "client!kja", name = "B", descriptor = "I")
	public final int anInt5561;

	@OriginalMember(owner = "client!kja", name = "<init>", descriptor = "(Lclient!im;IIIII)V")
	public Class5_Sub30(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass22_Sub2_1 = arg0;
		this.anInt5547 = arg1;
		this.anInt5558 = arg4;
		this.aFloat85 = (float) arg2;
		this.aClass57_Sub3_13 = this.aClass22_Sub2_1.aClass57_Sub3_10;
		this.anInt5553 = arg3;
		this.anIntArray309 = new int[this.aClass22_Sub2_1.anInt9376 * this.aClass22_Sub2_1.anInt9375];
		this.anInt5561 = arg5;
	}

	@OriginalMember(owner = "client!kja", name = "b", descriptor = "(IB)V")
	public void method4759(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass57_Sub3_13.method7740(true, arg0 * 4);
		this.aStream3 = new Stream(this.aNativeHeapBuffer6, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(II)V")
	public void method4760(@OriginalArg(0) int arg0) {
		this.aStream3.c();
		this.anInterface25_9 = this.aClass57_Sub3_13.method7784(false);
		this.anInterface25_9.method2906(4, arg0 * 4, this.aNativeHeapBuffer6);
		this.aNativeHeapBuffer6 = null;
		this.aStream3 = null;
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(IIBI)V")
	public void method4762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray309[arg2 * this.aClass22_Sub2_1.anInt9376 + arg0] |= 0x1 << arg1;
		this.anInt5559++;
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(IB)V")
	public void method4763(@OriginalArg(0) int arg0) {
		this.aStream3.b(arg0 * 4 + 3);
		this.aStream3.a(-1);
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(IIIFB)V")
	public void method4764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(18) int local18;
		@Pc(37) int local37;
		if (this.anInt5547 != -1) {
			@Pc(13) Class233 local13 = this.aClass57_Sub3_13.anInterface1_11.method2863(this.anInt5547);
			local18 = local13.aByte97 & 0xFF;
			@Pc(64) int local64;
			if (local18 != 0 && local13.aByte94 != 4) {
				if (arg1 < 0) {
					local37 = 0;
				} else if (arg1 > 127) {
					local37 = 16777215;
				} else {
					local37 = arg1 * 131586;
				}
				if (local18 == 256) {
					arg2 = local37;
				} else {
					local64 = 256 - local18;
					arg2 = ((arg2 & 0xFF00FF) * local64 + (local37 & 0xFF00FF) * local18 & 0xFF00FF00) + (local18 * (local37 & 0xFF00) + (local64 * (arg2 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local37 = local13.aByte98 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(116) int local116 = local37 * (arg2 >> 16 & 0xFF);
				if (local116 > 65535) {
					local116 = 65535;
				}
				local64 = (arg2 >> 8 & 0xFF) * local37;
				if (local64 > 65535) {
					local64 = 65535;
				}
				@Pc(140) int local140 = local37 * (arg2 & 0xFF);
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg2 = (local140 >> 8) + (local64 & 0xFF00) + ((local116 & 0x9200FF00) << 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(175) int local175 = arg2 >> 16 & 0xFF;
			local18 = arg2 >> 8 & 0xFF;
			local37 = arg2 & 0xFF;
			local175 = (int) ((float) local175 * arg3);
			local18 = (int) ((float) local18 * arg3);
			if (local175 < 0) {
				local175 = 0;
			} else if (local175 > 255) {
				local175 = 255;
			}
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local37 = (int) ((float) local37 * arg3);
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg2 = local37 | local18 << 8 | local175 << 16;
		}
		this.aStream3.b(arg0 * 4);
		if (this.aClass57_Sub3_13.anInt9165 == 0) {
			this.aStream3.a((byte) arg2);
			this.aStream3.a((byte) (arg2 >> 8));
			this.aStream3.a((byte) (arg2 >> 16));
		} else {
			this.aStream3.a((byte) (arg2 >> 16));
			this.aStream3.a((byte) (arg2 >> 8));
			this.aStream3.a((byte) arg2);
		}
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(IB[I)V")
	public void method4766(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(19) Interface9 local19 = this.aClass57_Sub3_13.method7773(this.anInt5559 * 3);
		@Pc(24) Buffer local24 = local19.method2926();
		if (local24 == null) {
			return;
		}
		@Pc(34) Stream local34 = this.aClass57_Sub3_13.method7826(local24);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 32767;
		@Pc(40) int local40 = -32768;
		@Pc(94) int local94;
		@Pc(56) short[] local56;
		@Pc(50) int local50;
		@Pc(61) int local61;
		@Pc(44) int local44;
		@Pc(69) int local69;
		@Pc(71) int local71;
		@Pc(85) int local85;
		if (Stream.b()) {
			label95: for (local44 = 0; local44 < arg0; local44++) {
				local50 = arg1[local44];
				local56 = this.aClass22_Sub2_1.aShortArrayArray5[local50];
				local61 = this.anIntArray309[local50];
				if (local61 != 0 && local56 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local71 >= local56.length) {
								continue label95;
							}
							if ((local61 & 0x1 << local69++) == 0) {
								local71 += 3;
							} else {
								local36++;
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local56[local71++] & 0xFFFF;
									if (local94 > local40) {
										local40 = local94;
									}
									local34.d(local94);
									if (local94 < local38) {
										local38 = local94;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label120: for (local44 = 0; local44 < arg0; local44++) {
				local50 = arg1[local44];
				local56 = this.aClass22_Sub2_1.aShortArrayArray5[local50];
				local61 = this.anIntArray309[local50];
				if (local61 != 0 && local56 != null) {
					local69 = 0;
					local71 = 0;
					while (true) {
						while (true) {
							if (local56.length <= local71) {
								continue label120;
							}
							if ((0x1 << local69++ & local61) == 0) {
								local71 += 3;
							} else {
								local36++;
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local56[local71++] & 0xFFFF;
									local34.c(local94);
									if (local38 > local94) {
										local38 = local94;
									}
									if (local40 < local94) {
										local40 = local94;
									}
								}
							}
						}
					}
				}
			}
		}
		local34.c();
		if (!local19.method2927() || local36 <= 0) {
			return;
		}
		this.aClass57_Sub3_13.method7827((this.aClass22_Sub2_1.anInt4470 & 0x8) != 0, this.anInt5547, (this.aClass22_Sub2_1.anInt4470 & 0x7) != 0);
		if (this.aClass57_Sub3_13.aBoolean695) {
			this.aClass57_Sub3_13.EA(Integer.MAX_VALUE, this.anInt5553, this.anInt5558, this.anInt5561);
		}
		@Pc(306) Class203_Sub1 local306 = this.aClass57_Sub3_13.method7829();
		local306.method4834(1.0F / this.aFloat85, 1.0F, 1.0F / this.aFloat85);
		this.aClass57_Sub3_13.method7822(Static169.aClass357_3);
		this.aClass57_Sub3_13.method7807(1, this.anInterface25_9);
		this.aClass57_Sub3_13.method7745(this.aClass22_Sub2_1.aClass147_1);
		this.aClass57_Sub3_13.method7814(local40 + 1 - local38, local19, local38, 0, Static175.aClass85_1, local36);
		this.aClass57_Sub3_13.method7850();
	}
}
