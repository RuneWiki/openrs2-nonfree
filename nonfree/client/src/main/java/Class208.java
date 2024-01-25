import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class208 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "Lclient!qk;")
	public Class208 aClass208_2;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
	public int anInt6086;

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "Lclient!ol;")
	public Class30_Sub1 aClass30_Sub1_1;

	static {
		new Class158("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	public void method4675() {
		if (Static364.anInt6679 >= 500) {
			return;
		}
		this.aClass208_2 = Static216.aClass208_1;
		this.anInt6086 = 0;
		this.aClass30_Sub1_1 = null;
		Static364.anInt6679++;
		Static216.aClass208_1 = this;
	}
}
