import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class Class34 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)J")
	public abstract long method4653();

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)I")
	public abstract int method4655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	public abstract void method4656();
}
