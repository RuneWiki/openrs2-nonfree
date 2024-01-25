import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public abstract class Class26 {

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
	public final int anInt4745;

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
	protected final int anInt4746;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
	public final int anInt4744;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(III)V")
	protected Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4745 = arg1;
		this.anInt4746 = arg2;
		this.anInt4744 = arg0;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)V")
	public abstract void method4303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZI)V")
	public abstract void method4304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZII)V")
	public abstract void method4306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
