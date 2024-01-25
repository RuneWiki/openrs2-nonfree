import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public final class Class26 implements Interface21 {

	@OriginalMember(owner = "client!b", name = "f", descriptor = "Lclient!kn;")
	private final Class175 aClass175_1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!kn;)V")
	public Class26(@OriginalArg(0) Class175 arg0) {
		this.aClass175_1 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		return true;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	@Override
	public void method7902() {
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7903() {
		Static162.aClass100_7.aa(0, 0, Static321.anInt6137, Static356.anInt6630, this.aClass175_1.anInt5786, 0);
	}
}
