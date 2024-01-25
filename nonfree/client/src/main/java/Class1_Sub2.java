import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "J")
	public long aLong213;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "Lclient!sp;")
	public Class1_Sub2 aClass1_Sub2_57;

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "Lclient!sp;")
	public Class1_Sub2 aClass1_Sub2_58;

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "(I)Z")
	public final boolean method5810() {
		return this.aClass1_Sub2_58 != null;
	}

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "(I)V")
	public final void method5813() {
		if (this.aClass1_Sub2_58 != null) {
			this.aClass1_Sub2_58.aClass1_Sub2_57 = this.aClass1_Sub2_57;
			this.aClass1_Sub2_57.aClass1_Sub2_58 = this.aClass1_Sub2_58;
			this.aClass1_Sub2_57 = null;
			this.aClass1_Sub2_58 = null;
		}
	}
}
