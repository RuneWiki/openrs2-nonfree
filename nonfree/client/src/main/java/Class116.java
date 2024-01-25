import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class116 {

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "Lclient!vs;")
	private Class3_Sub7 aClass3_Sub7_29 = new Class3_Sub7();

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "Lclient!th;")
	private final Class325 aClass325_2 = new Class325();

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
	private final int anInt3493;

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
	private int anInt3494;

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "Lclient!wa;")
	private final Class354 aClass354_15;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(I)V")
	public Class116(@OriginalArg(0) int arg0) {
		this.anInt3493 = arg0;
		this.anInt3494 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass354_15 = new Class354(local19);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(JI)Lclient!vs;")
	public Class3_Sub7 method3126(@OriginalArg(0) long arg0) {
		@Pc(17) Class3_Sub7 local17 = (Class3_Sub7) this.aClass354_15.method7689(arg0);
		if (local17 != null) {
			this.aClass325_2.method6862(local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!vs;J)V")
	public void method3127(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt3494 == 0) {
			@Pc(19) Class3_Sub7 local19 = this.aClass325_2.method6860();
			local19.method7825();
			local19.method7614();
			if (local19 == this.aClass3_Sub7_29) {
				local19 = this.aClass325_2.method6860();
				local19.method7825();
				local19.method7614();
			}
		} else {
			this.anInt3494--;
		}
		this.aClass354_15.method7691(arg0, arg1);
		this.aClass325_2.method6862(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
	public void method3128() {
		this.aClass325_2.method6864();
		this.aClass354_15.method7687();
		this.aClass3_Sub7_29 = new Class3_Sub7();
		this.anInt3494 = this.anInt3493;
	}
}
