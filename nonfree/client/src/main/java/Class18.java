import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public abstract class Class18 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)I")
	public abstract int method1274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
	public abstract void method1275();

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
	public abstract void method1280();
}
