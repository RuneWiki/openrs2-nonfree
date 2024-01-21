import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class Class2 {

	@OriginalMember(owner = "client!g", name = "i", descriptor = "Lclient!g;")
	public Class2 aClass2_93;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "J")
	public long aLong152;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!g;")
	public Class2 aClass2_94;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public final void method1677() {
		if (this.aClass2_93 != null) {
			this.aClass2_93.aClass2_94 = this.aClass2_94;
			this.aClass2_94.aClass2_93 = this.aClass2_93;
			this.aClass2_93 = null;
			this.aClass2_94 = null;
		}
	}
}
