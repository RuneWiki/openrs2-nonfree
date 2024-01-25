import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public final class Class6_Sub15_Sub3 extends Class6_Sub15 {

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
	private int anInt3236;

	@OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
	private int anInt3241;

	@OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
	private int anInt3242;

	@OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
	private int anInt3238 = -1;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!gga;)V")
	@Override
	public void method8714(@OriginalArg(1) Class6_Sub23 arg0) {
		this.anInt3238 = arg0.method8363();
		this.anInt3236 = arg0.method8369();
		this.anInt3242 = arg0.method8374();
		this.anInt3241 = arg0.method8374();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLclient!hia;)V")
	@Override
	public void method8716(@OriginalArg(1) Class145 arg0) {
		arg0.method3149(this.anInt3236, this.anInt3241, this.anInt3238, this.anInt3242);
	}
}
