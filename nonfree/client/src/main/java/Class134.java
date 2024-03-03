import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class134 {

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_78 = new Class79("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!la", name = "j", descriptor = "I")
	public static int anInt3551 = 0;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!h;")
	public static final Class89 aClass89_146 = new Class89(63, -1);

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public static int anInt3553 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public int anInt3544;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public int anInt3545;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "I")
	public int anInt3550;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!bt;I)V", line = 3)
	public void method3510(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method4816();
			if (local16 == 0) {
				return;
			}
			this.method3511(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!bt;)V", line = 25)
	private void method3511(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt3550 = arg1.method4830();
			this.anInt3544 = arg1.method4816();
			this.anInt3545 = arg1.method4816();
		}
	}
}
