import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
	public int anInt3065;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "()V")
	public abstract void method2185();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!tg;)I")
	public abstract int method2186(@OriginalArg(0) Class3_Sub19_Sub3 arg0);
}
