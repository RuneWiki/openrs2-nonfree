import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "J")
	public long aLong293;

	@OriginalMember(owner = "client!fr", name = "q", descriptor = "Lclient!fr;")
	public Class1_Sub6 aClass1_Sub6_61;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "Lclient!fr;")
	public Class1_Sub6 aClass1_Sub6_62;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
	public final void method7811() {
		if (this.aClass1_Sub6_62 != null) {
			this.aClass1_Sub6_62.aClass1_Sub6_61 = this.aClass1_Sub6_61;
			this.aClass1_Sub6_61.aClass1_Sub6_62 = this.aClass1_Sub6_62;
			this.aClass1_Sub6_61 = null;
			this.aClass1_Sub6_62 = null;
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Z")
	public final boolean method7812() {
		return this.aClass1_Sub6_62 != null;
	}
}
