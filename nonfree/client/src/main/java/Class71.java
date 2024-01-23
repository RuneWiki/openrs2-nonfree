import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class Class71 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
	public int anInt5763;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
	public int anInt5764;

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
	public int anInt5766;

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
	public int anInt5767;

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
	public int anInt5769;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
	public int anInt5770;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
	protected Class71() {
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	public abstract void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(III)V")
	public abstract void method4632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
