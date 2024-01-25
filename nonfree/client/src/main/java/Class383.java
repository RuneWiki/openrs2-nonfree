import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class383 {

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "Lclient!no;")
	private Class3 aClass3_296;

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "Lclient!mba;")
	private Class216 aClass216_72;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V")
	public Class383() {
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!mba;)V")
	public Class383(@OriginalArg(0) Class216 arg0) {
		this.aClass216_72 = arg0;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)Lclient!no;")
	public Class3 method8654() {
		@Pc(8) Class3 local8 = this.aClass216_72.aClass3_185.aClass3_300;
		if (local8 == this.aClass216_72.aClass3_185) {
			this.aClass3_296 = null;
			return null;
		} else {
			this.aClass3_296 = local8.aClass3_300;
			return local8;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!mba;I)V")
	public void method8656(@OriginalArg(0) Class216 arg0) {
		this.aClass216_72 = arg0;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)Lclient!no;")
	public Class3 method8657() {
		@Pc(11) Class3 local11 = this.aClass3_296;
		if (this.aClass216_72.aClass3_185 == local11) {
			this.aClass3_296 = null;
			return null;
		} else {
			this.aClass3_296 = local11.aClass3_300;
			return local11;
		}
	}
}
