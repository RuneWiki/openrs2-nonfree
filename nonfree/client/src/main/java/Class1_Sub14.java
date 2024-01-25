import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public abstract class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
	public int anInt2523;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V")
	private Class1_Sub14() {
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!qg;)I")
	public abstract int method2129(@OriginalArg(0) Class1_Sub8_Sub4 arg0);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "()V")
	public abstract void method2130();
}
