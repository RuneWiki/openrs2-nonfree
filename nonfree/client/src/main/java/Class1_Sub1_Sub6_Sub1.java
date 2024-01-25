import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class1_Sub1_Sub6_Sub1 extends Class1_Sub1_Sub6 {

	@OriginalMember(owner = "client!dg", name = "K", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub1_Sub6_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject1 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3235() {
		return this.anObject1;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method3232() {
		return false;
	}
}
