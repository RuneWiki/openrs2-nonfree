import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "J")
	public long aLong260;

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "Lclient!pp;")
	public Class2_Sub3 aClass2_Sub3_61;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "Lclient!pp;")
	public Class2_Sub3 aClass2_Sub3_62;

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)Z")
	public final boolean method7766() {
		return this.aClass2_Sub3_62 != null;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
	public final void method7767() {
		if (this.aClass2_Sub3_62 != null) {
			this.aClass2_Sub3_62.aClass2_Sub3_61 = this.aClass2_Sub3_61;
			this.aClass2_Sub3_61.aClass2_Sub3_62 = this.aClass2_Sub3_62;
			this.aClass2_Sub3_61 = null;
			this.aClass2_Sub3_62 = null;
		}
	}
}
