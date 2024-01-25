import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class8_Sub36 extends Class8 {

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "Lclient!pw;")
	private Class268 aClass268_11;

	@OriginalMember(owner = "client!ni", name = "D", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Lclient!eo;")
	private final Class86_Sub1 aClass86_Sub1_2;

	@OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
	public final int anInt6979;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
	public final int anInt6971;

	@OriginalMember(owner = "client!ni", name = "I", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_30;

	@OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
	public final int anInt6982;

	@OriginalMember(owner = "client!ni", name = "H", descriptor = "[I")
	private final int[] anIntArray390;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
	public final int anInt6974;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "F")
	public final float aFloat148;

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "Lclient!ht;")
	private final Class53_Sub1 aClass53_Sub1_1;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!eo;IIIII)V")
	public Class8_Sub36(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass86_Sub1_2 = arg0;
		this.anInt6979 = arg3;
		this.anInt6971 = arg4;
		this.aClass16_Sub3_30 = this.aClass86_Sub1_2.aClass16_Sub3_15;
		this.anInt6982 = arg1;
		this.anIntArray390 = new int[this.aClass86_Sub1_2.anInt9955 * this.aClass86_Sub1_2.anInt9953];
		this.anInt6974 = arg5;
		this.aFloat148 = arg2;
		this.aClass53_Sub1_1 = new Class53_Sub1(this.aClass16_Sub3_30, 5123, null, 1);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
	public void method5728(@OriginalArg(1) int arg0) {
		this.aStream6.b();
		@Pc(22) Interface9 local22 = this.aClass16_Sub3_30.method6006(4, arg0 * 4, this.aNativeHeapBuffer6);
		this.aClass268_11 = new Class268(local22, 5121, 4, 0);
		this.aStream6 = null;
		this.aNativeHeapBuffer6 = null;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)V")
	public void method5731(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass16_Sub3_30.aNativeHeap5.a(arg0 * 4, true);
		this.aStream6 = new Stream(this.aNativeHeapBuffer6);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIII)V")
	public void method5732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray390[arg2 * this.aClass86_Sub1_2.anInt9955 + arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIFI)V")
	public void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(35) int local35;
		if (this.anInt6982 != -1) {
			@Pc(17) Class218 local17 = this.aClass16_Sub3_30.anInterface2_12.method4027(this.anInt6982);
			local22 = local17.aByte63 & 0xFF;
			@Pc(58) int local58;
			if (local22 != 0 && local17.aByte66 != 4) {
				if (arg1 < 0) {
					local35 = 0;
				} else if (arg1 <= 127) {
					local35 = arg1 * 131586;
				} else {
					local35 = 16777215;
				}
				if (local22 == 256) {
					arg0 = local35;
				} else {
					local58 = 256 - local22;
					arg0 = ((local35 & 0xFF00) * local22 + local58 * (arg0 & 0xFF00) & 0xFF0000) + ((arg0 & 0xFF00FF) * local58 + local22 * (local35 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local35 = local17.aByte68 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(108) int local108 = (arg0 >> 16 & 0xFF) * local35;
				if (local108 > 65535) {
					local108 = 65535;
				}
				local58 = local35 * (arg0 >> 8 & 0xFF);
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(132) int local132 = local35 * (arg0 & 0xFF);
				if (local132 > 65535) {
					local132 = 65535;
				}
				arg0 = (local132 >> 8) + (local58 & 0xFF00) + (local108 << 8 & 0xFF00B2);
			}
		}
		this.aStream6.a(arg3 * 4);
		if (arg2 != 1.0F) {
			@Pc(173) int local173 = arg0 >> 16 & 0xFF;
			local22 = arg0 >> 8 & 0xFF;
			local35 = arg0 & 0xFF;
			local173 = (int) ((float) local173 * arg2);
			local22 = (int) ((float) local22 * arg2);
			if (local173 < 0) {
				local173 = 0;
			} else if (local173 > 255) {
				local173 = 255;
			}
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			local35 = (int) ((float) local35 * arg2);
			if (local35 < 0) {
				local35 = 0;
			} else if (local35 > 255) {
				local35 = 255;
			}
			arg0 = local35 | local22 << 8 | local173 << 16;
		}
		this.aStream6.b((byte) (arg0 >> 16));
		this.aStream6.b((byte) (arg0 >> 8));
		this.aStream6.b((byte) arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[I)V")
	public void method5734(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(16) int local16 = 0;
		@Pc(20) Class8_Sub8_Sub1 local20 = this.aClass16_Sub3_30.aClass8_Sub8_Sub1_2;
		local20.anInt10588 = 0;
		@Pc(46) short[] local46;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(29) int local29;
		@Pc(55) int local55;
		@Pc(57) int local57;
		if (this.aClass16_Sub3_30.aBoolean519) {
			for (local29 = 0; local29 < arg0; local29++) {
				local35 = arg1[local29];
				local40 = this.anIntArray390[local35];
				local46 = this.aClass86_Sub1_2.aShortArrayArray5[local35];
				if (local40 != 0 && local46 != null) {
					local55 = 0;
					local57 = 0;
					while (local46.length > local57) {
						if ((0x1 << local55++ & local40) == 0) {
							local57 += 3;
						} else {
							local20.method8548(local46[local57++] & 0xFFFF);
							local16++;
							local20.method8548(local46[local57++] & 0xFFFF);
							local16++;
							local16++;
							local20.method8548(local46[local57++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local29 = 0; local29 < arg0; local29++) {
				local35 = arg1[local29];
				local40 = this.anIntArray390[local35];
				local46 = this.aClass86_Sub1_2.aShortArrayArray5[local35];
				if (local40 != 0 && local46 != null) {
					local55 = 0;
					local57 = 0;
					while (local57 < local46.length) {
						if ((0x1 << local55++ & local40) == 0) {
							local57 += 3;
						} else {
							local20.method8534(local46[local57++] & 0xFFFF);
							local16++;
							local20.method8534(local46[local57++] & 0xFFFF);
							local16++;
							local16++;
							local20.method8534(local46[local57++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local16 <= 0) {
			return;
		}
		this.aClass53_Sub1_1.method5438(local20.aByteArray107, local20.anInt10588);
		this.aClass16_Sub3_30.method5988(this.aClass268_11, this.aClass86_Sub1_2.aClass268_4, this.aClass86_Sub1_2.aClass268_3, this.aClass86_Sub1_2.aClass268_2);
		this.aClass16_Sub3_30.method5976(this.anInt6982, (this.aClass86_Sub1_2.anInt3513 & 0x8) != 0, (this.aClass86_Sub1_2.anInt3513 & 0x7) != 0);
		if (this.aClass16_Sub3_30.aBoolean525) {
			this.aClass16_Sub3_30.EA(Integer.MAX_VALUE, this.anInt6979, this.anInt6971, this.anInt6974);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat148, 1.0F / this.aFloat148, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass16_Sub3_30.method5988(this.aClass268_11, this.aClass86_Sub1_2.aClass268_4, this.aClass86_Sub1_2.aClass268_3, this.aClass86_Sub1_2.aClass268_2);
		this.aClass16_Sub3_30.method5992(local16, this.aClass53_Sub1_1, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V")
	public void method5735(@OriginalArg(0) int arg0) {
		this.aStream6.a(arg0 * 4 + 3);
		this.aStream6.b(-1);
	}
}
