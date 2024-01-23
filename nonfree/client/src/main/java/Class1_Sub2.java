import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "Lclient!rh;")
	public Class1_Sub2 aClass1_Sub2_52;

	@OriginalMember(owner = "client!rh", name = "A", descriptor = "Lclient!rh;")
	public Class1_Sub2 aClass1_Sub2_53;

	@OriginalMember(owner = "client!rh", name = "B", descriptor = "J")
	public long aLong174;

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V")
	public final void method3682() {
		if (this.aClass1_Sub2_53 != null) {
			this.aClass1_Sub2_53.aClass1_Sub2_52 = this.aClass1_Sub2_52;
			this.aClass1_Sub2_52.aClass1_Sub2_53 = this.aClass1_Sub2_53;
			this.aClass1_Sub2_53 = null;
			this.aClass1_Sub2_52 = null;
		}
	}
}
