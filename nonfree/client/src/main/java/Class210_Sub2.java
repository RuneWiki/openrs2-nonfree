import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public class Class210_Sub2 extends Class210 {

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "Lclient!f;")
	private Class39 aClass39_19;

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "Lclient!f;")
	protected Class39 aClass39_20;

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "Lclient!f;")
	private Class39 aClass39_21;

	@OriginalMember(owner = "client!vs", name = "B", descriptor = "Lclient!f;")
	private Class39 aClass39_22;

	@OriginalMember(owner = "client!vs", name = "C", descriptor = "Lclient!f;")
	private Class39 aClass39_23;

	@OriginalMember(owner = "client!vs", name = "F", descriptor = "Lclient!f;")
	private Class39 aClass39_24;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!pl;Lclient!pl;Lclient!tm;)V")
	public Class210_Sub2(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class9_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IBIII)V")
	protected void method5244(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass39_20.method7860(arg1, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	@Override
	public final void method7014() {
		super.method7014();
		@Pc(10) Class9_Sub1 local10 = (Class9_Sub1) super.aClass9_5;
		this.aClass39_20 = Static152.method2474(super.aClass259_156, local10.anInt407);
		this.aClass39_24 = Static152.method2474(super.aClass259_156, local10.anInt409);
		this.aClass39_22 = Static152.method2474(super.aClass259_156, local10.anInt403);
		this.aClass39_23 = Static152.method2474(super.aClass259_156, local10.anInt400);
		this.aClass39_21 = Static152.method2474(super.aClass259_156, local10.anInt404);
		this.aClass39_19 = Static152.method2474(super.aClass259_156, local10.anInt411);
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(IIZI)V")
	@Override
	protected final void method7020(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) int local9 = this.aClass39_22.A() + arg1;
		@Pc(20) int local20 = super.aClass9_5.anInt5034 + arg1 - this.aClass39_23.A();
		@Pc(26) int local26 = this.aClass39_21.ca() + arg0;
		@Pc(37) int local37 = arg0 + super.aClass9_5.anInt5030 - this.aClass39_19.ca();
		@Pc(42) int local42 = local20 - local9;
		@Pc(46) int local46 = local37 - local26;
		@Pc(54) int local54 = this.method7022() * local42 / 10000;
		@Pc(57) int[] local57 = new int[4];
		Static307.aClass100_6.oa(local57);
		Static307.aClass100_6.da(local9, local26, local9 + local54, local37);
		this.method5244(local46, local9, local26, local42);
		Static307.aClass100_6.da(local54 + local9, local26, local20, local37);
		this.aClass39_24.method7860(local9, local26, local42, local46);
		Static307.aClass100_6.da(local57[0], local57[1], local57[2], local57[3]);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method7015() {
		if (!super.method7015()) {
			return false;
		}
		@Pc(13) Class9_Sub1 local13 = (Class9_Sub1) super.aClass9_5;
		if (!super.aClass259_156.method5988(local13.anInt407)) {
			return false;
		} else if (!super.aClass259_156.method5988(local13.anInt409)) {
			return false;
		} else if (!super.aClass259_156.method5988(local13.anInt403)) {
			return false;
		} else if (!super.aClass259_156.method5988(local13.anInt400)) {
			return false;
		} else if (super.aClass259_156.method5988(local13.anInt404)) {
			return super.aClass259_156.method5988(local13.anInt411);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIZI)V")
	@Override
	protected final void method7019(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		Static307.aClass100_6.oa(local4);
		Static307.aClass100_6.da(arg0, arg1, super.aClass9_5.anInt5034 + arg0, super.aClass9_5.anInt5030 + arg1);
		@Pc(25) int local25 = this.aClass39_22.A();
		@Pc(29) int local29 = this.aClass39_22.ca();
		@Pc(33) int local33 = this.aClass39_23.A();
		@Pc(37) int local37 = this.aClass39_23.ca();
		this.aClass39_22.method7851(arg0, (super.aClass9_5.anInt5030 - local29) / 2 + arg1);
		this.aClass39_23.method7851(arg0 + super.aClass9_5.anInt5034 - local33, arg1 + (-local37 + super.aClass9_5.anInt5030) / 2);
		Static307.aClass100_6.da(arg0, arg1, arg0 + super.aClass9_5.anInt5034, this.aClass39_21.ca() + arg1);
		this.aClass39_21.method7860(arg0 + local25, arg1, super.aClass9_5.anInt5034 - local25 - local33, super.aClass9_5.anInt5030);
		@Pc(110) int local110 = this.aClass39_19.ca();
		Static307.aClass100_6.da(arg0, super.aClass9_5.anInt5030 + arg1 - local110, arg0 - -super.aClass9_5.anInt5034, super.aClass9_5.anInt5030 + arg1);
		this.aClass39_19.method7860(local25 + arg0, -local110 + arg1 + super.aClass9_5.anInt5030, super.aClass9_5.anInt5034 - local25 - local33, super.aClass9_5.anInt5030);
		Static307.aClass100_6.da(local4[0], local4[1], local4[2], local4[3]);
	}
}
