import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class24 implements Interface9 {

	@OriginalMember(owner = "client!av", name = "g", descriptor = "Lclient!wca;")
	private final Class384 aClass384_1;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!wca;)V")
	public Class24(@OriginalArg(0) Class384 arg0) {
		this.aClass384_1 = arg0;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7669() {
		Static607.aClass101_15.aa(0, 0, Static406.anInt7570, Static19.anInt352, this.aClass384_1.anInt11191, 0);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7668() {
		return true;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
	@Override
	public void method7670() {
	}
}
