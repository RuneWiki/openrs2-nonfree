import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!mt", name = "r", descriptor = "Lclient!mt;")
	public Class1_Sub3 aClass1_Sub3_55;

	@OriginalMember(owner = "client!mt", name = "s", descriptor = "J")
	public long aLong216;

	@OriginalMember(owner = "client!mt", name = "v", descriptor = "Lclient!mt;")
	public Class1_Sub3 aClass1_Sub3_56;

	static {
		new Class151(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
	public final void method5312() {
		if (this.aClass1_Sub3_55 != null) {
			this.aClass1_Sub3_55.aClass1_Sub3_56 = this.aClass1_Sub3_56;
			this.aClass1_Sub3_56.aClass1_Sub3_55 = this.aClass1_Sub3_55;
			this.aClass1_Sub3_55 = null;
			this.aClass1_Sub3_56 = null;
		}
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)Z")
	public final boolean method5313() {
		return this.aClass1_Sub3_55 != null;
	}
}
