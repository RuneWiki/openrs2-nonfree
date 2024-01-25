import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public final class Class6_Sub7_Sub4 extends Class6_Sub7 {

	@OriginalMember(owner = "client!tja", name = "n", descriptor = "I")
	private int anInt9394 = -1;

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8201(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anInt9394 = arg0.method3018();
		arg0.method3030();
		if (arg0.method3030() != 255) {
			arg0.anInt3174--;
			arg0.method3049();
		}
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(Lclient!kj;I)V")
	@Override
	public void method8200(@OriginalArg(0) Class6_Sub29 arg0) {
		arg0.method4982(this.anInt9394);
	}
}
