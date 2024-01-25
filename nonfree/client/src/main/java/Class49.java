import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class Class49 {

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
	public final int anInt5595;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public final int anInt5597;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
	protected final int anInt5596;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(III)V")
	protected Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5595 = arg1;
		this.anInt5597 = arg0;
		this.anInt5596 = arg2;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
	public abstract void method4887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)V")
	public abstract void method4890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(III)V")
	public abstract void method4891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
