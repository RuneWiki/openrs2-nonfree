import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class Class1 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "J")
	public long aLong30;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!v;")
	public Class1 aClass1_41;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Lclient!v;")
	public Class1 aClass1_42;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
	public final void method635() {
		if (this.aClass1_42 != null) {
			this.aClass1_42.aClass1_41 = this.aClass1_41;
			this.aClass1_41.aClass1_42 = this.aClass1_42;
			this.aClass1_41 = null;
			this.aClass1_42 = null;
		}
	}
}
