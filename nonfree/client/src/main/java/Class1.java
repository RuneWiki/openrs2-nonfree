import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class Class1 {

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "J")
	public long aLong215;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!mh;")
	public Class1 aClass1_247;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "Lclient!mh;")
	public Class1 aClass1_248;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	public final void method5710() {
		if (this.aClass1_248 != null) {
			this.aClass1_248.aClass1_247 = this.aClass1_247;
			this.aClass1_247.aClass1_248 = this.aClass1_248;
			this.aClass1_247 = null;
			this.aClass1_248 = null;
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)Z")
	public final boolean method5711() {
		return this.aClass1_248 != null;
	}
}
