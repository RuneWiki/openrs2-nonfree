import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class Class35 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	protected final int anInt6699;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
	public final int anInt6704;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
	public final int anInt6706;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(III)V")
	protected Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6699 = arg2;
		this.anInt6704 = arg1;
		this.anInt6706 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)V")
	public abstract void method5617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
	public abstract void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(III)V")
	public abstract void method5622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
