import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class14_Sub9_Sub2 extends Class14_Sub9 {

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
	private int anInt2548 = -1;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8846(@OriginalArg(0) Class14_Sub21 arg0) {
		this.anInt2548 = arg0.method7717(-1978450544);
		arg0.method7695(122);
		if (arg0.method7695(106) != 255) {
			arg0.anInt8936--;
			arg0.method7729();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLclient!uq;)V")
	@Override
	public void method8845(@OriginalArg(1) Class14_Sub48 arg0) {
		arg0.method8804(this.anInt2548);
	}
}
