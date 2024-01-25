import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class2_Sub49 extends Class2 {

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!uo", name = "A", descriptor = "Lclient!lk;")
	private Interface16 anInterface16_18;

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "I")
	public int anInt9455 = 0;

	@OriginalMember(owner = "client!uo", name = "r", descriptor = "Lclient!sba;")
	private final Class76_Sub3 aClass76_Sub3_3;

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
	public final int anInt9450;

	@OriginalMember(owner = "client!uo", name = "w", descriptor = "[I")
	private final int[] anIntArray646;

	@OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
	public final int anInt9456;

	@OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
	public final int anInt9458;

	@OriginalMember(owner = "client!uo", name = "D", descriptor = "Lclient!pga;")
	private final Class95_Sub3 aClass95_Sub3_21;

	@OriginalMember(owner = "client!uo", name = "E", descriptor = "I")
	public final int anInt9462;

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "F")
	public final float aFloat213;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!sba;IIIII)V")
	public Class2_Sub49(@OriginalArg(0) Class76_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass76_Sub3_3 = arg0;
		this.anInt9450 = arg4;
		this.anIntArray646 = new int[this.aClass76_Sub3_3.anInt8791 * this.aClass76_Sub3_3.anInt8794];
		this.anInt9456 = arg1;
		this.anInt9458 = arg5;
		this.aClass95_Sub3_21 = this.aClass76_Sub3_3.aClass95_Sub3_20;
		this.anInt9462 = arg3;
		this.aFloat213 = arg2;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
	public void method7920(@OriginalArg(0) int arg0) {
		this.aStream7.c();
		this.anInterface16_18 = this.aClass95_Sub3_21.method7122(false);
		this.anInterface16_18.method7460(this.aNativeHeapBuffer8, 4, arg0 * 4);
		this.aStream7 = null;
		this.aNativeHeapBuffer8 = null;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([III)V")
	public void method7921(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Interface10 local21 = this.aClass95_Sub3_21.method7075(this.anInt9455 * 3);
		@Pc(26) Buffer local26 = local21.method7385();
		if (local26 == null) {
			return;
		}
		@Pc(35) Stream local35 = this.aClass95_Sub3_21.method7086(local26);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 32767;
		@Pc(41) int local41 = -32768;
		@Pc(94) int local94;
		@Pc(62) short[] local62;
		@Pc(51) int local51;
		@Pc(56) int local56;
		@Pc(45) int local45;
		@Pc(68) int local68;
		@Pc(70) int local70;
		@Pc(85) int local85;
		if (Stream.a()) {
			label121: for (local45 = 0; local45 < arg1; local45++) {
				local51 = arg0[local45];
				local56 = this.anIntArray646[local51];
				local62 = this.aClass76_Sub3_3.aShortArrayArray26[local51];
				if (local56 != 0 && local62 != null) {
					local68 = 0;
					local70 = 0;
					while (true) {
						while (true) {
							if (local70 >= local62.length) {
								continue label121;
							}
							if ((0x1 << local68++ & local56) == 0) {
								local70 += 3;
							} else {
								local37++;
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local62[local70++] & 0xFFFF;
									if (local39 > local94) {
										local39 = local94;
									}
									local35.e(local94);
									if (local94 > local41) {
										local41 = local94;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label96: for (local45 = 0; local45 < arg1; local45++) {
				local51 = arg0[local45];
				local56 = this.anIntArray646[local51];
				local62 = this.aClass76_Sub3_3.aShortArrayArray26[local51];
				if (local56 != 0 && local62 != null) {
					local68 = 0;
					local70 = 0;
					while (true) {
						while (true) {
							if (local70 >= local62.length) {
								continue label96;
							}
							if ((local56 & 0x1 << local68++) == 0) {
								local70 += 3;
							} else {
								for (local85 = 0; local85 < 3; local85++) {
									local94 = local62[local70++] & 0xFFFF;
									local35.b(local94);
									if (local41 < local94) {
										local41 = local94;
									}
									if (local94 < local39) {
										local39 = local94;
									}
								}
								local37++;
							}
						}
					}
				}
			}
		}
		local35.c();
		if (!local21.method7384() || local37 <= 0) {
			return;
		}
		this.aClass95_Sub3_21.method7148((this.aClass76_Sub3_3.anInt8499 & 0x7) != 0, (this.aClass76_Sub3_3.anInt8499 & 0x8) != 0, this.anInt9456);
		if (this.aClass95_Sub3_21.aBoolean630) {
			this.aClass95_Sub3_21.EA(Integer.MAX_VALUE, this.anInt9462, this.anInt9450, this.anInt9458);
		}
		@Pc(275) Class177_Sub1 local275 = this.aClass95_Sub3_21.method7017();
		local275.method3840(1.0F / this.aFloat213, 1.0F, 1.0F / this.aFloat213);
		this.aClass95_Sub3_21.method7099(Static409.aClass85_3);
		this.aClass95_Sub3_21.method7054(1, this.anInterface16_18);
		this.aClass95_Sub3_21.method7059(this.aClass76_Sub3_3.aClass72_23);
		this.aClass95_Sub3_21.method7060(Static286.aClass30_3, 0, local39, local41 + 1 - local39, local21, local37);
		this.aClass95_Sub3_21.method7105();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIBI)V")
	public void method7922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray646[arg2 + this.aClass76_Sub3_3.anInt8791 * arg1] |= 0x1 << arg0;
		this.anInt9455++;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BI)V")
	public void method7923(@OriginalArg(1) int arg0) {
		this.aStream7.f(arg0 * 4 + 3);
		this.aStream7.a(-1);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIBFI)V")
	public void method7924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(29) int local29;
		@Pc(48) int local48;
		if (this.anInt9456 != -1) {
			@Pc(24) Class175 local24 = this.aClass95_Sub3_21.anInterface6_27.method1492(this.anInt9456);
			local29 = local24.aByte51 & 0xFF;
			@Pc(68) int local68;
			if (local29 != 0 && local24.aByte52 != 4) {
				if (arg1 < 0) {
					local48 = 0;
				} else if (arg1 > 127) {
					local48 = 16777215;
				} else {
					local48 = arg1 * 131586;
				}
				if (local29 == 256) {
					arg0 = local48;
				} else {
					local68 = 256 - local29;
					arg0 = (local29 * (local48 & 0xFF00FF) + local68 * (arg0 & 0xFF00FF) & 0xFF00FF00) + (local68 * (arg0 & 0xFF00) + (local48 & 0xFF00) * local29 & 0xFF0000) >> 8;
				}
			}
			local48 = local24.aByte57 & 0xFF;
			if (local48 != 0) {
				local48 += 256;
				@Pc(120) int local120 = (arg0 >> 16 & 0xFF) * local48;
				if (local120 > 65535) {
					local120 = 65535;
				}
				local68 = (arg0 >> 8 & 0xFF) * local48;
				if (local68 > 65535) {
					local68 = 65535;
				}
				@Pc(146) int local146 = (arg0 & 0xFF) * local48;
				if (local146 > 65535) {
					local146 = 65535;
				}
				arg0 = (local146 >> 8) + (local68 & 0xFF00) + ((local120 & 0x2F00FF00) << 8);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(175) int local175 = arg0 >> 16 & 0xFF;
			local29 = arg0 >> 8 & 0xFF;
			local48 = arg0 & 0xFF;
			local175 = (int) ((float) local175 * arg2);
			if (local175 < 0) {
				local175 = 0;
			} else if (local175 > 255) {
				local175 = 255;
			}
			local29 = (int) ((float) local29 * arg2);
			if (local29 < 0) {
				local29 = 0;
			} else if (local29 > 255) {
				local29 = 255;
			}
			local48 = (int) ((float) local48 * arg2);
			if (local48 < 0) {
				local48 = 0;
			} else if (local48 > 255) {
				local48 = 255;
			}
			arg0 = local29 << 8 | local175 << 16 | local48;
		}
		this.aStream7.f(arg3 * 4);
		if (this.aClass95_Sub3_21.anInt8380 == 0) {
			this.aStream7.a((byte) arg0);
			this.aStream7.a((byte) (arg0 >> 8));
			this.aStream7.a((byte) (arg0 >> 16));
		} else {
			this.aStream7.a((byte) (arg0 >> 16));
			this.aStream7.a((byte) (arg0 >> 8));
			this.aStream7.a((byte) arg0);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V")
	public void method7925(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer8 = this.aClass95_Sub3_21.method7097(arg0 * 4, true);
		this.aStream7 = new Stream(this.aNativeHeapBuffer8, 0, arg0 * 4);
	}
}
