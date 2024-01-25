import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class6_Sub39 extends Class6 {

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "Lclient!ot;")
	private Class195 aClass195_16;

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "Lclient!tn;")
	private final Class84_Sub2 aClass84_Sub2_3;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
	public final int anInt6563;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "F")
	public final float aFloat100;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "[I")
	private final int[] anIntArray572;

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
	public final int anInt6573;

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
	public final int anInt6572;

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_39;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
	public final int anInt6564;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "Lclient!oi;")
	private final Class97_Sub2 aClass97_Sub2_2;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!tn;IIIII)V")
	public Class6_Sub39(@OriginalArg(0) Class84_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass84_Sub2_3 = arg0;
		this.anInt6563 = arg5;
		this.aFloat100 = arg2;
		this.anIntArray572 = new int[this.aClass84_Sub2_3.anInt6360 * this.aClass84_Sub2_3.anInt6363];
		this.anInt6573 = arg3;
		this.anInt6572 = arg1;
		this.aClass28_Sub1_39 = this.aClass84_Sub2_3.aClass28_Sub1_37;
		this.anInt6564 = arg4;
		this.aClass97_Sub2_2 = new Class97_Sub2(this.aClass28_Sub1_39, 5123, null, 1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[II)V")
	public void method5427(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = 0;
		@Pc(15) Class6_Sub15 local15 = Static303.aClass6_Sub15_6;
		local15.anInt3487 = 0;
		@Pc(41) short[] local41;
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(24) int local24;
		@Pc(50) int local50;
		@Pc(52) int local52;
		if (this.aClass28_Sub1_39.aBoolean52) {
			for (local24 = 0; local24 < arg1; local24++) {
				local30 = arg0[local24];
				local41 = this.aClass84_Sub2_3.aShortArrayArray7[local30];
				local35 = this.anIntArray572[local30];
				if (local35 != 0 && local41 != null) {
					local50 = 0;
					local52 = 0;
					while (local41.length > local52) {
						if ((0x1 << local50++ & local35) == 0) {
							local52 += 3;
						} else {
							local15.method3100(local41[local52++] & 0xFFFF);
							local13++;
							local15.method3100(local41[local52++] & 0xFFFF);
							local13++;
							local15.method3100(local41[local52++] & 0xFFFF);
							local13++;
						}
					}
				}
			}
		} else {
			for (local24 = 0; local24 < arg1; local24++) {
				local30 = arg0[local24];
				local35 = this.anIntArray572[local30];
				local41 = this.aClass84_Sub2_3.aShortArrayArray7[local30];
				if (local35 != 0 && local41 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local41.length) {
						if ((0x1 << local50++ & local35) == 0) {
							local52 += 3;
						} else {
							local15.method3114(local41[local52++] & 0xFFFF);
							local13++;
							local13++;
							local15.method3114(local41[local52++] & 0xFFFF);
							local13++;
							local15.method3114(local41[local52++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local13 <= 0) {
			return;
		}
		this.aClass97_Sub2_2.method4284(local15.aByteArray51, local15.anInt3487);
		this.aClass28_Sub1_39.method714(this.aClass84_Sub2_3.aClass195_14, this.aClass84_Sub2_3.aClass195_12, this.aClass195_16, this.aClass84_Sub2_3.aClass195_15);
		this.aClass28_Sub1_39.method705((this.aClass84_Sub2_3.anInt6381 & 0x8) != 0, (this.aClass84_Sub2_3.anInt6381 & 0x7) != 0, this.anInt6572);
		if (this.aClass28_Sub1_39.aBoolean57) {
			this.aClass28_Sub1_39.method3565(Integer.MAX_VALUE, this.anInt6573, this.anInt6564, this.anInt6563);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat100, 1.0F / this.aFloat100, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass28_Sub1_39.method714(this.aClass84_Sub2_3.aClass195_14, this.aClass84_Sub2_3.aClass195_12, this.aClass195_16, this.aClass84_Sub2_3.aClass195_15);
		this.aClass28_Sub1_39.method661(0, local13, this.aClass97_Sub2_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
	public void method5429(@OriginalArg(0) int arg0) {
		this.aNativeStream1.b(arg0 * 4 + 3);
		this.aNativeStream1.a(-1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)V")
	public void method5431(@OriginalArg(1) int arg0) {
		this.aNativeBuffer4 = this.aClass28_Sub1_39.aNativeHeap1.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer4);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIF)V")
	public void method5432(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(19) int local19;
		@Pc(37) int local37;
		if (this.anInt6572 != -1) {
			@Pc(14) Class229 local14 = this.aClass28_Sub1_39.anInterface11_6.method2466(this.anInt6572);
			local19 = local14.aByte84 & 0xFF;
			@Pc(63) int local63;
			if (local19 != 0 && local14.aByte85 != 4) {
				if (arg0 < 0) {
					local37 = 0;
				} else if (arg0 > 127) {
					local37 = 16777215;
				} else {
					local37 = arg0 * 131586;
				}
				if (local19 == 256) {
					arg2 = local37;
				} else {
					local63 = 256 - local19;
					arg2 = ((local37 & 0xFF00FF) * local19 + (arg2 & 0xFF00FF) * local63 & 0xFF00FF00) + ((local37 & 0xFF00) * local19 + ((arg2 & 0xFF00) * local63) & 0xFF0000) >> 8;
				}
			}
			local37 = local14.aByte83 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(114) int local114 = (arg2 >> 16 & 0xFF) * local37;
				if (local114 > 65535) {
					local114 = 65535;
				}
				local63 = (arg2 >> 8 & 0xFF) * local37;
				if (local63 > 65535) {
					local63 = 65535;
				}
				@Pc(140) int local140 = local37 * (arg2 & 0xFF);
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg2 = (local63 & 0xFF00) + (local114 << 8 & 0xFF00FD) + (local140 >> 8);
			}
		}
		this.aNativeStream1.b(arg1 * 4);
		if (arg3 != 1.0F) {
			@Pc(181) int local181 = arg2 >> 16 & 0xFF;
			local19 = arg2 >> 8 & 0xFF;
			local37 = arg2 & 0xFF;
			local181 = (int) ((float) local181 * arg3);
			if (local181 < 0) {
				local181 = 0;
			} else if (local181 > 255) {
				local181 = 255;
			}
			local19 = (int) ((float) local19 * arg3);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local37 = (int) ((float) local37 * arg3);
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg2 = local37 | local181 << 16 | local19 << 8;
		}
		this.aNativeStream1.a((byte) (arg2 >> 16));
		this.aNativeStream1.a((byte) (arg2 >> 8));
		this.aNativeStream1.a((byte) arg2);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V")
	public void method5433(@OriginalArg(1) int arg0) {
		this.aNativeStream1.c();
		@Pc(27) Interface5 local27 = this.aClass28_Sub1_39.method694(this.aNativeBuffer4, arg0 * 4, 4);
		this.aClass195_16 = new Class195(this.aClass28_Sub1_39, local27, 5121, 4, 0);
		this.aNativeBuffer4 = null;
		this.aNativeStream1 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
	public void method5434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray572[this.aClass84_Sub2_3.anInt6363 * arg2 + arg1] |= 0x1 << arg0;
	}
}
