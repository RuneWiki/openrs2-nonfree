import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RZDMTEAZ")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!RZDMTEAZ", name = "f", descriptor = "Lclient!RZDMTEAZ;")
	public Class4_Sub1 aClass4_Sub1_35;

	@OriginalMember(owner = "client!RZDMTEAZ", name = "g", descriptor = "Lclient!RZDMTEAZ;")
	public Class4_Sub1 aClass4_Sub1_36;

	@OriginalMember(owner = "client!RZDMTEAZ", name = "e", descriptor = "I")
	private int anInt740 = -173;

	@OriginalMember(owner = "client!RZDMTEAZ", name = "b", descriptor = "()V")
	public final void method557() {
		if (this.aClass4_Sub1_36 != null) {
			this.aClass4_Sub1_36.aClass4_Sub1_35 = this.aClass4_Sub1_35;
			this.aClass4_Sub1_35.aClass4_Sub1_36 = this.aClass4_Sub1_36;
			this.aClass4_Sub1_35 = null;
			this.aClass4_Sub1_36 = null;
		}
	}
}
