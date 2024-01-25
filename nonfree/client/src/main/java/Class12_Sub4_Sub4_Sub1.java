import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class12_Sub4_Sub4_Sub1 extends Class12_Sub4_Sub4 {

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "Ljava/lang/Object;")
	private final Object anObject7;

	static {
		new Class88("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!fw;Ljava/lang/Object;I)V")
	public Class12_Sub4_Sub4_Sub1(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject7 = arg1;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2653() {
		return this.anObject7;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method2650() {
		return false;
	}
}
