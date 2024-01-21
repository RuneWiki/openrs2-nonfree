import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class63 {

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "Z")
	public boolean aBoolean139 = true;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
	public final int anInt2323;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
	public final int anInt2328;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
	public final int anInt2326;

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
	public final int anInt2336;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
	public final int anInt2330;

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
	public final int anInt2335;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean139 = arg6;
		this.anInt2323 = arg2;
		this.anInt2328 = arg4;
		this.anInt2326 = arg0;
		this.anInt2336 = arg5;
		this.anInt2330 = arg3;
		this.anInt2335 = arg1;
	}
}
