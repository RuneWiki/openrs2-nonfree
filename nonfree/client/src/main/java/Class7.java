import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class Class7 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IBI)I")
	public abstract int method1024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public abstract void method1026();
}
