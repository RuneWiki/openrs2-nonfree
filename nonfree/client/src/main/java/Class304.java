import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class304 {

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "Lclient!tfa;")
	private Class3 aClass3_262;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "Lclient!sja;")
	private Class342 aClass342_64;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class304() {
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!sja;)V")
	public Class304(@OriginalArg(0) Class342 arg0) {
		this.aClass342_64 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!sja;)V")
	public void method6982(@OriginalArg(1) Class342 arg0) {
		this.aClass342_64 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Lclient!tfa;")
	public Class3 method6983() {
		@Pc(8) Class3 local8 = this.aClass342_64.aClass3_291.aClass3_346;
		if (this.aClass342_64.aClass3_291 == local8) {
			this.aClass3_262 = null;
			return null;
		} else {
			this.aClass3_262 = local8.aClass3_346;
			return local8;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lclient!tfa;")
	public Class3 method6984() {
		@Pc(6) Class3 local6 = this.aClass3_262;
		if (this.aClass342_64.aClass3_291 == local6) {
			this.aClass3_262 = null;
			return null;
		} else {
			this.aClass3_262 = local6.aClass3_346;
			return local6;
		}
	}
}
