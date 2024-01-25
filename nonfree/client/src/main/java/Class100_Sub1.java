import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public class Class100_Sub1 extends Class100 {

	@OriginalMember(owner = "client!iea", name = "p", descriptor = "Lclient!xa;")
	private Class58 aClass58_14;

	@OriginalMember(owner = "client!iea", name = "u", descriptor = "Lclient!xa;")
	protected Class58 aClass58_15;

	@OriginalMember(owner = "client!iea", name = "v", descriptor = "Lclient!xa;")
	private Class58 aClass58_16;

	@OriginalMember(owner = "client!iea", name = "x", descriptor = "Lclient!xa;")
	private Class58 aClass58_17;

	@OriginalMember(owner = "client!iea", name = "z", descriptor = "Lclient!xa;")
	private Class58 aClass58_18;

	@OriginalMember(owner = "client!iea", name = "A", descriptor = "Lclient!xa;")
	private Class58 aClass58_19;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!pfa;Lclient!pfa;Lclient!vj;)V")
	public Class100_Sub1(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class18_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)Z")
	@Override
	public final boolean method7572() {
		if (!super.method7572()) {
			return false;
		}
		@Pc(13) Class18_Sub3 local13 = (Class18_Sub3) super.aClass18_5;
		if (!super.aClass251_87.method5782(local13.anInt6647)) {
			return false;
		} else if (!super.aClass251_87.method5782(local13.anInt6650)) {
			return false;
		} else if (!super.aClass251_87.method5782(local13.anInt6652)) {
			return false;
		} else if (!super.aClass251_87.method5782(local13.anInt6648)) {
			return false;
		} else if (super.aClass251_87.method5782(local13.anInt6656)) {
			return super.aClass251_87.method5782(local13.anInt6657);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V")
	@Override
	public final void method7570() {
		super.method7570();
		@Pc(10) Class18_Sub3 local10 = (Class18_Sub3) super.aClass18_5;
		this.aClass58_15 = Static588.method1984(super.aClass251_87, local10.anInt6647);
		this.aClass58_18 = Static588.method1984(super.aClass251_87, local10.anInt6650);
		this.aClass58_16 = Static588.method1984(super.aClass251_87, local10.anInt6652);
		this.aClass58_17 = Static588.method1984(super.aClass251_87, local10.anInt6648);
		this.aClass58_19 = Static588.method1984(super.aClass251_87, local10.anInt6656);
		this.aClass58_14 = Static588.method1984(super.aClass251_87, local10.anInt6657);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IBIII)V")
	protected void method2859(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass58_15.method7661(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZBII)V")
	@Override
	protected final void method5521(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) int local9 = arg0 + this.aClass58_16.AA();
		@Pc(21) int local21 = arg0 + super.aClass18_5.anInt6645 - this.aClass58_17.AA();
		@Pc(27) int local27 = this.aClass58_19.a() + arg1;
		@Pc(37) int local37 = arg1 + super.aClass18_5.anInt6643 - this.aClass58_14.a();
		@Pc(41) int local41 = local21 - local9;
		@Pc(45) int local45 = local37 - local27;
		@Pc(53) int local53 = local41 * this.method5520() / 10000;
		@Pc(56) int[] local56 = new int[4];
		Static240.aClass14_7.A(local56);
		Static240.aClass14_7.ca(local9, local27, local53 + local9, local37);
		this.method2859(local27, local9, local41, local45);
		Static240.aClass14_7.ca(local9 + local53, local27, local21, local37);
		this.aClass58_18.method7661(local9, local27, local41, local45);
		Static240.aClass14_7.ca(local56[0], local56[1], local56[2], local56[3]);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIZZ)V")
	@Override
	protected final void method5522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int[] local10 = new int[4];
		Static240.aClass14_7.A(local10);
		Static240.aClass14_7.ca(arg1, arg0, super.aClass18_5.anInt6645 + arg1, arg0 + super.aClass18_5.anInt6643);
		@Pc(31) int local31 = this.aClass58_16.AA();
		@Pc(35) int local35 = this.aClass58_16.a();
		@Pc(39) int local39 = this.aClass58_17.AA();
		@Pc(43) int local43 = this.aClass58_17.a();
		this.aClass58_16.method7666(arg1, (super.aClass18_5.anInt6643 - local35) / 2 + arg0);
		this.aClass58_17.method7666(arg1 + super.aClass18_5.anInt6645 - local39, (-local43 + super.aClass18_5.anInt6643) / 2 + arg0);
		Static240.aClass14_7.ca(arg1, arg0, arg1 + super.aClass18_5.anInt6645, arg0 - -this.aClass58_19.a());
		this.aClass58_19.method7661(local31 + arg1, arg0, super.aClass18_5.anInt6645 - local39 - local31, super.aClass18_5.anInt6643);
		@Pc(116) int local116 = this.aClass58_14.a();
		Static240.aClass14_7.ca(arg1, super.aClass18_5.anInt6643 + arg0 - local116, super.aClass18_5.anInt6645 + arg1, super.aClass18_5.anInt6643 + arg0);
		this.aClass58_14.method7661(local31 + arg1, arg0 - -super.aClass18_5.anInt6643 - local116, super.aClass18_5.anInt6645 - local31 - local39, super.aClass18_5.anInt6643);
		Static240.aClass14_7.ca(local10[0], local10[1], local10[2], local10[3]);
	}
}
