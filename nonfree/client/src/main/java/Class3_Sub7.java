import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "Lclient!vs;")
	public Class3_Sub7 aClass3_Sub7_61;

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "J")
	public long aLong263;

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "Lclient!vs;")
	public Class3_Sub7 aClass3_Sub7_62;

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V")
	public final void method7614() {
		if (this.aClass3_Sub7_62 != null) {
			this.aClass3_Sub7_62.aClass3_Sub7_61 = this.aClass3_Sub7_61;
			this.aClass3_Sub7_61.aClass3_Sub7_62 = this.aClass3_Sub7_62;
			this.aClass3_Sub7_62 = null;
			this.aClass3_Sub7_61 = null;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)Z")
	public final boolean method7616() {
		return this.aClass3_Sub7_62 != null;
	}
}
