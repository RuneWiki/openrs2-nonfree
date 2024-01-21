import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class25 {

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Z")
	public boolean aBoolean36 = true;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
	public final int anInt842;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public final int anInt833;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
	public final int anInt837;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	public final int anInt836;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public final int anInt838;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	public final int anInt841;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt842 = arg1;
		this.aBoolean36 = arg6;
		this.anInt833 = arg2;
		this.anInt837 = arg4;
		this.anInt836 = arg3;
		this.anInt838 = arg5;
		this.anInt841 = arg0;
	}
}
