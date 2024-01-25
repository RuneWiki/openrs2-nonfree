import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "Lclient!rv;")
	public Class3_Sub7 aClass3_Sub7_66;

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "J")
	public long aLong336;

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "Lclient!rv;")
	public Class3_Sub7 aClass3_Sub7_67;

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)Z")
	public final boolean method9249() {
		return this.aClass3_Sub7_66 != null;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)V")
	public final void method9251() {
		if (this.aClass3_Sub7_66 != null) {
			this.aClass3_Sub7_66.aClass3_Sub7_67 = this.aClass3_Sub7_67;
			this.aClass3_Sub7_67.aClass3_Sub7_66 = this.aClass3_Sub7_66;
			this.aClass3_Sub7_66 = null;
			this.aClass3_Sub7_67 = null;
		}
	}
}
