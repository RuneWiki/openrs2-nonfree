import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class6_Sub15_Sub5 extends Class6_Sub15 {

	@OriginalMember(owner = "client!in", name = "p", descriptor = "I")
	private int anInt4363;

	@OriginalMember(owner = "client!in", name = "s", descriptor = "I")
	private int anInt4366;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BLclient!hia;)V")
	@Override
	public void method8716(@OriginalArg(1) Class145 arg0) {
		arg0.method3166(this.anInt4363, this.anInt4366);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILclient!gga;)V")
	@Override
	public void method8714(@OriginalArg(1) Class6_Sub23 arg0) {
		this.anInt4366 = arg0.method8369();
		this.anInt4363 = arg0.method8369();
	}
}
