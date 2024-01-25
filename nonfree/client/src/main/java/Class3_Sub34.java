import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class3_Sub34 extends Class3 {

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	public int anInt5093;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "Lclient!mga;")
	public Class218 aClass218_75;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "Lclient!gaa;")
	public Class3_Sub25_Sub1 aClass3_Sub25_Sub1_2;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
	public int anInt5095;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public void method4668() {
		if (Static449.anInt7436 < Static652.aClass3_Sub34Array1.length) {
			Static652.aClass3_Sub34Array1[Static449.anInt7436++] = this;
		}
	}
}
