import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public final class Class1_Sub19 extends Class1 implements Interface18 {

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
	public int anInt3873;

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
	public int anInt3875;

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "J")
	public long aLong94;

	@OriginalMember(owner = "client!hs", name = "w", descriptor = "I")
	public int anInt3877;

	static {
		new Class45("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)I")
	@Override
	public int method3593() {
		return this.anInt3875;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)C")
	@Override
	public char method3594() {
		return this.aChar2;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)I")
	@Override
	public int method3597() {
		return this.anInt3873;
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)I")
	@Override
	public int method3596() {
		return this.anInt3877;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)J")
	@Override
	public long method3595() {
		return this.aLong94;
	}
}
