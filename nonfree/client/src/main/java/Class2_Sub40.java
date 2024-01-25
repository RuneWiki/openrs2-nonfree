import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public abstract class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!om", name = "o", descriptor = "I")
	public int anInt7671;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	private Class2_Sub40() {
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!sq;)I")
	public abstract int method6576(@OriginalArg(0) Class2_Sub8_Sub4 arg0);

	@OriginalMember(owner = "client!om", name = "a", descriptor = "()V")
	public abstract void method6577();
}
