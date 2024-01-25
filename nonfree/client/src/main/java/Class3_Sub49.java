import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public abstract class Class3_Sub49 extends Class3 {

	@OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
	public int anInt8117;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V")
	private Class3_Sub49() {
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "()V")
	public abstract void method6948();

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!ufa;)I")
	public abstract int method6949(@OriginalArg(0) Class3_Sub33_Sub4 arg0);
}
