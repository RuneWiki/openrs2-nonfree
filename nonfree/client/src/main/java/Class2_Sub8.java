import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
	public int anInt645;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	private Class2_Sub8() {
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!er;)I")
	public abstract int method548(@OriginalArg(0) Class2_Sub3_Sub1 arg0);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "()V")
	public abstract void method549();
}
