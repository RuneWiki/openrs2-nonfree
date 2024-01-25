import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class48 {

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_8;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
	public final int anInt1149;

	static {
		new Class151("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!od;II)V")
	public Class48(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass128_Sub2_8 = arg0;
		this.anInt1149 = arg2;
	}

	@OriginalMember(owner = "client!dd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass128_Sub2_8.method3629(this.anInt1149);
		super.finalize();
	}
}
