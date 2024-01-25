import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "Lclient!ql;")
	private Interface15 anInterface15_8;

	@OriginalMember(owner = "client!md", name = "D", descriptor = "I")
	public int anInt5743 = 0;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Lclient!ih;")
	private final Class10_Sub2 aClass10_Sub2_3;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "I")
	public final int anInt5737;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "I")
	public final int anInt5740;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "I")
	public final int anInt5731;

	@OriginalMember(owner = "client!md", name = "y", descriptor = "Lclient!cb;")
	private final Class9_Sub1 aClass9_Sub1_11;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "[I")
	private final int[] anIntArray406;

	@OriginalMember(owner = "client!md", name = "C", descriptor = "I")
	public final int anInt5742;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "F")
	public final float aFloat110;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!ih;IIIII)V")
	public Class1_Sub31(@OriginalArg(0) Class10_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass10_Sub2_3 = arg0;
		this.anInt5737 = arg1;
		this.anInt5740 = arg4;
		this.anInt5731 = arg3;
		this.aClass9_Sub1_11 = this.aClass10_Sub2_3.aClass9_Sub1_6;
		this.anIntArray406 = new int[this.aClass10_Sub2_3.anInt7409 * this.aClass10_Sub2_3.anInt7412];
		this.anInt5742 = arg5;
		this.aFloat110 = arg2;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(II)V")
	public void method4969(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass9_Sub1_11.method7714(true, arg0 * 4);
		this.aStream6 = new Stream(this.aNativeHeapBuffer6, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBI)V")
	public void method4970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray406[arg0 + arg2 * this.aClass10_Sub2_3.anInt7412] |= 0x1 << arg1;
		this.anInt5743++;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V")
	public void method4971(@OriginalArg(0) int arg0) {
		this.aStream6.d(arg0 * 4 + 3);
		this.aStream6.b(-1);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIFII)V")
	public void method4973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		@Pc(35) int local35;
		if (this.anInt5737 != -1) {
			@Pc(14) Class175 local14 = this.aClass9_Sub1_11.anInterface8_13.method7085(this.anInt5737);
			local19 = local14.aByte59 & 0xFF;
			@Pc(60) int local60;
			if (local19 != 0 && local14.aByte54 != 4) {
				if (arg1 < 0) {
					local35 = 0;
				} else if (arg1 > 127) {
					local35 = 16777215;
				} else {
					local35 = arg1 * 131586;
				}
				if (local19 == 256) {
					arg3 = local35;
				} else {
					local60 = 256 - local19;
					arg3 = (local19 * (local35 & 0xFF00FF) + local60 * (arg3 & 0xFF00FF) & 0xFF00FF00) + ((arg3 & 0xFF00) * local60 + (local35 & 0xFF00) * local19 & 0xFF0000) >> 8;
				}
			}
			local35 = local14.aByte58 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(107) int local107 = local35 * (arg3 >> 16 & 0xFF);
				if (local107 > 65535) {
					local107 = 65535;
				}
				local60 = local35 * (arg3 >> 8 & 0xFF);
				if (local60 > 65535) {
					local60 = 65535;
				}
				@Pc(131) int local131 = local35 * (arg3 & 0xFF);
				if (local131 > 65535) {
					local131 = 65535;
				}
				arg3 = (local60 & 0xFF00) + ((local107 & 0x7300FF00) << 8) + (local131 >> 8);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(170) int local170 = arg3 >> 16 & 0xFF;
			local19 = arg3 >> 8 & 0xFF;
			local35 = arg3 & 0xFF;
			local170 = (int) ((float) local170 * arg2);
			local19 = (int) ((float) local19 * arg2);
			if (local170 < 0) {
				local170 = 0;
			} else if (local170 > 255) {
				local170 = 255;
			}
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local35 = (int) ((float) local35 * arg2);
			if (local35 < 0) {
				local35 = 0;
			} else if (local35 > 255) {
				local35 = 255;
			}
			arg3 = local35 | local19 << 8 | local170 << 16;
		}
		this.aStream6.d(arg0 * 4);
		if (this.aClass9_Sub1_11.anInt9206 == 0) {
			this.aStream6.b((byte) arg3);
			this.aStream6.b((byte) (arg3 >> 8));
			this.aStream6.b((byte) (arg3 >> 16));
		} else {
			this.aStream6.b((byte) (arg3 >> 16));
			this.aStream6.b((byte) (arg3 >> 8));
			this.aStream6.b((byte) arg3);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)V")
	public void method4974(@OriginalArg(0) int arg0) {
		this.aStream6.b();
		this.anInterface15_8 = this.aClass9_Sub1_11.method7707(false);
		this.anInterface15_8.method6274(4, arg0 * 4, this.aNativeHeapBuffer6);
		this.aStream6 = null;
		this.aNativeHeapBuffer6 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II[I)V")
	public void method4975(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(14) Interface1 local14 = this.aClass9_Sub1_11.method7769(this.anInt5743 * 3);
		@Pc(19) Buffer local19 = local14.method7519();
		if (local19 == null) {
			return;
		}
		@Pc(28) Stream local28 = this.aClass9_Sub1_11.method7677(local19);
		@Pc(30) int local30 = 0;
		@Pc(39) int local39 = 32767;
		@Pc(41) int local41 = -32768;
		@Pc(93) int local93;
		@Pc(57) short[] local57;
		@Pc(51) int local51;
		@Pc(62) int local62;
		@Pc(45) int local45;
		@Pc(68) int local68;
		@Pc(70) int local70;
		@Pc(84) int local84;
		if (Stream.c()) {
			label95: for (local45 = 0; local45 < arg0; local45++) {
				local51 = arg1[local45];
				local62 = this.anIntArray406[local51];
				local57 = this.aClass10_Sub2_3.aShortArrayArray4[local51];
				if (local62 != 0 && local57 != null) {
					local68 = 0;
					local70 = 0;
					while (true) {
						while (true) {
							if (local70 >= local57.length) {
								continue label95;
							}
							if ((local62 & 0x1 << local68++) == 0) {
								local70 += 3;
							} else {
								local30++;
								for (local84 = 0; local84 < 3; local84++) {
									local93 = local57[local70++] & 0xFFFF;
									if (local93 > local41) {
										local41 = local93;
									}
									local28.c(local93);
									if (local39 > local93) {
										local39 = local93;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label121: for (local45 = 0; local45 < arg0; local45++) {
				local51 = arg1[local45];
				local57 = this.aClass10_Sub2_3.aShortArrayArray4[local51];
				local62 = this.anIntArray406[local51];
				if (local62 != 0 && local57 != null) {
					local68 = 0;
					local70 = 0;
					while (true) {
						while (true) {
							if (local57.length <= local70) {
								continue label121;
							}
							if ((0x1 << local68++ & local62) == 0) {
								local70 += 3;
							} else {
								for (local84 = 0; local84 < 3; local84++) {
									local93 = local57[local70++] & 0xFFFF;
									local28.f(local93);
									if (local93 > local41) {
										local41 = local93;
									}
									if (local93 < local39) {
										local39 = local93;
									}
								}
								local30++;
							}
						}
					}
				}
			}
		}
		local28.b();
		if (!local14.method7521() || local30 <= 0) {
			return;
		}
		this.aClass9_Sub1_11.method7732((this.aClass10_Sub2_3.anInt4315 & 0x8) != 0, this.anInt5737, (this.aClass10_Sub2_3.anInt4315 & 0x7) != 0);
		if (this.aClass9_Sub1_11.aBoolean626) {
			this.aClass9_Sub1_11.JA(Integer.MAX_VALUE, this.anInt5731, this.anInt5740, this.anInt5742);
		}
		@Pc(268) Class22_Sub3 local268 = this.aClass9_Sub1_11.method7733();
		local268.method5966(1.0F, 1.0F / this.aFloat110, 1.0F / this.aFloat110);
		this.aClass9_Sub1_11.method7703(Static152.aClass171_3);
		this.aClass9_Sub1_11.method7697(this.anInterface15_8, 1);
		this.aClass9_Sub1_11.method7664(this.aClass10_Sub2_3.aClass265_13);
		this.aClass9_Sub1_11.method7658(Static29.aClass102_1, local39, 0, local41 + 1 - local39, local30, local14);
		this.aClass9_Sub1_11.method7744();
	}
}
