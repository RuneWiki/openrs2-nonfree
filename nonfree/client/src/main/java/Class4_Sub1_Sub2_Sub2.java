import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class4_Sub1_Sub2_Sub2 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!ug", name = "J", descriptor = "Ljava/lang/Object;")
	private final Object anObject9;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub1_Sub2_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject9 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5314() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5315() {
		return false;
	}
}
