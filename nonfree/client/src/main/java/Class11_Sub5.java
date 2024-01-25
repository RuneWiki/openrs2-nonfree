import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class Class11_Sub5 extends Class11 {

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "Z")
	public boolean aBoolean717 = false;

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "S")
	public final short aShort126;

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
	protected int anInt9740;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
	protected int anInt9744;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
	protected final int anInt9742;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class11_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.aShort126 = (short) arg3;
		this.anInt9740 = arg2;
		this.aBoolean717 = arg5;
		this.anInt9744 = arg0;
		this.anInt9742 = arg1;
	}
}
