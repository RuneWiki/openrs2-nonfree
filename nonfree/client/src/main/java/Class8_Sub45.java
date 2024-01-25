import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class Class8_Sub45 extends Class8 {

	@OriginalMember(owner = "client!te", name = "j", descriptor = "I")
	public int anInt9303;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	private Class8_Sub45() {
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!sm;)I")
	public abstract int method7590(@OriginalArg(0) Class8_Sub16_Sub5 arg0);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()V")
	public abstract void method7591();
}
