import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class4_Sub19 extends Class4 {

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "Lclient!eu;")
	private Interface4 anInterface4_10;

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	public int anInt3261 = 0;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "Lclient!an;")
	private final Class16_Sub1 aClass16_Sub1_2;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "[I")
	private final int[] anIntArray304;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
	public final int anInt3257;

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
	public final int anInt3260;

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
	public final int anInt3268;

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "F")
	public final float aFloat61;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
	public final int anInt3262;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "Lclient!ej;")
	private final Class66_Sub1 aClass66_Sub1_6;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!an;IIIII)V")
	public Class4_Sub19(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass16_Sub1_2 = arg0;
		this.anIntArray304 = new int[this.aClass16_Sub1_2.anInt9839 * this.aClass16_Sub1_2.anInt9838];
		this.anInt3257 = arg1;
		this.anInt3260 = arg4;
		this.anInt3268 = arg5;
		this.aFloat61 = arg2;
		this.anInt3262 = arg3;
		this.aClass66_Sub1_6 = this.aClass16_Sub1_2.aClass66_Sub1_2;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V")
	public void method2991(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass66_Sub1_6.method6900(arg0 * 4, true);
		this.aStream5 = new Stream(this.aNativeHeapBuffer6, 0, arg0 * 4);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)V")
	public void method2992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray304[arg0 + arg1 * this.aClass16_Sub1_2.anInt9838] |= 0x1 << arg2;
		this.anInt3261++;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(FIIII)V")
	public void method2993(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		@Pc(35) int local35;
		if (this.anInt3257 != -1) {
			@Pc(18) Class271 local18 = this.aClass66_Sub1_6.anInterface3_15.method7249(this.anInt3257);
			local23 = local18.aByte82 & 0xFF;
			@Pc(66) int local66;
			if (local23 != 0 && local18.aByte84 != 4) {
				if (arg3 < 0) {
					local35 = 0;
				} else if (arg3 > 127) {
					local35 = 16777215;
				} else {
					local35 = arg3 * 131586;
				}
				if (local23 == 256) {
					arg1 = local35;
				} else {
					local66 = 256 - local23;
					arg1 = (local23 * (local35 & 0xFF00FF) + local66 * (arg1 & 0xFF00FF) & 0xFF00FF00) + ((local35 & 0xFF00) * local23 + (arg1 & 0xFF00) * local66 & 0xFF0000) >> 8;
				}
			}
			local35 = local18.aByte80 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(116) int local116 = local35 * (arg1 >> 16 & 0xFF);
				if (local116 > 65535) {
					local116 = 65535;
				}
				local66 = local35 * (arg1 >> 8 & 0xFF);
				if (local66 > 65535) {
					local66 = 65535;
				}
				@Pc(144) int local144 = local35 * (arg1 & 0xFF);
				if (local144 > 65535) {
					local144 = 65535;
				}
				arg1 = (local144 >> 8) + (local66 & 0xFF00) + (local116 << 8 & 0xFF001B);
			}
		}
		this.aStream5.d(arg2 * 4);
		if (arg0 != 1.0F) {
			@Pc(183) int local183 = arg1 >> 16 & 0xFF;
			local23 = arg1 >> 8 & 0xFF;
			local35 = arg1 & 0xFF;
			local183 = (int) ((float) local183 * arg0);
			local23 = (int) ((float) local23 * arg0);
			if (local183 < 0) {
				local183 = 0;
			} else if (local183 > 255) {
				local183 = 255;
			}
			local35 = (int) ((float) local35 * arg0);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			if (local35 < 0) {
				local35 = 0;
			} else if (local35 > 255) {
				local35 = 255;
			}
			arg1 = local23 << 8 | local183 << 16 | local35;
		}
		if (this.aClass66_Sub1_6.anInt8418 == 0) {
			this.aStream5.f((byte) arg1);
			this.aStream5.f((byte) (arg1 >> 8));
			this.aStream5.f((byte) (arg1 >> 16));
		} else {
			this.aStream5.f((byte) (arg1 >> 16));
			this.aStream5.f((byte) (arg1 >> 8));
			this.aStream5.f((byte) arg1);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II[I)V")
	public void method2995(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(22) Interface8 local22 = this.aClass66_Sub1_6.method6883(this.anInt3261 * 3);
		@Pc(27) Buffer local27 = local22.method7149();
		if (local27 == null) {
			return;
		}
		@Pc(36) Stream local36 = this.aClass66_Sub1_6.method6978(local27);
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 32767;
		@Pc(42) int local42 = -32768;
		@Pc(100) int local100;
		@Pc(58) short[] local58;
		@Pc(52) int local52;
		@Pc(63) int local63;
		@Pc(46) int local46;
		@Pc(72) int local72;
		@Pc(74) int local74;
		@Pc(91) int local91;
		if (Stream.b()) {
			label95: for (local46 = 0; local46 < arg0; local46++) {
				local52 = arg1[local46];
				local63 = this.anIntArray304[local52];
				local58 = this.aClass16_Sub1_2.aShortArrayArray3[local52];
				if (local63 != 0 && local58 != null) {
					local72 = 0;
					local74 = 0;
					while (true) {
						while (true) {
							if (local74 >= local58.length) {
								continue label95;
							}
							if ((0x1 << local72++ & local63) == 0) {
								local74 += 3;
							} else {
								local38++;
								for (local91 = 0; local91 < 3; local91++) {
									local100 = local58[local74++] & 0xFFFF;
									local36.c(local100);
									if (local100 < local40) {
										local40 = local100;
									}
									if (local100 > local42) {
										local42 = local100;
									}
								}
							}
						}
					}
				}
			}
		} else {
			label121: for (local46 = 0; local46 < arg0; local46++) {
				local52 = arg1[local46];
				local58 = this.aClass16_Sub1_2.aShortArrayArray3[local52];
				local63 = this.anIntArray304[local52];
				if (local63 != 0 && local58 != null) {
					local72 = 0;
					local74 = 0;
					while (true) {
						while (true) {
							if (local58.length <= local74) {
								continue label121;
							}
							if ((0x1 << local72++ & local63) == 0) {
								local74 += 3;
							} else {
								for (local91 = 0; local91 < 3; local91++) {
									local100 = local58[local74++] & 0xFFFF;
									if (local100 > local42) {
										local42 = local100;
									}
									local36.e(local100);
									if (local40 > local100) {
										local40 = local100;
									}
								}
								local38++;
							}
						}
					}
				}
			}
		}
		local36.c();
		if (!local22.method7150() || local38 <= 0) {
			return;
		}
		this.aClass66_Sub1_6.method6899((this.aClass16_Sub1_2.anInt295 & 0x8) != 0, this.anInt3257, (this.aClass16_Sub1_2.anInt295 & 0x7) != 0);
		if (this.aClass66_Sub1_6.aBoolean578) {
			this.aClass66_Sub1_6.LA(Integer.MAX_VALUE, this.anInt3262, this.anInt3260, this.anInt3268);
		}
		@Pc(282) Class134_Sub1 local282 = this.aClass66_Sub1_6.method6953();
		local282.method3417(1.0F, 1.0F / this.aFloat61, 1.0F / this.aFloat61);
		this.aClass66_Sub1_6.method6933(Static49.aClass81_4);
		this.aClass66_Sub1_6.method6941(this.anInterface4_10, 1);
		this.aClass66_Sub1_6.method6890(this.aClass16_Sub1_2.aClass321_2);
		this.aClass66_Sub1_6.method6917(local40, Static453.aClass247_5, local22, 0, local42 + 1 - local40, local38);
		this.aClass66_Sub1_6.method6888();
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
	public void method2997(@OriginalArg(1) int arg0) {
		this.aStream5.d(arg0 * 4 + 3);
		this.aStream5.f(-1);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)V")
	public void method2999(@OriginalArg(1) int arg0) {
		this.aStream5.c();
		this.anInterface4_10 = this.aClass66_Sub1_6.method6931(false);
		this.anInterface4_10.method3561(4, arg0 * 4, this.aNativeHeapBuffer6);
		this.aStream5 = null;
		this.aNativeHeapBuffer6 = null;
	}
}
