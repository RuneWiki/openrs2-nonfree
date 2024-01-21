import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
	public int anInt2956;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
	public abstract void method2308();

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!td;)I")
	public abstract int method2309(@OriginalArg(0) Class3_Sub3_Sub4 arg0);
}
