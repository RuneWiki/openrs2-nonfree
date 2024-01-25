import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!he", name = "l", descriptor = "I")
	public int anInt2991;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	private Class3_Sub18() {
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ci;)I")
	public abstract int method2396(@OriginalArg(0) Class3_Sub5_Sub1 arg0);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
	public abstract void method2397();
}
