import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class Class4_Sub24 extends Class4 {

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
	public int anInt3400;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	private Class4_Sub24() {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ia;)I")
	public abstract int method2942(@OriginalArg(0) Class4_Sub13_Sub2 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	public abstract void method2943();
}
