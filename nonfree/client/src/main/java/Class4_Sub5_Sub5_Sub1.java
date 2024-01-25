import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class4_Sub5_Sub5_Sub1 extends Class4_Sub5_Sub5 {

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "Ljava/lang/Object;")
	private final Object anObject8;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub5_Sub5_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject8 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method3027() {
		return false;
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3029() {
		return this.anObject8;
	}
}
