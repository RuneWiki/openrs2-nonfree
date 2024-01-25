import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bia")
public class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!bia", name = "r", descriptor = "Lclient!ufa;")
	private Class4 aClass4_21;

	@OriginalMember(owner = "client!bia", name = "u", descriptor = "Lclient!ufa;")
	protected Class4 aClass4_22;

	@OriginalMember(owner = "client!bia", name = "v", descriptor = "Lclient!ufa;")
	private Class4 aClass4_23;

	@OriginalMember(owner = "client!bia", name = "w", descriptor = "Lclient!ufa;")
	private Class4 aClass4_24;

	@OriginalMember(owner = "client!bia", name = "x", descriptor = "Lclient!ufa;")
	private Class4 aClass4_25;

	@OriginalMember(owner = "client!bia", name = "C", descriptor = "Lclient!ufa;")
	private Class4 aClass4_26;

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lclient!ni;Lclient!ni;Lclient!ij;)V")
	public Class30_Sub1(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class109_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method7542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.aClass4_23.method7700() + arg1;
		@Pc(20) int local20 = arg1 + super.aClass109_5.anInt9913 - this.aClass4_25.method7700();
		@Pc(26) int local26 = arg0 + this.aClass4_21.method7712();
		@Pc(37) int local37 = arg0 + super.aClass109_5.anInt9904 - this.aClass4_24.method7712();
		@Pc(42) int local42 = local20 - local9;
		@Pc(47) int local47 = local37 - local26;
		@Pc(57) int local57 = local42 * this.method7540() / 10000;
		@Pc(60) int[] local60 = new int[4];
		Static467.aClass5_13.K(local60);
		Static467.aClass5_13.KA(local9, local26, local57 + local9, local37);
		this.method6920(local47, local42, local26, local9);
		Static467.aClass5_13.KA(local9 + local57, local26, local20, local37);
		this.aClass4_26.method7701(local9, local26, local42, local47);
		Static467.aClass5_13.KA(local60[0], local60[1], local60[2], local60[3]);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIIIB)V")
	protected void method6920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass4_22.method7701(arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)V")
	@Override
	public final void method7992() {
		super.method7992();
		@Pc(10) Class109_Sub1 local10 = (Class109_Sub1) super.aClass109_5;
		this.aClass4_22 = Static100.method2419(local10.anInt4633, super.aClass223_124);
		this.aClass4_26 = Static100.method2419(local10.anInt4628, super.aClass223_124);
		this.aClass4_23 = Static100.method2419(local10.anInt4635, super.aClass223_124);
		this.aClass4_25 = Static100.method2419(local10.anInt4632, super.aClass223_124);
		this.aClass4_21 = Static100.method2419(local10.anInt4626, super.aClass223_124);
		this.aClass4_24 = Static100.method2419(local10.anInt4634, super.aClass223_124);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method7993() {
		if (!super.method7993()) {
			return false;
		}
		@Pc(13) Class109_Sub1 local13 = (Class109_Sub1) super.aClass109_5;
		if (!super.aClass223_124.method5951(local13.anInt4633)) {
			return false;
		} else if (!super.aClass223_124.method5951(local13.anInt4628)) {
			return false;
		} else if (!super.aClass223_124.method5951(local13.anInt4635)) {
			return false;
		} else if (!super.aClass223_124.method5951(local13.anInt4632)) {
			return false;
		} else if (super.aClass223_124.method5951(local13.anInt4626)) {
			return super.aClass223_124.method5951(local13.anInt4634);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIBZ)V")
	@Override
	protected final void method7537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		Static467.aClass5_13.K(local8);
		Static467.aClass5_13.KA(arg1, arg0, arg1 + super.aClass109_5.anInt9913, arg0 - -super.aClass109_5.anInt9904);
		@Pc(30) int local30 = this.aClass4_23.method7700();
		@Pc(34) int local34 = this.aClass4_23.method7712();
		@Pc(38) int local38 = this.aClass4_25.method7700();
		@Pc(42) int local42 = this.aClass4_25.method7712();
		this.aClass4_23.method7698(arg1, (super.aClass109_5.anInt9904 - local34) / 2 + arg0);
		this.aClass4_25.method7698(arg1 + super.aClass109_5.anInt9913 - local38, (super.aClass109_5.anInt9904 + -local42) / 2 + arg0);
		Static467.aClass5_13.KA(arg1, arg0, super.aClass109_5.anInt9913 + arg1, this.aClass4_21.method7712() + arg0);
		this.aClass4_21.method7701(arg1 + local30, arg0, super.aClass109_5.anInt9913 - local38 - local30, super.aClass109_5.anInt9904);
		@Pc(115) int local115 = this.aClass4_24.method7712();
		Static467.aClass5_13.KA(arg1, arg0 + super.aClass109_5.anInt9904 - local115, super.aClass109_5.anInt9913 + arg1, arg0 + super.aClass109_5.anInt9904);
		this.aClass4_24.method7701(arg1 + local30, -local115 + (arg0 - -super.aClass109_5.anInt9904), super.aClass109_5.anInt9913 - local38 - local30, super.aClass109_5.anInt9904);
		Static467.aClass5_13.KA(local8[0], local8[1], local8[2], local8[3]);
	}
}
