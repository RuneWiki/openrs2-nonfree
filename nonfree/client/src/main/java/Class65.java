import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class65 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_10;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "J")
	public final long aLong47;

	static {
		new Class84("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!ht;J[Lclient!lo;)V")
	public Class65(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class149[] arg2) {
		this.aClass109_Sub1_10 = arg0;
		this.aLong47 = arg1;
	}

	@OriginalMember(owner = "client!ed", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass109_Sub1_10.method2602(this.aLong47);
		super.finalize();
	}
}
