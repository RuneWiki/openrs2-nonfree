import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class14 {

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "Lclient!as;")
	private Class12_Sub4 aClass12_Sub4_1 = new Class12_Sub4();

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "Lclient!st;")
	private final Class280 aClass280_1 = new Class280();

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
	private final int anInt237;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "Lclient!dea;")
	private final Class68 aClass68_6;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
	public Class14(@OriginalArg(0) int arg0) {
		this.anInt235 = arg0;
		this.anInt237 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass68_6 = new Class68(local19);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BJ)Lclient!as;")
	public Class12_Sub4 method357(@OriginalArg(1) long arg0) {
		@Pc(10) Class12_Sub4 local10 = (Class12_Sub4) this.aClass68_6.method1917(arg0);
		if (local10 != null) {
			this.aClass280_1.method6894(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	public void method358() {
		this.aClass280_1.method6896();
		this.aClass68_6.method1922();
		this.aClass12_Sub4_1 = new Class12_Sub4();
		this.anInt235 = this.anInt237;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(JLclient!as;I)V")
	public void method359(@OriginalArg(0) long arg0, @OriginalArg(1) Class12_Sub4 arg1) {
		if (this.anInt235 == 0) {
			@Pc(10) Class12_Sub4 local10 = this.aClass280_1.method6888();
			local10.method7967();
			local10.method7959();
			if (local10 == this.aClass12_Sub4_1) {
				local10 = this.aClass280_1.method6888();
				local10.method7967();
				local10.method7959();
			}
		} else {
			this.anInt235--;
		}
		this.aClass68_6.method1916(arg1, arg0);
		this.aClass280_1.method6894(arg1);
	}
}
