import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class116 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!jc;")
	public Class116 aClass116_2;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!ug;")
	public Class25_Sub1 aClass25_Sub1_1;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	public int anInt3023;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	public void method2471() {
		if (Static367.anInt5933 >= 500) {
			return;
		}
		this.aClass116_2 = Static153.aClass116_1;
		this.anInt3023 = 0;
		this.aClass25_Sub1_1 = null;
		Static153.aClass116_1 = this;
		Static367.anInt5933++;
	}
}
