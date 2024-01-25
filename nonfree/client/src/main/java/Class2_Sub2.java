import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "Lclient!ww;")
	public Class2_Sub2 aClass2_Sub2_66;

	@OriginalMember(owner = "client!ww", name = "n", descriptor = "J")
	public long aLong269;

	@OriginalMember(owner = "client!ww", name = "q", descriptor = "Lclient!ww;")
	public Class2_Sub2 aClass2_Sub2_67;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V")
	public final void method8271() {
		if (this.aClass2_Sub2_66 != null) {
			this.aClass2_Sub2_66.aClass2_Sub2_67 = this.aClass2_Sub2_67;
			this.aClass2_Sub2_67.aClass2_Sub2_66 = this.aClass2_Sub2_66;
			this.aClass2_Sub2_66 = null;
			this.aClass2_Sub2_67 = null;
		}
	}

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "(I)Z")
	public final boolean method8272() {
		return this.aClass2_Sub2_66 != null;
	}
}
