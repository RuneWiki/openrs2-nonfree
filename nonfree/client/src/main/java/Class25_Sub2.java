import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public abstract class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
	protected final int anInt4330;

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
	protected int anInt4332;

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
	public final int anInt4336;

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
	protected int anInt4333;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIII)V")
	protected Class25_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4330 = arg1;
		this.anInt4332 = arg0;
		this.anInt4336 = arg3;
		this.anInt4333 = arg2;
	}
}
