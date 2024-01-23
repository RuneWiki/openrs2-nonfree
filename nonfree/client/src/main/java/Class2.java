import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class Class2 {

	@OriginalMember(owner = "client!g", name = "j", descriptor = "Lclient!g;")
	public Class2 aClass2_211;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "J")
	public long aLong150;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "Lclient!g;")
	public Class2 aClass2_212;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z")
	public final boolean method3313() {
		return this.aClass2_211 != null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public final void method3314() {
		if (this.aClass2_211 != null) {
			this.aClass2_211.aClass2_212 = this.aClass2_212;
			this.aClass2_212.aClass2_211 = this.aClass2_211;
			this.aClass2_212 = null;
			this.aClass2_211 = null;
		}
	}
}
