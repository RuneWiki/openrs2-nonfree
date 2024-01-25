import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class6_Sub20 extends Class6 {

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "Lclient!ii;")
	private Interface13 anInterface13_7;

	@OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
	public int anInt3203 = 0;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "Lclient!iq;")
	private final Class59_Sub2 aClass59_Sub2_1;

	@OriginalMember(owner = "client!fr", name = "C", descriptor = "Lclient!kea;")
	private final Class14_Sub2 aClass14_Sub2_5;

	@OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
	public final int anInt3196;

	@OriginalMember(owner = "client!fr", name = "x", descriptor = "F")
	public final float aFloat65;

	@OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
	public final int anInt3204;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "[I")
	private final int[] anIntArray194;

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
	public final int anInt3192;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
	public final int anInt3191;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!iq;IIIII)V")
	public Class6_Sub20(@OriginalArg(0) Class59_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass59_Sub2_1 = arg0;
		this.aClass14_Sub2_5 = this.aClass59_Sub2_1.aClass14_Sub2_6;
		this.anInt3196 = arg1;
		this.aFloat65 = arg2;
		this.anInt3204 = arg5;
		this.anIntArray194 = new int[this.aClass59_Sub2_1.anInt9640 * this.aClass59_Sub2_1.anInt9639];
		this.anInt3192 = arg4;
		this.anInt3191 = arg3;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IZ)V")
	public void method2819(@OriginalArg(0) int arg0) {
		this.aStream3.c();
		this.anInterface13_7 = this.aClass14_Sub2_5.method7004(false);
		this.anInterface13_7.method1883(this.aNativeHeapBuffer5, 4, arg0 * 4);
		this.aStream3 = null;
		this.aNativeHeapBuffer5 = null;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "([IBI)V")
	public void method2821(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Interface23 local14 = this.aClass14_Sub2_5.method6945(this.anInt3203 * 3);
		@Pc(19) Buffer local19 = local14.method4095();
		if (local19 == null) {
			return;
		}
		@Pc(36) Stream local36 = this.aClass14_Sub2_5.method6939(local19);
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 32767;
		@Pc(42) int local42 = -32768;
		@Pc(97) int local97;
		@Pc(63) short[] local63;
		@Pc(52) int local52;
		@Pc(57) int local57;
		@Pc(46) int local46;
		@Pc(72) int local72;
		@Pc(74) int local74;
		@Pc(88) int local88;
		if (Stream.b()) {
			label122: for (local46 = 0; local46 < arg1; local46++) {
				local52 = arg0[local46];
				local57 = this.anIntArray194[local52];
				local63 = this.aClass59_Sub2_1.aShortArrayArray7[local52];
				if (local57 != 0 && local63 != null) {
					local72 = 0;
					local74 = 0;
					while (true) {
						while (true) {
							if (local74 >= local63.length) {
								continue label122;
							}
							if ((0x1 << local72++ & local57) == 0) {
								local74 += 3;
							} else {
								for (local88 = 0; local88 < 3; local88++) {
									local97 = local63[local74++] & 0xFFFF;
									local36.c(local97);
									if (local42 < local97) {
										local42 = local97;
									}
									if (local40 > local97) {
										local40 = local97;
									}
								}
								local38++;
							}
						}
					}
				}
			}
		} else {
			label96: for (local46 = 0; local46 < arg1; local46++) {
				local52 = arg0[local46];
				local63 = this.aClass59_Sub2_1.aShortArrayArray7[local52];
				local57 = this.anIntArray194[local52];
				if (local57 != 0 && local63 != null) {
					local72 = 0;
					local74 = 0;
					while (true) {
						while (true) {
							if (local63.length <= local74) {
								continue label96;
							}
							if ((0x1 << local72++ & local57) == 0) {
								local74 += 3;
							} else {
								for (local88 = 0; local88 < 3; local88++) {
									local97 = local63[local74++] & 0xFFFF;
									if (local42 < local97) {
										local42 = local97;
									}
									if (local40 > local97) {
										local40 = local97;
									}
									local36.a(local97);
								}
								local38++;
							}
						}
					}
				}
			}
		}
		local36.c();
		if (!local14.method4094() || local38 <= 0) {
			return;
		}
		this.aClass14_Sub2_5.method6981((this.aClass59_Sub2_1.anInt4288 & 0x7) != 0, this.anInt3196, (this.aClass59_Sub2_1.anInt4288 & 0x8) != 0);
		if (this.aClass14_Sub2_5.aBoolean621) {
			this.aClass14_Sub2_5.LA(Integer.MAX_VALUE, this.anInt3191, this.anInt3192, this.anInt3204);
		}
		@Pc(270) Class54_Sub3 local270 = this.aClass14_Sub2_5.method7020();
		local270.method5462(1.0F / this.aFloat65, 1.0F / this.aFloat65, 1.0F);
		this.aClass14_Sub2_5.method7023(Static206.aClass280_4);
		this.aClass14_Sub2_5.method6994(1, this.anInterface13_7);
		this.aClass14_Sub2_5.method6944(this.aClass59_Sub2_1.aClass28_13);
		this.aClass14_Sub2_5.method7026(0, local40, local42 + 1 - local40, local38, Static181.aClass311_4, local14);
		this.aClass14_Sub2_5.method7002();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIII)V")
	public void method2823(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray194[this.aClass59_Sub2_1.anInt9640 * arg2 + arg0] |= 0x1 << arg1;
		this.anInt3203++;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	public void method2825(@OriginalArg(0) int arg0) {
		this.aStream3.e(arg0 * 4 + 3);
		this.aStream3.b(-1);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(FIIII)V")
	public void method2826(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20;
		@Pc(43) int local43;
		if (this.anInt3196 != -1) {
			@Pc(15) Class313 local15 = this.aClass14_Sub2_5.anInterface4_15.method4234(this.anInt3196);
			local20 = local15.aByte101 & 0xFF;
			@Pc(63) int local63;
			if (local20 != 0 && local15.aByte98 != 4) {
				if (arg1 < 0) {
					local43 = 0;
				} else if (arg1 > 127) {
					local43 = 16777215;
				} else {
					local43 = arg1 * 131586;
				}
				if (local20 == 256) {
					arg3 = local43;
				} else {
					local63 = 256 - local20;
					arg3 = ((local43 & 0xFF00) * local20 + local63 * (arg3 & 0xFF00) & 0xFF0000) + (local20 * (local43 & 0xFF00FF) + local63 * (arg3 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local43 = local15.aByte100 & 0xFF;
			if (local43 != 0) {
				local43 += 256;
				@Pc(116) int local116 = local43 * (arg3 >> 16 & 0xFF);
				if (local116 > 65535) {
					local116 = 65535;
				}
				local63 = (arg3 >> 8 & 0xFF) * local43;
				if (local63 > 65535) {
					local63 = 65535;
				}
				@Pc(142) int local142 = (arg3 & 0xFF) * local43;
				if (local142 > 65535) {
					local142 = 65535;
				}
				arg3 = (local63 & 0xFF00) + ((local116 << 8 & 0xFF003E) + (local142 >> 8));
			}
		}
		if (arg0 != 1.0F) {
			@Pc(176) int local176 = arg3 >> 16 & 0xFF;
			local20 = arg3 >> 8 & 0xFF;
			local176 = (int) ((float) local176 * arg0);
			local43 = arg3 & 0xFF;
			if (local176 < 0) {
				local176 = 0;
			} else if (local176 > 255) {
				local176 = 255;
			}
			local20 = (int) ((float) local20 * arg0);
			local43 = (int) ((float) local43 * arg0);
			if (local20 < 0) {
				local20 = 0;
			} else if (local20 > 255) {
				local20 = 255;
			}
			if (local43 < 0) {
				local43 = 0;
			} else if (local43 > 255) {
				local43 = 255;
			}
			arg3 = local43 | local20 << 8 | local176 << 16;
		}
		this.aStream3.e(arg2 * 4);
		if (this.aClass14_Sub2_5.anInt8602 == 0) {
			this.aStream3.b((byte) arg3);
			this.aStream3.b((byte) (arg3 >> 8));
			this.aStream3.b((byte) (arg3 >> 16));
		} else {
			this.aStream3.b((byte) (arg3 >> 16));
			this.aStream3.b((byte) (arg3 >> 8));
			this.aStream3.b((byte) arg3);
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)V")
	public void method2828(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass14_Sub2_5.method6936(true, arg0 * 4);
		this.aStream3 = new Stream(this.aNativeHeapBuffer5, 0, arg0 * 4);
	}
}
