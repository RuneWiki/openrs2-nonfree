import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class5_Sub27 extends Class5 {

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!jm", name = "B", descriptor = "Lclient!uo;")
	private Class356 aClass356_11;

	@OriginalMember(owner = "client!jm", name = "A", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_1;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
	public final int anInt4912;

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
	public final int anInt4908;

	@OriginalMember(owner = "client!jm", name = "C", descriptor = "F")
	public final float aFloat66;

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_17;

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
	public final int anInt4914;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
	public final int anInt4909;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "[I")
	private final int[] anIntArray274;

	@OriginalMember(owner = "client!jm", name = "r", descriptor = "Lclient!kfa;")
	private final Class38_Sub2 aClass38_Sub2_2;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!aq;IIIII)V")
	public Class5_Sub27(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass22_Sub1_1 = arg0;
		this.anInt4912 = arg3;
		this.anInt4908 = arg5;
		this.aFloat66 = (float) arg2;
		this.aClass57_Sub2_17 = this.aClass22_Sub1_1.aClass57_Sub2_1;
		this.anInt4914 = arg1;
		this.anInt4909 = arg4;
		this.anIntArray274 = new int[this.aClass22_Sub1_1.anInt9376 * this.aClass22_Sub1_1.anInt9375];
		this.aClass38_Sub2_2 = new Class38_Sub2(this.aClass57_Sub2_17, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)V")
	public void method4159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray274[this.aClass22_Sub1_1.anInt9376 * arg0 + arg1] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIFI)V")
	public void method4160(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23;
		@Pc(49) int local49;
		if (this.anInt4914 != -1) {
			@Pc(18) Class233 local18 = this.aClass57_Sub2_17.anInterface1_11.method2863(this.anInt4914);
			local23 = local18.aByte97 & 0xFF;
			@Pc(73) int local73;
			if (local23 != 0 && local18.aByte94 != 4) {
				if (arg3 < 0) {
					local49 = 0;
				} else if (arg3 > 127) {
					local49 = 16777215;
				} else {
					local49 = arg3 * 131586;
				}
				if (local23 == 256) {
					arg1 = local49;
				} else {
					local73 = 256 - local23;
					arg1 = ((arg1 & 0xFF00) * local73 + (local49 & 0xFF00) * local23 & 0xFF0000) + ((local49 & 0xFF00FF) * local23 + (arg1 & 0xFF00FF) * local73 & 0xFF00FF00) >> 8;
				}
			}
			local49 = local18.aByte98 & 0xFF;
			if (local49 != 0) {
				local49 += 256;
				@Pc(122) int local122 = local49 * (arg1 >> 16 & 0xFF);
				if (local122 > 65535) {
					local122 = 65535;
				}
				local73 = local49 * (arg1 >> 8 & 0xFF);
				if (local73 > 65535) {
					local73 = 65535;
				}
				@Pc(148) int local148 = local49 * (arg1 & 0xFF);
				if (local148 > 65535) {
					local148 = 65535;
				}
				arg1 = (local73 & 0xFF00) + ((local122 & 0xE100FF00) << 8) + (local148 >> 8);
			}
		}
		this.aStream1.b(arg0 * 4);
		if (arg2 != 1.0F) {
			@Pc(186) int local186 = arg1 >> 16 & 0xFF;
			local23 = arg1 >> 8 & 0xFF;
			local186 = (int) ((float) local186 * arg2);
			local49 = arg1 & 0xFF;
			if (local186 < 0) {
				local186 = 0;
			} else if (local186 > 255) {
				local186 = 255;
			}
			local23 = (int) ((float) local23 * arg2);
			local49 = (int) ((float) local49 * arg2);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			if (local49 < 0) {
				local49 = 0;
			} else if (local49 > 255) {
				local49 = 255;
			}
			arg1 = local186 << 16 | local23 << 8 | local49;
		}
		this.aStream1.a((byte) (arg1 >> 16));
		this.aStream1.a((byte) (arg1 >> 8));
		this.aStream1.a((byte) arg1);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B[II)V")
	public void method4161(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = 0;
		@Pc(20) Class5_Sub23_Sub1 local20 = this.aClass57_Sub2_17.aClass5_Sub23_Sub1_1;
		local20.anInt9869 = 0;
		@Pc(46) short[] local46;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(29) int local29;
		@Pc(57) int local57;
		@Pc(59) int local59;
		if (this.aClass57_Sub2_17.aBoolean216) {
			for (local29 = 0; local29 < arg1; local29++) {
				local35 = arg0[local29];
				local40 = this.anIntArray274[local35];
				local46 = this.aClass22_Sub1_1.aShortArrayArray1[local35];
				if (local40 != 0 && local46 != null) {
					local57 = 0;
					local59 = 0;
					while (local46.length > local59) {
						if ((local40 & 0x1 << local57++) == 0) {
							local59 += 3;
						} else {
							local16++;
							local20.method8480(local46[local59++] & 0xFFFF);
							local20.method8480(local46[local59++] & 0xFFFF);
							local16++;
							local16++;
							local20.method8480(local46[local59++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local29 = 0; local29 < arg1; local29++) {
				local35 = arg0[local29];
				local40 = this.anIntArray274[local35];
				local46 = this.aClass22_Sub1_1.aShortArrayArray1[local35];
				if (local40 != 0 && local46 != null) {
					local57 = 0;
					local59 = 0;
					while (local59 < local46.length) {
						if ((0x1 << local57++ & local40) == 0) {
							local59 += 3;
						} else {
							local16++;
							local20.method8539(local46[local59++] & 0xFFFF);
							local16++;
							local20.method8539(local46[local59++] & 0xFFFF);
							local20.method8539(local46[local59++] & 0xFFFF);
							local16++;
						}
					}
				}
			}
		}
		if (local16 <= 0) {
			return;
		}
		this.aClass38_Sub2_2.method8198(local20.aByteArray102, local20.anInt9869);
		this.aClass57_Sub2_17.method2353(this.aClass22_Sub1_1.aClass356_4, this.aClass22_Sub1_1.aClass356_1, this.aClass356_11, this.aClass22_Sub1_1.aClass356_3);
		this.aClass57_Sub2_17.method2330((this.aClass22_Sub1_1.anInt378 & 0x8) != 0, (this.aClass22_Sub1_1.anInt378 & 0x7) != 0, this.anInt4914);
		if (this.aClass57_Sub2_17.aBoolean210) {
			this.aClass57_Sub2_17.EA(Integer.MAX_VALUE, this.anInt4912, this.anInt4909, this.anInt4908);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat66, 1.0F / this.aFloat66, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass57_Sub2_17.method2353(this.aClass22_Sub1_1.aClass356_4, this.aClass22_Sub1_1.aClass356_1, this.aClass356_11, this.aClass22_Sub1_1.aClass356_3);
		this.aClass57_Sub2_17.method2323(this.aClass38_Sub2_2, local16, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BI)V")
	public void method4162(@OriginalArg(1) int arg0) {
		this.aStream1.c();
		@Pc(23) Interface15 local23 = this.aClass57_Sub2_17.method2344(this.aNativeHeapBuffer4, arg0 * 4, 4);
		this.aClass356_11 = new Class356(local23, 5121, 4, 0);
		this.aStream1 = null;
		this.aNativeHeapBuffer4 = null;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(II)V")
	public void method4163(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer4 = this.aClass57_Sub2_17.aNativeHeap2.a(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer4);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V")
	public void method4164(@OriginalArg(1) int arg0) {
		this.aStream1.b(arg0 * 4 + 3);
		this.aStream1.a(-1);
	}
}
