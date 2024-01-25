import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class2_Sub50 extends Class2 {

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "Lclient!qaa;")
	public Class269 aClass269_95;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "Lclient!rca;")
	public Class2_Sub34_Sub2 aClass2_Sub34_Sub2_2;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
	public int anInt9982;

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
	public int anInt9983;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
	public void method8352() {
		if (Static305.anInt5639 < Static16.aClass2_Sub50Array1.length) {
			Static16.aClass2_Sub50Array1[Static305.anInt5639++] = this;
		}
	}
}
