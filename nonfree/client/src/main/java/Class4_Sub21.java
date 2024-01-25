import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class4_Sub21 extends Class4 {

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "Lclient!gda;")
	private Class117 aClass117_7;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "Lclient!sm;")
	private final Class16_Sub3 aClass16_Sub3_2;

	@OriginalMember(owner = "client!gn", name = "B", descriptor = "F")
	public final float aFloat63;

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
	public final int anInt3723;

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_13;

	@OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
	public final int anInt3722;

	@OriginalMember(owner = "client!gn", name = "C", descriptor = "I")
	public final int anInt3725;

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
	public final int anInt3721;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "[I")
	private final int[] anIntArray362;

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "Lclient!fl;")
	private final Class20_Sub2 aClass20_Sub2_1;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!sm;IIIII)V")
	public Class4_Sub21(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass16_Sub3_2 = arg0;
		this.aFloat63 = arg2;
		this.anInt3723 = arg5;
		this.aClass66_Sub3_13 = this.aClass16_Sub3_2.aClass66_Sub3_35;
		this.anInt3722 = arg3;
		this.anInt3725 = arg4;
		this.anInt3721 = arg1;
		this.anIntArray362 = new int[this.aClass16_Sub3_2.anInt9839 * this.aClass16_Sub3_2.anInt9838];
		this.aClass20_Sub2_1 = new Class20_Sub2(this.aClass66_Sub3_13, 5123, null, 1);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)V")
	public void method3305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray362[this.aClass16_Sub3_2.anInt9838 * arg2 + arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V")
	public void method3306(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer7 = this.aClass66_Sub3_13.aNativeHeap4.a(arg0 * 4, true);
		this.aStream6 = new Stream(this.aNativeHeapBuffer7);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIFI)V")
	public void method3308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(25) int local25;
		@Pc(38) int local38;
		if (this.anInt3721 != -1) {
			@Pc(20) Class271 local20 = this.aClass66_Sub3_13.anInterface3_15.method7249(this.anInt3721);
			local25 = local20.aByte82 & 0xFF;
			@Pc(67) int local67;
			if (local25 != 0 && local20.aByte84 != 4) {
				if (arg1 < 0) {
					local38 = 0;
				} else if (arg1 > 127) {
					local38 = 16777215;
				} else {
					local38 = arg1 * 131586;
				}
				if (local25 == 256) {
					arg0 = local38;
				} else {
					local67 = 256 - local25;
					arg0 = ((local38 & 0xFF00) * local25 + (arg0 & 0xFF00) * local67 & 0xFF0000) + ((local38 & 0xFF00FF) * local25 + local67 * (arg0 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local38 = local20.aByte80 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(117) int local117 = local38 * (arg0 >> 16 & 0xFF);
				if (local117 > 65535) {
					local117 = 65535;
				}
				local67 = (arg0 >> 8 & 0xFF) * local38;
				if (local67 > 65535) {
					local67 = 65535;
				}
				@Pc(143) int local143 = (arg0 & 0xFF) * local38;
				if (local143 > 65535) {
					local143 = 65535;
				}
				arg0 = (local67 & 0xFF00) + ((local117 << 8 & 0xFF000C) + (local143 >> 8));
			}
		}
		this.aStream6.d(arg3 * 4);
		if (arg2 != 1.0F) {
			@Pc(179) int local179 = arg0 >> 16 & 0xFF;
			local25 = arg0 >> 8 & 0xFF;
			local179 = (int) ((float) local179 * arg2);
			local38 = arg0 & 0xFF;
			local25 = (int) ((float) local25 * arg2);
			if (local179 < 0) {
				local179 = 0;
			} else if (local179 > 255) {
				local179 = 255;
			}
			if (local25 < 0) {
				local25 = 0;
			} else if (local25 > 255) {
				local25 = 255;
			}
			local38 = (int) ((float) local38 * arg2);
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			arg0 = local25 << 8 | local179 << 16 | local38;
		}
		this.aStream6.f((byte) (arg0 >> 16));
		this.aStream6.f((byte) (arg0 >> 8));
		this.aStream6.f((byte) arg0);
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)V")
	public void method3309(@OriginalArg(1) int arg0) {
		this.aStream6.c();
		@Pc(18) Interface10 local18 = this.aClass66_Sub3_13.method5360(arg0 * 4, 4, this.aNativeHeapBuffer7);
		this.aClass117_7 = new Class117(local18, 5121, 4, 0);
		this.aStream6 = null;
		this.aNativeHeapBuffer7 = null;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[II)V")
	public void method3310(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class4_Sub9_Sub2 local11 = this.aClass66_Sub3_13.aClass4_Sub9_Sub2_2;
		local11.anInt7219 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(20) int local20;
		@Pc(46) int local46;
		@Pc(48) int local48;
		if (this.aClass66_Sub3_13.aBoolean476) {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local32 = this.aClass16_Sub3_2.aShortArrayArray32[local26];
				local37 = this.anIntArray362[local26];
				if (local37 != 0 && local32 != null) {
					local46 = 0;
					local48 = 0;
					while (local32.length > local48) {
						if ((0x1 << local46++ & local37) == 0) {
							local48 += 3;
						} else {
							local7++;
							local11.method6012(local32[local48++] & 0xFFFF);
							local7++;
							local11.method6012(local32[local48++] & 0xFFFF);
							local7++;
							local11.method6012(local32[local48++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local32 = this.aClass16_Sub3_2.aShortArrayArray32[local26];
				local37 = this.anIntArray362[local26];
				if (local37 != 0 && local32 != null) {
					local46 = 0;
					local48 = 0;
					while (local32.length > local48) {
						if ((local37 & 0x1 << local46++) == 0) {
							local48 += 3;
						} else {
							local7++;
							local11.method5989(local32[local48++] & 0xFFFF);
							local7++;
							local11.method5989(local32[local48++] & 0xFFFF);
							local7++;
							local11.method5989(local32[local48++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass20_Sub2_1.method6570(local11.anInt7219, local11.aByteArray97);
		this.aClass66_Sub3_13.method5413(this.aClass117_7, this.aClass16_Sub3_2.aClass117_15, this.aClass16_Sub3_2.aClass117_13, this.aClass16_Sub3_2.aClass117_14);
		this.aClass66_Sub3_13.method5374((this.aClass16_Sub3_2.anInt8173 & 0x7) != 0, this.anInt3721, (this.aClass16_Sub3_2.anInt8173 & 0x8) != 0);
		if (this.aClass66_Sub3_13.aBoolean490) {
			this.aClass66_Sub3_13.LA(Integer.MAX_VALUE, this.anInt3722, this.anInt3725, this.anInt3723);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat63, 1.0F / this.aFloat63, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass66_Sub3_13.method5413(this.aClass117_7, this.aClass16_Sub3_2.aClass117_15, this.aClass16_Sub3_2.aClass117_13, this.aClass16_Sub3_2.aClass117_14);
		this.aClass66_Sub3_13.method5357(0, this.aClass20_Sub2_1, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BI)V")
	public void method3311(@OriginalArg(1) int arg0) {
		this.aStream6.d(arg0 * 4 + 3);
		this.aStream6.f(-1);
	}
}
