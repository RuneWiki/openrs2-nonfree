import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class107_Sub2_Sub1 extends Class107_Sub2 {

	@OriginalMember(owner = "client!is", name = "O", descriptor = "[B")
	private byte[] aByteArray34;

	static {
		new Class96("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	public Class107_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(IIII)[B")
	public byte[] method2840() {
		this.aByteArray34 = new byte[524288];
		this.method2820();
		return this.aByteArray34;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BBI)V")
	@Override
	protected void method2828(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 * 2;
		@Pc(19) int local19 = arg0 & 0xFF;
		@Pc(22) int local22 = local15;
		@Pc(23) int local23 = local15 + 1;
		this.aByteArray34[local22] = (byte) (local19 * 3 >> 5);
		this.aByteArray34[local23] = (byte) (local19 * 3 >> 5);
	}
}
