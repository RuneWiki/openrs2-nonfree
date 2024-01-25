import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "Lclient!mk;")
	public Class2_Sub2 aClass2_Sub2_61;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "Lclient!mk;")
	public Class2_Sub2 aClass2_Sub2_62;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "J")
	public long aLong269;

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
	public final void method7659() {
		if (this.aClass2_Sub2_61 != null) {
			this.aClass2_Sub2_61.aClass2_Sub2_62 = this.aClass2_Sub2_62;
			this.aClass2_Sub2_62.aClass2_Sub2_61 = this.aClass2_Sub2_61;
			this.aClass2_Sub2_62 = null;
			this.aClass2_Sub2_61 = null;
		}
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)Z")
	public final boolean method7662() {
		return this.aClass2_Sub2_61 != null;
	}
}
