import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public final class Class230 implements Interface23 {

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "Lclient!lr;")
	private final Class206 aClass206_1;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!lr;)V")
	public Class230(@OriginalArg(0) Class206 arg0) {
		this.aClass206_1 = arg0;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return true;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	@Override
	public void method8048() {
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8047() {
		Static323.aClass9_8.C(0, 0, Static228.anInt4744, Static180.anInt4051, this.aClass206_1.anInt5753, 0);
	}
}
