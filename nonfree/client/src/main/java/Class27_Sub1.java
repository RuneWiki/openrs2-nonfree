import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!au", name = "p", descriptor = "Lclient!ho;")
	private Class9 aClass9_31;

	@OriginalMember(owner = "client!au", name = "s", descriptor = "Lclient!ho;")
	private Class9 aClass9_32;

	@OriginalMember(owner = "client!au", name = "u", descriptor = "Lclient!ho;")
	private Class9 aClass9_33;

	@OriginalMember(owner = "client!au", name = "y", descriptor = "Lclient!ho;")
	protected Class9 aClass9_34;

	@OriginalMember(owner = "client!au", name = "z", descriptor = "Lclient!ho;")
	private Class9 aClass9_35;

	@OriginalMember(owner = "client!au", name = "E", descriptor = "Lclient!ho;")
	private Class9 aClass9_36;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!ae;Lclient!ae;Lclient!ht;)V")
	public Class27_Sub1(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class63_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
	@Override
	public final void method8705() {
		super.method8705();
		@Pc(10) Class63_Sub1 local10 = (Class63_Sub1) super.aClass63_5;
		this.aClass9_34 = Static215.method3139(local10.anInt1778, super.aClass8_110);
		this.aClass9_31 = Static215.method3139(local10.anInt1777, super.aClass8_110);
		this.aClass9_36 = Static215.method3139(local10.anInt1779, super.aClass8_110);
		this.aClass9_33 = Static215.method3139(local10.anInt1783, super.aClass8_110);
		this.aClass9_32 = Static215.method3139(local10.anInt1780, super.aClass8_110);
		this.aClass9_35 = Static215.method3139(local10.anInt1776, super.aClass8_110);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIII)V")
	protected void method6636(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass9_34.method8928(arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method6629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int[] local12 = new int[4];
		Static546.aClass132_13.K(local12);
		Static546.aClass132_13.KA(arg0, arg1, arg0 + super.aClass63_5.anInt8537, arg1 + super.aClass63_5.anInt8536);
		@Pc(33) int local33 = this.aClass9_36.method8937();
		@Pc(37) int local37 = this.aClass9_36.method8930();
		@Pc(41) int local41 = this.aClass9_33.method8937();
		@Pc(45) int local45 = this.aClass9_33.method8930();
		this.aClass9_36.method8920(arg0, arg1 + (super.aClass63_5.anInt8536 - local37) / 2);
		this.aClass9_33.method8920(arg0 + super.aClass63_5.anInt8537 - local41, (-local45 + super.aClass63_5.anInt8536) / 2 + arg1);
		Static546.aClass132_13.KA(arg0, arg1, arg0 + super.aClass63_5.anInt8537, this.aClass9_32.method8930() + arg1);
		this.aClass9_32.method8928(arg0 + local33, arg1, super.aClass63_5.anInt8537 - local33 - local41, super.aClass63_5.anInt8536);
		@Pc(115) int local115 = this.aClass9_35.method8930();
		Static546.aClass132_13.KA(arg0, arg1 + super.aClass63_5.anInt8536 - local115, super.aClass63_5.anInt8537 + arg0, arg1 + super.aClass63_5.anInt8536);
		this.aClass9_35.method8928(arg0 + local33, super.aClass63_5.anInt8536 + (arg1 - local115), super.aClass63_5.anInt8537 - local41 - local33, super.aClass63_5.anInt8536);
		Static546.aClass132_13.KA(local12[0], local12[1], local12[2], local12[3]);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IZII)V")
	@Override
	protected final void method6633(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.aClass9_36.method8937() + arg0;
		@Pc(21) int local21 = arg0 + super.aClass63_5.anInt8537 - this.aClass9_33.method8937();
		@Pc(28) int local28 = arg1 + this.aClass9_32.method8930();
		@Pc(46) int local46 = super.aClass63_5.anInt8536 + arg1 - this.aClass9_35.method8930();
		@Pc(50) int local50 = local21 - local9;
		@Pc(55) int local55 = local46 - local28;
		@Pc(63) int local63 = local50 * this.method6631() / 10000;
		@Pc(66) int[] local66 = new int[4];
		Static546.aClass132_13.K(local66);
		Static546.aClass132_13.KA(local9, local28, local63 + local9, local46);
		this.method6636(local50, local9, local55, local28);
		Static546.aClass132_13.KA(local63 + local9, local28, local21, local46);
		this.aClass9_31.method8928(local9, local28, local50, local55);
		Static546.aClass132_13.KA(local66[0], local66[1], local66[2], local66[3]);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8704() {
		if (!super.method8704()) {
			return false;
		}
		@Pc(13) Class63_Sub1 local13 = (Class63_Sub1) super.aClass63_5;
		if (!super.aClass8_110.method273(local13.anInt1778)) {
			return false;
		} else if (!super.aClass8_110.method273(local13.anInt1777)) {
			return false;
		} else if (!super.aClass8_110.method273(local13.anInt1779)) {
			return false;
		} else if (!super.aClass8_110.method273(local13.anInt1783)) {
			return false;
		} else if (super.aClass8_110.method273(local13.anInt1780)) {
			return super.aClass8_110.method273(local13.anInt1776);
		} else {
			return false;
		}
	}
}
