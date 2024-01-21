import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class Class5 {

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!ob;")
	public Class5 aClass5_127;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!ob;")
	public Class5 aClass5_128;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "J")
	public long aLong100;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Z")
	public final boolean method2187() {
		return this.aClass5_128 != null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public final void method2189() {
		if (this.aClass5_128 != null) {
			this.aClass5_128.aClass5_127 = this.aClass5_127;
			this.aClass5_127.aClass5_128 = this.aClass5_128;
			this.aClass5_128 = null;
			this.aClass5_127 = null;
		}
	}
}
