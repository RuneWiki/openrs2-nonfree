import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "Lclient!ut;")
	public Class1_Sub2 aClass1_Sub2_57;

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "J")
	public long aLong221;

	@OriginalMember(owner = "client!ut", name = "u", descriptor = "Lclient!ut;")
	public Class1_Sub2 aClass1_Sub2_58;

	static {
		new Class190("", 73);
	}

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)V")
	public final void method5883() {
		if (this.aClass1_Sub2_58 != null) {
			this.aClass1_Sub2_58.aClass1_Sub2_57 = this.aClass1_Sub2_57;
			this.aClass1_Sub2_57.aClass1_Sub2_58 = this.aClass1_Sub2_58;
			this.aClass1_Sub2_58 = null;
			this.aClass1_Sub2_57 = null;
		}
	}

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "(I)Z")
	public final boolean method5884() {
		return this.aClass1_Sub2_58 != null;
	}
}
