import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
	public int anInt633;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "Lclient!lh;")
	public Class208 aClass208_12;

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "Lclient!mw;")
	public Class1_Sub3_Sub1 aClass1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public void method556() {
		if (Static587.anInt9699 < Static265.aClass1_Sub9Array1.length) {
			Static265.aClass1_Sub9Array1[Static587.anInt9699++] = this;
		}
	}
}
