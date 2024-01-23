import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class Class15 {

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
	public int anInt5624;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
	protected int anInt5626;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
	public int anInt5625;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(III)V")
	protected Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5624 = arg0;
		this.anInt5626 = arg2;
		this.anInt5625 = arg1;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V")
	public abstract void method4463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(III)V")
	public abstract void method4464(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(III)V")
	public abstract void method4465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
