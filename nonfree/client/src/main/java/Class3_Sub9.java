import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "Lclient!jaa;")
	private Class164 aClass164_5;

	@OriginalMember(owner = "client!ct", name = "A", descriptor = "Lclient!mt;")
	private final Class51_Sub3 aClass51_Sub3_2;

	@OriginalMember(owner = "client!ct", name = "B", descriptor = "I")
	public final int anInt2073;

	@OriginalMember(owner = "client!ct", name = "z", descriptor = "[I")
	private final int[] anIntArray73;

	@OriginalMember(owner = "client!ct", name = "v", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_7;

	@OriginalMember(owner = "client!ct", name = "C", descriptor = "F")
	public final float aFloat68;

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
	public final int anInt2060;

	@OriginalMember(owner = "client!ct", name = "y", descriptor = "I")
	public final int anInt2072;

	@OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
	public final int anInt2067;

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "Lclient!js;")
	private final Class19_Sub2 aClass19_Sub2_1;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!mt;IIIII)V")
	public Class3_Sub9(@OriginalArg(0) Class51_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass51_Sub3_2 = arg0;
		this.anInt2073 = arg3;
		this.anIntArray73 = new int[this.aClass51_Sub3_2.anInt9121 * this.aClass51_Sub3_2.anInt9115];
		this.aClass5_Sub2_7 = this.aClass51_Sub3_2.aClass5_Sub2_28;
		this.aFloat68 = arg2;
		this.anInt2060 = arg4;
		this.anInt2072 = arg5;
		this.anInt2067 = arg1;
		this.aClass19_Sub2_1 = new Class19_Sub2(this.aClass5_Sub2_7, 5123, null, 1);
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)V")
	public void method1944(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer3 = this.aClass5_Sub2_7.aNativeHeap4.a(arg0 * 4, true);
		this.aStream3 = new Stream(this.aNativeHeapBuffer3);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIII)V")
	public void method1945(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray73[arg0 * this.aClass51_Sub3_2.anInt9121 + arg1] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "([III)V")
	public void method1946(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class3_Sub3_Sub1 local11 = this.aClass5_Sub2_7.aClass3_Sub3_Sub1_3;
		local11.anInt4736 = 0;
		@Pc(40) short[] local40;
		@Pc(34) int local34;
		@Pc(45) int local45;
		@Pc(28) int local28;
		@Pc(51) int local51;
		@Pc(53) int local53;
		if (this.aClass5_Sub2_7.aBoolean387) {
			for (local28 = 0; local28 < arg1; local28++) {
				local34 = arg0[local28];
				local40 = this.aClass51_Sub3_2.aShortArrayArray12[local34];
				local45 = this.anIntArray73[local34];
				if (local45 != 0 && local40 != null) {
					local51 = 0;
					local53 = 0;
					while (local40.length > local53) {
						if ((0x1 << local51++ & local45) == 0) {
							local53 += 3;
						} else {
							local7++;
							local11.method4201(local40[local53++] & 0xFFFF);
							local11.method4201(local40[local53++] & 0xFFFF);
							local7++;
							local11.method4201(local40[local53++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local28 = 0; local28 < arg1; local28++) {
				local34 = arg0[local28];
				local40 = this.aClass51_Sub3_2.aShortArrayArray12[local34];
				local45 = this.anIntArray73[local34];
				if (local45 != 0 && local40 != null) {
					local51 = 0;
					local53 = 0;
					while (local40.length > local53) {
						if ((0x1 << local51++ & local45) == 0) {
							local53 += 3;
						} else {
							local11.method4257(local40[local53++] & 0xFFFF);
							local7++;
							local11.method4257(local40[local53++] & 0xFFFF);
							local7++;
							local7++;
							local11.method4257(local40[local53++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass19_Sub2_1.method8705(local11.anInt4736, local11.aByteArray54);
		this.aClass5_Sub2_7.method4967(this.aClass51_Sub3_2.aClass164_13, this.aClass164_5, this.aClass51_Sub3_2.aClass164_16, this.aClass51_Sub3_2.aClass164_15);
		this.aClass5_Sub2_7.method5006((this.aClass51_Sub3_2.anInt6847 & 0x8) != 0, (this.aClass51_Sub3_2.anInt6847 & 0x7) != 0, this.anInt2067);
		if (this.aClass5_Sub2_7.aBoolean399) {
			this.aClass5_Sub2_7.EA(Integer.MAX_VALUE, this.anInt2073, this.anInt2060, this.anInt2072);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat68, 1.0F / this.aFloat68, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass5_Sub2_7.method4967(this.aClass51_Sub3_2.aClass164_13, this.aClass164_5, this.aClass51_Sub3_2.aClass164_16, this.aClass51_Sub3_2.aClass164_15);
		this.aClass5_Sub2_7.method4968(this.aClass19_Sub2_1, 0, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(II)V")
	public void method1948(@OriginalArg(1) int arg0) {
		this.aStream3.b(arg0 * 4 + 3);
		this.aStream3.c(-1);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IBFII)V")
	public void method1949(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(35) int local35;
		if (this.anInt2067 != -1) {
			@Pc(17) Class195 local17 = this.aClass5_Sub2_7.anInterface7_15.method8118(this.anInt2067);
			local22 = local17.aByte79 & 0xFF;
			@Pc(58) int local58;
			if (local22 != 0 && local17.aByte83 != 4) {
				if (arg3 < 0) {
					local35 = 0;
				} else if (arg3 <= 127) {
					local35 = arg3 * 131586;
				} else {
					local35 = 16777215;
				}
				if (local22 == 256) {
					arg0 = local35;
				} else {
					local58 = 256 - local22;
					arg0 = ((local35 & 0xFF00) * local22 + local58 * (arg0 & 0xFF00) & 0xFF0000) + (local58 * (arg0 & 0xFF00FF) + local22 * (local35 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local35 = local17.aByte84 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(111) int local111 = (arg0 >> 16 & 0xFF) * local35;
				if (local111 > 65535) {
					local111 = 65535;
				}
				local58 = (arg0 >> 8 & 0xFF) * local35;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(135) int local135 = local35 * (arg0 & 0xFF);
				if (local135 > 65535) {
					local135 = 65535;
				}
				arg0 = (local58 & 0xFF00) + (((local111 & 0xF500FF00) << 8) + (local135 >> 8));
			}
		}
		this.aStream3.b(arg2 * 4);
		if (arg1 != 1.0F) {
			@Pc(173) int local173 = arg0 >> 16 & 0xFF;
			local22 = arg0 >> 8 & 0xFF;
			local173 = (int) ((float) local173 * arg1);
			local35 = arg0 & 0xFF;
			local22 = (int) ((float) local22 * arg1);
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
			local35 = (int) ((float) local35 * arg1);
			if (local35 < 0) {
				local35 = 0;
			} else if (local35 > 255) {
				local35 = 255;
			}
			arg0 = local35 | local173 << 16 | local22 << 8;
		}
		this.aStream3.c((byte) (arg0 >> 16));
		this.aStream3.c((byte) (arg0 >> 8));
		this.aStream3.c((byte) arg0);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)V")
	public void method1950(@OriginalArg(0) int arg0) {
		this.aStream3.b();
		@Pc(26) Interface14 local26 = this.aClass5_Sub2_7.method5001(4, arg0 * 4, this.aNativeHeapBuffer3);
		this.aClass164_5 = new Class164(local26, 5121, 4, 0);
		this.aStream3 = null;
		this.aNativeHeapBuffer3 = null;
	}
}
