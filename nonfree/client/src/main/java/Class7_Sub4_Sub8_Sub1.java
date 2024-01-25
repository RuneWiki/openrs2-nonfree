import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class7_Sub4_Sub8_Sub1 extends Class7_Sub4_Sub8 {

	@OriginalMember(owner = "client!np", name = "x", descriptor = "Lclient!ur;")
	public Class250 aClass250_2;

	@OriginalMember(owner = "client!np", name = "z", descriptor = "I")
	public int anInt4618;

	@OriginalMember(owner = "client!np", name = "A", descriptor = "[B")
	public byte[] aByteArray70;

	static {
		new Class55("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(I)I")
	@Override
	public int method4537() {
		return super.aBoolean380 ? 0 : 100;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method4536() {
		if (super.aBoolean380) {
			throw new RuntimeException();
		}
		return this.aByteArray70;
	}
}
