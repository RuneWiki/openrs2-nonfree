import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "Lclient!ds;")
	public Class1_Sub2 aClass1_Sub2_61;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "Lclient!ds;")
	public Class1_Sub2 aClass1_Sub2_62;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "J")
	public long aLong213;

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)Z")
	public final boolean method5783() {
		return this.aClass1_Sub2_61 != null;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
	public final void method5784() {
		if (this.aClass1_Sub2_61 != null) {
			this.aClass1_Sub2_61.aClass1_Sub2_62 = this.aClass1_Sub2_62;
			this.aClass1_Sub2_62.aClass1_Sub2_61 = this.aClass1_Sub2_61;
			this.aClass1_Sub2_61 = null;
			this.aClass1_Sub2_62 = null;
		}
	}
}
