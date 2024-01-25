import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class95 {

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "Lclient!su;")
	private Class298 aClass298_56;

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "Lclient!ia;")
	private Class6 aClass6_69;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V")
	public Class95() {
	}

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!su;)V")
	public Class95(@OriginalArg(0) Class298 arg0) {
		this.aClass298_56 = arg0;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)Lclient!ia;")
	public Class6 method2270() {
		@Pc(14) Class6 local14 = this.aClass298_56.aClass6_246.aClass6_284;
		if (this.aClass298_56.aClass6_246 == local14) {
			this.aClass6_69 = null;
			return null;
		} else {
			this.aClass6_69 = local14.aClass6_284;
			return local14;
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!su;I)V")
	public void method2271(@OriginalArg(0) Class298 arg0) {
		this.aClass298_56 = arg0;
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)Lclient!ia;")
	public Class6 method2272() {
		@Pc(6) Class6 local6 = this.aClass6_69;
		if (this.aClass298_56.aClass6_246 == local6) {
			this.aClass6_69 = null;
			return null;
		} else {
			this.aClass6_69 = local6.aClass6_284;
			return local6;
		}
	}
}
