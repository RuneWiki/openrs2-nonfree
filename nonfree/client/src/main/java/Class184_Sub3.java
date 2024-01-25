import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class184_Sub3 extends Class184 {

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "Lclient!xa;")
	private Class4 aClass4_24;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "Lclient!xa;")
	private Class4 aClass4_25;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
	private int anInt7947;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "Lclient!xa;")
	private Class4 aClass4_26;

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "Lclient!xa;")
	private Class4 aClass4_27;

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "Lclient!xa;")
	private Class4 aClass4_28;

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "Lclient!xa;")
	private Class4 aClass4_29;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "Lclient!pq;")
	private final Class251 aClass251_132;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!pq;Lclient!rda;)V")
	public Class184_Sub3(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class10_Sub3 arg1) {
		super(arg1);
		this.aClass251_132 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method6570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int[] local12 = new int[4];
		Static176.aClass121_5.A(local12);
		Static176.aClass121_5.ca(arg0, arg1, arg0 + super.aClass10_4.anInt7621, super.aClass10_4.anInt7623 + arg1);
		@Pc(34) int local34 = this.aClass4_27.AA();
		@Pc(38) int local38 = this.aClass4_27.a();
		@Pc(42) int local42 = this.aClass4_26.AA();
		@Pc(46) int local46 = this.aClass4_26.a();
		this.aClass4_27.method6514(arg0, (super.aClass10_4.anInt7623 - local38) / 2 + arg1);
		this.aClass4_26.method6514(super.aClass10_4.anInt7621 + arg0 - local42, arg1 - -((super.aClass10_4.anInt7623 - local46) / 2));
		Static176.aClass121_5.ca(arg0, arg1, super.aClass10_4.anInt7621 + arg0, this.aClass4_29.a() + arg1);
		this.aClass4_29.method6516(arg0 + local34, arg1, super.aClass10_4.anInt7621 - local42 - local34, super.aClass10_4.anInt7623);
		@Pc(118) int local118 = this.aClass4_28.a();
		Static176.aClass121_5.ca(arg0, super.aClass10_4.anInt7623 + arg1 - local118, arg0 - -super.aClass10_4.anInt7621, super.aClass10_4.anInt7623 + arg1);
		this.aClass4_28.method6516(arg0 + local34, arg1 + super.aClass10_4.anInt7623 + -local118, super.aClass10_4.anInt7621 - local34 - local42, super.aClass10_4.anInt7623);
		Static176.aClass121_5.ca(local12[0], local12[1], local12[2], local12[3]);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method6569(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		this.anInt7947 = Static309.anInt5563;
		@Pc(14) int local14 = arg0 + this.aClass4_27.AA();
		@Pc(25) int local25 = super.aClass10_4.anInt7621 + arg0 - this.aClass4_26.AA();
		@Pc(31) int local31 = this.aClass4_29.a() + arg1;
		@Pc(42) int local42 = arg1 + super.aClass10_4.anInt7623 - this.aClass4_28.a();
		@Pc(47) int local47 = local25 - local14;
		@Pc(52) int local52 = local42 - local31;
		@Pc(58) int local58 = local47 * Static309.anInt5563 / 100;
		@Pc(61) int[] local61 = new int[4];
		Static176.aClass121_5.A(local61);
		Static176.aClass121_5.ca(local14, local31, local14 + local58, local42);
		this.aClass4_25.method6516(local14, local31, local47, local52);
		Static176.aClass121_5.ca(local14 + local58, local31, local25, local42);
		this.aClass4_24.method6516(local14, local31, local47, local52);
		Static176.aClass121_5.ca(local61[0], local61[1], local61[2], local61[3]);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	@Override
	public void method6567() {
		@Pc(7) Class10_Sub3 local7 = (Class10_Sub3) super.aClass10_4;
		this.aClass4_25 = Static96.method1502(this.aClass251_132.method5855(local7.anInt7633));
		this.aClass4_24 = Static96.method1502(this.aClass251_132.method5855(local7.anInt7629));
		this.aClass4_27 = Static96.method1502(this.aClass251_132.method5855(local7.anInt7627));
		this.aClass4_26 = Static96.method1502(this.aClass251_132.method5855(local7.anInt7628));
		this.aClass4_29 = Static96.method1502(this.aClass251_132.method5855(local7.anInt7630));
		this.aClass4_28 = Static96.method1502(this.aClass251_132.method5855(local7.anInt7631));
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6566() {
		@Pc(7) Class10_Sub3 local7 = (Class10_Sub3) super.aClass10_4;
		if (!this.aClass251_132.method5859(local7.anInt7633)) {
			return false;
		} else if (!this.aClass251_132.method5859(local7.anInt7629)) {
			return false;
		} else if (!this.aClass251_132.method5859(local7.anInt7627)) {
			return false;
		} else if (!this.aClass251_132.method5859(local7.anInt7628)) {
			return false;
		} else if (this.aClass251_132.method5859(local7.anInt7630)) {
			return this.aClass251_132.method5859(local7.anInt7628);
		} else {
			return false;
		}
	}
}
