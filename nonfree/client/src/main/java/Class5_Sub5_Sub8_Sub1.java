import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class5_Sub5_Sub8_Sub1 extends Class5_Sub5_Sub8 {

	@OriginalMember(owner = "client!gv", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject4;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub5_Sub8_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject4 = arg0;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method4378() {
		return false;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method4379() {
		return this.anObject4;
	}
}
