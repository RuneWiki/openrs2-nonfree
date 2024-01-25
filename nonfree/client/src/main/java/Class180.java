import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class180 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "Lclient!wd;")
	private Class384 aClass384_9;

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "Lclient!lm;")
	private Class6_Sub4 aClass6_Sub4_23;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
	private Class180() {
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class180(@OriginalArg(0) Class384 arg0) {
		this.aClass384_9 = arg0;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Lclient!lm;")
	public Class6_Sub4 method4135() {
		@Pc(8) Class6_Sub4 local8 = this.aClass384_9.aClass6_Sub4_62.aClass6_Sub4_67;
		if (local8 == this.aClass384_9.aClass6_Sub4_62) {
			this.aClass6_Sub4_23 = null;
			return null;
		} else {
			this.aClass6_Sub4_23 = local8.aClass6_Sub4_67;
			return local8;
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)Lclient!lm;")
	public Class6_Sub4 method4137() {
		@Pc(6) Class6_Sub4 local6 = this.aClass6_Sub4_23;
		if (local6 == this.aClass384_9.aClass6_Sub4_62) {
			this.aClass6_Sub4_23 = null;
			return null;
		} else {
			this.aClass6_Sub4_23 = local6.aClass6_Sub4_67;
			return local6;
		}
	}
}
