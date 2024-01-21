import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OZVKRYKO")
public class Class1 {

	@OriginalMember(owner = "client!OZVKRYKO", name = "b", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!OZVKRYKO", name = "c", descriptor = "Lclient!OZVKRYKO;")
	public Class1 aClass1_41;

	@OriginalMember(owner = "client!OZVKRYKO", name = "d", descriptor = "Lclient!OZVKRYKO;")
	public Class1 aClass1_42;

	@OriginalMember(owner = "client!OZVKRYKO", name = "a", descriptor = "I")
	private int anInt836 = 9;

	@OriginalMember(owner = "client!OZVKRYKO", name = "a", descriptor = "()V")
	public final void method565() {
		if (this.aClass1_42 != null) {
			this.aClass1_42.aClass1_41 = this.aClass1_41;
			this.aClass1_41.aClass1_42 = this.aClass1_42;
			this.aClass1_41 = null;
			this.aClass1_42 = null;
		}
	}
}
