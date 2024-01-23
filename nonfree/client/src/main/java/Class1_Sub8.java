import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
	public int anInt1211;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "()V")
	public abstract void method880();

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!n;)I")
	public abstract int method881(@OriginalArg(0) Class1_Sub4_Sub3 arg0);
}
