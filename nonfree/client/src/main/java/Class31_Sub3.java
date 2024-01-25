import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public class Class31_Sub3 extends Class31 {

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "Lclient!hu;")
	private Class44 aClass44_31;

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "Lclient!hu;")
	private Class44 aClass44_32;

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "Lclient!hu;")
	private Class44 aClass44_33;

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "Lclient!hu;")
	private Class44 aClass44_34;

	@OriginalMember(owner = "client!sn", name = "x", descriptor = "Lclient!hu;")
	protected Class44 aClass44_35;

	@OriginalMember(owner = "client!sn", name = "z", descriptor = "Lclient!hu;")
	private Class44 aClass44_36;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;Lclient!eja;)V")
	public Class31_Sub3(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class96_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method8460(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + this.aClass44_36.method5313();
		@Pc(19) int local19 = arg0 + super.aClass96_5.anInt9360 - this.aClass44_32.method5313();
		@Pc(25) int local25 = this.aClass44_31.method5325() + arg1;
		@Pc(36) int local36 = arg1 + super.aClass96_5.anInt9362 - this.aClass44_34.method5325();
		@Pc(40) int local40 = local19 - local9;
		@Pc(45) int local45 = local36 - local25;
		@Pc(53) int local53 = local40 * this.method8462() / 10000;
		@Pc(56) int[] local56 = new int[4];
		Static485.aClass126_17.K(local56);
		Static485.aClass126_17.KA(local9, local25, local53 + local9, local36);
		this.method8466(local25, local45, local40, local9);
		Static485.aClass126_17.KA(local9 + local53, local25, local19, local36);
		this.aClass44_33.method5326(local9, local25, local40, local45);
		Static485.aClass126_17.KA(local56[0], local56[1], local56[2], local56[3]);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method8776() {
		if (!super.method8776()) {
			return false;
		}
		@Pc(13) Class96_Sub1 local13 = (Class96_Sub1) super.aClass96_5;
		if (!super.aClass384_133.method8883(local13.anInt6341)) {
			return false;
		} else if (!super.aClass384_133.method8883(local13.anInt6343)) {
			return false;
		} else if (!super.aClass384_133.method8883(local13.anInt6337)) {
			return false;
		} else if (!super.aClass384_133.method8883(local13.anInt6344)) {
			return false;
		} else if (super.aClass384_133.method8883(local13.anInt6335)) {
			return super.aClass384_133.method8883(local13.anInt6334);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)V")
	protected void method8466(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass44_35.method5326(arg3, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIZI)V")
	@Override
	protected final void method8463(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		Static485.aClass126_17.K(local4);
		Static485.aClass126_17.KA(arg1, arg0, arg1 + super.aClass96_5.anInt9360, super.aClass96_5.anInt9362 + arg0);
		@Pc(25) int local25 = this.aClass44_36.method5313();
		@Pc(29) int local29 = this.aClass44_36.method5325();
		@Pc(33) int local33 = this.aClass44_32.method5313();
		@Pc(37) int local37 = this.aClass44_32.method5325();
		this.aClass44_36.method5312(arg1, arg0 + (super.aClass96_5.anInt9362 - local29) / 2);
		this.aClass44_32.method5312(super.aClass96_5.anInt9360 + arg1 - local33, arg0 - -((-local37 + super.aClass96_5.anInt9362) / 2));
		Static485.aClass126_17.KA(arg1, arg0, arg1 + super.aClass96_5.anInt9360, arg0 + this.aClass44_31.method5325());
		this.aClass44_31.method5326(local25 + arg1, arg0, super.aClass96_5.anInt9360 - local33 - local25, super.aClass96_5.anInt9362);
		@Pc(110) int local110 = this.aClass44_34.method5325();
		Static485.aClass126_17.KA(arg1, arg0 + super.aClass96_5.anInt9362 - local110, arg1 + super.aClass96_5.anInt9360, super.aClass96_5.anInt9362 + arg0);
		this.aClass44_34.method5326(local25 + arg1, -local110 + super.aClass96_5.anInt9362 + arg0, super.aClass96_5.anInt9360 - local25 - local33, super.aClass96_5.anInt9362);
		Static485.aClass126_17.KA(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	@Override
	public final void method8777() {
		super.method8777();
		@Pc(16) Class96_Sub1 local16 = (Class96_Sub1) super.aClass96_5;
		this.aClass44_35 = Static68.method1134(local16.anInt6341, super.aClass384_133);
		this.aClass44_33 = Static68.method1134(local16.anInt6343, super.aClass384_133);
		this.aClass44_36 = Static68.method1134(local16.anInt6337, super.aClass384_133);
		this.aClass44_32 = Static68.method1134(local16.anInt6344, super.aClass384_133);
		this.aClass44_31 = Static68.method1134(local16.anInt6335, super.aClass384_133);
		this.aClass44_34 = Static68.method1134(local16.anInt6334, super.aClass384_133);
	}
}
