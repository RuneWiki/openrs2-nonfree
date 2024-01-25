import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class7_Sub22 extends Class7 {

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!ic", name = "z", descriptor = "Lclient!ft;")
	private Class87 aClass87_3;

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "Lclient!ne;")
	private final Class165_Sub2 aClass165_Sub2_3;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
	public final int anInt3045;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
	public final int anInt3046;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "[I")
	private final int[] anIntArray266;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "F")
	public final float aFloat87;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
	public final int anInt3047;

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_21;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	public final int anInt3044;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!ev;")
	private final Class10_Sub2 aClass10_Sub2_2;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!ne;IIIII)V")
	public Class7_Sub22(@OriginalArg(0) Class165_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass165_Sub2_3 = arg0;
		this.anInt3045 = arg3;
		this.anInt3046 = arg4;
		this.anIntArray266 = new int[this.aClass165_Sub2_3.anInt4490 * this.aClass165_Sub2_3.anInt4489];
		this.aFloat87 = arg2;
		this.anInt3047 = arg1;
		this.aClass51_Sub2_21 = this.aClass165_Sub2_3.aClass51_Sub2_29;
		this.anInt3044 = arg5;
		this.aClass10_Sub2_2 = new Class10_Sub2(this.aClass51_Sub2_21, 5123, null, 1);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V")
	public void method2461(@OriginalArg(0) int arg0) {
		this.aNativeBuffer4 = this.aClass51_Sub2_21.aNativeHeap2.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer4);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIFI)V")
	public void method2462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(35) int local35;
		if (this.anInt3047 != -1) {
			@Pc(17) Class203 local17 = this.aClass51_Sub2_21.anInterface4_8.method3138(this.anInt3047);
			local22 = local17.aByte62 & 0xFF;
			@Pc(57) int local57;
			if (local22 != 0 && local17.aByte59 != 4) {
				if (arg1 < 0) {
					local35 = 0;
				} else if (arg1 > 127) {
					local35 = 16777215;
				} else {
					local35 = arg1 * 131586;
				}
				if (local22 == 256) {
					arg0 = local35;
				} else {
					local57 = 256 - local22;
					arg0 = (local22 * (local35 & 0xFF00FF) + local57 * (arg0 & 0xFF00FF) & 0xFF00FF00) + ((local35 & 0xFF00) * local22 + local57 * (arg0 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local35 = local17.aByte57 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(110) int local110 = (arg0 >> 16 & 0xFF) * local35;
				if (local110 > 65535) {
					local110 = 65535;
				}
				local57 = local35 * (arg0 >> 8 & 0xFF);
				if (local57 > 65535) {
					local57 = 65535;
				}
				@Pc(138) int local138 = local35 * (arg0 & 0xFF);
				if (local138 > 65535) {
					local138 = 65535;
				}
				arg0 = (local138 >> 8) + ((local110 << 8 & 0xFF0070) + (local57 & 0xFF00));
			}
		}
		this.aNativeStream1.b(arg3 * 4);
		if (arg2 != 1.0F) {
			@Pc(180) int local180 = arg0 >> 16 & 0xFF;
			local22 = arg0 >> 8 & 0xFF;
			local180 = (int) ((float) local180 * arg2);
			local35 = arg0 & 0xFF;
			if (local180 < 0) {
				local180 = 0;
			} else if (local180 > 255) {
				local180 = 255;
			}
			local22 = (int) ((float) local22 * arg2);
			local35 = (int) ((float) local35 * arg2);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			if (local35 < 0) {
				local35 = 0;
			} else if (local35 > 255) {
				local35 = 255;
			}
			arg0 = local35 | local180 << 16 | local22 << 8;
		}
		this.aNativeStream1.a((byte) (arg0 >> 16));
		this.aNativeStream1.a((byte) (arg0 >> 8));
		this.aNativeStream1.a((byte) arg0);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IZ)V")
	public void method2463(@OriginalArg(0) int arg0) {
		this.aNativeStream1.c();
		@Pc(18) Interface8 local18 = this.aClass51_Sub2_21.method5376(this.aNativeBuffer4, arg0 * 4, 4);
		this.aClass87_3 = new Class87(local18, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer4 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[I)V")
	public void method2465(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(23) Class7_Sub14_Sub2 local23 = this.aClass51_Sub2_21.aClass7_Sub14_Sub2_2;
		local23.anInt4989 = 0;
		@Pc(44) short[] local44;
		@Pc(38) int local38;
		@Pc(49) int local49;
		@Pc(32) int local32;
		@Pc(55) int local55;
		@Pc(57) int local57;
		if (this.aClass51_Sub2_21.aBoolean461) {
			for (local32 = 0; local32 < arg0; local32++) {
				local38 = arg1[local32];
				local49 = this.anIntArray266[local38];
				local44 = this.aClass165_Sub2_3.aShortArrayArray2[local38];
				if (local49 != 0 && local44 != null) {
					local55 = 0;
					local57 = 0;
					while (local44.length > local57) {
						if ((local49 & 0x1 << local55++) == 0) {
							local57 += 3;
						} else {
							local7++;
							local23.method3993(local44[local57++] & 0xFFFF);
							local7++;
							local23.method3993(local44[local57++] & 0xFFFF);
							local7++;
							local23.method3993(local44[local57++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local32 = 0; local32 < arg0; local32++) {
				local38 = arg1[local32];
				local44 = this.aClass165_Sub2_3.aShortArrayArray2[local38];
				local49 = this.anIntArray266[local38];
				if (local49 != 0 && local44 != null) {
					local55 = 0;
					local57 = 0;
					while (local57 < local44.length) {
						if ((local49 & 0x1 << local55++) == 0) {
							local57 += 3;
						} else {
							local7++;
							local23.method3976(local44[local57++] & 0xFFFF);
							local23.method3976(local44[local57++] & 0xFFFF);
							local7++;
							local23.method3976(local44[local57++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass10_Sub2_2.method5743(local23.anInt4989, local23.aByteArray75);
		this.aClass51_Sub2_21.method5415(this.aClass165_Sub2_3.aClass87_4, this.aClass87_3, this.aClass165_Sub2_3.aClass87_7, this.aClass165_Sub2_3.aClass87_5);
		this.aClass51_Sub2_21.method5357((this.aClass165_Sub2_3.anInt4498 & 0x7) != 0, this.anInt3047, (this.aClass165_Sub2_3.anInt4498 & 0x8) != 0);
		if (this.aClass51_Sub2_21.aBoolean447) {
			this.aClass51_Sub2_21.GA(Integer.MAX_VALUE, this.anInt3045, this.anInt3046, this.anInt3044);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat87, 1.0F / this.aFloat87, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass51_Sub2_21.method5415(this.aClass165_Sub2_3.aClass87_4, this.aClass87_3, this.aClass165_Sub2_3.aClass87_7, this.aClass165_Sub2_3.aClass87_5);
		this.aClass51_Sub2_21.method5365(this.aClass10_Sub2_2, 0, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
	public void method2466(@OriginalArg(1) int arg0) {
		this.aNativeStream1.b(arg0 * 4 + 3);
		this.aNativeStream1.a(-1);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
	public void method2467(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray266[arg1 + this.aClass165_Sub2_3.anInt4489 * arg2] |= 0x1 << arg0;
	}
}
