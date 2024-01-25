import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class14_Sub36 extends Class14 {

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!mt", name = "s", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!mt", name = "v", descriptor = "Lclient!ei;")
	private Class91 aClass91_5;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "Lclient!re;")
	private final Class51_Sub3 aClass51_Sub3_2;

	@OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
	public final int anInt6939;

	@OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
	public final int anInt6932;

	@OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
	public final int anInt6936;

	@OriginalMember(owner = "client!mt", name = "D", descriptor = "F")
	public final float aFloat159;

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "[I")
	private final int[] anIntArray509;

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
	public final int anInt6933;

	@OriginalMember(owner = "client!mt", name = "F", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_24;

	@OriginalMember(owner = "client!mt", name = "B", descriptor = "Lclient!mga;")
	private final Class40_Sub2 aClass40_Sub2_1;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!re;IIIII)V")
	public Class14_Sub36(@OriginalArg(0) Class51_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass51_Sub3_2 = arg0;
		this.anInt6939 = arg4;
		this.anInt6932 = arg5;
		this.anInt6936 = arg1;
		this.aFloat159 = (float) arg2;
		this.anIntArray509 = new int[this.aClass51_Sub3_2.anInt9511 * this.aClass51_Sub3_2.anInt9512];
		this.anInt6933 = arg3;
		this.aClass137_Sub3_24 = this.aClass51_Sub3_2.aClass137_Sub3_37;
		this.aClass40_Sub2_1 = new Class40_Sub2(this.aClass137_Sub3_24, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIII)V")
	public void method5616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray509[this.aClass51_Sub3_2.anInt9511 * arg2 + arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIFII)V")
	public void method5617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		@Pc(27) int local27;
		@Pc(37) int local37;
		if (this.anInt6936 != -1) {
			@Pc(22) Class224 local22 = this.aClass137_Sub3_24.anInterface3_11.method6177(this.anInt6936);
			local27 = local22.aByte100 & 0xFF;
			@Pc(66) int local66;
			if (local27 != 0 && local22.aByte96 != 4) {
				if (arg0 < 0) {
					local37 = 0;
				} else if (arg0 <= 127) {
					local37 = arg0 * 131586;
				} else {
					local37 = 16777215;
				}
				if (local27 == 256) {
					arg3 = local37;
				} else {
					local66 = 256 - local27;
					arg3 = (local66 * (arg3 & 0xFF00) + local27 * (local37 & 0xFF00) & 0xFF0000) + ((local37 & 0xFF00FF) * local27 + (arg3 & 0xFF00FF) * local66 & 0xFF00FF00) >> 8;
				}
			}
			local37 = local22.aByte99 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(112) int local112 = local37 * (arg3 >> 16 & 0xFF);
				if (local112 > 65535) {
					local112 = 65535;
				}
				local66 = (arg3 >> 8 & 0xFF) * local37;
				if (local66 > 65535) {
					local66 = 65535;
				}
				@Pc(140) int local140 = (arg3 & 0xFF) * local37;
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg3 = (local66 & 0xFF00) + ((local112 & 0xA600FF00) << 8) + (local140 >> 8);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(169) int local169 = arg3 >> 16 & 0xFF;
			local27 = arg3 >> 8 & 0xFF;
			local37 = arg3 & 0xFF;
			local169 = (int) ((float) local169 * arg2);
			if (local169 < 0) {
				local169 = 0;
			} else if (local169 > 255) {
				local169 = 255;
			}
			local27 = (int) ((float) local27 * arg2);
			if (local27 < 0) {
				local27 = 0;
			} else if (local27 > 255) {
				local27 = 255;
			}
			local37 = (int) ((float) local37 * arg2);
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg3 = local37 | local27 << 8 | local169 << 16;
		}
		this.aStream3.b(arg1 * 4);
		this.aStream3.f((byte) (arg3 >> 16));
		this.aStream3.f((byte) (arg3 >> 8));
		this.aStream3.f((byte) arg3);
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(II)V")
	public void method5619(@OriginalArg(0) int arg0) {
		this.aStream3.b(arg0 * 4 + 3);
		this.aStream3.f(-1);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)V")
	public void method5620(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass137_Sub3_24.aNativeHeap5.a(arg0 * 4, true);
		this.aStream3 = new Stream(this.aNativeHeapBuffer5);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZI)V")
	public void method5622(@OriginalArg(1) int arg0) {
		this.aStream3.b();
		@Pc(23) Interface8 local23 = this.aClass137_Sub3_24.method7060(this.aNativeHeapBuffer5, arg0 * 4, 4);
		this.aClass91_5 = new Class91(local23, 5121, 4, 0);
		this.aNativeHeapBuffer5 = null;
		this.aStream3 = null;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[II)V")
	public void method5623(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = 0;
		@Pc(18) Class14_Sub29_Sub2 local18 = this.aClass137_Sub3_24.aClass14_Sub29_Sub2_2;
		local18.anInt7264 = 0;
		@Pc(39) short[] local39;
		@Pc(33) int local33;
		@Pc(44) int local44;
		@Pc(27) int local27;
		@Pc(50) int local50;
		@Pc(52) int local52;
		if (this.aClass137_Sub3_24.aBoolean594) {
			for (local27 = 0; local27 < arg1; local27++) {
				local33 = arg0[local27];
				local39 = this.aClass51_Sub3_2.aShortArrayArray17[local33];
				local44 = this.anIntArray509[local33];
				if (local44 != 0 && local39 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local39.length) {
						if ((0x1 << local50++ & local44) == 0) {
							local52 += 3;
						} else {
							local14++;
							local18.method5859(local39[local52++] & 0xFFFF);
							local14++;
							local18.method5859(local39[local52++] & 0xFFFF);
							local14++;
							local18.method5859(local39[local52++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local27 = 0; local27 < arg1; local27++) {
				local33 = arg0[local27];
				local39 = this.aClass51_Sub3_2.aShortArrayArray17[local33];
				local44 = this.anIntArray509[local33];
				if (local44 != 0 && local39 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local39.length) {
						if ((local44 & 0x1 << local50++) == 0) {
							local52 += 3;
						} else {
							local14++;
							local18.method5867(local39[local52++] & 0xFFFF);
							local18.method5867(local39[local52++] & 0xFFFF);
							local14++;
							local14++;
							local18.method5867(local39[local52++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local14 <= 0) {
			return;
		}
		this.aClass40_Sub2_1.method5494(local18.aByteArray84, local18.anInt7264);
		this.aClass137_Sub3_24.method7036(this.aClass91_5, this.aClass51_Sub3_2.aClass91_10, this.aClass51_Sub3_2.aClass91_12, this.aClass51_Sub3_2.aClass91_11);
		this.aClass137_Sub3_24.method7092((this.aClass51_Sub3_2.anInt8924 & 0x7) != 0, (this.aClass51_Sub3_2.anInt8924 & 0x8) != 0, this.anInt6936);
		if (this.aClass137_Sub3_24.aBoolean593) {
			this.aClass137_Sub3_24.EA(Integer.MAX_VALUE, this.anInt6933, this.anInt6939, this.anInt6932);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat159, 1.0F / this.aFloat159, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass137_Sub3_24.method7036(this.aClass91_5, this.aClass51_Sub3_2.aClass91_10, this.aClass51_Sub3_2.aClass91_12, this.aClass51_Sub3_2.aClass91_11);
		this.aClass137_Sub3_24.method7063(0, this.aClass40_Sub2_1, local14);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
