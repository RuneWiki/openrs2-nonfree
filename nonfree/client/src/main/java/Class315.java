import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class315 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "J")
	public final long aLong238;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_42;

	static {
		new Class114("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!te;JI)V")
	public Class315(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong238 = arg1;
		this.aClass9_Sub3_42 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass9_Sub3_42.method6716(this.aLong238);
		super.finalize();
	}
}
