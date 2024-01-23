import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class Class3 {

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	protected int anInt4887;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	public int anInt4886;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	public int anInt4883;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(III)V")
	protected Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4887 = arg2;
		this.anInt4886 = arg1;
		this.anInt4883 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
	public abstract void method3663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)V")
	public abstract void method3667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(III)V")
	public abstract void method3668(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
