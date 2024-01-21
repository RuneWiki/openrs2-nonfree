import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public abstract class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
	public int anInt244;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "()V")
	public abstract void method190();

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!sd;)I")
	public abstract int method191(@OriginalArg(0) Class3_Sub4_Sub2 arg0);
}
