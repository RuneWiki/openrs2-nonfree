import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class Class12_Sub4 extends Class12 {

	@OriginalMember(owner = "client!as", name = "n", descriptor = "Lclient!as;")
	public Class12_Sub4 aClass12_Sub4_59;

	@OriginalMember(owner = "client!as", name = "r", descriptor = "Lclient!as;")
	public Class12_Sub4 aClass12_Sub4_60;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "J")
	public long aLong247;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Z")
	public final boolean method7958() {
		return this.aClass12_Sub4_60 != null;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	public final void method7959() {
		if (this.aClass12_Sub4_60 != null) {
			this.aClass12_Sub4_60.aClass12_Sub4_59 = this.aClass12_Sub4_59;
			this.aClass12_Sub4_59.aClass12_Sub4_60 = this.aClass12_Sub4_60;
			this.aClass12_Sub4_59 = null;
			this.aClass12_Sub4_60 = null;
		}
	}
}
