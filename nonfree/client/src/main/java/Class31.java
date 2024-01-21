import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public abstract class Class31 {

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	public final int anInt3938;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "I")
	protected final int anInt3940;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public final int anInt3936;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(III)V")
	protected Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3938 = arg0;
		this.anInt3940 = arg2;
		this.anInt3936 = arg1;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
	public abstract void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(III)V")
	public abstract void method2819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIB)V")
	public abstract void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
