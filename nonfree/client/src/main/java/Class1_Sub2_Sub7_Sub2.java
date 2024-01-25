import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class1_Sub2_Sub7_Sub2 extends Class1_Sub2_Sub7 {

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub2_Sub7_Sub2(@OriginalArg(0) Object arg0) {
		this.anObject5 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method4370() {
		return false;
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4374() {
		return this.anObject5;
	}
}
