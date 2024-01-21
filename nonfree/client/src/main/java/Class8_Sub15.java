import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class Class8_Sub15 extends Class8 {

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	public int anInt2164;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ue;)I")
	public abstract int method1295(@OriginalArg(0) Class8_Sub11_Sub4 arg0);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
	public abstract void method1296();
}
