import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class2_Sub1_Sub5_Sub2 extends Class2_Sub1_Sub5 {

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub1_Sub5_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject5 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method1597() {
		return this.anObject5;
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method1594() {
		return false;
	}
}
