import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "J")
	public long aLong259;

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "Lclient!bo;")
	public Class3_Sub4 aClass3_Sub4_61;

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "Lclient!bo;")
	public Class3_Sub4 aClass3_Sub4_62;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Z")
	public final boolean method8307() {
		return this.aClass3_Sub4_62 != null;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)V")
	public final void method8309() {
		if (this.aClass3_Sub4_62 != null) {
			this.aClass3_Sub4_62.aClass3_Sub4_61 = this.aClass3_Sub4_61;
			this.aClass3_Sub4_61.aClass3_Sub4_62 = this.aClass3_Sub4_62;
			this.aClass3_Sub4_61 = null;
			this.aClass3_Sub4_62 = null;
		}
	}
}
