import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Lclient!ie;")
	public Class2_Sub5 aClass2_Sub5_57;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!ie;")
	public Class2_Sub5 aClass2_Sub5_58;

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "J")
	public long aLong211;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
	public final void method5534() {
		if (this.aClass2_Sub5_57 != null) {
			this.aClass2_Sub5_57.aClass2_Sub5_58 = this.aClass2_Sub5_58;
			this.aClass2_Sub5_58.aClass2_Sub5_57 = this.aClass2_Sub5_57;
			this.aClass2_Sub5_57 = null;
			this.aClass2_Sub5_58 = null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)Z")
	public final boolean method5535() {
		return this.aClass2_Sub5_57 != null;
	}
}
