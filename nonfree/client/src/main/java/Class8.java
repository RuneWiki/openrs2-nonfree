import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KMUPFLXI")
public class Class8 {

	@OriginalMember(owner = "client!KMUPFLXI", name = "a", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!KMUPFLXI", name = "b", descriptor = "Lclient!KMUPFLXI;")
	public Class8 aClass8_41;

	@OriginalMember(owner = "client!KMUPFLXI", name = "c", descriptor = "Lclient!KMUPFLXI;")
	public Class8 aClass8_42;

	@OriginalMember(owner = "client!KMUPFLXI", name = "a", descriptor = "()V")
	public final void method546() {
		if (this.aClass8_42 != null) {
			this.aClass8_42.aClass8_41 = this.aClass8_41;
			this.aClass8_41.aClass8_42 = this.aClass8_42;
			this.aClass8_41 = null;
			this.aClass8_42 = null;
		}
	}
}
