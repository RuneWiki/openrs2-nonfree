import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class95 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
	private int anInt3809;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Lclient!q;")
	private Class1_Sub2_Sub4_Sub1 aClass1_Sub2_Sub4_Sub1_5;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
	private int anInt3812;

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
	private int anInt3813 = -1;

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
	private int anInt3810;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
	private int anInt3814;

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
	private int anInt3811;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	private int anInt3815;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "[Lclient!vc;")
	private Class139[] aClass139Array2;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "[Lclient!vc;")
	private Class139[] aClass139Array1;

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "Lclient!vc;")
	private Class139 aClass139_1;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(I[Lclient!vc;IIII)V")
	public Class95(@OriginalArg(0) int arg0, @OriginalArg(1) Class139[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3810 = arg3;
		this.anInt3814 = arg4;
		this.anInt3811 = arg5;
		this.anInt3815 = arg0;
		this.aClass139Array2 = arg1;
		if (arg1 == null) {
			this.aClass139Array1 = null;
			this.aClass139_1 = null;
		} else {
			this.aClass139Array1 = new Class139[arg1.length];
			this.aClass139_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	private void method2827(@OriginalArg(0) int arg0) {
		if (this.anInt3813 == arg0) {
			return;
		}
		this.anInt3813 = arg0;
		@Pc(10) int local10 = Static199.method3320(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt3812) {
			this.anInt3812 = local10;
			this.aClass1_Sub2_Sub4_Sub1_5 = null;
		}
		if (this.aClass139Array2 == null) {
			return;
		}
		this.anInt3809 = 0;
		@Pc(36) int[] local36 = new int[this.aClass139Array2.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass139Array2.length; local38++) {
			@Pc(44) Class139 local44 = this.aClass139Array2[local38];
			if (local44.method4002(this.anInt3810, this.anInt3814, this.anInt3811, this.anInt3813)) {
				local36[this.anInt3809] = local44.anInt5265;
				this.aClass139Array1[this.anInt3809++] = local44;
			}
		}
		Static89.method1893(0, local36, this.anInt3809 - 1, this.aClass139Array1);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIII)V")
	public void method2829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2827(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt3815 == -1) {
			Static189.method3193(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass1_Sub2_Sub4_Sub1_5 == null) {
				this.aClass1_Sub2_Sub4_Sub1_5 = Static235.anInterface1_1.method390(false, this.anInt3815, Static235.aFloat47, this.anInt3812);
			}
			if (!Static235.anInterface1_1.method389(this.anInt3815)) {
				Static189.method3193(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass1_Sub2_Sub4_Sub1_5 != null) {
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
				for (@Pc(93) int local93 = local59 - arg4; local93 < Static189.anInt4234; local93 += arg4) {
					for (@Pc(98) int local98 = local47 - arg4; local98 < Static189.anInt4230; local98 += arg4) {
						this.aClass1_Sub2_Sub4_Sub1_5.method887(local93 + arg1, local98 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt3809 - 1; local47 >= 0; local47--) {
			this.aClass139Array1[local47].method4004(arg1, arg2, arg3, arg4, arg5, local8, this.aClass139_1);
		}
	}
}
