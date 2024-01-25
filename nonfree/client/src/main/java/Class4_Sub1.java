import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!nw", name = "u", descriptor = "Lclient!pga;")
	private Class32 aClass32_23;

	@OriginalMember(owner = "client!nw", name = "w", descriptor = "Lclient!pga;")
	private Class32 aClass32_24;

	@OriginalMember(owner = "client!nw", name = "x", descriptor = "Lclient!pga;")
	protected Class32 aClass32_25;

	@OriginalMember(owner = "client!nw", name = "A", descriptor = "Lclient!pga;")
	private Class32 aClass32_26;

	@OriginalMember(owner = "client!nw", name = "C", descriptor = "Lclient!pga;")
	private Class32 aClass32_27;

	@OriginalMember(owner = "client!nw", name = "D", descriptor = "Lclient!pga;")
	private Class32 aClass32_28;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!vd;Lclient!vd;Lclient!ap;)V")
	public Class4_Sub1(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) Class22_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZBI)V")
	@Override
	protected final void method7045(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		Static162.aClass100_7.K(local8);
		Static162.aClass100_7.KA(arg0, arg1, arg0 + super.aClass22_5.anInt5441, super.aClass22_5.anInt5435 + arg1);
		@Pc(30) int local30 = this.aClass32_27.method5080();
		@Pc(34) int local34 = this.aClass32_27.method5079();
		@Pc(38) int local38 = this.aClass32_28.method5080();
		@Pc(42) int local42 = this.aClass32_28.method5079();
		this.aClass32_27.method5071(arg0, (super.aClass22_5.anInt5435 - local34) / 2 + arg1);
		this.aClass32_28.method5071(arg0 + super.aClass22_5.anInt5441 - local38, (super.aClass22_5.anInt5435 - local42) / 2 + arg1);
		Static162.aClass100_7.KA(arg0, arg1, arg0 + super.aClass22_5.anInt5441, this.aClass32_26.method5079() + arg1);
		this.aClass32_26.method5092(local30 + arg0, arg1, super.aClass22_5.anInt5441 - local30 - local38, super.aClass22_5.anInt5435);
		@Pc(112) int local112 = this.aClass32_24.method5079();
		Static162.aClass100_7.KA(arg0, arg1 + super.aClass22_5.anInt5435 - local112, super.aClass22_5.anInt5441 + arg0, super.aClass22_5.anInt5435 + arg1);
		this.aClass32_24.method5092(local30 + arg0, -local112 + arg1 - -super.aClass22_5.anInt5435, super.aClass22_5.anInt5441 - local30 - local38, super.aClass22_5.anInt5435);
		Static162.aClass100_7.KA(local8[0], local8[1], local8[2], local8[3]);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method7901() {
		if (!super.method7901()) {
			return false;
		}
		@Pc(13) Class22_Sub1 local13 = (Class22_Sub1) super.aClass22_5;
		if (!super.aClass353_86.method8401(local13.anInt4155)) {
			return false;
		} else if (!super.aClass353_86.method8401(local13.anInt4150)) {
			return false;
		} else if (!super.aClass353_86.method8401(local13.anInt4154)) {
			return false;
		} else if (!super.aClass353_86.method8401(local13.anInt4151)) {
			return false;
		} else if (super.aClass353_86.method8401(local13.anInt4147)) {
			return super.aClass353_86.method8401(local13.anInt4145);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method7042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + this.aClass32_27.method5080();
		@Pc(19) int local19 = super.aClass22_5.anInt5441 + arg0 - this.aClass32_28.method5080();
		@Pc(25) int local25 = arg1 + this.aClass32_26.method5079();
		@Pc(37) int local37 = arg1 + super.aClass22_5.anInt5435 - this.aClass32_24.method5079();
		@Pc(42) int local42 = local19 - local9;
		@Pc(46) int local46 = local37 - local25;
		@Pc(54) int local54 = local42 * this.method7043() / 10000;
		@Pc(57) int[] local57 = new int[4];
		Static162.aClass100_7.K(local57);
		Static162.aClass100_7.KA(local9, local25, local54 + local9, local37);
		this.method6597(local25, local42, local9, local46);
		Static162.aClass100_7.KA(local54 + local9, local25, local19, local37);
		this.aClass32_23.method5092(local9, local25, local42, local46);
		Static162.aClass100_7.KA(local57[0], local57[1], local57[2], local57[3]);
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V")
	@Override
	public final void method7902() {
		super.method7902();
		@Pc(10) Class22_Sub1 local10 = (Class22_Sub1) super.aClass22_5;
		this.aClass32_25 = Static293.method5063(local10.anInt4155, super.aClass353_86);
		this.aClass32_23 = Static293.method5063(local10.anInt4150, super.aClass353_86);
		this.aClass32_27 = Static293.method5063(local10.anInt4154, super.aClass353_86);
		this.aClass32_28 = Static293.method5063(local10.anInt4151, super.aClass353_86);
		this.aClass32_26 = Static293.method5063(local10.anInt4147, super.aClass353_86);
		this.aClass32_24 = Static293.method5063(local10.anInt4145, super.aClass353_86);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIII)V")
	protected void method6597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass32_25.method5092(arg2, arg0, arg1, arg3);
	}
}
