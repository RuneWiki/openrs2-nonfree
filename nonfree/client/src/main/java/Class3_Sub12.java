import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public abstract class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!eda", name = "n", descriptor = "I")
	public int anInt2596;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V")
	private Class3_Sub12() {
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "()V")
	public abstract void method2290();

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!fg;)I")
	public abstract int method2291(@OriginalArg(0) Class3_Sub14_Sub1 arg0);
}
