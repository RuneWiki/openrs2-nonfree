import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class Class44 {

	@OriginalMember(owner = "client!em", name = "b", descriptor = "I")
	protected int anInt4974;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "I")
	public int anInt4980;

	@OriginalMember(owner = "client!em", name = "o", descriptor = "I")
	public int anInt4984;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(III)V")
	protected Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4974 = arg2;
		this.anInt4980 = arg0;
		this.anInt4984 = arg1;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BII)V")
	public abstract void method4277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
	public abstract void method4279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(BII)V")
	public abstract void method4284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
