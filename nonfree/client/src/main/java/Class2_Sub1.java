import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!daa", name = "r", descriptor = "J")
	public long aLong296;

	@OriginalMember(owner = "client!daa", name = "t", descriptor = "Lclient!daa;")
	public Class2_Sub1 aClass2_Sub1_66;

	@OriginalMember(owner = "client!daa", name = "v", descriptor = "Lclient!daa;")
	public Class2_Sub1 aClass2_Sub1_67;

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)Z")
	public final boolean method9376() {
		return this.aClass2_Sub1_66 != null;
	}

	@OriginalMember(owner = "client!daa", name = "f", descriptor = "(I)V")
	public final void method9377() {
		if (this.aClass2_Sub1_66 != null) {
			this.aClass2_Sub1_66.aClass2_Sub1_67 = this.aClass2_Sub1_67;
			this.aClass2_Sub1_67.aClass2_Sub1_66 = this.aClass2_Sub1_66;
			this.aClass2_Sub1_66 = null;
			this.aClass2_Sub1_67 = null;
		}
	}
}
