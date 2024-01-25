import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class6_Sub1_Sub2 extends Class6_Sub1 {

	@OriginalMember(owner = "client!qv", name = "Q", descriptor = "[B")
	private byte[] aByteArray104;

	static {
		new Class306("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method6056(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(17) byte local17 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(21) int local21 = arg1 * 2;
		@Pc(24) int local24 = local21;
		@Pc(25) int local25 = local21 + 1;
		this.aByteArray104[local24] = local17;
		this.aByteArray104[local25] = local17;
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(IIII)[B")
	public byte[] method6058() {
		this.aByteArray104 = new byte[524288];
		this.method6047();
		return this.aByteArray104;
	}
}
