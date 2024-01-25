import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "Lclient!f;")
	private Class5 aClass5_26;

	@OriginalMember(owner = "client!dl", name = "r", descriptor = "Lclient!f;")
	private Class5 aClass5_27;

	@OriginalMember(owner = "client!dl", name = "s", descriptor = "Lclient!f;")
	protected Class5 aClass5_28;

	@OriginalMember(owner = "client!dl", name = "z", descriptor = "Lclient!f;")
	private Class5 aClass5_29;

	@OriginalMember(owner = "client!dl", name = "B", descriptor = "Lclient!f;")
	private Class5 aClass5_30;

	@OriginalMember(owner = "client!dl", name = "D", descriptor = "Lclient!f;")
	private Class5 aClass5_31;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!sea;Lclient!sea;Lclient!pe;)V")
	public Class12_Sub2(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class23_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIII)V")
	protected void method5762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass5_28.method7794(arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method7886() {
		if (!super.method7886()) {
			return false;
		}
		@Pc(13) Class23_Sub1 local13 = (Class23_Sub1) super.aClass23_5;
		if (!super.aClass308_144.method6538(local13.anInt1979)) {
			return false;
		} else if (!super.aClass308_144.method6538(local13.anInt1977)) {
			return false;
		} else if (!super.aClass308_144.method6538(local13.anInt1978)) {
			return false;
		} else if (!super.aClass308_144.method6538(local13.anInt1974)) {
			return false;
		} else if (super.aClass308_144.method6538(local13.anInt1981)) {
			return super.aClass308_144.method6538(local13.anInt1975);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	@Override
	public final void method7888() {
		super.method7888();
		@Pc(10) Class23_Sub1 local10 = (Class23_Sub1) super.aClass23_5;
		this.aClass5_28 = Static375.method5452(local10.anInt1979, super.aClass308_144);
		this.aClass5_31 = Static375.method5452(local10.anInt1977, super.aClass308_144);
		this.aClass5_26 = Static375.method5452(local10.anInt1978, super.aClass308_144);
		this.aClass5_29 = Static375.method5452(local10.anInt1974, super.aClass308_144);
		this.aClass5_30 = Static375.method5452(local10.anInt1981, super.aClass308_144);
		this.aClass5_27 = Static375.method5452(local10.anInt1975, super.aClass308_144);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIIB)V")
	@Override
	protected final void method5758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + this.aClass5_26.A();
		@Pc(20) int local20 = arg0 + super.aClass23_5.anInt8314 - this.aClass5_29.A();
		@Pc(26) int local26 = arg1 + this.aClass5_30.ca();
		@Pc(37) int local37 = arg1 + super.aClass23_5.anInt8309 - this.aClass5_27.ca();
		@Pc(48) int local48 = local20 - local10;
		@Pc(53) int local53 = local37 - local26;
		@Pc(61) int local61 = this.method5760() * local48 / 10000;
		@Pc(64) int[] local64 = new int[4];
		Static31.aClass78_18.oa(local64);
		Static31.aClass78_18.da(local10, local26, local10 + local61, local37);
		this.method5762(local48, local53, local10, local26);
		Static31.aClass78_18.da(local61 + local10, local26, local20, local37);
		this.aClass5_31.method7794(local10, local26, local48, local53);
		Static31.aClass78_18.da(local64[0], local64[1], local64[2], local64[3]);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIZI)V")
	@Override
	protected final void method5757(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		Static31.aClass78_18.oa(local4);
		Static31.aClass78_18.da(arg0, arg1, arg0 + super.aClass23_5.anInt8314, super.aClass23_5.anInt8309 + arg1);
		@Pc(26) int local26 = this.aClass5_26.A();
		@Pc(30) int local30 = this.aClass5_26.ca();
		@Pc(34) int local34 = this.aClass5_29.A();
		@Pc(38) int local38 = this.aClass5_29.ca();
		this.aClass5_26.method7795(arg0, (super.aClass23_5.anInt8309 - local30) / 2 + arg1);
		this.aClass5_29.method7795(super.aClass23_5.anInt8314 + arg0 - local34, arg1 - -((-local38 + super.aClass23_5.anInt8309) / 2));
		Static31.aClass78_18.da(arg0, arg1, arg0 + super.aClass23_5.anInt8314, arg1 + this.aClass5_30.ca());
		this.aClass5_30.method7794(local26 + arg0, arg1, super.aClass23_5.anInt8314 - local34 - local26, super.aClass23_5.anInt8309);
		@Pc(111) int local111 = this.aClass5_27.ca();
		Static31.aClass78_18.da(arg0, arg1 + super.aClass23_5.anInt8309 - local111, arg0 - -super.aClass23_5.anInt8314, arg1 + super.aClass23_5.anInt8309);
		this.aClass5_27.method7794(local26 + arg0, -local111 + (arg1 - -super.aClass23_5.anInt8309), super.aClass23_5.anInt8314 - local26 - local34, super.aClass23_5.anInt8309);
		Static31.aClass78_18.da(local4[0], local4[1], local4[2], local4[3]);
	}
}
