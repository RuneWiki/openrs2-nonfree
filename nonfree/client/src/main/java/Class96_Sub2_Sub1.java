import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class96_Sub2_Sub1 extends Class96_Sub2 {

	@OriginalMember(owner = "client!hm", name = "I", descriptor = "[B")
	private byte[] aByteArray27;

	static {
		new Class15("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
	public Class96_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(IIII)[B")
	public byte[] method2171() {
		this.aByteArray27 = new byte[524288];
		this.method2166();
		return this.aByteArray27;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method2169(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) int local16 = arg0 & 0xFF;
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray27[local19] = (byte) (local16 * 3 >> 5);
		this.aByteArray27[local20] = (byte) (local16 * 3 >> 5);
	}
}
