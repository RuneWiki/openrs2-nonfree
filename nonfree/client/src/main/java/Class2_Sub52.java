import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class2_Sub52 extends Class2 {

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "Lclient!sv;")
	public Class341 aClass341_108;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
	public int anInt10944;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
	public int anInt10946;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "Lclient!kja;")
	public Class2_Sub8_Sub2 aClass2_Sub8_Sub2_2;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
	public void method9355() {
		if (Static7.aClass2_Sub52Array1.length > Static468.anInt8411) {
			Static7.aClass2_Sub52Array1[Static468.anInt8411++] = this;
		}
	}
}
