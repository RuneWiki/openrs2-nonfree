import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public class Class154_Sub2 extends Class154 {

	@OriginalMember(owner = "client!us", name = "x", descriptor = "Lclient!tb;")
	private Class49 aClass49_17;

	@OriginalMember(owner = "client!us", name = "w", descriptor = "Lclient!tb;")
	private Class49 aClass49_18;

	@OriginalMember(owner = "client!us", name = "o", descriptor = "Lclient!tb;")
	private Class49 aClass49_19;

	@OriginalMember(owner = "client!us", name = "n", descriptor = "Lclient!tb;")
	private Class49 aClass49_20;

	@OriginalMember(owner = "client!us", name = "v", descriptor = "Lclient!tb;")
	protected Class49 aClass49_21;

	@OriginalMember(owner = "client!us", name = "y", descriptor = "Lclient!tb;")
	private Class49 aClass49_22;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!lga;Lclient!lga;Lclient!no;)V")
	public Class154_Sub2(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class58_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BIZI)V")
	@Override
	protected final void method8042(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(10) int local10 = arg1 + this.aClass49_22.method8991();
		@Pc(22) int local22 = arg1 + super.aClass58_5.anInt10052 - this.aClass49_19.method8991();
		@Pc(28) int local28 = this.aClass49_17.method8987() + arg0;
		@Pc(39) int local39 = super.aClass58_5.anInt10050 + arg0 - this.aClass49_18.method8987();
		@Pc(48) int local48 = local22 - local10;
		@Pc(53) int local53 = local39 - local28;
		@Pc(61) int local61 = this.method8043() * local48 / 10000;
		@Pc(64) int[] local64 = new int[4];
		Static202.aClass75_5.K(local64);
		Static202.aClass75_5.KA(local10, local28, local10 + local61, local39);
		this.method4199(local53, local28, local48, local10);
		Static202.aClass75_5.KA(local61 + local10, local28, local22, local39);
		this.aClass49_20.method8998(local10, local28, local48, local53);
		Static202.aClass75_5.KA(local64[0], local64[1], local64[2], local64[3]);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8038() {
		if (!super.method8038()) {
			return false;
		}
		@Pc(20) Class58_Sub2 local20 = (Class58_Sub2) super.aClass58_5;
		if (!super.aClass223_109.method5285(local20.anInt9131)) {
			return false;
		} else if (!super.aClass223_109.method5285(local20.anInt9129)) {
			return false;
		} else if (!super.aClass223_109.method5285(local20.anInt9130)) {
			return false;
		} else if (!super.aClass223_109.method5285(local20.anInt9126)) {
			return false;
		} else if (super.aClass223_109.method5285(local20.anInt9125)) {
			return super.aClass223_109.method5285(local20.anInt9124);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIBZ)V")
	@Override
	protected final void method8041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int[] local12 = new int[4];
		Static202.aClass75_5.K(local12);
		Static202.aClass75_5.KA(arg0, arg1, super.aClass58_5.anInt10052 + arg0, arg1 - -super.aClass58_5.anInt10050);
		@Pc(34) int local34 = this.aClass49_22.method8991();
		@Pc(38) int local38 = this.aClass49_22.method8987();
		@Pc(42) int local42 = this.aClass49_19.method8991();
		@Pc(46) int local46 = this.aClass49_19.method8987();
		this.aClass49_22.method8997(arg0, (super.aClass58_5.anInt10050 - local38) / 2 + arg1);
		this.aClass49_19.method8997(arg0 + super.aClass58_5.anInt10052 - local42, arg1 - -((-local46 + super.aClass58_5.anInt10050) / 2));
		Static202.aClass75_5.KA(arg0, arg1, super.aClass58_5.anInt10052 + arg0, this.aClass49_17.method8987() + arg1);
		this.aClass49_17.method8998(local34 + arg0, arg1, super.aClass58_5.anInt10052 - local42 - local34, super.aClass58_5.anInt10050);
		@Pc(119) int local119 = this.aClass49_18.method8987();
		Static202.aClass75_5.KA(arg0, super.aClass58_5.anInt10050 + arg1 - local119, super.aClass58_5.anInt10052 + arg0, super.aClass58_5.anInt10050 + arg1);
		this.aClass49_18.method8998(arg0 + local34, arg1 + super.aClass58_5.anInt10050 - local119, super.aClass58_5.anInt10052 - local42 - local34, super.aClass58_5.anInt10050);
		Static202.aClass75_5.KA(local12[0], local12[1], local12[2], local12[3]);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIII)V")
	protected void method4199(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass49_21.method8998(arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	@Override
	public final void method8040() {
		super.method8040();
		@Pc(10) Class58_Sub2 local10 = (Class58_Sub2) super.aClass58_5;
		this.aClass49_21 = Static527.method7563(super.aClass223_109, local10.anInt9131);
		this.aClass49_20 = Static527.method7563(super.aClass223_109, local10.anInt9129);
		this.aClass49_22 = Static527.method7563(super.aClass223_109, local10.anInt9130);
		this.aClass49_19 = Static527.method7563(super.aClass223_109, local10.anInt9126);
		this.aClass49_17 = Static527.method7563(super.aClass223_109, local10.anInt9125);
		this.aClass49_18 = Static527.method7563(super.aClass223_109, local10.anInt9124);
	}
}
