import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class Class25_Sub5 extends Class25 {

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
	protected int anInt4751;

	@OriginalMember(owner = "client!mp", name = "q", descriptor = "I")
	public final int anInt4753;

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
	protected int anInt4748;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
	protected final int anInt4749;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(IIII)V")
	protected Class25_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4751 = arg2;
		this.anInt4753 = arg3;
		this.anInt4748 = arg0;
		this.anInt4749 = arg1;
	}
}
