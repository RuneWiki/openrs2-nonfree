import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!v", name = "m", descriptor = "J")
	public long aLong224;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "Lclient!v;")
	public Class1_Sub1 aClass1_Sub1_74;

	@OriginalMember(owner = "client!v", name = "r", descriptor = "Lclient!v;")
	public Class1_Sub1 aClass1_Sub1_75;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
	public final void method4617() {
		if (this.aClass1_Sub1_74 != null) {
			this.aClass1_Sub1_74.aClass1_Sub1_75 = this.aClass1_Sub1_75;
			this.aClass1_Sub1_75.aClass1_Sub1_74 = this.aClass1_Sub1_74;
			this.aClass1_Sub1_74 = null;
			this.aClass1_Sub1_75 = null;
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)Z")
	public final boolean method4620() {
		return this.aClass1_Sub1_74 != null;
	}
}
