import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!hb", name = "db", descriptor = "Lclient!hb;")
	public Class2_Sub1 aClass2_Sub1_61;

	@OriginalMember(owner = "client!hb", name = "ib", descriptor = "Lclient!hb;")
	public Class2_Sub1 aClass2_Sub1_62;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public final void method1773() {
		if (this.aClass2_Sub1_62 != null) {
			this.aClass2_Sub1_62.aClass2_Sub1_61 = this.aClass2_Sub1_61;
			this.aClass2_Sub1_61.aClass2_Sub1_62 = this.aClass2_Sub1_62;
			this.aClass2_Sub1_62 = null;
			this.aClass2_Sub1_61 = null;
		}
	}
}
