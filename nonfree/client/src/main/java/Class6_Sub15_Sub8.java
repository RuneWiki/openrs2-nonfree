import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class6_Sub15_Sub8 extends Class6_Sub15 {

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "B")
	private byte aByte103;

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "B")
	private byte aByte104;

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "B")
	private byte aByte105;

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "B")
	private byte aByte106;

	@OriginalMember(owner = "client!lt", name = "x", descriptor = "Z")
	private boolean aBoolean399;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLclient!hia;)V")
	@Override
	public void method8716(@OriginalArg(1) Class145 arg0) {
		arg0.aByte53 = this.aByte105;
		arg0.aBoolean217 = this.aBoolean399;
		arg0.aByte52 = this.aByte103;
		arg0.aByte54 = this.aByte106;
		arg0.aByte55 = this.aByte104;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!gga;)V")
	@Override
	public void method8714(@OriginalArg(1) Class6_Sub23 arg0) {
		this.aBoolean399 = arg0.method8374() == 1;
		this.aByte106 = arg0.method8391();
		this.aByte104 = arg0.method8391();
		this.aByte105 = arg0.method8391();
		this.aByte103 = arg0.method8391();
	}
}
