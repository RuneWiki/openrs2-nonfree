import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class Class7 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
	public final int anInt5771;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
	protected final int anInt5772;

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	public final int anInt5773;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(III)V")
	protected Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5771 = arg0;
		this.anInt5772 = arg2;
		this.anInt5773 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V")
	public abstract void method4834(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(III)V")
	public abstract void method4835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(III)V")
	public abstract void method4836(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
