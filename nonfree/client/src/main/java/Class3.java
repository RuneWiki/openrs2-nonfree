import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LTTSKENL")
public class Class3 {

	@OriginalMember(owner = "client!LTTSKENL", name = "a", descriptor = "J")
	public long aLong26;

	@OriginalMember(owner = "client!LTTSKENL", name = "b", descriptor = "Lclient!LTTSKENL;")
	public Class3 aClass3_41;

	@OriginalMember(owner = "client!LTTSKENL", name = "c", descriptor = "Lclient!LTTSKENL;")
	public Class3 aClass3_42;

	@OriginalMember(owner = "client!LTTSKENL", name = "a", descriptor = "()V")
	public final void method514() {
		if (this.aClass3_42 != null) {
			this.aClass3_42.aClass3_41 = this.aClass3_41;
			this.aClass3_41.aClass3_42 = this.aClass3_42;
			this.aClass3_41 = null;
			this.aClass3_42 = null;
		}
	}
}
