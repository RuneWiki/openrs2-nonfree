import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class Class6_Sub6 extends Class6 {

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
	public int anInt1332;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ud;)I")
	public abstract int method859(@OriginalArg(0) Class6_Sub3_Sub2 arg0);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()V")
	public abstract void method860();
}
