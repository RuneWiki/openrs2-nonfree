import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "Lclient!hf;")
	private Class100 aClass100_15;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "Lclient!mr;")
	private final Class162_Sub2 aClass162_Sub2_3;

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
	public final int anInt7131;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
	public final int anInt7124;

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
	public final int anInt7128;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "[I")
	private final int[] anIntArray632;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_42;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "F")
	public final float aFloat105;

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
	public final int anInt7126;

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "Lclient!td;")
	private final Class83_Sub2 aClass83_Sub2_2;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!mr;IIIII)V")
	public Class2_Sub43(@OriginalArg(0) Class162_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass162_Sub2_3 = arg0;
		this.anInt7131 = arg4;
		this.anInt7124 = arg3;
		this.anInt7128 = arg1;
		this.anIntArray632 = new int[this.aClass162_Sub2_3.anInt4137 * this.aClass162_Sub2_3.anInt4138];
		this.aClass163_Sub2_42 = this.aClass162_Sub2_3.aClass163_Sub2_28;
		this.aFloat105 = arg2;
		this.anInt7126 = arg5;
		this.aClass83_Sub2_2 = new Class83_Sub2(this.aClass163_Sub2_42, 5123, null, 1);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI[I)V")
	public void method5608(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class2_Sub13_Sub1 local11 = this.aClass163_Sub2_42.aClass2_Sub13_Sub1_3;
		local11.anInt4347 = 0;
		@Pc(36) short[] local36;
		@Pc(30) int local30;
		@Pc(41) int local41;
		@Pc(24) int local24;
		@Pc(50) int local50;
		@Pc(52) int local52;
		if (this.aClass163_Sub2_42.aBoolean374) {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local36 = this.aClass162_Sub2_3.aShortArrayArray5[local30];
				local41 = this.anIntArray632[local30];
				if (local41 != 0 && local36 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local36.length) {
						if ((local41 & 0x1 << local50++) == 0) {
							local52 += 3;
						} else {
							local11.method3568(local36[local52++] & 0xFFFF);
							local7++;
							local7++;
							local11.method3568(local36[local52++] & 0xFFFF);
							local11.method3568(local36[local52++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local36 = this.aClass162_Sub2_3.aShortArrayArray5[local30];
				local41 = this.anIntArray632[local30];
				if (local41 != 0 && local36 != null) {
					local50 = 0;
					local52 = 0;
					while (local36.length > local52) {
						if ((0x1 << local50++ & local41) == 0) {
							local52 += 3;
						} else {
							local7++;
							local11.method3540(local36[local52++] & 0xFFFF);
							local7++;
							local11.method3540(local36[local52++] & 0xFFFF);
							local7++;
							local11.method3540(local36[local52++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass83_Sub2_2.method5172(local11.anInt4347, local11.aByteArray52);
		this.aClass163_Sub2_42.method4114(this.aClass162_Sub2_3.lb, this.aClass162_Sub2_3.aClass100_8, this.aClass100_15, this.aClass162_Sub2_3.aClass100_7);
		this.aClass163_Sub2_42.method4116((this.aClass162_Sub2_3.anInt4158 & 0x7) != 0, (this.aClass162_Sub2_3.anInt4158 & 0x8) != 0, this.anInt7128);
		if (this.aClass163_Sub2_42.aBoolean365) {
			this.aClass163_Sub2_42.a(Integer.MAX_VALUE, this.anInt7124, this.anInt7131, this.anInt7126);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat105, 1.0F / this.aFloat105, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass163_Sub2_42.method4114(this.aClass162_Sub2_3.lb, this.aClass162_Sub2_3.aClass100_8, this.aClass100_15, this.aClass162_Sub2_3.aClass100_7);
		this.aClass163_Sub2_42.method4105(0, this.aClass83_Sub2_2, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)V")
	public void method5609(@OriginalArg(0) int arg0) {
		this.aNativeStream1.c();
		@Pc(24) Interface11 local24 = this.aClass163_Sub2_42.method4162(arg0 * 4, 4, this.aNativeBuffer4);
		this.aClass100_15 = new Class100(local24, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer4 = null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
	public void method5610(@OriginalArg(1) int arg0) {
		this.aNativeBuffer4 = this.aClass163_Sub2_42.aNativeHeap2.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer4);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIBI)V")
	public void method5611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray632[arg0 + this.aClass162_Sub2_3.anInt4138 * arg1] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIF)V")
	public void method5613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(18) int local18;
		@Pc(37) int local37;
		if (this.anInt7128 != -1) {
			@Pc(13) Class158 local13 = this.aClass163_Sub2_42.anInterface9_12.method1769(this.anInt7128);
			local18 = local13.aByte47 & 0xFF;
			@Pc(57) int local57;
			if (local18 != 0 && local13.aByte43 != 4) {
				if (arg0 < 0) {
					local37 = 0;
				} else if (arg0 <= 127) {
					local37 = arg0 * 131586;
				} else {
					local37 = 16777215;
				}
				if (local18 == 256) {
					arg2 = local37;
				} else {
					local57 = 256 - local18;
					arg2 = (local18 * (local37 & 0xFF00) + local57 * (arg2 & 0xFF00) & 0xFF0000) + (local57 * (arg2 & 0xFF00FF) + local18 * (local37 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local37 = local13.aByte45 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(110) int local110 = (arg2 >> 16 & 0xFF) * local37;
				if (local110 > 65535) {
					local110 = 65535;
				}
				local57 = (arg2 >> 8 & 0xFF) * local37;
				if (local57 > 65535) {
					local57 = 65535;
				}
				@Pc(138) int local138 = (arg2 & 0xFF) * local37;
				if (local138 > 65535) {
					local138 = 65535;
				}
				arg2 = (local57 & 0xFF00) + (local110 << 8 & 0xFF00E1) + (local138 >> 8);
			}
		}
		this.aNativeStream1.b(arg1 * 4);
		if (arg3 != 1.0F) {
			@Pc(177) int local177 = arg2 >> 16 & 0xFF;
			local18 = arg2 >> 8 & 0xFF;
			local177 = (int) ((float) local177 * arg3);
			local37 = arg2 & 0xFF;
			local18 = (int) ((float) local18 * arg3);
			if (local177 < 0) {
				local177 = 0;
			} else if (local177 > 255) {
				local177 = 255;
			}
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local37 = (int) ((float) local37 * arg3);
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg2 = local18 << 8 | local177 << 16 | local37;
		}
		this.aNativeStream1.a((byte) (arg2 >> 16));
		this.aNativeStream1.a((byte) (arg2 >> 8));
		this.aNativeStream1.a((byte) arg2);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)V")
	public void method5614(@OriginalArg(1) int arg0) {
		this.aNativeStream1.b(arg0 * 4 + 3);
		this.aNativeStream1.a(-1);
	}
}
