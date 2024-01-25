import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!ge;")
	public Class2_Sub13 aClass2_Sub13_58;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "J")
	public long aLong230;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!ge;")
	public Class2_Sub13 aClass2_Sub13_59;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Z")
	public final boolean method7526() {
		return this.aClass2_Sub13_58 != null;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public final void method7527() {
		if (this.aClass2_Sub13_58 != null) {
			this.aClass2_Sub13_58.aClass2_Sub13_59 = this.aClass2_Sub13_59;
			this.aClass2_Sub13_59.aClass2_Sub13_58 = this.aClass2_Sub13_58;
			this.aClass2_Sub13_59 = null;
			this.aClass2_Sub13_58 = null;
		}
	}
}
