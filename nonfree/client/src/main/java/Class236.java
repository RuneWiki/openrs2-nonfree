import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public final class Class236 implements Interface7 {

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "Lclient!uo;")
	private final Class363 aClass363_1;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!uo;)V")
	public Class236(@OriginalArg(0) Class363 arg0) {
		this.aClass363_1 = arg0;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7984() {
		return true;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
	@Override
	public void method7986() {
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7985() {
		Static582.aClass16_12.aa(0, 0, Static654.anInt10064, Static483.anInt8181, this.aClass363_1.anInt9554, 0);
	}
}
