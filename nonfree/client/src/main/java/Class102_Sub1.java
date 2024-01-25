import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Lclient!f;")
	private Class88 aClass88_21;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "Lclient!f;")
	protected Class88 aClass88_22;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "Lclient!f;")
	private Class88 aClass88_23;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "Lclient!f;")
	private Class88 aClass88_24;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "Lclient!f;")
	private Class88 aClass88_25;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "Lclient!f;")
	private Class88 aClass88_26;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!vo;Lclient!vo;Lclient!vu;)V")
	public Class102_Sub1(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class50_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZI)V")
	@Override
	protected final void method8154(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(12) int[] local12 = new int[4];
		Static39.aClass7_2.oa(local12);
		Static39.aClass7_2.da(arg1, arg0, arg1 + super.aClass50_5.anInt7637, super.aClass50_5.anInt7630 + arg0);
		@Pc(33) int local33 = this.aClass88_21.A();
		@Pc(37) int local37 = this.aClass88_21.ca();
		@Pc(41) int local41 = this.aClass88_26.A();
		@Pc(45) int local45 = this.aClass88_26.ca();
		this.aClass88_21.method8051(arg1, (super.aClass50_5.anInt7630 - local37) / 2 + arg0);
		this.aClass88_26.method8051(super.aClass50_5.anInt7637 + arg1 - local41, arg0 + (-local45 + super.aClass50_5.anInt7630) / 2);
		Static39.aClass7_2.da(arg1, arg0, arg1 + super.aClass50_5.anInt7637, this.aClass88_23.ca() + arg0);
		this.aClass88_23.method8043(arg1 + local33, arg0, super.aClass50_5.anInt7637 - local41 - local33, super.aClass50_5.anInt7630);
		@Pc(116) int local116 = this.aClass88_24.ca();
		Static39.aClass7_2.da(arg1, super.aClass50_5.anInt7630 + arg0 - local116, arg1 - -super.aClass50_5.anInt7637, super.aClass50_5.anInt7630 + arg0);
		this.aClass88_24.method8043(arg1 + local33, -local116 + arg0 - -super.aClass50_5.anInt7630, super.aClass50_5.anInt7637 - local33 - local41, super.aClass50_5.anInt7630);
		Static39.aClass7_2.da(local12[0], local12[1], local12[2], local12[3]);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Z")
	@Override
	public final boolean method8149() {
		if (!super.method8149()) {
			return false;
		}
		@Pc(13) Class50_Sub3 local13 = (Class50_Sub3) super.aClass50_5;
		if (!super.aClass348_134.method7960(local13.anInt7641)) {
			return false;
		} else if (!super.aClass348_134.method7960(local13.anInt7642)) {
			return false;
		} else if (!super.aClass348_134.method7960(local13.anInt7639)) {
			return false;
		} else if (!super.aClass348_134.method7960(local13.anInt7650)) {
			return false;
		} else if (super.aClass348_134.method7960(local13.anInt7645)) {
			return super.aClass348_134.method7960(local13.anInt7647);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
	protected void method5810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass88_22.method8043(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	@Override
	public final void method8148() {
		super.method8148();
		@Pc(10) Class50_Sub3 local10 = (Class50_Sub3) super.aClass50_5;
		this.aClass88_22 = Static402.method6120(local10.anInt7641, super.aClass348_134);
		this.aClass88_25 = Static402.method6120(local10.anInt7642, super.aClass348_134);
		this.aClass88_21 = Static402.method6120(local10.anInt7639, super.aClass348_134);
		this.aClass88_26 = Static402.method6120(local10.anInt7650, super.aClass348_134);
		this.aClass88_23 = Static402.method6120(local10.anInt7645, super.aClass348_134);
		this.aClass88_24 = Static402.method6120(local10.anInt7647, super.aClass348_134);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method8153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = this.aClass88_21.A() + arg0;
		@Pc(20) int local20 = arg0 + super.aClass50_5.anInt7637 - this.aClass88_26.A();
		@Pc(26) int local26 = this.aClass88_23.ca() + arg1;
		@Pc(37) int local37 = super.aClass50_5.anInt7630 + arg1 - this.aClass88_24.ca();
		@Pc(42) int local42 = local20 - local9;
		@Pc(47) int local47 = local37 - local26;
		@Pc(55) int local55 = local42 * this.method8156() / 10000;
		@Pc(58) int[] local58 = new int[4];
		Static39.aClass7_2.oa(local58);
		Static39.aClass7_2.da(local9, local26, local9 + local55, local37);
		this.method5810(local9, local26, local42, local47);
		Static39.aClass7_2.da(local55 + local9, local26, local20, local37);
		this.aClass88_25.method8043(local9, local26, local42, local47);
		Static39.aClass7_2.da(local58[0], local58[1], local58[2], local58[3]);
	}
}
