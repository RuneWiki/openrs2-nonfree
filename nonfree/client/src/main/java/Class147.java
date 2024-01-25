import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class147 {

	@OriginalMember(owner = "client!im", name = "d", descriptor = "Lclient!im;")
	public Class147 aClass147_2;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Lclient!iaa;")
	public Class25_Sub2_Sub2 aClass25_Sub2_Sub2_1;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
	public void method3733() {
		if (Static305.anInt5660 < 500) {
			this.aClass147_2 = Static80.aClass147_1;
			this.aClass25_Sub2_Sub2_1 = null;
			Static305.anInt5660++;
			Static80.aClass147_1 = this;
		}
	}
}
