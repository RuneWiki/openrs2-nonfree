import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class Class1 {

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "J")
	public long aLong425;

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "Lclient!jca;")
	public Class1 aClass1_285;

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "Lclient!jca;")
	public Class1 aClass1_286;

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(Z)Z")
	public final boolean method7877() {
		return this.aClass1_285 != null;
	}

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "(Z)V")
	public final void method7878() {
		if (this.aClass1_285 != null) {
			this.aClass1_285.aClass1_286 = this.aClass1_286;
			this.aClass1_286.aClass1_285 = this.aClass1_285;
			this.aClass1_286 = null;
			this.aClass1_285 = null;
		}
	}
}
