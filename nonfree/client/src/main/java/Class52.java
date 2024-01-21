import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class Class52 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	public int anInt2070;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	public int anInt2074;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
	public abstract void method1582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZ)V")
	public abstract void method1583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)V")
	public abstract void method1585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
