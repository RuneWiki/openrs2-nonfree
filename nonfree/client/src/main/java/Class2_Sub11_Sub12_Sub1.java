import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class2_Sub11_Sub12_Sub1 extends Class2_Sub11_Sub12 {

	@OriginalMember(owner = "client!ml", name = "P", descriptor = "Ljava/lang/Object;")
	private final Object anObject2;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class2_Sub11_Sub12_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject2 = arg0;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5151() {
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method5152() {
		return this.anObject2;
	}
}
