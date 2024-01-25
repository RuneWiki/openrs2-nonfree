import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!di", name = "k", descriptor = "I")
	public int anInt1644;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	private Class1_Sub11() {
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!ta;)I")
	public abstract int method1421(@OriginalArg(0) Class1_Sub1_Sub4 arg0);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "()V")
	public abstract void method1422();
}
