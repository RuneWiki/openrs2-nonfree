import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!kw", name = "B", descriptor = "Lclient!uo;")
	private Class352 aClass352_7;

	@OriginalMember(owner = "client!kw", name = "v", descriptor = "Lclient!ed;")
	private final Class91_Sub1 aClass91_Sub1_1;

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
	public final int anInt5536;

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
	public final int anInt5539;

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "F")
	public final float aFloat113;

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_26;

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
	public final int anInt5533;

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "[I")
	private final int[] anIntArray347;

	@OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
	public final int anInt5541;

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "Lclient!kf;")
	private final Class130_Sub2 aClass130_Sub2_1;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!ed;IIIII)V")
	public Class2_Sub29(@OriginalArg(0) Class91_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass91_Sub1_1 = arg0;
		this.anInt5536 = arg3;
		this.anInt5539 = arg5;
		this.aFloat113 = (float) arg2;
		this.aClass13_Sub2_26 = this.aClass91_Sub1_1.aClass13_Sub2_9;
		this.anInt5533 = arg1;
		this.anIntArray347 = new int[this.aClass91_Sub1_1.anInt8650 * this.aClass91_Sub1_1.anInt8645];
		this.anInt5541 = arg4;
		this.aClass130_Sub2_1 = new Class130_Sub2(this.aClass13_Sub2_26, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)V")
	public void method4832(@OriginalArg(0) int arg0) {
		this.aStream3.b();
		@Pc(18) Interface14 local18 = this.aClass13_Sub2_26.method1056(4, this.aNativeHeapBuffer5, arg0 * 4);
		this.aClass352_7 = new Class352(local18, 5121, 4, 0);
		this.aStream3 = null;
		this.aNativeHeapBuffer5 = null;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II[I)V")
	public void method4833(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(11) int local11 = 0;
		@Pc(15) Class2_Sub17_Sub2 local15 = this.aClass13_Sub2_26.aClass2_Sub17_Sub2_1;
		local15.anInt3378 = 0;
		@Pc(41) short[] local41;
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(24) int local24;
		@Pc(50) int local50;
		@Pc(52) int local52;
		if (this.aClass13_Sub2_26.aBoolean102) {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local41 = this.aClass91_Sub1_1.aShortArrayArray3[local30];
				local35 = this.anIntArray347[local30];
				if (local35 != 0 && local41 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local41.length) {
						if ((0x1 << local50++ & local35) == 0) {
							local52 += 3;
						} else {
							local15.method2879(local41[local52++] & 0xFFFF);
							local11++;
							local11++;
							local15.method2879(local41[local52++] & 0xFFFF);
							local15.method2879(local41[local52++] & 0xFFFF);
							local11++;
						}
					}
				}
			}
		} else {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local35 = this.anIntArray347[local30];
				local41 = this.aClass91_Sub1_1.aShortArrayArray3[local30];
				if (local35 != 0 && local41 != null) {
					local50 = 0;
					local52 = 0;
					while (local41.length > local52) {
						if ((0x1 << local50++ & local35) == 0) {
							local52 += 3;
						} else {
							local11++;
							local15.method2878(local41[local52++] & 0xFFFF);
							local15.method2878(local41[local52++] & 0xFFFF);
							local11++;
							local15.method2878(local41[local52++] & 0xFFFF);
							local11++;
						}
					}
				}
			}
		}
		if (local11 <= 0) {
			return;
		}
		this.aClass130_Sub2_1.method4615(local15.aByteArray26, local15.anInt3378);
		this.aClass13_Sub2_26.method1067(this.aClass91_Sub1_1.aClass352_5, this.aClass91_Sub1_1.aClass352_4, this.aClass352_7, this.aClass91_Sub1_1.aClass352_3);
		this.aClass13_Sub2_26.method1026(this.anInt5533, (this.aClass91_Sub1_1.anInt2641 & 0x8) != 0, (this.aClass91_Sub1_1.anInt2641 & 0x7) != 0);
		if (this.aClass13_Sub2_26.aBoolean107) {
			this.aClass13_Sub2_26.EA(Integer.MAX_VALUE, this.anInt5536, this.anInt5541, this.anInt5539);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat113, 1.0F / this.aFloat113, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass13_Sub2_26.method1067(this.aClass91_Sub1_1.aClass352_5, this.aClass91_Sub1_1.aClass352_4, this.aClass352_7, this.aClass91_Sub1_1.aClass352_3);
		this.aClass13_Sub2_26.method1100(0, local11, this.aClass130_Sub2_1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)V")
	public void method4834(@OriginalArg(1) int arg0) {
		this.aStream3.f(arg0 * 4 + 3);
		this.aStream3.d(-1);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIF)V")
	public void method4835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(18) int local18;
		@Pc(31) int local31;
		if (this.anInt5533 != -1) {
			@Pc(13) Class271 local13 = this.aClass13_Sub2_26.anInterface2_12.method6027(this.anInt5533);
			local18 = local13.aByte92 & 0xFF;
			@Pc(53) int local53;
			if (local18 != 0 && local13.aByte94 != 4) {
				if (arg1 < 0) {
					local31 = 0;
				} else if (arg1 <= 127) {
					local31 = arg1 * 131586;
				} else {
					local31 = 16777215;
				}
				if (local18 == 256) {
					arg0 = local31;
				} else {
					local53 = 256 - local18;
					arg0 = (local18 * (local31 & 0xFF00FF) + local53 * (arg0 & 0xFF00FF) & 0xFF00FF00) + ((local31 & 0xFF00) * local18 + (arg0 & 0xFF00) * local53 & 0xFF0000) >> 8;
				}
			}
			local31 = local13.aByte91 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(107) int local107 = local31 * (arg0 >> 16 & 0xFF);
				if (local107 > 65535) {
					local107 = 65535;
				}
				local53 = (arg0 >> 8 & 0xFF) * local31;
				if (local53 > 65535) {
					local53 = 65535;
				}
				@Pc(133) int local133 = local31 * (arg0 & 0xFF);
				if (local133 > 65535) {
					local133 = 65535;
				}
				arg0 = (local133 >> 8) + ((local107 & 0xBE00FF00) << 8) + (local53 & 0xFF00);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(168) int local168 = arg0 >> 16 & 0xFF;
			local18 = arg0 >> 8 & 0xFF;
			local31 = arg0 & 0xFF;
			local168 = (int) ((float) local168 * arg3);
			local18 = (int) ((float) local18 * arg3);
			if (local168 < 0) {
				local168 = 0;
			} else if (local168 > 255) {
				local168 = 255;
			}
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local31 = (int) ((float) local31 * arg3);
			if (local31 < 0) {
				local31 = 0;
			} else if (local31 > 255) {
				local31 = 255;
			}
			arg0 = local31 | local18 << 8 | local168 << 16;
		}
		this.aStream3.f(arg2 * 4);
		this.aStream3.d((byte) (arg0 >> 16));
		this.aStream3.d((byte) (arg0 >> 8));
		this.aStream3.d((byte) arg0);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIII)V")
	public void method4836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray347[arg0 * this.aClass91_Sub1_1.anInt8650 + arg2] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)V")
	public void method4837(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass13_Sub2_26.aNativeHeap1.a(arg0 * 4, true);
		this.aStream3 = new Stream(this.aNativeHeapBuffer5);
	}
}
