import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public final class Class5_Sub48 extends Class5 {

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "Lclient!cb;")
	public Class46 aClass46_97;

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "Lclient!gba;")
	public Class5_Sub22_Sub1 aClass5_Sub22_Sub1_2;

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
	public int anInt8985;

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
	public int anInt8986;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
	public void method7726() {
		if (Static586.aClass5_Sub48Array1.length > Static431.anInt6172) {
			Static586.aClass5_Sub48Array1[Static431.anInt6172++] = this;
		}
	}
}
