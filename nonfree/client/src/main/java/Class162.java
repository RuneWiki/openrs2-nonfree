import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class162 {

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "Lclient!ns;")
	private Class3 aClass3_145;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Lclient!sga;")
	private Class307 aClass307_28;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
	private int anInt5777 = 0;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	private Class162() {
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!sga;)V")
	public Class162(@OriginalArg(0) Class307 arg0) {
		this.aClass307_28 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Lclient!ns;")
	public Class3 method4898() {
		@Pc(23) Class3 local23;
		if (this.anInt5777 > 0 && this.aClass3_145 != this.aClass307_28.aClass3Array1[this.anInt5777 - 1]) {
			local23 = this.aClass3_145;
			this.aClass3_145 = local23.aClass3_300;
			return local23;
		}
		while (this.aClass307_28.anInt9007 > this.anInt5777) {
			local23 = this.aClass307_28.aClass3Array1[this.anInt5777++].aClass3_300;
			if (local23 != this.aClass307_28.aClass3Array1[this.anInt5777 - 1]) {
				this.aClass3_145 = local23.aClass3_300;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)Lclient!ns;")
	public Class3 method4899() {
		this.anInt5777 = 0;
		return this.method4898();
	}
}
