import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!daa", name = "m", descriptor = "J")
	public long aLong303;

	@OriginalMember(owner = "client!daa", name = "n", descriptor = "Lclient!daa;")
	public Class4_Sub7 aClass4_Sub7_61;

	@OriginalMember(owner = "client!daa", name = "q", descriptor = "Lclient!daa;")
	public Class4_Sub7 aClass4_Sub7_62;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)Z")
	public final boolean method7960() {
		return this.aClass4_Sub7_61 != null;
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V")
	public final void method7963() {
		if (this.aClass4_Sub7_61 != null) {
			this.aClass4_Sub7_61.aClass4_Sub7_62 = this.aClass4_Sub7_62;
			this.aClass4_Sub7_62.aClass4_Sub7_61 = this.aClass4_Sub7_61;
			this.aClass4_Sub7_61 = null;
			this.aClass4_Sub7_62 = null;
		}
	}
}
