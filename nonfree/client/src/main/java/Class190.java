import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class190 {

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "Lclient!hh;")
	private Class2 aClass2_134;

	@OriginalMember(owner = "client!jba", name = "h", descriptor = "Lclient!cga;")
	private Class60 aClass60_91;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "()V")
	public Class190() {
	}

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!cga;)V")
	public Class190(@OriginalArg(0) Class60 arg0) {
		this.aClass60_91 = arg0;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)Lclient!hh;")
	public Class2 method4062() {
		@Pc(14) Class2 local14 = this.aClass2_134;
		if (local14 == this.aClass60_91.aClass2_47) {
			this.aClass2_134 = null;
			return null;
		} else {
			this.aClass2_134 = local14.aClass2_345;
			return local14;
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!cga;I)V")
	public void method4063(@OriginalArg(0) Class60 arg0) {
		this.aClass60_91 = arg0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)Lclient!hh;")
	public Class2 method4065() {
		@Pc(17) Class2 local17 = this.aClass60_91.aClass2_47.aClass2_345;
		if (this.aClass60_91.aClass2_47 == local17) {
			this.aClass2_134 = null;
			return null;
		} else {
			this.aClass2_134 = local17.aClass2_345;
			return local17;
		}
	}
}
