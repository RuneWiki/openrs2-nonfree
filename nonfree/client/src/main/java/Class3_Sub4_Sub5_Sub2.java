import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class3_Sub4_Sub5_Sub2 extends Class3_Sub4_Sub5 {

	@OriginalMember(owner = "client!rh", name = "H", descriptor = "Ljava/lang/Object;")
	private Object anObject4;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class3_Sub4_Sub5_Sub2(@OriginalArg(0) Object arg0) {
		this.anObject4 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4035() {
		return false;
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4033() {
		return this.anObject4;
	}
}
