import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class97 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "Lclient!mfa;")
	private Class211 aClass211_22;

	@OriginalMember(owner = "client!et", name = "c", descriptor = "Lclient!mu;")
	private Class6 aClass6_73;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	public Class97() {
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!mfa;)V")
	public Class97(@OriginalArg(0) Class211 arg0) {
		this.aClass211_22 = arg0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Lclient!mu;")
	public Class6 method2512() {
		@Pc(6) Class6 local6 = this.aClass6_73;
		if (local6 == this.aClass211_22.aClass6_154) {
			this.aClass6_73 = null;
			return null;
		} else {
			this.aClass6_73 = local6.aClass6_283;
			return local6;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!mfa;I)V")
	public void method2514(@OriginalArg(0) Class211 arg0) {
		this.aClass211_22 = arg0;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)Lclient!mu;")
	public Class6 method2517() {
		@Pc(14) Class6 local14 = this.aClass211_22.aClass6_154.aClass6_283;
		if (local14 == this.aClass211_22.aClass6_154) {
			this.aClass6_73 = null;
			return null;
		} else {
			this.aClass6_73 = local14.aClass6_283;
			return local14;
		}
	}
}
