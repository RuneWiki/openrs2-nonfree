import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class220 {

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Lclient!pca;")
	private Class1 aClass1_160;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Lclient!wba;")
	private Class353 aClass353_36;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class220() {
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!wba;)V")
	public Class220(@OriginalArg(0) Class353 arg0) {
		this.aClass353_36 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)Lclient!pca;")
	public Class1 method4408() {
		@Pc(8) Class1 local8 = this.aClass353_36.aClass1_271.aClass1_285;
		if (local8 == this.aClass353_36.aClass1_271) {
			this.aClass1_160 = null;
			return null;
		} else {
			this.aClass1_160 = local8.aClass1_285;
			return local8;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)Lclient!pca;")
	public Class1 method4410() {
		@Pc(6) Class1 local6 = this.aClass1_160;
		if (this.aClass353_36.aClass1_271 == local6) {
			this.aClass1_160 = null;
			return null;
		} else {
			this.aClass1_160 = local6.aClass1_285;
			return local6;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!wba;)V")
	public void method4411(@OriginalArg(1) Class353 arg0) {
		this.aClass353_36 = arg0;
	}
}
