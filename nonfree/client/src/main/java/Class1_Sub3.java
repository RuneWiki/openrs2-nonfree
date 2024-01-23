import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "Lclient!kh;")
	public Class1_Sub3 aClass1_Sub3_74;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "Lclient!kh;")
	public Class1_Sub3 aClass1_Sub3_75;

	@OriginalMember(owner = "client!kh", name = "C", descriptor = "J")
	public long aLong237;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
	public final void method4652() {
		if (this.aClass1_Sub3_75 != null) {
			this.aClass1_Sub3_75.aClass1_Sub3_74 = this.aClass1_Sub3_74;
			this.aClass1_Sub3_74.aClass1_Sub3_75 = this.aClass1_Sub3_75;
			this.aClass1_Sub3_75 = null;
			this.aClass1_Sub3_74 = null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)Z")
	public final boolean method4654() {
		return this.aClass1_Sub3_75 != null;
	}
}
