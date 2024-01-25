import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public final class Class14_Sub3_Sub6_Sub1 extends Class14_Sub3_Sub6 {

	@OriginalMember(owner = "client!lfa", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject15;

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class14_Sub3_Sub6_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject15 = arg0;
	}

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6923() {
		return this.anObject15;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6921() {
		return false;
	}
}
