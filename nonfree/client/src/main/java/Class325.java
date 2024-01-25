import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class325 {

	@OriginalMember(owner = "client!su", name = "c", descriptor = "Lclient!su;")
	public Class325 aClass325_3;

	@OriginalMember(owner = "client!su", name = "d", descriptor = "Lclient!gs;")
	public Class13_Sub1_Sub1 aClass13_Sub1_Sub1_1;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
	public void method7368() {
		if (Static495.anInt4074 < 500) {
			this.aClass13_Sub1_Sub1_1 = null;
			this.aClass325_3 = Static293.aClass325_2;
			Static495.anInt4074++;
			Static293.aClass325_2 = this;
		}
	}
}
