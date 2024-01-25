import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public abstract class Class37 {

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
	public final int anInt5257;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
	public final int anInt5256;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
	protected final int anInt5259;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(III)V")
	protected Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5257 = arg0;
		this.anInt5256 = arg1;
		this.anInt5259 = arg2;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)V")
	public abstract void method4688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIZ)V")
	public abstract void method4690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)V")
	public abstract void method4692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
