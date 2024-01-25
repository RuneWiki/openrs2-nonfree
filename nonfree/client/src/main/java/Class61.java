import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class61 implements Interface12 {

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "Lclient!tl;")
	private final Class321 aClass321_1;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!tl;)V")
	public Class61(@OriginalArg(0) Class321 arg0) {
		this.aClass321_1 = arg0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	@Override
	public void method7014() {
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7015() {
		return true;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7013() {
		Static307.aClass100_6.J(0, 0, Static140.anInt2937, Static120.anInt2371, this.aClass321_1.anInt8568, 0);
	}
}
