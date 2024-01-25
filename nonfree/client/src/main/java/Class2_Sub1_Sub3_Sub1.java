import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class2_Sub1_Sub3_Sub1 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!eb", name = "O", descriptor = "B")
	public byte aByte15;

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "Lclient!lk;")
	public Class2_Sub13 aClass2_Sub13_6;

	@OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
	public int anInt1353;

	static {
		new Class221("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method4856() {
		if (super.aBoolean434 || this.aClass2_Sub13_6.aByteArray77.length - this.aByte15 > this.aClass2_Sub13_6.anInt4788) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub13_6.aByteArray77;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)I")
	@Override
	public int method4854() {
		return this.aClass2_Sub13_6 == null ? 0 : this.aClass2_Sub13_6.anInt4788 * 100 / (this.aClass2_Sub13_6.aByteArray77.length - this.aByte15);
	}
}
