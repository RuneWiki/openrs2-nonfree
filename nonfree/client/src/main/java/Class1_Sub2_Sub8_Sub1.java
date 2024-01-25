import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public final class Class1_Sub2_Sub8_Sub1 extends Class1_Sub2_Sub8 {

	@OriginalMember(owner = "client!io", name = "I", descriptor = "I")
	public int anInt3174;

	@OriginalMember(owner = "client!io", name = "J", descriptor = "Lclient!eo;")
	public Class65 aClass65_4;

	@OriginalMember(owner = "client!io", name = "O", descriptor = "[B")
	public byte[] aByteArray55;

	static {
		new Class7("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)I")
	@Override
	public int method4411() {
		return super.aBoolean385 ? 0 : 100;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)[B")
	@Override
	public byte[] method4412() {
		if (super.aBoolean385) {
			throw new RuntimeException();
		}
		return this.aByteArray55;
	}
}
