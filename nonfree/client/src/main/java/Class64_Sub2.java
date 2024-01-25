import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public class Class64_Sub2 extends Class64 {

	@OriginalMember(owner = "client!ifa", name = "p", descriptor = "Lclient!kw;")
	private Class178 aClass178_14;

	@OriginalMember(owner = "client!ifa", name = "A", descriptor = "Lclient!kw;")
	private Class178 aClass178_15;

	@OriginalMember(owner = "client!ifa", name = "w", descriptor = "Lclient!kw;")
	protected Class178 aClass178_16;

	@OriginalMember(owner = "client!ifa", name = "t", descriptor = "Lclient!kw;")
	private Class178 aClass178_17;

	@OriginalMember(owner = "client!ifa", name = "C", descriptor = "Lclient!kw;")
	private Class178 aClass178_18;

	@OriginalMember(owner = "client!ifa", name = "B", descriptor = "Lclient!kw;")
	private Class178 aClass178_19;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!ik;Lclient!ik;Lclient!in;)V")
	public Class64_Sub2(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class104_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZII)V")
	@Override
	protected final void method7607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.aClass178_19.method7627() + arg1;
		@Pc(20) int local20 = super.aClass104_5.anInt8371 + arg1 - this.aClass178_15.method7627();
		@Pc(27) int local27 = arg0 + this.aClass178_14.method7632();
		@Pc(38) int local38 = super.aClass104_5.anInt8367 + arg0 - this.aClass178_17.method7632();
		@Pc(42) int local42 = local20 - local9;
		@Pc(47) int local47 = local38 - local27;
		@Pc(55) int local55 = local42 * this.method7605() / 10000;
		@Pc(58) int[] local58 = new int[4];
		Static153.aClass22_4.K(local58);
		Static153.aClass22_4.KA(local9, local27, local9 + local55, local38);
		this.method6405(local27, local9, local42, local47);
		Static153.aClass22_4.KA(local55 + local9, local27, local20, local38);
		this.aClass178_18.method7621(local9, local27, local42, local47);
		Static153.aClass22_4.KA(local58[0], local58[1], local58[2], local58[3]);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V")
	@Override
	public final void method9316() {
		super.method9316();
		@Pc(10) Class104_Sub2 local10 = (Class104_Sub2) super.aClass104_5;
		this.aClass178_16 = Static686.method9056(super.aClass182_112, local10.anInt4409);
		this.aClass178_18 = Static686.method9056(super.aClass182_112, local10.anInt4410);
		this.aClass178_19 = Static686.method9056(super.aClass182_112, local10.anInt4413);
		this.aClass178_15 = Static686.method9056(super.aClass182_112, local10.anInt4411);
		this.aClass178_14 = Static686.method9056(super.aClass182_112, local10.anInt4414);
		this.aClass178_17 = Static686.method9056(super.aClass182_112, local10.anInt4412);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method9318() {
		if (!super.method9318()) {
			return false;
		}
		@Pc(14) Class104_Sub2 local14 = (Class104_Sub2) super.aClass104_5;
		if (!super.aClass182_112.method3964(local14.anInt4409)) {
			return false;
		} else if (!super.aClass182_112.method3964(local14.anInt4410)) {
			return false;
		} else if (!super.aClass182_112.method3964(local14.anInt4413)) {
			return false;
		} else if (!super.aClass182_112.method3964(local14.anInt4411)) {
			return false;
		} else if (super.aClass182_112.method3964(local14.anInt4414)) {
			return super.aClass182_112.method3964(local14.anInt4412);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIBI)V")
	protected void method6405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.aClass178_16.method7621(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZBI)V")
	@Override
	protected final void method7603(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		Static153.aClass22_4.K(local4);
		Static153.aClass22_4.KA(arg0, arg1, arg0 + super.aClass104_5.anInt8371, super.aClass104_5.anInt8367 + arg1);
		@Pc(25) int local25 = this.aClass178_19.method7627();
		@Pc(29) int local29 = this.aClass178_19.method7632();
		@Pc(33) int local33 = this.aClass178_15.method7627();
		@Pc(37) int local37 = this.aClass178_15.method7632();
		this.aClass178_19.method7637(arg0, arg1 + (super.aClass104_5.anInt8367 - local29) / 2);
		this.aClass178_15.method7637(super.aClass104_5.anInt8371 + arg0 - local33, arg1 - -((-local37 + super.aClass104_5.anInt8367) / 2));
		Static153.aClass22_4.KA(arg0, arg1, super.aClass104_5.anInt8371 + arg0, this.aClass178_14.method7632() + arg1);
		this.aClass178_14.method7621(local25 + arg0, arg1, super.aClass104_5.anInt8371 - local33 - local25, super.aClass104_5.anInt8367);
		@Pc(110) int local110 = this.aClass178_17.method7632();
		Static153.aClass22_4.KA(arg0, super.aClass104_5.anInt8367 + arg1 - local110, super.aClass104_5.anInt8371 + arg0, arg1 + super.aClass104_5.anInt8367);
		this.aClass178_17.method7621(local25 + arg0, -local110 + super.aClass104_5.anInt8367 + arg1, super.aClass104_5.anInt8371 - local25 - local33, super.aClass104_5.anInt8367);
		Static153.aClass22_4.KA(local4[0], local4[1], local4[2], local4[3]);
	}
}
