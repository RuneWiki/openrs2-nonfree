import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!r", name = "s", descriptor = "Lclient!r;")
	public Class2_Sub8 aClass2_Sub8_74;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "J")
	public long aLong212;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "Lclient!r;")
	public Class2_Sub8 aClass2_Sub8_75;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	public final void method4686() {
		if (this.aClass2_Sub8_75 != null) {
			this.aClass2_Sub8_75.aClass2_Sub8_74 = this.aClass2_Sub8_74;
			this.aClass2_Sub8_74.aClass2_Sub8_75 = this.aClass2_Sub8_75;
			this.aClass2_Sub8_74 = null;
			this.aClass2_Sub8_75 = null;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)Z")
	public final boolean method4687() {
		return this.aClass2_Sub8_75 != null;
	}
}
