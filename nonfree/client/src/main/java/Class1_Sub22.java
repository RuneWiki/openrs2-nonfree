import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public abstract class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
	public int anInt4202;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()V")
	public abstract void method2868();

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ha;)I")
	public abstract int method2869(@OriginalArg(0) Class1_Sub5_Sub2 arg0);
}
