import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public abstract class Class29_Sub3 extends Class29 {

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "Z")
	public boolean aBoolean222 = false;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	protected final int anInt3346;

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "S")
	public final short aShort69;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
	protected int anInt3348;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
	protected int anInt3347;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class29_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3346 = arg1;
		this.aBoolean222 = arg5;
		this.aShort69 = (short) arg3;
		this.anInt3348 = arg0;
		this.anInt3347 = arg2;
	}
}
