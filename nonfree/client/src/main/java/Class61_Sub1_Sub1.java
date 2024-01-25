import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class61_Sub1_Sub1 extends Class61_Sub1 {

	@OriginalMember(owner = "client!dl", name = "M", descriptor = "[B")
	private byte[] aByteArray27;

	static {
		new Class114("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class61_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBZ)V")
	@Override
	protected void method7347(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(11) int local11 = arg0 * 2;
		@Pc(15) int local15 = arg1 & 0xFF;
		@Pc(18) int local18 = local11;
		@Pc(19) int local19 = local11 + 1;
		this.aByteArray27[local18] = (byte) (local15 * 3 >> 5);
		this.aByteArray27[local19] = (byte) (local15 * 3 >> 5);
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(IIII)[B")
	public byte[] method2162() {
		this.aByteArray27 = new byte[524288];
		this.method7939();
		return this.aByteArray27;
	}
}
