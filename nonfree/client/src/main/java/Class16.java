import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class Class16 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)I")
	public abstract int method4236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)J")
	public abstract long method4237();

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
	public abstract void method4239();
}
