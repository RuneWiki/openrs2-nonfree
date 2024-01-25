import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public class Class88_Sub1 extends Class88 {

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "Lclient!xa;")
	private Class37 aClass37_20;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "Lclient!xa;")
	private Class37 aClass37_21;

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "Lclient!xa;")
	private Class37 aClass37_22;

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "Lclient!xa;")
	private Class37 aClass37_23;

	@OriginalMember(owner = "client!eo", name = "B", descriptor = "Lclient!xa;")
	protected Class37 aClass37_24;

	@OriginalMember(owner = "client!eo", name = "C", descriptor = "Lclient!xa;")
	private Class37 aClass37_25;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!pe;Lclient!pe;Lclient!rw;)V")
	public Class88_Sub1(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class260_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZIB)V")
	@Override
	protected final void method8282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		Static546.aClass15_16.A(local4);
		Static546.aClass15_16.ca(arg1, arg0, arg1 + super.aClass260_5.anInt9475, arg0 - -super.aClass260_5.anInt9476);
		@Pc(26) int local26 = this.aClass37_22.AA();
		@Pc(30) int local30 = this.aClass37_22.a();
		@Pc(34) int local34 = this.aClass37_21.AA();
		@Pc(38) int local38 = this.aClass37_21.a();
		this.aClass37_22.method7076(arg1, arg0 + (super.aClass260_5.anInt9476 - local30) / 2);
		this.aClass37_21.method7076(arg1 + super.aClass260_5.anInt9475 - local34, arg0 - -((-local38 + super.aClass260_5.anInt9476) / 2));
		Static546.aClass15_16.ca(arg1, arg0, super.aClass260_5.anInt9475 + arg1, this.aClass37_20.a() + arg0);
		this.aClass37_20.method7083(local26 + arg1, arg0, super.aClass260_5.anInt9475 - local34 - local26, super.aClass260_5.anInt9476);
		@Pc(112) int local112 = this.aClass37_25.a();
		Static546.aClass15_16.ca(arg1, arg0 + super.aClass260_5.anInt9476 - local112, arg1 + super.aClass260_5.anInt9475, arg0 + super.aClass260_5.anInt9476);
		this.aClass37_25.method7083(local26 + arg1, super.aClass260_5.anInt9476 + arg0 - local112, super.aClass260_5.anInt9475 - local34 - local26, super.aClass260_5.anInt9476);
		Static546.aClass15_16.ca(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIII)V")
	protected void method3340(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass37_24.method7083(arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	@Override
	public final void method8277() {
		super.method8277();
		@Pc(10) Class260_Sub1 local10 = (Class260_Sub1) super.aClass260_5;
		this.aClass37_24 = Static518.method7687(local10.anInt8147, super.aClass254_138);
		this.aClass37_23 = Static518.method7687(local10.anInt8146, super.aClass254_138);
		this.aClass37_22 = Static518.method7687(local10.anInt8145, super.aClass254_138);
		this.aClass37_21 = Static518.method7687(local10.anInt8144, super.aClass254_138);
		this.aClass37_20 = Static518.method7687(local10.anInt8148, super.aClass254_138);
		this.aClass37_25 = Static518.method7687(local10.anInt8150, super.aClass254_138);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8278() {
		if (!super.method8278()) {
			return false;
		}
		@Pc(13) Class260_Sub1 local13 = (Class260_Sub1) super.aClass260_5;
		if (!super.aClass254_138.method6417(local13.anInt8147)) {
			return false;
		} else if (!super.aClass254_138.method6417(local13.anInt8146)) {
			return false;
		} else if (!super.aClass254_138.method6417(local13.anInt8145)) {
			return false;
		} else if (!super.aClass254_138.method6417(local13.anInt8144)) {
			return false;
		} else if (super.aClass254_138.method6417(local13.anInt8148)) {
			return super.aClass254_138.method6417(local13.anInt8150);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZIII)V")
	@Override
	protected final void method8280(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) int local9 = this.aClass37_22.AA() + arg1;
		@Pc(21) int local21 = arg1 + super.aClass260_5.anInt9475 - this.aClass37_21.AA();
		@Pc(27) int local27 = this.aClass37_20.a() + arg0;
		@Pc(39) int local39 = arg0 + super.aClass260_5.anInt9476 - this.aClass37_25.a();
		@Pc(44) int local44 = local21 - local9;
		@Pc(48) int local48 = local39 - local27;
		@Pc(56) int local56 = local44 * this.method8279() / 10000;
		@Pc(59) int[] local59 = new int[4];
		Static546.aClass15_16.A(local59);
		Static546.aClass15_16.ca(local9, local27, local56 + local9, local39);
		this.method3340(local9, local48, local27, local44);
		Static546.aClass15_16.ca(local56 + local9, local27, local21, local39);
		this.aClass37_23.method7083(local9, local27, local44, local48);
		Static546.aClass15_16.ca(local59[0], local59[1], local59[2], local59[3]);
	}
}
