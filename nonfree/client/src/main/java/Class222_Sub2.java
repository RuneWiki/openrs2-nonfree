import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public class Class222_Sub2 extends Class222 {

	@OriginalMember(owner = "client!su", name = "o", descriptor = "Lclient!f;")
	private Class46 aClass46_22;

	@OriginalMember(owner = "client!su", name = "q", descriptor = "Lclient!f;")
	private Class46 aClass46_23;

	@OriginalMember(owner = "client!su", name = "r", descriptor = "Lclient!f;")
	private Class46 aClass46_24;

	@OriginalMember(owner = "client!su", name = "v", descriptor = "Lclient!f;")
	private Class46 aClass46_25;

	@OriginalMember(owner = "client!su", name = "x", descriptor = "Lclient!f;")
	private Class46 aClass46_26;

	@OriginalMember(owner = "client!su", name = "A", descriptor = "Lclient!f;")
	protected Class46 aClass46_27;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!om;Lclient!om;Lclient!tp;)V")
	public Class222_Sub2(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class94_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method6783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.aClass46_24.A() + arg0;
		@Pc(27) int local27 = arg0 + super.aClass94_5.anInt8263 - this.aClass46_26.A();
		@Pc(34) int local34 = arg1 + this.aClass46_22.ca();
		@Pc(46) int local46 = arg1 + super.aClass94_5.anInt8262 - this.aClass46_25.ca();
		@Pc(51) int local51 = local27 - local9;
		@Pc(56) int local56 = local46 - local34;
		@Pc(64) int local64 = local51 * this.method6786() / 10000;
		@Pc(67) int[] local67 = new int[4];
		Static4.aClass43_1.oa(local67);
		Static4.aClass43_1.da(local9, local34, local64 + local9, local46);
		this.method5817(local56, local51, local34, local9);
		Static4.aClass43_1.da(local9 + local64, local34, local27, local46);
		this.aClass46_23.method7612(local9, local34, local51, local56);
		Static4.aClass43_1.da(local67[0], local67[1], local67[2], local67[3]);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII)V")
	protected void method5817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass46_27.method7612(arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method7790() {
		if (!super.method7790()) {
			return false;
		}
		@Pc(13) Class94_Sub1 local13 = (Class94_Sub1) super.aClass94_5;
		if (!super.aClass246_236.method5667(local13.anInt3443)) {
			return false;
		} else if (!super.aClass246_236.method5667(local13.anInt3449)) {
			return false;
		} else if (!super.aClass246_236.method5667(local13.anInt3445)) {
			return false;
		} else if (!super.aClass246_236.method5667(local13.anInt3452)) {
			return false;
		} else if (super.aClass246_236.method5667(local13.anInt3444)) {
			return super.aClass246_236.method5667(local13.anInt3446);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIZI)V")
	@Override
	protected final void method6781(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(10) int[] local10 = new int[4];
		Static4.aClass43_1.oa(local10);
		Static4.aClass43_1.da(arg0, arg1, super.aClass94_5.anInt8263 + arg0, super.aClass94_5.anInt8262 + arg1);
		@Pc(31) int local31 = this.aClass46_24.A();
		@Pc(35) int local35 = this.aClass46_24.ca();
		@Pc(39) int local39 = this.aClass46_26.A();
		@Pc(43) int local43 = this.aClass46_26.ca();
		this.aClass46_24.method7606(arg0, (super.aClass94_5.anInt8262 - local35) / 2 + arg1);
		this.aClass46_26.method7606(arg0 + super.aClass94_5.anInt8263 - local39, arg1 + (super.aClass94_5.anInt8262 - local43) / 2);
		Static4.aClass43_1.da(arg0, arg1, arg0 + super.aClass94_5.anInt8263, this.aClass46_22.ca() + arg1);
		this.aClass46_22.method7612(local31 + arg0, arg1, super.aClass94_5.anInt8263 - local31 - local39, super.aClass94_5.anInt8262);
		@Pc(115) int local115 = this.aClass46_25.ca();
		Static4.aClass43_1.da(arg0, super.aClass94_5.anInt8262 + arg1 - local115, arg0 - -super.aClass94_5.anInt8263, super.aClass94_5.anInt8262 + arg1);
		this.aClass46_25.method7612(arg0 + local31, arg1 + super.aClass94_5.anInt8262 + -local115, super.aClass94_5.anInt8263 - local31 - local39, super.aClass94_5.anInt8262);
		Static4.aClass43_1.da(local10[0], local10[1], local10[2], local10[3]);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	@Override
	public final void method7789() {
		super.method7789();
		@Pc(10) Class94_Sub1 local10 = (Class94_Sub1) super.aClass94_5;
		this.aClass46_27 = Static292.method4651(super.aClass246_236, local10.anInt3443);
		this.aClass46_23 = Static292.method4651(super.aClass246_236, local10.anInt3449);
		this.aClass46_24 = Static292.method4651(super.aClass246_236, local10.anInt3445);
		this.aClass46_26 = Static292.method4651(super.aClass246_236, local10.anInt3452);
		this.aClass46_22 = Static292.method4651(super.aClass246_236, local10.anInt3444);
		this.aClass46_25 = Static292.method4651(super.aClass246_236, local10.anInt3446);
	}
}
