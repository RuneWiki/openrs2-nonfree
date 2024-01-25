import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gka")
public final class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!gka", name = "m", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer2;

	@OriginalMember(owner = "client!gka", name = "r", descriptor = "Lclient!ib;")
	private Class170 aClass170_11;

	@OriginalMember(owner = "client!gka", name = "C", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!gka", name = "n", descriptor = "Lclient!gba;")
	private final Class133_Sub1 aClass133_Sub1_2;

	@OriginalMember(owner = "client!gka", name = "D", descriptor = "I")
	public final int anInt3394;

	@OriginalMember(owner = "client!gka", name = "s", descriptor = "F")
	public final float aFloat45;

	@OriginalMember(owner = "client!gka", name = "z", descriptor = "I")
	public final int anInt3391;

	@OriginalMember(owner = "client!gka", name = "x", descriptor = "I")
	public final int anInt3399;

	@OriginalMember(owner = "client!gka", name = "q", descriptor = "[I")
	private final int[] anIntArray269;

	@OriginalMember(owner = "client!gka", name = "u", descriptor = "I")
	public final int anInt3392;

	@OriginalMember(owner = "client!gka", name = "B", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_15;

	@OriginalMember(owner = "client!gka", name = "p", descriptor = "Lclient!id;")
	private final Class172_Sub1 aClass172_Sub1_1;

	@OriginalMember(owner = "client!gka", name = "<init>", descriptor = "(Lclient!gba;IIIII)V")
	public Class2_Sub29(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass133_Sub1_2 = arg0;
		this.anInt3394 = arg5;
		this.aFloat45 = (float) arg2;
		this.anInt3391 = arg1;
		this.anInt3399 = arg3;
		this.anIntArray269 = new int[this.aClass133_Sub1_2.anInt9315 * this.aClass133_Sub1_2.anInt9318];
		this.anInt3392 = arg4;
		this.aClass145_Sub3_15 = this.aClass133_Sub1_2.aClass145_Sub3_14;
		this.aClass172_Sub1_1 = new Class172_Sub1(this.aClass145_Sub3_15, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!gka", name = "b", descriptor = "(II)V")
	public void method2967(@OriginalArg(0) int arg0) {
		this.aStream4.a();
		@Pc(18) Interface13 local18 = this.aClass145_Sub3_15.method8895(arg0 * 4, this.aNativeHeapBuffer2, 4);
		this.aClass170_11 = new Class170(local18, 5121, 4, 0);
		this.aNativeHeapBuffer2 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(II)V")
	public void method2968(@OriginalArg(1) int arg0) {
		this.aStream4.a(arg0 * 4 + 3);
		this.aStream4.c(-1);
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(I[II)V")
	public void method2969(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class2_Sub20_Sub1 local11 = this.aClass145_Sub3_15.aClass2_Sub20_Sub1_3;
		local11.anInt9723 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(20) int local20;
		@Pc(45) int local45;
		@Pc(47) int local47;
		if (this.aClass145_Sub3_15.aBoolean872) {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local32 = this.aClass133_Sub1_2.aShortArrayArray3[local26];
				local37 = this.anIntArray269[local26];
				if (local37 != 0 && local32 != null) {
					local45 = 0;
					local47 = 0;
					while (local47 < local32.length) {
						if ((local37 & 0x1 << local45++) == 0) {
							local47 += 3;
						} else {
							local7++;
							local11.method8551(local32[local47++] & 0xFFFF);
							local7++;
							local11.method8551(local32[local47++] & 0xFFFF);
							local11.method8551(local32[local47++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local37 = this.anIntArray269[local26];
				local32 = this.aClass133_Sub1_2.aShortArrayArray3[local26];
				if (local37 != 0 && local32 != null) {
					local45 = 0;
					local47 = 0;
					while (local47 < local32.length) {
						if ((0x1 << local45++ & local37) == 0) {
							local47 += 3;
						} else {
							local7++;
							local11.method8589(local32[local47++] & 0xFFFF);
							local11.method8589(local32[local47++] & 0xFFFF);
							local7++;
							local11.method8589(local32[local47++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass172_Sub1_1.method7099(local11.aByteArray111, local11.anInt9723);
		this.aClass145_Sub3_15.method8874(this.aClass170_11, this.aClass133_Sub1_2.aClass170_9, this.aClass133_Sub1_2.aClass170_7, this.aClass133_Sub1_2.aClass170_8);
		this.aClass145_Sub3_15.method8924(this.anInt3391, (this.aClass133_Sub1_2.anInt3208 & 0x7) != 0, (this.aClass133_Sub1_2.anInt3208 & 0x8) != 0);
		if (this.aClass145_Sub3_15.aBoolean868) {
			this.aClass145_Sub3_15.EA(Integer.MAX_VALUE, this.anInt3399, this.anInt3392, this.anInt3394);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat45, 1.0F / this.aFloat45, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass145_Sub3_15.method8874(this.aClass170_11, this.aClass133_Sub1_2.aClass170_9, this.aClass133_Sub1_2.aClass170_7, this.aClass133_Sub1_2.aClass170_8);
		this.aClass145_Sub3_15.method8921(local7, 0, this.aClass172_Sub1_1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(IB)V")
	public void method2970(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer2 = this.aClass145_Sub3_15.aNativeHeap5.a(arg0 * 4, true);
		this.aStream4 = new Stream(this.aNativeHeapBuffer2);
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(IIIIF)V")
	public void method2971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3) {
		@Pc(18) int local18;
		@Pc(41) int local41;
		if (this.anInt3391 != -1) {
			@Pc(13) Class8 local13 = this.aClass145_Sub3_15.anInterface3_12.method2857(this.anInt3391);
			local18 = local13.aByte13 & 0xFF;
			@Pc(61) int local61;
			if (local18 != 0 && local13.aByte15 != 4) {
				if (arg1 < 0) {
					local41 = 0;
				} else if (arg1 > 127) {
					local41 = 16777215;
				} else {
					local41 = arg1 * 131586;
				}
				if (local18 == 256) {
					arg0 = local41;
				} else {
					local61 = 256 - local18;
					arg0 = (local61 * (arg0 & 0xFF00FF) + (local41 & 0xFF00FF) * local18 & 0xFF00FF00) + ((arg0 & 0xFF00) * local61 + (local41 & 0xFF00) * local18 & 0xFF0000) >> 8;
				}
			}
			local41 = local13.aByte12 & 0xFF;
			if (local41 != 0) {
				local41 += 256;
				@Pc(112) int local112 = local41 * (arg0 >> 16 & 0xFF);
				if (local112 > 65535) {
					local112 = 65535;
				}
				local61 = (arg0 >> 8 & 0xFF) * local41;
				if (local61 > 65535) {
					local61 = 65535;
				}
				@Pc(136) int local136 = local41 * (arg0 & 0xFF);
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg0 = (local61 & 0xFF00) + (local112 << 8 & 0xFF00F8) + (local136 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(170) int local170 = arg0 >> 16 & 0xFF;
			local18 = arg0 >> 8 & 0xFF;
			local41 = arg0 & 0xFF;
			local170 = (int) ((float) local170 * arg3);
			local18 = (int) ((float) local18 * arg3);
			if (local170 < 0) {
				local170 = 0;
			} else if (local170 > 255) {
				local170 = 255;
			}
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local41 = (int) ((float) local41 * arg3);
			if (local41 < 0) {
				local41 = 0;
			} else if (local41 > 255) {
				local41 = 255;
			}
			arg0 = local41 | local18 << 8 | local170 << 16;
		}
		this.aStream4.a(arg2 * 4);
		this.aStream4.c((byte) (arg0 >> 16));
		this.aStream4.c((byte) (arg0 >> 8));
		this.aStream4.c((byte) arg0);
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(IIII)V")
	public void method2972(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray269[arg2 * this.aClass133_Sub1_2.anInt9318 + arg0] |= 0x1 << arg1;
	}
}
