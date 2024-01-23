import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class1_Sub3_Sub8_Sub2 extends Class1_Sub3_Sub8 {

	@OriginalMember(owner = "client!pi", name = "W", descriptor = "Ljava/lang/Object;")
	private Object anObject7;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub3_Sub8_Sub2(@OriginalArg(0) Object arg0) {
		this.anObject7 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3395() {
		return false;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3401() {
		return this.anObject7;
	}
}
