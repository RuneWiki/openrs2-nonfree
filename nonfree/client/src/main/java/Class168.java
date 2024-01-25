import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class168 {

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "Lclient!vba;")
	private Class3_Sub10 aClass3_Sub10_29 = new Class3_Sub10();

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "Lclient!tf;")
	private final Class279 aClass279_9 = new Class279();

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
	private int anInt5399;

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
	private final int anInt5398;

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "Lclient!sd;")
	private final Class267 aClass267_25;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(I)V")
	public Class168(@OriginalArg(0) int arg0) {
		this.anInt5399 = arg0;
		this.anInt5398 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass267_25 = new Class267(local19);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(JLclient!vba;Z)V")
	public void method4547(@OriginalArg(0) long arg0, @OriginalArg(1) Class3_Sub10 arg1) {
		if (this.anInt5399 == 0) {
			@Pc(18) Class3_Sub10 local18 = this.aClass279_9.method6909();
			local18.method7820();
			local18.method7643();
			if (local18 == this.aClass3_Sub10_29) {
				local18 = this.aClass279_9.method6909();
				local18.method7820();
				local18.method7643();
			}
		} else {
			this.anInt5399--;
		}
		this.aClass267_25.method6640(arg1, arg0);
		this.aClass279_9.method6910(arg1);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
	public void method4550() {
		this.aClass279_9.method6905();
		this.aClass267_25.method6648();
		this.aClass3_Sub10_29 = new Class3_Sub10();
		this.anInt5399 = this.anInt5398;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(JZ)Lclient!vba;")
	public Class3_Sub10 method4551(@OriginalArg(0) long arg0) {
		@Pc(15) Class3_Sub10 local15 = (Class3_Sub10) this.aClass267_25.method6644(arg0);
		if (local15 != null) {
			this.aClass279_9.method6910(local15);
		}
		return local15;
	}
}
