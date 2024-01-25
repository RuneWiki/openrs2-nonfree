import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "Lclient!td;")
	private Class24 aClass24_16;

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "Lclient!td;")
	private Class24 aClass24_17;

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "Lclient!td;")
	private Class24 aClass24_18;

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "Lclient!td;")
	protected Class24 aClass24_19;

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "Lclient!td;")
	private Class24 aClass24_20;

	@OriginalMember(owner = "client!gk", name = "A", descriptor = "Lclient!td;")
	private Class24 aClass24_21;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!naa;)V")
	public Class10_Sub1(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class6_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZIII)V")
	@Override
	protected final void method8404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int[] local14 = new int[4];
		Static323.aClass5_9.K(local14);
		Static323.aClass5_9.KA(arg0, arg1, arg0 + super.aClass6_5.anInt2440, arg1 + super.aClass6_5.anInt2436);
		@Pc(36) int local36 = this.aClass24_16.method8576();
		@Pc(40) int local40 = this.aClass24_16.method8573();
		@Pc(44) int local44 = this.aClass24_20.method8576();
		@Pc(48) int local48 = this.aClass24_20.method8573();
		this.aClass24_16.method8559(arg0, (super.aClass6_5.anInt2436 - local40) / 2 + arg1);
		this.aClass24_20.method8559(super.aClass6_5.anInt2440 + arg0 - local44, arg1 + (-local48 + super.aClass6_5.anInt2436) / 2);
		Static323.aClass5_9.KA(arg0, arg1, super.aClass6_5.anInt2440 + arg0, arg1 - -this.aClass24_18.method8573());
		this.aClass24_18.method8571(arg0 + local36, arg1, super.aClass6_5.anInt2440 - local44 - local36, super.aClass6_5.anInt2436);
		@Pc(119) int local119 = this.aClass24_21.method8573();
		Static323.aClass5_9.KA(arg0, arg1 + super.aClass6_5.anInt2436 - local119, arg0 - -super.aClass6_5.anInt2440, arg1 + super.aClass6_5.anInt2436);
		this.aClass24_21.method8571(arg0 + local36, -local119 + super.aClass6_5.anInt2436 + arg1, super.aClass6_5.anInt2440 - local44 - local36, super.aClass6_5.anInt2436);
		Static323.aClass5_9.KA(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V")
	protected void method4674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass24_19.method8571(arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	@Override
	public final void method8396() {
		super.method8396();
		@Pc(14) Class6_Sub2 local14 = (Class6_Sub2) super.aClass6_5;
		this.aClass24_19 = Static128.method2506(super.aClass196_127, local14.anInt1640);
		this.aClass24_17 = Static128.method2506(super.aClass196_127, local14.anInt1636);
		this.aClass24_16 = Static128.method2506(super.aClass196_127, local14.anInt1638);
		this.aClass24_20 = Static128.method2506(super.aClass196_127, local14.anInt1642);
		this.aClass24_18 = Static128.method2506(super.aClass196_127, local14.anInt1644);
		this.aClass24_21 = Static128.method2506(super.aClass196_127, local14.anInt1641);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method8398() {
		if (!super.method8398()) {
			return false;
		}
		@Pc(13) Class6_Sub2 local13 = (Class6_Sub2) super.aClass6_5;
		if (!super.aClass196_127.method5111(local13.anInt1640)) {
			return false;
		} else if (!super.aClass196_127.method5111(local13.anInt1636)) {
			return false;
		} else if (!super.aClass196_127.method5111(local13.anInt1638)) {
			return false;
		} else if (!super.aClass196_127.method5111(local13.anInt1642)) {
			return false;
		} else if (super.aClass196_127.method5111(local13.anInt1644)) {
			return super.aClass196_127.method5111(local13.anInt1641);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBIZ)V")
	@Override
	protected final void method8401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + this.aClass24_16.method8576();
		@Pc(19) int local19 = arg1 + super.aClass6_5.anInt2440 - this.aClass24_20.method8576();
		@Pc(25) int local25 = arg0 + this.aClass24_18.method8573();
		@Pc(35) int local35 = arg0 + super.aClass6_5.anInt2436 - this.aClass24_21.method8573();
		@Pc(40) int local40 = local19 - local9;
		@Pc(44) int local44 = local35 - local25;
		@Pc(56) int local56 = local40 * this.method8402() / 10000;
		@Pc(59) int[] local59 = new int[4];
		Static323.aClass5_9.K(local59);
		Static323.aClass5_9.KA(local9, local25, local56 + local9, local35);
		this.method4674(local40, local9, local25, local44);
		Static323.aClass5_9.KA(local56 + local9, local25, local19, local35);
		this.aClass24_17.method8571(local9, local25, local40, local44);
		Static323.aClass5_9.KA(local59[0], local59[1], local59[2], local59[3]);
	}
}
