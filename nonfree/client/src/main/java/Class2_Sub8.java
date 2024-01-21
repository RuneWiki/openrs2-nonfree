import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
	public int anInt2073;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
	public abstract void method1560();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!u;)I")
	public abstract int method1561(@OriginalArg(0) Class2_Sub7_Sub4 arg0);
}
