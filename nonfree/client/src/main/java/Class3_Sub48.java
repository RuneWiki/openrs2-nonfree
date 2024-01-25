import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class Class3_Sub48 extends Class3 {

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "Lclient!lk;")
	public Class3_Sub28_Sub2 aClass3_Sub28_Sub2_1;

	@OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
	public int anInt9728;

	@OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
	public int anInt9730;

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "Lclient!pi;")
	public Class286 aClass286_103;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
	public void method8210() {
		if (Static293.aClass3_Sub48Array1.length > Static166.anInt3084) {
			Static293.aClass3_Sub48Array1[Static166.anInt3084++] = this;
		}
	}
}
