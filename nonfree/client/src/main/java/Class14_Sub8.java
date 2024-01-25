import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class Class14_Sub8 extends Class14 {

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	public int anInt1295;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	private Class14_Sub8() {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!pb;)I")
	public abstract int method1230(@OriginalArg(0) Class14_Sub19_Sub2 arg0);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
	public abstract void method1231();
}
