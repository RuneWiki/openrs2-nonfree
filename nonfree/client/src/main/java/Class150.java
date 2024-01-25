import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class150 implements Interface21 {

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!kr;")
	private final Class177 aClass177_1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!kr;)V")
	public Class150(@OriginalArg(0) Class177 arg0) {
		this.aClass177_1 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7993() {
		return true;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	@Override
	public void method7992() {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7994() {
		Static467.aClass5_13.aa(0, 0, Static294.anInt6026, Static277.anInt5899, this.aClass177_1.anInt6141, 0);
	}
}
