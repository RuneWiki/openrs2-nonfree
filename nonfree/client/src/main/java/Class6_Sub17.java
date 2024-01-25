import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public final class Class6_Sub17 extends Class6 {

	@OriginalMember(owner = "client!eda", name = "k", descriptor = "Lclient!lga;")
	public Class185 aClass185_30;

	@OriginalMember(owner = "client!eda", name = "l", descriptor = "Lclient!bi;")
	public Class6_Sub8_Sub1 aClass6_Sub8_Sub1_2;

	@OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
	public int anInt3091;

	@OriginalMember(owner = "client!eda", name = "s", descriptor = "I")
	public int anInt3094;

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(B)V")
	public void method2607() {
		if (Static417.anInt7725 < Static150.aClass6_Sub17Array1.length) {
			Static150.aClass6_Sub17Array1[Static417.anInt7725++] = this;
		}
	}
}
