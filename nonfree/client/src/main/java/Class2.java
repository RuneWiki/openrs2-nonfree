import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YNSWJIIM")
public class Class2 {

	@OriginalMember(owner = "client!YNSWJIIM", name = "a", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!YNSWJIIM", name = "b", descriptor = "Lclient!YNSWJIIM;")
	public Class2 aClass2_41;

	@OriginalMember(owner = "client!YNSWJIIM", name = "c", descriptor = "Lclient!YNSWJIIM;")
	public Class2 aClass2_42;

	@OriginalMember(owner = "client!YNSWJIIM", name = "a", descriptor = "()V")
	public final void method562() {
		if (this.aClass2_42 != null) {
			this.aClass2_42.aClass2_41 = this.aClass2_41;
			this.aClass2_41.aClass2_42 = this.aClass2_42;
			this.aClass2_41 = null;
			this.aClass2_42 = null;
		}
	}
}
