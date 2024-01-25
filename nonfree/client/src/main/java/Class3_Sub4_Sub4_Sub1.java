import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public final class Class3_Sub4_Sub4_Sub1 extends Class3_Sub4_Sub4 {

	@OriginalMember(owner = "client!cfa", name = "I", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub4_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject6 = arg0;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method2337() {
		return false;
	}

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2341() {
		return this.anObject6;
	}
}
