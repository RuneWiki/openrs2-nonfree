import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class Class9 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	protected final int anInt8563;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
	public final int anInt8564;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
	public final int anInt8565;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(III)V")
	protected Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8563 = arg2;
		this.anInt8564 = arg1;
		this.anInt8565 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIB)V")
	public abstract void method7304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IIB)V")
	public abstract void method7305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V")
	public abstract void method7306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
