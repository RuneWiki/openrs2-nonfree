import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class371 implements Interface24 {

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "Lclient!eha;")
	private final Class84 aClass84_1;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!eha;)V")
	public Class371(@OriginalArg(0) Class84 arg0) {
		this.aClass84_1 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	@Override
	public void method8705() {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8706() {
		Static546.aClass132_13.aa(0, 0, Static449.anInt7506, Static348.anInt5935, this.aClass84_1.anInt2250, 0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8704() {
		return true;
	}
}
