import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "Lclient!f;")
	private Class78 aClass78_22;

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "Lclient!f;")
	private Class78 aClass78_23;

	@OriginalMember(owner = "client!ms", name = "v", descriptor = "Lclient!f;")
	private Class78 aClass78_24;

	@OriginalMember(owner = "client!ms", name = "w", descriptor = "Lclient!f;")
	private Class78 aClass78_25;

	@OriginalMember(owner = "client!ms", name = "A", descriptor = "Lclient!f;")
	private Class78 aClass78_26;

	@OriginalMember(owner = "client!ms", name = "C", descriptor = "Lclient!f;")
	protected Class78 aClass78_27;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!jn;Lclient!jn;Lclient!lea;)V")
	public Class45_Sub2(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class108_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZII)V")
	@Override
	protected final void method5952(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) int local9 = this.aClass78_23.A() + arg0;
		@Pc(21) int local21 = arg0 + super.aClass108_5.anInt10015 - this.aClass78_25.A();
		@Pc(27) int local27 = this.aClass78_22.ca() + arg1;
		@Pc(38) int local38 = arg1 + super.aClass108_5.anInt10007 - this.aClass78_26.ca();
		@Pc(42) int local42 = local21 - local9;
		@Pc(47) int local47 = local38 - local27;
		@Pc(55) int local55 = local42 * this.method5954() / 10000;
		@Pc(58) int[] local58 = new int[4];
		Static440.aClass44_12.oa(local58);
		Static440.aClass44_12.da(local9, local27, local55 + local9, local38);
		this.method5934(local42, local47, local9, local27);
		Static440.aClass44_12.da(local55 + local9, local27, local21, local38);
		this.aClass78_24.method8184(local9, local27, local42, local47);
		Static440.aClass44_12.da(local58[0], local58[1], local58[2], local58[3]);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIII)V")
	protected void method5934(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass78_27.method8184(arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)Z")
	@Override
	public final boolean method7417() {
		if (!super.method7417()) {
			return false;
		}
		@Pc(13) Class108_Sub1 local13 = (Class108_Sub1) super.aClass108_5;
		if (!super.aClass176_100.method3996(local13.anInt10021)) {
			return false;
		} else if (!super.aClass176_100.method3996(local13.anInt10022)) {
			return false;
		} else if (!super.aClass176_100.method3996(local13.anInt10020)) {
			return false;
		} else if (!super.aClass176_100.method3996(local13.anInt10025)) {
			return false;
		} else if (super.aClass176_100.method3996(local13.anInt10027)) {
			return super.aClass176_100.method3996(local13.anInt10018);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	@Override
	public final void method7416() {
		super.method7416();
		@Pc(10) Class108_Sub1 local10 = (Class108_Sub1) super.aClass108_5;
		this.aClass78_27 = Static335.method5482(super.aClass176_100, local10.anInt10021);
		this.aClass78_24 = Static335.method5482(super.aClass176_100, local10.anInt10022);
		this.aClass78_23 = Static335.method5482(super.aClass176_100, local10.anInt10020);
		this.aClass78_25 = Static335.method5482(super.aClass176_100, local10.anInt10025);
		this.aClass78_22 = Static335.method5482(super.aClass176_100, local10.anInt10027);
		this.aClass78_26 = Static335.method5482(super.aClass176_100, local10.anInt10018);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIZZ)V")
	@Override
	protected final void method5953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		Static440.aClass44_12.oa(local8);
		Static440.aClass44_12.da(arg0, arg1, super.aClass108_5.anInt10015 + arg0, arg1 + super.aClass108_5.anInt10007);
		@Pc(29) int local29 = this.aClass78_23.A();
		@Pc(33) int local33 = this.aClass78_23.ca();
		@Pc(37) int local37 = this.aClass78_25.A();
		@Pc(41) int local41 = this.aClass78_25.ca();
		this.aClass78_23.method8185(arg0, arg1 + (super.aClass108_5.anInt10007 - local33) / 2);
		this.aClass78_25.method8185(arg0 + super.aClass108_5.anInt10015 - local37, arg1 + (-local41 + super.aClass108_5.anInt10007) / 2);
		Static440.aClass44_12.da(arg0, arg1, super.aClass108_5.anInt10015 + arg0, this.aClass78_22.ca() + arg1);
		this.aClass78_22.method8184(arg0 + local29, arg1, super.aClass108_5.anInt10015 - local37 - local29, super.aClass108_5.anInt10007);
		@Pc(114) int local114 = this.aClass78_26.ca();
		Static440.aClass44_12.da(arg0, arg1 + super.aClass108_5.anInt10007 - local114, arg0 + super.aClass108_5.anInt10015, arg1 + super.aClass108_5.anInt10007);
		this.aClass78_26.method8184(local29 + arg0, -local114 + arg1 + super.aClass108_5.anInt10007, super.aClass108_5.anInt10015 - local37 - local29, super.aClass108_5.anInt10007);
		Static440.aClass44_12.da(local8[0], local8[1], local8[2], local8[3]);
	}
}
