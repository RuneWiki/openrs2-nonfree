import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "Lclient!it;")
	private Class28 aClass28_22;

	@OriginalMember(owner = "client!qp", name = "t", descriptor = "Lclient!it;")
	private Class28 aClass28_23;

	@OriginalMember(owner = "client!qp", name = "u", descriptor = "Lclient!it;")
	private Class28 aClass28_24;

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "Lclient!it;")
	private Class28 aClass28_25;

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "Lclient!it;")
	private Class28 aClass28_26;

	@OriginalMember(owner = "client!qp", name = "F", descriptor = "Lclient!it;")
	protected Class28 aClass28_27;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!or;)V")
	public Class31_Sub2(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class119_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	@Override
	public final void method8111() {
		super.method8111();
		@Pc(10) Class119_Sub1 local10 = (Class119_Sub1) super.aClass119_5;
		this.aClass28_27 = Static124.method1879(super.aClass207_110, local10.anInt3102);
		this.aClass28_25 = Static124.method1879(super.aClass207_110, local10.anInt3097);
		this.aClass28_23 = Static124.method1879(super.aClass207_110, local10.anInt3096);
		this.aClass28_26 = Static124.method1879(super.aClass207_110, local10.anInt3098);
		this.aClass28_22 = Static124.method1879(super.aClass207_110, local10.anInt3100);
		this.aClass28_24 = Static124.method1879(super.aClass207_110, local10.anInt3095);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBIZ)V")
	@Override
	protected final void method7900(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + this.aClass28_23.method4035();
		@Pc(20) int local20 = super.aClass119_5.anInt10371 + arg0 - this.aClass28_26.method4035();
		@Pc(26) int local26 = this.aClass28_22.method4042() + arg1;
		@Pc(36) int local36 = super.aClass119_5.anInt10373 + arg1 - this.aClass28_24.method4042();
		@Pc(41) int local41 = local20 - local9;
		@Pc(46) int local46 = local36 - local26;
		@Pc(54) int local54 = this.method7897() * local41 / 10000;
		@Pc(57) int[] local57 = new int[4];
		Static213.aClass133_5.K(local57);
		Static213.aClass133_5.KA(local9, local26, local9 + local54, local36);
		this.method6897(local41, local9, local46, local26);
		Static213.aClass133_5.KA(local9 + local54, local26, local20, local36);
		this.aClass28_25.method4047(local9, local26, local41, local46);
		Static213.aClass133_5.KA(local57[0], local57[1], local57[2], local57[3]);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIII)V")
	protected void method6897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass28_27.method4047(arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIZI)V")
	@Override
	protected final void method7899(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		Static213.aClass133_5.K(local8);
		Static213.aClass133_5.KA(arg0, arg1, arg0 + super.aClass119_5.anInt10371, arg1 - -super.aClass119_5.anInt10373);
		@Pc(31) int local31 = this.aClass28_23.method4035();
		@Pc(35) int local35 = this.aClass28_23.method4042();
		@Pc(39) int local39 = this.aClass28_26.method4035();
		@Pc(43) int local43 = this.aClass28_26.method4042();
		this.aClass28_23.method4040(arg0, (super.aClass119_5.anInt10373 - local35) / 2 + arg1);
		this.aClass28_26.method4040(arg0 + super.aClass119_5.anInt10371 - local39, arg1 + (super.aClass119_5.anInt10373 + -local43) / 2);
		Static213.aClass133_5.KA(arg0, arg1, arg0 + super.aClass119_5.anInt10371, arg1 + this.aClass28_22.method4042());
		this.aClass28_22.method4047(arg0 + local31, arg1, super.aClass119_5.anInt10371 - local39 - local31, super.aClass119_5.anInt10373);
		@Pc(114) int local114 = this.aClass28_24.method4042();
		Static213.aClass133_5.KA(arg0, arg1 + super.aClass119_5.anInt10373 - local114, super.aClass119_5.anInt10371 + arg0, super.aClass119_5.anInt10373 + arg1);
		this.aClass28_24.method4047(local31 + arg0, -local114 + super.aClass119_5.anInt10373 + arg1, super.aClass119_5.anInt10371 - local31 - local39, super.aClass119_5.anInt10373);
		Static213.aClass133_5.KA(local8[0], local8[1], local8[2], local8[3]);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8109() {
		if (!super.method8109()) {
			return false;
		}
		@Pc(13) Class119_Sub1 local13 = (Class119_Sub1) super.aClass119_5;
		if (!super.aClass207_110.method4678(local13.anInt3102)) {
			return false;
		} else if (!super.aClass207_110.method4678(local13.anInt3097)) {
			return false;
		} else if (!super.aClass207_110.method4678(local13.anInt3096)) {
			return false;
		} else if (!super.aClass207_110.method4678(local13.anInt3098)) {
			return false;
		} else if (super.aClass207_110.method4678(local13.anInt3100)) {
			return super.aClass207_110.method4678(local13.anInt3095);
		} else {
			return false;
		}
	}
}
