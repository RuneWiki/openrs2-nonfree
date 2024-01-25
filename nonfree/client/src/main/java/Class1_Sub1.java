import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!a", name = "p", descriptor = "I")
	protected final int anInt5241;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	protected int anInt5238;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	protected int anInt5237;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "I")
	public final int anInt5239;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(IIII)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5241 = arg1;
		this.anInt5238 = arg0;
		this.anInt5237 = arg2;
		this.anInt5239 = arg3;
	}
}
