import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KIFEZIQJ")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!KIFEZIQJ", name = "e", descriptor = "Lclient!KIFEZIQJ;")
	public Class2_Sub1 aClass2_Sub1_36;

	@OriginalMember(owner = "client!KIFEZIQJ", name = "f", descriptor = "Lclient!KIFEZIQJ;")
	public Class2_Sub1 aClass2_Sub1_37;

	@OriginalMember(owner = "client!KIFEZIQJ", name = "b", descriptor = "()V")
	public final void method574() {
		if (this.aClass2_Sub1_37 != null) {
			this.aClass2_Sub1_37.aClass2_Sub1_36 = this.aClass2_Sub1_36;
			this.aClass2_Sub1_36.aClass2_Sub1_37 = this.aClass2_Sub1_37;
			this.aClass2_Sub1_36 = null;
			this.aClass2_Sub1_37 = null;
		}
	}
}
