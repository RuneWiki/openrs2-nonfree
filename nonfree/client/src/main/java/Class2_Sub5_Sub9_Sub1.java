import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class2_Sub5_Sub9_Sub1 extends Class2_Sub5_Sub9 {

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "Ljava/lang/Object;")
	private final Object anObject7;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub5_Sub9_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject7 = arg0;
	}

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5193() {
		return this.anObject7;
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5190() {
		return false;
	}
}
