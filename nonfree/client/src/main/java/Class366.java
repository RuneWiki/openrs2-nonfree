import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class366 implements Interface14 {

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "Lclient!mga;")
	private final Class221 aClass221_1;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!mga;)V")
	public Class366(@OriginalArg(0) Class221 arg0) {
		this.aClass221_1 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
	@Override
	public void method8644() {
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8642() {
		return true;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8643() {
		Static192.aClass95_4.aa(0, 0, Static511.anInt8548, Static153.anInt2747, this.aClass221_1.anInt5453, 0);
	}
}
