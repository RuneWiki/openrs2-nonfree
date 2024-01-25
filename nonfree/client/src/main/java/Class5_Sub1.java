import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "Lclient!sk;")
	public Class5_Sub1 aClass5_Sub1_61;

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "Lclient!sk;")
	public Class5_Sub1 aClass5_Sub1_62;

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "J")
	public long aLong234;

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)Z")
	public final boolean method5969() {
		return this.aClass5_Sub1_61 != null;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
	public final void method5970() {
		if (this.aClass5_Sub1_61 != null) {
			this.aClass5_Sub1_61.aClass5_Sub1_62 = this.aClass5_Sub1_62;
			this.aClass5_Sub1_62.aClass5_Sub1_61 = this.aClass5_Sub1_61;
			this.aClass5_Sub1_62 = null;
			this.aClass5_Sub1_61 = null;
		}
	}
}
