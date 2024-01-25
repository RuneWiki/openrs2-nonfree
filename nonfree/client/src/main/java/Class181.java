import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public final class Class181 {

	@OriginalMember(owner = "client!ija", name = "i", descriptor = "Lclient!ija;")
	public Class181 aClass181_2;

	@OriginalMember(owner = "client!ija", name = "k", descriptor = "Lclient!mga;")
	public Class9_Sub1_Sub1 aClass9_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(B)V")
	public void method3952() {
		if (Static154.anInt2752 < 500) {
			this.aClass181_2 = Static79.aClass181_1;
			this.aClass9_Sub1_Sub1_1 = null;
			Static79.aClass181_1 = this;
			Static154.anInt2752++;
		}
	}
}
