import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class242 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Lclient!uf;")
	public Class242 aClass242_4;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "Lclient!hs;")
	public Class3_Sub3 aClass3_Sub3_2;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
	public int anInt6605;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public void method5451() {
		if (Static417.anInt6988 >= 500) {
			return;
		}
		this.anInt6605 = 0;
		this.aClass242_4 = Static183.aClass242_3;
		this.aClass3_Sub3_2 = null;
		Static183.aClass242_3 = this;
		Static417.anInt6988++;
	}
}
