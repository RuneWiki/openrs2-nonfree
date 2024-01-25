import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class Class43 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
	protected final int anInt8894;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
	public final int anInt8896;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
	public final int anInt8895;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(III)V")
	protected Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8894 = arg2;
		this.anInt8896 = arg0;
		this.anInt8895 = arg1;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBI)V")
	public abstract void method7274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
	public abstract void method7275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(III)V")
	public abstract void method7276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
