import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class Class3 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "I")
	public final int anInt9988;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "I")
	public final int anInt9989;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "I")
	protected final int anInt9991;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(III)V")
	protected Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9988 = arg1;
		this.anInt9989 = arg0;
		this.anInt9991 = arg2;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
	public abstract void method8485(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V")
	public abstract void method8487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBI)V")
	public abstract void method8489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
