import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class1_Sub1_Sub16_Sub1 extends Class1_Sub1_Sub16 {

	@OriginalMember(owner = "client!up", name = "u", descriptor = "Ljava/lang/Object;")
	private final Object anObject17;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub16_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject17 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7391() {
		return this.anObject17;
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7389() {
		return false;
	}
}
