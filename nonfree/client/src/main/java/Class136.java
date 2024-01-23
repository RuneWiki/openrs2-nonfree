import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class136 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	private int anInt4026;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	private int anInt4030;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!ch;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_3;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	private int anInt4029 = -1;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	private int anInt4028;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	private int anInt4025;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	private int anInt4027;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	private int anInt4031;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "[Lclient!qg;")
	private Class146[] aClass146Array1;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "[Lclient!qg;")
	private Class146[] aClass146Array2;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Lclient!qg;")
	private Class146 aClass146_1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I[Lclient!qg;IIII)V")
	public Class136(@OriginalArg(0) int arg0, @OriginalArg(1) Class146[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4028 = arg3;
		this.anInt4025 = arg4;
		this.anInt4027 = arg5;
		this.anInt4031 = arg0;
		this.aClass146Array1 = arg1;
		if (arg1 == null) {
			this.aClass146Array2 = null;
			this.aClass146_1 = null;
		} else {
			this.aClass146Array2 = new Class146[arg1.length];
			this.aClass146_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIII)V")
	public void method3385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method3389(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt4031 == -1) {
			Static25.method385(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass1_Sub2_Sub1_Sub2_3 == null) {
				this.aClass1_Sub2_Sub1_Sub2_3 = Static215.anInterface5_1.method789(this.anInt4031, false, this.anInt4026, Static215.aFloat123);
			}
			if (!Static215.anInterface5_1.method785(this.anInt4031)) {
				Static25.method385(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass1_Sub2_Sub1_Sub2_3 != null) {
				local47 = arg5 * arg4 / -512;
				@Pc(59) int local59;
				for (local59 = (arg3 - arg4) / 2 + local8 * arg4 / 512; local59 > arg4; local59 -= arg4) {
				}
				while (local59 < 0) {
					local59 += arg4;
				}
				while (local47 > arg4) {
					local47 -= arg4;
				}
				while (local47 < 0) {
					local47 += arg4;
				}
				for (@Pc(93) int local93 = local59 - arg4; local93 < arg3; local93 += arg4) {
					for (@Pc(100) int local100 = local47 - arg4; local100 < arg4; local100 += arg4) {
						this.aClass1_Sub2_Sub1_Sub2_3.method3847(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt4030 - 1; local47 >= 0; local47--) {
			this.aClass146Array2[local47].method3561(arg1, arg2, arg3, arg4, arg5, local8, this.aClass146_1);
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIIIIIII)V")
	public void method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static156.aGL1;
		this.method3389(arg4);
		@Pc(10) int local10 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static156.method2674(false);
		Static156.method2675(false);
		Static156.method2668(false);
		Static156.method2660();
		Static156.method2669(arg1, local14, arg2, local18);
		Static156.method2656();
		@Pc(36) int local36;
		for (local36 = this.anInt4030 - 1; local36 >= 0; local36--) {
			this.aClass146Array2[local36].method3562(this.aClass146_1);
		}
		if (this.anInt4031 == -1) {
			Static156.method2671(arg7);
		} else {
			if (!Static215.anInterface5_1.method785(this.anInt4031)) {
				Static156.method2671(arg7);
			}
			Static215.anInterface5_1.method786(this.anInt4026, this.anInt4031);
			@Pc(71) float local71 = (float) arg5 / 512.0F;
			@Pc(76) float local76 = (float) local10 / -512.0F;
			@Pc(86) float local86 = (float) (arg3 - arg4) / ((float) arg4 * 2.0F);
			local1.glBegin(7);
			local1.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			local1.glTexCoord2f(local76 - local86, local71);
			local1.glVertex2i(arg1, arg2);
			local1.glTexCoord2f(local76 - local86, local71 + 1.0F);
			local1.glVertex2i(arg1, local18);
			local1.glTexCoord2f(local86 + local76 + 1.0F, local71 + 1.0F);
			local1.glVertex2i(local14, local18);
			local1.glTexCoord2f(local86 + local76 + 1.0F, local71);
			local1.glVertex2i(local14, arg2);
			local1.glEnd();
		}
		for (local36 = this.anInt4030 - 1; local36 >= 0; local36--) {
			this.aClass146Array2[local36].method3571(arg1, arg2, arg3, arg4, arg5, local10);
		}
		Static156.method2676();
		Static156.method2668(true);
		Static156.method2675(true);
		Static156.method2674(true);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	private void method3389(@OriginalArg(0) int arg0) {
		if (this.anInt4029 == arg0) {
			return;
		}
		this.anInt4029 = arg0;
		@Pc(10) int local10 = Static27.method458(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt4026) {
			this.anInt4026 = local10;
			this.aClass1_Sub2_Sub1_Sub2_3 = null;
		}
		if (this.aClass146Array1 == null) {
			return;
		}
		this.anInt4030 = 0;
		@Pc(36) int[] local36 = new int[this.aClass146Array1.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass146Array1.length; local38++) {
			@Pc(48) Class146 local48 = this.aClass146Array1[local38];
			if (local48.method3566(this.anInt4028, this.anInt4025, this.anInt4027, this.anInt4029)) {
				local36[this.anInt4030] = local48.anInt4211;
				this.aClass146Array2[this.anInt4030++] = local48;
			}
		}
		Static153.method2611(this.aClass146Array2, this.anInt4030 - 1, local36, 0);
	}
}
