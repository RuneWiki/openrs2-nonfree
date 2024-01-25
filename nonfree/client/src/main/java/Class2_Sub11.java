import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "Lclient!fs;")
	public Class2_Sub11 aClass2_Sub11_61;

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "Lclient!fs;")
	public Class2_Sub11 aClass2_Sub11_62;

	@OriginalMember(owner = "client!fs", name = "C", descriptor = "J")
	public long aLong212;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
	public final void method5914() {
		if (this.aClass2_Sub11_61 != null) {
			this.aClass2_Sub11_61.aClass2_Sub11_62 = this.aClass2_Sub11_62;
			this.aClass2_Sub11_62.aClass2_Sub11_61 = this.aClass2_Sub11_61;
			this.aClass2_Sub11_62 = null;
			this.aClass2_Sub11_61 = null;
		}
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)Z")
	public final boolean method5917() {
		return this.aClass2_Sub11_61 != null;
	}
}
