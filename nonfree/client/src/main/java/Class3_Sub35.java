import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class Class3_Sub35 extends Class3 {

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
	public int anInt5343;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	private Class3_Sub35() {
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!caa;)I")
	public abstract int method4793(@OriginalArg(0) Class3_Sub7_Sub1 arg0);

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "()V")
	public abstract void method4794();
}
