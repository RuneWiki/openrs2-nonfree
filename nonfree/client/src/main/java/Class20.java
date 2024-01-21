import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class Class20 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	public abstract void method1226();

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZII)I")
	public abstract int method1229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
