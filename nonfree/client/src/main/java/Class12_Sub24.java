import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class Class12_Sub24 extends Class12 {

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
	public int anInt4570;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	private Class12_Sub24() {
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!el;)I")
	public abstract int method3842(@OriginalArg(0) Class12_Sub13_Sub1 arg0);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "()V")
	public abstract void method3843();
}
