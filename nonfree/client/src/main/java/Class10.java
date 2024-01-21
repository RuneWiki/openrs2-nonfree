import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class Class10 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
	public abstract void method539();

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)I")
	public abstract int method543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
