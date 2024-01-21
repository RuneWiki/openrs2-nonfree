import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WWONSPNF")
public class Class8 {

	@OriginalMember(owner = "client!WWONSPNF", name = "a", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!WWONSPNF", name = "b", descriptor = "Lclient!WWONSPNF;")
	public Class8 aClass8_41;

	@OriginalMember(owner = "client!WWONSPNF", name = "c", descriptor = "Lclient!WWONSPNF;")
	public Class8 aClass8_42;

	@OriginalMember(owner = "client!WWONSPNF", name = "a", descriptor = "()V")
	public final void method554() {
		if (this.aClass8_42 != null) {
			this.aClass8_42.aClass8_41 = this.aClass8_41;
			this.aClass8_41.aClass8_42 = this.aClass8_42;
			this.aClass8_41 = null;
			this.aClass8_42 = null;
		}
	}
}
