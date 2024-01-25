import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public final class Class134 implements Interface2 {

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "Lclient!bla;")
	private final Class41 aClass41_1;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!bla;)V")
	public Class134(@OriginalArg(0) Class41 arg0) {
		this.aClass41_1 = arg0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	@Override
	public void method9316() {
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9318() {
		return true;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9317() {
		Static153.aClass22_4.aa(0, 0, Static681.anInt10652, Static76.anInt1720, this.aClass41_1.anInt1390, 0);
	}
}
