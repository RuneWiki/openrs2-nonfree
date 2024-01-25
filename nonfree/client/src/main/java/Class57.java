import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class Class57 {

	@OriginalMember(owner = "client!th", name = "c", descriptor = "I")
	public final int anInt6158;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "I")
	public final int anInt6157;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "I")
	protected final int anInt6156;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(III)V")
	protected Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6158 = arg1;
		this.anInt6157 = arg0;
		this.anInt6156 = arg2;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
	public abstract void method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
	public abstract void method4807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZII)V")
	public abstract void method4808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
