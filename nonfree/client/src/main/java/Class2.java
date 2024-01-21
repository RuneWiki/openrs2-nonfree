import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class Class2 {

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!bd;")
	public Class2 aClass2_127;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Lclient!bd;")
	public Class2 aClass2_128;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "J")
	public long aLong100;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public final void method2053() {
		if (this.aClass2_128 != null) {
			this.aClass2_128.aClass2_127 = this.aClass2_127;
			this.aClass2_127.aClass2_128 = this.aClass2_128;
			this.aClass2_128 = null;
			this.aClass2_127 = null;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Z")
	public final boolean method2055() {
		return this.aClass2_128 != null;
	}
}
