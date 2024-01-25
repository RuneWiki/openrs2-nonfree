import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class122 {

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!jf;")
	public Class122 aClass122_1;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
	public int anInt3227;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!aa;")
	public Class2_Sub1 aClass2_Sub1_1;

	static {
		new Class198("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public void method2597() {
		if (Static306.anInt2308 >= 500) {
			return;
		}
		this.anInt3227 = 0;
		this.aClass2_Sub1_1 = null;
		this.aClass122_1 = Static262.aClass122_2;
		Static262.aClass122_2 = this;
		Static306.anInt2308++;
	}
}
