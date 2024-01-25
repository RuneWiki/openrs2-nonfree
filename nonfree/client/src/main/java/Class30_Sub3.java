import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class Class30_Sub3 extends Class30 {

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "Z")
	public boolean aBoolean631 = false;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Z")
	public boolean aBoolean630 = false;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	protected int anInt8892;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
	protected int anInt8893;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "S")
	public final short aShort108;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	protected final int anInt8895;

	static {
		new Class88("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class30_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean630 = arg4;
		this.aBoolean631 = arg5;
		this.anInt8892 = arg2;
		this.anInt8893 = arg0;
		this.aShort108 = (short) arg3;
		this.anInt8895 = arg1;
	}
}
