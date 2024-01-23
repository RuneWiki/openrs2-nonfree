import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	public int anInt106;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
	public abstract void method55();

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!qd;)I")
	public abstract int method56(@OriginalArg(0) Class1_Sub7_Sub3 arg0);
}
