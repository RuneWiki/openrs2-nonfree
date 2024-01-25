import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class4_Sub1_Sub7_Sub1 extends Class4_Sub1_Sub7 {

	@OriginalMember(owner = "client!mg", name = "N", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class4_Sub1_Sub7_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject5 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5508() {
		return false;
	}

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5510() {
		return this.anObject5;
	}
}
