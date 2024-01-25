import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public final class Class31 implements Interface19 {

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "Lclient!pl;")
	private final Class250 aClass250_1;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lclient!pl;)V")
	public Class31(@OriginalArg(0) Class250 arg0) {
		this.aClass250_1 = arg0;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
	@Override
	public void method6770() {
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6772() {
		return true;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6771() {
		Static554.aClass90_12.C(0, 0, Static367.anInt6719, Static154.anInt2867, this.aClass250_1.anInt7272, 0);
	}
}
