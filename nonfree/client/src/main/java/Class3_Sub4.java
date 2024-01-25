import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public abstract class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!b", name = "j", descriptor = "I")
	public int anInt489;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	private Class3_Sub4() {
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
	public abstract void method499();

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!db;)I")
	public abstract int method500(@OriginalArg(0) Class3_Sub7_Sub3 arg0);
}
