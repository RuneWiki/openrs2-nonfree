import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class Class2 {

	@OriginalMember(owner = "client!dfa", name = "d", descriptor = "Lclient!dfa;")
	public Class2 aClass2_299;

	@OriginalMember(owner = "client!dfa", name = "e", descriptor = "J")
	public long aLong278;

	@OriginalMember(owner = "client!dfa", name = "h", descriptor = "Lclient!dfa;")
	public Class2 aClass2_300;

	@OriginalMember(owner = "client!dfa", name = "d", descriptor = "(I)V")
	public final void method8920() {
		if (this.aClass2_299 != null) {
			this.aClass2_299.aClass2_300 = this.aClass2_300;
			this.aClass2_300.aClass2_299 = this.aClass2_299;
			this.aClass2_300 = null;
			this.aClass2_299 = null;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "d", descriptor = "(B)Z")
	public final boolean method8921() {
		return this.aClass2_299 != null;
	}
}
