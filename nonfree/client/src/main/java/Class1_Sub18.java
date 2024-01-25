import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public abstract class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
	public int anInt2275;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	private Class1_Sub18() {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
	public abstract void method1970();

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!fw;)I")
	public abstract int method1971(@OriginalArg(0) Class1_Sub19_Sub2 arg0);
}
