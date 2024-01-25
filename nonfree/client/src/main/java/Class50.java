import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class50 {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	public final int anInt1350;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "I")
	public final int anInt1348;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "I")
	public final int anInt1347;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "I")
	public final int anInt1349;

	static {
		new Class134("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IIII)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1350 = arg0;
		this.anInt1348 = arg1;
		this.anInt1347 = arg2;
		this.anInt1349 = arg3;
	}

	@OriginalMember(owner = "client!de", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
