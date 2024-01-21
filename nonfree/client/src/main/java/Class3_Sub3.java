import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
	public int anInt371;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!fb;)I")
	public abstract int method333(@OriginalArg(0) Class3_Sub2_Sub2 arg0);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
	public abstract void method334();
}
