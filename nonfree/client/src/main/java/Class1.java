import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	public int anInt1;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!a;")
	public Class1 aClass1_1;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!qi;")
	public Class24_Sub3 aClass24_Sub3_1;

	static {
		new Class182("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public void method2() {
		if (Static92.anInt1933 >= 500) {
			return;
		}
		this.aClass1_1 = Static4.aClass1_8;
		this.anInt1 = 0;
		this.aClass24_Sub3_1 = null;
		Static92.anInt1933++;
		Static4.aClass1_8 = this;
	}
}
