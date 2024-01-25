import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	public int anInt2265;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	private Class2_Sub19() {
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "()V")
	public abstract void method1997();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!paa;)I")
	public abstract int method1998(@OriginalArg(0) Class2_Sub23_Sub3 arg0);
}
