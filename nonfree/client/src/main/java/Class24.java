import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class24 implements Interface25 {

	@OriginalMember(owner = "client!av", name = "c", descriptor = "Lclient!sd;")
	private final Class314 aClass314_1;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!sd;)V")
	public Class24(@OriginalArg(0) Class314 arg0) {
		this.aClass314_1 = arg0;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8110() {
		Static213.aClass133_5.aa(0, 0, Static345.anInt5827, Static408.anInt7118, this.aClass314_1.anInt8761, 0);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
	@Override
	public void method8111() {
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8109() {
		return true;
	}
}
