import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class53 {

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "Lclient!ge;")
	private Class2_Sub3 aClass2_Sub3_15 = new Class2_Sub3();

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "Lclient!qi;")
	private Class144 aClass144_4 = new Class144();

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
	private int anInt1463;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
	private int anInt1464;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!ii;")
	private Class79 aClass79_9;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V")
	public Class53(@OriginalArg(0) int arg0) {
		this.anInt1463 = arg0;
		this.anInt1464 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass79_9 = new Class79(local19);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(JB)Lclient!ge;")
	public Class2_Sub3 method1254(@OriginalArg(0) long arg0) {
		@Pc(17) Class2_Sub3 local17 = (Class2_Sub3) this.aClass79_9.method2002(arg0);
		if (local17 != null) {
			this.aClass144_4.method3662(local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BJLclient!ge;)V")
	public void method1258(@OriginalArg(1) long arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (this.anInt1463 == 0) {
			@Pc(17) Class2_Sub3 local17 = this.aClass144_4.method3665();
			local17.method4926();
			local17.method4613();
			if (local17 == this.aClass2_Sub3_15) {
				local17 = this.aClass144_4.method3665();
				local17.method4926();
				local17.method4613();
			}
		} else {
			this.anInt1463--;
		}
		this.aClass79_9.method1994(arg0, arg1);
		this.aClass144_4.method3662(arg1);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Lclient!ma;")
	public Class2 method1260() {
		return this.aClass79_9.method1992();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public void method1261() {
		this.aClass144_4.method3668();
		this.aClass79_9.method1999();
		this.aClass2_Sub3_15 = new Class2_Sub3();
		this.anInt1463 = this.anInt1464;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)Lclient!ma;")
	public Class2 method1262() {
		return this.aClass79_9.method1991();
	}
}
