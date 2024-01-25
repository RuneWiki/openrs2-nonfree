import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class147 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "[Lclient!gn;")
	public static final Class84[] aClass84Array1 = new Class84[5];

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public final int anInt4521;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	public final int anInt4528;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "I")
	public final int anInt4526;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	public final int anInt4527;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass84Array1.length; local4++) {
			aClass84Array1[local4] = new Class84();
		}
		new Class83("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIII)V")
	public Class147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4521 = arg1;
		this.anInt4528 = arg3;
		this.anInt4526 = arg0;
		this.anInt4527 = arg2;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)Lclient!me;")
	public Class147 method3554(@OriginalArg(1) int arg0) {
		return new Class147(this.anInt4526, arg0, this.anInt4527, this.anInt4528);
	}
}
