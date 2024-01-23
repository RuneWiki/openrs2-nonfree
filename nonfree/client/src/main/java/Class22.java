import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class Class22 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!vc;")
	public Class22 aClass22_9;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!vc;")
	public Class22 aClass22_10;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public final void method946() {
		if (this.aClass22_10 != null) {
			this.aClass22_10.aClass22_9 = this.aClass22_9;
			this.aClass22_9.aClass22_10 = this.aClass22_10;
			this.aClass22_9 = null;
			this.aClass22_10 = null;
		}
	}
}
