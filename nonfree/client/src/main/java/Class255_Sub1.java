import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class255_Sub1 extends Class255 {

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "Lclient!xa;")
	private Class66 aClass66_32;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!xa;")
	private Class66 aClass66_33;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "Lclient!xa;")
	private Class66 aClass66_34;

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "Lclient!xa;")
	private Class66 aClass66_35;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
	private int anInt8989;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Lclient!xa;")
	private Class66 aClass66_36;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!xa;")
	private Class66 aClass66_37;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "Lclient!jo;")
	private final Class168 aClass168_116;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!jo;Lclient!uf;)V")
	public Class255_Sub1(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class101_Sub3 arg1) {
		super(arg1);
		this.aClass168_116 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZZI)V")
	@Override
	protected void method8050(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		Static323.aClass9_8.A(local8);
		Static323.aClass9_8.ca(arg1, arg0, arg1 + super.aClass101_4.anInt9016, arg0 + super.aClass101_4.anInt9009);
		@Pc(29) int local29 = this.aClass66_36.AA();
		@Pc(33) int local33 = this.aClass66_36.a();
		@Pc(37) int local37 = this.aClass66_33.AA();
		@Pc(41) int local41 = this.aClass66_33.a();
		this.aClass66_36.method8066(arg1, (super.aClass101_4.anInt9009 - local33) / 2 + arg0);
		this.aClass66_33.method8066(super.aClass101_4.anInt9016 + arg1 - local37, arg0 - -((super.aClass101_4.anInt9009 + -local41) / 2));
		Static323.aClass9_8.ca(arg1, arg0, arg1 + super.aClass101_4.anInt9016, arg0 + this.aClass66_35.a());
		this.aClass66_35.method8060(local29 + arg1, arg0, super.aClass101_4.anInt9016 - local37 - local29, super.aClass101_4.anInt9009);
		@Pc(112) int local112 = this.aClass66_32.a();
		Static323.aClass9_8.ca(arg1, arg0 + super.aClass101_4.anInt9009 - local112, arg1 - -super.aClass101_4.anInt9016, arg0 + super.aClass101_4.anInt9009);
		this.aClass66_32.method8060(local29 + arg1, super.aClass101_4.anInt9009 + (arg0 - local112), super.aClass101_4.anInt9016 - local29 - local37, super.aClass101_4.anInt9009);
		Static323.aClass9_8.ca(local8[0], local8[1], local8[2], local8[3]);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	@Override
	public void method8048() {
		@Pc(7) Class101_Sub3 local7 = (Class101_Sub3) super.aClass101_4;
		this.aClass66_34 = Static223.method4015(this.aClass168_116.method4438(local7.anInt9021));
		this.aClass66_37 = Static223.method4015(this.aClass168_116.method4438(local7.anInt9023));
		this.aClass66_36 = Static223.method4015(this.aClass168_116.method4438(local7.anInt9020));
		this.aClass66_33 = Static223.method4015(this.aClass168_116.method4438(local7.anInt9018));
		this.aClass66_35 = Static223.method4015(this.aClass168_116.method4438(local7.anInt9022));
		this.aClass66_32 = Static223.method4015(this.aClass168_116.method4438(local7.anInt9017));
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BZII)V")
	@Override
	protected void method8055(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		this.anInt8989 = Static258.anInt5219;
		@Pc(22) int local22 = arg0 + this.aClass66_36.AA();
		@Pc(34) int local34 = arg0 + super.aClass101_4.anInt9016 - this.aClass66_33.AA();
		@Pc(40) int local40 = this.aClass66_35.a() + arg1;
		@Pc(51) int local51 = super.aClass101_4.anInt9009 + arg1 - this.aClass66_32.a();
		@Pc(56) int local56 = local34 - local22;
		@Pc(60) int local60 = local51 - local40;
		@Pc(66) int local66 = Static258.anInt5219 * local56 / 100;
		@Pc(69) int[] local69 = new int[4];
		Static323.aClass9_8.A(local69);
		Static323.aClass9_8.ca(local22, local40, local22 + local66, local51);
		this.aClass66_34.method8060(local22, local40, local56, local60);
		Static323.aClass9_8.ca(local22 + local66, local40, local34, local51);
		this.aClass66_37.method8060(local22, local40, local56, local60);
		Static323.aClass9_8.ca(local69[0], local69[1], local69[2], local69[3]);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		@Pc(7) Class101_Sub3 local7 = (Class101_Sub3) super.aClass101_4;
		if (!this.aClass168_116.method4427(local7.anInt9021)) {
			return false;
		} else if (!this.aClass168_116.method4427(local7.anInt9023)) {
			return false;
		} else if (!this.aClass168_116.method4427(local7.anInt9020)) {
			return false;
		} else if (!this.aClass168_116.method4427(local7.anInt9018)) {
			return false;
		} else if (this.aClass168_116.method4427(local7.anInt9022)) {
			return this.aClass168_116.method4427(local7.anInt9018);
		} else {
			return false;
		}
	}
}
