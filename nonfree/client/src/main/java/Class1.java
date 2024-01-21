import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class Class1 {

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "Lclient!kh;")
	public Class1 aClass1_207;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "J")
	public long aLong139;

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "Lclient!kh;")
	public Class1 aClass1_208;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
	public final void method3198() {
		if (this.aClass1_208 != null) {
			this.aClass1_208.aClass1_207 = this.aClass1_207;
			this.aClass1_207.aClass1_208 = this.aClass1_208;
			this.aClass1_208 = null;
			this.aClass1_207 = null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Z")
	public final boolean method3199() {
		return this.aClass1_208 != null;
	}
}
