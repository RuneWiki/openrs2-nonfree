import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XNCSKJMM")
public class Class1 {

	@OriginalMember(owner = "client!XNCSKJMM", name = "c", descriptor = "J")
	public long aLong24;

	@OriginalMember(owner = "client!XNCSKJMM", name = "d", descriptor = "Lclient!XNCSKJMM;")
	public Class1 aClass1_41;

	@OriginalMember(owner = "client!XNCSKJMM", name = "e", descriptor = "Lclient!XNCSKJMM;")
	public Class1 aClass1_42;

	@OriginalMember(owner = "client!XNCSKJMM", name = "a", descriptor = "I")
	private int anInt730 = 344;

	@OriginalMember(owner = "client!XNCSKJMM", name = "b", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!XNCSKJMM", name = "a", descriptor = "()V")
	public final void method507() {
		if (this.aClass1_42 != null) {
			this.aClass1_42.aClass1_41 = this.aClass1_41;
			this.aClass1_41.aClass1_42 = this.aClass1_42;
			this.aClass1_41 = null;
			this.aClass1_42 = null;
		}
	}
}
