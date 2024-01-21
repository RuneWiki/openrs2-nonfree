import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!db", name = "B", descriptor = "I")
	public int anInt602;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
	public abstract void method482();

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ia;)I")
	public abstract int method483(@OriginalArg(0) Class1_Sub9_Sub2 arg0);
}
