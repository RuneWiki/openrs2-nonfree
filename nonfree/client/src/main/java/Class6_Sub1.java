import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "Lclient!bp;")
	public Class6_Sub1 aClass6_Sub1_55;

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "J")
	public long aLong218;

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "Lclient!bp;")
	public Class6_Sub1 aClass6_Sub1_56;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)Z")
	public final boolean method5982() {
		return this.aClass6_Sub1_55 != null;
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(B)V")
	public final void method5984() {
		if (this.aClass6_Sub1_55 != null) {
			this.aClass6_Sub1_55.aClass6_Sub1_56 = this.aClass6_Sub1_56;
			this.aClass6_Sub1_56.aClass6_Sub1_55 = this.aClass6_Sub1_55;
			this.aClass6_Sub1_56 = null;
			this.aClass6_Sub1_55 = null;
		}
	}
}
