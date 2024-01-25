import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public abstract class Class2_Sub36 extends Class2 {

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
	public int anInt6020;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V")
	private Class2_Sub36() {
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "()V")
	public abstract void method4788();

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!d;)I")
	public abstract int method4789(@OriginalArg(0) Class2_Sub8_Sub1 arg0);
}
