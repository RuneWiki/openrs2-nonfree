import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class Class12_Sub7 extends Class12 {

	@OriginalMember(owner = "client!pca", name = "m", descriptor = "Lclient!pca;")
	public Class12_Sub7 aClass12_Sub7_9;

	@OriginalMember(owner = "client!pca", name = "t", descriptor = "Lclient!pca;")
	public Class12_Sub7 aClass12_Sub7_10;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)V")
	public final void method8526() {
		if (this.aClass12_Sub7_10 != null) {
			this.aClass12_Sub7_10.aClass12_Sub7_9 = this.aClass12_Sub7_9;
			this.aClass12_Sub7_9.aClass12_Sub7_10 = this.aClass12_Sub7_10;
			this.aClass12_Sub7_9 = null;
			this.aClass12_Sub7_10 = null;
		}
	}
}
