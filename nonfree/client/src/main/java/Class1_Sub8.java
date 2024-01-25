import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!paa", name = "j", descriptor = "J")
	public long aLong263;

	@OriginalMember(owner = "client!paa", name = "o", descriptor = "Lclient!paa;")
	public Class1_Sub8 aClass1_Sub8_61;

	@OriginalMember(owner = "client!paa", name = "s", descriptor = "Lclient!paa;")
	public Class1_Sub8 aClass1_Sub8_62;

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)V")
	public final void method7712() {
		if (this.aClass1_Sub8_61 != null) {
			this.aClass1_Sub8_61.aClass1_Sub8_62 = this.aClass1_Sub8_62;
			this.aClass1_Sub8_62.aClass1_Sub8_61 = this.aClass1_Sub8_61;
			this.aClass1_Sub8_62 = null;
			this.aClass1_Sub8_61 = null;
		}
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)Z")
	public final boolean method7713() {
		return this.aClass1_Sub8_61 != null;
	}
}
