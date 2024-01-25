import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class Class2_Sub34 extends Class2 {

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
	public int anInt4421;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	private Class2_Sub34() {
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
	public abstract void method3642();

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!mn;)I")
	public abstract int method3643(@OriginalArg(0) Class2_Sub1_Sub4 arg0);
}
