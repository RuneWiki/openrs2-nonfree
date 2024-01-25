import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public abstract class Class44_Sub3 extends Class44 {

	@OriginalMember(owner = "client!ip", name = "p", descriptor = "Z")
	public boolean aBoolean318 = false;

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "Z")
	public boolean aBoolean319 = false;

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
	protected int anInt4578;

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
	protected final int anInt4570;

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
	protected int anInt4572;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class44_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4578 = arg0;
		this.anInt4570 = arg1;
		this.aBoolean319 = arg3;
		this.anInt4572 = arg2;
		this.aBoolean318 = arg4;
	}
}
