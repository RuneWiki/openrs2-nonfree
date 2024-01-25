import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "Lclient!ff;")
	private Class80 aClass80_3;

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "Lclient!us;")
	private final Class139_Sub2 aClass139_Sub2_3;

	@OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
	public final int anInt1802;

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
	public final int anInt1791;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "F")
	public final float aFloat12;

	@OriginalMember(owner = "client!fm", name = "G", descriptor = "[I")
	private final int[] anIntArray158;

	@OriginalMember(owner = "client!fm", name = "F", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_12;

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
	public final int anInt1798;

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
	public final int anInt1793;

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "Lclient!en;")
	private final Class72_Sub1 aClass72_Sub1_1;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!us;IIIII)V")
	public Class1_Sub13(@OriginalArg(0) Class139_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass139_Sub2_3 = arg0;
		this.anInt1802 = arg4;
		this.anInt1791 = arg1;
		this.aFloat12 = arg2;
		this.anIntArray158 = new int[this.aClass139_Sub2_3.anInt6757 * this.aClass139_Sub2_3.anInt6758];
		this.aClass117_Sub1_12 = this.aClass139_Sub2_3.aClass117_Sub1_41;
		this.anInt1798 = arg3;
		this.anInt1793 = arg5;
		this.aClass72_Sub1_1 = new Class72_Sub1(this.aClass117_Sub1_12, 5123, null, 1);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[IB)V")
	public void method1477(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1_Sub19_Sub1 local11 = this.aClass117_Sub1_12.aClass1_Sub19_Sub1_2;
		local11.anInt3698 = 0;
		@Pc(36) short[] local36;
		@Pc(30) int local30;
		@Pc(41) int local41;
		@Pc(24) int local24;
		@Pc(50) int local50;
		@Pc(52) int local52;
		if (this.aClass117_Sub1_12.aBoolean291) {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local36 = this.aClass139_Sub2_3.aShortArrayArray8[local30];
				local41 = this.anIntArray158[local30];
				if (local41 != 0 && local36 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local36.length) {
						if ((0x1 << local50++ & local41) == 0) {
							local52 += 3;
						} else {
							local7++;
							local11.method2930(local36[local52++] & 0xFFFF);
							local11.method2930(local36[local52++] & 0xFFFF);
							local7++;
							local7++;
							local11.method2930(local36[local52++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local36 = this.aClass139_Sub2_3.aShortArrayArray8[local30];
				local41 = this.anIntArray158[local30];
				if (local41 != 0 && local36 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local36.length) {
						if ((local41 & 0x1 << local50++) == 0) {
							local52 += 3;
						} else {
							local11.method2936(local36[local52++] & 0xFFFF);
							local7++;
							local11.method2936(local36[local52++] & 0xFFFF);
							local7++;
							local7++;
							local11.method2936(local36[local52++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass72_Sub1_1.method5205(local11.anInt3698, local11.aByteArray38);
		this.aClass117_Sub1_12.method2475(this.aClass139_Sub2_3.aClass80_13, this.aClass139_Sub2_3.aClass80_15, this.aClass80_3, this.aClass139_Sub2_3.aClass80_16);
		this.aClass117_Sub1_12.method2484((this.aClass139_Sub2_3.anInt6771 & 0x7) != 0, this.anInt1791, (this.aClass139_Sub2_3.anInt6771 & 0x8) != 0);
		if (this.aClass117_Sub1_12.aBoolean313) {
			this.aClass117_Sub1_12.a(Integer.MAX_VALUE, this.anInt1798, this.anInt1802, this.anInt1793);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat12, 1.0F / this.aFloat12, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass117_Sub1_12.method2475(this.aClass139_Sub2_3.aClass80_13, this.aClass139_Sub2_3.aClass80_15, this.aClass80_3, this.aClass139_Sub2_3.aClass80_16);
		this.aClass117_Sub1_12.method2534(0, this.aClass72_Sub1_1, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V")
	public void method1479(@OriginalArg(0) int arg0) {
		this.aNativeStream1.a();
		@Pc(18) Interface9 local18 = this.aClass117_Sub1_12.method2521(this.aNativeBuffer3, 4, arg0 * 4);
		this.aClass80_3 = new Class80(local18, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer3 = null;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(BI)V")
	public void method1480(@OriginalArg(1) int arg0) {
		this.aNativeStream1.a(arg0 * 4 + 3);
		this.aNativeStream1.b(-1);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIFII)V")
	public void method1481(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(34) int local34;
		if (this.anInt1791 != -1) {
			@Pc(17) Class25 local17 = this.aClass117_Sub1_12.anInterface4_10.method5090(this.anInt1791);
			local22 = local17.aByte12 & 0xFF;
			@Pc(59) int local59;
			if (local22 != 0 && local17.aByte11 != 4) {
				if (arg0 < 0) {
					local34 = 0;
				} else if (arg0 <= 127) {
					local34 = arg0 * 131586;
				} else {
					local34 = 16777215;
				}
				if (local22 == 256) {
					arg2 = local34;
				} else {
					local59 = 256 - local22;
					arg2 = (local22 * (local34 & 0xFF00FF) + local59 * (arg2 & 0xFF00FF) & 0xFF00FF00) + ((arg2 & 0xFF00) * local59 + (local34 & 0xFF00) * local22 & 0xFF0000) >> 8;
				}
			}
			local34 = local17.aByte7 & 0xFF;
			if (local34 != 0) {
				local34 += 256;
				@Pc(110) int local110 = (arg2 >> 16 & 0xFF) * local34;
				if (local110 > 65535) {
					local110 = 65535;
				}
				local59 = (arg2 >> 8 & 0xFF) * local34;
				if (local59 > 65535) {
					local59 = 65535;
				}
				@Pc(134) int local134 = (arg2 & 0xFF) * local34;
				if (local134 > 65535) {
					local134 = 65535;
				}
				arg2 = (local134 >> 8) + (local110 << 8 & 0xFF0025) + (local59 & 0xFF00);
			}
		}
		this.aNativeStream1.a(arg3 * 4);
		if (arg1 != 1.0F) {
			@Pc(175) int local175 = arg2 >> 16 & 0xFF;
			local22 = arg2 >> 8 & 0xFF;
			local34 = arg2 & 0xFF;
			local175 = (int) ((float) local175 * arg1);
			if (local175 < 0) {
				local175 = 0;
			} else if (local175 > 255) {
				local175 = 255;
			}
			local22 = (int) ((float) local22 * arg1);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			local34 = (int) ((float) local34 * arg1);
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			arg2 = local34 | local22 << 8 | local175 << 16;
		}
		this.aNativeStream1.b((byte) (arg2 >> 16));
		this.aNativeStream1.b((byte) (arg2 >> 8));
		this.aNativeStream1.b((byte) arg2);
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)V")
	public void method1482(@OriginalArg(0) int arg0) {
		this.aNativeBuffer3 = this.aClass117_Sub1_12.aNativeHeap2.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer3);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)V")
	public void method1484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray158[arg2 + arg1 * this.aClass139_Sub2_3.anInt6757] |= 0x1 << arg0;
	}
}
