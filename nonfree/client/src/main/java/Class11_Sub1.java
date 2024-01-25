import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Z")
	public boolean aBoolean585 = false;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Z")
	public boolean aBoolean584 = false;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	protected int anInt7968;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "S")
	public final short aShort107;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
	protected int anInt7969;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
	protected final int anInt7971;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean585 = arg5;
		this.anInt7968 = arg2;
		this.aShort107 = (short) arg3;
		this.anInt7969 = arg0;
		this.aBoolean584 = arg4;
		this.anInt7971 = arg1;
	}
}
