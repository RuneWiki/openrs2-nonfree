import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
	public int anInt1921;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!wb;)I")
	public abstract int method1409(@OriginalArg(0) Class1_Sub7_Sub2 arg0);

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
	public abstract void method1410();
}
