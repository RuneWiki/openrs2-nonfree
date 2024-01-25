import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public abstract class Class10_Sub5 extends Class10 {

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "Z")
	public boolean aBoolean668 = false;

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "S")
	public final short aShort125;

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
	protected final int anInt9409;

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "I")
	protected int anInt9408;

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
	protected int anInt9412;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class10_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.aShort125 = (short) arg3;
		this.anInt9409 = arg1;
		this.anInt9408 = arg2;
		this.anInt9412 = arg0;
		this.aBoolean668 = arg5;
	}
}
