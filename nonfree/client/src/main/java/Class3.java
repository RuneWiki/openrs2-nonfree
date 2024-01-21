import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MRGQMKFG")
public class Class3 {

	@OriginalMember(owner = "client!MRGQMKFG", name = "a", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!MRGQMKFG", name = "b", descriptor = "Lclient!MRGQMKFG;")
	public Class3 aClass3_41;

	@OriginalMember(owner = "client!MRGQMKFG", name = "c", descriptor = "Lclient!MRGQMKFG;")
	public Class3 aClass3_42;

	@OriginalMember(owner = "client!MRGQMKFG", name = "a", descriptor = "()V")
	public final void method547() {
		if (this.aClass3_42 != null) {
			this.aClass3_42.aClass3_41 = this.aClass3_41;
			this.aClass3_41.aClass3_42 = this.aClass3_42;
			this.aClass3_41 = null;
			this.aClass3_42 = null;
		}
	}
}
