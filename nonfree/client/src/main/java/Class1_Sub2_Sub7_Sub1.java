import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public final class Class1_Sub2_Sub7_Sub1 extends Class1_Sub2_Sub7 {

	@OriginalMember(owner = "client!gj", name = "Z", descriptor = "Ljava/lang/Object;")
	private Object anObject4;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub2_Sub7_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject4 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2774() {
		return this.anObject4;
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method2777() {
		return false;
	}
}
