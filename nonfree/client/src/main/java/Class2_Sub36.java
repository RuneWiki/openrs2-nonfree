import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public abstract class Class2_Sub36 extends Class2 {

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
	public int anInt6800;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V")
	private Class2_Sub36() {
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "()V")
	public abstract void method5789();

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!ei;)I")
	public abstract int method5790(@OriginalArg(0) Class2_Sub12_Sub2 arg0);
}
