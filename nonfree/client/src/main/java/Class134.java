import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class134 {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!kf;")
	public Class134 aClass134_2;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public int anInt3955;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!dm;")
	public Class4_Sub2 aClass4_Sub2_1;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public void method3169() {
		if (Static160.anInt3172 >= 500) {
			return;
		}
		this.aClass4_Sub2_1 = null;
		this.anInt3955 = 0;
		this.aClass134_2 = Static417.aClass134_3;
		Static160.anInt3172++;
		Static417.aClass134_3 = this;
	}
}
