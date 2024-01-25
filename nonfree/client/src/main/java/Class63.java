import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class Class63 {

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	public final int anInt6687;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	public final int anInt6683;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	protected final int anInt6686;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V")
	protected Class63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6687 = arg1;
		this.anInt6683 = arg0;
		this.anInt6686 = arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZ)V")
	public abstract void method5133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public abstract void method5134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	public abstract void method5135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
