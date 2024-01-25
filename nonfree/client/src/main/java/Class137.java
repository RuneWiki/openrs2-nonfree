import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class137 {

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "Lclient!ob;")
	private Class3 aClass3_160;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "Lclient!m;")
	private Class127 aClass127_20;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	public Class137() {
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!m;)V")
	public Class137(@OriginalArg(0) Class127 arg0) {
		this.aClass127_20 = arg0;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!m;B)V")
	public void method3461(@OriginalArg(0) Class127 arg0) {
		this.aClass127_20 = arg0;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Lclient!ob;")
	public Class3 method3465() {
		@Pc(11) Class3 local11 = this.aClass3_160;
		if (local11 == this.aClass127_20.aClass3_156) {
			this.aClass3_160 = null;
			return null;
		} else {
			this.aClass3_160 = local11.aClass3_248;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Lclient!ob;")
	public Class3 method3466() {
		@Pc(24) Class3 local24 = this.aClass127_20.aClass3_156.aClass3_248;
		if (this.aClass127_20.aClass3_156 == local24) {
			this.aClass3_160 = null;
			return null;
		} else {
			this.aClass3_160 = local24.aClass3_248;
			return local24;
		}
	}
}
