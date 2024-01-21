import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JBHJGXME")
public class Class5 {

	@OriginalMember(owner = "client!JBHJGXME", name = "a", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!JBHJGXME", name = "b", descriptor = "Lclient!JBHJGXME;")
	public Class5 aClass5_41;

	@OriginalMember(owner = "client!JBHJGXME", name = "c", descriptor = "Lclient!JBHJGXME;")
	public Class5 aClass5_42;

	@OriginalMember(owner = "client!JBHJGXME", name = "a", descriptor = "()V")
	public final void method542() {
		if (this.aClass5_42 != null) {
			this.aClass5_42.aClass5_41 = this.aClass5_41;
			this.aClass5_41.aClass5_42 = this.aClass5_42;
			this.aClass5_41 = null;
			this.aClass5_42 = null;
		}
	}
}
