import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!w", name = "I", descriptor = "Lclient!fs;")
	private Class134 aClass134_15;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "Lclient!fs;")
	private Class134 aClass134_16;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "Lclient!fs;")
	private Class134 aClass134_17;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "Lclient!fs;")
	private Class134 aClass134_18;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "Lclient!fs;")
	protected Class134 aClass134_19;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "Lclient!fs;")
	private Class134 aClass134_20;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!cs;)V")
	public Class25_Sub1(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class31_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZIBI)V")
	@Override
	protected final void method7937(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		Static457.aClass57_11.K(local8);
		Static457.aClass57_11.KA(arg0, arg1, arg0 + super.aClass31_5.anInt9301, super.aClass31_5.anInt9302 + arg1);
		@Pc(30) int local30 = this.aClass134_16.method9231();
		@Pc(34) int local34 = this.aClass134_16.method9232();
		@Pc(38) int local38 = this.aClass134_15.method9231();
		@Pc(42) int local42 = this.aClass134_15.method9232();
		this.aClass134_16.method9235(arg0, (super.aClass31_5.anInt9302 - local34) / 2 + arg1);
		this.aClass134_15.method9235(arg0 + super.aClass31_5.anInt9301 - local38, (super.aClass31_5.anInt9302 + -local42) / 2 + arg1);
		Static457.aClass57_11.KA(arg0, arg1, super.aClass31_5.anInt9301 + arg0, arg1 - -this.aClass134_17.method9232());
		this.aClass134_17.method9240(arg0 + local30, arg1, super.aClass31_5.anInt9301 - local38 - local30, super.aClass31_5.anInt9302);
		@Pc(115) int local115 = this.aClass134_20.method9232();
		Static457.aClass57_11.KA(arg0, arg1 + super.aClass31_5.anInt9302 - local115, arg0 - -super.aClass31_5.anInt9301, super.aClass31_5.anInt9302 + arg1);
		this.aClass134_20.method9240(arg0 + local30, arg1 - (-super.aClass31_5.anInt9302 - -local115), super.aClass31_5.anInt9301 - local30 - local38, super.aClass31_5.anInt9302);
		Static457.aClass57_11.KA(local8[0], local8[1], local8[2], local8[3]);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZIZI)V")
	@Override
	protected final void method7938(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) int local9 = arg0 + this.aClass134_16.method9231();
		@Pc(20) int local20 = arg0 + super.aClass31_5.anInt9301 - this.aClass134_15.method9231();
		@Pc(27) int local27 = arg1 + this.aClass134_17.method9232();
		@Pc(37) int local37 = super.aClass31_5.anInt9302 + arg1 - this.aClass134_20.method9232();
		@Pc(49) int local49 = local20 - local9;
		@Pc(54) int local54 = local37 - local27;
		@Pc(62) int local62 = this.method7936() * local49 / 10000;
		@Pc(65) int[] local65 = new int[4];
		Static457.aClass57_11.K(local65);
		Static457.aClass57_11.KA(local9, local27, local9 + local62, local37);
		this.method2007(local9, local49, local54, local27);
		Static457.aClass57_11.KA(local9 + local62, local27, local20, local37);
		this.aClass134_18.method9240(local9, local27, local49, local54);
		Static457.aClass57_11.KA(local65[0], local65[1], local65[2], local65[3]);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method8947() {
		if (!super.method8947()) {
			return false;
		}
		@Pc(21) Class31_Sub1 local21 = (Class31_Sub1) super.aClass31_5;
		if (!super.aClass208_121.method4977(local21.anInt7740)) {
			return false;
		} else if (!super.aClass208_121.method4977(local21.anInt7737)) {
			return false;
		} else if (!super.aClass208_121.method4977(local21.anInt7734)) {
			return false;
		} else if (!super.aClass208_121.method4977(local21.anInt7732)) {
			return false;
		} else if (super.aClass208_121.method4977(local21.anInt7731)) {
			return super.aClass208_121.method4977(local21.anInt7741);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	@Override
	public final void method8948() {
		super.method8948();
		@Pc(10) Class31_Sub1 local10 = (Class31_Sub1) super.aClass31_5;
		this.aClass134_19 = Static332.method5056(super.aClass208_121, local10.anInt7740);
		this.aClass134_18 = Static332.method5056(super.aClass208_121, local10.anInt7737);
		this.aClass134_16 = Static332.method5056(super.aClass208_121, local10.anInt7734);
		this.aClass134_15 = Static332.method5056(super.aClass208_121, local10.anInt7732);
		this.aClass134_17 = Static332.method5056(super.aClass208_121, local10.anInt7731);
		this.aClass134_20 = Static332.method5056(super.aClass208_121, local10.anInt7741);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIB)V")
	protected void method2007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass134_19.method9240(arg0, arg3, arg1, arg2);
	}
}
