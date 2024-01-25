import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class245 implements Interface4 {

	@OriginalMember(owner = "client!og", name = "b", descriptor = "Lclient!mfa;")
	private final Class213 aClass213_1;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!mfa;)V")
	public Class245(@OriginalArg(0) Class213 arg0) {
		this.aClass213_1 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8345() {
		Static47.aClass33_3.aa(0, 0, Static114.anInt2970, Static256.anInt5669, this.aClass213_1.anInt6738, 0);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8344() {
		return true;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	@Override
	public void method8346() {
	}
}
