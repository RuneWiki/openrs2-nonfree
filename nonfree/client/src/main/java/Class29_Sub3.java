import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public class Class29_Sub3 extends Class29 {

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "Lclient!xa;")
	private Class13 aClass13_37;

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "Lclient!xa;")
	private Class13 aClass13_38;

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "Lclient!xa;")
	private Class13 aClass13_39;

	@OriginalMember(owner = "client!ov", name = "v", descriptor = "Lclient!xa;")
	private Class13 aClass13_40;

	@OriginalMember(owner = "client!ov", name = "C", descriptor = "Lclient!xa;")
	private Class13 aClass13_41;

	@OriginalMember(owner = "client!ov", name = "D", descriptor = "Lclient!xa;")
	protected Class13 aClass13_42;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!bi;Lclient!bi;Lclient!cf;)V")
	public Class29_Sub3(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class52_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
	@Override
	public final void method7804() {
		super.method7804();
		@Pc(10) Class52_Sub1 local10 = (Class52_Sub1) super.aClass52_5;
		this.aClass13_42 = Static484.method7810(super.aClass31_120, local10.anInt5408);
		this.aClass13_37 = Static484.method7810(super.aClass31_120, local10.anInt5409);
		this.aClass13_38 = Static484.method7810(super.aClass31_120, local10.anInt5406);
		this.aClass13_40 = Static484.method7810(super.aClass31_120, local10.anInt5405);
		this.aClass13_39 = Static484.method7810(super.aClass31_120, local10.anInt5407);
		this.aClass13_41 = Static484.method7810(super.aClass31_120, local10.anInt5412);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method7807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.aClass13_38.AA() + arg1;
		@Pc(19) int local19 = super.aClass52_5.anInt8822 + arg1 - this.aClass13_40.AA();
		@Pc(25) int local25 = arg0 + this.aClass13_39.a();
		@Pc(36) int local36 = super.aClass52_5.anInt8828 + arg0 - this.aClass13_41.a();
		@Pc(41) int local41 = local19 - local9;
		@Pc(46) int local46 = local36 - local25;
		@Pc(54) int local54 = this.method7813() * local41 / 10000;
		@Pc(57) int[] local57 = new int[4];
		Static185.aClass66_14.A(local57);
		Static185.aClass66_14.ca(local9, local25, local9 + local54, local36);
		this.method7814(local9, local46, local25, local41);
		Static185.aClass66_14.ca(local54 + local9, local25, local19, local36);
		this.aClass13_37.method8027(local9, local25, local41, local46);
		Static185.aClass66_14.ca(local57[0], local57[1], local57[2], local57[3]);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIZI)V")
	protected void method7814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.aClass13_42.method8027(arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(IIIZ)V")
	@Override
	protected final void method7812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		Static185.aClass66_14.A(local4);
		Static185.aClass66_14.ca(arg1, arg0, super.aClass52_5.anInt8822 + arg1, arg0 + super.aClass52_5.anInt8828);
		@Pc(25) int local25 = this.aClass13_38.AA();
		@Pc(29) int local29 = this.aClass13_38.a();
		@Pc(33) int local33 = this.aClass13_40.AA();
		@Pc(37) int local37 = this.aClass13_40.a();
		this.aClass13_38.method8019(arg1, arg0 + (super.aClass52_5.anInt8828 - local29) / 2);
		this.aClass13_40.method8019(super.aClass52_5.anInt8822 + arg1 - local33, arg0 - -((-local37 + super.aClass52_5.anInt8828) / 2));
		Static185.aClass66_14.ca(arg1, arg0, super.aClass52_5.anInt8822 + arg1, this.aClass13_39.a() + arg0);
		this.aClass13_39.method8027(local25 + arg1, arg0, super.aClass52_5.anInt8822 - local33 - local25, super.aClass52_5.anInt8828);
		@Pc(110) int local110 = this.aClass13_41.a();
		Static185.aClass66_14.ca(arg1, super.aClass52_5.anInt8828 + arg0 - local110, super.aClass52_5.anInt8822 + arg1, super.aClass52_5.anInt8828 + arg0);
		this.aClass13_41.method8027(arg1 + local25, -local110 + arg0 + super.aClass52_5.anInt8828, super.aClass52_5.anInt8822 - local25 - local33, super.aClass52_5.anInt8828);
		Static185.aClass66_14.ca(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method7806() {
		if (!super.method7806()) {
			return false;
		}
		@Pc(13) Class52_Sub1 local13 = (Class52_Sub1) super.aClass52_5;
		if (!super.aClass31_120.method679(local13.anInt5408)) {
			return false;
		} else if (!super.aClass31_120.method679(local13.anInt5409)) {
			return false;
		} else if (!super.aClass31_120.method679(local13.anInt5406)) {
			return false;
		} else if (!super.aClass31_120.method679(local13.anInt5405)) {
			return false;
		} else if (super.aClass31_120.method679(local13.anInt5407)) {
			return super.aClass31_120.method679(local13.anInt5412);
		} else {
			return false;
		}
	}
}
