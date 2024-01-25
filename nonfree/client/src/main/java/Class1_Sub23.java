import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public abstract class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
	public int anInt3471;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	private Class1_Sub23() {
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "()V")
	public abstract void method2978();

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!bh;)I")
	public abstract int method2979(@OriginalArg(0) Class1_Sub5_Sub1 arg0);
}
