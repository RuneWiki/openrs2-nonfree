import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class Class2 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!ib;")
	public Class2 aClass2_209;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Lclient!ib;")
	public Class2 aClass2_210;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "J")
	public long aLong149;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Z")
	public final boolean method3251() {
		return this.aClass2_210 != null;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
	public final void method3254() {
		if (this.aClass2_210 != null) {
			this.aClass2_210.aClass2_209 = this.aClass2_209;
			this.aClass2_209.aClass2_210 = this.aClass2_210;
			this.aClass2_209 = null;
			this.aClass2_210 = null;
		}
	}
}
