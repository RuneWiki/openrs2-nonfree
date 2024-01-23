import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class143 {

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Z")
	public boolean aBoolean305 = true;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
	public int anInt4577;

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
	public int anInt4583;

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
	public int anInt4584;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
	public int anInt4575;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
	public int anInt4573;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	public int anInt4581;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt4577 = arg0;
		this.aBoolean305 = arg6;
		this.anInt4583 = arg1;
		this.anInt4584 = arg3;
		this.anInt4575 = arg4;
		this.anInt4573 = arg2;
		this.anInt4581 = arg5;
	}
}
