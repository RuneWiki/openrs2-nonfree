import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "Lclient!wa;")
	public Class4_Sub4 aClass4_Sub4_61;

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "J")
	public long aLong222;

	@OriginalMember(owner = "client!wa", name = "w", descriptor = "Lclient!wa;")
	public Class4_Sub4 aClass4_Sub4_62;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Z")
	public final boolean method5674() {
		return this.aClass4_Sub4_62 != null;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)V")
	public final void method5678() {
		if (this.aClass4_Sub4_62 != null) {
			this.aClass4_Sub4_62.aClass4_Sub4_61 = this.aClass4_Sub4_61;
			this.aClass4_Sub4_61.aClass4_Sub4_62 = this.aClass4_Sub4_62;
			this.aClass4_Sub4_62 = null;
			this.aClass4_Sub4_61 = null;
		}
	}
}
