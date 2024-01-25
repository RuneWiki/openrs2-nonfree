import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class Class1 {

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "Lclient!pca;")
	public Class1 aClass1_285;

	@OriginalMember(owner = "client!pca", name = "e", descriptor = "Lclient!pca;")
	public Class1 aClass1_286;

	@OriginalMember(owner = "client!pca", name = "g", descriptor = "J")
	public long aLong301;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)Z")
	public final boolean method7856() {
		return this.aClass1_286 != null;
	}

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "(I)V")
	public final void method7859() {
		if (this.aClass1_286 != null) {
			this.aClass1_286.aClass1_285 = this.aClass1_285;
			this.aClass1_285.aClass1_286 = this.aClass1_286;
			this.aClass1_286 = null;
			this.aClass1_285 = null;
		}
	}
}
