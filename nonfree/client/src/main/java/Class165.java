import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class165 {

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "Lclient!bd;")
	private Class18 aClass18_31;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "Lclient!tf;")
	private Class14 aClass14_165;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
	public Class165() {
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!bd;)V")
	public Class165(@OriginalArg(0) Class18 arg0) {
		this.aClass18_31 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!bd;I)V")
	public void method4351(@OriginalArg(0) Class18 arg0) {
		this.aClass18_31 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)Lclient!tf;")
	public Class14 method4354() {
		@Pc(8) Class14 local8 = this.aClass18_31.aClass14_17.aClass14_248;
		if (this.aClass18_31.aClass14_17 == local8) {
			this.aClass14_165 = null;
			return null;
		} else {
			this.aClass14_165 = local8.aClass14_248;
			return local8;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Lclient!tf;")
	public Class14 method4355() {
		@Pc(6) Class14 local6 = this.aClass14_165;
		if (local6 == this.aClass18_31.aClass14_17) {
			this.aClass14_165 = null;
			return null;
		} else {
			this.aClass14_165 = local6.aClass14_248;
			return local6;
		}
	}
}
