import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	public int anInt1853;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!li;)I")
	public abstract int method1590(@OriginalArg(0) Class1_Sub8_Sub3 arg0);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()V")
	public abstract void method1591();
}
