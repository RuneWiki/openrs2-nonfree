import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class Class8_Sub5 extends Class8 {

	@OriginalMember(owner = "client!lha", name = "k", descriptor = "J")
	public long aLong275;

	@OriginalMember(owner = "client!lha", name = "o", descriptor = "Lclient!lha;")
	public Class8_Sub5 aClass8_Sub5_66;

	@OriginalMember(owner = "client!lha", name = "s", descriptor = "Lclient!lha;")
	public Class8_Sub5 aClass8_Sub5_67;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(B)V")
	public final void method8381() {
		if (this.aClass8_Sub5_67 != null) {
			this.aClass8_Sub5_67.aClass8_Sub5_66 = this.aClass8_Sub5_66;
			this.aClass8_Sub5_66.aClass8_Sub5_67 = this.aClass8_Sub5_67;
			this.aClass8_Sub5_67 = null;
			this.aClass8_Sub5_66 = null;
		}
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(I)Z")
	public final boolean method8384() {
		return this.aClass8_Sub5_67 != null;
	}
}
