import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class Class5 {

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "J")
	public long aLong118;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Lclient!qc;")
	public Class5 aClass5_105;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "Lclient!qc;")
	public Class5 aClass5_106;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public final void method2002() {
		if (this.aClass5_105 != null) {
			this.aClass5_105.aClass5_106 = this.aClass5_106;
			this.aClass5_106.aClass5_105 = this.aClass5_105;
			this.aClass5_106 = null;
			this.aClass5_105 = null;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Z")
	public final boolean method2004() {
		return this.aClass5_105 != null;
	}
}
