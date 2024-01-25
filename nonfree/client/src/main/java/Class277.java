import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class277 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "Lclient!su;")
	private Class5_Sub2 aClass5_Sub2_53;

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "Lclient!hf;")
	private Class150 aClass150_11;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	private Class277() {
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!hf;)V")
	public Class277(@OriginalArg(0) Class150 arg0) {
		this.aClass150_11 = arg0;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Lclient!su;")
	public Class5_Sub2 method6752() {
		@Pc(6) Class5_Sub2 local6 = this.aClass5_Sub2_53;
		if (this.aClass150_11.aClass5_Sub2_24 == local6) {
			this.aClass5_Sub2_53 = null;
			return null;
		} else {
			this.aClass5_Sub2_53 = local6.aClass5_Sub2_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)Lclient!su;")
	public Class5_Sub2 method6753() {
		@Pc(14) Class5_Sub2 local14 = this.aClass150_11.aClass5_Sub2_24.aClass5_Sub2_67;
		if (local14 == this.aClass150_11.aClass5_Sub2_24) {
			this.aClass5_Sub2_53 = null;
			return null;
		} else {
			this.aClass5_Sub2_53 = local14.aClass5_Sub2_67;
			return local14;
		}
	}
}
