import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class5_Sub10_Sub4 extends Class5_Sub10 {

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
	private int anInt8931 = -1;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ua;I)V")
	@Override
	public void method7530(@OriginalArg(0) Class5_Sub49 arg0) {
		arg0.method7994(this.anInt8931);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!rv;)V")
	@Override
	public void method7528(@OriginalArg(1) Class5_Sub15 arg0) {
		this.anInt8931 = arg0.method3698();
		arg0.method3642();
		if (arg0.method3642() != 255) {
			arg0.anInt4144--;
			arg0.method3634();
		}
	}
}
