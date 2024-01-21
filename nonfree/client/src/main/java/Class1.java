import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DOUWNVSH")
public class Class1 {

	@OriginalMember(owner = "client!DOUWNVSH", name = "a", descriptor = "J")
	public long aLong25;

	@OriginalMember(owner = "client!DOUWNVSH", name = "b", descriptor = "Lclient!DOUWNVSH;")
	public Class1 aClass1_41;

	@OriginalMember(owner = "client!DOUWNVSH", name = "c", descriptor = "Lclient!DOUWNVSH;")
	public Class1 aClass1_42;

	@OriginalMember(owner = "client!DOUWNVSH", name = "a", descriptor = "()V")
	public final void method501() {
		if (this.aClass1_42 != null) {
			this.aClass1_42.aClass1_41 = this.aClass1_41;
			this.aClass1_41.aClass1_42 = this.aClass1_42;
			this.aClass1_41 = null;
			this.aClass1_42 = null;
		}
	}
}
