import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "J")
	public long aLong196;

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "Lclient!qm;")
	public Class1_Sub2 aClass1_Sub2_74;

	@OriginalMember(owner = "client!qm", name = "w", descriptor = "Lclient!qm;")
	public Class1_Sub2 aClass1_Sub2_75;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)Z")
	public final boolean method4487() {
		return this.aClass1_Sub2_74 != null;
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)V")
	public final void method4493() {
		if (this.aClass1_Sub2_74 != null) {
			this.aClass1_Sub2_74.aClass1_Sub2_75 = this.aClass1_Sub2_75;
			this.aClass1_Sub2_75.aClass1_Sub2_74 = this.aClass1_Sub2_74;
			this.aClass1_Sub2_74 = null;
			this.aClass1_Sub2_75 = null;
		}
	}
}
