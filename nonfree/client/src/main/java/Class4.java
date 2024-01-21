import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QEPVMESX")
public class Class4 {

	@OriginalMember(owner = "client!QEPVMESX", name = "b", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!QEPVMESX", name = "c", descriptor = "Lclient!QEPVMESX;")
	public Class4 aClass4_41;

	@OriginalMember(owner = "client!QEPVMESX", name = "d", descriptor = "Lclient!QEPVMESX;")
	public Class4 aClass4_42;

	@OriginalMember(owner = "client!QEPVMESX", name = "a", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!QEPVMESX", name = "a", descriptor = "()V")
	public final void method572() {
		if (this.aClass4_42 != null) {
			this.aClass4_42.aClass4_41 = this.aClass4_41;
			this.aClass4_41.aClass4_42 = this.aClass4_42;
			this.aClass4_41 = null;
			this.aClass4_42 = null;
		}
	}
}
