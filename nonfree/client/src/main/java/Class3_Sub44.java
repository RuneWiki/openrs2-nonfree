import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public abstract class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!ria", name = "k", descriptor = "I")
	public int anInt8284;

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "()V")
	private Class3_Sub44() {
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!dp;)I")
	public abstract int method6810(@OriginalArg(0) Class3_Sub12_Sub1 arg0);

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "()V")
	public abstract void method6811();
}
