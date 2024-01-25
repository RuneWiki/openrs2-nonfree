import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class162 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Lclient!gga;")
	private Class3 aClass3_151;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "Lclient!wa;")
	private Class354 aClass354_21;

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
	private int anInt4514 = 0;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	private Class162() {
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Class162(@OriginalArg(0) Class354 arg0) {
		this.aClass354_21 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Lclient!gga;")
	public Class3 method3917() {
		@Pc(23) Class3 local23;
		if (this.anInt4514 > 0 && this.aClass3_151 != this.aClass354_21.aClass3Array1[this.anInt4514 - 1]) {
			local23 = this.aClass3_151;
			this.aClass3_151 = local23.aClass3_286;
			return local23;
		}
		while (this.anInt4514 < this.aClass354_21.anInt9285) {
			local23 = this.aClass354_21.aClass3Array1[this.anInt4514++].aClass3_286;
			if (local23 != this.aClass354_21.aClass3Array1[this.anInt4514 - 1]) {
				this.aClass3_151 = local23.aClass3_286;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)Lclient!gga;")
	public Class3 method3920() {
		this.anInt4514 = 0;
		return this.method3917();
	}
}
