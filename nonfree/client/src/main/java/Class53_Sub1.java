import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "Lclient!mi;")
	private Class46 aClass46_31;

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "Lclient!mi;")
	private Class46 aClass46_32;

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "Lclient!mi;")
	private Class46 aClass46_33;

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "Lclient!mi;")
	private Class46 aClass46_34;

	@OriginalMember(owner = "client!ce", name = "C", descriptor = "Lclient!mi;")
	private Class46 aClass46_35;

	@OriginalMember(owner = "client!ce", name = "G", descriptor = "Lclient!mi;")
	protected Class46 aClass46_36;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!in;Lclient!in;Lclient!um;)V")
	public Class53_Sub1(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class110_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method9232() {
		if (!super.method9232()) {
			return false;
		}
		@Pc(13) Class110_Sub1 local13 = (Class110_Sub1) super.aClass110_5;
		if (!super.aClass157_310.method4575(local13.anInt4102)) {
			return false;
		} else if (!super.aClass157_310.method4575(local13.anInt4099)) {
			return false;
		} else if (!super.aClass157_310.method4575(local13.anInt4105)) {
			return false;
		} else if (!super.aClass157_310.method4575(local13.anInt4104)) {
			return false;
		} else if (super.aClass157_310.method4575(local13.anInt4103)) {
			return super.aClass157_310.method4575(local13.anInt4100);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIBII)V")
	protected void method9242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass46_36.method6211(arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZBI)V")
	@Override
	protected final void method9234(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		Static186.aClass20_4.K(local4);
		Static186.aClass20_4.KA(arg0, arg1, arg0 + super.aClass110_5.anInt7743, arg1 + super.aClass110_5.anInt7736);
		@Pc(26) int local26 = this.aClass46_33.method6205();
		@Pc(30) int local30 = this.aClass46_33.method6219();
		@Pc(34) int local34 = this.aClass46_32.method6205();
		@Pc(38) int local38 = this.aClass46_32.method6219();
		this.aClass46_33.method6213(arg0, arg1 + (super.aClass110_5.anInt7736 - local30) / 2);
		this.aClass46_32.method6213(super.aClass110_5.anInt7743 + arg0 - local34, arg1 + (super.aClass110_5.anInt7736 + -local38) / 2);
		Static186.aClass20_4.KA(arg0, arg1, super.aClass110_5.anInt7743 + arg0, arg1 - -this.aClass46_34.method6219());
		this.aClass46_34.method6211(arg0 + local26, arg1, super.aClass110_5.anInt7743 - local26 - local34, super.aClass110_5.anInt7736);
		@Pc(111) int local111 = this.aClass46_31.method6219();
		Static186.aClass20_4.KA(arg0, arg1 + super.aClass110_5.anInt7736 - local111, super.aClass110_5.anInt7743 + arg0, arg1 + super.aClass110_5.anInt7736);
		this.aClass46_31.method6211(local26 + arg0, -local111 + arg1 + super.aClass110_5.anInt7736, super.aClass110_5.anInt7743 - local26 - local34, super.aClass110_5.anInt7736);
		Static186.aClass20_4.KA(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method9238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.aClass46_33.method6205() + arg1;
		@Pc(28) int local28 = super.aClass110_5.anInt7743 + arg1 - this.aClass46_32.method6205();
		@Pc(35) int local35 = arg0 + this.aClass46_34.method6219();
		@Pc(45) int local45 = arg0 + super.aClass110_5.anInt7736 - this.aClass46_31.method6219();
		@Pc(50) int local50 = local28 - local17;
		@Pc(55) int local55 = local45 - local35;
		@Pc(63) int local63 = this.method9239() * local50 / 10000;
		@Pc(66) int[] local66 = new int[4];
		Static186.aClass20_4.K(local66);
		Static186.aClass20_4.KA(local17, local35, local63 + local17, local45);
		this.method9242(local35, local55, local17, local50);
		Static186.aClass20_4.KA(local63 + local17, local35, local28, local45);
		this.aClass46_35.method6211(local17, local35, local50, local55);
		Static186.aClass20_4.KA(local66[0], local66[1], local66[2], local66[3]);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	@Override
	public final void method9231() {
		super.method9231();
		@Pc(10) Class110_Sub1 local10 = (Class110_Sub1) super.aClass110_5;
		this.aClass46_36 = Static166.method3585(local10.anInt4102, super.aClass157_310);
		this.aClass46_35 = Static166.method3585(local10.anInt4099, super.aClass157_310);
		this.aClass46_33 = Static166.method3585(local10.anInt4105, super.aClass157_310);
		this.aClass46_32 = Static166.method3585(local10.anInt4104, super.aClass157_310);
		this.aClass46_34 = Static166.method3585(local10.anInt4103, super.aClass157_310);
		this.aClass46_31 = Static166.method3585(local10.anInt4100, super.aClass157_310);
	}
}
