import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class Class2 {

	@OriginalMember(owner = "client!q", name = "c", descriptor = "Lclient!q;")
	public Class2 aClass2_95;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "Lclient!q;")
	public Class2 aClass2_96;

	@OriginalMember(owner = "client!q", name = "q", descriptor = "J")
	public long aLong82;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
	public final void method1794() {
		if (this.aClass2_95 != null) {
			this.aClass2_95.aClass2_96 = this.aClass2_96;
			this.aClass2_96.aClass2_95 = this.aClass2_95;
			this.aClass2_95 = null;
			this.aClass2_96 = null;
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Z")
	protected final boolean method1795() {
		return this.aClass2_95 != null;
	}
}
