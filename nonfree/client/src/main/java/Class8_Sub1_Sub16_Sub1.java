import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class8_Sub1_Sub16_Sub1 extends Class8_Sub1_Sub16 {

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "Ljava/lang/Object;")
	private Object anObject5;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class8_Sub1_Sub16_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject5 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4170() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4171() {
		return this.anObject5;
	}
}
