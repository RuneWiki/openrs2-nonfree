import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!jda", name = "g", descriptor = "Lclient!xa;")
	private Class71 aClass71_26;

	@OriginalMember(owner = "client!jda", name = "m", descriptor = "Lclient!xa;")
	private Class71 aClass71_27;

	@OriginalMember(owner = "client!jda", name = "n", descriptor = "I")
	private int anInt4408;

	@OriginalMember(owner = "client!jda", name = "o", descriptor = "Lclient!xa;")
	private Class71 aClass71_28;

	@OriginalMember(owner = "client!jda", name = "r", descriptor = "Lclient!xa;")
	private Class71 aClass71_29;

	@OriginalMember(owner = "client!jda", name = "s", descriptor = "Lclient!xa;")
	private Class71 aClass71_30;

	@OriginalMember(owner = "client!jda", name = "t", descriptor = "Lclient!xa;")
	private Class71 aClass71_31;

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "Lclient!pj;")
	private final Class248 aClass248_34;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lclient!pj;Lclient!ks;)V")
	public Class40_Sub2(@OriginalArg(0) Class248 arg0, @OriginalArg(1) Class65_Sub3 arg1) {
		super(arg1);
		this.aClass248_34 = arg0;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
	@Override
	public void method6770() {
		@Pc(7) Class65_Sub3 local7 = (Class65_Sub3) super.aClass65_4;
		this.aClass71_26 = Static535.method7285(this.aClass248_34.method5795(local7.anInt4928));
		this.aClass71_28 = Static535.method7285(this.aClass248_34.method5795(local7.anInt4932));
		this.aClass71_30 = Static535.method7285(this.aClass248_34.method5795(local7.anInt4933));
		this.aClass71_27 = Static535.method7285(this.aClass248_34.method5795(local7.anInt4931));
		this.aClass71_29 = Static535.method7285(this.aClass248_34.method5795(local7.anInt4926));
		this.aClass71_31 = Static535.method7285(this.aClass248_34.method5795(local7.anInt4925));
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method6298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int[] local12 = new int[4];
		Static554.aClass90_12.A(local12);
		Static554.aClass90_12.ca(arg1, arg0, arg1 + super.aClass65_4.anInt4919, super.aClass65_4.anInt4916 + arg0);
		@Pc(33) int local33 = this.aClass71_30.AA();
		@Pc(37) int local37 = this.aClass71_30.a();
		@Pc(41) int local41 = this.aClass71_27.AA();
		@Pc(45) int local45 = this.aClass71_27.a();
		this.aClass71_30.method7775(arg1, (super.aClass65_4.anInt4916 - local37) / 2 + arg0);
		this.aClass71_27.method7775(arg1 + super.aClass65_4.anInt4919 - local41, arg0 + (super.aClass65_4.anInt4916 - local45) / 2);
		Static554.aClass90_12.ca(arg1, arg0, arg1 + super.aClass65_4.anInt4919, arg0 + this.aClass71_29.a());
		this.aClass71_29.method7776(local33 + arg1, arg0, super.aClass65_4.anInt4919 - local33 - local41, super.aClass65_4.anInt4916);
		@Pc(116) int local116 = this.aClass71_31.a();
		Static554.aClass90_12.ca(arg1, arg0 + super.aClass65_4.anInt4916 - local116, arg1 - -super.aClass65_4.anInt4919, arg0 + super.aClass65_4.anInt4916);
		this.aClass71_31.method7776(local33 + arg1, super.aClass65_4.anInt4916 + arg0 + -local116, super.aClass65_4.anInt4919 - local41 - local33, super.aClass65_4.anInt4916);
		Static554.aClass90_12.ca(local12[0], local12[1], local12[2], local12[3]);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6772() {
		@Pc(7) Class65_Sub3 local7 = (Class65_Sub3) super.aClass65_4;
		if (!this.aClass248_34.method5804(local7.anInt4928)) {
			return false;
		} else if (!this.aClass248_34.method5804(local7.anInt4932)) {
			return false;
		} else if (!this.aClass248_34.method5804(local7.anInt4933)) {
			return false;
		} else if (!this.aClass248_34.method5804(local7.anInt4931)) {
			return false;
		} else if (this.aClass248_34.method5804(local7.anInt4926)) {
			return this.aClass248_34.method5804(local7.anInt4931);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIZB)V")
	@Override
	protected void method6296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4408 = Static473.anInt8332;
		@Pc(19) int local19 = arg0 + this.aClass71_30.AA();
		@Pc(30) int local30 = arg0 + super.aClass65_4.anInt4919 - this.aClass71_27.AA();
		@Pc(37) int local37 = arg1 + this.aClass71_29.a();
		@Pc(48) int local48 = super.aClass65_4.anInt4916 + arg1 - this.aClass71_31.a();
		@Pc(52) int local52 = local30 - local19;
		@Pc(56) int local56 = local48 - local37;
		@Pc(62) int local62 = Static473.anInt8332 * local52 / 100;
		@Pc(65) int[] local65 = new int[4];
		Static554.aClass90_12.A(local65);
		Static554.aClass90_12.ca(local19, local37, local62 + local19, local48);
		this.aClass71_26.method7776(local19, local37, local52, local56);
		Static554.aClass90_12.ca(local19 + local62, local37, local30, local48);
		this.aClass71_28.method7776(local19, local37, local52, local56);
		Static554.aClass90_12.ca(local65[0], local65[1], local65[2], local65[3]);
	}
}
