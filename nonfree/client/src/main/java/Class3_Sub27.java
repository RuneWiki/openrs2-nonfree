import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class3_Sub27 extends Class3 {

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "Lclient!nba;")
	private Class243 aClass243_9;

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "Lclient!vca;")
	private final Class104_Sub3 aClass104_Sub3_2;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	public final int anInt5219;

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "[I")
	private final int[] anIntArray341;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "F")
	public final float aFloat132;

	@OriginalMember(owner = "client!jh", name = "C", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_25;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
	public final int anInt5220;

	@OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
	public final int anInt5225;

	@OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
	public final int anInt5229;

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "Lclient!rs;")
	private final Class127_Sub2 aClass127_Sub2_1;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!vca;IIIII)V")
	public Class3_Sub27(@OriginalArg(0) Class104_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass104_Sub3_2 = arg0;
		this.anInt5219 = arg5;
		this.anIntArray341 = new int[this.aClass104_Sub3_2.anInt9718 * this.aClass104_Sub3_2.anInt9715];
		this.aFloat132 = (float) arg2;
		this.aClass16_Sub2_25 = this.aClass104_Sub3_2.aClass16_Sub2_38;
		this.anInt5220 = arg1;
		this.anInt5225 = arg4;
		this.anInt5229 = arg3;
		this.aClass127_Sub2_1 = new Class127_Sub2(this.aClass16_Sub2_25, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
	public void method4430(@OriginalArg(1) int arg0) {
		this.aStream4.b();
		@Pc(18) Interface26 local18 = this.aClass16_Sub2_25.method3692(arg0 * 4, this.aNativeHeapBuffer5, 4);
		this.aClass243_9 = new Class243(local18, 5121, 4, 0);
		this.aStream4 = null;
		this.aNativeHeapBuffer5 = null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(FBIII)V")
	public void method4431(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		@Pc(35) int local35;
		if (this.anInt5220 != -1) {
			@Pc(14) Class342 local14 = this.aClass16_Sub2_25.anInterface5_12.method5193(this.anInt5220);
			local19 = local14.aByte126 & 0xFF;
			@Pc(55) int local55;
			if (local19 != 0 && local14.aByte129 != 4) {
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
					local55 = 256 - local19;
					arg3 = ((arg3 & 0xFF00) * local55 + (local35 & 0xFF00) * local19 & 0xFF0000) + ((arg3 & 0xFF00FF) * local55 + (local35 & 0xFF00FF) * local19 & 0xFF00FF00) >> 8;
				}
			}
			local35 = local14.aByte124 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(105) int local105 = (arg3 >> 16 & 0xFF) * local35;
				if (local105 > 65535) {
					local105 = 65535;
				}
				local55 = local35 * (arg3 >> 8 & 0xFF);
				if (local55 > 65535) {
					local55 = 65535;
				}
				@Pc(131) int local131 = local35 * (arg3 & 0xFF);
				if (local131 > 65535) {
					local131 = 65535;
				}
				arg3 = (local131 >> 8) + ((local105 & 0x300FF00) << 8) + (local55 & 0xFF00);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(164) int local164 = arg3 >> 16 & 0xFF;
			local19 = arg3 >> 8 & 0xFF;
			local164 = (int) ((float) local164 * arg0);
			local35 = arg3 & 0xFF;
			if (local164 < 0) {
				local164 = 0;
			} else if (local164 > 255) {
				local164 = 255;
			}
			local19 = (int) ((float) local19 * arg0);
			local35 = (int) ((float) local35 * arg0);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			if (local35 < 0) {
				local35 = 0;
			} else if (local35 > 255) {
				local35 = 255;
			}
			arg3 = local35 | local164 << 16 | local19 << 8;
		}
		this.aStream4.b(arg2 * 4);
		this.aStream4.d((byte) (arg3 >> 16));
		this.aStream4.d((byte) (arg3 >> 8));
		this.aStream4.d((byte) arg3);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V")
	public void method4432(@OriginalArg(0) int arg0) {
		this.aStream4.b(arg0 * 4 + 3);
		this.aStream4.d(-1);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V")
	public void method4433(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass16_Sub2_25.aNativeHeap4.a(arg0 * 4, true);
		this.aStream4 = new Stream(this.aNativeHeapBuffer5);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI[I)V")
	public void method4434(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(13) int local13 = 0;
		@Pc(17) Class3_Sub17_Sub1 local17 = this.aClass16_Sub2_25.aClass3_Sub17_Sub1_1;
		local17.lb = 0;
		@Pc(38) short[] local38;
		@Pc(32) int local32;
		@Pc(43) int local43;
		@Pc(26) int local26;
		@Pc(52) int local52;
		@Pc(54) int local54;
		if (this.aClass16_Sub2_25.aBoolean322) {
			for (local26 = 0; local26 < arg0; local26++) {
				local32 = arg1[local26];
				local38 = this.aClass104_Sub3_2.aShortArrayArray22[local32];
				local43 = this.anIntArray341[local32];
				if (local43 != 0 && local38 != null) {
					local52 = 0;
					local54 = 0;
					while (local38.length > local54) {
						if ((local43 & 0x1 << local52++) == 0) {
							local54 += 3;
						} else {
							local17.method4876(local38[local54++] & 0xFFFF);
							local13++;
							local13++;
							local17.method4876(local38[local54++] & 0xFFFF);
							local17.method4876(local38[local54++] & 0xFFFF);
							local13++;
						}
					}
				}
			}
		} else {
			for (local26 = 0; local26 < arg0; local26++) {
				local32 = arg1[local26];
				local38 = this.aClass104_Sub3_2.aShortArrayArray22[local32];
				local43 = this.anIntArray341[local32];
				if (local43 != 0 && local38 != null) {
					local52 = 0;
					local54 = 0;
					while (local54 < local38.length) {
						if ((local43 & 0x1 << local52++) == 0) {
							local54 += 3;
						} else {
							local17.method4843(local38[local54++] & 0xFFFF);
							local13++;
							local13++;
							local17.method4843(local38[local54++] & 0xFFFF);
							local13++;
							local17.method4843(local38[local54++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local13 <= 0) {
			return;
		}
		this.aClass127_Sub2_1.method7366(local17.aByteArray59, local17.lb);
		this.aClass16_Sub2_25.method3629(this.aClass104_Sub3_2.aClass243_15, this.aClass104_Sub3_2.aClass243_13, this.aClass104_Sub3_2.aClass243_16, this.aClass243_9);
		this.aClass16_Sub2_25.method3646((this.aClass104_Sub3_2.anInt9724 & 0x7) != 0, this.anInt5220, (this.aClass104_Sub3_2.anInt9724 & 0x8) != 0);
		if (this.aClass16_Sub2_25.aBoolean340) {
			this.aClass16_Sub2_25.EA(Integer.MAX_VALUE, this.anInt5229, this.anInt5225, this.anInt5219);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat132, 1.0F / this.aFloat132, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass16_Sub2_25.method3629(this.aClass104_Sub3_2.aClass243_15, this.aClass104_Sub3_2.aClass243_13, this.aClass104_Sub3_2.aClass243_16, this.aClass243_9);
		this.aClass16_Sub2_25.method3632(0, this.aClass127_Sub2_1, local13);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIII)V")
	public void method4435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray341[arg1 * this.aClass104_Sub3_2.anInt9718 + arg0] |= 0x1 << arg2;
	}
}
