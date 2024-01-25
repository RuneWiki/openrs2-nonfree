import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class35_Sub1_Sub2 extends Class35_Sub1 {

	@OriginalMember(owner = "client!lda", name = "G", descriptor = "[B")
	private byte[] aByteArray73;

	static {
		new Class45("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "()V")
	public Class35_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(BBI)V")
	@Override
	protected void method4816(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(20) int local20 = arg1 * 2;
		@Pc(23) int local23 = local20;
		@Pc(24) int local24 = local20 + 1;
		this.aByteArray73[local23] = local16;
		this.aByteArray73[local24] = local16;
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(IIII)[B")
	public byte[] method4820() {
		this.aByteArray73 = new byte[524288];
		this.method5904();
		return this.aByteArray73;
	}
}
