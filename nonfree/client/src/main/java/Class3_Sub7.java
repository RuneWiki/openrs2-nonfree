import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "Lclient!ob;")
	public Class3_Sub7 aClass3_Sub7_63;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Lclient!ob;")
	public Class3_Sub7 aClass3_Sub7_64;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "J")
	public long aLong251;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	public final void method7907() {
		if (this.aClass3_Sub7_64 != null) {
			this.aClass3_Sub7_64.aClass3_Sub7_63 = this.aClass3_Sub7_63;
			this.aClass3_Sub7_63.aClass3_Sub7_64 = this.aClass3_Sub7_64;
			this.aClass3_Sub7_63 = null;
			this.aClass3_Sub7_64 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)Z")
	public final boolean method7910() {
		return this.aClass3_Sub7_64 != null;
	}
}
