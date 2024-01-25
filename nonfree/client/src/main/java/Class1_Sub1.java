import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "Lclient!mo;")
	public Class1_Sub1 aClass1_Sub1_61;

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "Lclient!mo;")
	public Class1_Sub1 aClass1_Sub1_62;

	@OriginalMember(owner = "client!mo", name = "t", descriptor = "J")
	public long aLong208;

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)Z")
	public final boolean method5563() {
		return this.aClass1_Sub1_62 != null;
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(B)V")
	public final void method5564() {
		if (this.aClass1_Sub1_62 != null) {
			this.aClass1_Sub1_62.aClass1_Sub1_61 = this.aClass1_Sub1_61;
			this.aClass1_Sub1_61.aClass1_Sub1_62 = this.aClass1_Sub1_62;
			this.aClass1_Sub1_61 = null;
			this.aClass1_Sub1_62 = null;
		}
	}
}
