import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class4_Sub2_Sub8_Sub2 extends Class4_Sub2_Sub8 {

	@OriginalMember(owner = "client!ig", name = "E", descriptor = "Ljava/lang/Object;")
	private Object anObject3;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class4_Sub2_Sub8_Sub2(@OriginalArg(0) Object arg0) {
		this.anObject3 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method1916() {
		return this.anObject3;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method1915() {
		return false;
	}
}
