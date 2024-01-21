import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class Class1 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "J")
	public long aLong130;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!ce;")
	public Class1 aClass1_127;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Lclient!ce;")
	public Class1 aClass1_128;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Z")
	public final boolean method2049() {
		return this.aClass1_128 != null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public final void method2050() {
		if (this.aClass1_128 != null) {
			this.aClass1_128.aClass1_127 = this.aClass1_127;
			this.aClass1_127.aClass1_128 = this.aClass1_128;
			this.aClass1_127 = null;
			this.aClass1_128 = null;
		}
	}
}
