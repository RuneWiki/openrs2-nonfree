import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!qt", name = "n", descriptor = "Lclient!qt;")
	public Class2_Sub4 aClass2_Sub4_9;

	@OriginalMember(owner = "client!qt", name = "p", descriptor = "Lclient!qt;")
	public Class2_Sub4 aClass2_Sub4_10;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
	public final void method7028() {
		if (this.aClass2_Sub4_9 != null) {
			this.aClass2_Sub4_9.aClass2_Sub4_10 = this.aClass2_Sub4_10;
			this.aClass2_Sub4_10.aClass2_Sub4_9 = this.aClass2_Sub4_9;
			this.aClass2_Sub4_10 = null;
			this.aClass2_Sub4_9 = null;
		}
	}
}
