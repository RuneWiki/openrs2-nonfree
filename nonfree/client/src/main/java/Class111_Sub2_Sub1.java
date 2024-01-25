import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class111_Sub2_Sub1 extends Class111_Sub2 {

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "[B")
	private byte[] aByteArray84;

	static {
		new Class134("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class111_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IIB)V")
	@Override
	protected void method5113(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(17) byte local17 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(21) int local21 = arg0 * 2;
		@Pc(24) int local24 = local21;
		@Pc(25) int local25 = local21 + 1;
		this.aByteArray84[local24] = local17;
		this.aByteArray84[local25] = local17;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIB)[B")
	public byte[] method5123() {
		this.aByteArray84 = new byte[524288];
		this.method5107();
		return this.aByteArray84;
	}
}
