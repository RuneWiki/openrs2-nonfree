import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mha")
public class Class122_Sub2 extends Class122 {

	@OriginalMember(owner = "client!mha", name = "r", descriptor = "Lclient!kr;")
	private Class20 aClass20_21;

	@OriginalMember(owner = "client!mha", name = "t", descriptor = "Lclient!kr;")
	private Class20 aClass20_22;

	@OriginalMember(owner = "client!mha", name = "x", descriptor = "Lclient!kr;")
	private Class20 aClass20_23;

	@OriginalMember(owner = "client!mha", name = "y", descriptor = "Lclient!kr;")
	protected Class20 aClass20_24;

	@OriginalMember(owner = "client!mha", name = "z", descriptor = "Lclient!kr;")
	private Class20 aClass20_25;

	@OriginalMember(owner = "client!mha", name = "A", descriptor = "Lclient!kr;")
	private Class20 aClass20_26;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lclient!eq;Lclient!eq;Lclient!baa;)V")
	public Class122_Sub2(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class8_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIZI)V")
	@Override
	protected final void method7105(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(10) int[] local10 = new int[4];
		Static600.aClass87_15.K(local10);
		Static600.aClass87_15.KA(arg1, arg0, arg1 + super.aClass8_5.anInt5334, super.aClass8_5.anInt5330 + arg0);
		@Pc(31) int local31 = this.aClass20_23.method4588();
		@Pc(35) int local35 = this.aClass20_23.method4576();
		@Pc(39) int local39 = this.aClass20_22.method4588();
		@Pc(43) int local43 = this.aClass20_22.method4576();
		this.aClass20_23.method4582(arg1, arg0 + (super.aClass8_5.anInt5330 - local35) / 2);
		this.aClass20_22.method4582(arg1 + super.aClass8_5.anInt5334 - local39, arg0 + (-local43 + super.aClass8_5.anInt5330) / 2);
		Static600.aClass87_15.KA(arg1, arg0, super.aClass8_5.anInt5334 + arg1, this.aClass20_26.method4576() + arg0);
		this.aClass20_26.method4584(local31 + arg1, arg0, super.aClass8_5.anInt5334 - local31 - local39, super.aClass8_5.anInt5330);
		@Pc(113) int local113 = this.aClass20_25.method4576();
		Static600.aClass87_15.KA(arg1, arg0 + super.aClass8_5.anInt5330 - local113, super.aClass8_5.anInt5334 + arg1, super.aClass8_5.anInt5330 + arg0);
		this.aClass20_25.method4584(arg1 + local31, -local113 + arg0 - -super.aClass8_5.anInt5330, super.aClass8_5.anInt5334 - local39 - local31, super.aClass8_5.anInt5330);
		Static600.aClass87_15.KA(local10[0], local10[1], local10[2], local10[3]);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IBZI)V")
	@Override
	protected final void method7101(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(10) int local10 = arg0 + this.aClass20_23.method4588();
		@Pc(21) int local21 = super.aClass8_5.anInt5334 + arg0 - this.aClass20_22.method4588();
		@Pc(27) int local27 = this.aClass20_26.method4576() + arg1;
		@Pc(38) int local38 = super.aClass8_5.anInt5330 + arg1 - this.aClass20_25.method4576();
		@Pc(43) int local43 = local21 - local10;
		@Pc(53) int local53 = local38 - local27;
		@Pc(61) int local61 = local43 * this.method7099() / 10000;
		@Pc(64) int[] local64 = new int[4];
		Static600.aClass87_15.K(local64);
		Static600.aClass87_15.KA(local10, local27, local61 + local10, local38);
		this.method4820(local10, local53, local43, local27);
		Static600.aClass87_15.KA(local61 + local10, local27, local21, local38);
		this.aClass20_21.method4584(local10, local27, local43, local53);
		Static600.aClass87_15.KA(local64[0], local64[1], local64[2], local64[3]);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
	@Override
	public final void method8024() {
		super.method8024();
		@Pc(10) Class8_Sub2 local10 = (Class8_Sub2) super.aClass8_5;
		this.aClass20_24 = Static385.method5796(super.aClass97_127, local10.anInt4422);
		this.aClass20_21 = Static385.method5796(super.aClass97_127, local10.anInt4429);
		this.aClass20_23 = Static385.method5796(super.aClass97_127, local10.anInt4432);
		this.aClass20_22 = Static385.method5796(super.aClass97_127, local10.anInt4430);
		this.aClass20_26 = Static385.method5796(super.aClass97_127, local10.anInt4423);
		this.aClass20_25 = Static385.method5796(super.aClass97_127, local10.anInt4426);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8023() {
		if (!super.method8023()) {
			return false;
		}
		@Pc(19) Class8_Sub2 local19 = (Class8_Sub2) super.aClass8_5;
		if (!super.aClass97_127.method2564(local19.anInt4422)) {
			return false;
		} else if (!super.aClass97_127.method2564(local19.anInt4429)) {
			return false;
		} else if (!super.aClass97_127.method2564(local19.anInt4432)) {
			return false;
		} else if (!super.aClass97_127.method2564(local19.anInt4430)) {
			return false;
		} else if (super.aClass97_127.method2564(local19.anInt4423)) {
			return super.aClass97_127.method2564(local19.anInt4426);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIII)V")
	protected void method4820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass20_24.method4584(arg0, arg3, arg2, arg1);
	}
}
