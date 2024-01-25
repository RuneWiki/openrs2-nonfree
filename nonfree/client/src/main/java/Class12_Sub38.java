import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class12_Sub38 extends Class12 {

	@OriginalMember(owner = "client!nda", name = "o", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!nda", name = "p", descriptor = "Lclient!dd;")
	private Class65 aClass65_6;

	@OriginalMember(owner = "client!nda", name = "E", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!nda", name = "z", descriptor = "Lclient!ql;")
	private final Class215_Sub2 aClass215_Sub2_1;

	@OriginalMember(owner = "client!nda", name = "q", descriptor = "I")
	public final int anInt6074;

	@OriginalMember(owner = "client!nda", name = "w", descriptor = "F")
	public final float aFloat126;

	@OriginalMember(owner = "client!nda", name = "s", descriptor = "I")
	public final int anInt6076;

	@OriginalMember(owner = "client!nda", name = "u", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_22;

	@OriginalMember(owner = "client!nda", name = "A", descriptor = "I")
	public final int anInt6080;

	@OriginalMember(owner = "client!nda", name = "r", descriptor = "I")
	public final int anInt6075;

	@OriginalMember(owner = "client!nda", name = "x", descriptor = "[I")
	private final int[] anIntArray426;

	@OriginalMember(owner = "client!nda", name = "n", descriptor = "Lclient!uba;")
	private final Class168_Sub2 aClass168_Sub2_2;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!ql;IIIII)V")
	public Class12_Sub38(@OriginalArg(0) Class215_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass215_Sub2_1 = arg0;
		this.anInt6074 = arg1;
		this.aFloat126 = arg2;
		this.anInt6076 = arg3;
		this.aClass42_Sub3_22 = this.aClass215_Sub2_1.aClass42_Sub3_31;
		this.anInt6080 = arg5;
		this.anInt6075 = arg4;
		this.anIntArray426 = new int[this.aClass215_Sub2_1.anInt9452 * this.aClass215_Sub2_1.anInt9450];
		this.aClass168_Sub2_2 = new Class168_Sub2(this.aClass42_Sub3_22, 5123, null, 1);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)V")
	public void method5089(@OriginalArg(1) int arg0) {
		this.aStream5.e(arg0 * 4 + 3);
		this.aStream5.c(-1);
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(II)V")
	public void method5090(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass42_Sub3_22.aNativeHeap3.a(arg0 * 4, true);
		this.aStream5 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIII)V")
	public void method5091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray426[arg0 * this.aClass215_Sub2_1.anInt9452 + arg2] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "([III)V")
	public void method5092(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = 0;
		@Pc(15) Class12_Sub8_Sub1 local15 = this.aClass42_Sub3_22.aClass12_Sub8_Sub1_1;
		local15.anInt6217 = 0;
		@Pc(41) short[] local41;
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(24) int local24;
		@Pc(50) int local50;
		@Pc(52) int local52;
		if (this.aClass42_Sub3_22.aBoolean292) {
			for (local24 = 0; local24 < arg1; local24++) {
				local30 = arg0[local24];
				local35 = this.anIntArray426[local30];
				local41 = this.aClass215_Sub2_1.aShortArrayArray7[local30];
				if (local35 != 0 && local41 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local41.length) {
						if ((0x1 << local50++ & local35) == 0) {
							local52 += 3;
						} else {
							local11++;
							local15.method5190(local41[local52++] & 0xFFFF);
							local15.method5190(local41[local52++] & 0xFFFF);
							local11++;
							local11++;
							local15.method5190(local41[local52++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local24 = 0; local24 < arg1; local24++) {
				local30 = arg0[local24];
				local35 = this.anIntArray426[local30];
				local41 = this.aClass215_Sub2_1.aShortArrayArray7[local30];
				if (local35 != 0 && local41 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local41.length) {
						if ((local35 & 0x1 << local50++) == 0) {
							local52 += 3;
						} else {
							local15.method5201(local41[local52++] & 0xFFFF);
							local11++;
							local11++;
							local15.method5201(local41[local52++] & 0xFFFF);
							local11++;
							local15.method5201(local41[local52++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local11 <= 0) {
			return;
		}
		this.aClass168_Sub2_2.method7247(local15.aByteArray82, local15.anInt6217);
		this.aClass42_Sub3_22.method3241(this.aClass65_6, this.aClass215_Sub2_1.aClass65_8, this.aClass215_Sub2_1.aClass65_10, this.aClass215_Sub2_1.aClass65_7);
		this.aClass42_Sub3_22.method3239((this.aClass215_Sub2_1.anInt7590 & 0x7) != 0, this.anInt6074, (this.aClass215_Sub2_1.anInt7590 & 0x8) != 0);
		if (this.aClass42_Sub3_22.aBoolean294) {
			this.aClass42_Sub3_22.JA(Integer.MAX_VALUE, this.anInt6076, this.anInt6075, this.anInt6080);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat126, 1.0F / this.aFloat126, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass42_Sub3_22.method3241(this.aClass65_6, this.aClass215_Sub2_1.aClass65_8, this.aClass215_Sub2_1.aClass65_10, this.aClass215_Sub2_1.aClass65_7);
		this.aClass42_Sub3_22.method3227(this.aClass168_Sub2_2, local11, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "(II)V")
	public void method5094(@OriginalArg(1) int arg0) {
		this.aStream5.a();
		@Pc(20) Interface14 local20 = this.aClass42_Sub3_22.method3244(4, arg0 * 4, this.aNativeHeapBuffer4);
		this.aClass65_6 = new Class65(local20, 5121, 4, 0);
		this.aNativeHeapBuffer4 = null;
		this.aStream5 = null;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIF)V")
	public void method5095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3) {
		@Pc(28) int local28;
		@Pc(43) int local43;
		if (this.anInt6074 != -1) {
			@Pc(23) Class278 local23 = this.aClass42_Sub3_22.anInterface11_11.method6215(this.anInt6074);
			local28 = local23.aByte84 & 0xFF;
			@Pc(71) int local71;
			if (local28 != 0 && local23.aByte87 != 4) {
				if (arg2 < 0) {
					local43 = 0;
				} else if (arg2 <= 127) {
					local43 = arg2 * 131586;
				} else {
					local43 = 16777215;
				}
				if (local28 == 256) {
					arg0 = local43;
				} else {
					local71 = 256 - local28;
					arg0 = (local28 * (local43 & 0xFF00FF) + local71 * (arg0 & 0xFF00FF) & 0xFF00FF00) + ((arg0 & 0xFF00) * local71 + (local43 & 0xFF00) * local28 & 0xFF0000) >> 8;
				}
			}
			local43 = local23.aByte85 & 0xFF;
			if (local43 != 0) {
				local43 += 256;
				@Pc(121) int local121 = (arg0 >> 16 & 0xFF) * local43;
				if (local121 > 65535) {
					local121 = 65535;
				}
				local71 = local43 * (arg0 >> 8 & 0xFF);
				if (local71 > 65535) {
					local71 = 65535;
				}
				@Pc(147) int local147 = (arg0 & 0xFF) * local43;
				if (local147 > 65535) {
					local147 = 65535;
				}
				arg0 = (local71 & 0xFF00) + (local121 << 8 & 0xFF0052) + (local147 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(177) int local177 = arg0 >> 16 & 0xFF;
			local28 = arg0 >> 8 & 0xFF;
			local43 = arg0 & 0xFF;
			local177 = (int) ((float) local177 * arg3);
			local28 = (int) ((float) local28 * arg3);
			if (local177 < 0) {
				local177 = 0;
			} else if (local177 > 255) {
				local177 = 255;
			}
			if (local28 < 0) {
				local28 = 0;
			} else if (local28 > 255) {
				local28 = 255;
			}
			local43 = (int) ((float) local43 * arg3);
			if (local43 < 0) {
				local43 = 0;
			} else if (local43 > 255) {
				local43 = 255;
			}
			arg0 = local28 << 8 | local177 << 16 | local43;
		}
		this.aStream5.e(arg1 * 4);
		this.aStream5.c((byte) (arg0 >> 16));
		this.aStream5.c((byte) (arg0 >> 8));
		this.aStream5.c((byte) arg0);
	}
}
