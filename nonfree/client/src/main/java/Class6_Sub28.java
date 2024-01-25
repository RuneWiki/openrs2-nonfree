import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class6_Sub28 extends Class6 {

	@OriginalMember(owner = "client!iw", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!iw", name = "p", descriptor = "Lclient!gk;")
	private Class121 aClass121_3;

	@OriginalMember(owner = "client!iw", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!iw", name = "o", descriptor = "Lclient!ok;")
	private final Class245_Sub1 aClass245_Sub1_2;

	@OriginalMember(owner = "client!iw", name = "s", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_21;

	@OriginalMember(owner = "client!iw", name = "C", descriptor = "I")
	public final int anInt5531;

	@OriginalMember(owner = "client!iw", name = "z", descriptor = "[I")
	private final int[] anIntArray231;

	@OriginalMember(owner = "client!iw", name = "r", descriptor = "I")
	public final int anInt5524;

	@OriginalMember(owner = "client!iw", name = "E", descriptor = "I")
	public final int anInt5533;

	@OriginalMember(owner = "client!iw", name = "v", descriptor = "I")
	public final int anInt5526;

	@OriginalMember(owner = "client!iw", name = "w", descriptor = "F")
	public final float aFloat121;

	@OriginalMember(owner = "client!iw", name = "k", descriptor = "Lclient!qs;")
	private final Class170_Sub1 aClass170_Sub1_2;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lclient!ok;IIIII)V")
	public Class6_Sub28(@OriginalArg(0) Class245_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass245_Sub1_2 = arg0;
		this.aClass5_Sub1_21 = this.aClass245_Sub1_2.aClass5_Sub1_28;
		this.anInt5531 = arg4;
		this.anIntArray231 = new int[this.aClass245_Sub1_2.anInt9289 * this.aClass245_Sub1_2.anInt9290];
		this.anInt5524 = arg1;
		this.anInt5533 = arg5;
		this.anInt5526 = arg3;
		this.aFloat121 = (float) arg2;
		this.aClass170_Sub1_2 = new Class170_Sub1(this.aClass5_Sub1_21, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IZ)V")
	public void method4517(@OriginalArg(0) int arg0) {
		this.aStream4.b(arg0 * 4 + 3);
		this.aStream4.e(-1);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IBFII)V")
	public void method4518(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(27) int local27;
		@Pc(43) int local43;
		if (this.anInt5524 != -1) {
			@Pc(22) Class254 local22 = this.aClass5_Sub1_21.anInterface7_10.method6931(this.anInt5524);
			local27 = local22.aByte98 & 0xFF;
			@Pc(68) int local68;
			if (local27 != 0 && local22.aByte95 != 4) {
				if (arg0 < 0) {
					local43 = 0;
				} else if (arg0 > 127) {
					local43 = 16777215;
				} else {
					local43 = arg0 * 131586;
				}
				if (local27 == 256) {
					arg2 = local43;
				} else {
					local68 = 256 - local27;
					arg2 = (local68 * (arg2 & 0xFF00) + (local43 & 0xFF00) * local27 & 0xFF0000) + ((arg2 & 0xFF00FF) * local68 + local27 * (local43 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local43 = local22.aByte97 & 0xFF;
			if (local43 != 0) {
				local43 += 256;
				@Pc(117) int local117 = (arg2 >> 16 & 0xFF) * local43;
				if (local117 > 65535) {
					local117 = 65535;
				}
				local68 = local43 * (arg2 >> 8 & 0xFF);
				if (local68 > 65535) {
					local68 = 65535;
				}
				@Pc(145) int local145 = local43 * (arg2 & 0xFF);
				if (local145 > 65535) {
					local145 = 65535;
				}
				arg2 = (local145 >> 8) + (local68 & 0xFF00) + (local117 << 8 & 0xFF00CA);
			}
		}
		this.aStream4.b(arg3 * 4);
		if (arg1 != 1.0F) {
			@Pc(180) int local180 = arg2 >> 16 & 0xFF;
			local27 = arg2 >> 8 & 0xFF;
			local180 = (int) ((float) local180 * arg1);
			local43 = arg2 & 0xFF;
			local27 = (int) ((float) local27 * arg1);
			if (local180 < 0) {
				local180 = 0;
			} else if (local180 > 255) {
				local180 = 255;
			}
			local43 = (int) ((float) local43 * arg1);
			if (local27 < 0) {
				local27 = 0;
			} else if (local27 > 255) {
				local27 = 255;
			}
			if (local43 < 0) {
				local43 = 0;
			} else if (local43 > 255) {
				local43 = 255;
			}
			arg2 = local27 << 8 | local180 << 16 | local43;
		}
		this.aStream4.e((byte) (arg2 >> 16));
		this.aStream4.e((byte) (arg2 >> 8));
		this.aStream4.e((byte) arg2);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "([IBI)V")
	public void method4519(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = 0;
		@Pc(15) Class6_Sub8_Sub2 local15 = this.aClass5_Sub1_21.aClass6_Sub8_Sub2_1;
		local15.anInt10061 = 0;
		@Pc(41) short[] local41;
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(24) int local24;
		@Pc(47) int local47;
		@Pc(49) int local49;
		if (this.aClass5_Sub1_21.aBoolean24) {
			for (local24 = 0; local24 < arg1; local24++) {
				local30 = arg0[local24];
				local41 = this.aClass245_Sub1_2.aShortArrayArray24[local30];
				local35 = this.anIntArray231[local30];
				if (local35 != 0 && local41 != null) {
					local47 = 0;
					local49 = 0;
					while (local41.length > local49) {
						if ((0x1 << local47++ & local35) == 0) {
							local49 += 3;
						} else {
							local11++;
							local15.method8241(local41[local49++] & 0xFFFF);
							local11++;
							local15.method8241(local41[local49++] & 0xFFFF);
							local11++;
							local15.method8241(local41[local49++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local24 = 0; local24 < arg1; local24++) {
				local30 = arg0[local24];
				local35 = this.anIntArray231[local30];
				local41 = this.aClass245_Sub1_2.aShortArrayArray24[local30];
				if (local35 != 0 && local41 != null) {
					local47 = 0;
					local49 = 0;
					while (local49 < local41.length) {
						if ((0x1 << local47++ & local35) == 0) {
							local49 += 3;
						} else {
							local15.method8264(local41[local49++] & 0xFFFF);
							local11++;
							local11++;
							local15.method8264(local41[local49++] & 0xFFFF);
							local15.method8264(local41[local49++] & 0xFFFF);
							local11++;
						}
					}
				}
			}
		}
		if (local11 <= 0) {
			return;
		}
		this.aClass170_Sub1_2.method7036(local15.aByteArray102, local15.anInt10061);
		this.aClass5_Sub1_21.method357(this.aClass121_3, this.aClass245_Sub1_2.aClass121_8, this.aClass245_Sub1_2.aClass121_11, this.aClass245_Sub1_2.aClass121_10);
		this.aClass5_Sub1_21.method386(this.anInt5524, (this.aClass245_Sub1_2.anInt7529 & 0x8) != 0, (this.aClass245_Sub1_2.anInt7529 & 0x7) != 0);
		if (this.aClass5_Sub1_21.aBoolean16) {
			this.aClass5_Sub1_21.EA(Integer.MAX_VALUE, this.anInt5526, this.anInt5531, this.anInt5533);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat121, 1.0F / this.aFloat121, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass5_Sub1_21.method357(this.aClass121_3, this.aClass245_Sub1_2.aClass121_8, this.aClass245_Sub1_2.aClass121_11, this.aClass245_Sub1_2.aClass121_10);
		this.aClass5_Sub1_21.method354(local11, this.aClass170_Sub1_2, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZI)V")
	public void method4520(@OriginalArg(1) int arg0) {
		this.aStream4.c();
		@Pc(22) Interface19 local22 = this.aClass5_Sub1_21.method332(4, this.aNativeHeapBuffer5, arg0 * 4);
		this.aClass121_3 = new Class121(local22, 5121, 4, 0);
		this.aNativeHeapBuffer5 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IBII)V")
	public void method4524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray231[arg2 + this.aClass245_Sub1_2.anInt9289 * arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IB)V")
	public void method4525(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass5_Sub1_21.aNativeHeap1.a(arg0 * 4, true);
		this.aStream4 = new Stream(this.aNativeHeapBuffer5);
	}
}
