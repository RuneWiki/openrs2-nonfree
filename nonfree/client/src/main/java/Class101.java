import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class Class101 {

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	protected Class101() {
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Z")
	public abstract boolean method2589(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
	public abstract void method2590();

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)Lclient!cba;")
	public abstract Interface2 method2591();

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V")
	public abstract void method2592();
}
