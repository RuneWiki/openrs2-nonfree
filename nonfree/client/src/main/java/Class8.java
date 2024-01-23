import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public abstract class Class8 {

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	public abstract void method325();

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)I")
	public abstract int method329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)J")
	public abstract long method330();
}
