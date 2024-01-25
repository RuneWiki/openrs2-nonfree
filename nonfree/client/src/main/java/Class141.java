import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public abstract class Class141 {

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
	public final int anInt8957;

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
	protected final int anInt8955;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
	public final int anInt8951;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(III)V")
	protected Class141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8957 = arg0;
		this.anInt8955 = arg2;
		this.anInt8951 = arg1;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BII)V")
	public abstract void method7715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZI)V")
	public abstract void method7716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V")
	public abstract void method7719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
