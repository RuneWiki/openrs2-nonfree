import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "J")
	public long aLong275;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!ab;")
	public Class3_Sub1 aClass3_Sub1_66;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!ab;")
	public Class3_Sub1 aClass3_Sub1_67;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public final void method8621() {
		if (this.aClass3_Sub1_67 != null) {
			this.aClass3_Sub1_67.aClass3_Sub1_66 = this.aClass3_Sub1_66;
			this.aClass3_Sub1_66.aClass3_Sub1_67 = this.aClass3_Sub1_67;
			this.aClass3_Sub1_66 = null;
			this.aClass3_Sub1_67 = null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z")
	public final boolean method8623() {
		return this.aClass3_Sub1_67 != null;
	}
}
