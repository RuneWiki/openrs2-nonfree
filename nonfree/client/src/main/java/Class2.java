import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class Class2 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "J")
	public long aLong134;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "Lclient!ub;")
	public Class2 aClass2_209;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "Lclient!ub;")
	public Class2 aClass2_210;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Z")
	public final boolean method3003() {
		return this.aClass2_209 != null;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	public final void method3004() {
		if (this.aClass2_209 != null) {
			this.aClass2_209.aClass2_210 = this.aClass2_210;
			this.aClass2_210.aClass2_209 = this.aClass2_209;
			this.aClass2_209 = null;
			this.aClass2_210 = null;
		}
	}
}
