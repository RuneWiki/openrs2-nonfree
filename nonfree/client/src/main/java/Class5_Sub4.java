import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public abstract class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	public int anInt341;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
	private Class5_Sub4() {
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "()V")
	public abstract void method326();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!fk;)I")
	public abstract int method327(@OriginalArg(0) Class5_Sub16_Sub1 arg0);
}
