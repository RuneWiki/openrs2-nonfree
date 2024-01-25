import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!he", name = "o", descriptor = "Lclient!cw;")
	protected Class61 aClass61_20;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "Lclient!cw;")
	private Class61 aClass61_21;

	@OriginalMember(owner = "client!he", name = "s", descriptor = "Lclient!cw;")
	private Class61 aClass61_22;

	@OriginalMember(owner = "client!he", name = "t", descriptor = "Lclient!cw;")
	private Class61 aClass61_23;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "Lclient!cw;")
	private Class61 aClass61_24;

	@OriginalMember(owner = "client!he", name = "v", descriptor = "Lclient!cw;")
	private Class61 aClass61_25;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;Lclient!rg;)V")
	public Class137_Sub1(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class69_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	@Override
	public final void method8644() {
		super.method8644();
		@Pc(10) Class69_Sub1 local10 = (Class69_Sub1) super.aClass69_5;
		this.aClass61_20 = Static87.method1309(local10.anInt1774, super.aClass380_133);
		this.aClass61_22 = Static87.method1309(local10.anInt1771, super.aClass380_133);
		this.aClass61_21 = Static87.method1309(local10.anInt1777, super.aClass380_133);
		this.aClass61_25 = Static87.method1309(local10.anInt1775, super.aClass380_133);
		this.aClass61_24 = Static87.method1309(local10.anInt1779, super.aClass380_133);
		this.aClass61_23 = Static87.method1309(local10.anInt1776, super.aClass380_133);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BZII)V")
	@Override
	protected final void method8362(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int[] local13 = new int[4];
		Static192.aClass95_4.K(local13);
		Static192.aClass95_4.KA(arg0, arg1, arg0 + super.aClass69_5.anInt9616, arg1 + super.aClass69_5.anInt9604);
		@Pc(35) int local35 = this.aClass61_21.method6446();
		@Pc(39) int local39 = this.aClass61_21.method6438();
		@Pc(43) int local43 = this.aClass61_25.method6446();
		@Pc(47) int local47 = this.aClass61_25.method6438();
		this.aClass61_21.method6431(arg0, arg1 + (super.aClass69_5.anInt9604 - local39) / 2);
		this.aClass61_25.method6431(arg0 + super.aClass69_5.anInt9616 - local43, (-local47 + super.aClass69_5.anInt9604) / 2 + arg1);
		Static192.aClass95_4.KA(arg0, arg1, super.aClass69_5.anInt9616 + arg0, arg1 + this.aClass61_24.method6438());
		this.aClass61_24.method6439(local35 + arg0, arg1, super.aClass69_5.anInt9616 - local43 - local35, super.aClass69_5.anInt9604);
		@Pc(119) int local119 = this.aClass61_23.method6438();
		Static192.aClass95_4.KA(arg0, super.aClass69_5.anInt9604 + arg1 - local119, super.aClass69_5.anInt9616 + arg0, super.aClass69_5.anInt9604 + arg1);
		this.aClass61_23.method6439(arg0 + local35, -local119 + arg1 + super.aClass69_5.anInt9604, super.aClass69_5.anInt9616 - local35 - local43, super.aClass69_5.anInt9604);
		Static192.aClass95_4.KA(local13[0], local13[1], local13[2], local13[3]);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method8642() {
		if (!super.method8642()) {
			return false;
		}
		@Pc(13) Class69_Sub1 local13 = (Class69_Sub1) super.aClass69_5;
		if (!super.aClass380_133.method8638(local13.anInt1774)) {
			return false;
		} else if (!super.aClass380_133.method8638(local13.anInt1771)) {
			return false;
		} else if (!super.aClass380_133.method8638(local13.anInt1777)) {
			return false;
		} else if (!super.aClass380_133.method8638(local13.anInt1775)) {
			return false;
		} else if (super.aClass380_133.method8638(local13.anInt1779)) {
			return super.aClass380_133.method8638(local13.anInt1776);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIII)V")
	@Override
	protected final void method8360(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) int local9 = this.aClass61_21.method6446() + arg1;
		@Pc(20) int local20 = super.aClass69_5.anInt9616 + arg1 - this.aClass61_25.method6446();
		@Pc(26) int local26 = arg0 + this.aClass61_24.method6438();
		@Pc(37) int local37 = arg0 + super.aClass69_5.anInt9604 - this.aClass61_23.method6438();
		@Pc(42) int local42 = local20 - local9;
		@Pc(46) int local46 = local37 - local26;
		@Pc(54) int local54 = local42 * this.method8364() / 10000;
		@Pc(57) int[] local57 = new int[4];
		Static192.aClass95_4.K(local57);
		Static192.aClass95_4.KA(local9, local26, local9 + local54, local37);
		this.method5466(local9, local26, local46, local42);
		Static192.aClass95_4.KA(local9 + local54, local26, local20, local37);
		this.aClass61_22.method6439(local9, local26, local42, local46);
		Static192.aClass95_4.KA(local57[0], local57[1], local57[2], local57[3]);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V")
	protected void method5466(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass61_20.method6439(arg0, arg1, arg3, arg2);
	}
}
