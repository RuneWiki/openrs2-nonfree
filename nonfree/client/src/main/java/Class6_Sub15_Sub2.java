import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class6_Sub15_Sub2 extends Class6_Sub15 {

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
	private int anInt2534 = -1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!gga;)V")
	@Override
	public void method8714(@OriginalArg(1) Class6_Sub23 arg0) {
		this.anInt2534 = arg0.method8363();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLclient!hia;)V")
	@Override
	public void method8716(@OriginalArg(1) Class145 arg0) {
		arg0.method3156(this.anInt2534);
	}
}
