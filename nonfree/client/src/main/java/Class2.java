import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class Class2 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)I")
	public abstract int method673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
	public abstract void method676();

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
	public abstract void method678();
}
