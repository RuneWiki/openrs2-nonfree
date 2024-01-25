import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "Lclient!dg;")
	public Class5_Sub4 aClass5_Sub4_66;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "J")
	public long aLong273;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "Lclient!dg;")
	public Class5_Sub4 aClass5_Sub4_67;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)Z")
	public final boolean method8738() {
		return this.aClass5_Sub4_66 != null;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V")
	public final void method8741() {
		if (this.aClass5_Sub4_66 != null) {
			this.aClass5_Sub4_66.aClass5_Sub4_67 = this.aClass5_Sub4_67;
			this.aClass5_Sub4_67.aClass5_Sub4_66 = this.aClass5_Sub4_66;
			this.aClass5_Sub4_67 = null;
			this.aClass5_Sub4_66 = null;
		}
	}
}
