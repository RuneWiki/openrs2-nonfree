import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public abstract class Class17_Sub5 extends Class17 {

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "Z")
	public boolean aBoolean447 = false;

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "Z")
	public boolean aBoolean448 = false;

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
	protected final int anInt4639;

	@OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
	protected int anInt4641;

	@OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
	protected int anInt4642;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class17_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4639 = arg1;
		this.aBoolean447 = arg3;
		this.aBoolean448 = arg4;
		this.anInt4641 = arg2;
		this.anInt4642 = arg0;
	}
}
