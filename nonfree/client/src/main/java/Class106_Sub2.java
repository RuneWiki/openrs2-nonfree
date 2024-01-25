import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public class Class106_Sub2 extends Class106 {

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "Lclient!hu;")
	private Class21 aClass21_19;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "Lclient!hu;")
	private Class21 aClass21_20;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "Lclient!hu;")
	protected Class21 aClass21_21;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "Lclient!hu;")
	private Class21 aClass21_22;

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "Lclient!hu;")
	private Class21 aClass21_23;

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "Lclient!hu;")
	private Class21 aClass21_24;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!oh;Lclient!oh;Lclient!uca;)V")
	public Class106_Sub2(@OriginalArg(0) Class237 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class6_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8623() {
		if (!super.method8623()) {
			return false;
		}
		@Pc(13) Class6_Sub2 local13 = (Class6_Sub2) super.aClass6_5;
		if (!super.aClass237_120.method6296(local13.anInt4302)) {
			return false;
		} else if (!super.aClass237_120.method6296(local13.anInt4299)) {
			return false;
		} else if (!super.aClass237_120.method6296(local13.anInt4296)) {
			return false;
		} else if (!super.aClass237_120.method6296(local13.anInt4298)) {
			return false;
		} else if (super.aClass237_120.method6296(local13.anInt4293)) {
			return super.aClass237_120.method6296(local13.anInt4300);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZIIZ)V")
	@Override
	protected final void method7195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + this.aClass21_22.method5779();
		@Pc(20) int local20 = super.aClass6_5.anInt10335 + arg0 - this.aClass21_24.method5779();
		@Pc(27) int local27 = arg1 + this.aClass21_23.method5785();
		@Pc(37) int local37 = arg1 + super.aClass6_5.anInt10336 - this.aClass21_20.method5785();
		@Pc(48) int local48 = local20 - local9;
		@Pc(53) int local53 = local37 - local27;
		@Pc(61) int local61 = this.method7191() * local48 / 10000;
		@Pc(64) int[] local64 = new int[4];
		Static171.aClass16_5.K(local64);
		Static171.aClass16_5.KA(local9, local27, local61 + local9, local37);
		this.method5388(local9, local53, local27, local48);
		Static171.aClass16_5.KA(local61 + local9, local27, local20, local37);
		this.aClass21_19.method5789(local9, local27, local48, local53);
		Static171.aClass16_5.KA(local64[0], local64[1], local64[2], local64[3]);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	@Override
	public final void method8624() {
		super.method8624();
		@Pc(10) Class6_Sub2 local10 = (Class6_Sub2) super.aClass6_5;
		this.aClass21_21 = Static269.method4648(super.aClass237_120, local10.anInt4302);
		this.aClass21_19 = Static269.method4648(super.aClass237_120, local10.anInt4299);
		this.aClass21_22 = Static269.method4648(super.aClass237_120, local10.anInt4296);
		this.aClass21_24 = Static269.method4648(super.aClass237_120, local10.anInt4298);
		this.aClass21_23 = Static269.method4648(super.aClass237_120, local10.anInt4293);
		this.aClass21_20 = Static269.method4648(super.aClass237_120, local10.anInt4300);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZIII)V")
	@Override
	protected final void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int[] local16 = new int[4];
		Static171.aClass16_5.K(local16);
		Static171.aClass16_5.KA(arg1, arg0, super.aClass6_5.anInt10335 + arg1, super.aClass6_5.anInt10336 + arg0);
		@Pc(37) int local37 = this.aClass21_22.method5779();
		@Pc(41) int local41 = this.aClass21_22.method5785();
		@Pc(45) int local45 = this.aClass21_24.method5779();
		@Pc(49) int local49 = this.aClass21_24.method5785();
		this.aClass21_22.method5796(arg1, arg0 + (super.aClass6_5.anInt10336 - local41) / 2);
		this.aClass21_24.method5796(super.aClass6_5.anInt10335 + arg1 - local45, (super.aClass6_5.anInt10336 + -local49) / 2 + arg0);
		Static171.aClass16_5.KA(arg1, arg0, super.aClass6_5.anInt10335 + arg1, arg0 + this.aClass21_23.method5785());
		this.aClass21_23.method5789(arg1 + local37, arg0, super.aClass6_5.anInt10335 - local37 - local45, super.aClass6_5.anInt10336);
		@Pc(121) int local121 = this.aClass21_20.method5785();
		Static171.aClass16_5.KA(arg1, super.aClass6_5.anInt10336 + arg0 - local121, arg1 - -super.aClass6_5.anInt10335, super.aClass6_5.anInt10336 + arg0);
		this.aClass21_20.method5789(arg1 + local37, super.aClass6_5.anInt10336 + arg0 - local121, super.aClass6_5.anInt10335 - local37 - local45, super.aClass6_5.anInt10336);
		Static171.aClass16_5.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIBI)V")
	protected void method5388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.aClass21_21.method5789(arg0, arg2, arg3, arg1);
	}
}
