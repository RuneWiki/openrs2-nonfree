import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class2_Sub8_Sub4_Sub2 extends Class2_Sub8_Sub4 {

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "Ljava/lang/Object;")
	private Object anObject6;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class2_Sub8_Sub4_Sub2(@OriginalArg(0) Object arg0) {
		this.anObject6 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3754() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3755() {
		return false;
	}
}
