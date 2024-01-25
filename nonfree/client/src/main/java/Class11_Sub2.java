import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!na", name = "i", descriptor = "Z")
	public boolean aBoolean444 = false;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "Z")
	public boolean aBoolean445 = false;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	protected int anInt4843;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "I")
	protected final int anInt4844;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "I")
	protected int anInt4842;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "S")
	public final short aShort71;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class11_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.anInt4843 = arg2;
		this.anInt4844 = arg1;
		this.anInt4842 = arg0;
		this.aBoolean444 = arg4;
		this.aShort71 = (short) arg3;
		this.aBoolean445 = arg5;
	}
}
