import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "Lclient!ff;")
	public Class1_Sub2 aClass1_Sub2_59;

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "J")
	public long aLong228;

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "Lclient!ff;")
	public Class1_Sub2 aClass1_Sub2_60;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)Z")
	public final boolean method7389() {
		return this.aClass1_Sub2_60 != null;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	public final void method7390() {
		if (this.aClass1_Sub2_60 != null) {
			this.aClass1_Sub2_60.aClass1_Sub2_59 = this.aClass1_Sub2_59;
			this.aClass1_Sub2_59.aClass1_Sub2_60 = this.aClass1_Sub2_60;
			this.aClass1_Sub2_59 = null;
			this.aClass1_Sub2_60 = null;
		}
	}
}
