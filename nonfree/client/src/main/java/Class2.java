import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class Class2 {

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "J")
	public long aLong96;

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "Lclient!nd;")
	public Class2 aClass2_97;

	@OriginalMember(owner = "client!nd", name = "T", descriptor = "Lclient!nd;")
	public Class2 aClass2_98;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)Z")
	protected final boolean method1817() {
		return this.aClass2_98 != null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public final void method1820() {
		if (this.aClass2_98 != null) {
			this.aClass2_98.aClass2_97 = this.aClass2_97;
			this.aClass2_97.aClass2_98 = this.aClass2_98;
			this.aClass2_98 = null;
			this.aClass2_97 = null;
		}
	}
}
