import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "J")
	public long aLong310;

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "Lclient!lm;")
	public Class6_Sub4 aClass6_Sub4_66;

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "Lclient!lm;")
	public Class6_Sub4 aClass6_Sub4_67;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V")
	public final void method9043() {
		if (this.aClass6_Sub4_66 != null) {
			this.aClass6_Sub4_66.aClass6_Sub4_67 = this.aClass6_Sub4_67;
			this.aClass6_Sub4_67.aClass6_Sub4_66 = this.aClass6_Sub4_66;
			this.aClass6_Sub4_66 = null;
			this.aClass6_Sub4_67 = null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)Z")
	public final boolean method9044() {
		return this.aClass6_Sub4_66 != null;
	}
}
