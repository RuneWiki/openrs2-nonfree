import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class Class1 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!sc;")
	public Class1 aClass1_127;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Lclient!sc;")
	public Class1 aClass1_128;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "J")
	public long aLong162;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public final void method2039() {
		if (this.aClass1_127 != null) {
			this.aClass1_127.aClass1_128 = this.aClass1_128;
			this.aClass1_128.aClass1_127 = this.aClass1_127;
			this.aClass1_127 = null;
			this.aClass1_128 = null;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Z")
	public final boolean method2040() {
		return this.aClass1_127 != null;
	}
}
