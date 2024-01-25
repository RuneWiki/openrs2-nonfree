import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	public int anInt4111;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	private Class3_Sub24() {
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!sv;)I")
	public abstract int method3369(@OriginalArg(0) Class3_Sub5_Sub4 arg0);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()V")
	public abstract void method3370();
}
