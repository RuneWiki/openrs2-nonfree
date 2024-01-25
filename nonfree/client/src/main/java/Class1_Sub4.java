import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "Lclient!ra;")
	public Class1_Sub4 aClass1_Sub4_61;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Lclient!ra;")
	public Class1_Sub4 aClass1_Sub4_62;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "J")
	public long aLong214;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)Z")
	public final boolean method5630() {
		return this.aClass1_Sub4_62 != null;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V")
	public final void method5632() {
		if (this.aClass1_Sub4_62 != null) {
			this.aClass1_Sub4_62.aClass1_Sub4_61 = this.aClass1_Sub4_61;
			this.aClass1_Sub4_61.aClass1_Sub4_62 = this.aClass1_Sub4_62;
			this.aClass1_Sub4_61 = null;
			this.aClass1_Sub4_62 = null;
		}
	}
}
