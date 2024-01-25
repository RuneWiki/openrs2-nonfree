import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "Lclient!sq;")
	public Class1_Sub1 aClass1_Sub1_57;

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "J")
	public long aLong231;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "Lclient!sq;")
	public Class1_Sub1 aClass1_Sub1_58;

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
	public final void method5893() {
		if (this.aClass1_Sub1_57 != null) {
			this.aClass1_Sub1_57.aClass1_Sub1_58 = this.aClass1_Sub1_58;
			this.aClass1_Sub1_58.aClass1_Sub1_57 = this.aClass1_Sub1_57;
			this.aClass1_Sub1_57 = null;
			this.aClass1_Sub1_58 = null;
		}
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)Z")
	public final boolean method5895() {
		return this.aClass1_Sub1_57 != null;
	}
}
