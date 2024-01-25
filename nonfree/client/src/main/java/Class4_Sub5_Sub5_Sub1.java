import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class4_Sub5_Sub5_Sub1 extends Class4_Sub5_Sub5 {

	@OriginalMember(owner = "client!ck", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject2;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub5_Sub5_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject2 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8996() {
		return false;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method8998() {
		return this.anObject2;
	}
}
