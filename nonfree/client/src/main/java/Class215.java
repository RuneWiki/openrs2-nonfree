import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class215 implements Interface11 {

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "Lclient!rk;")
	private final Class283 aClass283_1;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!rk;)V")
	public Class215(@OriginalArg(0) Class283 arg0) {
		this.aClass283_1 = arg0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8278() {
		return true;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8276() {
		Static546.aClass15_16.C(0, 0, Static582.anInt10234, Static294.anInt10217, this.aClass283_1.anInt8609, 0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	@Override
	public void method8277() {
	}
}
