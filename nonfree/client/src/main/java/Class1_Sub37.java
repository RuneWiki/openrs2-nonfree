import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class1_Sub37 extends Class1 {

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!rh", name = "B", descriptor = "Lclient!gi;")
	private Class89 aClass89_13;

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "Lclient!lk;")
	private final Class149_Sub1 aClass149_Sub1_3;

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
	public final int anInt5802;

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "[I")
	private final int[] anIntArray536;

	@OriginalMember(owner = "client!rh", name = "C", descriptor = "F")
	public final float aFloat91;

	@OriginalMember(owner = "client!rh", name = "I", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_34;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
	public final int anInt5796;

	@OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
	public final int anInt5808;

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
	public final int anInt5800;

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "Lclient!fj;")
	private final Class76_Sub1 aClass76_Sub1_2;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!lk;IIIII)V")
	public Class1_Sub37(@OriginalArg(0) Class149_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass149_Sub1_3 = arg0;
		this.anInt5802 = arg5;
		this.anIntArray536 = new int[this.aClass149_Sub1_3.anInt4317 * this.aClass149_Sub1_3.anInt4319];
		this.aFloat91 = arg2;
		this.aClass39_Sub2_34 = this.aClass149_Sub1_3.aClass39_Sub2_24;
		this.anInt5796 = arg3;
		this.anInt5808 = arg1;
		this.anInt5800 = arg4;
		this.aClass76_Sub1_2 = new Class76_Sub1(this.aClass39_Sub2_34, 5123, null, 1);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[II)V")
	public void method4835(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1_Sub5_Sub2 local11 = this.aClass39_Sub2_34.aClass1_Sub5_Sub2_1;
		local11.anInt6475 = 0;
		@Pc(42) short[] local42;
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(25) int local25;
		@Pc(48) int local48;
		@Pc(50) int local50;
		if (this.aClass39_Sub2_34.aBoolean250) {
			for (local25 = 0; local25 < arg0; local25++) {
				local31 = arg1[local25];
				local42 = this.aClass149_Sub1_3.aShortArrayArray6[local31];
				local36 = this.anIntArray536[local31];
				if (local36 != 0 && local42 != null) {
					local48 = 0;
					local50 = 0;
					while (local50 < local42.length) {
						if ((0x1 << local48++ & local36) == 0) {
							local50 += 3;
						} else {
							local11.method5393(local42[local50++] & 0xFFFF);
							local7++;
							local7++;
							local11.method5393(local42[local50++] & 0xFFFF);
							local11.method5393(local42[local50++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local25 = 0; local25 < arg0; local25++) {
				local31 = arg1[local25];
				local36 = this.anIntArray536[local31];
				local42 = this.aClass149_Sub1_3.aShortArrayArray6[local31];
				if (local36 != 0 && local42 != null) {
					local48 = 0;
					local50 = 0;
					while (local50 < local42.length) {
						if ((local36 & 0x1 << local48++) == 0) {
							local50 += 3;
						} else {
							local7++;
							local11.method5355(local42[local50++] & 0xFFFF);
							local11.method5355(local42[local50++] & 0xFFFF);
							local7++;
							local11.method5355(local42[local50++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass76_Sub1_2.method4692(local11.anInt6475, local11.aByteArray89);
		this.aClass39_Sub2_34.method3181(this.aClass149_Sub1_3.aClass89_5, this.aClass149_Sub1_3.aClass89_3, this.aClass149_Sub1_3.aClass89_6, this.aClass89_13);
		this.aClass39_Sub2_34.method3171(this.anInt5808, (this.aClass149_Sub1_3.anInt4115 & 0x7) != 0, (this.aClass149_Sub1_3.anInt4115 & 0x8) != 0);
		if (this.aClass39_Sub2_34.aBoolean240) {
			this.aClass39_Sub2_34.GA(Integer.MAX_VALUE, this.anInt5796, this.anInt5800, this.anInt5802);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat91, 1.0F / this.aFloat91, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass39_Sub2_34.method3181(this.aClass149_Sub1_3.aClass89_5, this.aClass149_Sub1_3.aClass89_3, this.aClass149_Sub1_3.aClass89_6, this.aClass89_13);
		this.aClass39_Sub2_34.method3184(this.aClass76_Sub1_2, local7, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)V")
	public void method4836(@OriginalArg(1) int arg0) {
		this.aNativeBuffer4 = this.aClass39_Sub2_34.aNativeHeap1.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer4);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	public void method4838(@OriginalArg(0) int arg0) {
		this.aNativeStream1.b(arg0 * 4 + 3);
		this.aNativeStream1.a(-1);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(ZI)V")
	public void method4840(@OriginalArg(1) int arg0) {
		this.aNativeStream1.b();
		@Pc(22) Interface12 local22 = this.aClass39_Sub2_34.method3216(4, this.aNativeBuffer4, arg0 * 4);
		this.aClass89_13 = new Class89(local22, 5121, 4, 0);
		this.aNativeBuffer4 = null;
		this.aNativeStream1 = null;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIFZ)V")
	public void method4841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(27) int local27;
		@Pc(43) int local43;
		if (this.anInt5808 != -1) {
			@Pc(22) Class183 local22 = this.aClass39_Sub2_34.anInterface4_12.method2450(this.anInt5808);
			local27 = local22.aByte80 & 0xFF;
			@Pc(70) int local70;
			if (local27 != 0 && local22.aByte76 != 4) {
				if (arg2 < 0) {
					local43 = 0;
				} else if (arg2 <= 127) {
					local43 = arg2 * 131586;
				} else {
					local43 = 16777215;
				}
				if (local27 == 256) {
					arg0 = local43;
				} else {
					local70 = 256 - local27;
					arg0 = (local27 * (local43 & 0xFF00) + (arg0 & 0xFF00) * local70 & 0xFF0000) + ((local43 & 0xFF00FF) * local27 + ((arg0 & 0xFF00FF) * local70) & 0xFF00FF00) >> 8;
				}
			}
			local43 = local22.aByte79 & 0xFF;
			if (local43 != 0) {
				local43 += 256;
				@Pc(118) int local118 = (arg0 >> 16 & 0xFF) * local43;
				if (local118 > 65535) {
					local118 = 65535;
				}
				local70 = (arg0 >> 8 & 0xFF) * local43;
				if (local70 > 65535) {
					local70 = 65535;
				}
				@Pc(144) int local144 = local43 * (arg0 & 0xFF);
				if (local144 > 65535) {
					local144 = 65535;
				}
				arg0 = (local144 >> 8) + (local70 & 0xFF00) + ((local118 & 0xA000FF00) << 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(175) int local175 = arg0 >> 16 & 0xFF;
			local27 = arg0 >> 8 & 0xFF;
			local43 = arg0 & 0xFF;
			local175 = (int) ((float) local175 * arg3);
			local27 = (int) ((float) local27 * arg3);
			if (local175 < 0) {
				local175 = 0;
			} else if (local175 > 255) {
				local175 = 255;
			}
			local43 = (int) ((float) local43 * arg3);
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
			arg0 = local175 << 16 | local27 << 8 | local43;
		}
		this.aNativeStream1.b(arg1 * 4);
		this.aNativeStream1.a((byte) (arg0 >> 16));
		this.aNativeStream1.a((byte) (arg0 >> 8));
		this.aNativeStream1.a((byte) arg0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
	public void method4842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray536[this.aClass149_Sub1_3.anInt4317 * arg2 + arg1] |= 0x1 << arg0;
	}
}
