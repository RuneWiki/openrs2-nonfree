import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
	public int anInt1032;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "()V")
	public abstract void method619();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!ie;)I")
	public abstract int method620(@OriginalArg(0) Class3_Sub3_Sub2 arg0);
}
