import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PKVMXVTO")
public class Class1 {

	@OriginalMember(owner = "client!PKVMXVTO", name = "b", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!PKVMXVTO", name = "c", descriptor = "Lclient!PKVMXVTO;")
	public Class1 aClass1_41;

	@OriginalMember(owner = "client!PKVMXVTO", name = "d", descriptor = "Lclient!PKVMXVTO;")
	public Class1 aClass1_42;

	@OriginalMember(owner = "client!PKVMXVTO", name = "a", descriptor = "Z")
	private boolean aBoolean206 = true;

	@OriginalMember(owner = "client!PKVMXVTO", name = "a", descriptor = "()V")
	public final void method526() {
		if (this.aClass1_42 != null) {
			this.aClass1_42.aClass1_41 = this.aClass1_41;
			this.aClass1_41.aClass1_42 = this.aClass1_42;
			this.aClass1_41 = null;
			this.aClass1_42 = null;
		}
	}
}
