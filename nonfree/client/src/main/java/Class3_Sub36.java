import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class Class3_Sub36 extends Class3 {

	@OriginalMember(owner = "client!r", name = "k", descriptor = "I")
	public int anInt5265;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	private Class3_Sub36() {
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
	public abstract void method4424();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;)I")
	public abstract int method4425(@OriginalArg(0) Class3_Sub2_Sub2 arg0);
}
