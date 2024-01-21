import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class Class8 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZII)I")
	public abstract int method831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public abstract void method834();

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public abstract void method838();
}
