import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class1_Sub5_Sub8_Sub1 extends Class1_Sub5_Sub8 {

	@OriginalMember(owner = "client!gs", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub5_Sub8_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject5 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method2924() {
		return false;
	}

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2923() {
		return this.anObject5;
	}
}
