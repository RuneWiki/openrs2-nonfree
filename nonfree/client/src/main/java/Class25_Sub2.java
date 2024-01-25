import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public abstract class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!vv", name = "p", descriptor = "Z")
	public boolean aBoolean544 = false;

	@OriginalMember(owner = "client!vv", name = "y", descriptor = "Z")
	public boolean aBoolean545 = false;

	@OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
	protected int anInt4822;

	@OriginalMember(owner = "client!vv", name = "q", descriptor = "I")
	protected final int anInt4821;

	@OriginalMember(owner = "client!vv", name = "v", descriptor = "S")
	public final short aShort78;

	@OriginalMember(owner = "client!vv", name = "t", descriptor = "I")
	protected int anInt4823;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class25_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean545 = arg5;
		this.aBoolean544 = arg4;
		this.anInt4822 = arg0;
		this.anInt4821 = arg1;
		this.aShort78 = (short) arg3;
		this.anInt4823 = arg2;
	}
}
