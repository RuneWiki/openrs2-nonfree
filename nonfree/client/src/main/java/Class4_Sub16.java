import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class4_Sub16 extends Class4 {

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer1;

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!dw", name = "u", descriptor = "Lclient!pc;")
	private Class177 aClass177_4;

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "Lclient!oq;")
	private final Class65_Sub2 aClass65_Sub2_1;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
	public final int anInt1640;

	@OriginalMember(owner = "client!dw", name = "D", descriptor = "I")
	public final int anInt1647;

	@OriginalMember(owner = "client!dw", name = "C", descriptor = "F")
	public final float aFloat46;

	@OriginalMember(owner = "client!dw", name = "y", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_11;

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
	public final int anInt1641;

	@OriginalMember(owner = "client!dw", name = "x", descriptor = "I")
	public final int anInt1645;

	@OriginalMember(owner = "client!dw", name = "A", descriptor = "[I")
	private final int[] anIntArray136;

	@OriginalMember(owner = "client!dw", name = "I", descriptor = "Lclient!eo;")
	private final Class64_Sub1 aClass64_Sub1_1;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!oq;IIIII)V")
	public Class4_Sub16(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass65_Sub2_1 = arg0;
		this.anInt1640 = arg4;
		this.anInt1647 = arg1;
		this.aFloat46 = arg2;
		this.aClass19_Sub2_11 = this.aClass65_Sub2_1.aClass19_Sub2_30;
		this.anInt1641 = arg3;
		this.anInt1645 = arg5;
		this.anIntArray136 = new int[this.aClass65_Sub2_1.anInt5262 * this.aClass65_Sub2_1.anInt5258];
		this.aClass64_Sub1_1 = new Class64_Sub1(this.aClass19_Sub2_11, 5123, null, 1);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)V")
	public void method1461(@OriginalArg(0) int arg0) {
		this.aNativeStream1.b();
		@Pc(18) Interface11 local18 = this.aClass19_Sub2_11.method1902(this.aNativeBuffer1, arg0 * 4, 4);
		this.aClass177_4 = new Class177(local18, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer1 = null;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "([III)V")
	public void method1462(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) Class4_Sub12 local9 = Static383.aClass4_Sub12_7;
		local9.anInt2997 = 0;
		@Pc(36) short[] local36;
		@Pc(30) int local30;
		@Pc(41) int local41;
		@Pc(24) int local24;
		@Pc(50) int local50;
		@Pc(52) int local52;
		if (this.aClass19_Sub2_11.aBoolean215) {
			for (local24 = 0; local24 < arg1; local24++) {
				local30 = arg0[local24];
				local36 = this.aClass65_Sub2_1.aShortArrayArray9[local30];
				local41 = this.anIntArray136[local30];
				if (local41 != 0 && local36 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local36.length) {
						if ((local41 & 0x1 << local50++) == 0) {
							local52 += 3;
						} else {
							local7++;
							local9.method2524(local36[local52++] & 0xFFFF);
							local7++;
							local9.method2524(local36[local52++] & 0xFFFF);
							local9.method2524(local36[local52++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local24 = 0; local24 < arg1; local24++) {
				local30 = arg0[local24];
				local41 = this.anIntArray136[local30];
				local36 = this.aClass65_Sub2_1.aShortArrayArray9[local30];
				if (local41 != 0 && local36 != null) {
					local50 = 0;
					local52 = 0;
					while (local36.length > local52) {
						if ((0x1 << local50++ & local41) == 0) {
							local52 += 3;
						} else {
							local9.method2541(local36[local52++] & 0xFFFF);
							local7++;
							local9.method2541(local36[local52++] & 0xFFFF);
							local7++;
							local7++;
							local9.method2541(local36[local52++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass64_Sub1_1.method3657(local9.aByteArray36, local9.anInt2997);
		this.aClass19_Sub2_11.method1934(this.aClass177_4, this.aClass65_Sub2_1.aClass177_16, this.aClass65_Sub2_1.aClass177_14, this.aClass65_Sub2_1.aClass177_15);
		this.aClass19_Sub2_11.method1926((this.aClass65_Sub2_1.anInt5285 & 0x7) != 0, this.anInt1647, (this.aClass65_Sub2_1.anInt5285 & 0x8) != 0);
		if (this.aClass19_Sub2_11.aBoolean192) {
			this.aClass19_Sub2_11.GA(Integer.MAX_VALUE, this.anInt1641, this.anInt1640, this.anInt1645);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat46, 1.0F / this.aFloat46, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass19_Sub2_11.method1934(this.aClass177_4, this.aClass65_Sub2_1.aClass177_16, this.aClass65_Sub2_1.aClass177_14, this.aClass65_Sub2_1.aClass177_15);
		this.aClass19_Sub2_11.method1967(0, local7, this.aClass64_Sub1_1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIZ)V")
	public void method1464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray136[this.aClass65_Sub2_1.anInt5262 * arg0 + arg2] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIBIF)V")
	public void method1465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(23) int local23;
		@Pc(45) int local45;
		if (this.anInt1647 != -1) {
			@Pc(18) Class251 local18 = this.aClass19_Sub2_11.anInterface7_6.method2396(this.anInt1647);
			local23 = local18.aByte90 & 0xFF;
			@Pc(67) int local67;
			if (local23 != 0 && local18.aByte89 != 4) {
				if (arg0 < 0) {
					local45 = 0;
				} else if (arg0 <= 127) {
					local45 = arg0 * 131586;
				} else {
					local45 = 16777215;
				}
				if (local23 == 256) {
					arg2 = local45;
				} else {
					local67 = 256 - local23;
					arg2 = (local67 * (arg2 & 0xFF00FF) + (local45 & 0xFF00FF) * local23 & 0xFF00FF00) + (local67 * (arg2 & 0xFF00) + local23 * (local45 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local45 = local18.aByte87 & 0xFF;
			if (local45 != 0) {
				local45 += 256;
				@Pc(114) int local114 = (arg2 >> 16 & 0xFF) * local45;
				if (local114 > 65535) {
					local114 = 65535;
				}
				local67 = local45 * (arg2 >> 8 & 0xFF);
				if (local67 > 65535) {
					local67 = 65535;
				}
				@Pc(140) int local140 = local45 * (arg2 & 0xFF);
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg2 = (local140 >> 8) + (local67 & 0xFF00) + ((local114 & 0xFF00) << 8);
			}
		}
		this.aNativeStream1.a(arg1 * 4);
		if (arg3 != 1.0F) {
			@Pc(182) int local182 = arg2 >> 16 & 0xFF;
			local23 = arg2 >> 8 & 0xFF;
			local182 = (int) ((float) local182 * arg3);
			local45 = arg2 & 0xFF;
			if (local182 < 0) {
				local182 = 0;
			} else if (local182 > 255) {
				local182 = 255;
			}
			local23 = (int) ((float) local23 * arg3);
			if (local23 < 0) {
				local23 = 0;
			} else if (local23 > 255) {
				local23 = 255;
			}
			local45 = (int) ((float) local45 * arg3);
			if (local45 < 0) {
				local45 = 0;
			} else if (local45 > 255) {
				local45 = 255;
			}
			arg2 = local45 | local182 << 16 | local23 << 8;
		}
		this.aNativeStream1.b((byte) (arg2 >> 16));
		this.aNativeStream1.b((byte) (arg2 >> 8));
		this.aNativeStream1.b((byte) arg2);
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(II)V")
	public void method1466(@OriginalArg(1) int arg0) {
		this.aNativeBuffer1 = this.aClass19_Sub2_11.aNativeHeap2.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer1);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZ)V")
	public void method1467(@OriginalArg(0) int arg0) {
		this.aNativeStream1.a(arg0 * 4 + 3);
		this.aNativeStream1.b(-1);
	}
}
