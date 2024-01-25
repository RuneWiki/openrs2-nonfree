import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!co", name = "l", descriptor = "I")
	public int anInt1090;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	private Class1_Sub11() {
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "()V")
	public abstract void method997();

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!tr;)I")
	public abstract int method998(@OriginalArg(0) Class1_Sub6_Sub4 arg0);
}
