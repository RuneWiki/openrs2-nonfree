import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class211 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Lclient!bj;")
	private Class30 aClass30_8;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!ab;")
	private Class3_Sub1 aClass3_Sub1_43;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	private Class211() {
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!bj;)V")
	public Class211(@OriginalArg(0) Class30 arg0) {
		this.aClass30_8 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Lclient!ab;")
	public Class3_Sub1 method5583() {
		@Pc(13) Class3_Sub1 local13 = this.aClass30_8.aClass3_Sub1_7.aClass3_Sub1_66;
		if (local13 == this.aClass30_8.aClass3_Sub1_7) {
			this.aClass3_Sub1_43 = null;
			return null;
		} else {
			this.aClass3_Sub1_43 = local13.aClass3_Sub1_66;
			return local13;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lclient!ab;")
	public Class3_Sub1 method5584() {
		@Pc(6) Class3_Sub1 local6 = this.aClass3_Sub1_43;
		if (this.aClass30_8.aClass3_Sub1_7 == local6) {
			this.aClass3_Sub1_43 = null;
			return null;
		} else {
			this.aClass3_Sub1_43 = local6.aClass3_Sub1_66;
			return local6;
		}
	}
}
