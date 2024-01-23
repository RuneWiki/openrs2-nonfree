import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public abstract class Class13 {

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
	public int anInt5540;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
	public int anInt5542;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
	protected int anInt5544;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
	protected Class13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5540 = arg1;
		this.anInt5542 = arg0;
		this.anInt5544 = arg2;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
	public abstract void method4389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
	public abstract void method4390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(III)V")
	public abstract void method4392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
