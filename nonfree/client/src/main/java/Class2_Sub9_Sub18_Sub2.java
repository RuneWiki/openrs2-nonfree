import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class2_Sub9_Sub18_Sub2 extends Class2_Sub9_Sub18 {

	@OriginalMember(owner = "client!vg", name = "U", descriptor = "Ljava/lang/Object;")
	private final Object anObject7;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub9_Sub18_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject7 = arg0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5574() {
		return false;
	}

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5575() {
		return this.anObject7;
	}
}
