import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public abstract class Class122 {

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
	public final int anInt5900;

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
	public final int anInt5903;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
	protected final int anInt5901;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(III)V")
	protected Class122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5900 = arg1;
		this.anInt5903 = arg0;
		this.anInt5901 = arg2;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZII)V")
	public abstract void method4965(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V")
	public abstract void method4968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(III)V")
	public abstract void method4969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
