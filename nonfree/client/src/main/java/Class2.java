import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class Class2 {

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "J")
	public long aLong89;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Lclient!aa;")
	public Class2 aClass2_103;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Lclient!aa;")
	public Class2 aClass2_104;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)Z")
	protected final boolean method2070() {
		return this.aClass2_103 != null;
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
	public final void method2073() {
		if (this.aClass2_103 != null) {
			this.aClass2_103.aClass2_104 = this.aClass2_104;
			this.aClass2_104.aClass2_103 = this.aClass2_103;
			this.aClass2_103 = null;
			this.aClass2_104 = null;
		}
	}
}
