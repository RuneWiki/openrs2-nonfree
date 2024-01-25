import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class243 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "Lclient!pl;")
	public Class243 aClass243_11;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "Lclient!lm;")
	public Class30_Sub1 aClass30_Sub1_2;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public int anInt7259;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public void method6032() {
		if (Static144.anInt5610 >= 500) {
			return;
		}
		this.anInt7259 = 0;
		this.aClass243_11 = Static391.aClass243_10;
		this.aClass30_Sub1_2 = null;
		Static144.anInt5610++;
		Static391.aClass243_10 = this;
	}
}
