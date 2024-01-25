import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!qt", name = "o", descriptor = "Lclient!qt;")
	public Class2_Sub6 aClass2_Sub6_7;

	@OriginalMember(owner = "client!qt", name = "q", descriptor = "Lclient!qt;")
	public Class2_Sub6 aClass2_Sub6_8;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)V")
	public final void method5184() {
		if (this.aClass2_Sub6_7 != null) {
			this.aClass2_Sub6_7.aClass2_Sub6_8 = this.aClass2_Sub6_8;
			this.aClass2_Sub6_8.aClass2_Sub6_7 = this.aClass2_Sub6_7;
			this.aClass2_Sub6_8 = null;
			this.aClass2_Sub6_7 = null;
		}
	}
}
