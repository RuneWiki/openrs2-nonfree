import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	public int anInt3755;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	private Class1_Sub19() {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!sca;)I")
	public abstract int method3338(@OriginalArg(0) Class1_Sub12_Sub3 arg0);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()V")
	public abstract void method3339();
}
