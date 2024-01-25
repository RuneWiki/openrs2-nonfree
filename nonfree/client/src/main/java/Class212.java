import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class212 implements Interface12 {

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "Lclient!cl;")
	private final Class56 aClass56_1;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!cl;)V")
	public Class212(@OriginalArg(0) Class56 arg0) {
		this.aClass56_1 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
	@Override
	public void method4315() {
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4316() {
		return true;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BZ)V")
	@Override
	public void method4317() {
		Static16.aClass134_1.J(0, 0, Static130.anInt2566, Static499.anInt4149, this.aClass56_1.anInt1197, 0);
	}
}
