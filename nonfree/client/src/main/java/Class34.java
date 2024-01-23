import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class Class34 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)J")
	public abstract long method5033();

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	public abstract void method5034();

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)I")
	public abstract int method5037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
