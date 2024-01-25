import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class Class5_Sub31 extends Class5 {

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
	public int anInt5122;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	private Class5_Sub31() {
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "()V")
	public abstract void method4595();

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!mda;)I")
	public abstract int method4596(@OriginalArg(0) Class5_Sub1_Sub2 arg0);
}
