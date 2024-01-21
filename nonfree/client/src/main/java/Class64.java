import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class64 {

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Z")
	public boolean aBoolean155 = true;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	public final int anInt2673;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public final int anInt2674;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	public final int anInt2671;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	public final int anInt2675;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
	public final int anInt2677;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
	public final int anInt2676;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt2673 = arg1;
		this.anInt2674 = arg3;
		this.anInt2671 = arg4;
		this.aBoolean155 = arg6;
		this.anInt2675 = arg2;
		this.anInt2677 = arg5;
		this.anInt2676 = arg0;
	}
}
