import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class4_Sub39 extends Class4 {

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
	public int anInt7831;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
	public int anInt7832;

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "Lclient!sj;")
	public Class4_Sub13_Sub2 aClass4_Sub13_Sub2_1;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "Lclient!vh;")
	public Class344 aClass344_67;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
	public void method6126() {
		if (Static382.anInt7520 < Static82.aClass4_Sub39Array1.length) {
			Static82.aClass4_Sub39Array1[Static382.anInt7520++] = this;
		}
	}
}
