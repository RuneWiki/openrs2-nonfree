import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class Class1 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "J")
	public long aLong23;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Lclient!t;")
	public Class1 aClass1_41;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "Lclient!t;")
	public Class1 aClass1_42;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public final void method478() {
		if (this.aClass1_42 != null) {
			this.aClass1_42.aClass1_41 = this.aClass1_41;
			this.aClass1_41.aClass1_42 = this.aClass1_42;
			this.aClass1_41 = null;
			this.aClass1_42 = null;
		}
	}
}
