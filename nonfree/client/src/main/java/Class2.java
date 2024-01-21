import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AJSSLSFA")
public class Class2 {

	@OriginalMember(owner = "client!AJSSLSFA", name = "b", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!AJSSLSFA", name = "c", descriptor = "Lclient!AJSSLSFA;")
	public Class2 aClass2_39;

	@OriginalMember(owner = "client!AJSSLSFA", name = "d", descriptor = "Lclient!AJSSLSFA;")
	public Class2 aClass2_40;

	@OriginalMember(owner = "client!AJSSLSFA", name = "a", descriptor = "B")
	private byte aByte41 = 1;

	@OriginalMember(owner = "client!AJSSLSFA", name = "a", descriptor = "()V")
	public final void method558() {
		if (this.aClass2_40 != null) {
			this.aClass2_40.aClass2_39 = this.aClass2_39;
			this.aClass2_39.aClass2_40 = this.aClass2_40;
			this.aClass2_39 = null;
			this.aClass2_40 = null;
		}
	}
}
