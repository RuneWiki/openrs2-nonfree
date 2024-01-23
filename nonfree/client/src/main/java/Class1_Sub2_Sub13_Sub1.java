import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class1_Sub2_Sub13_Sub1 extends Class1_Sub2_Sub13 {

	@OriginalMember(owner = "client!mf", name = "X", descriptor = "Ljava/lang/Object;")
	private Object anObject2;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub2_Sub13_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject2 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3208() {
		return this.anObject2;
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3207() {
		return false;
	}
}
