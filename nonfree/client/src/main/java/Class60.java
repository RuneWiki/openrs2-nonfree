import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public final class Class60 implements Interface16 {

	@OriginalMember(owner = "client!cka", name = "g", descriptor = "Lclient!qi;")
	private final Class294 aClass294_1;

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lclient!qi;)V")
	public Class60(@OriginalArg(0) Class294 arg0) {
		this.aClass294_1 = arg0;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8282() {
		Static119.aClass95_4.aa(0, 0, Static531.anInt8327, Static13.anInt306, this.aClass294_1.anInt7794, 0);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(B)V")
	@Override
	public void method8280() {
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8281() {
		return true;
	}
}
