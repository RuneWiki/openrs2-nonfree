import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class5_Sub12 extends Class5 {

	@OriginalMember(owner = "client!cfa", name = "v", descriptor = "Lclient!kb;")
	private Class194 aClass194_3;

	@OriginalMember(owner = "client!cfa", name = "B", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!cfa", name = "D", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!cfa", name = "A", descriptor = "Lclient!wr;")
	private final Class88_Sub3 aClass88_Sub3_3;

	@OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
	public final int anInt1101;

	@OriginalMember(owner = "client!cfa", name = "l", descriptor = "I")
	public final int anInt1103;

	@OriginalMember(owner = "client!cfa", name = "t", descriptor = "[I")
	private final int[] anIntArray62;

	@OriginalMember(owner = "client!cfa", name = "p", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_10;

	@OriginalMember(owner = "client!cfa", name = "C", descriptor = "I")
	public final int anInt1110;

	@OriginalMember(owner = "client!cfa", name = "y", descriptor = "I")
	public final int anInt1108;

	@OriginalMember(owner = "client!cfa", name = "w", descriptor = "F")
	public final float aFloat27;

	@OriginalMember(owner = "client!cfa", name = "u", descriptor = "Lclient!vv;")
	private final Class292_Sub1 aClass292_Sub1_1;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lclient!wr;IIIII)V")
	public Class5_Sub12(@OriginalArg(0) Class88_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass88_Sub3_3 = arg0;
		this.anInt1101 = arg4;
		this.anInt1103 = arg1;
		this.anIntArray62 = new int[this.aClass88_Sub3_3.anInt10541 * this.aClass88_Sub3_3.anInt10545];
		this.aClass143_Sub2_10 = this.aClass88_Sub3_3.aClass143_Sub2_42;
		this.anInt1110 = arg5;
		this.anInt1108 = arg3;
		this.aFloat27 = (float) arg2;
		this.aClass292_Sub1_1 = new Class292_Sub1(this.aClass143_Sub2_10, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I[IB)V")
	public void method1037(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(11) int local11 = 0;
		@Pc(15) Class5_Sub15_Sub1 local15 = this.aClass143_Sub2_10.aClass5_Sub15_Sub1_3;
		local15.anInt4144 = 0;
		@Pc(36) short[] local36;
		@Pc(30) int local30;
		@Pc(41) int local41;
		@Pc(24) int local24;
		@Pc(50) int local50;
		@Pc(52) int local52;
		if (this.aClass143_Sub2_10.aBoolean408) {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local41 = this.anIntArray62[local30];
				local36 = this.aClass88_Sub3_3.aShortArrayArray18[local30];
				if (local41 != 0 && local36 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local36.length) {
						if ((0x1 << local50++ & local41) == 0) {
							local52 += 3;
						} else {
							local11++;
							local15.method3660(local36[local52++] & 0xFFFF);
							local15.method3660(local36[local52++] & 0xFFFF);
							local11++;
							local15.method3660(local36[local52++] & 0xFFFF);
							local11++;
						}
					}
				}
			}
		} else {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local36 = this.aClass88_Sub3_3.aShortArrayArray18[local30];
				local41 = this.anIntArray62[local30];
				if (local41 != 0 && local36 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local36.length) {
						if ((local41 & 0x1 << local50++) == 0) {
							local52 += 3;
						} else {
							local11++;
							local15.method3668(local36[local52++] & 0xFFFF);
							local11++;
							local15.method3668(local36[local52++] & 0xFFFF);
							local15.method3668(local36[local52++] & 0xFFFF);
							local11++;
						}
					}
				}
			}
		}
		if (local11 <= 0) {
			return;
		}
		this.aClass292_Sub1_1.method8493(local15.anInt4144, local15.aByteArray45);
		this.aClass143_Sub2_10.method4970(this.aClass88_Sub3_3.aClass194_10, this.aClass88_Sub3_3.aClass194_12, this.aClass194_3, this.aClass88_Sub3_3.aClass194_11);
		this.aClass143_Sub2_10.method4956(this.anInt1103, (this.aClass88_Sub3_3.anInt10568 & 0x8) != 0, (this.aClass88_Sub3_3.anInt10568 & 0x7) != 0);
		if (this.aClass143_Sub2_10.aBoolean428) {
			this.aClass143_Sub2_10.EA(Integer.MAX_VALUE, this.anInt1108, this.anInt1101, this.anInt1110);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat27, 1.0F / this.aFloat27, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass143_Sub2_10.method4970(this.aClass88_Sub3_3.aClass194_10, this.aClass88_Sub3_3.aClass194_12, this.aClass194_3, this.aClass88_Sub3_3.aClass194_11);
		this.aClass143_Sub2_10.method5004(this.aClass292_Sub1_1, local11, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIII)V")
	public void method1039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray62[arg1 + this.aClass88_Sub3_3.anInt10541 * arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)V")
	public void method1040(@OriginalArg(0) int arg0) {
		this.aStream1.d(arg0 * 4 + 3);
		this.aStream1.c(-1);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BIIIF)V")
	public void method1041(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(22) int local22;
		@Pc(39) int local39;
		if (this.anInt1103 != -1) {
			@Pc(17) Class331 local17 = this.aClass143_Sub2_10.anInterface3_11.method8501(this.anInt1103);
			local22 = local17.aByte118 & 0xFF;
			@Pc(62) int local62;
			if (local22 != 0 && local17.aByte117 != 4) {
				if (arg1 < 0) {
					local39 = 0;
				} else if (arg1 <= 127) {
					local39 = arg1 * 131586;
				} else {
					local39 = 16777215;
				}
				if (local22 == 256) {
					arg0 = local39;
				} else {
					local62 = 256 - local22;
					arg0 = (local22 * (local39 & 0xFF00FF) + (arg0 & 0xFF00FF) * local62 & 0xFF00FF00) + ((local39 & 0xFF00) * local22 + ((arg0 & 0xFF00) * local62) & 0xFF0000) >> 8;
				}
			}
			local39 = local17.aByte115 & 0xFF;
			if (local39 != 0) {
				local39 += 256;
				@Pc(112) int local112 = local39 * (arg0 >> 16 & 0xFF);
				if (local112 > 65535) {
					local112 = 65535;
				}
				local62 = local39 * (arg0 >> 8 & 0xFF);
				if (local62 > 65535) {
					local62 = 65535;
				}
				@Pc(136) int local136 = local39 * (arg0 & 0xFF);
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg0 = (local136 >> 8) + (local62 & 0xFF00) + (local112 << 8 & 0xFF0093);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(165) int local165 = arg0 >> 16 & 0xFF;
			local22 = arg0 >> 8 & 0xFF;
			local165 = (int) ((float) local165 * arg3);
			local39 = arg0 & 0xFF;
			if (local165 < 0) {
				local165 = 0;
			} else if (local165 > 255) {
				local165 = 255;
			}
			local22 = (int) ((float) local22 * arg3);
			local39 = (int) ((float) local39 * arg3);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			if (local39 < 0) {
				local39 = 0;
			} else if (local39 > 255) {
				local39 = 255;
			}
			arg0 = local39 | local22 << 8 | local165 << 16;
		}
		this.aStream1.d(arg2 * 4);
		this.aStream1.c((byte) (arg0 >> 16));
		this.aStream1.c((byte) (arg0 >> 8));
		this.aStream1.c((byte) arg0);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IZ)V")
	public void method1043(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass143_Sub2_10.aNativeHeap4.a(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer1);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BI)V")
	public void method1045(@OriginalArg(1) int arg0) {
		this.aStream1.c();
		@Pc(18) Interface8 local18 = this.aClass143_Sub2_10.method4927(arg0 * 4, 4, this.aNativeHeapBuffer1);
		this.aClass194_3 = new Class194(local18, 5121, 4, 0);
		this.aNativeHeapBuffer1 = null;
		this.aStream1 = null;
	}
}
