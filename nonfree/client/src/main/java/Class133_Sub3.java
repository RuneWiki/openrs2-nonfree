import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public class Class133_Sub3 extends Class133 {

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Lclient!mq;")
	private Class71 aClass71_24;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "Lclient!mq;")
	private Class71 aClass71_25;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Lclient!mq;")
	private Class71 aClass71_26;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Lclient!mq;")
	protected Class71 aClass71_27;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!mq;")
	private Class71 aClass71_28;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!mq;")
	private Class71 aClass71_29;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!gga;Lclient!gga;Lclient!raa;)V")
	public Class133_Sub3(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class139_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	@Override
	public final void method7670() {
		super.method7670();
		@Pc(10) Class139_Sub2 local10 = (Class139_Sub2) super.aClass139_5;
		this.aClass71_27 = Static296.method4890(super.aClass124_98, local10.anInt8365);
		this.aClass71_26 = Static296.method4890(super.aClass124_98, local10.anInt8361);
		this.aClass71_25 = Static296.method4890(super.aClass124_98, local10.anInt8362);
		this.aClass71_29 = Static296.method4890(super.aClass124_98, local10.anInt8368);
		this.aClass71_28 = Static296.method4890(super.aClass124_98, local10.anInt8359);
		this.aClass71_24 = Static296.method4890(super.aClass124_98, local10.anInt8364);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIII)V")
	@Override
	protected final void method7275(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(19) int local19 = arg1 + this.aClass71_25.method7709();
		@Pc(30) int local30 = super.aClass139_5.anInt11174 + arg1 - this.aClass71_29.method7709();
		@Pc(36) int local36 = arg0 + this.aClass71_28.method7711();
		@Pc(46) int local46 = arg0 + super.aClass139_5.anInt11179 - this.aClass71_24.method7711();
		@Pc(50) int local50 = local30 - local19;
		@Pc(55) int local55 = local46 - local36;
		@Pc(63) int local63 = local50 * this.method7270() / 10000;
		@Pc(66) int[] local66 = new int[4];
		Static607.aClass101_15.K(local66);
		Static607.aClass101_15.KA(local19, local36, local63 + local19, local46);
		this.method7278(local36, local55, local19, local50);
		Static607.aClass101_15.KA(local63 + local19, local36, local30, local46);
		this.aClass71_26.method7701(local19, local36, local50, local55);
		Static607.aClass101_15.KA(local66[0], local66[1], local66[2], local66[3]);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method7668() {
		if (!super.method7668()) {
			return false;
		}
		@Pc(13) Class139_Sub2 local13 = (Class139_Sub2) super.aClass139_5;
		if (!super.aClass124_98.method3627(local13.anInt8365)) {
			return false;
		} else if (!super.aClass124_98.method3627(local13.anInt8361)) {
			return false;
		} else if (!super.aClass124_98.method3627(local13.anInt8362)) {
			return false;
		} else if (!super.aClass124_98.method3627(local13.anInt8368)) {
			return false;
		} else if (super.aClass124_98.method3627(local13.anInt8359)) {
			return super.aClass124_98.method3627(local13.anInt8364);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIIB)V")
	@Override
	protected final void method7269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		Static607.aClass101_15.K(local8);
		Static607.aClass101_15.KA(arg1, arg0, arg1 + super.aClass139_5.anInt11174, super.aClass139_5.anInt11179 + arg0);
		@Pc(29) int local29 = this.aClass71_25.method7709();
		@Pc(33) int local33 = this.aClass71_25.method7711();
		@Pc(37) int local37 = this.aClass71_29.method7709();
		@Pc(41) int local41 = this.aClass71_29.method7711();
		this.aClass71_25.method7703(arg1, arg0 + (super.aClass139_5.anInt11179 - local33) / 2);
		this.aClass71_29.method7703(arg1 + super.aClass139_5.anInt11174 - local37, arg0 - -((super.aClass139_5.anInt11179 - local41) / 2));
		Static607.aClass101_15.KA(arg1, arg0, super.aClass139_5.anInt11174 + arg1, arg0 - -this.aClass71_28.method7711());
		this.aClass71_28.method7701(local29 + arg1, arg0, super.aClass139_5.anInt11174 - local29 - local37, super.aClass139_5.anInt11179);
		@Pc(115) int local115 = this.aClass71_24.method7711();
		Static607.aClass101_15.KA(arg1, arg0 + super.aClass139_5.anInt11179 - local115, super.aClass139_5.anInt11174 + arg1, super.aClass139_5.anInt11179 + arg0);
		this.aClass71_24.method7701(local29 + arg1, super.aClass139_5.anInt11179 + arg0 + -local115, super.aClass139_5.anInt11174 - local37 - local29, super.aClass139_5.anInt11179);
		Static607.aClass101_15.KA(local8[0], local8[1], local8[2], local8[3]);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)V")
	protected void method7278(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass71_27.method7701(arg2, arg0, arg3, arg1);
	}
}
