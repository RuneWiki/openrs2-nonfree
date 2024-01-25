import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class4_Sub4_Sub2_Sub2 extends Class4_Sub4_Sub2 {

	@OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
	public int anInt2751;

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "Lclient!we;")
	public Class214 aClass214_1;

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "[B")
	public byte[] aByteArray44;

	static {
		new Class159("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method2408() {
		if (super.aBoolean197) {
			throw new RuntimeException();
		}
		return this.aByteArray44;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(Z)I")
	@Override
	public int method2405() {
		return super.aBoolean197 ? 0 : 100;
	}
}
