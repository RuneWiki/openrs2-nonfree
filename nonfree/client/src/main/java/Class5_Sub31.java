import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public final class Class5_Sub31 extends Class5 {

	@OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
	public final int anInt5841;

	@OriginalMember(owner = "client!lw", name = "p", descriptor = "I")
	public final int anInt5843;

	@OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
	public final int anInt5845;

	@OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
	public final int anInt5840;

	@OriginalMember(owner = "client!lw", name = "k", descriptor = "I")
	public final int anInt5839;

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "Z")
	public final boolean aBoolean487;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class5_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt5841 = arg4;
		this.anInt5843 = arg1;
		this.anInt5845 = arg0;
		this.anInt5840 = arg2;
		this.anInt5839 = arg3;
		this.aBoolean487 = arg5;
	}
}
