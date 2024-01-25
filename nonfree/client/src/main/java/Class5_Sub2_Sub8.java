import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public final class Class5_Sub2_Sub8 extends Class5_Sub2 {

	@OriginalMember(owner = "client!lha", name = "p", descriptor = "Z")
	private boolean aBoolean450;

	@OriginalMember(owner = "client!lha", name = "t", descriptor = "B")
	private byte aByte79;

	@OriginalMember(owner = "client!lha", name = "q", descriptor = "B")
	private byte aByte80;

	@OriginalMember(owner = "client!lha", name = "n", descriptor = "B")
	private byte aByte81;

	@OriginalMember(owner = "client!lha", name = "o", descriptor = "B")
	private byte aByte82;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!kp;I)V")
	@Override
	public void method8190(@OriginalArg(0) Class205 arg0) {
		arg0.aByte77 = this.aByte82;
		arg0.aByte76 = this.aByte80;
		arg0.aBoolean434 = this.aBoolean450;
		arg0.aByte78 = this.aByte79;
		arg0.aByte75 = this.aByte81;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method8188(@OriginalArg(1) Class5_Sub23 arg0) {
		this.aBoolean450 = arg0.method8529() == 1;
		this.aByte81 = arg0.method8488();
		this.aByte79 = arg0.method8488();
		this.aByte80 = arg0.method8488();
		this.aByte82 = arg0.method8488();
	}
}
