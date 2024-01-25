import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public abstract class Class1_Sub34 extends Class1 {

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
	public int anInt5093;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
	private Class1_Sub34() {
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!n;)I")
	public abstract int method4706(@OriginalArg(0) Class1_Sub6_Sub3 arg0);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "()V")
	public abstract void method4707();
}
