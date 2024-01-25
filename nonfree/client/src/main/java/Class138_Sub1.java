import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public class Class138_Sub1 extends Class138 {

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "Lclient!hh;")
	private Class6 aClass6_26;

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "Lclient!hh;")
	private Class6 aClass6_27;

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "Lclient!hh;")
	private Class6 aClass6_28;

	@OriginalMember(owner = "client!mn", name = "v", descriptor = "Lclient!hh;")
	private Class6 aClass6_29;

	@OriginalMember(owner = "client!mn", name = "z", descriptor = "Lclient!hh;")
	private Class6 aClass6_30;

	@OriginalMember(owner = "client!mn", name = "B", descriptor = "Lclient!hh;")
	protected Class6 aClass6_31;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!uq;Lclient!uq;Lclient!bd;)V")
	public Class138_Sub1(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) Class21_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method8281() {
		if (!super.method8281()) {
			return false;
		}
		@Pc(13) Class21_Sub1 local13 = (Class21_Sub1) super.aClass21_5;
		if (!super.aClass362_128.method8365(local13.anInt677)) {
			return false;
		} else if (!super.aClass362_128.method8365(local13.anInt675)) {
			return false;
		} else if (!super.aClass362_128.method8365(local13.anInt678)) {
			return false;
		} else if (!super.aClass362_128.method8365(local13.anInt670)) {
			return false;
		} else if (super.aClass362_128.method8365(local13.anInt671)) {
			return super.aClass362_128.method8365(local13.anInt674);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZIII)V")
	@Override
	protected final void method7395(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) int local9 = this.aClass6_26.method5130() + arg0;
		@Pc(20) int local20 = arg0 + super.aClass21_5.anInt9572 - this.aClass6_29.method5130();
		@Pc(27) int local27 = arg1 + this.aClass6_27.method5134();
		@Pc(38) int local38 = super.aClass21_5.anInt9574 + arg1 - this.aClass6_28.method5134();
		@Pc(43) int local43 = local20 - local9;
		@Pc(47) int local47 = local38 - local27;
		@Pc(55) int local55 = local43 * this.method7400() / 10000;
		@Pc(58) int[] local58 = new int[4];
		Static119.aClass95_4.K(local58);
		Static119.aClass95_4.KA(local9, local27, local55 + local9, local38);
		this.method6546(local47, local9, local43, local27);
		Static119.aClass95_4.KA(local9 + local55, local27, local20, local38);
		this.aClass6_30.method5139(local9, local27, local43, local47);
		Static119.aClass95_4.KA(local58[0], local58[1], local58[2], local58[3]);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIBII)V")
	protected void method6546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass6_31.method5139(arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
	@Override
	public final void method8280() {
		super.method8280();
		@Pc(10) Class21_Sub1 local10 = (Class21_Sub1) super.aClass21_5;
		this.aClass6_31 = Static392.method5476(super.aClass362_128, local10.anInt677);
		this.aClass6_30 = Static392.method5476(super.aClass362_128, local10.anInt675);
		this.aClass6_26 = Static392.method5476(super.aClass362_128, local10.anInt678);
		this.aClass6_29 = Static392.method5476(super.aClass362_128, local10.anInt670);
		this.aClass6_27 = Static392.method5476(super.aClass362_128, local10.anInt671);
		this.aClass6_28 = Static392.method5476(super.aClass362_128, local10.anInt674);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIZI)V")
	@Override
	protected final void method7396(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(14) int[] local14 = new int[4];
		Static119.aClass95_4.K(local14);
		Static119.aClass95_4.KA(arg0, arg1, super.aClass21_5.anInt9572 + arg0, super.aClass21_5.anInt9574 + arg1);
		@Pc(35) int local35 = this.aClass6_26.method5130();
		@Pc(39) int local39 = this.aClass6_26.method5134();
		@Pc(43) int local43 = this.aClass6_29.method5130();
		@Pc(47) int local47 = this.aClass6_29.method5134();
		this.aClass6_26.method5115(arg0, arg1 + (super.aClass21_5.anInt9574 - local39) / 2);
		this.aClass6_29.method5115(super.aClass21_5.anInt9572 + arg0 - local43, arg1 - -((super.aClass21_5.anInt9574 + -local47) / 2));
		Static119.aClass95_4.KA(arg0, arg1, arg0 + super.aClass21_5.anInt9572, arg1 - -this.aClass6_27.method5134());
		this.aClass6_27.method5139(arg0 + local35, arg1, super.aClass21_5.anInt9572 - local35 - local43, super.aClass21_5.anInt9574);
		@Pc(122) int local122 = this.aClass6_28.method5134();
		Static119.aClass95_4.KA(arg0, arg1 + super.aClass21_5.anInt9574 - local122, arg0 + super.aClass21_5.anInt9572, super.aClass21_5.anInt9574 + arg1);
		this.aClass6_28.method5139(arg0 + local35, super.aClass21_5.anInt9574 + arg1 + -local122, super.aClass21_5.anInt9572 - local35 - local43, super.aClass21_5.anInt9574);
		Static119.aClass95_4.KA(local14[0], local14[1], local14[2], local14[3]);
	}
}
