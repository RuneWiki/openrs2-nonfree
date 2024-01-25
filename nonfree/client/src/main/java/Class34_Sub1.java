import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class34_Sub1 extends Class34 implements Interface2 {

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	private int anInt2811;

	static {
		new Class151("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!od;I[BIZ)V")
	public Class34_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt2811 = arg1;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V")
	@Override
	protected void method4051() {
		super.aClass128_Sub2_32.method3610(this);
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)I")
	@Override
	public int method4933() {
		return this.anInt2811;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI[BI)V")
	@Override
	public void method4932(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method4053(arg0, arg1);
		this.anInt2811 = 5123;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)J")
	@Override
	public long method4930() {
		return 0L;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)I")
	@Override
	public int method4931() {
		return super.anInt5192;
	}
}
