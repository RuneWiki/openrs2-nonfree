import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class Class3 {

	@OriginalMember(owner = "client!no", name = "c", descriptor = "Lclient!no;")
	public Class3 aClass3_299;

	@OriginalMember(owner = "client!no", name = "e", descriptor = "Lclient!no;")
	public Class3 aClass3_300;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "J")
	public long aLong277;

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(I)V")
	public final void method8682() {
		if (this.aClass3_299 != null) {
			this.aClass3_299.aClass3_300 = this.aClass3_300;
			this.aClass3_300.aClass3_299 = this.aClass3_299;
			this.aClass3_300 = null;
			this.aClass3_299 = null;
		}
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(Z)Z")
	public final boolean method8683() {
		return this.aClass3_299 != null;
	}
}
