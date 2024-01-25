import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!rba", name = "t", descriptor = "Lclient!rba;")
	public Class5_Sub1 aClass5_Sub1_64;

	@OriginalMember(owner = "client!rba", name = "m", descriptor = "Lclient!rba;")
	public Class5_Sub1 aClass5_Sub1_65;

	@OriginalMember(owner = "client!rba", name = "s", descriptor = "J")
	public long aLong298;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Z)Z")
	public final boolean method8954() {
		return this.aClass5_Sub1_64 != null;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
	public final void method8955() {
		if (this.aClass5_Sub1_64 != null) {
			this.aClass5_Sub1_64.aClass5_Sub1_65 = this.aClass5_Sub1_65;
			this.aClass5_Sub1_65.aClass5_Sub1_64 = this.aClass5_Sub1_64;
			this.aClass5_Sub1_65 = null;
			this.aClass5_Sub1_64 = null;
		}
	}
}
