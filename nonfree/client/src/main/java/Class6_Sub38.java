import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class Class6_Sub38 extends Class6 {

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
	public int anInt6307;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	private Class6_Sub38() {
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
	public abstract void method5329();

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!kca;)I")
	public abstract int method5330(@OriginalArg(0) Class6_Sub8_Sub3 arg0);
}
