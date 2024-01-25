import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class140 {

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "Lclient!bd;")
	private Class32 aClass32_15;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "Lclient!wj;")
	private Class14 aClass14_121;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	public Class140() {
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!bd;)V")
	public Class140(@OriginalArg(0) Class32 arg0) {
		this.aClass32_15 = arg0;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Lclient!wj;")
	public Class14 method3016() {
		@Pc(6) Class14 local6 = this.aClass14_121;
		if (this.aClass32_15.aClass14_27 == local6) {
			this.aClass14_121 = null;
			return null;
		} else {
			this.aClass14_121 = local6.aClass14_339;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)Lclient!wj;")
	public Class14 method3019() {
		@Pc(8) Class14 local8 = this.aClass32_15.aClass14_27.aClass14_339;
		if (local8 == this.aClass32_15.aClass14_27) {
			this.aClass14_121 = null;
			return null;
		} else {
			this.aClass14_121 = local8.aClass14_339;
			return local8;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!bd;B)V")
	public void method3020(@OriginalArg(0) Class32 arg0) {
		this.aClass32_15 = arg0;
	}
}
