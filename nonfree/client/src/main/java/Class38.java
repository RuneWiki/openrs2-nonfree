import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class38 {

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Lclient!bo;")
	public Class38 aClass38_1;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Lclient!et;")
	public Class41_Sub2_Sub1 aClass41_Sub2_Sub1_1;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	public void method758() {
		if (Static219.anInt3915 < 500) {
			this.aClass41_Sub2_Sub1_1 = null;
			this.aClass38_1 = Static558.aClass38_3;
			Static558.aClass38_3 = this;
			Static219.anInt3915++;
		}
	}
}
