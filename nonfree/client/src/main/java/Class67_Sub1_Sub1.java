import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class67_Sub1_Sub1 extends Class67_Sub1 {

	@OriginalMember(owner = "client!el", name = "D", descriptor = "[B")
	private byte[] aByteArray27;

	static {
		new Class175("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class67_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method1672(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(27) int local27 = local7;
		@Pc(28) int local28 = local7 + 1;
		this.aByteArray27[local27] = local16;
		this.aByteArray27[local28] = local16;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)[B")
	public byte[] method1675() {
		this.aByteArray27 = new byte[524288];
		this.method4680();
		return this.aByteArray27;
	}
}
