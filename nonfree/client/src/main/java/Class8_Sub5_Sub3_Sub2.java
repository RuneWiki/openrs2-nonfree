import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public final class Class8_Sub5_Sub3_Sub2 extends Class8_Sub5_Sub3 {

	@OriginalMember(owner = "client!tr", name = "C", descriptor = "Ljava/lang/Object;")
	private final Object anObject21;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!on;Ljava/lang/Object;I)V")
	public Class8_Sub5_Sub3_Sub2(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject21 = arg1;
	}

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7785() {
		return this.anObject21;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7784() {
		return false;
	}
}
