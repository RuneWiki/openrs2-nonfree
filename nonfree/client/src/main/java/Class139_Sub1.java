import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public class Class139_Sub1 extends Class139 {

	@OriginalMember(owner = "client!go", name = "o", descriptor = "Lclient!fia;")
	private Class45 aClass45_25;

	@OriginalMember(owner = "client!go", name = "v", descriptor = "Lclient!fia;")
	protected Class45 aClass45_26;

	@OriginalMember(owner = "client!go", name = "A", descriptor = "Lclient!fia;")
	private Class45 aClass45_27;

	@OriginalMember(owner = "client!go", name = "u", descriptor = "Lclient!fia;")
	private Class45 aClass45_28;

	@OriginalMember(owner = "client!go", name = "w", descriptor = "Lclient!fia;")
	private Class45 aClass45_29;

	@OriginalMember(owner = "client!go", name = "B", descriptor = "Lclient!fia;")
	private Class45 aClass45_30;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!rg;Lclient!rg;Lclient!kd;)V")
	public Class139_Sub1(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class132_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method8820() {
		if (!super.method8820()) {
			return false;
		}
		@Pc(14) Class132_Sub1 local14 = (Class132_Sub1) super.aClass132_5;
		if (!super.aClass310_123.method7785(local14.anInt6140)) {
			return false;
		} else if (!super.aClass310_123.method7785(local14.anInt6131)) {
			return false;
		} else if (!super.aClass310_123.method7785(local14.anInt6139)) {
			return false;
		} else if (!super.aClass310_123.method7785(local14.anInt6138)) {
			return false;
		} else if (super.aClass310_123.method7785(local14.anInt6136)) {
			return super.aClass310_123.method7785(local14.anInt6133);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(IIIII)V")
	protected void method8476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass45_26.method7500(arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZIIZ)V")
	@Override
	protected final void method8823(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		Static103.aClass144_3.K(local8);
		Static103.aClass144_3.KA(arg1, arg0, arg1 + super.aClass132_5.anInt9737, arg0 - -super.aClass132_5.anInt9742);
		@Pc(31) int local31 = this.aClass45_27.method7508();
		@Pc(35) int local35 = this.aClass45_27.method7504();
		@Pc(39) int local39 = this.aClass45_25.method7508();
		@Pc(43) int local43 = this.aClass45_25.method7504();
		this.aClass45_27.method7488(arg1, (super.aClass132_5.anInt9742 - local35) / 2 + arg0);
		this.aClass45_25.method7488(arg1 + super.aClass132_5.anInt9737 - local39, (super.aClass132_5.anInt9742 + -local43) / 2 + arg0);
		Static103.aClass144_3.KA(arg1, arg0, super.aClass132_5.anInt9737 + arg1, this.aClass45_29.method7504() + arg0);
		this.aClass45_29.method7500(local31 + arg1, arg0, super.aClass132_5.anInt9737 - local31 - local39, super.aClass132_5.anInt9742);
		@Pc(115) int local115 = this.aClass45_30.method7504();
		Static103.aClass144_3.KA(arg1, super.aClass132_5.anInt9742 + arg0 - local115, super.aClass132_5.anInt9737 + arg1, arg0 + super.aClass132_5.anInt9742);
		this.aClass45_30.method7500(arg1 + local31, arg0 + (super.aClass132_5.anInt9742 - local115), super.aClass132_5.anInt9737 - local39 - local31, super.aClass132_5.anInt9742);
		Static103.aClass144_3.KA(local8[0], local8[1], local8[2], local8[3]);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIZI)V")
	@Override
	protected final void method8824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0 + this.aClass45_27.method7508();
		@Pc(21) int local21 = arg0 + super.aClass132_5.anInt9737 - this.aClass45_25.method7508();
		@Pc(27) int local27 = this.aClass45_29.method7504() + arg1;
		@Pc(38) int local38 = arg1 + super.aClass132_5.anInt9742 - this.aClass45_30.method7504();
		@Pc(42) int local42 = local21 - local9;
		@Pc(46) int local46 = local38 - local27;
		@Pc(62) int local62 = local42 * this.method8826() / 10000;
		@Pc(65) int[] local65 = new int[4];
		Static103.aClass144_3.K(local65);
		Static103.aClass144_3.KA(local9, local27, local62 + local9, local38);
		this.method8476(local46, local27, local42, local9);
		Static103.aClass144_3.KA(local62 + local9, local27, local21, local38);
		this.aClass45_28.method7500(local9, local27, local42, local46);
		Static103.aClass144_3.KA(local65[0], local65[1], local65[2], local65[3]);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
	@Override
	public final void method8821() {
		super.method8821();
		@Pc(15) Class132_Sub1 local15 = (Class132_Sub1) super.aClass132_5;
		this.aClass45_26 = Static411.method6195(super.aClass310_123, local15.anInt6140);
		this.aClass45_28 = Static411.method6195(super.aClass310_123, local15.anInt6131);
		this.aClass45_27 = Static411.method6195(super.aClass310_123, local15.anInt6139);
		this.aClass45_25 = Static411.method6195(super.aClass310_123, local15.anInt6138);
		this.aClass45_29 = Static411.method6195(super.aClass310_123, local15.anInt6136);
		this.aClass45_30 = Static411.method6195(super.aClass310_123, local15.anInt6133);
	}
}
