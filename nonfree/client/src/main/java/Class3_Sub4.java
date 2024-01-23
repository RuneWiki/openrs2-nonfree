import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "Lclient!ia;")
	public Class3_Sub4 aClass3_Sub4_74;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "J")
	public long aLong245;

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "Lclient!ia;")
	public Class3_Sub4 aClass3_Sub4_75;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)Z")
	public final boolean method5021() {
		return this.aClass3_Sub4_74 != null;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
	public final void method5022() {
		if (this.aClass3_Sub4_74 != null) {
			this.aClass3_Sub4_74.aClass3_Sub4_75 = this.aClass3_Sub4_75;
			this.aClass3_Sub4_75.aClass3_Sub4_74 = this.aClass3_Sub4_74;
			this.aClass3_Sub4_74 = null;
			this.aClass3_Sub4_75 = null;
		}
	}
}
