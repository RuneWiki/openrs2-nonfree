import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Lclient!f;")
	private Class22 aClass22_29;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!f;")
	private Class22 aClass22_30;

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "Lclient!f;")
	private Class22 aClass22_31;

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "Lclient!f;")
	protected Class22 aClass22_32;

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "Lclient!f;")
	private Class22 aClass22_33;

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "Lclient!f;")
	private Class22 aClass22_34;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!pu;Lclient!pu;Lclient!naa;)V")
	public Class72_Sub1(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class54_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method4316() {
		if (!super.method4316()) {
			return false;
		}
		@Pc(13) Class54_Sub2 local13 = (Class54_Sub2) super.aClass54_5;
		if (!super.aClass270_62.method5694(local13.anInt3229)) {
			return false;
		} else if (!super.aClass270_62.method5694(local13.anInt3227)) {
			return false;
		} else if (!super.aClass270_62.method5694(local13.anInt3232)) {
			return false;
		} else if (!super.aClass270_62.method5694(local13.anInt3226)) {
			return false;
		} else if (super.aClass270_62.method5694(local13.anInt3235)) {
			return super.aClass270_62.method5694(local13.anInt3233);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method4322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int[] local12 = new int[4];
		Static16.aClass134_1.oa(local12);
		Static16.aClass134_1.da(arg0, arg1, arg0 + super.aClass54_5.anInt4145, arg1 - -super.aClass54_5.anInt4141);
		@Pc(35) int local35 = this.aClass22_31.A();
		@Pc(39) int local39 = this.aClass22_31.ca();
		@Pc(43) int local43 = this.aClass22_29.A();
		@Pc(47) int local47 = this.aClass22_29.ca();
		this.aClass22_31.method7662(arg0, (super.aClass54_5.anInt4141 - local39) / 2 + arg1);
		this.aClass22_29.method7662(arg0 + super.aClass54_5.anInt4145 - local43, (super.aClass54_5.anInt4141 - local47) / 2 + arg1);
		Static16.aClass134_1.da(arg0, arg1, super.aClass54_5.anInt4145 + arg0, arg1 - -this.aClass22_30.ca());
		this.aClass22_30.method7657(arg0 + local35, arg1, super.aClass54_5.anInt4145 - local35 - local43, super.aClass54_5.anInt4141);
		@Pc(120) int local120 = this.aClass22_33.ca();
		Static16.aClass134_1.da(arg0, super.aClass54_5.anInt4141 + arg1 - local120, super.aClass54_5.anInt4145 + arg0, super.aClass54_5.anInt4141 + arg1);
		this.aClass22_33.method7657(local35 + arg0, super.aClass54_5.anInt4141 + arg1 + -local120, super.aClass54_5.anInt4145 - local43 - local35, super.aClass54_5.anInt4141);
		Static16.aClass134_1.da(local12[0], local12[1], local12[2], local12[3]);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZII)V")
	@Override
	protected final void method4321(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg1 + this.aClass22_31.A();
		@Pc(29) int local29 = super.aClass54_5.anInt4145 + arg1 - this.aClass22_29.A();
		@Pc(35) int local35 = this.aClass22_30.ca() + arg0;
		@Pc(45) int local45 = super.aClass54_5.anInt4141 + arg0 - this.aClass22_33.ca();
		@Pc(50) int local50 = local29 - local19;
		@Pc(55) int local55 = local45 - local35;
		@Pc(63) int local63 = this.method4318() * local50 / 10000;
		@Pc(66) int[] local66 = new int[4];
		Static16.aClass134_1.oa(local66);
		Static16.aClass134_1.da(local19, local35, local63 + local19, local45);
		this.method4325(local35, local50, local19, local55);
		Static16.aClass134_1.da(local19 + local63, local35, local29, local45);
		this.aClass22_34.method7657(local19, local35, local50, local55);
		Static16.aClass134_1.da(local66[0], local66[1], local66[2], local66[3]);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	@Override
	public final void method4315() {
		super.method4315();
		@Pc(10) Class54_Sub2 local10 = (Class54_Sub2) super.aClass54_5;
		this.aClass22_32 = Static155.method2241(local10.anInt3229, super.aClass270_62);
		this.aClass22_34 = Static155.method2241(local10.anInt3227, super.aClass270_62);
		this.aClass22_31 = Static155.method2241(local10.anInt3232, super.aClass270_62);
		this.aClass22_29 = Static155.method2241(local10.anInt3226, super.aClass270_62);
		this.aClass22_30 = Static155.method2241(local10.anInt3235, super.aClass270_62);
		this.aClass22_33 = Static155.method2241(local10.anInt3233, super.aClass270_62);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
	protected void method4325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass22_32.method7657(arg2, arg0, arg1, arg3);
	}
}
