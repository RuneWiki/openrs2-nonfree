import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MXUYAYVV")
public class Class1 {

	@OriginalMember(owner = "client!MXUYAYVV", name = "a", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!MXUYAYVV", name = "b", descriptor = "Lclient!MXUYAYVV;")
	public Class1 aClass1_41;

	@OriginalMember(owner = "client!MXUYAYVV", name = "c", descriptor = "Lclient!MXUYAYVV;")
	public Class1 aClass1_42;

	@OriginalMember(owner = "client!MXUYAYVV", name = "a", descriptor = "()V")
	public final void method510() {
		if (this.aClass1_42 != null) {
			this.aClass1_42.aClass1_41 = this.aClass1_41;
			this.aClass1_41.aClass1_42 = this.aClass1_42;
			this.aClass1_41 = null;
			this.aClass1_42 = null;
		}
	}
}
