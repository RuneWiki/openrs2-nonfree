import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SSWDZUWQ")
public class Class6 {

	@OriginalMember(owner = "client!SSWDZUWQ", name = "b", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!SSWDZUWQ", name = "c", descriptor = "Lclient!SSWDZUWQ;")
	public Class6 aClass6_41;

	@OriginalMember(owner = "client!SSWDZUWQ", name = "d", descriptor = "Lclient!SSWDZUWQ;")
	public Class6 aClass6_42;

	@OriginalMember(owner = "client!SSWDZUWQ", name = "a", descriptor = "I")
	private int anInt816 = 17532;

	@OriginalMember(owner = "client!SSWDZUWQ", name = "a", descriptor = "()V")
	public final void method548() {
		if (this.aClass6_42 != null) {
			this.aClass6_42.aClass6_41 = this.aClass6_41;
			this.aClass6_41.aClass6_42 = this.aClass6_42;
			this.aClass6_41 = null;
			this.aClass6_42 = null;
		}
	}
}
