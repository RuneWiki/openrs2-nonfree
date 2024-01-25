import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public abstract class Class114 {

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
	protected final int anInt7440;

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
	public final int anInt7441;

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
	public final int anInt7442;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(III)V")
	protected Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7440 = arg2;
		this.anInt7441 = arg0;
		this.anInt7442 = arg1;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(III)V")
	public abstract void method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(III)V")
	public abstract void method6309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(III)V")
	public abstract void method6310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
