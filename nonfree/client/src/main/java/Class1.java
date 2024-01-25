import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class Class1 {

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "Lclient!rp;")
	public Class1 aClass1_285;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "J")
	public long aLong268;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "Lclient!rp;")
	public Class1 aClass1_286;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)Z")
	public final boolean method7907() {
		return this.aClass1_285 != null;
	}

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "(I)V")
	public final void method7908() {
		if (this.aClass1_285 != null) {
			this.aClass1_285.aClass1_286 = this.aClass1_286;
			this.aClass1_286.aClass1_285 = this.aClass1_285;
			this.aClass1_286 = null;
			this.aClass1_285 = null;
		}
	}
}
