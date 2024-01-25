import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "Lclient!tm;")
	public Class4_Sub1 aClass4_Sub1_61;

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "Lclient!tm;")
	public Class4_Sub1 aClass4_Sub1_62;

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "J")
	public long aLong254;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
	public final void method5555() {
		if (this.aClass4_Sub1_62 != null) {
			this.aClass4_Sub1_62.aClass4_Sub1_61 = this.aClass4_Sub1_61;
			this.aClass4_Sub1_61.aClass4_Sub1_62 = this.aClass4_Sub1_62;
			this.aClass4_Sub1_62 = null;
			this.aClass4_Sub1_61 = null;
		}
	}

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)Z")
	public final boolean method5556() {
		return this.aClass4_Sub1_62 != null;
	}
}
