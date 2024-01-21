import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
	public int anInt154;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!f;)I")
	public abstract int method110(@OriginalArg(0) Class2_Sub8_Sub1 arg0);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()V")
	public abstract void method111();
}
