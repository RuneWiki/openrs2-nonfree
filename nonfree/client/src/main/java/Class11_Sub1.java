import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class11_Sub1 extends Class11 implements Interface10 {

	@OriginalMember(owner = "client!am", name = "p", descriptor = "I")
	private int anInt279;

	static {
		new Class209("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!ef;I[BIZ)V")
	public Class11_Sub1(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt279 = arg1;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
	@Override
	protected void method581() {
		super.aClass49_Sub2_4.method1632(this);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I[BIB)V")
	@Override
	public void method2312(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method585(arg0, arg1);
		this.anInt279 = 5123;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)I")
	@Override
	public int method2309() {
		return super.anInt685;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)J")
	@Override
	public long method2311() {
		return 0L;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Z)I")
	@Override
	public int method2310() {
		return this.anInt279;
	}
}
