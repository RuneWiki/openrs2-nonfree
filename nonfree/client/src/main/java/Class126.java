import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class126 {

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "Lclient!le;")
	private Class1_Sub5_Sub6_Sub1 aClass1_Sub5_Sub6_Sub1_2;

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
	private int anInt3941;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
	private int anInt3944;

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
	private int anInt3940 = -1;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
	private int anInt3943;

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
	private int anInt3939;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
	private int anInt3938;

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
	private int anInt3942;

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "[Lclient!w;")
	private Class184[] aClass184Array1;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "[Lclient!w;")
	private Class184[] aClass184Array2;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "Lclient!w;")
	private Class184 aClass184_1;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(I[Lclient!w;IIII)V")
	public Class126(@OriginalArg(0) int arg0, @OriginalArg(1) Class184[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3943 = arg3;
		this.anInt3939 = arg4;
		this.anInt3938 = arg5;
		this.anInt3942 = arg0;
		this.aClass184Array1 = arg1;
		if (arg1 == null) {
			this.aClass184Array2 = null;
			this.aClass184_1 = null;
		} else {
			this.aClass184Array2 = new Class184[arg1.length];
			this.aClass184_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	private void method3414(@OriginalArg(0) int arg0) {
		if (this.anInt3940 == arg0) {
			return;
		}
		this.anInt3940 = arg0;
		@Pc(10) int local10 = Static218.method3531(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt3944) {
			this.anInt3944 = local10;
			this.aClass1_Sub5_Sub6_Sub1_2 = null;
		}
		if (this.aClass184Array1 == null) {
			return;
		}
		this.anInt3941 = 0;
		@Pc(36) int[] local36 = new int[this.aClass184Array1.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass184Array1.length; local38++) {
			@Pc(48) Class184 local48 = this.aClass184Array1[local38];
			if (local48.method4542(this.anInt3943, this.anInt3939, this.anInt3938, this.anInt3940)) {
				local36[this.anInt3941] = local48.anInt5469;
				this.aClass184Array2[this.anInt3941++] = local48;
			}
		}
		Static199.method3413(this.aClass184Array2, local36, this.anInt3941 - 1, 0);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIII)V")
	public void method3415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method3414(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt3942 == -1) {
			Static77.method1596(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass1_Sub5_Sub6_Sub1_2 == null) {
				this.aClass1_Sub5_Sub6_Sub1_2 = Static119.anInterface5_1.method1476(this.anInt3944, this.anInt3942, Static119.aFloat57, false);
			}
			if (!Static119.anInterface5_1.method1473(this.anInt3942)) {
				Static77.method1596(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass1_Sub5_Sub6_Sub1_2 != null) {
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
						this.aClass1_Sub5_Sub6_Sub1_2.method3200(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt3941 - 1; local47 >= 0; local47--) {
			this.aClass184Array2[local47].method4534(arg1, arg2, arg3, arg4, arg5, local8, this.aClass184_1);
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(IIIIIIII)V")
	public void method3419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static71.aGL1;
		this.method3414(arg4);
		@Pc(10) int local10 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static71.method1414(false);
		Static71.method1411(false);
		Static71.method1413(false);
		Static71.method1381();
		Static71.method1374(arg1, local14, arg2, local18);
		Static71.method1384();
		@Pc(36) int local36;
		for (local36 = this.anInt3941 - 1; local36 >= 0; local36--) {
			this.aClass184Array2[local36].method4541(this.aClass184_1);
		}
		if (this.anInt3942 == -1) {
			Static71.method1388(arg7);
		} else {
			if (!Static119.anInterface5_1.method1473(this.anInt3942)) {
				Static71.method1388(arg7);
			}
			Static119.anInterface5_1.method1485(this.anInt3942, this.anInt3944);
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
		for (local36 = this.anInt3941 - 1; local36 >= 0; local36--) {
			this.aClass184Array2[local36].method4544(arg1, arg2, arg3, arg4, arg5, local10);
		}
		Static71.method1395();
		Static71.method1413(true);
		Static71.method1411(true);
		Static71.method1414(true);
	}
}
