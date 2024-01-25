import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class30_Sub2_Sub1 extends Class30_Sub2 {

	@OriginalMember(owner = "client!ok", name = "S", descriptor = "[B")
	private byte[] aByteArray65;

	static {
		new Class84("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	public Class30_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(BII)V")
	@Override
	protected void method4070(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(20) int local20 = local7;
		@Pc(21) int local21 = local7 + 1;
		this.aByteArray65[local20] = (byte) (local11 * 3 >> 5);
		this.aByteArray65[local21] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)[B")
	public byte[] method4073() {
		this.aByteArray65 = new byte[524288];
		this.method4061();
		return this.aByteArray65;
	}
}
