import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class4_Sub6_Sub4_Sub2 extends Class4_Sub6_Sub4 {

	@OriginalMember(owner = "client!hq", name = "M", descriptor = "Ljava/lang/Object;")
	private final Object anObject64;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub6_Sub4_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject64 = arg0;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method3257() {
		return this.anObject64;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3254() {
		return false;
	}
}
