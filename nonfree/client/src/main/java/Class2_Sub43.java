import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
	public int anInt7448 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
	public int anInt7449 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
	public int anInt7447 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
	public int anInt7453 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
	public int anInt7446 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
	public int anInt7451 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
	public int anInt7454 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vn", name = "C", descriptor = "I")
	public int anInt7457 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "Lclient!tk;")
	public final Class2_Sub38 aClass2_Sub38_1;

	static {
		new Class256("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!tk;)V")
	public Class2_Sub43(@OriginalArg(0) Class2_Sub38 arg0) {
		this.aClass2_Sub38_1 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)Z")
	public boolean method5776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7453 <= arg1 && arg1 <= this.anInt7448 && this.anInt7449 <= arg0 && arg0 <= this.anInt7457) {
			return true;
		} else {
			return this.anInt7451 <= arg1 && this.anInt7447 >= arg1 && this.anInt7446 <= arg0 && arg0 <= this.anInt7454;
		}
	}
}
