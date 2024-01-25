import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public class Class137_Sub2 extends Class137 {

	@OriginalMember(owner = "client!jk", name = "s", descriptor = "Lclient!f;")
	protected Class38 aClass38_32;

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "Lclient!f;")
	private Class38 aClass38_33;

	@OriginalMember(owner = "client!jk", name = "v", descriptor = "Lclient!f;")
	private Class38 aClass38_34;

	@OriginalMember(owner = "client!jk", name = "z", descriptor = "Lclient!f;")
	private Class38 aClass38_35;

	@OriginalMember(owner = "client!jk", name = "C", descriptor = "Lclient!f;")
	private Class38 aClass38_36;

	@OriginalMember(owner = "client!jk", name = "E", descriptor = "Lclient!f;")
	private Class38 aClass38_37;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!mv;Lclient!mv;Lclient!pc;)V")
	public Class137_Sub2(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class153_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZII)V")
	@Override
	protected final void method7223(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = arg1 + this.aClass38_35.A();
		@Pc(24) int local24 = arg1 + super.aClass153_5.anInt9316 - this.aClass38_33.A();
		@Pc(30) int local30 = this.aClass38_37.ca() + arg0;
		@Pc(40) int local40 = super.aClass153_5.anInt9312 + arg0 - this.aClass38_34.ca();
		@Pc(45) int local45 = local24 - local13;
		@Pc(50) int local50 = local40 - local30;
		@Pc(58) int local58 = local45 * this.method7224() / 10000;
		@Pc(61) int[] local61 = new int[4];
		Static417.aClass162_17.oa(local61);
		Static417.aClass162_17.da(local13, local30, local58 + local13, local40);
		this.method5834(local45, local30, local13, local50);
		Static417.aClass162_17.da(local58 + local13, local30, local24, local40);
		this.aClass38_36.method7457(local13, local30, local45, local50);
		Static417.aClass162_17.da(local61[0], local61[1], local61[2], local61[3]);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method7257() {
		if (!super.method7257()) {
			return false;
		}
		@Pc(13) Class153_Sub2 local13 = (Class153_Sub2) super.aClass153_5;
		if (!super.aClass229_123.method4954(local13.anInt9326)) {
			return false;
		} else if (!super.aClass229_123.method4954(local13.anInt9320)) {
			return false;
		} else if (!super.aClass229_123.method4954(local13.anInt9319)) {
			return false;
		} else if (!super.aClass229_123.method4954(local13.anInt9318)) {
			return false;
		} else if (super.aClass229_123.method4954(local13.anInt9322)) {
			return super.aClass229_123.method4954(local13.anInt9321);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZIII)V")
	@Override
	protected final void method7226(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(12) int[] local12 = new int[4];
		Static417.aClass162_17.oa(local12);
		Static417.aClass162_17.da(arg0, arg1, arg0 + super.aClass153_5.anInt9316, arg1 - -super.aClass153_5.anInt9312);
		@Pc(34) int local34 = this.aClass38_35.A();
		@Pc(38) int local38 = this.aClass38_35.ca();
		@Pc(42) int local42 = this.aClass38_33.A();
		@Pc(46) int local46 = this.aClass38_33.ca();
		this.aClass38_35.method7463(arg0, (super.aClass153_5.anInt9312 - local38) / 2 + arg1);
		this.aClass38_33.method7463(arg0 + super.aClass153_5.anInt9316 - local42, arg1 - -((-local46 + super.aClass153_5.anInt9312) / 2));
		Static417.aClass162_17.da(arg0, arg1, arg0 + super.aClass153_5.anInt9316, this.aClass38_37.ca() + arg1);
		this.aClass38_37.method7457(local34 + arg0, arg1, super.aClass153_5.anInt9316 - local42 - local34, super.aClass153_5.anInt9312);
		@Pc(120) int local120 = this.aClass38_34.ca();
		Static417.aClass162_17.da(arg0, arg1 + super.aClass153_5.anInt9312 - local120, super.aClass153_5.anInt9316 + arg0, super.aClass153_5.anInt9312 + arg1);
		this.aClass38_34.method7457(arg0 + local34, super.aClass153_5.anInt9312 + arg1 - local120, super.aClass153_5.anInt9316 - local34 - local42, super.aClass153_5.anInt9312);
		Static417.aClass162_17.da(local12[0], local12[1], local12[2], local12[3]);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	@Override
	public final void method7258() {
		super.method7258();
		@Pc(10) Class153_Sub2 local10 = (Class153_Sub2) super.aClass153_5;
		this.aClass38_32 = Static214.method2618(super.aClass229_123, local10.anInt9326);
		this.aClass38_36 = Static214.method2618(super.aClass229_123, local10.anInt9320);
		this.aClass38_35 = Static214.method2618(super.aClass229_123, local10.anInt9319);
		this.aClass38_33 = Static214.method2618(super.aClass229_123, local10.anInt9318);
		this.aClass38_37 = Static214.method2618(super.aClass229_123, local10.anInt9322);
		this.aClass38_34 = Static214.method2618(super.aClass229_123, local10.anInt9321);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII)V")
	protected void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass38_32.method7457(arg2, arg1, arg0, arg3);
	}
}
