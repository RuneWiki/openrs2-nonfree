import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public abstract class Class110 {

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
	protected final int anInt9842;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
	public final int anInt9840;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
	public final int anInt9843;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(III)V")
	protected Class110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9842 = arg2;
		this.anInt9840 = arg1;
		this.anInt9843 = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)V")
	public abstract void method7735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(III)V")
	public abstract void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIB)V")
	public abstract void method7738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
