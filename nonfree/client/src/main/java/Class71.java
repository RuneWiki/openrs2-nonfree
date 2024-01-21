import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class71 {

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Z")
	public boolean aBoolean105 = true;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	public final int anInt2474;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
	public final int anInt2483;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	public final int anInt2476;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
	public final int anInt2484;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	public final int anInt2482;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public final int anInt2477;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt2474 = arg0;
		this.aBoolean105 = arg6;
		this.anInt2483 = arg2;
		this.anInt2476 = arg3;
		this.anInt2484 = arg1;
		this.anInt2482 = arg4;
		this.anInt2477 = arg5;
	}
}
