import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class Class3 {

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "Lclient!faa;")
	public Class3 aClass3_287;

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "J")
	public long aLong262;

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "Lclient!faa;")
	public Class3 aClass3_288;

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)V")
	public final void method8412() {
		if (this.aClass3_287 != null) {
			this.aClass3_287.aClass3_288 = this.aClass3_288;
			this.aClass3_288.aClass3_287 = this.aClass3_287;
			this.aClass3_287 = null;
			this.aClass3_288 = null;
		}
	}

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "(I)Z")
	public final boolean method8414() {
		return this.aClass3_287 != null;
	}
}
