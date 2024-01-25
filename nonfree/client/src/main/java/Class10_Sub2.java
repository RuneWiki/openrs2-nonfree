import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!e", name = "o", descriptor = "I")
	protected int anInt2660;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	protected int anInt2656;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "I")
	public final int anInt2659;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "I")
	protected final int anInt2658;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIII)V")
	protected Class10_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2660 = arg0;
		this.anInt2656 = arg2;
		this.anInt2659 = arg3;
		this.anInt2658 = arg1;
	}
}
