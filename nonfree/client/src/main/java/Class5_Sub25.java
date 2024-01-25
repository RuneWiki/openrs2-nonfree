import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class5_Sub25 extends Class5 {

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "Lclient!as;")
	private Class19 aClass19_4;

	@OriginalMember(owner = "client!hl", name = "F", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!hl", name = "G", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!hl", name = "C", descriptor = "Lclient!vh;")
	private final Class131_Sub3 aClass131_Sub3_1;

	@OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
	public final int anInt3601;

	@OriginalMember(owner = "client!hl", name = "B", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_10;

	@OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
	public final int anInt3600;

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
	public final int anInt3596;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "[I")
	private final int[] anIntArray266;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
	public final int anInt3593;

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "F")
	public final float aFloat167;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "Lclient!rca;")
	private final Class113_Sub2 aClass113_Sub2_1;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!vh;IIIII)V")
	public Class5_Sub25(@OriginalArg(0) Class131_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass131_Sub3_1 = arg0;
		this.anInt3601 = arg5;
		this.aClass62_Sub3_10 = this.aClass131_Sub3_1.aClass62_Sub3_41;
		this.anInt3600 = arg4;
		this.anInt3596 = arg3;
		this.anIntArray266 = new int[this.aClass131_Sub3_1.anInt8873 * this.aClass131_Sub3_1.anInt8871];
		this.anInt3593 = arg1;
		this.aFloat167 = arg2;
		this.aClass113_Sub2_1 = new Class113_Sub2(this.aClass62_Sub3_10, 5123, null, 1);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)V")
	public void method3146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray266[arg2 + this.aClass131_Sub3_1.anInt8873 * arg0] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)V")
	public void method3147(@OriginalArg(1) int arg0) {
		this.aStream6.b();
		@Pc(18) Interface11 local18 = this.aClass62_Sub3_10.method3977(this.aNativeHeapBuffer5, 4, arg0 * 4);
		this.aClass19_4 = new Class19(local18, 5121, 4, 0);
		this.aStream6 = null;
		this.aNativeHeapBuffer5 = null;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(BI)V")
	public void method3148(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass62_Sub3_10.aNativeHeap3.a(arg0 * 4, true);
		this.aStream6 = new Stream(this.aNativeHeapBuffer5);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)V")
	public void method3150(@OriginalArg(0) int arg0) {
		this.aStream6.c(arg0 * 4 + 3);
		this.aStream6.d(-1);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II[I)V")
	public void method3153(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class5_Sub3_Sub2 local11 = this.aClass62_Sub3_10.aClass5_Sub3_Sub2_3;
		local11.anInt4960 = 0;
		@Pc(36) short[] local36;
		@Pc(30) int local30;
		@Pc(41) int local41;
		@Pc(24) int local24;
		@Pc(50) int local50;
		@Pc(52) int local52;
		if (this.aClass62_Sub3_10.aBoolean278) {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local36 = this.aClass131_Sub3_1.aShortArrayArray9[local30];
				local41 = this.anIntArray266[local30];
				if (local41 != 0 && local36 != null) {
					local50 = 0;
					local52 = 0;
					while (local36.length > local52) {
						if ((0x1 << local50++ & local41) == 0) {
							local52 += 3;
						} else {
							local7++;
							local11.method4181(local36[local52++] & 0xFFFF);
							local11.method4181(local36[local52++] & 0xFFFF);
							local7++;
							local11.method4181(local36[local52++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local41 = this.anIntArray266[local30];
				local36 = this.aClass131_Sub3_1.aShortArrayArray9[local30];
				if (local41 != 0 && local36 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local36.length) {
						if ((0x1 << local50++ & local41) == 0) {
							local52 += 3;
						} else {
							local7++;
							local11.method4195(local36[local52++] & 0xFFFF);
							local7++;
							local11.method4195(local36[local52++] & 0xFFFF);
							local7++;
							local11.method4195(local36[local52++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass113_Sub2_1.method6017(local11.anInt4960, local11.aByteArray66);
		this.aClass62_Sub3_10.method4000(this.aClass131_Sub3_1.aClass19_14, this.aClass131_Sub3_1.aClass19_15, this.aClass19_4, this.aClass131_Sub3_1.aClass19_13);
		this.aClass62_Sub3_10.method3974((this.aClass131_Sub3_1.anInt8731 & 0x8) != 0, (this.aClass131_Sub3_1.anInt8731 & 0x7) != 0, this.anInt3593);
		if (this.aClass62_Sub3_10.aBoolean290) {
			this.aClass62_Sub3_10.JA(Integer.MAX_VALUE, this.anInt3596, this.anInt3600, this.anInt3601);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat167, 1.0F / this.aFloat167, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass62_Sub3_10.method4000(this.aClass131_Sub3_1.aClass19_14, this.aClass131_Sub3_1.aClass19_15, this.aClass19_4, this.aClass131_Sub3_1.aClass19_13);
		this.aClass62_Sub3_10.method3938(this.aClass113_Sub2_1, 0, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZFII)V")
	public void method3154(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24;
		@Pc(49) int local49;
		if (this.anInt3593 != -1) {
			@Pc(19) Class271 local19 = this.aClass62_Sub3_10.anInterface8_145.method7237(this.anInt3593);
			local24 = local19.aByte80 & 0xFF;
			@Pc(69) int local69;
			if (local24 != 0 && local19.aByte78 != 4) {
				if (arg0 < 0) {
					local49 = 0;
				} else if (arg0 <= 127) {
					local49 = arg0 * 131586;
				} else {
					local49 = 16777215;
				}
				if (local24 == 256) {
					arg2 = local49;
				} else {
					local69 = 256 - local24;
					arg2 = (local69 * (arg2 & 0xFF00FF) + local24 * (local49 & 0xFF00FF) & 0xFF00FF00) + (local69 * (arg2 & 0xFF00) + local24 * (local49 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local49 = local19.aByte83 & 0xFF;
			if (local49 != 0) {
				local49 += 256;
				@Pc(119) int local119 = local49 * (arg2 >> 16 & 0xFF);
				if (local119 > 65535) {
					local119 = 65535;
				}
				local69 = (arg2 >> 8 & 0xFF) * local49;
				if (local69 > 65535) {
					local69 = 65535;
				}
				@Pc(145) int local145 = (arg2 & 0xFF) * local49;
				if (local145 > 65535) {
					local145 = 65535;
				}
				arg2 = (local69 & 0xFF00) + (local119 << 8 & 0xFF0030) + (local145 >> 8);
			}
		}
		if (arg1 != 1.0F) {
			@Pc(181) int local181 = arg2 >> 16 & 0xFF;
			local24 = arg2 >> 8 & 0xFF;
			local49 = arg2 & 0xFF;
			local181 = (int) ((float) local181 * arg1);
			local24 = (int) ((float) local24 * arg1);
			if (local181 < 0) {
				local181 = 0;
			} else if (local181 > 255) {
				local181 = 255;
			}
			if (local24 < 0) {
				local24 = 0;
			} else if (local24 > 255) {
				local24 = 255;
			}
			local49 = (int) ((float) local49 * arg1);
			if (local49 < 0) {
				local49 = 0;
			} else if (local49 > 255) {
				local49 = 255;
			}
			arg2 = local181 << 16 | local24 << 8 | local49;
		}
		this.aStream6.c(arg3 * 4);
		this.aStream6.d((byte) (arg2 >> 16));
		this.aStream6.d((byte) (arg2 >> 8));
		this.aStream6.d((byte) arg2);
	}
}
