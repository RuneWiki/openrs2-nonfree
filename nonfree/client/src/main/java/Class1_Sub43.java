import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
	public int anInt6550;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	private Class1_Sub43() {
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!fa;)I")
	public abstract int method5712(@OriginalArg(0) Class1_Sub6_Sub4 arg0);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "()V")
	public abstract void method5713();
}
