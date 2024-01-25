import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class346 implements Interface16 {

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Lclient!lf;")
	private final Class206 aClass206_1;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class346(@OriginalArg(0) Class206 arg0) {
		this.aClass206_1 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7257() {
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7259() {
		Static417.aClass162_17.J(0, 0, Static172.anInt2621, Static187.anInt8962, this.aClass206_1.anInt5029, 0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	@Override
	public void method7258() {
	}
}
