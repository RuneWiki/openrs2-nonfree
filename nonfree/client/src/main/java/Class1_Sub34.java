import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class1_Sub34 extends Class1 {

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "Lclient!nn;")
	private Class179 aClass179_16;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "Lclient!gk;")
	private final Class96_Sub1 aClass96_Sub1_2;

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
	public final int anInt5767;

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "[I")
	private final int[] anIntArray540;

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_35;

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
	public final int anInt5761;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
	public final int anInt5765;

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
	public final int anInt5766;

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "F")
	public final float aFloat89;

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "Lclient!ac;")
	private final Class4_Sub1 aClass4_Sub1_2;

	static {
		new Class158("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!gk;IIIII)V")
	public Class1_Sub34(@OriginalArg(0) Class96_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass96_Sub1_2 = arg0;
		this.anInt5767 = arg3;
		this.anIntArray540 = new int[this.aClass96_Sub1_2.anInt5777 * this.aClass96_Sub1_2.anInt5775];
		this.aClass106_Sub2_35 = this.aClass96_Sub1_2.aClass106_Sub2_15;
		this.anInt5761 = arg4;
		this.anInt5765 = arg5;
		this.anInt5766 = arg1;
		this.aFloat89 = arg2;
		this.aClass4_Sub1_2 = new Class4_Sub1(this.aClass106_Sub2_35, 5123, null, 1);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIFI)V")
	public void method4419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(38) int local38;
		if (this.anInt5766 != -1) {
			@Pc(17) Class150 local17 = this.aClass106_Sub2_35.anInterface7_10.method78(this.anInt5766);
			local22 = local17.aByte54 & 0xFF;
			@Pc(67) int local67;
			if (local22 != 0 && local17.aByte53 != 4) {
				if (arg0 < 0) {
					local38 = 0;
				} else if (arg0 > 127) {
					local38 = 16777215;
				} else {
					local38 = arg0 * 131586;
				}
				if (local22 == 256) {
					arg1 = local38;
				} else {
					local67 = 256 - local22;
					arg1 = ((arg1 & 0xFF00FF) * local67 + local22 * (local38 & 0xFF00FF) & 0xFF00FF00) + ((arg1 & 0xFF00) * local67 + local22 * (local38 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local38 = local17.aByte56 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(116) int local116 = (arg1 >> 16 & 0xFF) * local38;
				if (local116 > 65535) {
					local116 = 65535;
				}
				local67 = local38 * (arg1 >> 8 & 0xFF);
				if (local67 > 65535) {
					local67 = 65535;
				}
				@Pc(140) int local140 = local38 * (arg1 & 0xFF);
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg1 = (local140 >> 8) + ((local116 & 0x4800FF00) << 8) + (local67 & 0xFF00);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(172) int local172 = arg1 >> 16 & 0xFF;
			local22 = arg1 >> 8 & 0xFF;
			local172 = (int) ((float) local172 * arg2);
			local38 = arg1 & 0xFF;
			local22 = (int) ((float) local22 * arg2);
			if (local172 < 0) {
				local172 = 0;
			} else if (local172 > 255) {
				local172 = 255;
			}
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			local38 = (int) ((float) local38 * arg2);
			if (local38 < 0) {
				local38 = 0;
			} else if (local38 > 255) {
				local38 = 255;
			}
			arg1 = local38 | local22 << 8 | local172 << 16;
		}
		this.aNativeStream1.a(arg3 * 4);
		this.aNativeStream1.b((byte) (arg1 >> 16));
		this.aNativeStream1.b((byte) (arg1 >> 8));
		this.aNativeStream1.b((byte) arg1);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
	public void method4420(@OriginalArg(1) int arg0) {
		this.aNativeBuffer3 = this.aClass106_Sub2_35.aNativeHeap2.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer3);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)V")
	public void method4421(@OriginalArg(1) int arg0) {
		this.aNativeStream1.a(arg0 * 4 + 3);
		this.aNativeStream1.b(-1);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(BI)V")
	public void method4422(@OriginalArg(1) int arg0) {
		this.aNativeStream1.b();
		@Pc(26) Interface3 local26 = this.aClass106_Sub2_35.method2864(4, arg0 * 4, this.aNativeBuffer3);
		this.aClass179_16 = new Class179(local26, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer3 = null;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIII)V")
	public void method4423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray540[arg0 + this.aClass96_Sub1_2.anInt5777 * arg2] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[II)V")
	public void method4424(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(15) Class1_Sub3_Sub2 local15 = this.aClass106_Sub2_35.aClass1_Sub3_Sub2_2;
		local15.anInt1710 = 0;
		@Pc(41) short[] local41;
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(24) int local24;
		@Pc(47) int local47;
		@Pc(49) int local49;
		if (this.aClass106_Sub2_35.aBoolean227) {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local35 = this.anIntArray540[local30];
				local41 = this.aClass96_Sub1_2.aShortArrayArray1[local30];
				if (local35 != 0 && local41 != null) {
					local47 = 0;
					local49 = 0;
					while (local49 < local41.length) {
						if ((0x1 << local47++ & local35) == 0) {
							local49 += 3;
						} else {
							local15.method1227(local41[local49++] & 0xFFFF);
							local7++;
							local7++;
							local15.method1227(local41[local49++] & 0xFFFF);
							local15.method1227(local41[local49++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local24 = 0; local24 < arg0; local24++) {
				local30 = arg1[local24];
				local35 = this.anIntArray540[local30];
				local41 = this.aClass96_Sub1_2.aShortArrayArray1[local30];
				if (local35 != 0 && local41 != null) {
					local47 = 0;
					local49 = 0;
					while (local41.length > local49) {
						if ((local35 & 0x1 << local47++) == 0) {
							local49 += 3;
						} else {
							local7++;
							local15.method1199(local41[local49++] & 0xFFFF);
							local15.method1199(local41[local49++] & 0xFFFF);
							local7++;
							local7++;
							local15.method1199(local41[local49++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass4_Sub1_2.method5857(local15.aByteArray14, local15.anInt1710);
		this.aClass106_Sub2_35.method2847(this.aClass96_Sub1_2.aClass179_10, this.aClass96_Sub1_2.aClass179_9, this.aClass179_16, this.aClass96_Sub1_2.aClass179_7);
		this.aClass106_Sub2_35.method2865((this.aClass96_Sub1_2.anInt2973 & 0x8) != 0, (this.aClass96_Sub1_2.anInt2973 & 0x7) != 0, this.anInt5766);
		if (this.aClass106_Sub2_35.aBoolean223) {
			this.aClass106_Sub2_35.a(Integer.MAX_VALUE, this.anInt5767, this.anInt5761, this.anInt5765);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat89, 1.0F / this.aFloat89, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass106_Sub2_35.method2847(this.aClass96_Sub1_2.aClass179_10, this.aClass96_Sub1_2.aClass179_9, this.aClass179_16, this.aClass96_Sub1_2.aClass179_7);
		this.aClass106_Sub2_35.method2848(local7, this.aClass4_Sub1_2, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
