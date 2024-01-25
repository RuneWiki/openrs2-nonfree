import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public final class Class6_Sub15_Sub7 extends Class6_Sub15 {

	@OriginalMember(owner = "client!lia", name = "p", descriptor = "B")
	private byte aByte99;

	@OriginalMember(owner = "client!lia", name = "o", descriptor = "I")
	private int anInt5897 = -1;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILclient!gga;)V")
	@Override
	public void method8714(@OriginalArg(1) Class6_Sub23 arg0) {
		this.anInt5897 = arg0.method8363();
		this.aByte99 = arg0.method8391();
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(BLclient!hia;)V")
	@Override
	public void method8716(@OriginalArg(1) Class145 arg0) {
		arg0.method3145(this.aByte99, this.anInt5897);
	}
}
